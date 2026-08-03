package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402h7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6029b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f6030c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0869z8 f6031d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0421i0 f6032e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J8 f6033f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0479k7 f6034g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.P5 f6035h;

    public C0402h7(android.content.Context context, io.appmetrica.analytics.impl.Tk tk, int i2, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.C0869z8 c0869z8, io.appmetrica.analytics.impl.C0421i0 c0421i0, io.appmetrica.analytics.impl.J8 j8, io.appmetrica.analytics.impl.C0479k7 c0479k7) {
        this.f6028a = context;
        this.f6029b = i2;
        this.f6030c = c0833xo;
        this.f6031d = c0869z8;
        this.f6032e = c0421i0;
        this.f6033f = j8;
        this.f6034g = c0479k7;
        this.f6035h = c0869z8.f7177a;
    }

    public static java.lang.String b() {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        io.appmetrica.analytics.impl.C0599on C2 = io.appmetrica.analytics.impl.C0560na.f6484I.C();
        io.appmetrica.analytics.impl.C0376g7 c0376g7 = new io.appmetrica.analytics.impl.C0376g7(pVar);
        synchronized (C2) {
            C2.f6606b.a(c0376g7);
        }
        return (java.lang.String) pVar.f7960a;
    }

    public final io.appmetrica.analytics.impl.C0299d7 a() {
        long optLong;
        io.appmetrica.analytics.impl.Io io2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f6035h.f4817e);
        java.lang.String name = this.f6035h.getName();
        java.lang.String value = this.f6035h.getValue();
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f6030c;
        int i2 = this.f6029b;
        synchronized (c0833xo) {
            try {
                org.json.JSONObject a2 = c0833xo.f7123a.a();
                org.json.JSONObject optJSONObject = a2.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                optLong = optJSONObject.optLong(java.lang.String.valueOf(i2));
                optJSONObject.put(java.lang.String.valueOf(i2), 1 + optLong);
                c0833xo.f7123a.a(a2.put("numbers_of_type", optJSONObject));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(optLong);
        io.appmetrica.analytics.impl.C0479k7 c0479k7 = this.f6034g;
        c0479k7.getClass();
        io.appmetrica.analytics.impl.Kb m2 = io.appmetrica.analytics.impl.C0560na.f6484I.m();
        android.location.Location userLocation = m2.getUserLocation();
        if (userLocation != null) {
            int i3 = io.appmetrica.analytics.impl.Io.f4464b;
            android.location.Location location = new android.location.Location(userLocation);
            java.lang.String provider = location.getProvider();
            location.setProvider("");
            io2 = new io.appmetrica.analytics.impl.Io(location, provider);
        } else {
            android.location.Location systemLocation = m2.getSystemLocation();
            io2 = systemLocation != null ? new io.appmetrica.analytics.impl.Io(new android.location.Location(systemLocation), "") : null;
        }
        boolean z2 = c0479k7.f6260a.f6284d;
        java.lang.Double valueOf3 = io2 != null ? java.lang.Double.valueOf(io2.getLatitude()) : null;
        java.lang.Double valueOf4 = io2 != null ? java.lang.Double.valueOf(io2.getLongitude()) : null;
        java.lang.Long valueOf5 = io2 != null ? java.lang.Long.valueOf(io2.getTime()) : null;
        java.lang.Integer valueOf6 = io2 != null ? java.lang.Integer.valueOf((int) io2.getAccuracy()) : null;
        java.lang.Integer valueOf7 = io2 != null ? java.lang.Integer.valueOf((int) io2.getBearing()) : null;
        java.lang.Integer valueOf8 = io2 != null ? java.lang.Integer.valueOf((int) io2.getSpeed()) : null;
        io.appmetrica.analytics.impl.C0428i7 c0428i7 = new io.appmetrica.analytics.impl.C0428i7(java.lang.Boolean.valueOf(z2), valueOf4, valueOf3, io2 != null ? java.lang.Integer.valueOf((int) io2.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, io2 != null ? io2.getProvider() : null, io2 != null ? io2.f4465a : null);
        java.lang.String str = this.f6035h.f4815c;
        io.appmetrica.analytics.impl.C0421i0 c0421i0 = this.f6032e;
        java.lang.String str2 = c0421i0.f6067a;
        java.lang.Long valueOf9 = java.lang.Long.valueOf(c0421i0.f6068b);
        java.lang.Integer valueOf10 = java.lang.Integer.valueOf(this.f6035h.f4819g);
        android.content.Context context = this.f6028a;
        io.appmetrica.analytics.impl.Ce ce = io.appmetrica.analytics.impl.Ge.f4329a;
        java.lang.Integer num = (java.lang.Integer) io.appmetrica.analytics.impl.Ge.f4331c.a((io.appmetrica.analytics.coreapi.internal.system.NetworkType) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault((android.net.ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", io.appmetrica.analytics.coreapi.internal.system.NetworkType.UNDEFINED, new io.appmetrica.analytics.impl.Fe()));
        num.intValue();
        java.lang.String b2 = b();
        io.appmetrica.analytics.impl.I8 i8 = this.f6031d.f7178b;
        io.appmetrica.analytics.impl.P5 p5 = this.f6035h;
        return new io.appmetrica.analytics.impl.C0299d7(valueOf, name, value, valueOf2, c0428i7, str, str2, valueOf9, valueOf10, num, b2, i8, p5.f4820h, p5.f4823k, p5.f4824l, p5.f4826n, p5.f4827o, this.f6033f.fromModel(p5.f4828p));
    }

    public /* synthetic */ C0402h7(android.content.Context context, io.appmetrica.analytics.impl.Tk tk, int i2, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.C0869z8 c0869z8, io.appmetrica.analytics.impl.C0489kh c0489kh, io.appmetrica.analytics.impl.C0421i0 c0421i0) {
        this(context, tk, i2, c0833xo, c0869z8, c0421i0, new io.appmetrica.analytics.impl.J8(), new io.appmetrica.analytics.impl.C0479k7(c0489kh));
    }
}
