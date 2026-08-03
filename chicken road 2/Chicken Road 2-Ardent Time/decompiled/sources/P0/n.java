package P0;

/* loaded from: classes.dex */
public final class n extends android.view.TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1373a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1374b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1375c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f1376d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1377e;

    public n(P0.AbstractActivityC0047e abstractActivityC0047e) {
        super(abstractActivityC0047e, null);
        this.f1373a = false;
        this.f1374b = false;
        this.f1377e = false;
        setSurfaceTextureListener(new P0.m(this));
        this.f1377e = Q1.d.q(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1375c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1375c = hVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1375c == null) {
            android.util.Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1374b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1375c == null) {
            android.util.Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1375c;
            if (hVar == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            android.view.Surface surface = this.f1376d;
            if (surface != null) {
                surface.release();
                this.f1376d = null;
            }
        }
        this.f1375c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1375c == null) {
            android.util.Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1373a) {
            e();
        }
        this.f1374b = false;
    }

    public final void e() {
        if (this.f1375c == null || getSurfaceTexture() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        android.view.Surface surface = this.f1376d;
        if (surface != null) {
            surface.release();
            this.f1376d = null;
        }
        android.view.Surface surface2 = new android.view.Surface(getSurfaceTexture());
        this.f1376d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f1375c;
        boolean z2 = this.f1374b;
        if (!z2) {
            hVar.e();
        }
        hVar.f7677b = surface2;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = hVar.f7676a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1375c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1377e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        setMeasuredDimension(java.lang.Math.max(android.view.View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), java.lang.Math.max(android.view.View.MeasureSpec.getSize(i3), android.view.View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(android.view.Surface surface) {
        this.f1376d = surface;
    }
}
