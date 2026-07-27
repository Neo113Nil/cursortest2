package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469ef extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final C0444df f7238d = new C0444df("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0444df f7239e = new C0444df("PREF_KEY_OFFSET", null);
    public static final C0444df f = new C0444df("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0444df f7240g = new C0444df("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0444df f7241h = new C0444df("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0444df f7242i = new C0444df("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0444df f7243j = new C0444df("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0444df f7244k = new C0444df("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0444df f7245l = new C0444df("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0444df f7246m = new C0444df("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0444df f7247n = new C0444df("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0444df f7248o = new C0444df("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0444df f7249p = new C0444df("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0444df f7250q = new C0444df("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0444df f7251r = new C0444df("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0444df f7252s = new C0444df("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C0469ef(Oa oa) {
        super(oa);
    }

    public final long a(int i3) {
        return this.f7110a.getLong(f7239e.f7153b, i3);
    }

    public final boolean b(boolean z3) {
        return this.f7110a.getBoolean(f.f7153b, z3);
    }

    public final C0469ef c(boolean z3) {
        return (C0469ef) b(f7240g.f7153b, z3);
    }

    public final C0469ef d(long j3) {
        return (C0469ef) b(f7239e.f7153b, j3);
    }

    public final boolean e() {
        return this.f7110a.getBoolean(f7238d.f7153b, false);
    }

    public final void f(boolean z3) {
        b(f7238d.f7153b, z3).b();
    }

    public final C0469ef g() {
        return (C0469ef) b(f7249p.f7153b, true);
    }

    public final C0469ef h() {
        return (C0469ef) b(f7248o.f7153b, true);
    }

    public final boolean i() {
        return this.f7110a.getBoolean(f7248o.f7153b, false);
    }

    public final boolean j() {
        return this.f7110a.getBoolean(f7249p.f7153b, false);
    }

    public final long a(long j3) {
        return this.f7110a.getLong(f7241h.f7153b, j3);
    }

    public final C0469ef b(long j3) {
        return (C0469ef) b(f7241h.f7153b, j3);
    }

    public final C0469ef c(long j3) {
        return (C0469ef) b(f7251r.f7153b, j3);
    }

    public final C0469ef d(boolean z3) {
        return (C0469ef) b(f.f7153b, z3);
    }

    public final void e(boolean z3) {
        b(f7252s.f7153b, z3).b();
    }

    public final long f() {
        return this.f7110a.getLong(f7251r.f7153b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7110a.getString(f7250q.f7153b, null);
    }

    public final C0469ef b(EnumC0365ae enumC0365ae, int i3) {
        C0444df c0444df;
        int ordinal = enumC0365ae.ordinal();
        if (ordinal == 0) {
            c0444df = f7242i;
        } else if (ordinal != 1) {
            c0444df = ordinal != 2 ? null : f7244k;
        } else {
            c0444df = f7243j;
        }
        return c0444df != null ? (C0469ef) b(c0444df.f7153b, i3) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0418cf
    public final Set<String> c() {
        return this.f7110a.a();
    }

    public final Boolean d() {
        C0444df c0444df = f7240g;
        if (!this.f7110a.a(c0444df.f7153b)) {
            return null;
        }
        return Boolean.valueOf(this.f7110a.getBoolean(c0444df.f7153b, true));
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0444df(str, null).f7153b;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(f7250q.f7153b, str).b();
    }

    public final boolean a(boolean z3) {
        return this.f7110a.getBoolean(f7252s.f7153b, z3);
    }

    public final C0469ef b(EnumC0365ae enumC0365ae, long j3) {
        C0444df c0444df;
        int ordinal = enumC0365ae.ordinal();
        if (ordinal == 0) {
            c0444df = f7245l;
        } else if (ordinal != 1) {
            c0444df = ordinal != 2 ? null : f7247n;
        } else {
            c0444df = f7246m;
        }
        return c0444df != null ? (C0469ef) b(c0444df.f7153b, j3) : this;
    }

    public final int a(EnumC0365ae enumC0365ae, int i3) {
        C0444df c0444df;
        int ordinal = enumC0365ae.ordinal();
        if (ordinal == 0) {
            c0444df = f7242i;
        } else if (ordinal != 1) {
            c0444df = ordinal != 2 ? null : f7244k;
        } else {
            c0444df = f7243j;
        }
        if (c0444df == null) {
            return i3;
        }
        return this.f7110a.getInt(c0444df.f7153b, i3);
    }

    public final long a(EnumC0365ae enumC0365ae, long j3) {
        C0444df c0444df;
        int ordinal = enumC0365ae.ordinal();
        if (ordinal == 0) {
            c0444df = f7245l;
        } else if (ordinal != 1) {
            c0444df = ordinal != 2 ? null : f7247n;
        } else {
            c0444df = f7246m;
        }
        if (c0444df == null) {
            return j3;
        }
        return this.f7110a.getLong(c0444df.f7153b, j3);
    }
}
