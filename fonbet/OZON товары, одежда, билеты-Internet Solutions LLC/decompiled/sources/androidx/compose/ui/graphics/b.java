package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;

/* loaded from: classes.dex */
final class b extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f40431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(1);
        this.f40431b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        c cVar = this.f40431b;
        interfaceC7825i02.j(cVar.O1());
        interfaceC7825i02.k(cVar.P1());
        interfaceC7825i02.setAlpha(cVar.getAlpha());
        interfaceC7825i02.n(0.0f);
        interfaceC7825i02.c(cVar.T1());
        interfaceC7825i02.z(cVar.Q1());
        interfaceC7825i02.e(0.0f);
        interfaceC7825i02.f(0.0f);
        interfaceC7825i02.h(cVar.N1());
        interfaceC7825i02.d(cVar.K1());
        interfaceC7825i02.g0(cVar.S1());
        interfaceC7825i02.setShape(cVar.getShape());
        interfaceC7825i02.x(cVar.L1());
        interfaceC7825i02.l(null);
        interfaceC7825i02.H(cVar.J1());
        interfaceC7825i02.J(cVar.R1());
        interfaceC7825i02.q(cVar.M1());
        return Unit.f71690a;
    }
}
