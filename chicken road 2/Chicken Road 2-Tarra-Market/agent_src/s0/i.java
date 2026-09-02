package s0;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class i implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6533a;

    public i(j jVar) {
        this.f6533a = jVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        j jVar = this.f6533a;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f6536c;
        if (iVar == null || jVar.f6535b) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f5784a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f6533a;
        jVar.f6534a = true;
        if ((jVar.f6536c == null || jVar.f6535b) ? false : true) {
            jVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f6533a;
        boolean z2 = false;
        jVar.f6534a = false;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f6536c;
        if (iVar != null && !jVar.f6535b) {
            z2 = true;
        }
        if (z2) {
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
        }
    }
}
