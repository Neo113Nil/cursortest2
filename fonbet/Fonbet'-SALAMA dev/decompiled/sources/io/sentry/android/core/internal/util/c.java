package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.replay.ScreenshotRecorder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14388c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f14386a = i7;
        this.f14387b = obj;
        this.f14388c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
        switch (this.f14386a) {
            case 0:
                ScreenshotUtils.lambda$captureScreenshot$0((AtomicBoolean) this.f14387b, (CountDownLatch) this.f14388c, i7);
                break;
            default:
                ScreenshotRecorder.capture$lambda$3$lambda$2((ScreenshotRecorder) this.f14387b, (View) this.f14388c, i7);
                break;
        }
    }
}
