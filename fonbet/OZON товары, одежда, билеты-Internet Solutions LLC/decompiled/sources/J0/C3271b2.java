package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.b2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3271b2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f13141b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13142c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13143d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13144e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f13145f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u0.J f13146g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13147h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f13148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3271b2(int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, u0.J j11, C4912a c4912a5, int i12) {
        super(2);
        this.f13141b = i11;
        this.f13142c = c4912a;
        this.f13143d = c4912a2;
        this.f13144e = c4912a3;
        this.f13145f = c4912a4;
        this.f13146g = j11;
        this.f13147h = c4912a5;
        this.f13148i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13148i | 1);
        C4912a c4912a = this.f13143d;
        C4912a c4912a2 = this.f13144e;
        C4912a c4912a3 = this.f13145f;
        Q1.c(this.f13141b, this.f13142c, c4912a, c4912a2, c4912a3, this.f13146g, this.f13147h, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
