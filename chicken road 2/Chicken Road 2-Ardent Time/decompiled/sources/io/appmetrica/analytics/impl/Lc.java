package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lc implements io.appmetrica.analytics.impl.InterfaceC0676rn {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy f4608b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor f4609c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData f4610d;

    public Lc(android.content.Context context) {
        this.f4607a = context;
        this.f4608b = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(29) ? new io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy(io.appmetrica.analytics.impl.C0560na.k().j(), "android.permission.READ_PHONE_STATE") : new io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy();
        this.f4609c = new io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor(context);
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(20L);
        this.f4610d = new io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0676rn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized io.appmetrica.analytics.impl.Kc a() {
        io.appmetrica.analytics.impl.Kc kc;
        try {
            kc = (io.appmetrica.analytics.impl.Kc) this.f4610d.getData();
            if (kc != null) {
                if (this.f4610d.shouldUpdateData()) {
                }
            }
            kc = new io.appmetrica.analytics.impl.Kc(this.f4608b.hasNecessaryPermissions(this.f4607a) ? this.f4609c.getNetworkType() : io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f4610d.setData(kc);
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return kc;
    }
}
