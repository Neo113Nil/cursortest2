package s0;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends TextureView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6540a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6541b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f6542c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f6543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6544e;

    public l(d dVar) {
        super(dVar, null);
        this.f6540a = false;
        this.f6541b = false;
        this.f6544e = false;
        setSurfaceTextureListener(new k(this));
        this.f6544e = V.a.o(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f6542c;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f6542c = iVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f6542c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f6541b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f6542c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f6542c;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = this.f6543d;
            if (surface != null) {
                surface.release();
                this.f6543d = null;
            }
        }
        this.f6542c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f6542c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f6540a) {
            e();
        }
        this.f6541b = false;
    }

    public final void e() {
        if (this.f6542c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f6543d;
        if (surface != null) {
            surface.release();
            this.f6543d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f6543d = surface2;
        io.flutter.embedding.engine.renderer.i iVar = this.f6542c;
        boolean z2 = this.f6541b;
        if (!z2) {
            iVar.e();
        }
        iVar.f5785b = surface2;
        FlutterJNI flutterJNI = iVar.f5784a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f6542c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f6544e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f6543d = surface;
    }
}
