package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3279d0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC3289f0 f13166b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13167c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13168d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.a f13169e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0.d0 f13170f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13171g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f13172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3279d0(AbstractC3289f0 abstractC3289f0, boolean z11, Function0 function0, e.a aVar, n0.d0 d0Var, C4912a c4912a, int i11) {
        super(2);
        this.f13166b = abstractC3289f0;
        this.f13167c = z11;
        this.f13168d = function0;
        this.f13169e = aVar;
        this.f13170f = d0Var;
        this.f13171g = c4912a;
        this.f13172h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13172h | 1);
        C4912a c4912a = this.f13171g;
        Function0<Unit> function0 = this.f13168d;
        e.a aVar = this.f13169e;
        this.f13166b.a(this.f13167c, function0, aVar, this.f13170f, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
