package io.sentry.android.core;

import android.graphics.Bitmap;
import io.sentry.EventProcessor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventProcessor f14401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14402c;

    public /* synthetic */ o(EventProcessor eventProcessor, Object obj, int i7) {
        this.f14400a = i7;
        this.f14401b = eventProcessor;
        this.f14402c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        DeviceInfoUtil lambda$new$1;
        byte[] lambda$process$0;
        switch (this.f14400a) {
            case 0:
                lambda$new$1 = ((DefaultAndroidEventProcessor) this.f14401b).lambda$new$1((SentryAndroidOptions) this.f14402c);
                return lambda$new$1;
            default:
                lambda$process$0 = ((ScreenshotEventProcessor) this.f14401b).lambda$process$0((Bitmap) this.f14402c);
                return lambda$process$0;
        }
    }
}
