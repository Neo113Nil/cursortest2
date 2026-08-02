package io.flutter.embedding.engine.renderer;

import W5.r;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* loaded from: classes2.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f14114a;

    /* renamed from: b, reason: collision with root package name */
    public int f14115b;

    /* renamed from: c, reason: collision with root package name */
    public int f14116c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14117d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f14118e;

    /* renamed from: f, reason: collision with root package name */
    public final i f14119f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f14120g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f14121h;

    public n(long j, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f14114a = j;
        this.f14120g = handler;
        this.f14121h = flutterJNI;
        this.f14119f = iVar;
    }

    public final void finalize() {
        try {
            if (this.f14117d) {
                return;
            }
            release();
            this.f14120g.post(new r(this.f14114a, this.f14121h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f14116c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f14118e == null) {
            this.f14118e = new Surface(this.f14119f.f14085b.surfaceTexture());
        }
        return this.f14118e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f14119f.f14085b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f14115b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f14114a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f14119f.release();
        this.f14118e.release();
        this.f14118e = null;
        this.f14117d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f14121h.markTextureFrameAvailable(this.f14114a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i7, int i8) {
        this.f14115b = i7;
        this.f14116c = i8;
        this.f14119f.f14085b.surfaceTexture().setDefaultBufferSize(i7, i8);
    }
}
