package androidx.compose.material;

import S0.A1;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import n1.InterfaceC8412e;

/* loaded from: classes8.dex */
final class b0 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<C7807Z> f39989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(A1<C7807Z> a12) {
        super(1);
        this.f39989b = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
        long w11 = this.f39989b.getValue().w();
        float v12 = interfaceC8412e2.v1(e0.e());
        float v13 = interfaceC8412e2.v1(e0.d());
        float f7 = v13 / 2;
        interfaceC8412e2.U(w11, P9.a.a(f7, C7459e.h(interfaceC8412e2.A0())), P9.a.a(v12 - f7, C7459e.h(interfaceC8412e2.A0())), v13, (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : null);
        return Unit.f71690a;
    }
}
