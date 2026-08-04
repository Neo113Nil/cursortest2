package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.replay.ScreenshotRecorder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14394c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f14392a = i7;
        this.f14393b = obj;
        this.f14394c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
        switch (this.f14392a) {
            case 0:
                ScreenshotUtils.lambda$captureScreenshot$0((AtomicBoolean) this.f14393b, (CountDownLatch) this.f14394c, i7);
                break;
            default:
                ScreenshotRecorder.capture$lambda$3$lambda$2((ScreenshotRecorder) this.f14393b, (View) this.f14394c, i7);
                break;
        }
    }
}
