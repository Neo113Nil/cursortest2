package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12883b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f12884c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f12885d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f12886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(float f7, long j11, float f11, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f12883b = eVar;
        this.f12884c = j11;
        this.f12885d = f7;
        this.f12886e = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        androidx.compose.ui.e eVar = this.f12883b;
        long j11 = this.f12884c;
        L.a(this.f12885d, j11, this.f12886e, eVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
