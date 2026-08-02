package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.f f13730b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f13731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(a.f fVar, e.a aVar, int i11) {
        super(2);
        this.f13730b = fVar;
        this.f13731c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        r.a(this.f13730b, this.f13731c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
