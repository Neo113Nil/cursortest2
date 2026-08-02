package D1;

import B1.AbstractC2531a;
import B1.m0;
import D1.L;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class V extends B1.m0 implements InterfaceC2790a0, InterfaceC2796d0 {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Function1<B0, Unit> f5377l = a.f5384b;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5378f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5379g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5380h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final m0.a f5381i = B1.n0.a(this);

    /* renamed from: j, reason: collision with root package name */
    private androidx.collection.H<B1.r0> f5382j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.collection.H<B1.r0> f5383k;

    static final class a extends AbstractC7737t implements Function1<B0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5384b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(B0 b02) {
            B0 b03 = b02;
            if (b03.m0()) {
                b03.a().Q0(b03);
            }
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B0 f5385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V f5386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V v11, B0 b02) {
            super(0);
            this.f5385b = b02;
            this.f5386c = v11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<Object, Unit> t2 = this.f5385b.b().t();
            if (t2 != null) {
                V v11 = this.f5386c;
                v11.getClass();
                t2.invoke(new X(v11));
            }
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(B0 b02) {
        V h12;
        z0 f40501c;
        if (this.f5380h || b02.b().t() == null) {
            return;
        }
        androidx.collection.H<B1.r0> h11 = this.f5383k;
        if (h11 == null) {
            h11 = new androidx.collection.H<>();
            this.f5383k = h11;
        }
        androidx.collection.H<B1.r0> h13 = this.f5382j;
        if (h13 == null) {
            h13 = new androidx.collection.H<>();
            this.f5382j = h13;
        }
        h11.f(h13);
        h13.c();
        x0 f02 = B0().f0();
        if (f02 != null && (f40501c = ((AndroidComposeView) f02).getF40501C()) != null) {
            f40501c.f(b02, f5377l, new b(this, b02));
        }
        Object[] objArr = h13.f38635b;
        long[] jArr = h13.f38634a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            B1.r0 r0Var = (B1.r0) objArr[(i11 << 3) + i13];
                            if (!h11.a(r0Var) && (h12 = h1()) != null) {
                                do {
                                    androidx.collection.H<B1.r0> h14 = h12.f5382j;
                                    if (h14 == null || !h14.a(r0Var)) {
                                        h12 = h12.h1();
                                    }
                                } while (h12 != null);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        h11.c();
    }

    protected static void n1(@NotNull AbstractC2810k0 abstractC2810k0) {
        AbstractC2789a s11;
        AbstractC2810k0 f22 = abstractC2810k0.f2();
        if (!Intrinsics.d(f22 != null ? f22.B0() : null, abstractC2810k0.B0())) {
            ((L.b) abstractC2810k0.Y1()).s().l();
            return;
        }
        InterfaceC2791b G11 = ((L.b) abstractC2810k0.Y1()).G();
        if (G11 == null || (s11 = ((L.b) G11).s()) == null) {
            return;
        }
        s11.l();
    }

    public final void A1(boolean z11) {
        this.f5379g = z11;
    }

    @Override // D1.InterfaceC2790a0
    @NotNull
    public abstract H B0();

    @Override // B1.Z
    public final int E(@NotNull AbstractC2531a abstractC2531a) {
        int P02;
        return (e1() && (P02 = P0(abstractC2531a)) != Integer.MIN_VALUE) ? P02 + ((int) (f0() & 4294967295L)) : LinearLayoutManager.INVALID_OFFSET;
    }

    public abstract int P0(@NotNull AbstractC2531a abstractC2531a);

    @Override // B1.InterfaceC2553w
    public boolean R0() {
        return false;
    }

    public final void X0(B1.W w11) {
        Q0(new B0(w11, this));
    }

    public abstract V a1();

    @Override // D1.InterfaceC2796d0
    public final void c0(boolean z11) {
        this.f5378f = z11;
    }

    @NotNull
    public abstract B1.B c1();

    public abstract boolean e1();

    @Override // B1.Y
    @NotNull
    public final B1.W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
        if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
            return new W(i11, i12, map, function1, this);
        }
        A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @NotNull
    public abstract B1.W g1();

    public abstract V h1();

    @NotNull
    public final m0.a i1() {
        return this.f5381i;
    }

    public abstract long l1();

    public final boolean o1() {
        return this.f5378f;
    }

    public final boolean p1() {
        return this.f5380h;
    }

    public final boolean q1() {
        return this.f5379g;
    }

    public abstract void s1();

    public final void w1(boolean z11) {
        this.f5380h = z11;
    }
}
