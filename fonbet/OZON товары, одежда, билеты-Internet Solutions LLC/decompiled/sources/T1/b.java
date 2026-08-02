package T1;

import K1.D;
import N1.m;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import android.graphics.Typeface;
import android.text.Spannable;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class b extends AbstractC7737t implements InterfaceC6511n<D, Integer, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Spannable f26505b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6512o<AbstractC3809p, F, A, B, Typeface> f26506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Spannable spannable, InterfaceC6512o<? super AbstractC3809p, ? super F, ? super A, ? super B, ? extends Typeface> interfaceC6512o) {
        super(3);
        this.f26505b = spannable;
        this.f26506c = interfaceC6512o;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(D d11, Integer num, Integer num2) {
        D d12 = d11;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        AbstractC3809p h11 = d12.h();
        F m11 = d12.m();
        if (m11 == null) {
            m11 = F.f21509g;
        }
        A k11 = d12.k();
        A a11 = A.a(k11 != null ? k11.b() : 0);
        B l11 = d12.l();
        this.f26505b.setSpan(new m(this.f26506c.invoke(h11, m11, a11, B.a(l11 != null ? l11.b() : 1))), intValue, intValue2, 33);
        return Unit.f71690a;
    }
}
