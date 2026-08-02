package D1;

import B1.AbstractC2531a;
import B1.C2543l;
import B1.InterfaceC2541j;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.C7785C;
import l1.C7807Z;
import l1.InterfaceC7802U;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F extends AbstractC2810k0 {

    /* renamed from: Y, reason: collision with root package name */
    @NotNull
    private static final C7784B f5223Y;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private E f5224Q;

    /* renamed from: R, reason: collision with root package name */
    private Z1.b f5225R;

    /* renamed from: S, reason: collision with root package name */
    private Y f5226S;

    /* renamed from: X, reason: collision with root package name */
    private C2543l f5227X;

    /* loaded from: classes8.dex */
    private final class a extends Y {
        public a() {
            super(F.this);
        }

        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            F f7 = F.this;
            E Q22 = f7.Q2();
            Y c22 = f7.R2().c2();
            Intrinsics.f(c22);
            return Q22.I(this, c22, i11);
        }

        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            F f7 = F.this;
            E Q22 = f7.Q2();
            Y c22 = f7.R2().c2();
            Intrinsics.f(c22);
            return Q22.K(this, c22, i11);
        }

        @Override // D1.V
        public final int P0(@NotNull AbstractC2531a abstractC2531a) {
            int a11 = Ae0.c.a(this, abstractC2531a);
            F1().put(abstractC2531a, Integer.valueOf(a11));
            return a11;
        }

        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            F f7 = F.this;
            E Q22 = f7.Q2();
            Y c22 = f7.R2().c2();
            Intrinsics.f(c22);
            return Q22.A(this, c22, i11);
        }

        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            F f7 = F.this;
            E Q22 = f7.Q2();
            Y c22 = f7.R2().c2();
            Intrinsics.f(c22);
            return Q22.u(this, c22, i11);
        }

        @Override // B1.U
        @NotNull
        public final B1.m0 a0(long j11) {
            G0(j11);
            Z1.b a11 = Z1.b.a(j11);
            F f7 = F.this;
            f7.U2(a11);
            E Q22 = f7.Q2();
            Y c22 = f7.R2().c2();
            Intrinsics.f(c22);
            Y.B1(this, Q22.D(this, c22, j11));
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public static final class b implements B1.W {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ B1.W f5229a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5230b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5231c;

        b(B1.W w11, F f7) {
            this.f5229a = w11;
            Y c22 = f7.c2();
            Intrinsics.f(c22);
            this.f5230b = c22.u0();
            Y c23 = f7.c2();
            Intrinsics.f(c23);
            this.f5231c = c23.l0();
        }

        @Override // B1.W
        public final int getHeight() {
            return this.f5231c;
        }

        @Override // B1.W
        public final int getWidth() {
            return this.f5230b;
        }

        @Override // B1.W
        @NotNull
        public final Map<AbstractC2531a, Integer> s() {
            return this.f5229a.s();
        }

        @Override // B1.W
        public final Function1<Object, Unit> t() {
            return this.f5229a.t();
        }

        @Override // B1.W
        public final void u() {
            this.f5229a.u();
        }
    }

    static {
        long j11;
        C7784B a11 = C7785C.a();
        j11 = C7807Z.f72254h;
        a11.b(j11);
        a11.u(1.0f);
        a11.v(1);
        f5223Y = a11;
    }

    public F(@NotNull H h11, @NotNull E e11) {
        super(h11);
        this.f5224Q = e11;
        this.f5226S = h11.U() != null ? new a() : null;
        this.f5227X = (e11.getNode().getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new C2543l(this, (InterfaceC2541j) e11) : null;
    }

    private final void S2() {
        boolean z11;
        if (q1()) {
            return;
        }
        t2();
        C2543l c2543l = this.f5227X;
        if (c2543l != null) {
            InterfaceC2541j s11 = c2543l.s();
            Intrinsics.f(this.f5226S);
            s11.getClass();
            if (!c2543l.m()) {
                long q02 = q0();
                Y y11 = this.f5226S;
                if (Z1.q.b(q02, y11 != null ? Z1.q.a(y11.J1()) : null)) {
                    long q03 = R2().q0();
                    Y c22 = R2().c2();
                    if (Z1.q.b(q03, c22 != null ? Z1.q.a(c22.J1()) : null)) {
                        z11 = true;
                        R2().B2(z11);
                    }
                }
            }
            z11 = false;
            R2().B2(z11);
        }
        g1().u();
        R2().B2(false);
    }

    @Override // B1.InterfaceC2552v
    public final int D(int i11) {
        C2543l c2543l = this.f5227X;
        return c2543l != null ? c2543l.s().T(c2543l, R2(), i11) : this.f5224Q.I(this, R2(), i11);
    }

    @Override // B1.InterfaceC2552v
    public final int O(int i11) {
        C2543l c2543l = this.f5227X;
        return c2543l != null ? c2543l.s().s0(c2543l, R2(), i11) : this.f5224Q.K(this, R2(), i11);
    }

    @Override // D1.V
    public final int P0(@NotNull AbstractC2531a abstractC2531a) {
        Y y11 = this.f5226S;
        return y11 != null ? y11.D1(abstractC2531a) : Ae0.c.a(this, abstractC2531a);
    }

    @NotNull
    public final E Q2() {
        return this.f5224Q;
    }

    @NotNull
    public final AbstractC2810k0 R2() {
        AbstractC2810k0 f22 = f2();
        Intrinsics.f(f22);
        return f22;
    }

    @Override // B1.InterfaceC2552v
    public final int T(int i11) {
        C2543l c2543l = this.f5227X;
        return c2543l != null ? c2543l.s().G0(c2543l, R2(), i11) : this.f5224Q.A(this, R2(), i11);
    }

    public final void T2(@NotNull E e11) {
        if (!e11.equals(this.f5224Q)) {
            if ((e11.getNode().getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                InterfaceC2541j interfaceC2541j = (InterfaceC2541j) e11;
                C2543l c2543l = this.f5227X;
                if (c2543l != null) {
                    c2543l.w(interfaceC2541j);
                } else {
                    c2543l = new C2543l(this, interfaceC2541j);
                }
                this.f5227X = c2543l;
            } else {
                this.f5227X = null;
            }
        }
        this.f5224Q = e11;
    }

    public final void U2(Z1.b bVar) {
        this.f5225R = bVar;
    }

    @Override // D1.AbstractC2810k0
    public final void V1() {
        if (this.f5226S == null) {
            this.f5226S = new a();
        }
    }

    @Override // B1.InterfaceC2552v
    public final int Y(int i11) {
        C2543l c2543l = this.f5227X;
        return c2543l != null ? c2543l.s().n0(c2543l, R2(), i11) : this.f5224Q.u(this, R2(), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r8 == r1.l0()) goto L27;
     */
    @Override // B1.U
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.m0 a0(long j11) {
        B1.W D11;
        if (Z1()) {
            Z1.b bVar = this.f5225R;
            if (bVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j11 = bVar.p();
        }
        G0(j11);
        C2543l c2543l = this.f5227X;
        if (c2543l != null) {
            InterfaceC2541j s11 = c2543l.s();
            c2543l.u();
            boolean z11 = true;
            c2543l.v(s11.l1() || !Z1.b.d(j11, this.f5225R));
            if (!c2543l.m()) {
                R2().A2(true);
            }
            R2();
            D11 = s11.P0();
            R2().A2(false);
            int width = D11.getWidth();
            Y y11 = this.f5226S;
            Intrinsics.f(y11);
            if (width == y11.u0()) {
                int height = D11.getHeight();
                Y y12 = this.f5226S;
                Intrinsics.f(y12);
            }
            z11 = false;
            if (!c2543l.m()) {
                long q02 = R2().q0();
                Y c22 = R2().c2();
                if (Z1.q.b(q02, c22 != null ? Z1.q.a(c22.J1()) : null) && !z11) {
                    D11 = new b(D11, this);
                }
            }
        } else {
            D11 = this.f5224Q.D(this, R2(), j11);
        }
        C2(D11);
        s2();
        return this;
    }

    @Override // D1.AbstractC2810k0
    public final Y c2() {
        return this.f5226S;
    }

    @Override // D1.AbstractC2810k0
    @NotNull
    public final e.c e2() {
        return this.f5224Q.getNode();
    }

    @Override // D1.AbstractC2810k0
    public final void v2(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        R2().S1(interfaceC7802U, dVar);
        if (((AndroidComposeView) K.b(B0())).getF40503D()) {
            T1(interfaceC7802U, f5223Y);
        }
    }

    @Override // D1.AbstractC2810k0, B1.m0
    protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
        super.x0(j11, f7, function1);
        S2();
    }

    @Override // D1.AbstractC2810k0, B1.m0
    protected final void y0(long j11, float f7, @NotNull o1.d dVar) {
        super.y0(j11, f7, dVar);
        S2();
    }
}
