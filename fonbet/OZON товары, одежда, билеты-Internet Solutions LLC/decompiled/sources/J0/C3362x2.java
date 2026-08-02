package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.x2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3362x2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13477c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3362x2(C4912a c4912a, C4912a c4912a2, int i11) {
        super(2);
        this.f13476b = c4912a;
        this.f13477c = c4912a2;
        this.f13478d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13478d | 1);
        J2.c(this.f13476b, this.f13477c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
