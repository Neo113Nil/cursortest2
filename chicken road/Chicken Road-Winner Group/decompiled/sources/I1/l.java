package I1;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f629a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f630b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f631c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f632d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f633e;

    public l(AbstractActivityC0027d abstractActivityC0027d) {
        super(abstractActivityC0027d, null);
        this.f629a = false;
        this.f630b = false;
        this.f633e = false;
        setSurfaceTextureListener(new k(this));
        this.f633e = F2.b.z(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f631c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f630b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f631c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f631c;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = this.f632d;
            if (surface != null) {
                surface.release();
                this.f632d = null;
            }
        }
        this.f631c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c() {
        if (this.f631c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f629a) {
            e();
        }
        this.f630b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f631c;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f631c = jVar;
        c();
    }

    public final void e() {
        if (this.f631c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f632d;
        if (surface != null) {
            surface.release();
            this.f632d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f632d = surface2;
        io.flutter.embedding.engine.renderer.j jVar = this.f631c;
        boolean z3 = this.f630b;
        if (!z3) {
            jVar.j();
        }
        jVar.f9167c = surface2;
        FlutterJNI flutterJNI = jVar.f9165a;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f631c;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f633e) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f632d = surface;
    }
}
