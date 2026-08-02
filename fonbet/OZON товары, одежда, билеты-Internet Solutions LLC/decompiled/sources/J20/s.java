package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13732b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f13733c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(String str, e.a aVar, int i11) {
        super(2);
        this.f13732b = str;
        this.f13733c = aVar;
        this.f13734d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        t.a(C2652m.e(this.f13734d | 1), interfaceC3967k, this.f13733c, this.f13732b);
        return Unit.f71690a;
    }
}
