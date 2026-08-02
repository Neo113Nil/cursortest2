package R20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24535b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f24536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(u uVar, int i11) {
        super(2);
        this.f24535b = uVar;
        this.f24536c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f24536c | 1);
        t.a(this.f24535b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
