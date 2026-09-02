package F;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class S implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0014o f58a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f59b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0013n f60c;

    /* renamed from: d, reason: collision with root package name */
    public final C0006g f61d = new C0006g(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final Q f62e;

    public S(SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n, C0014o c0014o, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f62e = z2 ? new Q(this, 1) : new Q(this, 0);
        this.f60c = surfaceHolderCallbackC0013n;
        this.f59b = hVar;
        this.f58a = c0014o;
        if (z2) {
            c0014o.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f60c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f60c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f60c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f59b;
        if (hVar == null) {
            return;
        }
        hVar.a(new P(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
