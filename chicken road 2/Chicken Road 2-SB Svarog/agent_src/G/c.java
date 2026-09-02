package G;

import F.t;
import a.AbstractC0018a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements V.b {

    /* renamed from: y, reason: collision with root package name */
    public static long f148y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f149z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f150a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f151b;

    /* renamed from: c, reason: collision with root package name */
    public final H.b f152c;

    /* renamed from: d, reason: collision with root package name */
    public final e f153d;

    /* renamed from: e, reason: collision with root package name */
    public final Q.a f154e;

    /* renamed from: f, reason: collision with root package name */
    public final E.b f155f;

    /* renamed from: g, reason: collision with root package name */
    public final O.d f156g;

    /* renamed from: h, reason: collision with root package name */
    public final t f157h;

    /* renamed from: i, reason: collision with root package name */
    public final O.b f158i;

    /* renamed from: j, reason: collision with root package name */
    public final O.b f159j;

    /* renamed from: k, reason: collision with root package name */
    public final O.m f160k;

    /* renamed from: l, reason: collision with root package name */
    public final C.a f161l;

    /* renamed from: m, reason: collision with root package name */
    public final t f162m;

    /* renamed from: n, reason: collision with root package name */
    public final t f163n;

    /* renamed from: o, reason: collision with root package name */
    public final O.o f164o;

    /* renamed from: p, reason: collision with root package name */
    public final t f165p;

    /* renamed from: q, reason: collision with root package name */
    public final O.c f166q;

    /* renamed from: r, reason: collision with root package name */
    public final C.a f167r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f168s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f169t;

    /* renamed from: u, reason: collision with root package name */
    public final C.a f170u;

    /* renamed from: w, reason: collision with root package name */
    public final long f171w;
    public final HashSet v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f172x = new a(this);

    public c(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f148y;
        f148y = 1 + j2;
        this.f171w = j2;
        f149z.put(Long.valueOf(j2), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        E.b d2 = E.b.d();
        if (flutterJNI == null) {
            Object obj = d2.f19b;
            flutterJNI = new FlutterJNI();
        }
        this.f150a = flutterJNI;
        H.b bVar = new H.b(flutterJNI, assets, this.f171w);
        this.f152c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f223e);
        E.b.d().getClass();
        E.b bVar2 = new E.b();
        t tVar = new t(5, bVar2);
        C.e eVar = new C.e(bVar, "flutter/accessibility", P.m.f366a, null);
        bVar2.f18a = eVar;
        eVar.h(tVar);
        bVar2.f19b = flutterJNI;
        this.f155f = bVar2;
        new C.b(bVar);
        this.f156g = new O.d(bVar);
        C.a aVar = new C.a(bVar, 5);
        this.f157h = new t(bVar, 9);
        this.f158i = new O.b(bVar, 1);
        this.f159j = new O.b(bVar, 0);
        this.f161l = new C.a(bVar, 6);
        C.a aVar2 = new C.a(bVar, context.getPackageManager());
        this.f160k = new O.m(bVar, z3);
        this.f162m = new t(bVar, 18);
        this.f163n = new t(bVar, 20);
        O.o oVar = new O.o(bVar);
        this.f164o = oVar;
        this.f165p = new t(bVar, 22);
        this.f166q = new O.c(bVar);
        this.f167r = new C.a(bVar, 9);
        Q.a aVar3 = new Q.a(context, aVar);
        this.f154e = aVar3;
        K.d dVar = (K.d) d2.f18a;
        if (!flutterJNI.isAttached()) {
            dVar.d(context.getApplicationContext());
            dVar.a(context, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f676b = kVar.f690b;
        jVar.f679e = flutterJNI;
        kVar.f693e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f172x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(aVar3);
        d2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(oVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f151b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f168s = kVar;
        this.f169t = jVar;
        C.a aVar4 = new C.a(17, false);
        aVar4.f4c = kVar;
        aVar4.f5d = jVar;
        this.f170u = aVar4;
        e eVar2 = new e(context.getApplicationContext(), this, dVar);
        this.f153d = eVar2;
        aVar3.b(context.getResources().getConfiguration());
        if (z2 && dVar.f279e.f270e) {
            AbstractC0018a.x(this);
        }
        AbstractC0018a.c(context, this);
        eVar2.a(new S.a(aVar2));
    }
}
