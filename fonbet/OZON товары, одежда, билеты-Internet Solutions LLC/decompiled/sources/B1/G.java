package B1;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class G extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f2029b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f2030c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ V f2031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(androidx.compose.ui.e eVar, C4912a c4912a, V v11, int i11) {
        super(2);
        this.f2029b = eVar;
        this.f2030c = c4912a;
        this.f2031d = v11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f2030c;
        V v11 = this.f2031d;
        I.a(this.f2029b, c4912a, v11, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
