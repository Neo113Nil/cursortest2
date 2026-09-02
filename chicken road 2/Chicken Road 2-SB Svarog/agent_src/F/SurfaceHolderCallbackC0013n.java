package F;

import android.view.SurfaceHolder;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0013n implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0014o f99a;

    public SurfaceHolderCallbackC0013n(C0014o c0014o) {
        this.f99a = c0014o;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        C0014o c0014o = this.f99a;
        io.flutter.embedding.engine.renderer.h hVar = c0014o.f102c;
        if (hVar == null || c0014o.f101b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f593a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0014o c0014o = this.f99a;
        c0014o.f100a = true;
        if (c0014o.f102c == null || c0014o.f101b) {
            return;
        }
        c0014o.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0014o c0014o = this.f99a;
        c0014o.f100a = false;
        io.flutter.embedding.engine.renderer.h hVar = c0014o.f102c;
        if (hVar == null || c0014o.f101b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        hVar.e();
    }
}
