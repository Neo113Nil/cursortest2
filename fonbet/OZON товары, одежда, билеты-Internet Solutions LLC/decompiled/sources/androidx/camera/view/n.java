package androidx.camera.view;

import B90.q0;
import C.S;
import C.s0;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.camera.view.j;
import java.util.Objects;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
final class n extends k {

    /* renamed from: e, reason: collision with root package name */
    SurfaceView f38563e;

    /* renamed from: f, reason: collision with root package name */
    final a f38564f;

    class a implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Size f38565a;

        /* renamed from: b, reason: collision with root package name */
        private s0 f38566b;

        /* renamed from: c, reason: collision with root package name */
        private s0 f38567c;

        /* renamed from: d, reason: collision with root package name */
        private j f38568d;

        /* renamed from: e, reason: collision with root package name */
        private Size f38569e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f38570f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f38571g = false;

        a() {
        }

        private void a() {
            if (this.f38566b != null) {
                S.a("SurfaceViewImpl", "Request canceled: " + this.f38566b);
                this.f38566b.n();
            }
        }

        private boolean c() {
            n nVar = n.this;
            Surface surface = nVar.f38563e.getHolder().getSurface();
            if (this.f38570f || this.f38566b == null || !Objects.equals(this.f38565a, this.f38569e)) {
                return false;
            }
            S.a("SurfaceViewImpl", "Surface set on Preview.");
            final j jVar = this.f38568d;
            s0 s0Var = this.f38566b;
            Objects.requireNonNull(s0Var);
            s0Var.k(surface, androidx.core.content.a.getMainExecutor(nVar.f38563e.getContext()), new InterfaceC10646a() { // from class: g0.d
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    S.a("SurfaceViewImpl", "Safe to release surface.");
                    j jVar2 = j.this;
                    if (jVar2 != null) {
                        jVar2.a();
                    }
                }
            });
            this.f38570f = true;
            nVar.d();
            return true;
        }

        final void b(@NonNull s0 s0Var, j jVar) {
            a();
            if (this.f38571g) {
                this.f38571g = false;
                s0Var.h();
                return;
            }
            this.f38566b = s0Var;
            this.f38568d = jVar;
            Size g10 = s0Var.g();
            this.f38565a = g10;
            this.f38570f = false;
            if (c()) {
                return;
            }
            S.a("SurfaceViewImpl", "Wait for new Surface creation.");
            n.this.f38563e.getHolder().setFixedSize(g10.getWidth(), g10.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            S.a("SurfaceViewImpl", "Surface changed. Size: " + i12 + "x" + i13);
            this.f38569e = new Size(i12, i13);
            c();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            s0 s0Var;
            S.a("SurfaceViewImpl", "Surface created.");
            if (!this.f38571g || (s0Var = this.f38567c) == null) {
                return;
            }
            s0Var.h();
            this.f38567c = null;
            this.f38571g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            S.a("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f38570f) {
                a();
            } else if (this.f38566b != null) {
                S.a("SurfaceViewImpl", "Surface closed " + this.f38566b);
                this.f38566b.d().d();
            }
            this.f38571g = true;
            s0 s0Var = this.f38566b;
            if (s0Var != null) {
                this.f38567c = s0Var;
            }
            this.f38570f = false;
            this.f38566b = null;
            this.f38568d = null;
            this.f38569e = null;
            this.f38565a = null;
        }
    }

    n(@NonNull FrameLayout frameLayout, @NonNull g gVar) {
        super(frameLayout, gVar);
        this.f38564f = new a();
    }

    @Override // androidx.camera.view.k
    final View a() {
        return this.f38563e;
    }

    @Override // androidx.camera.view.k
    final void b() {
    }

    @Override // androidx.camera.view.k
    final void c() {
    }

    @Override // androidx.camera.view.k
    final void e(@NonNull final s0 s0Var, final j jVar) {
        SurfaceView surfaceView = this.f38563e;
        boolean equals = Objects.equals(this.f38552a, s0Var.g());
        if (surfaceView == null || !equals) {
            Size g10 = s0Var.g();
            this.f38552a = g10;
            FrameLayout frameLayout = this.f38553b;
            g10.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f38563e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f38552a.getWidth(), this.f38552a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f38563e);
            this.f38563e.getHolder().addCallback(this.f38564f);
        }
        s0Var.a(new q0(jVar, 2), androidx.core.content.a.getMainExecutor(this.f38563e.getContext()));
        this.f38563e.post(new Runnable() { // from class: androidx.camera.view.m
            @Override // java.lang.Runnable
            public final void run() {
                n.this.f38564f.b(s0Var, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.k
    @NonNull
    public final com.google.common.util.concurrent.m<Void> g() {
        return I.k.h(null);
    }
}
