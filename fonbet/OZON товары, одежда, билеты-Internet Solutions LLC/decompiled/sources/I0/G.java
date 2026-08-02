package I0;

import I0.C3220z;
import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class G extends AbstractC7737t implements Function0<C3220z.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3218y f11315b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f11316c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11317d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3198n0 f11318e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f11319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(C3218y c3218y, int i11, int i12, InterfaceC3198n0 interfaceC3198n0, InterfaceC4008j<Integer> interfaceC4008j) {
        super(0);
        this.f11315b = c3218y;
        this.f11316c = i11;
        this.f11317d = i12;
        this.f11318e = interfaceC3198n0;
        this.f11319f = interfaceC4008j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final C3220z.a invoke() {
        int intValue = ((Number) this.f11319f.getValue()).intValue();
        InterfaceC3198n0 interfaceC3198n0 = this.f11318e;
        boolean a11 = interfaceC3198n0.a();
        boolean z11 = interfaceC3198n0.c() == EnumC3195m.CROSSED;
        C3218y c3218y = this.f11315b;
        K1.K i11 = c3218y.i();
        int i12 = this.f11316c;
        long B11 = i11.B(i12);
        K1.K i13 = c3218y.i();
        int i14 = K1.Q.f15010c;
        int i15 = (int) (B11 >> 32);
        if (i13.p(i15) != intValue) {
            i15 = intValue >= c3218y.i().m() ? c3218y.i().t(c3218y.i().m() - 1) : c3218y.i().t(intValue);
        }
        int i16 = (int) (B11 & 4294967295L);
        if (c3218y.i().p(i16) != intValue) {
            i16 = intValue >= c3218y.i().m() ? K1.K.o(c3218y.i(), c3218y.i().m() - 1) : K1.K.o(c3218y.i(), intValue);
        }
        int i17 = this.f11317d;
        if (i15 == i17) {
            return c3218y.a(i16);
        }
        if (i16 == i17) {
            return c3218y.a(i15);
        }
        if (!(a11 ^ z11) ? i12 >= i15 : i12 > i16) {
            i15 = i16;
        }
        return c3218y.a(i15);
    }
}
