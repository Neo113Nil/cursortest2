package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.transport.ICurrentDateProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14360c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f14358a = i7;
        this.f14359b = obj;
        this.f14360c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14358a) {
            case 0:
                ((ANRWatchDog) this.f14359b).lambda$new$1((ICurrentDateProvider) this.f14360c);
                break;
            case 1:
                ((AppLifecycleIntegration) this.f14359b).lambda$register$0((IScopes) this.f14360c);
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f14359b).lambda$addLifecycleObserver$1((SentryAndroidOptions) this.f14360c);
                break;
        }
    }
}
