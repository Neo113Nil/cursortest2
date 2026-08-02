package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: P0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3750l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21188b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f21189c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21190d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l1.J0 f21191e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3720b f21192f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9915y f21193g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3750l(Function0 function0, e.a aVar, boolean z11, l1.J0 j02, C3720b c3720b, C9915y c9915y, C4912a c4912a, int i11) {
        super(2);
        this.f21188b = function0;
        this.f21189c = aVar;
        this.f21190d = z11;
        this.f21191e = j02;
        this.f21192f = c3720b;
        this.f21193g = c9915y;
        this.f21194h = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(805306369);
        C4912a c4912a = this.f21194h;
        C3720b c3720b = this.f21192f;
        C9915y c9915y = this.f21193g;
        C3753m.c(this.f21188b, this.f21189c, this.f21190d, this.f21191e, c3720b, c9915y, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
