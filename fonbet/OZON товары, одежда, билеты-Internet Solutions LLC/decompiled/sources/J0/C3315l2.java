package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: J0.l2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3315l2 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13283b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B0<InterfaceC3295g2> f13284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3315l2(InterfaceC3295g2 interfaceC3295g2, B0<InterfaceC3295g2> b02) {
        super(0);
        this.f13283b = interfaceC3295g2;
        this.f13284c = b02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        B0<InterfaceC3295g2> b02 = this.f13284c;
        Object a11 = b02.a();
        InterfaceC3295g2 interfaceC3295g2 = this.f13283b;
        if (!Intrinsics.d(interfaceC3295g2, a11)) {
            kotlin.collections.C.h(b02.b(), new C3311k2(interfaceC3295g2));
            S0.I0 c11 = b02.c();
            if (c11 != null) {
                c11.invalidate();
            }
        }
        return Unit.f71690a;
    }
}
