package F0;

import I0.B0;
import K1.Q;
import k1.C7459e;
import k1.C7460f;
import k1.C7461g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class C extends AbstractC7737t implements Function0<C7460f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f8169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(C2990k c2990k) {
        super(0);
        this.f8169b = c2990k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7460f invoke() {
        C7460f c7460f;
        B1.B R11;
        C7460f c7460f2;
        B1.B R12;
        C7460f c7460f3;
        C2990k c2990k = this.f8169b;
        boolean e11 = Q.e(c2990k.f8251a.j().d());
        if (((!e11 || C2990k.m(c2990k) != P.Cursor) && (e11 || C2990k.m(c2990k) != P.Selection)) || c2990k.N() != null || !c2990k.U()) {
            c7460f = C7460f.f70279e;
            return c7460f;
        }
        R11 = c2990k.R();
        C7460f f7 = R11 != null ? B0.f(R11) : null;
        if (f7 == null) {
            c7460f2 = C7460f.f70279e;
            return c7460f2;
        }
        R12 = c2990k.R();
        C7459e a11 = R12 != null ? C7459e.a(R12.y(f7.s())) : null;
        Intrinsics.f(a11);
        C7460f a12 = C7461g.a(a11.n(), f7.p());
        C7460f e12 = C2990k.e(c2990k);
        C7460f c7460f4 = a12.y(e12) ? e12 : null;
        if (c7460f4 != null) {
            return c7460f4.w(a12);
        }
        c7460f3 = C7460f.f70279e;
        return c7460f3;
    }
}
