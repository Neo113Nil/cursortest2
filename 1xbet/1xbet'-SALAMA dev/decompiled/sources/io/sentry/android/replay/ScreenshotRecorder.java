package io.sentry.android.replay;

import A1.RunnableC0032m0;
import Y4.D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p044f6.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final AtomicBoolean contentChanged;
    private final DebugOverlayDrawable debugOverlayDrawable;
    private final AtomicBoolean isCapturing;
    private final AtomicBoolean lastCaptureSuccessful;
    private final MainLooperHandler mainLooperHandler;
    private final p044f6.b maskingPaint$delegate;
    private final SentryOptions options;
    private final p044f6.b prescaledMatrix$delegate;
    private final ScheduledExecutorService recorder;
    private WeakReference<View> rootView;
    private final Bitmap screenshot;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final p044f6.b singlePixelBitmap$delegate;
    private final p044f6.b singlePixelBitmapCanvas$delegate;

    public ScreenshotRecorder(ScreenshotRecorderConfig screenshotRecorderConfig, SentryOptions sentryOptions, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, ScreenshotRecorderCallback screenshotRecorderCallback) {
        h.e(screenshotRecorderConfig, "config");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(mainLooperHandler, "mainLooperHandler");
        h.e(scheduledExecutorService, "recorder");
        this.config = screenshotRecorderConfig;
        this.options = sentryOptions;
        this.mainLooperHandler = mainLooperHandler;
        this.recorder = scheduledExecutorService;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        c[] cVarArr = c.f13005a;
        this.maskingPaint$delegate = D.B(ScreenshotRecorder$maskingPaint$2.INSTANCE);
        this.singlePixelBitmap$delegate = D.B(ScreenshotRecorder$singlePixelBitmap$2.INSTANCE);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        h.d(bitmapCreateBitmap, "createBitmap(config.reco… Bitmap.Config.ARGB_8888)");
        this.screenshot = bitmapCreateBitmap;
        this.singlePixelBitmapCanvas$delegate = D.B(new ScreenshotRecorder$singlePixelBitmapCanvas$2(this));
        this.prescaledMatrix$delegate = D.B(new ScreenshotRecorder$prescaledMatrix$2(this));
        this.contentChanged = new AtomicBoolean(false);
        this.isCapturing = new AtomicBoolean(true);
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.debugOverlayDrawable = new DebugOverlayDrawable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3(ScreenshotRecorder screenshotRecorder, Window window, View view) {
        h.e(screenshotRecorder, "this$0");
        try {
            screenshotRecorder.contentChanged.set(false);
            PixelCopy.request(window, screenshotRecorder.screenshot, new io.sentry.android.core.internal.util.c(1, screenshotRecorder, view), screenshotRecorder.mainLooperHandler.getHandler());
        } catch (Throwable th) {
            screenshotRecorder.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th);
            screenshotRecorder.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3$lambda$2(ScreenshotRecorder screenshotRecorder, View view, int i7) {
        h.e(screenshotRecorder, "this$0");
        if (i7 != 0) {
            screenshotRecorder.options.getLogger().log(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i7));
            screenshotRecorder.lastCaptureSuccessful.set(false);
        } else if (screenshotRecorder.contentChanged.get()) {
            screenshotRecorder.options.getLogger().log(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            screenshotRecorder.lastCaptureSuccessful.set(false);
        } else {
            ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.Companion.fromView(view, null, 0, screenshotRecorder.options);
            ViewsKt.traverse(view, viewHierarchyNodeFromView, screenshotRecorder.options);
            ExecutorsKt.submitSafely(screenshotRecorder.recorder, screenshotRecorder.options, "screenshot_recorder.mask", new RunnableC0032m0(screenshotRecorder, viewHierarchyNodeFromView, view, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3$lambda$2$lambda$1(ScreenshotRecorder screenshotRecorder, ViewHierarchyNode viewHierarchyNode, View view) {
        h.e(screenshotRecorder, "this$0");
        h.e(viewHierarchyNode, "$viewHierarchy");
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(screenshotRecorder.screenshot);
        canvas.setMatrix(screenshotRecorder.getPrescaledMatrix());
        viewHierarchyNode.traverse(new ScreenshotRecorder$capture$1$1$1$1(screenshotRecorder, arrayList, canvas));
        if (screenshotRecorder.options.getReplayController().isDebugMaskingOverlayEnabled()) {
            screenshotRecorder.mainLooperHandler.post(new RunnableC0032m0(screenshotRecorder, view, arrayList, 20));
        }
        ScreenshotRecorderCallback screenshotRecorderCallback = screenshotRecorder.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(screenshotRecorder.screenshot);
        }
        screenshotRecorder.lastCaptureSuccessful.set(true);
        screenshotRecorder.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3$lambda$2$lambda$1$lambda$0(ScreenshotRecorder screenshotRecorder, View view, List list) {
        h.e(screenshotRecorder, "this$0");
        h.e(list, "$debugMasks");
        if (screenshotRecorder.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(screenshotRecorder.debugOverlayDrawable);
        }
        screenshotRecorder.debugOverlayDrawable.updateMasks(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint$delegate.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        return (Bitmap) this.singlePixelBitmap$delegate.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas$delegate.getValue();
    }

    public final void bind(View view) {
        h.e(view, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(view);
        ViewsKt.addOnDrawListenerSafe(view, this);
        this.contentChanged.set(true);
    }

    public final void capture() {
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (!this.contentChanged.get() && this.lastCaptureSuccessful.get()) {
            ScreenshotRecorderCallback screenshotRecorderCallback = this.screenshotRecorderCallback;
            if (screenshotRecorderCallback != null) {
                screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
                return;
            }
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.mainLooperHandler.post(new RunnableC0032m0(this, phoneWindow, view, 19));
        }
    }

    public final void close() {
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        if (!this.screenshot.isRecycled()) {
            this.screenshot.recycle();
        }
        this.isCapturing.set(false);
    }

    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
            }
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(View view) {
        ViewOverlay overlay;
        if (this.options.getReplayController().isDebugMaskingOverlayEnabled() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (view != null) {
            ViewsKt.removeOnDrawListenerSafe(view, this);
        }
    }
}
