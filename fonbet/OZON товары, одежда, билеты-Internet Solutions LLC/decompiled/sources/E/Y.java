package E;

import C.h0;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.core.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class Y implements f.a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC2907x f6858b;

    /* renamed from: c, reason: collision with root package name */
    C2908y f6859c;

    /* renamed from: d, reason: collision with root package name */
    private Q f6860d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f6861e;

    /* renamed from: a, reason: collision with root package name */
    final ArrayDeque f6857a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    boolean f6862f = false;

    static abstract class a {
        a() {
        }

        @NonNull
        abstract C.K a();

        abstract int b();
    }

    public Y(@NonNull InterfaceC2907x interfaceC2907x) {
        G.q.a();
        this.f6858b = interfaceC2907x;
        this.f6861e = new ArrayList();
    }

    public static /* synthetic */ void a(Y y11) {
        y11.f6860d = null;
        y11.d();
    }

    public final void c() {
        G.q.a();
        C.K k11 = new C.K("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f6857a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            d0Var.b().execute(new h0(2, d0Var, k11));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f6861e).iterator();
        while (it2.hasNext()) {
            ((Q) it2.next()).c(k11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d() {
        G.q.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f6860d != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f6862f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f6859c.d() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        d0 d0Var = (d0) this.f6857a.poll();
        if (d0Var == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        Q q11 = new Q(d0Var, this);
        x2.i.f(null, !(this.f6860d != null));
        this.f6860d = q11;
        q11.e().a(new V(this, 0), H.c.b());
        this.f6861e.add(q11);
        q11.f().a(new D3.f(1, this, q11), H.c.b());
        x2.d b11 = this.f6859c.b(d0Var, q11, q11.e());
        C2895k c2895k = (C2895k) b11.f104935a;
        Objects.requireNonNull(c2895k);
        P p11 = (P) b11.f104936b;
        Objects.requireNonNull(p11);
        this.f6859c.g(p11);
        G.q.a();
        InterfaceC2907x interfaceC2907x = this.f6858b;
        interfaceC2907x.a();
        com.google.common.util.concurrent.m<Void> c11 = interfaceC2907x.c(c2895k.a());
        I.k.b(c11, new X(this, c2895k), H.c.e());
        q11.q(c11);
    }

    public final void e(@NonNull d0 d0Var) {
        G.q.a();
        this.f6857a.offer(d0Var);
        d();
    }

    public final void f() {
        G.q.a();
        this.f6862f = true;
        Q q11 = this.f6860d;
        if (q11 != null) {
            q11.d();
        }
    }

    public final void g() {
        G.q.a();
        this.f6862f = false;
        d();
    }

    @Override // androidx.camera.core.f.a
    public final void h(@NonNull androidx.camera.core.f fVar) {
        H.c.e().execute(new Runnable() { // from class: E.W
            @Override // java.lang.Runnable
            public final void run() {
                Y.this.d();
            }
        });
    }

    public final void i(@NonNull C2908y c2908y) {
        G.q.a();
        this.f6859c = c2908y;
        c2908y.f(this);
    }
}
