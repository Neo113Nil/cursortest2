package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;
import u0.InterfaceC9890C;

/* renamed from: J0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3328p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13346b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13347c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13348d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3308k f13349e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ A0.a f13350f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3300i f13351g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9915y f13352h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> f13353i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f13354j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f13355k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3328p(Function0 function0, androidx.compose.ui.e eVar, boolean z11, InterfaceC3308k interfaceC3308k, A0.a aVar, InterfaceC3300i interfaceC3300i, C9915y c9915y, InterfaceC6511n interfaceC6511n, int i11, int i12) {
        super(2);
        this.f13346b = function0;
        this.f13347c = eVar;
        this.f13348d = z11;
        this.f13349e = interfaceC3308k;
        this.f13350f = aVar;
        this.f13351g = interfaceC3300i;
        this.f13352h = c9915y;
        this.f13353i = interfaceC6511n;
        this.f13354j = i11;
        this.f13355k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13354j | 1);
        InterfaceC3308k interfaceC3308k = this.f13349e;
        InterfaceC3300i interfaceC3300i = this.f13351g;
        C3332q.a(this.f13346b, this.f13347c, this.f13348d, interfaceC3308k, this.f13350f, interfaceC3300i, this.f13352h, this.f13353i, interfaceC3967k, e11, this.f13355k);
        return Unit.f71690a;
    }
}
