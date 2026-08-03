package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236am extends io.appmetrica.analytics.impl.M5 {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0864z3 f5481b;

    public C0236am(android.content.Context context, java.lang.String str) {
        this(context, str, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager(), io.appmetrica.analytics.impl.C0560na.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0262bm load(io.appmetrica.analytics.impl.L5 l5) {
        io.appmetrica.analytics.impl.C0262bm c0262bm = (io.appmetrica.analytics.impl.C0262bm) super.load(l5);
        io.appmetrica.analytics.impl.C0365fm c0365fm = l5.f4580a;
        c0262bm.f5596d = c0365fm.f5916f;
        c0262bm.f5597e = c0365fm.f5917g;
        io.appmetrica.analytics.impl.Zl zl = (io.appmetrica.analytics.impl.Zl) l5.componentArguments;
        java.lang.String str = zl.f5436a;
        if (str != null) {
            c0262bm.f5598f = str;
            c0262bm.f5599g = zl.f5437b;
        }
        java.util.Map<java.lang.String, java.lang.String> map = zl.f5438c;
        c0262bm.f5600h = map;
        c0262bm.f5601i = (io.appmetrica.analytics.impl.C0656r3) this.f5481b.a(new io.appmetrica.analytics.impl.C0656r3(map, io.appmetrica.analytics.impl.S7.f4954c));
        io.appmetrica.analytics.impl.Zl zl2 = (io.appmetrica.analytics.impl.Zl) l5.componentArguments;
        c0262bm.f5603k = zl2.f5439d;
        c0262bm.f5602j = zl2.f5440e;
        io.appmetrica.analytics.impl.C0365fm c0365fm2 = l5.f4580a;
        c0262bm.f5604l = c0365fm2.f5926p;
        c0262bm.f5605m = c0365fm2.f5928r;
        long j2 = c0365fm2.f5931v;
        if (c0262bm.f5606n == 0) {
            c0262bm.f5606n = j2;
        }
        return c0262bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final io.appmetrica.analytics.networktasks.internal.BaseRequestConfig createBlankConfig() {
        return new io.appmetrica.analytics.impl.C0262bm();
    }

    public C0236am(android.content.Context context, java.lang.String str, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager, io.appmetrica.analytics.impl.C0864z3 c0864z3) {
        super(context, str, safePackageManager);
        this.f5481b = c0864z3;
    }

    public final io.appmetrica.analytics.impl.C0262bm a() {
        return new io.appmetrica.analytics.impl.C0262bm();
    }
}
