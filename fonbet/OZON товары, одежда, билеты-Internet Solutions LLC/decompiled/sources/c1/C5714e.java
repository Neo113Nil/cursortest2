package c1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5714e extends AbstractC5715f {

    /* renamed from: e, reason: collision with root package name */
    private final Function1<Object, Unit> f56226e;

    /* renamed from: f, reason: collision with root package name */
    private int f56227f;

    public C5714e(int i11, @NotNull C5718i c5718i, Function1<Object, Unit> function1) {
        super(i11, c5718i);
        this.f56226e = function1;
        this.f56227f = 1;
    }

    @Override // c1.AbstractC5715f
    public final void d() {
        if (e()) {
            return;
        }
        n();
        super.d();
    }

    @Override // c1.AbstractC5715f
    public final Function1 h() {
        return this.f56226e;
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
        this.f56227f++;
    }

    @Override // c1.AbstractC5715f
    public final void n() {
        int i11 = this.f56227f - 1;
        this.f56227f = i11;
        if (i11 == 0) {
            b();
        }
    }

    @Override // c1.AbstractC5715f
    public final void o() {
    }

    @Override // c1.AbstractC5715f
    public final void p(@NotNull InterfaceC5704H interfaceC5704H) {
        int i11 = C5721l.f56262m;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // c1.AbstractC5715f
    @NotNull
    public final AbstractC5715f x(Function1<Object, Unit> function1) {
        C5721l.w(this);
        return new C5713d(f(), g(), C5721l.E(function1, this.f56226e), this);
    }
}
