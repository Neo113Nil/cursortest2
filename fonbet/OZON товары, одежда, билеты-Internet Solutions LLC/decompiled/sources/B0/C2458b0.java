package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;
import z0.InterfaceC10969b;

/* renamed from: B0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2458b0 extends AbstractC7737t implements Function1<j1.v, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1673b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1674c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1675d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q1.M f1676e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q1.K f1677f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.r f1678g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Q1.D f1679h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1680i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ xe.M f1681j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC10969b f1682k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2458b0(O0 o02, boolean z11, boolean z12, Q1.M m11, Q1.K k11, Q1.r rVar, Q1.D d11, I0.W0 w02, xe.M m12, InterfaceC10969b interfaceC10969b) {
        super(1);
        this.f1673b = o02;
        this.f1674c = z11;
        this.f1675d = z12;
        this.f1676e = m11;
        this.f1677f = k11;
        this.f1678g = rVar;
        this.f1679h = d11;
        this.f1680i = w02;
        this.f1681j = m12;
        this.f1682k = interfaceC10969b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(j1.v vVar) {
        R1 j11;
        j1.v vVar2 = vVar;
        O0 o02 = this.f1673b;
        if (o02.e() != vVar2.a()) {
            o02.B(vVar2.a());
            if (o02.e() && this.f1674c && !this.f1675d) {
                C2514u0.h(this.f1676e, o02, this.f1677f, this.f1678g, this.f1679h);
            } else {
                C2514u0.f(o02);
            }
            if (vVar2.a() && (j11 = o02.j()) != null) {
                C10727i.c(this.f1681j, null, null, new C2455a0(this.f1682k, this.f1677f, o02, j11, this.f1679h, null), 3);
            }
            if (!vVar2.a()) {
                this.f1680i.s(null);
            }
        }
        return Unit.f71690a;
    }
}
