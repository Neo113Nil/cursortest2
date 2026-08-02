package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: J0.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3310k1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13257b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13258c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9915y f13259d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13260e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f13261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3310k1(Function0 function0, androidx.compose.ui.e eVar, C9915y c9915y, C4912a c4912a, int i11) {
        super(2);
        this.f13257b = function0;
        this.f13258c = eVar;
        this.f13259d = c9915y;
        this.f13260e = c4912a;
        this.f13261f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13261f | 1);
        C4912a c4912a = this.f13260e;
        androidx.compose.ui.e eVar = this.f13258c;
        C9915y c9915y = this.f13259d;
        C3314l1.b(this.f13257b, eVar, c9915y, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
