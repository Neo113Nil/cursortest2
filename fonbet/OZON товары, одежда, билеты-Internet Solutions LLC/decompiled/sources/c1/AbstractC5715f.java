package c1;

import S0.B0;
import S0.C3942b;
import S0.v1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5715f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C5718i f56228a;

    /* renamed from: b, reason: collision with root package name */
    private int f56229b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56230c;

    /* renamed from: d, reason: collision with root package name */
    private int f56231d;

    /* renamed from: c1.f$a */
    public static final class a {
        public static AbstractC5715f a() {
            v1 v1Var;
            v1Var = C5721l.f56251b;
            return (AbstractC5715f) v1Var.a();
        }

        @NotNull
        public static AbstractC5715f b(AbstractC5715f abstractC5715f) {
            AbstractC5715f c5708l;
            if (abstractC5715f instanceof C5708L) {
                C5708L c5708l2 = (C5708L) abstractC5715f;
                if (c5708l2.Q() == C3942b.a()) {
                    c5708l2.R(null);
                    return abstractC5715f;
                }
            }
            if (abstractC5715f instanceof C5709M) {
                C5709M c5709m = (C5709M) abstractC5715f;
                if (c5709m.B() == C3942b.a()) {
                    c5709m.C(null);
                    return abstractC5715f;
                }
            }
            int i11 = C5721l.f56262m;
            boolean z11 = abstractC5715f instanceof C5711b;
            if (z11 || abstractC5715f == null) {
                c5708l = new C5708L(z11 ? (C5711b) abstractC5715f : null, null, null, false, false);
            } else {
                c5708l = new C5709M(abstractC5715f, null, false);
            }
            c5708l.l();
            return c5708l;
        }

        public static Object c(@NotNull Function0 function0, Function1 function1) {
            v1 v1Var;
            AbstractC5715f c5708l;
            if (function1 == null) {
                return function0.invoke();
            }
            v1Var = C5721l.f56251b;
            AbstractC5715f abstractC5715f = (AbstractC5715f) v1Var.a();
            if (abstractC5715f instanceof C5708L) {
                C5708L c5708l2 = (C5708L) abstractC5715f;
                if (c5708l2.Q() == C3942b.a()) {
                    Function1<Object, Unit> h11 = c5708l2.h();
                    Function1<Object, Unit> k11 = c5708l2.k();
                    try {
                        ((C5708L) abstractC5715f).R(C5721l.E(function1, h11));
                        ((C5708L) abstractC5715f).S(k11);
                        return function0.invoke();
                    } finally {
                        c5708l2.R(h11);
                        c5708l2.S(k11);
                    }
                }
            }
            if (abstractC5715f == null || (abstractC5715f instanceof C5711b)) {
                c5708l = new C5708L(abstractC5715f instanceof C5711b ? (C5711b) abstractC5715f : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                c5708l = abstractC5715f.x(function1);
            }
            try {
                AbstractC5715f l11 = c5708l.l();
                try {
                    Object invoke = function0.invoke();
                    AbstractC5715f.s(l11);
                    return invoke;
                } catch (Throwable th2) {
                    AbstractC5715f.s(l11);
                    throw th2;
                }
            } finally {
                c5708l.d();
            }
        }

        public static void d(AbstractC5715f abstractC5715f, @NotNull AbstractC5715f abstractC5715f2, Function1 function1) {
            if (abstractC5715f != abstractC5715f2) {
                abstractC5715f2.getClass();
                AbstractC5715f.s(abstractC5715f);
                abstractC5715f2.d();
            } else if (abstractC5715f instanceof C5708L) {
                ((C5708L) abstractC5715f).R(function1);
            } else if (abstractC5715f instanceof C5709M) {
                ((C5709M) abstractC5715f).C(function1);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC5715f).toString());
            }
        }
    }

    public AbstractC5715f(int i11, C5718i c5718i) {
        this.f56228a = c5718i;
        this.f56229b = i11;
        this.f56231d = i11 != 0 ? C5721l.P(i11, g()) : -1;
    }

    public static void s(AbstractC5715f abstractC5715f) {
        v1 v1Var;
        v1Var = C5721l.f56251b;
        v1Var.b(abstractC5715f);
    }

    public final void b() {
        synchronized (C5721l.D()) {
            c();
            r();
            Unit unit = Unit.f71690a;
        }
    }

    public void c() {
        C5718i c5718i;
        c5718i = C5721l.f56253d;
        C5721l.f56253d = c5718i.l(f());
    }

    public void d() {
        this.f56230c = true;
        synchronized (C5721l.D()) {
            q();
            Unit unit = Unit.f71690a;
        }
    }

    public final boolean e() {
        return this.f56230c;
    }

    public int f() {
        return this.f56229b;
    }

    @NotNull
    public C5718i g() {
        return this.f56228a;
    }

    public abstract Function1<Object, Unit> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract Function1<Object, Unit> k();

    public final AbstractC5715f l() {
        v1 v1Var;
        v1 v1Var2;
        v1Var = C5721l.f56251b;
        AbstractC5715f abstractC5715f = (AbstractC5715f) v1Var.a();
        v1Var2 = C5721l.f56251b;
        v1Var2.b(this);
        return abstractC5715f;
    }

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p(@NotNull InterfaceC5704H interfaceC5704H);

    public final void q() {
        int i11 = this.f56231d;
        if (i11 >= 0) {
            C5721l.N(i11);
            this.f56231d = -1;
        }
    }

    public void r() {
        q();
    }

    public final void t() {
        this.f56230c = true;
    }

    public void u(int i11) {
        this.f56229b = i11;
    }

    public void v(@NotNull C5718i c5718i) {
        this.f56228a = c5718i;
    }

    public void w(int i11) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @NotNull
    public abstract AbstractC5715f x(Function1<Object, Unit> function1);

    public final int y() {
        int i11 = this.f56231d;
        this.f56231d = -1;
        return i11;
    }

    public final void z() {
        if (this.f56230c) {
            B0.a("Cannot use a disposed snapshot");
            throw null;
        }
    }
}
