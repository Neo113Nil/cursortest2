package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U8 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f5059h;

    /* renamed from: i, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.U8 f5060i;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0822xd f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0729to f5062b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0843y8 f5063c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0714t9 f5064d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Vb f5065e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ud f5066f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.N9 f5067g;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(io.appmetrica.analytics.impl.EnumC0302da.FIRST_OCCURRENCE, 1);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0302da.NON_FIRST_OCCURENCE, 0);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0302da.UNKNOWN, -1);
        f5059h = java.util.Collections.unmodifiableMap(hashMap);
        f5060i = new io.appmetrica.analytics.impl.U8(new io.appmetrica.analytics.impl.Ri(), new io.appmetrica.analytics.impl.Zm(), new io.appmetrica.analytics.impl.C0280ce(), new io.appmetrica.analytics.impl.Qi(), new io.appmetrica.analytics.impl.C0456ja(), new io.appmetrica.analytics.impl.C0482ka(), new io.appmetrica.analytics.impl.C0431ia());
    }

    public U8(io.appmetrica.analytics.impl.T8 t8) {
        this(t8.f5003a, t8.f5004b, t8.f5005c, t8.f5006d, t8.f5007e, t8.f5008f, t8.f5009g);
    }

    public final io.appmetrica.analytics.impl.C0326e9 a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        io.appmetrica.analytics.impl.C0326e9 c0326e9 = new io.appmetrica.analytics.impl.C0326e9();
        io.appmetrica.analytics.impl.C0301d9 a2 = this.f5066f.a(n8.f4722l, n8.f4723m);
        io.appmetrica.analytics.impl.Z8 a3 = this.f5065e.a(n8.f4717g);
        if (a2 != null) {
            c0326e9.f5820g = a2;
        }
        if (a3 != null) {
            c0326e9.f5819f = a3;
        }
        java.lang.String a4 = this.f5061a.a(n8.f4711a);
        if (a4 != null) {
            c0326e9.f5817d = a4;
        }
        c0326e9.f5818e = this.f5062b.a(n8, c0489kh);
        java.lang.String str = n8.f4720j;
        if (str != null) {
            c0326e9.f5821h = str;
        }
        java.lang.Integer a5 = this.f5064d.a(n8);
        if (a5 != null) {
            c0326e9.f5816c = a5.intValue();
        }
        java.lang.Long l2 = n8.f4713c;
        if (l2 != null) {
            c0326e9.f5814a = l2.longValue();
        }
        java.lang.Long l3 = n8.f4714d;
        if (l3 != null) {
            c0326e9.f5827n = l3.longValue();
        }
        java.lang.Long l4 = n8.f4715e;
        if (l4 != null) {
            c0326e9.f5828o = l4.longValue();
        }
        java.lang.Long l5 = n8.f4716f;
        if (l5 != null) {
            c0326e9.f5815b = l5.longValue();
        }
        java.lang.Integer num = n8.f4721k;
        if (num != null) {
            c0326e9.f5822i = num.intValue();
        }
        c0326e9.f5823j = this.f5063c.a(n8.f4725o);
        io.appmetrica.analytics.impl.C0428i7 c0428i7 = n8.f4717g;
        c0326e9.f5824k = c0428i7 != null ? new io.appmetrica.analytics.impl.C0401h6().a(c0428i7.f6075a) : -1;
        java.lang.String str2 = n8.f4724n;
        if (str2 != null) {
            c0326e9.f5825l = str2.getBytes();
        }
        io.appmetrica.analytics.impl.EnumC0302da enumC0302da = n8.f4726p;
        java.lang.Integer num2 = enumC0302da != null ? (java.lang.Integer) f5059h.get(enumC0302da) : null;
        if (num2 != null) {
            c0326e9.f5826m = num2.intValue();
        }
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9 = n8.f4727q;
        if (enumC0533m9 != null) {
            int ordinal = enumC0533m9.ordinal();
            if (ordinal == 0) {
                c0326e9.f5829p = 0;
            } else if (ordinal == 1) {
                c0326e9.f5829p = 1;
            } else if (ordinal == 2) {
                c0326e9.f5829p = 2;
            }
        }
        java.lang.Boolean bool = n8.f4728r;
        if (bool != null) {
            c0326e9.f5830q = bool.booleanValue();
        }
        if (n8.f4729s != null) {
            c0326e9.f5831r = r6.intValue();
        }
        c0326e9.f5832s = ((io.appmetrica.analytics.impl.C0431ia) this.f5067g).a(n8.t);
        return c0326e9;
    }

    public U8(io.appmetrica.analytics.impl.InterfaceC0822xd interfaceC0822xd, io.appmetrica.analytics.impl.InterfaceC0729to interfaceC0729to, io.appmetrica.analytics.impl.InterfaceC0843y8 interfaceC0843y8, io.appmetrica.analytics.impl.InterfaceC0714t9 interfaceC0714t9, io.appmetrica.analytics.impl.Vb vb, io.appmetrica.analytics.impl.Ud ud, io.appmetrica.analytics.impl.N9 n9) {
        this.f5061a = interfaceC0822xd;
        this.f5062b = interfaceC0729to;
        this.f5063c = interfaceC0843y8;
        this.f5064d = interfaceC0714t9;
        this.f5065e = vb;
        this.f5066f = ud;
        this.f5067g = n9;
    }

    public static io.appmetrica.analytics.impl.T8 a() {
        return new io.appmetrica.analytics.impl.T8(f5060i);
    }
}
