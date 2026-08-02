package c1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5713d extends AbstractC5715f {

    /* renamed from: e, reason: collision with root package name */
    private final Function1<Object, Unit> f56224e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC5715f f56225f;

    public C5713d(int i11, @NotNull C5718i c5718i, Function1<Object, Unit> function1, @NotNull AbstractC5715f abstractC5715f) {
        super(i11, c5718i);
        this.f56224e = function1;
        this.f56225f = abstractC5715f;
        abstractC5715f.m();
    }

    @Override // c1.AbstractC5715f
    public final void d() {
        if (e()) {
            return;
        }
        int f7 = f();
        AbstractC5715f abstractC5715f = this.f56225f;
        if (f7 != abstractC5715f.f()) {
            b();
        }
        abstractC5715f.n();
        super.d();
    }

    @Override // c1.AbstractC5715f
    public final Function1 h() {
        return this.f56224e;
    }

    @Override // c1.AbstractC5715f
    public final boolean i() {
        return true;
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
    }

    @Override // c1.AbstractC5715f
    public final void p(InterfaceC5704H interfaceC5704H) {
        int i11 = C5721l.f56262m;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // c1.AbstractC5715f
    public final AbstractC5715f x(Function1 function1) {
        return new C5713d(f(), g(), C5721l.E(function1, this.f56224e), this.f56225f);
    }
}
