package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.SentryOptions;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14418d;

    public /* synthetic */ q(AnrIntegration anrIntegration, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        this.f14415a = 3;
        this.f14416b = anrIntegration;
        this.f14418d = iScopes;
        this.f14417c = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14415a) {
            case 0:
                ((SendCachedEnvelopeIntegration) this.f14416b).lambda$sendCachedEnvelopes$0((SentryAndroidOptions) this.f14417c, (IScopes) this.f14418d);
                break;
            case 1:
                ((ActivityFramesTracker) this.f14416b).lambda$runSafelyOnUiThread$3((Runnable) this.f14417c, (String) this.f14418d);
                break;
            case 2:
                ((AndroidContinuousProfiler) this.f14416b).lambda$sendChunks$1((SentryOptions) this.f14417c, (IScopes) this.f14418d);
                break;
            default:
                ((AnrIntegration) this.f14416b).lambda$register$0((IScopes) this.f14418d, (SentryAndroidOptions) this.f14417c);
                break;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i7) {
        this.f14415a = i7;
        this.f14416b = obj;
        this.f14417c = obj2;
        this.f14418d = obj3;
    }
}
