package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3273c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13151b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f13152c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13153d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9915y f13154e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f13155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3273c(Function0 function0, e.a aVar, boolean z11, C9915y c9915y, C4912a c4912a, int i11) {
        super(2);
        this.f13151b = function0;
        this.f13152c = aVar;
        this.f13153d = z11;
        this.f13154e = c9915y;
        this.f13155f = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(196609);
        C4912a c4912a = this.f13155f;
        boolean z11 = this.f13153d;
        C9915y c9915y = this.f13154e;
        C3278d.a(this.f13151b, this.f13152c, z11, c9915y, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
