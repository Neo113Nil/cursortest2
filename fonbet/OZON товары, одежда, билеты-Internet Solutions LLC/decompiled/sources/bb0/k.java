package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f55814b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f55815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(boolean z11, e.a aVar, int i11) {
        super(2);
        this.f55814b = z11;
        this.f55815c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        l.a(this.f55814b, this.f55815c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
