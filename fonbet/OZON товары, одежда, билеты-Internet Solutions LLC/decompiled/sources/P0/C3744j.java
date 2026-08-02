package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: P0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3744j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21092b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f21093c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21094d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l1.J0 f21095e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3720b f21096f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3732f f21097g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9915y f21098h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C4912a f21099i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f21100j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f21101k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3744j(Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, C3720b c3720b, C3732f c3732f, C9915y c9915y, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f21092b = function0;
        this.f21093c = eVar;
        this.f21094d = z11;
        this.f21095e = j02;
        this.f21096f = c3720b;
        this.f21097g = c3732f;
        this.f21098h = c9915y;
        this.f21099i = c4912a;
        this.f21100j = i11;
        this.f21101k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21100j | 1);
        C4912a c4912a = this.f21099i;
        C9915y c9915y = this.f21098h;
        C3753m.a(this.f21092b, this.f21093c, this.f21094d, this.f21095e, this.f21096f, this.f21097g, c9915y, c4912a, interfaceC3967k, e11, this.f21101k);
        return Unit.f71690a;
    }
}
