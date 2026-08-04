package p121q5;

import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15906a;

    public h(i iVar) {
        this.f15906a = iVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        i iVar = this.f15906a;
        k kVar = iVar.f15909c;
        if (kVar == null || iVar.f15908b) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f14112a.onSurfaceChanged(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i iVar = this.f15906a;
        iVar.f15907a = true;
        if ((iVar.f15909c == null || iVar.f15908b) ? false : true) {
            iVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i iVar = this.f15906a;
        boolean z4 = false;
        iVar.f15907a = false;
        k kVar = iVar.f15909c;
        if (kVar != null && !iVar.f15908b) {
            z4 = true;
        }
        if (z4) {
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
        }
    }
}
