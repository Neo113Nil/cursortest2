package c1;

import S0.C3942b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5709M extends AbstractC5715f {

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5715f f56204e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56205f;

    /* renamed from: g, reason: collision with root package name */
    private Function1<Object, Unit> f56206g;

    /* renamed from: h, reason: collision with root package name */
    private final long f56207h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5709M(AbstractC5715f abstractC5715f, Function1 function1, boolean z11) {
        super(0, r0);
        C5718i c5718i;
        AtomicReference atomicReference;
        Function1<Object, Unit> h11;
        c5718i = C5718i.f56238e;
        this.f56204e = abstractC5715f;
        this.f56205f = z11;
        if (abstractC5715f == null || (h11 = abstractC5715f.h()) == null) {
            atomicReference = C5721l.f56259j;
            h11 = ((C5710a) atomicReference.get()).h();
        }
        this.f56206g = C5721l.k(function1, h11, false);
        this.f56207h = C3942b.a();
    }

    private final AbstractC5715f A() {
        AtomicReference atomicReference;
        AbstractC5715f abstractC5715f = this.f56204e;
        if (abstractC5715f != null) {
            return abstractC5715f;
        }
        atomicReference = C5721l.f56259j;
        return (AbstractC5715f) atomicReference.get();
    }

    public final long B() {
        return this.f56207h;
    }

    public final void C(Function1<Object, Unit> function1) {
        this.f56206g = function1;
    }

    @Override // c1.AbstractC5715f
    public final void d() {
        AbstractC5715f abstractC5715f;
        t();
        if (!this.f56205f || (abstractC5715f = this.f56204e) == null) {
            return;
        }
        abstractC5715f.d();
    }

    @Override // c1.AbstractC5715f
    public final int f() {
        return A().f();
    }

    @Override // c1.AbstractC5715f
    @NotNull
    public final C5718i g() {
        return A().g();
    }

    @Override // c1.AbstractC5715f
    public final Function1 h() {
        return this.f56206g;
    }

    @Override // c1.AbstractC5715f
    public final boolean i() {
        return A().i();
    }

    @Override // c1.AbstractC5715f
    public final Function1<Object, Unit> k() {
        return null;
    }

    @Override // c1.AbstractC5715f
    public final void m() {
        x.b();
        throw null;
    }

    @Override // c1.AbstractC5715f
    public final void n() {
        x.b();
        throw null;
    }

    @Override // c1.AbstractC5715f
    public final void o() {
        A().o();
    }

    @Override // c1.AbstractC5715f
    public final void p(@NotNull InterfaceC5704H interfaceC5704H) {
        A().p(interfaceC5704H);
    }

    @Override // c1.AbstractC5715f
    @NotNull
    public final AbstractC5715f x(Function1<Object, Unit> function1) {
        return C5721l.d(A().x(null), C5721l.E(function1, this.f56206g));
    }
}
