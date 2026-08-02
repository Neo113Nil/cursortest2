package androidx.compose.ui.platform;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class L0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D1.x0 f40716b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V1 f40717c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f40718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(D1.x0 x0Var, V1 v12, C4912a c4912a, int i11) {
        super(2);
        this.f40716b = x0Var;
        this.f40717c = v12;
        this.f40718d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        C4912a c4912a = this.f40718d;
        K0.a(this.f40716b, this.f40717c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
