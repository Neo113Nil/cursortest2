package c1;

import S0.C3942b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5708L extends C5711b {

    /* renamed from: o, reason: collision with root package name */
    private final C5711b f56198o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f56199p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f56200q;

    /* renamed from: r, reason: collision with root package name */
    private Function1<Object, Unit> f56201r;

    /* renamed from: s, reason: collision with root package name */
    private Function1<Object, Unit> f56202s;

    /* renamed from: t, reason: collision with root package name */
    private final long f56203t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5708L(C5711b c5711b, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z11, boolean z12) {
        super(0, r0, r4, C5721l.l(function12, r1));
        C5718i c5718i;
        AtomicReference atomicReference;
        Function1<Object, Unit> h11;
        AtomicReference atomicReference2;
        Function1<Object, Unit> k11;
        c5718i = C5718i.f56238e;
        if (c5711b == null || (h11 = c5711b.h()) == null) {
            atomicReference = C5721l.f56259j;
            h11 = ((C5710a) atomicReference.get()).h();
        }
        Function1 k12 = C5721l.k(function1, h11, z11);
        if (c5711b == null || (k11 = c5711b.k()) == null) {
            atomicReference2 = C5721l.f56259j;
            k11 = ((C5710a) atomicReference2.get()).k();
        }
        this.f56198o = c5711b;
        this.f56199p = z11;
        this.f56200q = z12;
        this.f56201r = super.h();
        this.f56202s = super.k();
        this.f56203t = C3942b.a();
    }

    private final C5711b P() {
        AtomicReference atomicReference;
        C5711b c5711b = this.f56198o;
        if (c5711b != null) {
            return c5711b;
        }
        atomicReference = C5721l.f56259j;
        return (C5711b) atomicReference.get();
    }

    @Override // c1.C5711b
    @NotNull
    public final AbstractC5716g B() {
        return P().B();
    }

    @Override // c1.C5711b
    public final androidx.collection.M<InterfaceC5704H> D() {
        return P().D();
    }

    @Override // c1.C5711b
    /* renamed from: G */
    public final Function1<Object, Unit> h() {
        return this.f56201r;
    }

    @Override // c1.C5711b
    public final void N(androidx.collection.M<InterfaceC5704H> m11) {
        x.b();
        throw null;
    }

    @Override // c1.C5711b
    @NotNull
    public final C5711b O(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Function1<Object, Unit> E11 = C5721l.E(function1, this.f56201r);
        Function1<Object, Unit> l11 = C5721l.l(function12, this.f56202s);
        return !this.f56199p ? new C5708L(P().O(null, l11), E11, l11, false, true) : P().O(E11, l11);
    }

    public final long Q() {
        return this.f56203t;
    }

    public final void R(Function1<Object, Unit> function1) {
        this.f56201r = function1;
    }

    public final void S(Function1<Object, Unit> function1) {
        this.f56202s = function1;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void d() {
        C5711b c5711b;
        t();
        if (!this.f56200q || (c5711b = this.f56198o) == null) {
            return;
        }
        c5711b.d();
    }

    @Override // c1.AbstractC5715f
    public final int f() {
        return P().f();
    }

    @Override // c1.AbstractC5715f
    @NotNull
    public final C5718i g() {
        return P().g();
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final Function1 h() {
        return this.f56201r;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final boolean i() {
        return P().i();
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final int j() {
        return P().j();
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final Function1<Object, Unit> k() {
        return this.f56202s;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void m() {
        x.b();
        throw null;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void n() {
        x.b();
        throw null;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void o() {
        P().o();
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void p(@NotNull InterfaceC5704H interfaceC5704H) {
        P().p(interfaceC5704H);
    }

    @Override // c1.AbstractC5715f
    public final void u(int i11) {
        x.b();
        throw null;
    }

    @Override // c1.AbstractC5715f
    public final void v(@NotNull C5718i c5718i) {
        x.b();
        throw null;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void w(int i11) {
        P().w(i11);
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    @NotNull
    public final AbstractC5715f x(Function1<Object, Unit> function1) {
        Function1<Object, Unit> E11 = C5721l.E(function1, this.f56201r);
        return !this.f56199p ? C5721l.d(P().x(null), E11) : P().x(E11);
    }
}
