package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3290f1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m0.Y<Boolean> f13207b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<l1.N0> f13208c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n0.d0 f13209d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13210e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f13211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3290f1(m0.Y y11, InterfaceC3978p0 interfaceC3978p0, n0.d0 d0Var, androidx.compose.ui.e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f13207b = y11;
        this.f13208c = interfaceC3978p0;
        this.f13209d = d0Var;
        this.f13210e = eVar;
        this.f13211f = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f13211f;
        C3314l1.a(this.f13207b, this.f13208c, this.f13209d, this.f13210e, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
