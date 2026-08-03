package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541mh extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0720tf f6433b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f6434c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f6435d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f6436e;

    public C0541mh(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, x4.u(), io.appmetrica.analytics.impl.C0560na.k().t(), new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager(), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
        if (this.f6434c.d()) {
            return false;
        }
        io.appmetrica.analytics.impl.P5 a2 = ((io.appmetrica.analytics.impl.C0489kh) x4.f5265k.a()).f6285e ? io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_UPDATE) : io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_INIT);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appInstaller", (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(this.f6435d.getInstallerPackageName(x4.f5255a, x4.f5256b.f4859a), ""));
            io.appmetrica.analytics.impl.C0720tf c0720tf = this.f6433b;
            c0720tf.f4836h.a(c0720tf.f4829a);
            jSONObject.put("preloadInfo", ((io.appmetrica.analytics.impl.C0643qf) c0720tf.c()).b());
        } catch (java.lang.Throwable unused) {
        }
        a2.setValue(jSONObject.toString());
        io.appmetrica.analytics.impl.C0481k9 c0481k9 = x4.f5268n;
        c0481k9.a(a2, io.appmetrica.analytics.impl.Rk.a(c0481k9.f6266c.b(a2), a2.f4821i));
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f6434c;
        synchronized (c0833xo) {
            io.appmetrica.analytics.impl.C0859yo c0859yo = c0833xo.f7123a;
            c0859yo.a(c0859yo.a().put("init_event_done", true));
        }
        this.f6434c.a(this.f6436e.currentTimeMillis());
        return false;
    }

    public C0541mh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.C0720tf c0720tf, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        super(x4);
        this.f6434c = c0833xo;
        this.f6433b = c0720tf;
        this.f6435d = safePackageManager;
        this.f6436e = systemTimeProvider;
    }
}
