package B0;

import B0.O0;
import K1.C3422b;
import Q1.C3832a;
import Q1.C3838g;
import Q1.C3843l;
import Q1.InterfaceC3841j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2479i0 extends AbstractC7737t implements Function1<C3422b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1798b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I1.D f1799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2479i0(O0 o02, I1.D d11) {
        super(1);
        this.f1798b = o02;
        this.f1799c = d11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C3422b c3422b) {
        C3422b c3422b2 = c3422b;
        O0 o02 = this.f1798b;
        Q1.V g10 = o02.g();
        Unit unit = null;
        if (g10 != null) {
            List<? extends InterfaceC3841j> b02 = C7714v.b0(new C3838g(), new C3832a(c3422b2, 1));
            C3843l n11 = o02.n();
            Function1<Q1.K, Unit> m11 = o02.m();
            Q1.K a11 = n11.a(b02);
            g10.c(null, a11);
            ((O0.b) m11).invoke(a11);
            unit = Unit.f71690a;
        }
        if (unit == null) {
            Function1<Q1.K, Unit> m12 = o02.m();
            String h11 = c3422b2.h();
            int length = c3422b2.h().length();
            ((O0.b) m12).invoke(new Q1.K(4, K1.S.a(length, length), h11));
        }
        return Boolean.TRUE;
    }
}
