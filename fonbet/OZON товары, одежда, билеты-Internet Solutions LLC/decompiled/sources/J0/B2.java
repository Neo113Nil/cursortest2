package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class B2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12677b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f12678c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.a f12679d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12680e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12681f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f12682g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f12683h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12684i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2(androidx.compose.ui.e eVar, C4912a c4912a, A0.a aVar, long j11, long j12, float f7, C4912a c4912a2, int i11) {
        super(2);
        this.f12677b = eVar;
        this.f12678c = c4912a;
        this.f12679d = aVar;
        this.f12680e = j11;
        this.f12681f = j12;
        this.f12682g = f7;
        this.f12683h = c4912a2;
        this.f12684i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12684i | 1);
        C4912a c4912a = this.f12683h;
        long j11 = this.f12680e;
        long j12 = this.f12681f;
        J2.a(this.f12677b, this.f12678c, this.f12679d, j11, j12, this.f12682g, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
