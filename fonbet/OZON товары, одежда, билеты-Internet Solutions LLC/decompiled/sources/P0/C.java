package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class C extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20600b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20601c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f20602d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B f20603e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f20604f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f20605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(Function0 function0, androidx.compose.ui.e eVar, boolean z11, B b11, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f20600b = function0;
        this.f20601c = eVar;
        this.f20602d = z11;
        this.f20603e = b11;
        this.f20604f = c4912a;
        this.f20605g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(196609);
        C4912a c4912a = this.f20604f;
        B b11 = this.f20603e;
        int i11 = this.f20605g;
        D.a(this.f20600b, this.f20601c, this.f20602d, b11, c4912a, interfaceC3967k, e11, i11);
        return Unit.f71690a;
    }
}
