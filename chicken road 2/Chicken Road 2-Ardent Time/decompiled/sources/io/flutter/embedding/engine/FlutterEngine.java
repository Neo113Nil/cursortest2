package io.flutter.embedding.engine;

/* loaded from: classes.dex */
public class FlutterEngine implements g1.InterfaceC0131b {

    /* renamed from: y, reason: collision with root package name */
    public static long f7613y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f7614z = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f7615a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f7616b;

    /* renamed from: c, reason: collision with root package name */
    public final R0.b f7617c;

    /* renamed from: d, reason: collision with root package name */
    public final N.a f7618d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.C0094a f7619e;

    /* renamed from: f, reason: collision with root package name */
    public final I0.b f7620f;

    /* renamed from: g, reason: collision with root package name */
    public final Z0.c f7621g;

    /* renamed from: h, reason: collision with root package name */
    public final C.j f7622h;

    /* renamed from: i, reason: collision with root package name */
    public final Z0.a f7623i;

    /* renamed from: j, reason: collision with root package name */
    public final Z0.a f7624j;

    /* renamed from: k, reason: collision with root package name */
    public final Z0.k f7625k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.e f7626l;

    /* renamed from: m, reason: collision with root package name */
    public final Z0.h f7627m;

    /* renamed from: n, reason: collision with root package name */
    public final Z0.h f7628n;

    /* renamed from: o, reason: collision with root package name */
    public final Z0.m f7629o;

    /* renamed from: p, reason: collision with root package name */
    public final Z0.h f7630p;

    /* renamed from: q, reason: collision with root package name */
    public final Z0.b f7631q;

    /* renamed from: r, reason: collision with root package name */
    public final x0.e f7632r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f7633s;
    public final io.flutter.plugin.platform.j t;

    /* renamed from: u, reason: collision with root package name */
    public final x0.e f7634u;

    /* renamed from: w, reason: collision with root package name */
    public final long f7636w;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f7635v = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final Q0.a f7637x = new Q0.a(this);

    public FlutterEngine(P0.AbstractActivityC0047e abstractActivityC0047e, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        android.content.res.AssetManager assets;
        long j2 = f7613y;
        f7613y = 1 + j2;
        this.f7636w = j2;
        f7614z.put(java.lang.Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0047e.createPackageContext(abstractActivityC0047e.getPackageName(), 0).getAssets();
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0047e.getAssets();
        }
        I0.b F2 = I0.b.F();
        if (flutterJNI == null) {
            ((m0.j) F2.f658c).getClass();
            flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
        }
        this.f7615a = flutterJNI;
        R0.b bVar = new R0.b(flutterJNI, assets, this.f7636w);
        this.f7617c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f1657d);
        I0.b.F().getClass();
        this.f7620f = new I0.b(bVar, flutterJNI);
        new m0.j(bVar);
        this.f7621g = new Z0.c(bVar);
        x0.e eVar = new x0.e(bVar, 12);
        this.f7622h = new C.j(bVar);
        this.f7623i = new Z0.a(bVar, 1);
        this.f7624j = new Z0.a(bVar, 0);
        this.f7626l = new x0.e(bVar, 13);
        x0.e eVar2 = new x0.e(bVar, abstractActivityC0047e.getPackageManager());
        this.f7625k = new Z0.k(bVar, z3);
        this.f7627m = new Z0.h(bVar, 7);
        this.f7628n = new Z0.h(bVar, 9);
        Z0.m mVar = new Z0.m(bVar);
        this.f7629o = mVar;
        this.f7630p = new Z0.h(bVar, 11);
        this.f7631q = new Z0.b(bVar);
        this.f7632r = new x0.e(bVar, 16);
        b1.C0094a c0094a = new b1.C0094a(abstractActivityC0047e, eVar);
        this.f7619e = c0094a;
        U0.c cVar = (U0.c) F2.f657b;
        if (!flutterJNI.isAttached()) {
            cVar.d(abstractActivityC0047e.getApplicationContext());
            cVar.a(abstractActivityC0047e, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f7752a = kVar.f7766a;
        jVar.f7755d = flutterJNI;
        kVar.f7769d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f7637x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(c0094a);
        F2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(mVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new java.lang.RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f7616b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f7633s = kVar;
        this.t = jVar;
        x0.e eVar3 = new x0.e(27, false);
        eVar3.f8409b = kVar;
        eVar3.f8410c = jVar;
        this.f7634u = eVar3;
        N.a aVar = new N.a(abstractActivityC0047e.getApplicationContext(), this, cVar);
        this.f7618d = aVar;
        c0094a.b(abstractActivityC0047e.getResources().getConfiguration());
        if (z2 && cVar.f1736e.f1037a) {
            a.AbstractC0059a.w(this);
        }
        a.AbstractC0059a.d(abstractActivityC0047e, this);
        aVar.a(new d1.C0108a(eVar2));
    }
}
