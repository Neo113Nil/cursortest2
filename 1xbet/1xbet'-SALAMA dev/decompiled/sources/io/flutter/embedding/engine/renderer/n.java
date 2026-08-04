package io.flutter.embedding.engine.renderer;

import W5.r;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f14124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f14125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f14126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlutterJNI f14127h;

    public n(long j, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f14120a = j;
        this.f14126g = handler;
        this.f14127h = flutterJNI;
        this.f14125f = iVar;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f14123d) {
                return;
            }
            release();
            this.f14126g.post(new r(this.f14120a, this.f14127h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f14122c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f14124e == null) {
            this.f14124e = new Surface(this.f14125f.f14091b.surfaceTexture());
        }
        return this.f14124e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f14125f.f14091b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f14121b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f14120a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f14125f.release();
        this.f14124e.release();
        this.f14124e = null;
        this.f14123d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f14127h.markTextureFrameAvailable(this.f14120a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i7, int i8) {
        this.f14121b = i7;
        this.f14122c = i8;
        this.f14125f.f14091b.surfaceTexture().setDefaultBufferSize(i7, i8);
    }
}
