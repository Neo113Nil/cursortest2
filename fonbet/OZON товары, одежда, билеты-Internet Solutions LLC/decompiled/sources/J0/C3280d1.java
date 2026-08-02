package J0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import m0.D0;

/* renamed from: J0.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3280d1 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<l1.N0> f13173b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0.d f13174c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D0.d f13175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3280d1(InterfaceC3978p0 interfaceC3978p0, D0.d dVar, D0.d dVar2) {
        super(1);
        this.f13173b = interfaceC3978p0;
        this.f13174c = dVar;
        this.f13175d = dVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        D0.d dVar = this.f13174c;
        interfaceC7825i02.j(((Number) dVar.getValue()).floatValue());
        interfaceC7825i02.k(((Number) dVar.getValue()).floatValue());
        interfaceC7825i02.setAlpha(((Number) this.f13175d.getValue()).floatValue());
        interfaceC7825i02.g0(this.f13173b.getValue().g());
        return Unit.f71690a;
    }
}
