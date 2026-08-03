package io.flutter.embedding.engine.renderer;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f7676a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f7677b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7678c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f7679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f7680e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f7681f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.C0048f f7682g;

    public h(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        new java.util.concurrent.atomic.AtomicLong(0L);
        this.f7678c = false;
        this.f7679d = new android.os.Handler();
        this.f7680e = new java.util.HashSet();
        this.f7681f = new java.util.ArrayList();
        P0.C0048f c0048f = new P0.C0048f(3, this);
        this.f7682g = c0048f;
        this.f7676a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0048f);
    }

    public final void a(io.flutter.embedding.engine.renderer.i iVar) {
        this.f7676a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f7678c) {
            iVar.b();
        }
    }

    public final void b(int i2) {
        java.util.Iterator it = this.f7680e.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((java.lang.ref.WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(io.flutter.embedding.engine.renderer.i iVar) {
        this.f7676a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        java.util.Iterator it = this.f7681f.iterator();
        while (it.hasNext()) {
            ((io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f7677b != null) {
            this.f7676a.onSurfaceDestroyed();
            if (this.f7678c) {
                this.f7682g.a();
            }
            this.f7678c = false;
            this.f7677b = null;
        }
    }
}
