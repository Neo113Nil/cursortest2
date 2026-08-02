package B0;

import B0.O0;
import K1.C3422b;
import Q1.C3832a;
import Q1.C3843l;
import Q1.C3845n;
import Q1.InterfaceC3841j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2482j0 extends AbstractC7737t implements Function1<C3422b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1817b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1818c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ O0 f1819d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1.D f1820e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q1.K f1821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2482j0(boolean z11, boolean z12, O0 o02, I1.D d11, Q1.K k11) {
        super(1);
        this.f1817b = z11;
        this.f1818c = z12;
        this.f1819d = o02;
        this.f1820e = d11;
        this.f1821f = k11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C3422b c3422b) {
        C3422b c3422b2 = c3422b;
        if (this.f1817b || !this.f1818c) {
            return Boolean.FALSE;
        }
        O0 o02 = this.f1819d;
        Q1.V g10 = o02.g();
        Unit unit = null;
        if (g10 != null) {
            List<? extends InterfaceC3841j> b02 = C7714v.b0(new C3845n(), new C3832a(c3422b2, 1));
            C3843l n11 = o02.n();
            Function1<Q1.K, Unit> m11 = o02.m();
            Q1.K a11 = n11.a(b02);
            g10.c(null, a11);
            ((O0.b) m11).invoke(a11);
            unit = Unit.f71690a;
        }
        if (unit == null) {
            Q1.K k11 = this.f1821f;
            String f7 = k11.f();
            long e11 = k11.e();
            int i11 = K1.Q.f15010c;
            String obj = kotlin.text.h.a0(f7, (int) (e11 >> 32), (int) (k11.e() & 4294967295L), c3422b2).toString();
            int length = c3422b2.length() + ((int) (k11.e() >> 32));
            ((O0.b) o02.m()).invoke(new Q1.K(4, K1.S.a(length, length), obj));
        }
        return Boolean.TRUE;
    }
}
