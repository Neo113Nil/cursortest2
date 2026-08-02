package K1;

import P1.AbstractC3809p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f15005a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z1.d f15006b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z1.s f15007c;

    /* renamed from: d, reason: collision with root package name */
    private final I f15008d;

    public M(@NotNull AbstractC3809p.a aVar, @NotNull Z1.d dVar, @NotNull Z1.s sVar, int i11) {
        this.f15005a = aVar;
        this.f15006b = dVar;
        this.f15007c = sVar;
        this.f15008d = i11 > 0 ? new I(i11) : null;
    }

    public static K a(M m11, String str, T t2, Z1.d dVar, int i11) {
        int i12 = (i11 & 16) != 0 ? Integer.MAX_VALUE : 1;
        long b11 = Z1.c.b(0, 0, 15);
        Z1.s sVar = m11.f15007c;
        Z1.d dVar2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? m11.f15006b : dVar;
        AbstractC3809p.a aVar = m11.f15005a;
        m11.getClass();
        return b(m11, new C3422b(6, str, null), t2, 1, true, i12, b11, sVar, dVar2, aVar, 32);
    }

    public static K b(M m11, C3422b c3422b, T t2, int i11, boolean z11, int i12, long j11, Z1.s sVar, Z1.d dVar, AbstractC3809p.a aVar, int i13) {
        int i14 = (i13 & 4) != 0 ? 1 : i11;
        boolean z12 = (i13 & 8) != 0 ? true : z11;
        int i15 = (i13 & 16) != 0 ? Integer.MAX_VALUE : i12;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        long b11 = (i13 & 64) != 0 ? Z1.c.b(0, 0, 15) : j11;
        Z1.s sVar2 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? m11.f15007c : sVar;
        Z1.d dVar2 = (i13 & 256) != 0 ? m11.f15006b : dVar;
        AbstractC3809p.a aVar2 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? m11.f15005a : aVar;
        m11.getClass();
        int i16 = Integer.MAX_VALUE;
        J j12 = new J(c3422b, t2, k11, i15, z12, i14, dVar2, sVar2, aVar2, b11);
        I i17 = m11.f15008d;
        K a11 = i17 != null ? i17.a(j12) : null;
        if (a11 != null) {
            return a11.a(j12, Z1.c.e(b11, Z1.r.a((int) Math.ceil(a11.v().z()), (int) Math.ceil(a11.v().g()))));
        }
        C3434n c3434n = new C3434n(j12.j(), U.b(j12.i(), j12.d()), j12.g(), j12.b(), j12.c());
        int m12 = Z1.b.m(j12.a());
        int k12 = ((j12.h() || j12.f() == 2) && Z1.b.g(j12.a())) ? Z1.b.k(j12.a()) : Integer.MAX_VALUE;
        int e11 = (j12.h() || j12.f() != 2) ? j12.e() : 1;
        if (m12 != k12) {
            k12 = kotlin.ranges.h.e((int) Math.ceil(c3434n.c()), m12, k12);
        }
        int j13 = Z1.b.j(j12.a());
        int min = Math.min(0, 262142);
        int min2 = k12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(k12, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        if (j13 != Integer.MAX_VALUE) {
            i16 = Math.min(c11, j13);
        }
        K k13 = new K(j12, new C3433m(c3434n, Z1.c.a(min, min2, Math.min(c11, 0), i16), e11, j12.f() == 2, 0), Z1.c.e(j12.a(), Z1.r.a((int) Math.ceil(r6.z()), (int) Math.ceil(r6.g()))));
        if (i17 != null) {
            i17.b(j12, k13);
        }
        return k13;
    }
}
