package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216a2 implements io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5447a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever f5448b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId f5449c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f5450d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5451e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z1 f5452f;

    public C0216a2(android.content.Context context, io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever iAppSetIdRetriever) {
        this.f5447a = context;
        this.f5448b = iAppSetIdRetriever;
        this.f5450d = new java.util.concurrent.CountDownLatch(1);
        this.f5451e = 20L;
        this.f5452f = new io.appmetrica.analytics.impl.Z1(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId getAppSetId() {
        io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId;
        if (this.f5449c == null) {
            try {
                this.f5450d = new java.util.concurrent.CountDownLatch(1);
                this.f5448b.retrieveAppSetId(this.f5447a, this.f5452f);
                this.f5450d.await(this.f5451e, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Throwable unused) {
            }
        }
        appSetId = this.f5449c;
        if (appSetId == null) {
            appSetId = new io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId(null, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope.UNKNOWN);
            this.f5449c = appSetId;
        }
        return appSetId;
    }

    public C0216a2(android.content.Context context) {
        this(context, io.appmetrica.analytics.impl.AbstractC0242b2.a());
    }
}
