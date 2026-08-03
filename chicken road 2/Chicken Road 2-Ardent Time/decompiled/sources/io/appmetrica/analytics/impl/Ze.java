package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ze extends io.appmetrica.analytics.impl.AbstractC0848yd implements io.appmetrica.analytics.impl.Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5411d = new io.appmetrica.analytics.impl.Ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5412e = new io.appmetrica.analytics.impl.Ye("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5413f = new io.appmetrica.analytics.impl.Ye("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5414g = new io.appmetrica.analytics.impl.Ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5415h = new io.appmetrica.analytics.impl.Ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5416i = new io.appmetrica.analytics.impl.Ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5417j = new io.appmetrica.analytics.impl.Ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5418k = new io.appmetrica.analytics.impl.Ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5419l = new io.appmetrica.analytics.impl.Ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5420m = new io.appmetrica.analytics.impl.Ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5421n = new io.appmetrica.analytics.impl.Ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5422o = new io.appmetrica.analytics.impl.Ye("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5423p = new io.appmetrica.analytics.impl.Ye("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5424q = new io.appmetrica.analytics.impl.Ye("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5425r = new io.appmetrica.analytics.impl.Ye("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5426s = new io.appmetrica.analytics.impl.Ye("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Ze(io.appmetrica.analytics.impl.Ha ha) {
        super(ha);
    }

    public final long a(int i2) {
        return this.f5302a.getLong(f5412e.f5343b, i2);
    }

    public final boolean b(boolean z2) {
        return this.f5302a.getBoolean(f5413f.f5343b, z2);
    }

    public final io.appmetrica.analytics.impl.Ze c(boolean z2) {
        return (io.appmetrica.analytics.impl.Ze) b(f5414g.f5343b, z2);
    }

    public final io.appmetrica.analytics.impl.Ze d(long j2) {
        return (io.appmetrica.analytics.impl.Ze) b(f5412e.f5343b, j2);
    }

    public final boolean e() {
        return this.f5302a.getBoolean(f5411d.f5343b, false);
    }

    public final void f(boolean z2) {
        b(f5411d.f5343b, z2).b();
    }

    public final io.appmetrica.analytics.impl.Ze g() {
        return (io.appmetrica.analytics.impl.Ze) b(f5423p.f5343b, true);
    }

    public final io.appmetrica.analytics.impl.Ze h() {
        return (io.appmetrica.analytics.impl.Ze) b(f5422o.f5343b, true);
    }

    public final boolean i() {
        return this.f5302a.getBoolean(f5422o.f5343b, false);
    }

    public final boolean j() {
        return this.f5302a.getBoolean(f5423p.f5343b, false);
    }

    public final long a(long j2) {
        return this.f5302a.getLong(f5415h.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ze b(long j2) {
        return (io.appmetrica.analytics.impl.Ze) b(f5415h.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ze c(long j2) {
        return (io.appmetrica.analytics.impl.Ze) b(f5425r.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ze d(boolean z2) {
        return (io.appmetrica.analytics.impl.Ze) b(f5413f.f5343b, z2);
    }

    public final void e(boolean z2) {
        b(f5426s.f5343b, z2).b();
    }

    public final long f() {
        return this.f5302a.getLong(f5425r.f5343b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final java.lang.String a() {
        return this.f5302a.getString(f5424q.f5343b, null);
    }

    public final io.appmetrica.analytics.impl.Ze b(io.appmetrica.analytics.impl.Td td, int i2) {
        io.appmetrica.analytics.impl.Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5416i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5418k;
        } else {
            ye = f5417j;
        }
        return ye != null ? (io.appmetrica.analytics.impl.Ze) b(ye.f5343b, i2) : this;
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final java.util.Set<java.lang.String> c() {
        return this.f5302a.a();
    }

    public final java.lang.Boolean d() {
        io.appmetrica.analytics.impl.Ye ye = f5414g;
        if (!this.f5302a.a(ye.f5343b)) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.f5302a.getBoolean(ye.f5343b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0848yd
    public final java.lang.String f(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Ye(str, null).f5343b;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(java.lang.String str) {
        b(f5424q.f5343b, str).b();
    }

    public final boolean a(boolean z2) {
        return this.f5302a.getBoolean(f5426s.f5343b, z2);
    }

    public final io.appmetrica.analytics.impl.Ze b(io.appmetrica.analytics.impl.Td td, long j2) {
        io.appmetrica.analytics.impl.Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5419l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5421n;
        } else {
            ye = f5420m;
        }
        return ye != null ? (io.appmetrica.analytics.impl.Ze) b(ye.f5343b, j2) : this;
    }

    public final int a(io.appmetrica.analytics.impl.Td td, int i2) {
        io.appmetrica.analytics.impl.Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5416i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5418k;
        } else {
            ye = f5417j;
        }
        if (ye == null) {
            return i2;
        }
        return this.f5302a.getInt(ye.f5343b, i2);
    }

    public final long a(io.appmetrica.analytics.impl.Td td, long j2) {
        io.appmetrica.analytics.impl.Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5419l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5421n;
        } else {
            ye = f5420m;
        }
        if (ye == null) {
            return j2;
        }
        return this.f5302a.getLong(ye.f5343b, j2);
    }
}
