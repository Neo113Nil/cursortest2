package D1;

import B1.AbstractC2531a;
import D1.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class Y extends V implements B1.U {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final AbstractC2810k0 f5393m;

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashMap f5395o;

    /* renamed from: q, reason: collision with root package name */
    private B1.W f5397q;

    /* renamed from: n, reason: collision with root package name */
    private long f5394n = 0;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final B1.S f5396p = new B1.S(this);

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f5398r = new LinkedHashMap();

    public Y(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f5393m = abstractC2810k0;
    }

    public static final void B1(Y y11, B1.W w11) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (w11 != null) {
            y11.E0(Z1.r.a(w11.getWidth(), w11.getHeight()));
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            y11.E0(0L);
        }
        if (!Intrinsics.d(y11.f5397q, w11) && w11 != null && ((((linkedHashMap = y11.f5395o) != null && !linkedHashMap.isEmpty()) || !w11.s().isEmpty()) && !Intrinsics.d(w11.s(), y11.f5395o))) {
            ((L.a) y11.C1()).s().l();
            LinkedHashMap linkedHashMap2 = y11.f5395o;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                y11.f5395o = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(w11.s());
        }
        y11.f5397q = w11;
    }

    private final void L1(long j11) {
        if (!Z1.m.c(this.f5394n, j11)) {
            this.f5394n = j11;
            AbstractC2810k0 abstractC2810k0 = this.f5393m;
            L.a H11 = abstractC2810k0.B0().N().H();
            if (H11 != null) {
                H11.n1();
            }
            V.n1(abstractC2810k0);
        }
        if (p1()) {
            return;
        }
        X0(g1());
    }

    @Override // D1.V, D1.InterfaceC2790a0
    @NotNull
    public final H B0() {
        return this.f5393m.B0();
    }

    @NotNull
    public final InterfaceC2791b C1() {
        L.a C11 = this.f5393m.B0().N().C();
        Intrinsics.f(C11);
        return C11;
    }

    public final int D1(@NotNull AbstractC2531a abstractC2531a) {
        Integer num = (Integer) this.f5398r.get(abstractC2531a);
        return num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
    }

    @NotNull
    protected final LinkedHashMap F1() {
        return this.f5398r;
    }

    @NotNull
    public final AbstractC2810k0 G1() {
        return this.f5393m;
    }

    @NotNull
    public final B1.S I1() {
        return this.f5396p;
    }

    public final long J1() {
        return Z1.r.a(u0(), l0());
    }

    protected void K1() {
        g1().u();
    }

    public final void M1(long j11) {
        L1(Z1.m.e(j11, f0()));
    }

    public final long N1(@NotNull Y y11, boolean z11) {
        long j11 = 0;
        Y y12 = this;
        while (!y12.equals(y11)) {
            if (!y12.o1() || !z11) {
                j11 = Z1.m.e(j11, y12.f5394n);
            }
            AbstractC2810k0 g22 = y12.f5393m.g2();
            Intrinsics.f(g22);
            y12 = g22.c2();
            Intrinsics.f(y12);
        }
        return j11;
    }

    @Override // D1.V, B1.InterfaceC2553w
    public final boolean R0() {
        return true;
    }

    @Override // D1.V
    public final V a1() {
        AbstractC2810k0 f22 = this.f5393m.f2();
        if (f22 != null) {
            return f22.c2();
        }
        return null;
    }

    @Override // D1.V
    @NotNull
    public final B1.B c1() {
        return this.f5396p;
    }

    @Override // D1.V
    public final boolean e1() {
        return this.f5397q != null;
    }

    @Override // Z1.d
    public final float g() {
        return this.f5393m.g();
    }

    @Override // D1.V
    @NotNull
    public final B1.W g1() {
        B1.W w11 = this.f5397q;
        if (w11 != null) {
            return w11;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f5393m.getLayoutDirection();
    }

    @Override // D1.V
    public final V h1() {
        AbstractC2810k0 g22 = this.f5393m.g2();
        if (g22 != null) {
            return g22.c2();
        }
        return null;
    }

    @Override // D1.V
    public final long l1() {
        return this.f5394n;
    }

    @Override // B1.Z, B1.InterfaceC2552v
    public final Object m() {
        return this.f5393m.m();
    }

    @Override // D1.V
    public final void s1() {
        x0(this.f5394n, 0.0f, null);
    }

    @Override // Z1.k
    public final float u1() {
        return this.f5393m.u1();
    }

    @Override // B1.m0
    protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
        L1(j11);
        if (q1()) {
            return;
        }
        K1();
    }
}
