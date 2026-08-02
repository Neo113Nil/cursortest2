package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.SentryOptions;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14412d;

    public /* synthetic */ q(AnrIntegration anrIntegration, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        this.f14409a = 3;
        this.f14410b = anrIntegration;
        this.f14412d = iScopes;
        this.f14411c = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14409a) {
            case 0:
                ((SendCachedEnvelopeIntegration) this.f14410b).lambda$sendCachedEnvelopes$0((SentryAndroidOptions) this.f14411c, (IScopes) this.f14412d);
                break;
            case 1:
                ((ActivityFramesTracker) this.f14410b).lambda$runSafelyOnUiThread$3((Runnable) this.f14411c, (String) this.f14412d);
                break;
            case 2:
                ((AndroidContinuousProfiler) this.f14410b).lambda$sendChunks$1((SentryOptions) this.f14411c, (IScopes) this.f14412d);
                break;
            default:
                ((AnrIntegration) this.f14410b).lambda$register$0((IScopes) this.f14412d, (SentryAndroidOptions) this.f14411c);
                break;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i7) {
        this.f14409a = i7;
        this.f14410b = obj;
        this.f14411c = obj2;
        this.f14412d = obj3;
    }
}
