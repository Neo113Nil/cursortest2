package N0;

import Bl0.C2652m;
import J0.Y;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f18307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f18308c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f18309d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f18310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(Function0 function0, Y y11, C4912a c4912a, int i11) {
        super(2);
        this.f18307b = function0;
        this.f18308c = y11;
        this.f18309d = c4912a;
        this.f18310e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f18310e | 1);
        Y y11 = this.f18308c;
        C4912a c4912a = this.f18309d;
        o.a(this.f18307b, y11, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
