package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class P0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f12930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12931c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f12932d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f12933e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f12934f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f12935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(Function0 function0, androidx.compose.ui.e eVar, boolean z11, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f12930b = function0;
        this.f12931c = eVar;
        this.f12932d = z11;
        this.f12933e = c4912a;
        this.f12934f = i11;
        this.f12935g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12934f | 1);
        C4912a c4912a = this.f12933e;
        boolean z11 = this.f12932d;
        Q0.a(this.f12930b, this.f12931c, z11, c4912a, interfaceC3967k, e11, this.f12935g);
        return Unit.f71690a;
    }
}
