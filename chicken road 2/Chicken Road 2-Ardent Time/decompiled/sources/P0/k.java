package P0;

/* loaded from: classes.dex */
public final class k implements android.view.SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0.l f1366a;

    public k(P0.l lVar) {
        this.f1366a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        P0.l lVar = this.f1366a;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1369c;
        if (hVar == null || lVar.f1368b) {
            return;
        }
        if (hVar == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f7676a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        P0.l lVar = this.f1366a;
        lVar.f1367a = true;
        if ((lVar.f1369c == null || lVar.f1368b) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        P0.l lVar = this.f1366a;
        boolean z2 = false;
        lVar.f1367a = false;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1369c;
        if (hVar != null && !lVar.f1368b) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
    }
}
