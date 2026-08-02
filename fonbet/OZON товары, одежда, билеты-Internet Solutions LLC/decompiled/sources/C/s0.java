package C;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.W;
import androidx.concurrent.futures.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range<Integer> f4222p = T0.f38211a;

    /* renamed from: a, reason: collision with root package name */
    private final Object f4223a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Size f4224b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final A f4225c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f4226d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.camera.core.impl.I f4227e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4228f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.common.util.concurrent.m<Surface> f4229g;

    /* renamed from: h, reason: collision with root package name */
    private final b.a<Surface> f4230h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f4231i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final b.a<Void> f4232j;

    /* renamed from: k, reason: collision with root package name */
    private final b.a<Void> f4233k;

    /* renamed from: l, reason: collision with root package name */
    private final androidx.camera.core.impl.W f4234l;

    /* renamed from: m, reason: collision with root package name */
    private d f4235m;

    /* renamed from: n, reason: collision with root package name */
    private e f4236n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f4237o;

    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC10646a f4238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f4239b;

        a(InterfaceC10646a interfaceC10646a, Surface surface) {
            this.f4238a = interfaceC10646a;
            this.f4239b = surface;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            x2.i.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof b);
            this.f4238a.accept(new C2686f(1, this.f4239b));
        }

        @Override // I.c
        public final void onSuccess(Void r32) {
            this.f4238a.accept(new C2686f(0, this.f4239b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RuntimeException {
    }

    public static abstract class c {
        c() {
        }

        public abstract int a();

        @NonNull
        public abstract Surface b();
    }

    public static abstract class d {
        d() {
        }

        @NonNull
        public static d g(@NonNull Rect rect, int i11, int i12, boolean z11, @NonNull Matrix matrix, boolean z12) {
            return new C2687g(rect, i11, i12, z11, matrix, z12);
        }

        @NonNull
        public abstract Rect a();

        public abstract int b();

        @NonNull
        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface e {
        void c(@NonNull d dVar);
    }

    public s0(@NonNull Size size, @NonNull androidx.camera.core.impl.I i11, boolean z11, @NonNull A a11, @NonNull Range range, @NonNull N.r rVar) {
        this.f4224b = size;
        this.f4227e = i11;
        this.f4228f = z11;
        this.f4225c = a11;
        this.f4226d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.m a12 = androidx.concurrent.futures.b.a(new i0(atomicReference, str));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f4233k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.m<Void> a13 = androidx.concurrent.futures.b.a(new b.c() { // from class: C.j0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar2) {
                atomicReference2.set(aVar2);
                return o0.c(new StringBuilder(), str, "-status");
            }
        });
        this.f4231i = a13;
        I.k.b(a13, new p0(aVar, a12), H.c.b());
        b.a aVar2 = (b.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.m<Surface> a14 = androidx.concurrent.futures.b.a(new B90.U(atomicReference3, str));
        this.f4229g = a14;
        b.a<Surface> aVar3 = (b.a) atomicReference3.get();
        aVar3.getClass();
        this.f4230h = aVar3;
        q0 q0Var = new q0(this, size);
        this.f4234l = q0Var;
        com.google.common.util.concurrent.m<Void> k11 = q0Var.k();
        I.k.b(a14, new r0(k11, aVar2, str), H.c.b());
        k11.a(new Runnable() { // from class: C.k0
            @Override // java.lang.Runnable
            public final void run() {
                s0.this.f4229g.cancel(true);
            }
        }, H.c.b());
        Executor b11 = H.c.b();
        AtomicReference atomicReference4 = new AtomicReference(null);
        I.k.b(androidx.concurrent.futures.b.a(new l0(this, atomicReference4)), new t0(rVar), b11);
        b.a<Void> aVar4 = (b.a) atomicReference4.get();
        aVar4.getClass();
        this.f4232j = aVar4;
    }

    @SuppressLint({"PairedRegistration"})
    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f4233k.a(runnable, executor);
    }

    public final void b() {
        synchronized (this.f4223a) {
            this.f4236n = null;
            this.f4237o = null;
        }
    }

    @NonNull
    public final androidx.camera.core.impl.I c() {
        return this.f4227e;
    }

    @NonNull
    public final androidx.camera.core.impl.W d() {
        return this.f4234l;
    }

    @NonNull
    public final A e() {
        return this.f4225c;
    }

    @NonNull
    public final Range<Integer> f() {
        return this.f4226d;
    }

    @NonNull
    public final Size g() {
        return this.f4224b;
    }

    public final void h() {
        n();
        this.f4232j.c(null);
    }

    public final boolean i() {
        return this.f4228f;
    }

    public final boolean j() {
        return this.f4229g.isDone();
    }

    public final void k(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final InterfaceC10646a<c> interfaceC10646a) {
        if (!this.f4230h.c(surface)) {
            com.google.common.util.concurrent.m<Surface> mVar = this.f4229g;
            if (!mVar.isCancelled()) {
                x2.i.f(null, mVar.isDone());
                try {
                    mVar.get();
                    executor.execute(new Runnable() { // from class: C.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC10646a.this.accept(new C2686f(3, surface));
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: C.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC10646a.this.accept(new C2686f(4, surface));
                        }
                    });
                    return;
                }
            }
        }
        I.k.b(this.f4231i, new a(interfaceC10646a, surface), executor);
    }

    public final void l(@NonNull Executor executor, @NonNull e eVar) {
        d dVar;
        synchronized (this.f4223a) {
            this.f4236n = eVar;
            this.f4237o = executor;
            dVar = this.f4235m;
        }
        if (dVar != null) {
            executor.execute(new h0(0, eVar, dVar));
        }
    }

    public final void m(@NonNull d dVar) {
        e eVar;
        Executor executor;
        synchronized (this.f4223a) {
            this.f4235m = dVar;
            eVar = this.f4236n;
            executor = this.f4237o;
        }
        if (eVar == null || executor == null) {
            return;
        }
        executor.execute(new g0(0, eVar, dVar));
    }

    public final void n() {
        this.f4230h.e(new W.b("Surface request will not complete."));
    }
}
