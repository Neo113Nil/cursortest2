package androidx.camera.view;

import C.S;
import C.s0;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;

/* loaded from: classes8.dex */
final class s implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f38582a;

    final class a implements I.c<s0.c> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f38583a;

        a(SurfaceTexture surfaceTexture) {
            this.f38583a = surfaceTexture;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
        }

        @Override // I.c
        public final void onSuccess(s0.c cVar) {
            x2.i.f("Unexpected result from SurfaceRequest. Surface was provided twice.", cVar.a() != 3);
            S.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.f38583a.release();
            t tVar = s.this.f38582a;
            if (tVar.f38590j != null) {
                tVar.f38590j = null;
            }
        }
    }

    s(t tVar) {
        this.f38582a = tVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
        S.a("TextureViewImpl", "SurfaceTexture available. Size: " + i11 + "x" + i12);
        t tVar = this.f38582a;
        tVar.f38586f = surfaceTexture;
        if (tVar.f38587g == null) {
            tVar.h();
            return;
        }
        tVar.f38588h.getClass();
        S.a("TextureViewImpl", "Surface invalidated " + tVar.f38588h);
        tVar.f38588h.d().d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        t tVar = this.f38582a;
        tVar.f38586f = null;
        com.google.common.util.concurrent.m<s0.c> mVar = tVar.f38587g;
        if (mVar == null) {
            S.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        I.k.b(mVar, new a(surfaceTexture), androidx.core.content.a.getMainExecutor(tVar.f38585e.getContext()));
        tVar.f38590j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
        S.a("TextureViewImpl", "SurfaceTexture size changed: " + i11 + "x" + i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        b.a<Void> andSet = this.f38582a.f38591k.getAndSet(null);
        if (andSet != null) {
            andSet.c(null);
        }
    }
}
