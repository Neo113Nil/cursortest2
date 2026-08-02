package P0;

import bc.C5637m;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import m0.C7980b;
import m0.C8008p;

/* renamed from: P0.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3751l0 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f21196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3751l0(C3787x1 c3787x1, C7980b<Float, C8008p> c7980b) {
        super(1);
        this.f21195b = c3787x1;
        this.f21196c = c7980b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        float s11 = this.f21195b.c().s();
        float d11 = C7464j.d(interfaceC7825i02.i());
        if (!Float.isNaN(s11) && !Float.isNaN(d11) && d11 != 0.0f) {
            float floatValue = this.f21196c.k().floatValue();
            interfaceC7825i02.j(B0.d(interfaceC7825i02, floatValue));
            interfaceC7825i02.k(B0.e(interfaceC7825i02, floatValue));
            interfaceC7825i02.g0(C5637m.a(0.5f, (s11 + d11) / d11));
        }
        return Unit.f71690a;
    }
}
