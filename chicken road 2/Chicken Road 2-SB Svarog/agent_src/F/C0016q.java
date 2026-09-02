package F;

import a.AbstractC0018a;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f106a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f107b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f108c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f110e;

    public C0016q(AbstractActivityC0005f abstractActivityC0005f) {
        super(abstractActivityC0005f, null);
        this.f106a = false;
        this.f107b = false;
        this.f110e = false;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0015p(this));
        this.f110e = AbstractC0018a.o(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f108c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f108c = hVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f108c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f107b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f108c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f108c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f109d;
            if (surface != null) {
                surface.release();
                this.f109d = null;
            }
        }
        this.f108c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f108c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f106a) {
            e();
        }
        this.f107b = false;
    }

    public final void e() {
        if (this.f108c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f109d;
        if (surface != null) {
            surface.release();
            this.f109d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f109d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f108c;
        boolean z2 = this.f107b;
        FlutterJNI flutterJNI = hVar.f593a;
        if (!z2) {
            hVar.e();
        }
        hVar.f594b = surface2;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f108c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f110e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f109d = surface;
    }
}
