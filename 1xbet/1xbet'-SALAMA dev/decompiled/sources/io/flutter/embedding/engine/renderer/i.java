package io.flutter.embedding.engine.renderer;

import W5.r;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f14091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f14093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f14094e;

    public i(k kVar, long j, SurfaceTexture surfaceTexture) {
        this.f14094e = kVar;
        this.f14090a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f14091b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = this.f14089a;
                if (iVar.f14092c) {
                    return;
                }
                k kVar2 = iVar.f14094e;
                if (kVar2.f14112a.isAttached()) {
                    iVar.f14091b.markDirty();
                    kVar2.f14112a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f14092c) {
                return;
            }
            k kVar = this.f14094e;
            kVar.f14116e.post(new r(this.f14090a, kVar.f14112a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f14090a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i7) {
        o oVar = this.f14093d;
        if (oVar != null) {
            oVar.onTrimMemory(i7);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f14092c) {
            return;
        }
        this.f14091b.release();
        k kVar = this.f14094e;
        kVar.f14112a.unregisterTexture(this.f14090a);
        kVar.f(this);
        this.f14092c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(o oVar) {
        this.f14093d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f14091b.surfaceTexture();
    }
}
