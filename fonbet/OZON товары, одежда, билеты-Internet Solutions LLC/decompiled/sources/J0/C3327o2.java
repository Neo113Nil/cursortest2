package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.o2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3327o2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13343c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3327o2(InterfaceC3295g2 interfaceC3295g2, androidx.compose.ui.e eVar, int i11) {
        super(2);
        C4912a c4912a = C3355w.f13457a;
        this.f13342b = interfaceC3295g2;
        this.f13343c = eVar;
        this.f13344d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13344d | 1);
        androidx.compose.ui.e eVar = this.f13343c;
        C4912a c4912a = C3355w.f13457a;
        C3338r2.c(this.f13342b, eVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
