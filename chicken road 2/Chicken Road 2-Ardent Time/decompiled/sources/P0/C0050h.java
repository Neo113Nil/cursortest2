package P0;

/* renamed from: P0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050h {

    /* renamed from: a, reason: collision with root package name */
    public P0.AbstractActivityC0047e f1347a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f1348b;

    /* renamed from: c, reason: collision with root package name */
    public P0.t f1349c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f1350d;

    /* renamed from: e, reason: collision with root package name */
    public N1.h f1351e;

    /* renamed from: f, reason: collision with root package name */
    public P0.ViewTreeObserverOnPreDrawListenerC0049g f1352f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1354h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1356j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Integer f1357k;

    /* renamed from: l, reason: collision with root package name */
    public final P0.C0048f f1358l = new P0.C0048f(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f1355i = false;

    public C0050h(P0.AbstractActivityC0047e abstractActivityC0047e) {
        this.f1347a = abstractActivityC0047e;
    }

    public final void a(Q0.f fVar) {
        java.lang.String c2 = this.f1347a.c();
        if (c2 == null || c2.isEmpty()) {
            c2 = (java.lang.String) ((U0.c) I0.b.F().f657b).f1736e.f1039c;
        }
        R0.a aVar = new R0.a(c2, this.f1347a.f());
        java.lang.String g2 = this.f1347a.g();
        if (g2 == null) {
            P0.AbstractActivityC0047e abstractActivityC0047e = this.f1347a;
            abstractActivityC0047e.getClass();
            g2 = d(abstractActivityC0047e.getIntent());
            if (g2 == null) {
                g2 = "/";
            }
        }
        fVar.f1603b = aVar;
        fVar.f1604c = g2;
        fVar.f1605d = (java.util.List) this.f1347a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1347a.j()) {
            throw new java.lang.AssertionError("The internal FlutterEngine created by " + this.f1347a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1347a;
        abstractActivityC0047e.getClass();
        android.util.Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0047e + " connection to the engine " + abstractActivityC0047e.f1340b.f1348b + " evicted by another attaching activity");
        P0.C0050h c0050h = abstractActivityC0047e.f1340b;
        if (c0050h != null) {
            c0050h.e();
            abstractActivityC0047e.f1340b.f();
        }
    }

    public final void c() {
        if (this.f1347a == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final java.lang.String d(android.content.Intent intent) {
        boolean z2;
        android.net.Uri data;
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1347a;
        abstractActivityC0047e.getClass();
        try {
            android.os.Bundle h2 = abstractActivityC0047e.h();
            z2 = (h2 == null || !h2.containsKey("flutter_deeplinking_enabled")) ? true : h2.getBoolean("flutter_deeplinking_enabled");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f1352f != null) {
            this.f1349c.getViewTreeObserver().removeOnPreDrawListener(this.f1352f);
            this.f1352f = null;
        }
        P0.t tVar = this.f1349c;
        if (tVar != null) {
            tVar.a();
            P0.t tVar2 = this.f1349c;
            tVar2.f1392g.remove(this.f1358l);
        }
    }

    public final void f() {
        if (this.f1356j) {
            c();
            this.f1347a.getClass();
            this.f1347a.getClass();
            P0.AbstractActivityC0047e abstractActivityC0047e = this.f1347a;
            abstractActivityC0047e.getClass();
            if (abstractActivityC0047e.isChangingConfigurations()) {
                N.a aVar = this.f1348b.f7618d;
                if (aVar.f()) {
                    g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        aVar.f1102a = true;
                        java.util.Iterator it = ((java.util.HashMap) aVar.f1107f).values().iterator();
                        while (it.hasNext()) {
                            ((X0.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        aVar.d();
                        android.os.Trace.endSection();
                    } finally {
                    }
                } else {
                    android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1348b.f7618d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f1350d;
            if (eVar != null) {
                eVar.f7747b.f8410c = null;
                this.f1350d = null;
            }
            N1.h hVar = this.f1351e;
            if (hVar != null) {
                ((Z0.h) hVar.f1162d).f1903b = null;
                hVar.f1161c = null;
                this.f1351e = null;
            }
            this.f1347a.getClass();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f1348b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7621g;
                cVar.a(1, cVar.f1870c);
            }
            if (this.f1347a.j()) {
                io.flutter.embedding.engine.FlutterEngine flutterEngine2 = this.f1348b;
                java.util.Iterator it2 = flutterEngine2.f7635v.iterator();
                while (it2.hasNext()) {
                    ((Q0.b) it2.next()).b();
                }
                N.a aVar2 = flutterEngine2.f7618d;
                aVar2.e();
                java.util.HashMap hashMap = (java.util.HashMap) aVar2.f1103b;
                java.util.Iterator it3 = new java.util.HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    java.lang.Class cls = (java.lang.Class) it3.next();
                    W0.b bVar = (W0.b) hashMap.get(cls);
                    if (bVar != null) {
                        g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof X0.a) {
                                if (aVar2.f()) {
                                    ((X0.a) bVar).onDetachedFromActivity();
                                }
                                ((java.util.HashMap) aVar2.f1107f).remove(cls);
                            }
                            bVar.onDetachedFromEngine((W0.a) aVar2.f1106e);
                            hashMap.remove(cls);
                            android.os.Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = flutterEngine2.f7633s;
                    android.util.SparseArray sparseArray = kVar.f7776k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f7785u.k(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = flutterEngine2.t;
                    android.util.SparseArray sparseArray2 = jVar.f7758g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.f7765n.k(sparseArray2.keyAt(0));
                }
                flutterEngine2.f7617c.f1654a.setPlatformMessageHandler(null);
                io.flutter.embedding.engine.FlutterJNI flutterJNI = flutterEngine2.f7615a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f7637x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                I0.b.F().getClass();
                io.flutter.embedding.engine.FlutterEngine.f7614z.remove(java.lang.Long.valueOf(flutterEngine2.f7636w));
                if (this.f1347a.e() != null) {
                    if (Q0.h.f1610c == null) {
                        Q0.h.f1610c = new Q0.h(1);
                    }
                    Q0.h hVar2 = Q0.h.f1610c;
                    hVar2.f1611a.remove(this.f1347a.e());
                }
                this.f1348b = null;
            }
            this.f1356j = false;
        }
    }
}
