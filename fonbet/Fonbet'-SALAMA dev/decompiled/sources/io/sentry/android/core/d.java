package io.sentry.android.core;

import io.sentry.SentryOptions;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14365b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f14364a = i7;
        this.f14365b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14364a) {
            case 0:
                ((ActivityFramesTracker) this.f14365b).lambda$stop$2();
                break;
            case 1:
                ((AndroidContinuousProfiler) this.f14365b).lambda$start$0();
                break;
            case 2:
                ((AndroidProfiler) this.f14365b).lambda$start$0();
                break;
            case 3:
                ((AppLifecycleIntegration) this.f14365b).lambda$close$1();
                break;
            case 4:
                InternalSentrySdk.deleteCurrentSessionFile((SentryOptions) this.f14365b);
                break;
            case 5:
                ((NetworkBreadcrumbsIntegration) this.f14365b).lambda$close$0();
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f14365b).lambda$removeLifecycleObserver$2();
                break;
        }
    }
}
