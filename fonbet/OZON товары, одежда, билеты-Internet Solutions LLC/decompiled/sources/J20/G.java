package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class G extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.j f13704b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f13705c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(a.j jVar, Function1 function1, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f13704b = jVar;
        this.f13705c = function1;
        this.f13706d = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        androidx.compose.ui.e eVar = this.f13706d;
        H.a(this.f13704b, this.f13705c, eVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
