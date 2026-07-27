package I1;

import android.view.SurfaceHolder;

/* renamed from: I1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0032i implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f622a;

    public SurfaceHolderCallbackC0032i(j jVar) {
        this.f622a = jVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        j jVar = this.f622a;
        io.flutter.embedding.engine.renderer.j jVar2 = jVar.f625c;
        if (jVar2 == null || jVar.f624b) {
            return;
        }
        if (jVar2 == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar2.f9165a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f622a;
        jVar.f623a = true;
        if ((jVar.f625c == null || jVar.f624b) ? false : true) {
            jVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f622a;
        boolean z3 = false;
        jVar.f623a = false;
        io.flutter.embedding.engine.renderer.j jVar2 = jVar.f625c;
        if (jVar2 != null && !jVar.f624b) {
            z3 = true;
        }
        if (z3) {
            if (jVar2 == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar2.j();
        }
    }
}
