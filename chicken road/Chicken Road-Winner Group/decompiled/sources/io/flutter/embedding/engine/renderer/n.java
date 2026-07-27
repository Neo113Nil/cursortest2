package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* loaded from: classes.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f9172a;

    /* renamed from: b, reason: collision with root package name */
    public int f9173b;

    /* renamed from: c, reason: collision with root package name */
    public int f9174c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9175d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f9176e;
    public final g f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f9177g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f9178h;

    public n(long j3, Handler handler, FlutterJNI flutterJNI, g gVar) {
        this.f9172a = j3;
        this.f9177g = handler;
        this.f9178h = flutterJNI;
        this.f = gVar;
    }

    public final void finalize() {
        try {
            if (this.f9175d) {
                return;
            }
            release();
            this.f9177g.post(new h(this.f9172a, this.f9178h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f9176e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f9174c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f9176e;
        if (surface == null || !surface.isValid()) {
            this.f9176e = new Surface(this.f.f9135b.surfaceTexture());
        }
        return this.f9176e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f.f9135b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f9173b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f9172a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f.release();
        this.f9176e.release();
        this.f9176e = null;
        this.f9175d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f9178h.markTextureFrameAvailable(this.f9172a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i3, int i4) {
        this.f9173b = i3;
        this.f9174c = i4;
        this.f.f9135b.surfaceTexture().setDefaultBufferSize(i3, i4);
    }
}
