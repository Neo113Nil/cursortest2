package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;
import io.flutter.view.p;

/* loaded from: classes.dex */
public final class g implements TextureRegistry$SurfaceTextureEntry, p {

    /* renamed from: a, reason: collision with root package name */
    public final long f9134a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f9135b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9136c;

    /* renamed from: d, reason: collision with root package name */
    public p f9137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f9138e;

    public g(j jVar, long j3, SurfaceTexture surfaceTexture) {
        this.f9138e = jVar;
        this.f9134a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new b(this, 1));
        this.f9135b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                g gVar = g.this;
                if (gVar.f9136c) {
                    return;
                }
                j jVar2 = gVar.f9138e;
                if (jVar2.f9165a.isAttached()) {
                    gVar.f9135b.markDirty();
                    jVar2.f9165a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f9136c) {
                return;
            }
            j jVar = this.f9138e;
            jVar.f9169e.post(new h(this.f9134a, jVar.f9165a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f9134a;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        p pVar = this.f9137d;
        if (pVar != null) {
            pVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f9136c) {
            return;
        }
        this.f9135b.release();
        j jVar = this.f9138e;
        jVar.f9165a.unregisterTexture(this.f9134a);
        jVar.h(this);
        this.f9136c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(p pVar) {
        this.f9137d = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f9135b.surfaceTexture();
    }
}
