package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U implements io.appmetrica.analytics.impl.Aa {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5040a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f5041b;

    /* renamed from: i, reason: collision with root package name */
    public java.util.concurrent.FutureTask f5048i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J f5049j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5052m;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5042c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f5043d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5044e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.N f5045f = new io.appmetrica.analytics.impl.N(new io.appmetrica.analytics.impl.C0877zg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.N f5046g = new io.appmetrica.analytics.impl.N(new io.appmetrica.analytics.impl.C0877zg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.N f5047h = new io.appmetrica.analytics.impl.N(new io.appmetrica.analytics.impl.C0877zg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder f5050k = new io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public io.appmetrica.analytics.impl.G f5051l = new io.appmetrica.analytics.impl.G(4, 4, 4);

    public U(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f5040a = context;
        this.f5041b = iCommonExecutor;
        this.f5049j = new io.appmetrica.analytics.impl.J(c0365fm);
    }

    public static final java.lang.Void e(io.appmetrica.analytics.impl.U u2) {
        u2.f5050k = new io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder(u2.a(u2.f5051l.f4309a, new io.appmetrica.analytics.impl.Q(u2)), u2.a(u2.f5051l.f4310b, new io.appmetrica.analytics.impl.S(u2)), u2.a(u2.f5051l.f4311c, new io.appmetrica.analytics.impl.T(u2, new io.appmetrica.analytics.impl.Xd())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder getIdentifiers(android.content.Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void init() {
        if (this.f5048i == null) {
            this.f5051l = this.f5049j.a();
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new io.appmetrica.analytics.impl.Ro(0, this));
            this.f5048i = futureTask;
            this.f5041b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa, io.appmetrica.analytics.impl.InterfaceC0494km
    public final synchronized void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f5049j.a(c0365fm);
        a((io.appmetrica.analytics.impl.Gi) new io.appmetrica.analytics.impl.Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void b(boolean z2) {
        this.f5052m = true;
        this.f5049j.f4467b.update(z2);
        a((io.appmetrica.analytics.impl.Gi) new io.appmetrica.analytics.impl.Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void c(boolean z2) {
        if (!this.f5052m) {
            b(z2);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder getIdentifiers() {
        java.util.concurrent.FutureTask futureTask = this.f5048i;
        if (futureTask == null) {
            kotlin.jvm.internal.i.i("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
        return this.f5050k;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder a() {
        return a(new io.appmetrica.analytics.impl.Xd());
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder a(io.appmetrica.analytics.impl.Gi gi) {
        try {
            a(gi, true).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
        return this.f5050k;
    }

    public final java.util.concurrent.FutureTask a(final io.appmetrica.analytics.impl.Gi gi, final boolean z2) {
        final io.appmetrica.analytics.impl.G a2 = this.f5049j.a();
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: io.appmetrica.analytics.impl.So
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return io.appmetrica.analytics.impl.U.a(z2, a2, this, gi);
            }
        });
        this.f5048i = futureTask;
        this.f5041b.execute(futureTask);
        java.util.concurrent.FutureTask futureTask2 = this.f5048i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.i.i("refresh");
        throw null;
    }

    public static final java.lang.Void a(boolean z2, io.appmetrica.analytics.impl.G g2, io.appmetrica.analytics.impl.U u2, io.appmetrica.analytics.impl.Gi gi) {
        if (!z2 && kotlin.jvm.internal.i.a(g2, u2.f5051l)) {
            return null;
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder advertisingIdsHolder = u2.f5050k;
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a2 = u2.a(g2.f4309a, new io.appmetrica.analytics.impl.Q(u2));
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus = a2.mStatus;
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a2 = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a2.mErrorExplanation);
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a3 = u2.a(g2.f4310b, new io.appmetrica.analytics.impl.S(u2));
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus3 = a3.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a3 = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a3.mErrorExplanation);
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a4 = u2.a(g2.f4311c, new io.appmetrica.analytics.impl.T(u2, gi));
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus4 = a4.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a4 = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a4.mErrorExplanation);
        }
        u2.f5050k = new io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder(a2, a3, a4);
        return null;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(int i2, s1.InterfaceC0991a interfaceC0991a) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult) interfaceC0991a.invoke();
        }
        if (i3 == 1) {
            return new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f5042c);
        }
        if (i3 == 2) {
            return new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FEATURE_DISABLED, this.f5043d);
        }
        if (i3 == 3) {
            return new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, this.f5044e);
        }
        throw new E1.A();
    }
}
