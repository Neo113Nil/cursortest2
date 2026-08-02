package F5;

import B1.InterfaceC2547p;
import B5.EnumC2597a;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B5.g f9062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Float> f9063c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f9064d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p.a.C0051a f9065e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f9066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(B5.g gVar, Function0 function0, androidx.compose.ui.e eVar, com.airbnb.lottie.i iVar, e1.d dVar, InterfaceC2547p.a.C0051a c0051a, EnumC2597a enumC2597a, int i11) {
        super(2);
        this.f9062b = gVar;
        this.f9063c = function0;
        this.f9064d = eVar;
        this.f9065e = c0051a;
        this.f9066f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f9066f | 1);
        androidx.compose.ui.e eVar = this.f9064d;
        InterfaceC2547p.a.C0051a c0051a = this.f9065e;
        l.a(this.f9062b, this.f9063c, eVar, c0051a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
