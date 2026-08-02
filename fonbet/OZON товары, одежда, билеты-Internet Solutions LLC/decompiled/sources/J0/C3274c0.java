package J0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3274c0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m0.Y<Boolean> f13156b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<l1.N0> f13157c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n0.d0 f13158d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC3289f0 f13159e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e.a f13160f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3274c0(m0.Y y11, InterfaceC3978p0 interfaceC3978p0, n0.d0 d0Var, AbstractC3289f0 abstractC3289f0, e.a aVar, C4912a c4912a) {
        super(2);
        this.f13156b = y11;
        this.f13157c = interfaceC3978p0;
        this.f13158d = d0Var;
        this.f13159e = abstractC3289f0;
        this.f13160f = aVar;
        this.f13161g = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3314l1.a(this.f13156b, this.f13157c, this.f13158d, this.f13159e.b(this.f13160f), this.f13161g, interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
