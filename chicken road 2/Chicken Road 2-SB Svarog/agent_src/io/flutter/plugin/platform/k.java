package io.flutter.plugin.platform;

import F.AbstractActivityC0005f;
import F.C0012m;
import F.t;
import F.x;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0005f f691c;

    /* renamed from: d, reason: collision with root package name */
    public x f692d;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f694f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.l f695g;

    /* renamed from: h, reason: collision with root package name */
    public t f696h;

    /* renamed from: u, reason: collision with root package name */
    public final C.a f709u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f693e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f704p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f705q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f706r = true;
    public final t v = new t(29, this);

    /* renamed from: b, reason: collision with root package name */
    public final G.k f690b = new G.k(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f698j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final a f697i = new a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f699k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f702n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f707s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f708t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f703o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f700l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f701m = new SparseArray();

    public k() {
        if (C.a.f1e == null) {
            C.a.f1e = new C.a(2);
        }
        this.f709u = C.a.f1e;
    }

    public static void a(k kVar, O.h hVar) {
        int i2 = hVar.f304c;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + hVar.f302a + ")");
    }

    public final void b() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f702n;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.c();
            bVar.f92a.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void c() {
        this.f697i.f662a = null;
    }

    public final void d(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f702n;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f707s.contains(Integer.valueOf(keyAt))) {
                G.c cVar = this.f692d.f130i;
                if (cVar != null) {
                    bVar.a(cVar.f151b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f705q) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f692d.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f701m;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f708t.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f706r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void e(io.flutter.view.i iVar) {
        this.f697i.f662a = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void f() {
        if (!this.f706r || this.f705q) {
            return;
        }
        x xVar = this.f692d;
        xVar.f126e.b();
        C0012m c0012m = xVar.f125d;
        if (c0012m == null) {
            C0012m c0012m2 = new C0012m(xVar.getContext(), xVar.getWidth(), xVar.getHeight(), 1);
            xVar.f125d = c0012m2;
            xVar.addView(c0012m2);
        } else {
            c0012m.g(xVar.getWidth(), xVar.getHeight());
        }
        xVar.f127f = xVar.f126e;
        C0012m c0012m3 = xVar.f125d;
        xVar.f126e = c0012m3;
        G.c cVar = xVar.f130i;
        if (cVar != null) {
            c0012m3.a(cVar.f151b);
        }
        this.f705q = true;
    }

    public final int g(double d2) {
        return (int) Math.round(d2 * this.f691c.getResources().getDisplayMetrics().density);
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean j(int i2) {
        return this.f698j.containsKey(Integer.valueOf(i2));
    }

    @Override // io.flutter.plugin.platform.h
    public final void r(int i2) {
        if (j(i2)) {
            ((q) this.f698j.get(Integer.valueOf(i2))).getClass();
        } else if (this.f700l.get(i2) != null) {
            throw new ClassCastException();
        }
    }
}
