package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class x extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.h f13743b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f13744c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13745d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f13746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(a.h hVar, Function1 function1, androidx.compose.ui.e eVar, Function1 function12, int i11) {
        super(2);
        this.f13743b = hVar;
        this.f13744c = function1;
        this.f13745d = eVar;
        this.f13746e = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        y.a(this.f13743b, this.f13744c, this.f13745d, this.f13746e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
