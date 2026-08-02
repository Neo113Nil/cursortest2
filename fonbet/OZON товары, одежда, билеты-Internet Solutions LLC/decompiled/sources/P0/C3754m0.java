package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import m0.C7980b;
import m0.C8008p;

/* renamed from: P0.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3754m0 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f21199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3754m0(C7980b<Float, C8008p> c7980b) {
        super(1);
        this.f21199b = c7980b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        long j11;
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        float floatValue = this.f21199b.k().floatValue();
        float d11 = B0.d(interfaceC7825i02, floatValue);
        float e11 = B0.e(interfaceC7825i02, floatValue);
        interfaceC7825i02.k(e11 == 0.0f ? 1.0f : d11 / e11);
        j11 = B0.f20598c;
        interfaceC7825i02.g0(j11);
        return Unit.f71690a;
    }
}
