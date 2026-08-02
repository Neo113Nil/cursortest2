package W20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import q1.AbstractC8972b;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8972b f33220b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f33221c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f33222d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33223e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33224f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f33225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(AbstractC8972b abstractC8972b, long j11, AbstractC7799Q abstractC7799Q, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, int i11) {
        super(2);
        this.f33220b = abstractC8972b;
        this.f33221c = j11;
        this.f33222d = abstractC7799Q;
        this.f33223e = eVar;
        this.f33224f = eVar2;
        this.f33225g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f33225g | 1);
        androidx.compose.ui.e eVar = this.f33224f;
        AbstractC7799Q abstractC7799Q = this.f33222d;
        androidx.compose.ui.e eVar2 = this.f33223e;
        e.a(this.f33220b, this.f33221c, abstractC7799Q, eVar2, eVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
