package P0;

/* loaded from: classes.dex */
public final class J implements android.view.SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final P0.l f1325a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1326b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.k f1327c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.C0048f f1328d = new P0.C0048f(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final P0.I f1329e;

    public J(P0.k kVar, P0.l lVar, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = android.os.Build.VERSION.SDK_INT < 26;
        this.f1329e = z2 ? new P0.I(this, 1) : new P0.I(this, 0);
        this.f1327c = kVar;
        this.f1326b = hVar;
        this.f1325a = lVar;
        if (z2) {
            lVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        P0.k kVar = this.f1327c;
        if (kVar != null) {
            kVar.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        P0.k kVar = this.f1327c;
        if (kVar != null) {
            kVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        P0.k kVar = this.f1327c;
        if (kVar != null) {
            kVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(android.view.SurfaceHolder surfaceHolder, java.lang.Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f1326b;
        if (hVar == null) {
            return;
        }
        hVar.a(new P0.H(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
    }
}
