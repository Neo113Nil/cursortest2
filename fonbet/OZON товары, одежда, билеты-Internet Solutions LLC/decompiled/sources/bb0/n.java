package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f55818b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f55819c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f55820d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f55821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(String str, androidx.compose.ui.e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f55818b = str;
        this.f55819c = eVar;
        this.f55820d = c4912a;
        this.f55821e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55821e | 1);
        androidx.compose.ui.e eVar = this.f55819c;
        C4912a c4912a = this.f55820d;
        o.a(this.f55818b, eVar, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
