package C;

import C.Y;
import Q.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes8.dex */
public final class Y extends androidx.camera.core.w {

    /* renamed from: w, reason: collision with root package name */
    public static final b f4142w = new b();

    /* renamed from: x, reason: collision with root package name */
    private static final ScheduledExecutorService f4143x = H.c.e();

    /* renamed from: p, reason: collision with root package name */
    private c f4144p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private ScheduledExecutorService f4145q;

    /* renamed from: r, reason: collision with root package name */
    O0.b f4146r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.camera.core.impl.W f4147s;

    /* renamed from: t, reason: collision with root package name */
    private N.y f4148t;

    /* renamed from: u, reason: collision with root package name */
    s0 f4149u;

    /* renamed from: v, reason: collision with root package name */
    private O0.c f4150v;

    public static final class a implements b1.a<Y, D0, a> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f4151a;

        public a() {
            this(C5123v0.R());
        }

        @NonNull
        static a d(@NonNull androidx.camera.core.impl.T t2) {
            return new a(C5123v0.S(t2));
        }

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            return this.f4151a;
        }

        @NonNull
        public final Y c() {
            D0 b11 = b();
            InterfaceC5102k0.G(b11);
            return new Y(b11);
        }

        @Override // androidx.camera.core.impl.b1.a
        @NonNull
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final D0 b() {
            return new D0(A0.Q(this.f4151a));
        }

        @NonNull
        public final void f() {
            A a11 = A.f4075c;
            this.f4151a.U(InterfaceC5100j0.f38331k, a11);
        }

        @NonNull
        public final void g(@NonNull Q.b bVar) {
            this.f4151a.U(InterfaceC5102k0.f38350t, bVar);
        }

        @NonNull
        public final void h() {
            this.f4151a.U(b1.f38271z, 2);
        }

        @NonNull
        @Deprecated
        public final void i(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            this.f4151a.U(InterfaceC5102k0.f38342l, Integer.valueOf(i11));
        }

        @NonNull
        public final void j(@NonNull String str) {
            this.f4151a.U(J.m.f12651b, str);
        }

        private a(C5123v0 c5123v0) {
            Object obj;
            this.f4151a = c5123v0;
            Object obj2 = null;
            try {
                obj = c5123v0.a(J.m.f12652c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(Y.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f4151a.U(b1.f38264D, c1.b.PREVIEW);
            T.a<Class<?>> aVar = J.m.f12652c;
            C5123v0 c5123v02 = this.f4151a;
            c5123v02.U(aVar, Y.class);
            try {
                obj2 = c5123v02.a(J.m.f12651b);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                j(Y.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            Object obj3 = -1;
            try {
                obj3 = c5123v0.a(InterfaceC5102k0.f38345o);
            } catch (IllegalArgumentException unused3) {
            }
            if (((Integer) obj3).intValue() == -1) {
                c5123v0.U(InterfaceC5102k0.f38345o, 2);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final D0 f4152a;

        static {
            b.a aVar = new b.a();
            aVar.d(Q.a.f22724a);
            aVar.f(Q.c.f22733c);
            Q.b a11 = aVar.a();
            a aVar2 = new a();
            aVar2.h();
            aVar2.i(0);
            aVar2.g(a11);
            aVar2.f();
            f4152a = aVar2.b();
        }

        @NonNull
        public static D0 a() {
            return f4152a;
        }
    }

    public interface c {
        void a(@NonNull s0 s0Var);
    }

    Y(@NonNull D0 d02) {
        super(d02);
        this.f4145q = f4143x;
    }

    public static /* synthetic */ void V(Y y11) {
        if (y11.f() == null) {
            return;
        }
        y11.Y((D0) y11.i(), y11.d());
        y11.D();
    }

    private void W() {
        O0.c cVar = this.f4150v;
        if (cVar != null) {
            cVar.b();
            this.f4150v = null;
        }
        androidx.camera.core.impl.W w11 = this.f4147s;
        if (w11 != null) {
            w11.d();
            this.f4147s = null;
        }
        N.y yVar = this.f4148t;
        if (yVar != null) {
            yVar.g();
            this.f4148t = null;
        }
        this.f4149u = null;
    }

    private void Y(@NonNull D0 d02, @NonNull T0 t02) {
        G.q.a();
        androidx.camera.core.impl.I f7 = f();
        Objects.requireNonNull(f7);
        W();
        x2.i.f(null, this.f4148t == null);
        Matrix s11 = s();
        boolean p11 = f7.p();
        Size e11 = t02.e();
        Rect x11 = x() != null ? x() : e11 != null ? new Rect(0, 0, e11.getWidth(), e11.getHeight()) : null;
        Objects.requireNonNull(x11);
        this.f4148t = new N.y(1, 34, t02, s11, p11, x11, p(f7, z(f7)), c(), f7.p() && z(f7));
        if (k() != null) {
            throw null;
        }
        this.f4148t.d(new Runnable() { // from class: androidx.camera.core.t
            @Override // java.lang.Runnable
            public final void run() {
                Y.this.D();
            }
        });
        s0 i11 = this.f4148t.i(f7, true);
        this.f4149u = i11;
        this.f4147s = i11.d();
        if (this.f4144p != null) {
            androidx.camera.core.impl.I f11 = f();
            N.y yVar = this.f4148t;
            if (f11 != null && yVar != null) {
                G.q.c(new N.t(yVar, p(f11, z(f11)), c()));
            }
            c cVar = this.f4144p;
            cVar.getClass();
            s0 s0Var = this.f4149u;
            s0Var.getClass();
            this.f4145q.execute(new W(0, cVar, s0Var));
        }
        O0.b m11 = O0.b.m(d02, t02.e());
        m11.q(t02.c());
        m11.u(d02.p());
        if (t02.d() != null) {
            m11.e(t02.d());
        }
        if (this.f4144p != null) {
            m11.i(this.f4147s, t02.b(), m());
        }
        O0.c cVar2 = this.f4150v;
        if (cVar2 != null) {
            cVar2.b();
        }
        O0.c cVar3 = new O0.c(new O0.d() { // from class: C.X
            @Override // androidx.camera.core.impl.O0.d
            public final void a(O0 o02, O0.g gVar) {
                Y.V(Y.this);
            }
        });
        this.f4150v = cVar3;
        m11.p(cVar3);
        this.f4146r = m11;
        Object[] objArr = {m11.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @Override // androidx.camera.core.w
    @NonNull
    protected final b1<?> I(@NonNull androidx.camera.core.impl.H h11, @NonNull b1.a<?, ?, ?> aVar) {
        ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 34);
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 L(@NonNull androidx.camera.core.impl.T t2) {
        this.f4146r.e(t2);
        Object[] objArr = {this.f4146r.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        T0.a g10 = d().g();
        g10.d(t2);
        return g10.a();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 M(@NonNull T0 t02, T0 t03) {
        Y((D0) i(), t02);
        return t02;
    }

    @Override // androidx.camera.core.w
    public final void N() {
        W();
    }

    @Override // androidx.camera.core.w
    public final void Q(@NonNull Rect rect) {
        super.Q(rect);
        androidx.camera.core.impl.I f7 = f();
        N.y yVar = this.f4148t;
        if (f7 == null || yVar == null) {
            return;
        }
        G.q.c(new N.t(yVar, p(f7, z(f7)), c()));
    }

    public final void X(c cVar) {
        G.q.a();
        if (cVar == null) {
            this.f4144p = null;
            C();
            return;
        }
        this.f4144p = cVar;
        this.f4145q = f4143x;
        if (e() != null) {
            Y((D0) i(), d());
            D();
        }
        B();
    }

    @Override // androidx.camera.core.w
    public final b1<?> j(boolean z11, @NonNull c1 c1Var) {
        f4142w.getClass();
        androidx.camera.core.impl.T a11 = c1Var.a(b.a().N(), 1);
        if (z11) {
            a11 = androidx.camera.core.impl.T.O(a11, b.a());
        }
        if (a11 == null) {
            return null;
        }
        return a.d(a11).b();
    }

    @NonNull
    public final String toString() {
        return "Preview:".concat(n());
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final b1.a<?, ?, ?> w(@NonNull androidx.camera.core.impl.T t2) {
        return a.d(t2);
    }
}
