package p121q5;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.m;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends TextureView implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f15914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f15915d;

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        io.flutter.embedding.engine.renderer.k kVar2 = this.f15914c;
        if (kVar2 != null) {
            kVar2.g();
        }
        this.f15914c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15914c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.k kVar = this.f15914c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
            Surface surface = this.f15915d;
            if (surface != null) {
                surface.release();
                this.f15915d = null;
            }
        }
        this.f15914c = null;
    }

    public final void c() {
        if (this.f15914c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f15915d;
        if (surface != null) {
            surface.release();
            this.f15915d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f15915d = surface2;
        io.flutter.embedding.engine.renderer.k kVar = this.f15914c;
        boolean z4 = this.f15913b;
        if (!z4) {
            kVar.g();
        }
        kVar.f14114c = surface2;
        FlutterJNI flutterJNI = kVar.f14112a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f15914c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f15914c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f15913b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        if (this.f15914c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f15912a) {
            c();
        }
        this.f15913b = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f15915d = surface;
    }
}
