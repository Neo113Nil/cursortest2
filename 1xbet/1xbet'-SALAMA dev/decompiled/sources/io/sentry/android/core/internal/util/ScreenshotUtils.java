package io.sentry.android.core.internal.util;

import E4.RunnableC0181n;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.thread.IThreadChecker;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenshotUtils {
    private static final long CAPTURE_TIMEOUT_MS = 1000;

    public static Bitmap captureScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return captureScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] compressBitmapToPng(Bitmap bitmap, ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.log(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                iLogger.log(SentryLevel.ERROR, "Compressing bitmap failed.", th3);
            }
        }
        return null;
    }

    private static boolean isActivityValid(Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureScreenshot$0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i7) {
        atomicBoolean.set(i7 == 0);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureScreenshot$1(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th) {
            try {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static byte[] takeScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return takeScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] takeScreenshot(Activity activity, IThreadChecker iThreadChecker, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return compressBitmapToPng(captureScreenshot(activity, iThreadChecker, iLogger, buildInfoProvider), iLogger);
    }

    public static Bitmap captureScreenshot(Activity activity, IThreadChecker iThreadChecker, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        boolean z4 = false;
        if (!isActivityValid(activity)) {
            iLogger.log(SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.log(SentryLevel.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.log(SentryLevel.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.log(SentryLevel.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                if (buildInfoProvider.getSdkInfoVersion() >= 26) {
                    HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                    handlerThread.start();
                    try {
                        Handler handler = new Handler(handlerThread.getLooper());
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        PixelCopy.request(window, bitmapCreateBitmap, new c(0, atomicBoolean, countDownLatch), handler);
                        if (countDownLatch.await(CAPTURE_TIMEOUT_MS, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                            z4 = true;
                        }
                    } catch (Throwable th) {
                        try {
                            iLogger.log(SentryLevel.ERROR, "Taking screenshot using PixelCopy failed.", th);
                        } catch (Throwable th2) {
                            handlerThread.quit();
                            throw th2;
                        }
                    }
                    handlerThread.quit();
                    if (!z4) {
                        return null;
                    }
                } else {
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    if (iThreadChecker.isMainThread()) {
                        rootView.draw(canvas);
                        countDownLatch.countDown();
                    } else {
                        activity.runOnUiThread(new RunnableC0181n(rootView, canvas, iLogger, countDownLatch, 11));
                    }
                    if (!countDownLatch.await(CAPTURE_TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                        return null;
                    }
                }
                return bitmapCreateBitmap;
            } catch (Throwable th3) {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed.", th3);
                return null;
            }
        }
        iLogger.log(SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
        return null;
    }
}
