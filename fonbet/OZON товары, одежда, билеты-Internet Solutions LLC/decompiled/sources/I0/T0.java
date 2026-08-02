package I0;

import B0.R1;
import Q1.C3832a;
import Q1.InterfaceC3841j;
import java.util.List;
import k1.C7460f;
import k1.C7464j;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T0 extends AbstractC3189j<T0> {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Q1.K f11375h;

    /* renamed from: i, reason: collision with root package name */
    private final R1 f11376i;

    public T0(@NotNull Q1.K k11, @NotNull Q1.D d11, R1 r12, @NotNull i1 i1Var) {
        super(k11.c(), k11.e(), r12 != null ? r12.e() : null, d11, i1Var);
        this.f11375h = k11;
        this.f11376i = r12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int J(R1 r12, int i11) {
        C7460f c7460f;
        B1.B c11 = r12.c();
        if (c11 != null) {
            B1.B b11 = r12.b();
            c7460f = b11 != null ? b11.K(c11, true) : null;
        }
        c7460f = C7460f.f70279e;
        Q1.D i12 = i();
        long e11 = this.f11375h.e();
        int i13 = K1.Q.f15010c;
        C7460f e12 = r12.e().e(i12.originalToTransformed((int) (e11 & 4294967295L)));
        return i().transformedToOriginal(r12.e().w(P9.a.a(e12.n(), (C7464j.d(c7460f.p()) * i11) + e12.q())));
    }

    public final List<InterfaceC3841j> H(@NotNull Function1<? super T0, ? extends InterfaceC3841j> function1) {
        if (!K1.Q.e(l())) {
            return C7714v.b0(new C3832a("", 0), new Q1.J(K1.Q.h(l()), K1.Q.h(l())));
        }
        InterfaceC3841j invoke = function1.invoke(this);
        if (invoke != null) {
            return C7714v.a0(invoke);
        }
        return null;
    }

    @NotNull
    public final Q1.K I() {
        return Q1.K.a(this.f11375h, d(), l(), 4);
    }

    @NotNull
    public final void K() {
        R1 r12;
        if (m().length() <= 0 || (r12 = this.f11376i) == null) {
            return;
        }
        int J11 = J(r12, 1);
        F(J11, J11);
    }

    @NotNull
    public final void L() {
        R1 r12;
        if (m().length() <= 0 || (r12 = this.f11376i) == null) {
            return;
        }
        int J11 = J(r12, -1);
        F(J11, J11);
    }
}
