package I1;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class I implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final j f583a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f584b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0032i f585c;

    /* renamed from: d, reason: collision with root package name */
    public final C0028e f586d = new C0028e(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final H f587e;

    public I(SurfaceHolderCallbackC0032i surfaceHolderCallbackC0032i, j jVar, io.flutter.embedding.engine.renderer.j jVar2) {
        boolean z3 = Build.VERSION.SDK_INT < 26;
        this.f587e = z3 ? new b0.i(4, this) : new J1.i(4, this);
        this.f585c = surfaceHolderCallbackC0032i;
        this.f584b = jVar2;
        this.f583a = jVar;
        if (z3) {
            jVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        SurfaceHolderCallbackC0032i surfaceHolderCallbackC0032i = this.f585c;
        if (surfaceHolderCallbackC0032i != null) {
            surfaceHolderCallbackC0032i.surfaceChanged(surfaceHolder, i3, i4, i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0032i surfaceHolderCallbackC0032i = this.f585c;
        if (surfaceHolderCallbackC0032i != null) {
            surfaceHolderCallbackC0032i.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0032i surfaceHolderCallbackC0032i = this.f585c;
        if (surfaceHolderCallbackC0032i != null) {
            surfaceHolderCallbackC0032i.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.j jVar = this.f584b;
        if (jVar == null) {
            return;
        }
        jVar.a(new G(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
