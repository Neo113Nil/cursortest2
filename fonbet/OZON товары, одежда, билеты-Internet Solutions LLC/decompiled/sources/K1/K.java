package K1;

import java.util.List;
import k1.C7460f;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f14995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3433m f14996b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14997c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14998d;

    /* renamed from: e, reason: collision with root package name */
    private final float f14999e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<C7460f> f15000f;

    public K(J j11, C3433m c3433m, long j12) {
        this.f14995a = j11;
        this.f14996b = c3433m;
        this.f14997c = j12;
        this.f14998d = c3433m.f();
        this.f14999e = c3433m.j();
        this.f15000f = c3433m.x();
    }

    public static int o(K k11, int i11) {
        return k11.f14996b.m(i11, false);
    }

    public final long A() {
        return this.f14997c;
    }

    public final long B(int i11) {
        return this.f14996b.A(i11);
    }

    public final boolean C(int i11) {
        return this.f14996b.B(i11);
    }

    @NotNull
    public final K a(@NotNull J j11, long j12) {
        return new K(j11, this.f14996b, j12);
    }

    @NotNull
    public final V1.g c(int i11) {
        return this.f14996b.b(i11);
    }

    @NotNull
    public final C7460f d(int i11) {
        return this.f14996b.c(i11);
    }

    @NotNull
    public final C7460f e(int i11) {
        return this.f14996b.d(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k11 = (K) obj;
        return Intrinsics.d(this.f14995a, k11.f14995a) && Intrinsics.d(this.f14996b, k11.f14996b) && Z1.q.c(this.f14997c, k11.f14997c) && this.f14998d == k11.f14998d && this.f14999e == k11.f14999e && Intrinsics.d(this.f15000f, k11.f15000f);
    }

    public final boolean f() {
        C3433m c3433m = this.f14996b;
        return c3433m.e() || ((float) ((int) (4294967295L & this.f14997c))) < c3433m.g();
    }

    public final float g() {
        return this.f14998d;
    }

    public final boolean h() {
        return ((float) ((int) (this.f14997c >> 32))) < this.f14996b.z() || f();
    }

    public final int hashCode() {
        return this.f15000f.hashCode() + Pk0.b.a(this.f14999e, Pk0.b.a(this.f14998d, Pk0.c.a((this.f14996b.hashCode() + (this.f14995a.hashCode() * 31)) * 31, 31, this.f14997c), 31), 31);
    }

    public final float i(int i11, boolean z11) {
        return this.f14996b.h(i11, z11);
    }

    public final float j() {
        return this.f14999e;
    }

    @NotNull
    public final J k() {
        return this.f14995a;
    }

    public final float l(int i11) {
        return this.f14996b.k(i11);
    }

    public final int m() {
        return this.f14996b.l();
    }

    public final int n(int i11) {
        return this.f14996b.m(i11, true);
    }

    public final int p(int i11) {
        return this.f14996b.n(i11);
    }

    public final int q(float f7) {
        return this.f14996b.o(f7);
    }

    public final float r(int i11) {
        return this.f14996b.p(i11);
    }

    public final float s(int i11) {
        return this.f14996b.q(i11);
    }

    public final int t(int i11) {
        return this.f14996b.r(i11);
    }

    @NotNull
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f14995a + ", multiParagraph=" + this.f14996b + ", size=" + ((Object) Z1.q.d(this.f14997c)) + ", firstBaseline=" + this.f14998d + ", lastBaseline=" + this.f14999e + ", placeholderRects=" + this.f15000f + ')';
    }

    public final float u(int i11) {
        return this.f14996b.s(i11);
    }

    @NotNull
    public final C3433m v() {
        return this.f14996b;
    }

    public final int w(long j11) {
        return this.f14996b.t(j11);
    }

    @NotNull
    public final V1.g x(int i11) {
        return this.f14996b.u(i11);
    }

    @NotNull
    public final C7786D y(int i11, int i12) {
        return this.f14996b.w(i11, i12);
    }

    @NotNull
    public final List<C7460f> z() {
        return this.f15000f;
    }
}
