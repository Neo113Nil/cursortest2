package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3749k1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f21137b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21138c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21139d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f21140e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f21141f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u0.J f21142g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21143h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f21144i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3749k1(int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, u0.J j11, C4912a c4912a5, int i12) {
        super(2);
        this.f21137b = i11;
        this.f21138c = c4912a;
        this.f21139d = c4912a2;
        this.f21140e = c4912a3;
        this.f21141f = c4912a4;
        this.f21142g = j11;
        this.f21143h = c4912a5;
        this.f21144i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21144i | 1);
        C4912a c4912a = this.f21139d;
        C4912a c4912a2 = this.f21140e;
        C4912a c4912a3 = this.f21141f;
        C3752l1.b(this.f21137b, this.f21138c, c4912a, c4912a2, c4912a3, this.f21142g, this.f21143h, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
