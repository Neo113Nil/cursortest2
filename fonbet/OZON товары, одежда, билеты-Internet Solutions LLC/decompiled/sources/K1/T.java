package K1;

import P1.AbstractC3809p;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.H0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final T f15012d = new T(0, 0, null, null, 0, 0, 0, null, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f15013a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3440u f15014b;

    /* renamed from: c, reason: collision with root package name */
    private final A f15015c;

    public T(@NotNull D d11, @NotNull C3440u c3440u, A a11) {
        this.f15013a = d11;
        this.f15014b = c3440u;
        this.f15015c = a11;
    }

    public static T F(T t2, long j11, long j12, P1.F f7, P1.A a11, AbstractC3809p abstractC3809p, long j13, V1.i iVar, int i11, long j14, int i12) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i12 & 1) != 0) {
            j24 = C7807Z.f72259m;
            j15 = j24;
        } else {
            j15 = j11;
        }
        if ((i12 & 2) != 0) {
            j23 = Z1.u.f35334c;
            j16 = j23;
        } else {
            j16 = j12;
        }
        P1.F f11 = (i12 & 4) != 0 ? null : f7;
        P1.A a12 = (i12 & 8) != 0 ? null : a11;
        AbstractC3809p abstractC3809p2 = (i12 & 32) != 0 ? null : abstractC3809p;
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            j22 = Z1.u.f35334c;
            j17 = j22;
        } else {
            j17 = j13;
        }
        j18 = C7807Z.f72259m;
        V1.i iVar2 = (i12 & 4096) != 0 ? null : iVar;
        int i13 = (32768 & i12) != 0 ? LinearLayoutManager.INVALID_OFFSET : i11;
        if ((i12 & 131072) != 0) {
            j21 = Z1.u.f35334c;
            j19 = j21;
        } else {
            j19 = j14;
        }
        D b11 = E.b(t2.f15013a, j15, null, Float.NaN, j16, f11, a12, null, abstractC3809p2, null, j17, null, null, null, j18, iVar2, null, null, null);
        C3440u a13 = C3441v.a(t2.f15014b, i13, LinearLayoutManager.INVALID_OFFSET, j19, null, null, null, 0, LinearLayoutManager.INVALID_OFFSET, null);
        return (t2.f15013a == b11 && t2.f15014b == a13) ? t2 : new T(b11, a13);
    }

    public static T b(T t2, AbstractC7799Q abstractC7799Q) {
        float b11 = t2.f15013a.b();
        long j11 = t2.f15013a.j();
        P1.F m11 = t2.f15013a.m();
        P1.A k11 = t2.f15013a.k();
        P1.B l11 = t2.f15013a.l();
        AbstractC3809p h11 = t2.f15013a.h();
        String i11 = t2.f15013a.i();
        long n11 = t2.f15013a.n();
        V1.a d11 = t2.f15013a.d();
        V1.m t11 = t2.f15013a.t();
        R1.c o11 = t2.f15013a.o();
        long c11 = t2.f15013a.c();
        V1.i r11 = t2.f15013a.r();
        H0 q11 = t2.f15013a.q();
        AbstractC8413f g10 = t2.f15013a.g();
        int g11 = t2.f15014b.g();
        int h12 = t2.f15014b.h();
        long d12 = t2.f15014b.d();
        V1.o i12 = t2.f15014b.i();
        A a11 = t2.f15015c;
        V1.f e11 = t2.f15014b.e();
        int c12 = t2.f15014b.c();
        int b12 = t2.f15014b.b();
        V1.q j12 = t2.f15014b.j();
        t2.getClass();
        D d13 = new D(abstractC7799Q, b11, j11, m11, k11, l11, h11, i11, n11, d11, t11, o11, c11, r11, q11, a11 != null ? a11.b() : null, g10);
        y yVar = null;
        if (a11 != null) {
            yVar = a11.a();
        }
        return new T(d13, new C3440u(g11, h12, d12, i12, yVar, e11, c12, b12, j12), a11);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static K1.T c(K1.T r33, long r34, long r36, P1.F r38, P1.S r39, java.lang.String r40, long r41, V1.i r43, n1.C8416i r44, long r45, K1.A r47, V1.f r48, int r49) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.T.c(K1.T, long, long, P1.F, P1.S, java.lang.String, long, V1.i, n1.i, long, K1.A, V1.f, int):K1.T");
    }

    public final boolean A(@NotNull T t2) {
        return this == t2 || this.f15013a.v(t2.f15013a);
    }

    public final boolean B(@NotNull T t2) {
        if (this != t2) {
            return Intrinsics.d(this.f15014b, t2.f15014b) && this.f15013a.u(t2.f15013a);
        }
        return true;
    }

    public final int C() {
        int hashCode = (this.f15014b.hashCode() + (this.f15013a.w() * 31)) * 31;
        A a11 = this.f15015c;
        return hashCode + (a11 != null ? a11.hashCode() : 0);
    }

    @NotNull
    public final T D(@NotNull C3440u c3440u) {
        return new T(this.f15013a, this.f15014b.k(c3440u));
    }

    @NotNull
    public final T E(T t2) {
        return (t2 == null || t2.equals(f15012d)) ? this : new T(this.f15013a.x(t2.f15013a), this.f15014b.k(t2.f15014b));
    }

    @NotNull
    public final C3440u G() {
        return this.f15014b;
    }

    @NotNull
    public final D H() {
        return this.f15013a;
    }

    public final float d() {
        return this.f15013a.b();
    }

    public final AbstractC7799Q e() {
        return this.f15013a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        return Intrinsics.d(this.f15013a, t2.f15013a) && Intrinsics.d(this.f15014b, t2.f15014b) && Intrinsics.d(this.f15015c, t2.f15015c);
    }

    public final long f() {
        return this.f15013a.f();
    }

    public final AbstractC8413f g() {
        return this.f15013a.g();
    }

    public final AbstractC3809p h() {
        return this.f15013a.h();
    }

    public final int hashCode() {
        int hashCode = (this.f15014b.hashCode() + (this.f15013a.hashCode() * 31)) * 31;
        A a11 = this.f15015c;
        return hashCode + (a11 != null ? a11.hashCode() : 0);
    }

    public final long i() {
        return this.f15013a.j();
    }

    public final P1.A j() {
        return this.f15013a.k();
    }

    public final P1.B k() {
        return this.f15013a.l();
    }

    public final P1.F l() {
        return this.f15013a.m();
    }

    public final long m() {
        return this.f15013a.n();
    }

    public final int n() {
        return this.f15014b.c();
    }

    public final long o() {
        return this.f15014b.d();
    }

    public final V1.f p() {
        return this.f15014b.e();
    }

    public final R1.c q() {
        return this.f15013a.o();
    }

    @NotNull
    public final C3440u r() {
        return this.f15014b;
    }

    public final A s() {
        return this.f15015c;
    }

    public final H0 t() {
        return this.f15013a.q();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        D d11 = this.f15013a;
        sb2.append((Object) C7807Z.v(d11.f()));
        sb2.append(", brush=");
        sb2.append(d11.e());
        sb2.append(", alpha=");
        sb2.append(d11.b());
        sb2.append(", fontSize=");
        sb2.append((Object) Z1.u.f(d11.j()));
        sb2.append(", fontWeight=");
        sb2.append(d11.m());
        sb2.append(", fontStyle=");
        sb2.append(d11.k());
        sb2.append(", fontSynthesis=");
        sb2.append(d11.l());
        sb2.append(", fontFamily=");
        sb2.append(d11.h());
        sb2.append(", fontFeatureSettings=");
        sb2.append(d11.i());
        sb2.append(", letterSpacing=");
        sb2.append((Object) Z1.u.f(d11.n()));
        sb2.append(", baselineShift=");
        sb2.append(d11.d());
        sb2.append(", textGeometricTransform=");
        sb2.append(d11.t());
        sb2.append(", localeList=");
        sb2.append(d11.o());
        sb2.append(", background=");
        sb2.append((Object) C7807Z.v(d11.c()));
        sb2.append(", textDecoration=");
        sb2.append(d11.r());
        sb2.append(", shadow=");
        sb2.append(d11.q());
        sb2.append(", drawStyle=");
        sb2.append(d11.g());
        sb2.append(", textAlign=");
        C3440u c3440u = this.f15014b;
        sb2.append((Object) V1.h.b(c3440u.g()));
        sb2.append(", textDirection=");
        sb2.append((Object) V1.j.b(c3440u.h()));
        sb2.append(", lineHeight=");
        sb2.append((Object) Z1.u.f(c3440u.d()));
        sb2.append(", textIndent=");
        sb2.append(c3440u.i());
        sb2.append(", platformStyle=");
        sb2.append(this.f15015c);
        sb2.append(", lineHeightStyle=");
        sb2.append(c3440u.e());
        sb2.append(", lineBreak=");
        sb2.append((Object) V1.e.d(c3440u.c()));
        sb2.append(", hyphens=");
        sb2.append((Object) V1.d.b(c3440u.b()));
        sb2.append(", textMotion=");
        sb2.append(c3440u.j());
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public final D u() {
        return this.f15013a;
    }

    public final int v() {
        return this.f15014b.g();
    }

    public final V1.i w() {
        return this.f15013a.r();
    }

    public final int x() {
        return this.f15014b.h();
    }

    public final V1.o y() {
        return this.f15014b.i();
    }

    public final V1.q z() {
        return this.f15014b.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T(@NotNull D d11, @NotNull C3440u c3440u) {
        this(d11, c3440u, (r0 == null && r1 == null) ? null : new A(r0, r1));
        z p11 = d11.p();
        y f7 = c3440u.f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T(long j11, long j12, P1.F f7, AbstractC3809p abstractC3809p, long j13, int i11, long j14, V1.f fVar, int i12, int i13) {
        this(new D(r4, r6, r8, (P1.A) null, (P1.B) null, r11, r12, r13, (V1.a) null, (V1.m) null, (R1.c) null, r18, (V1.i) null, (H0) null, (z) null), new C3440u(r1, LinearLayoutManager.INVALID_OFFSET, r23, null, null, (1048576 & i13) != 0 ? null : fVar, (2097152 & i13) != 0 ? 0 : i12, (i13 & 4194304) == 0 ? 1 : r2, null), null);
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i13 & 1) != 0) {
            j24 = C7807Z.f72259m;
            j15 = j24;
        } else {
            j15 = j11;
        }
        if ((i13 & 2) != 0) {
            j23 = Z1.u.f35334c;
            j16 = j23;
        } else {
            j16 = j12;
        }
        P1.F f11 = (i13 & 4) != 0 ? null : f7;
        AbstractC3809p abstractC3809p2 = (i13 & 32) != 0 ? null : abstractC3809p;
        String str = (i13 & 64) != 0 ? null : "tnum";
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            j22 = Z1.u.f35334c;
            j17 = j22;
        } else {
            j17 = j13;
        }
        j18 = C7807Z.f72259m;
        int i14 = 32768 & i13;
        int i15 = LinearLayoutManager.INVALID_OFFSET;
        int i16 = i14 != 0 ? Integer.MIN_VALUE : i11;
        if ((131072 & i13) != 0) {
            j21 = Z1.u.f35334c;
            j19 = j21;
        } else {
            j19 = j14;
        }
    }
}
