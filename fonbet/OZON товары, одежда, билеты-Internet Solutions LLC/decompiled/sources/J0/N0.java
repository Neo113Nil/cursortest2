package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class N0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f12901b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12902c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.a f12903d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12904e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12905f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ D0 f12906g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f12907h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12908i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(Function0 function0, androidx.compose.ui.e eVar, A0.a aVar, long j11, long j12, D0 d02, C4912a c4912a, int i11) {
        super(2);
        this.f12901b = function0;
        this.f12902c = eVar;
        this.f12903d = aVar;
        this.f12904e = j11;
        this.f12905f = j12;
        this.f12906g = d02;
        this.f12907h = c4912a;
        this.f12908i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12908i | 1);
        C4912a c4912a = this.f12907h;
        long j11 = this.f12904e;
        long j12 = this.f12905f;
        O0.b(this.f12901b, this.f12902c, this.f12903d, j11, j12, this.f12906g, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
