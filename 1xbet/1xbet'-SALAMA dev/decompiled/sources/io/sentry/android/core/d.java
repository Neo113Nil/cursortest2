package io.sentry.android.core;

import io.sentry.SentryOptions;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14371b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f14370a = i7;
        this.f14371b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14370a) {
            case 0:
                ((ActivityFramesTracker) this.f14371b).lambda$stop$2();
                break;
            case 1:
                ((AndroidContinuousProfiler) this.f14371b).lambda$start$0();
                break;
            case 2:
                ((AndroidProfiler) this.f14371b).lambda$start$0();
                break;
            case 3:
                ((AppLifecycleIntegration) this.f14371b).lambda$close$1();
                break;
            case 4:
                InternalSentrySdk.deleteCurrentSessionFile((SentryOptions) this.f14371b);
                break;
            case 5:
                ((NetworkBreadcrumbsIntegration) this.f14371b).lambda$close$0();
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f14371b).lambda$removeLifecycleObserver$2();
                break;
        }
    }
}
