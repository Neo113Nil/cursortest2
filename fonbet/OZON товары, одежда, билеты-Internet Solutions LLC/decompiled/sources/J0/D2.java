package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class D2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f12730b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12731c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.a f12732d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12733e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12734f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f12735g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f12736h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D2(InterfaceC3295g2 interfaceC3295g2, androidx.compose.ui.e eVar, A0.a aVar, long j11, long j12, long j13, float f7, int i11) {
        super(2);
        this.f12730b = interfaceC3295g2;
        this.f12731c = eVar;
        this.f12732d = aVar;
        this.f12733e = j11;
        this.f12734f = j12;
        this.f12735g = j13;
        this.f12736h = f7;
        this.f12737i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12737i | 1);
        long j11 = this.f12733e;
        long j12 = this.f12734f;
        J2.b(this.f12730b, this.f12731c, this.f12732d, j11, j12, this.f12735g, this.f12736h, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
