package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: P0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3747k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21127b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f21128c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21129d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l1.J0 f21130e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3720b f21131f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3732f f21132g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9915y f21133h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C4912a f21134i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f21135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3747k(Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, C3720b c3720b, C3732f c3732f, C9915y c9915y, C4912a c4912a, int i11) {
        super(2);
        this.f21127b = function0;
        this.f21128c = eVar;
        this.f21129d = z11;
        this.f21130e = j02;
        this.f21131f = c3720b;
        this.f21132g = c3732f;
        this.f21133h = c9915y;
        this.f21134i = c4912a;
        this.f21135j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21135j | 1);
        C4912a c4912a = this.f21134i;
        C3720b c3720b = this.f21131f;
        C3732f c3732f = this.f21132g;
        C9915y c9915y = this.f21133h;
        C3753m.b(this.f21127b, this.f21128c, this.f21129d, this.f21130e, c3720b, c3732f, c9915y, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
