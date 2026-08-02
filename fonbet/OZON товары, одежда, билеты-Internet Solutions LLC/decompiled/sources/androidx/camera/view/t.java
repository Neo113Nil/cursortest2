package androidx.camera.view;

import C.S;
import C.s0;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
final class t extends k {

    /* renamed from: e, reason: collision with root package name */
    TextureView f38585e;

    /* renamed from: f, reason: collision with root package name */
    SurfaceTexture f38586f;

    /* renamed from: g, reason: collision with root package name */
    com.google.common.util.concurrent.m<s0.c> f38587g;

    /* renamed from: h, reason: collision with root package name */
    s0 f38588h;

    /* renamed from: i, reason: collision with root package name */
    boolean f38589i;

    /* renamed from: j, reason: collision with root package name */
    SurfaceTexture f38590j;

    /* renamed from: k, reason: collision with root package name */
    AtomicReference<b.a<Void>> f38591k;

    /* renamed from: l, reason: collision with root package name */
    j f38592l;

    @Override // androidx.camera.view.k
    final View a() {
        return this.f38585e;
    }

    @Override // androidx.camera.view.k
    final void b() {
        if (!this.f38589i || this.f38590j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f38585e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f38590j;
        if (surfaceTexture != surfaceTexture2) {
            this.f38585e.setSurfaceTexture(surfaceTexture2);
            this.f38590j = null;
            this.f38589i = false;
        }
    }

    @Override // androidx.camera.view.k
    final void c() {
        this.f38589i = true;
    }

    @Override // androidx.camera.view.k
    final void e(@NonNull final s0 s0Var, j jVar) {
        Size g10 = s0Var.g();
        this.f38552a = g10;
        this.f38592l = jVar;
        FrameLayout frameLayout = this.f38553b;
        g10.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f38585e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f38552a.getWidth(), this.f38552a.getHeight()));
        this.f38585e.setSurfaceTextureListener(new s(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f38585e);
        s0 s0Var2 = this.f38588h;
        if (s0Var2 != null) {
            s0Var2.n();
        }
        this.f38588h = s0Var;
        s0Var.a(new Runnable() { // from class: androidx.camera.view.o
            @Override // java.lang.Runnable
            public final void run() {
                t tVar = t.this;
                s0 s0Var3 = tVar.f38588h;
                if (s0Var3 != null && s0Var3 == s0Var) {
                    tVar.f38588h = null;
                    tVar.f38587g = null;
                }
                j jVar2 = tVar.f38592l;
                if (jVar2 != null) {
                    jVar2.a();
                    tVar.f38592l = null;
                }
            }
        }, androidx.core.content.a.getMainExecutor(this.f38585e.getContext()));
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.k
    @NonNull
    public final com.google.common.util.concurrent.m<Void> g() {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.p
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                t.this.f38591k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
            }
        });
    }

    final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f38552a;
        if (size == null || (surfaceTexture = this.f38586f) == null || this.f38588h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f38552a.getHeight());
        final Surface surface = new Surface(this.f38586f);
        final s0 s0Var = this.f38588h;
        final com.google.common.util.concurrent.m<s0.c> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.q
            @Override // androidx.concurrent.futures.b.c
            public final Object c(final b.a aVar) {
                t tVar = t.this;
                tVar.getClass();
                S.a("TextureViewImpl", "Surface set on Preview.");
                s0 s0Var2 = tVar.f38588h;
                Executor b11 = H.c.b();
                InterfaceC10646a<s0.c> interfaceC10646a = new InterfaceC10646a() { // from class: g0.e
                    @Override // x2.InterfaceC10646a
                    public final void accept(Object obj) {
                        b.a.this.c((s0.c) obj);
                    }
                };
                Surface surface2 = surface;
                s0Var2.k(surface2, b11, interfaceC10646a);
                return "provideSurface[request=" + tVar.f38588h + " surface=" + surface2 + "]";
            }
        });
        this.f38587g = a11;
        a11.a(new Runnable() { // from class: androidx.camera.view.r
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.m<s0.c> mVar = a11;
                Surface surface2 = surface;
                t tVar = t.this;
                tVar.getClass();
                S.a("TextureViewImpl", "Safe to release surface.");
                j jVar = tVar.f38592l;
                if (jVar != null) {
                    jVar.a();
                    tVar.f38592l = null;
                }
                surface2.release();
                if (tVar.f38587g == mVar) {
                    tVar.f38587g = null;
                }
                if (tVar.f38588h == s0Var) {
                    tVar.f38588h = null;
                }
            }
        }, androidx.core.content.a.getMainExecutor(this.f38585e.getContext()));
        d();
    }
}
