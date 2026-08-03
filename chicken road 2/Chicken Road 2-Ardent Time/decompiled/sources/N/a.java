package N;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1102a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1103b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1104c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1106e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.Serializable f1107f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f1108g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f1109h;

    public a(android.content.Context context, io.flutter.embedding.engine.FlutterEngine flutterEngine, U0.c cVar) {
        this.f1103b = new java.util.HashMap();
        this.f1107f = new java.util.HashMap();
        this.f1102a = false;
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        this.f1104c = flutterEngine;
        this.f1105d = cVar;
        R0.b bVar = flutterEngine.f7617c;
        Q0.h hVar = flutterEngine.f7633s.f7766a;
        this.f1106e = new W0.a(context, bVar);
    }

    public void a(W0.b bVar) {
        g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            java.lang.Class<?> cls = bVar.getClass();
            java.util.HashMap hashMap = (java.util.HashMap) this.f1103b;
            if (hashMap.containsKey(cls)) {
                android.util.Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((io.flutter.embedding.engine.FlutterEngine) this.f1104c) + ").");
                android.os.Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((W0.a) this.f1106e);
            if (bVar instanceof X0.a) {
                X0.a aVar = (X0.a) bVar;
                ((java.util.HashMap) this.f1107f).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((P1.h) this.f1109h);
                }
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(P0.AbstractActivityC0047e abstractActivityC0047e, androidx.lifecycle.l lVar) {
        this.f1109h = new P1.h(abstractActivityC0047e, lVar);
        android.content.Intent intent = abstractActivityC0047e.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            java.lang.String str = Q0.d.f1593h.f1584b;
        } else {
            boolean z2 = ((U0.c) this.f1105d).f1732a;
        }
        io.flutter.embedding.engine.FlutterEngine flutterEngine = (io.flutter.embedding.engine.FlutterEngine) this.f1104c;
        flutterEngine.f7633s.getClass();
        x0.e eVar = flutterEngine.f7634u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) eVar.f8409b;
        if (kVar.f7767b != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f7767b = abstractActivityC0047e;
        kVar.f7770e = flutterEngine.f7616b;
        R0.b bVar = flutterEngine.f7617c;
        kVar.f7772g = new Z0.h(bVar, 3);
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) eVar.f8410c;
        if (jVar.f7753b != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar.f7753b = abstractActivityC0047e;
        Z0.h hVar = new Z0.h(bVar, 2);
        jVar.f7756e = hVar;
        hVar.f1903b = jVar.f7765n;
        kVar.f7772g.f1903b = eVar;
        for (X0.a aVar : ((java.util.HashMap) this.f1107f).values()) {
            if (this.f1102a) {
                aVar.onReattachedToActivityForConfigChanges((P1.h) this.f1109h);
            } else {
                aVar.onAttachedToActivity((P1.h) this.f1109h);
            }
        }
        this.f1102a = false;
    }

    public void c() {
        if (!f()) {
            android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            java.util.Iterator it = ((java.util.HashMap) this.f1107f).values().iterator();
            while (it.hasNext()) {
                ((X0.a) it.next()).onDetachedFromActivity();
            }
            d();
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = (io.flutter.embedding.engine.FlutterEngine) this.f1104c;
        io.flutter.plugin.platform.k kVar = flutterEngine.f7633s;
        Z0.h hVar = kVar.f7772g;
        if (hVar != null) {
            hVar.f1903b = null;
        }
        kVar.e();
        kVar.f7772g = null;
        kVar.f7767b = null;
        kVar.f7770e = null;
        io.flutter.plugin.platform.j jVar = flutterEngine.t;
        Z0.h hVar2 = jVar.f7756e;
        if (hVar2 != null) {
            hVar2.f1903b = null;
        }
        android.view.Surface surface = jVar.f7762k;
        if (surface != null) {
            surface.release();
            jVar.f7762k = null;
            jVar.f7763l = null;
        }
        jVar.f7756e = null;
        jVar.f7753b = null;
        this.f1108g = null;
        this.f1109h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((P0.C0050h) this.f1108g) != null;
    }

    public java.io.FileInputStream g(android.content.res.AssetManager assetManager, java.lang.String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e2) {
            java.lang.String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((N.d) this.f1104c).d();
            }
            return null;
        }
    }

    public void h(int i2, java.io.Serializable serializable) {
        ((java.util.concurrent.Executor) this.f1103b).execute(new F0.d(this, i2, serializable, 1));
    }

    public a(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, N.d dVar, java.lang.String str, java.io.File file) {
        this.f1102a = false;
        this.f1103b = executor;
        this.f1104c = dVar;
        this.f1108g = str;
        this.f1107f = file;
        int i2 = android.os.Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                    bArr = N.e.f1126h;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    bArr = N.e.f1125g;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                    bArr = N.e.f1124f;
                    break;
                case 28:
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                case 30:
                    bArr = N.e.f1123e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = N.e.f1122d;
                    break;
            }
        }
        this.f1105d = bArr;
    }
}
