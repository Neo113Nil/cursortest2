package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class j implements io.flutter.plugin.platform.h {

    /* renamed from: a, reason: collision with root package name */
    public Q0.h f7752a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f7753b;

    /* renamed from: c, reason: collision with root package name */
    public P0.t f7754c;

    /* renamed from: e, reason: collision with root package name */
    public Z0.h f7756e;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterJNI f7755d = null;

    /* renamed from: k, reason: collision with root package name */
    public android.view.Surface f7762k = null;

    /* renamed from: l, reason: collision with root package name */
    public android.view.SurfaceControl f7763l = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f7764m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final Z0.h f7765n = new Z0.h(25, this);

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.plugin.platform.a f7757f = new io.flutter.plugin.platform.a();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f7758g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f7759h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f7760i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f7761j = new java.util.ArrayList();

    public j() {
        if (x0.e.f8406e == null) {
            x0.e.f8406e = new x0.e(8);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f7757f.f7740a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f7757f.f7740a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean d(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final void g(int i2) {
        if (this.f7758g.get(i2) != null) {
            throw new java.lang.ClassCastException();
        }
    }
}
