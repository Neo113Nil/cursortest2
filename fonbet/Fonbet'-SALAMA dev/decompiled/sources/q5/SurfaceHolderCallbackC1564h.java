package q5;

import android.view.SurfaceHolder;

/* renamed from: q5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SurfaceHolderCallbackC1564h implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1565i f15900a;

    public SurfaceHolderCallbackC1564h(C1565i c1565i) {
        this.f15900a = c1565i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        C1565i c1565i = this.f15900a;
        io.flutter.embedding.engine.renderer.k kVar = c1565i.f15903c;
        if (kVar == null || c1565i.f15902b) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f14106a.onSurfaceChanged(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1565i c1565i = this.f15900a;
        c1565i.f15901a = true;
        if ((c1565i.f15903c == null || c1565i.f15902b) ? false : true) {
            c1565i.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1565i c1565i = this.f15900a;
        boolean z4 = false;
        c1565i.f15901a = false;
        io.flutter.embedding.engine.renderer.k kVar = c1565i.f15903c;
        if (kVar != null && !c1565i.f15902b) {
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
