package E;

import C.I;
import C.h0;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f6834a;

    /* renamed from: b, reason: collision with root package name */
    private final Y f6835b;

    /* renamed from: e, reason: collision with root package name */
    private b.a<Void> f6838e;

    /* renamed from: f, reason: collision with root package name */
    private b.a<Void> f6839f;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.m<Void> f6842i;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6840g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6841h = false;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f6836c = androidx.concurrent.futures.b.a(new B90.L(this));

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f6837d = androidx.concurrent.futures.b.a(new B90.M(this, 1));

    Q(@NonNull d0 d0Var, @NonNull Y y11) {
        this.f6834a = d0Var;
        this.f6835b = y11;
    }

    private void h() {
        x2.i.f("The callback can only complete once.", !this.f6837d.isDone());
        this.f6839f.c(null);
    }

    final void c(@NonNull C.K k11) {
        G.q.a();
        if (this.f6837d.isDone()) {
            return;
        }
        G.q.a();
        this.f6840g = true;
        com.google.common.util.concurrent.m<Void> mVar = this.f6842i;
        Objects.requireNonNull(mVar);
        mVar.cancel(true);
        this.f6838e.e(k11);
        this.f6839f.c(null);
        G.q.a();
        d0 d0Var = this.f6834a;
        d0Var.b().execute(new h0(2, d0Var, k11));
    }

    final void d() {
        G.q.a();
        if (this.f6837d.isDone()) {
            return;
        }
        C.K k11 = new C.K("The request is aborted silently and retried.", null);
        G.q.a();
        this.f6840g = true;
        com.google.common.util.concurrent.m<Void> mVar = this.f6842i;
        Objects.requireNonNull(mVar);
        mVar.cancel(true);
        this.f6838e.e(k11);
        this.f6839f.c(null);
        d0 d0Var = this.f6834a;
        Y y11 = this.f6835b;
        G.q.a();
        C.S.a("TakePictureManager", "Add a new request for retrying.");
        y11.f6857a.addFirst(d0Var);
        y11.d();
    }

    @NonNull
    final com.google.common.util.concurrent.m<Void> e() {
        G.q.a();
        return this.f6836c;
    }

    @NonNull
    final com.google.common.util.concurrent.m<Void> f() {
        G.q.a();
        return this.f6837d;
    }

    public final boolean g() {
        return this.f6840g;
    }

    public final void i(@NonNull C.K k11) {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        d0 d0Var = this.f6834a;
        boolean a11 = d0Var.a();
        if (!a11) {
            G.q.a();
            d0Var.b().execute(new h0(2, d0Var, k11));
        }
        h();
        this.f6838e.e(k11);
        if (a11) {
            Y y11 = this.f6835b;
            G.q.a();
            C.S.a("TakePictureManager", "Add a new request for retrying.");
            y11.f6857a.addFirst(d0Var);
            y11.d();
        }
    }

    public final void j(final int i11) {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        final d0 d0Var = this.f6834a;
        d0Var.b().execute(new Runnable() { // from class: E.Z
            @Override // java.lang.Runnable
            public final void run() {
                d0 d0Var2 = d0.this;
                if (d0Var2.g() != null) {
                    d0Var2.g().onCaptureProcessProgressed(i11);
                } else {
                    d0Var2.e();
                }
            }
        });
    }

    public final void k() {
        G.q.a();
        if (this.f6840g || this.f6841h) {
            return;
        }
        this.f6841h = true;
        I.f g10 = this.f6834a.g();
        if (g10 != null) {
            g10.onCaptureStarted();
        }
    }

    public final void l(@NonNull I.h hVar) {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        x2.i.f("onImageCaptured() must be called before onFinalResult()", this.f6836c.isDone());
        h();
        d0 d0Var = this.f6834a;
        d0Var.b().execute(new c0(0, d0Var, hVar));
    }

    public final void m(@NonNull androidx.camera.core.p pVar) {
        G.q.a();
        if (this.f6840g) {
            pVar.close();
            return;
        }
        x2.i.f("onImageCaptured() must be called before onFinalResult()", this.f6836c.isDone());
        h();
        d0 d0Var = this.f6834a;
        d0Var.b().execute(new a0(0, d0Var, pVar));
    }

    public final void n() {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        if (!this.f6841h) {
            k();
        }
        this.f6838e.c(null);
    }

    public final void o(@NonNull Bitmap bitmap) {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        d0 d0Var = this.f6834a;
        d0Var.b().execute(new b0(0, d0Var, bitmap));
    }

    public final void p(@NonNull C.K k11) {
        G.q.a();
        if (this.f6840g) {
            return;
        }
        x2.i.f("onImageCaptured() must be called before onFinalResult()", this.f6836c.isDone());
        h();
        G.q.a();
        d0 d0Var = this.f6834a;
        d0Var.b().execute(new h0(2, d0Var, k11));
    }

    public final void q(@NonNull com.google.common.util.concurrent.m<Void> mVar) {
        G.q.a();
        x2.i.f("CaptureRequestFuture can only be set once.", this.f6842i == null);
        this.f6842i = mVar;
    }
}
