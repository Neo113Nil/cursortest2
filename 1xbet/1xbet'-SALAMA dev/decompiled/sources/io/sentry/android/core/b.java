package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.transport.ICurrentDateProvider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14366c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f14364a = i7;
        this.f14365b = obj;
        this.f14366c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14364a) {
            case 0:
                ((ANRWatchDog) this.f14365b).lambda$new$1((ICurrentDateProvider) this.f14366c);
                break;
            case 1:
                ((AppLifecycleIntegration) this.f14365b).lambda$register$0((IScopes) this.f14366c);
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f14365b).lambda$addLifecycleObserver$1((SentryAndroidOptions) this.f14366c);
                break;
        }
    }
}
