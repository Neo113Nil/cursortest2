package q5;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes2.dex */
public final class k extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15906a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15907b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f15908c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f15909d;

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        io.flutter.embedding.engine.renderer.k kVar2 = this.f15908c;
        if (kVar2 != null) {
            kVar2.g();
        }
        this.f15908c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15908c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.k kVar = this.f15908c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
            Surface surface = this.f15909d;
            if (surface != null) {
                surface.release();
                this.f15909d = null;
            }
        }
        this.f15908c = null;
    }

    public final void c() {
        if (this.f15908c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f15909d;
        if (surface != null) {
            surface.release();
            this.f15909d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f15909d = surface2;
        io.flutter.embedding.engine.renderer.k kVar = this.f15908c;
        boolean z4 = this.f15907b;
        if (!z4) {
            kVar.g();
        }
        kVar.f14108c = surface2;
        FlutterJNI flutterJNI = kVar.f14106a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f15908c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f15908c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f15907b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        if (this.f15908c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f15906a) {
            c();
        }
        this.f15907b = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f15909d = surface;
    }
}
