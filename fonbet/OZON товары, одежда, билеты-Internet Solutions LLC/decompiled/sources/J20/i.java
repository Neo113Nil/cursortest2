package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.d f13717b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(a.d dVar, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f13717b = dVar;
        this.f13718c = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        j.a(this.f13717b, this.f13718c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
