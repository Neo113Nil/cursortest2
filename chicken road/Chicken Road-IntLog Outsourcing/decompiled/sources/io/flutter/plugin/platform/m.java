package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import w2.C1518f;
import x2.C1545h;

/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: b, reason: collision with root package name */
    public Activity f10236b;

    /* renamed from: c, reason: collision with root package name */
    public w2.m f10237c;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f10239e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f10240f;

    /* renamed from: g, reason: collision with root package name */
    public B1.g f10241g;

    /* renamed from: t, reason: collision with root package name */
    public final B0.e f10254t;

    /* renamed from: d, reason: collision with root package name */
    public FlutterJNI f10238d = null;

    /* renamed from: o, reason: collision with root package name */
    public int f10249o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10250p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10251q = true;

    /* renamed from: u, reason: collision with root package name */
    public final U.e f10255u = new U.e(this);

    /* renamed from: a, reason: collision with root package name */
    public final C1545h f10235a = new C1545h(1);

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f10243i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final a f10242h = new a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f10244j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f10247m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f10252r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f10253s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f10248n = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f10245k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f10246l = new SparseArray();

    public m() {
        if (B0.e.f144d == null) {
            B0.e.f144d = new B0.e();
        }
        this.f10254t = B0.e.f144d;
    }

    public static void a(m mVar, G2.f fVar) {
        mVar.getClass();
        int i2 = fVar.f946b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + fVar.f945a + ")");
    }

    @Override // io.flutter.plugin.platform.i
    public final void b(io.flutter.view.g gVar) {
        this.f10242h.f10209a = gVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean c(int i2) {
        return this.f10243i.containsKey(Integer.valueOf(i2));
    }

    @Override // io.flutter.plugin.platform.i
    public final void d(int i2) {
        if (c(i2)) {
            ((s) this.f10243i.get(Integer.valueOf(i2))).getClass();
        } else if (this.f10245k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void e() {
        this.f10242h.f10209a = null;
    }

    public final void f() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f10247m;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.b();
            bVar.f12145a.close();
            i2++;
        }
    }

    public final void g(boolean z) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f10247m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f10252r.contains(Integer.valueOf(keyAt))) {
                FlutterEngine flutterEngine = this.f10237c.f12178i;
                if (flutterEngine != null) {
                    bVar.d(flutterEngine.f10083b);
                }
                z &= bVar.e();
            } else {
                if (!this.f10250p) {
                    bVar.b();
                }
                bVar.setVisibility(8);
                this.f10237c.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f10246l;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f10253s.contains(Integer.valueOf(keyAt2)) || (!z && this.f10251q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void h() {
        if (!this.f10251q || this.f10250p) {
            return;
        }
        w2.m mVar = this.f10237c;
        mVar.f12174e.a();
        C1518f c1518f = mVar.f12173d;
        if (c1518f == null) {
            C1518f c1518f2 = new C1518f(mVar.getContext(), mVar.getWidth(), mVar.getHeight(), 1);
            mVar.f12173d = c1518f2;
            mVar.addView(c1518f2);
        } else {
            c1518f.g(mVar.getWidth(), mVar.getHeight());
        }
        mVar.f12175f = mVar.f12174e;
        C1518f c1518f3 = mVar.f12173d;
        mVar.f12174e = c1518f3;
        FlutterEngine flutterEngine = mVar.f12178i;
        if (flutterEngine != null) {
            c1518f3.d(flutterEngine.f10083b);
        }
        this.f10250p = true;
    }

    public final int i(double d6) {
        return (int) Math.round(d6 * this.f10236b.getResources().getDisplayMetrics().density);
    }
}
