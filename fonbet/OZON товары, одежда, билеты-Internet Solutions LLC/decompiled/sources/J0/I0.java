package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class I0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f12821b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f12822c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.a f12823d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12824e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12825f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ D0 f12826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(Function0 function0, e.a aVar, A0.a aVar2, long j11, long j12, D0 d02, int i11) {
        super(2);
        C4912a c4912a = W1.b.f33190a;
        this.f12821b = function0;
        this.f12822c = aVar;
        this.f12823d = aVar2;
        this.f12824e = j11;
        this.f12825f = j12;
        this.f12826g = d02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        int e11 = C2652m.e(7);
        D0 d02 = this.f12826g;
        C4912a c4912a = W1.b.f33190a;
        O0.a(this.f12821b, this.f12822c, this.f12823d, this.f12824e, this.f12825f, d02, interfaceC3967k2, e11);
        return Unit.f71690a;
    }
}
