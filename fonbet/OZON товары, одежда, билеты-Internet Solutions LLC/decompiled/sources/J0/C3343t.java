package J0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3343t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f13400a = new S0.B1(a.f13402b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13401b = 0;

    /* renamed from: J0.t$a */
    static final class a extends AbstractC7737t implements Function0<C3339s> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13402b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C3339s invoke() {
            return C3343t.e();
        }
    }

    public static final long a(@NotNull C3339s c3339s, long j11) {
        long j12;
        if (!C7807Z.p(j11, c3339s.h()) && !C7807Z.p(j11, c3339s.i())) {
            if (!C7807Z.p(j11, c3339s.j()) && !C7807Z.p(j11, c3339s.k())) {
                if (C7807Z.p(j11, c3339s.a())) {
                    return c3339s.c();
                }
                if (C7807Z.p(j11, c3339s.l())) {
                    return c3339s.g();
                }
                if (C7807Z.p(j11, c3339s.b())) {
                    return c3339s.d();
                }
                int i11 = C7807Z.f72260n;
                j12 = C7807Z.f72259m;
                return j12;
            }
            return c3339s.f();
        }
        return c3339s.e();
    }

    public static final long b(long j11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-702395103);
        long a11 = a((C3339s) interfaceC3967k.m(f13400a), j11);
        if (a11 == 16) {
            a11 = ((C7807Z) interfaceC3967k.m(C3363y.a())).w();
        }
        interfaceC3967k.k();
        return a11;
    }

    public static C3339s c() {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long c11 = C7811b0.c(4290479868L);
        long c12 = C7811b0.c(4281794739L);
        long c13 = C7811b0.c(4278442694L);
        long c14 = C7811b0.c(4279374354L);
        long c15 = C7811b0.c(4279374354L);
        long c16 = C7811b0.c(4291782265L);
        j11 = C7807Z.f72248b;
        j12 = C7807Z.f72248b;
        j13 = C7807Z.f72251e;
        j14 = C7807Z.f72251e;
        j15 = C7807Z.f72248b;
        return new C3339s(c11, c12, c13, c13, c14, c15, c16, j11, j12, j13, j14, j15, false);
    }

    @NotNull
    public static final S0.B1 d() {
        return f13400a;
    }

    public static C3339s e() {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long c11 = C7811b0.c(4284612846L);
        long c12 = C7811b0.c(4281794739L);
        long c13 = C7811b0.c(4278442694L);
        long c14 = C7811b0.c(4278290310L);
        j11 = C7807Z.f72251e;
        j12 = C7807Z.f72251e;
        long c15 = C7811b0.c(4289724448L);
        j13 = C7807Z.f72251e;
        j14 = C7807Z.f72248b;
        j15 = C7807Z.f72248b;
        j16 = C7807Z.f72248b;
        j17 = C7807Z.f72251e;
        return new C3339s(c11, c12, c13, c14, j11, j12, c15, j13, j14, j15, j16, j17, true);
    }
}
