package io.sentry.android.core;

import android.graphics.Bitmap;
import io.sentry.EventProcessor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventProcessor f14407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14408c;

    public /* synthetic */ o(EventProcessor eventProcessor, Object obj, int i7) {
        this.f14406a = i7;
        this.f14407b = eventProcessor;
        this.f14408c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14406a) {
            case 0:
                return ((DefaultAndroidEventProcessor) this.f14407b).lambda$new$1((SentryAndroidOptions) this.f14408c);
            default:
                return ((ScreenshotEventProcessor) this.f14407b).lambda$process$0((Bitmap) this.f14408c);
        }
    }
}
