package Pf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f22521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f22522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(a aVar, int i11) {
        super(2);
        this.f22521b = aVar;
        this.f22522c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f22522c | 1);
        c.a(this.f22521b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
