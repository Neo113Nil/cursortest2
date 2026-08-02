package io.flutter.embedding.engine.renderer;

import W5.r;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;

/* loaded from: classes2.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, o {

    /* renamed from: a, reason: collision with root package name */
    public final long f14084a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f14085b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14086c;

    /* renamed from: d, reason: collision with root package name */
    public o f14087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f14088e;

    public i(k kVar, long j, SurfaceTexture surfaceTexture) {
        this.f14088e = kVar;
        this.f14084a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f14085b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = i.this;
                if (iVar.f14086c) {
                    return;
                }
                k kVar2 = iVar.f14088e;
                if (kVar2.f14106a.isAttached()) {
                    iVar.f14085b.markDirty();
                    kVar2.f14106a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f14086c) {
                return;
            }
            k kVar = this.f14088e;
            kVar.f14110e.post(new r(this.f14084a, kVar.f14106a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f14084a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i7) {
        o oVar = this.f14087d;
        if (oVar != null) {
            oVar.onTrimMemory(i7);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f14086c) {
            return;
        }
        this.f14085b.release();
        k kVar = this.f14088e;
        kVar.f14106a.unregisterTexture(this.f14084a);
        kVar.f(this);
        this.f14086c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(o oVar) {
        this.f14087d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f14085b.surfaceTexture();
    }
}
