package io.flutter.embedding.engine;

import I1.AbstractActivityC0027d;
import J1.c;
import K1.b;
import N1.d;
import S1.l;
import U1.a;
import a1.e;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b0.i;
import b2.InterfaceC0165b;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class FlutterEngine implements InterfaceC0165b {
    public static long y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f9097z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9098a;

    /* renamed from: b, reason: collision with root package name */
    public final j f9099b;

    /* renamed from: c, reason: collision with root package name */
    public final b f9100c;

    /* renamed from: d, reason: collision with root package name */
    public final c f9101d;

    /* renamed from: e, reason: collision with root package name */
    public final a f9102e;
    public final A0.j f;

    /* renamed from: g, reason: collision with root package name */
    public final S1.a f9103g;

    /* renamed from: h, reason: collision with root package name */
    public final i f9104h;

    /* renamed from: i, reason: collision with root package name */
    public final J1.i f9105i;

    /* renamed from: j, reason: collision with root package name */
    public final i f9106j;

    /* renamed from: k, reason: collision with root package name */
    public final S1.j f9107k;

    /* renamed from: l, reason: collision with root package name */
    public final e f9108l;

    /* renamed from: m, reason: collision with root package name */
    public final i f9109m;

    /* renamed from: n, reason: collision with root package name */
    public final i f9110n;

    /* renamed from: o, reason: collision with root package name */
    public final l f9111o;

    /* renamed from: p, reason: collision with root package name */
    public final i f9112p;

    /* renamed from: q, reason: collision with root package name */
    public final J1.i f9113q;

    /* renamed from: r, reason: collision with root package name */
    public final e f9114r;

    /* renamed from: s, reason: collision with root package name */
    public final r f9115s;

    /* renamed from: t, reason: collision with root package name */
    public final q f9116t;

    /* renamed from: u, reason: collision with root package name */
    public final V1.b f9117u;

    /* renamed from: w, reason: collision with root package name */
    public final long f9119w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f9118v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final J1.a f9120x = new J1.a(this);

    public FlutterEngine(AbstractActivityC0027d abstractActivityC0027d, FlutterJNI flutterJNI, r rVar, boolean z3, boolean z4) {
        AssetManager assets;
        long j3 = y;
        y = 1 + j3;
        this.f9119w = j3;
        f9097z.put(Long.valueOf(j3), this);
        try {
            assets = abstractActivityC0027d.createPackageContext(abstractActivityC0027d.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0027d.getAssets();
        }
        A0.j F3 = A0.j.F();
        if (flutterJNI == null) {
            Object obj = F3.f67c;
            flutterJNI = new FlutterJNI();
        }
        this.f9098a = flutterJNI;
        b bVar = new b(flutterJNI, assets, this.f9119w);
        this.f9100c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f924d);
        A0.j.F().getClass();
        this.f = new A0.j(bVar, flutterJNI);
        new P0.j(bVar);
        this.f9103g = new S1.a(bVar);
        e eVar = new e(bVar, 19);
        this.f9104h = new i(bVar, 15);
        this.f9105i = new J1.i(bVar, 16);
        this.f9106j = new i(bVar, 12);
        this.f9108l = new e(bVar, 20);
        e eVar2 = new e(bVar, abstractActivityC0027d.getPackageManager());
        this.f9107k = new S1.j(bVar, z4);
        this.f9109m = new i(bVar, 19);
        this.f9110n = new i(bVar, 20);
        l lVar = new l(bVar);
        this.f9111o = lVar;
        this.f9112p = new i(bVar, 21);
        this.f9113q = new J1.i(bVar, 22);
        this.f9114r = new e(bVar, 25);
        a aVar = new a(abstractActivityC0027d, eVar);
        this.f9102e = aVar;
        d dVar = (d) F3.f66b;
        if (!flutterJNI.isAttached()) {
            dVar.d(abstractActivityC0027d.getApplicationContext());
            dVar.a(abstractActivityC0027d, null);
        }
        q qVar = new q();
        qVar.f9284a = rVar.f9301a;
        qVar.f9288e = flutterJNI;
        rVar.f9305e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f9120x);
        flutterJNI.setPlatformViewsController(rVar);
        flutterJNI.setPlatformViewsController2(qVar);
        flutterJNI.setLocalizationPlugin(aVar);
        F3.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(lVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f9099b = new j(flutterJNI);
        this.f9115s = rVar;
        this.f9116t = qVar;
        V1.b bVar2 = new V1.b(5, false);
        bVar2.f1614b = rVar;
        bVar2.f1615c = qVar;
        this.f9117u = bVar2;
        c cVar = new c(abstractActivityC0027d.getApplicationContext(), this, dVar);
        this.f9101d = cVar;
        aVar.b(abstractActivityC0027d.getResources().getConfiguration());
        if (z3 && dVar.f1002e.f992e) {
            X0.a.D(this);
        }
        F2.b.i(abstractActivityC0027d, this);
        cVar.a(new W1.a(eVar2));
    }
}
