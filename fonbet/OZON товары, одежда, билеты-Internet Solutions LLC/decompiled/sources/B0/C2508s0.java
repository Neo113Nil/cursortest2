package B0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2508s0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1936c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f1937d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f1938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2508s0(androidx.compose.ui.e eVar, I0.W0 w02, C4912a c4912a, int i11) {
        super(2);
        this.f1935b = eVar;
        this.f1936c = w02;
        this.f1937d = c4912a;
        this.f1938e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f1938e | 1);
        I0.W0 w02 = this.f1936c;
        C4912a c4912a = this.f1937d;
        C2514u0.b(this.f1935b, w02, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
