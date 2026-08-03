package P0;

/* loaded from: classes.dex */
public final class l extends android.view.SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1367a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1368b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1369c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1370d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.J f1371e;

    public l(P0.AbstractActivityC0047e abstractActivityC0047e, boolean z2) {
        super(abstractActivityC0047e, null);
        this.f1367a = false;
        this.f1368b = false;
        this.f1370d = false;
        P0.J j2 = new P0.J(new P0.k(this), this, this.f1369c);
        this.f1371e = j2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f1370d = Q1.d.q(getContext());
        getHolder().addCallback(j2);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1369c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1369c = hVar;
        P0.I i2 = this.f1371e.f1329e;
        switch (i2.f1323a) {
            case 0:
                i2.f1324b.f1326b = hVar;
                break;
            default:
                P0.J j2 = i2.f1324b;
                io.flutter.embedding.engine.renderer.h hVar3 = j2.f1326b;
                if (hVar3 != null) {
                    hVar3.c(j2.f1328d);
                }
                j2.f1326b = hVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1369c == null) {
            android.util.Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1368b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1369c == null) {
            android.util.Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1369c;
            if (hVar == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        P0.I i2 = this.f1371e.f1329e;
        switch (i2.f1323a) {
            case 0:
                i2.f1324b.f1326b = null;
                break;
            default:
                P0.J j2 = i2.f1324b;
                j2.f1325a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = j2.f1326b;
                if (hVar2 != null) {
                    hVar2.c(j2.f1328d);
                }
                j2.f1326b = null;
                break;
        }
        this.f1369c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1369c == null) {
            android.util.Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        P0.I i2 = this.f1371e.f1329e;
        switch (i2.f1323a) {
            case 0:
                break;
            default:
                P0.J j2 = i2.f1324b;
                io.flutter.embedding.engine.renderer.h hVar = j2.f1326b;
                if (hVar != null) {
                    hVar.a(j2.f1328d);
                    break;
                }
                break;
        }
        if (this.f1367a) {
            e();
        }
        this.f1368b = false;
    }

    public final void e() {
        if (this.f1369c == null || getHolder() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f1369c;
        android.view.Surface surface = getHolder().getSurface();
        boolean z2 = this.f1368b;
        if (!z2) {
            hVar.e();
        }
        hVar.f7677b = surface;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = hVar.f7676a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1369c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1370d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        setMeasuredDimension(java.lang.Math.max(android.view.View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), java.lang.Math.max(android.view.View.MeasureSpec.getSize(i3), android.view.View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
