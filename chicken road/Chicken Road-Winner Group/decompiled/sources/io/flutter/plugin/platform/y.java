package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class y implements i {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f9335a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f9336b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f9337c;

    /* renamed from: d, reason: collision with root package name */
    public int f9338d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9339e = 0;
    public boolean f = false;

    public y(io.flutter.embedding.engine.renderer.g gVar) {
        x xVar = new x(this);
        this.f9335a = gVar;
        this.f9336b = gVar.f9135b.surfaceTexture();
        gVar.f9137d = xVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final void c(int i3, int i4) {
        this.f9338d = i3;
        this.f9339e = i4;
        SurfaceTexture surfaceTexture = this.f9336b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f9339e;
    }

    @Override // io.flutter.plugin.platform.i
    public final long getId() {
        return this.f9335a.f9134a;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f9337c;
        if (surface == null || this.f) {
            if (surface != null) {
                surface.release();
                this.f9337c = null;
            }
            this.f9337c = new Surface(this.f9336b);
            this.f = false;
        }
        SurfaceTexture surfaceTexture = this.f9336b;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f9337c;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f9338d;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        this.f9336b = null;
        Surface surface = this.f9337c;
        if (surface != null) {
            surface.release();
            this.f9337c = null;
        }
    }
}
