package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571nl implements io.appmetrica.analytics.impl.InterfaceC0676rn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f6540d = java.util.concurrent.TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6541a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor f6542b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData f6543c;

    public C0571nl(android.content.Context context) {
        long j2 = f6540d;
        this.f6543c = new io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData(j2, j2, "sim-info");
        this.f6541a = context;
        this.f6542b = io.appmetrica.analytics.impl.C0560na.k().j();
    }

    public final io.appmetrica.analytics.impl.C0441il b() {
        return new io.appmetrica.analytics.impl.C0441il((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f6541a, "phone", "getting SimMcc", "TelephonyManager", new io.appmetrica.analytics.impl.C0467jl()), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f6541a, "phone", "getting SimMnc", "TelephonyManager", new io.appmetrica.analytics.impl.C0493kl()), ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f6541a, "phone", "getting NetworkRoaming", "TelephonyManager", java.lang.Boolean.FALSE, new io.appmetrica.analytics.impl.C0545ml(this))).booleanValue(), (java.lang.String) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f6541a, "phone", "getting SimOperatorName", "TelephonyManager", new io.appmetrica.analytics.impl.C0519ll()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0676rn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.C0441il> a() {
        java.util.List<io.appmetrica.analytics.impl.C0441il> list;
        try {
            java.util.List<io.appmetrica.analytics.impl.C0441il> list2 = (java.util.List) this.f6543c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f6543c.shouldUpdateData()) {
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (io.appmetrica.analytics.impl.C0560na.f6484I.f6511u.b().f5924n.f6326d) {
                if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(23)) {
                    if (this.f6542b.hasPermission(this.f6541a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(io.appmetrica.analytics.impl.C0597ol.a(this.f6541a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f6543c.setData(arrayList);
            list = arrayList;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return list;
    }
}
