package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class W1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3341s1 f13053b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u0.J f13054c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f13055d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f13056e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f13057f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13058g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13059h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C4912a f13060i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C4912a f13061j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C4912a f13062k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C3281d2 f13063l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W1(C3341s1 c3341s1, u0.J j11, long j12, long j13, int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, C4912a c4912a5, C3281d2 c3281d2) {
        super(3);
        this.f13053b = c3341s1;
        this.f13054c = j11;
        this.f13055d = j12;
        this.f13056e = j13;
        this.f13057f = i11;
        this.f13058g = c4912a;
        this.f13059h = c4912a2;
        this.f13060i = c4912a3;
        this.f13061j = c4912a4;
        this.f13062k = c4912a5;
        this.f13063l = c3281d2;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(eVar2) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3341s1 c3341s1 = this.f13053b;
            boolean n11 = interfaceC3967k2.n(c3341s1);
            u0.J j11 = this.f13054c;
            boolean n12 = n11 | interfaceC3967k2.n(j11);
            Object C11 = interfaceC3967k2.C();
            if (n12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new T1(c3341s1, j11);
                interfaceC3967k2.x(C11);
            }
            R2.a(u0.O.c(eVar2, (Function1) C11), null, this.f13055d, this.f13056e, 0.0f, a1.c.c(1772955108, new V1(this.f13057f, this.f13058g, this.f13059h, this.f13060i, this.f13053b, this.f13061j, this.f13062k, this.f13063l), interfaceC3967k2), interfaceC3967k2, 1572864, 50);
        }
        return Unit.f71690a;
    }
}
