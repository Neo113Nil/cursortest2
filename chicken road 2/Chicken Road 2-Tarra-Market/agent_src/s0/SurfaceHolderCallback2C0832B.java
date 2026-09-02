package s0;

import android.os.Build;
import android.view.SurfaceHolder;

/* renamed from: s0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallback2C0832B implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final j f6494a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f6495b;

    /* renamed from: c, reason: collision with root package name */
    public final i f6496c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f6497d = new io.flutter.embedding.engine.renderer.a(3, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0831A f6498e;

    public SurfaceHolderCallback2C0832B(i iVar, j jVar, io.flutter.embedding.engine.renderer.i iVar2) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f6498e = z2 ? new C0831A(this, 1) : new C0831A(this, 0);
        this.f6496c = iVar;
        this.f6495b = iVar2;
        this.f6494a = jVar;
        if (z2) {
            jVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        i iVar = this.f6496c;
        if (iVar != null) {
            iVar.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i iVar = this.f6496c;
        if (iVar != null) {
            iVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i iVar = this.f6496c;
        if (iVar != null) {
            iVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.i iVar = this.f6495b;
        if (iVar == null) {
            return;
        }
        iVar.a(new z(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
