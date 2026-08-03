package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class k implements io.flutter.plugin.platform.h {

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f7767b;

    /* renamed from: c, reason: collision with root package name */
    public P0.t f7768c;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f7770e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f7771f;

    /* renamed from: g, reason: collision with root package name */
    public Z0.h f7772g;
    public final x0.e t;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterJNI f7769d = null;

    /* renamed from: o, reason: collision with root package name */
    public int f7780o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7781p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7782q = true;

    /* renamed from: u, reason: collision with root package name */
    public final Z0.h f7785u = new Z0.h(24, this);

    /* renamed from: a, reason: collision with root package name */
    public final Q0.h f7766a = new Q0.h(2);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f7774i = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.plugin.platform.a f7773h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f7775j = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseArray f7778m = new android.util.SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f7783r = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f7784s = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f7779n = new android.util.SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final android.util.SparseArray f7776k = new android.util.SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final android.util.SparseArray f7777l = new android.util.SparseArray();

    public k() {
        if (x0.e.f8406e == null) {
            x0.e.f8406e = new x0.e(8);
        }
        this.t = x0.e.f8406e;
    }

    public static void b(io.flutter.plugin.platform.k kVar, P1.B b2) {
        kVar.getClass();
        int i2 = b2.f1435b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + b2.f1434a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f7773h.f7740a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f7773h.f7740a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean d(int i2) {
        return this.f7774i.containsKey(java.lang.Integer.valueOf(i2));
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f7778m;
            if (i2 >= sparseArray.size()) {
                return;
            }
            io.flutter.plugin.platform.b bVar = (io.flutter.plugin.platform.b) sparseArray.valueAt(i2);
            bVar.c();
            bVar.f1359a.close();
            i2++;
        }
    }

    public final void f(boolean z2) {
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f7778m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            io.flutter.plugin.platform.b bVar = (io.flutter.plugin.platform.b) sparseArray.valueAt(i2);
            if (this.f7783r.contains(java.lang.Integer.valueOf(keyAt))) {
                io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f7768c.f1394i;
                if (flutterEngine != null) {
                    bVar.a(flutterEngine.f7616b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f7781p) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f7768c.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            android.util.SparseArray sparseArray2 = this.f7777l;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            android.view.View view = (android.view.View) sparseArray2.get(keyAt2);
            if (!this.f7784s.contains(java.lang.Integer.valueOf(keyAt2)) || (!z2 && this.f7782q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void g(int i2) {
        if (d(i2)) {
            ((io.flutter.plugin.platform.q) this.f7774i.get(java.lang.Integer.valueOf(i2))).getClass();
        } else if (this.f7776k.get(i2) != null) {
            throw new java.lang.ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f7782q || this.f7781p) {
            return;
        }
        P0.t tVar = this.f7768c;
        tVar.f1390e.b();
        P0.C0052j c0052j = tVar.f1389d;
        if (c0052j == null) {
            P0.C0052j c0052j2 = new P0.C0052j(tVar.getContext(), tVar.getWidth(), tVar.getHeight(), 1);
            tVar.f1389d = c0052j2;
            tVar.addView(c0052j2);
        } else {
            c0052j.g(tVar.getWidth(), tVar.getHeight());
        }
        tVar.f1391f = tVar.f1390e;
        P0.C0052j c0052j3 = tVar.f1389d;
        tVar.f1390e = c0052j3;
        io.flutter.embedding.engine.FlutterEngine flutterEngine = tVar.f1394i;
        if (flutterEngine != null) {
            c0052j3.a(flutterEngine.f7616b);
        }
        this.f7781p = true;
    }

    public final int i(double d2) {
        return (int) java.lang.Math.round(d2 * this.f7767b.getResources().getDisplayMetrics().density);
    }
}
