package Q0;

import K1.T;
import K1.U;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.D0;

/* loaded from: classes8.dex */
final class o extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T f22771b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T f22772c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f22773d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ D0.d f22774e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f22775f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f22776g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ D0.d f22777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(T t2, T t11, float f7, D0.d dVar, C4912a c4912a, boolean z11, D0.d dVar2) {
        super(2);
        this.f22771b = t2;
        this.f22772c = t11;
        this.f22773d = f7;
        this.f22774e = dVar;
        this.f22775f = c4912a;
        this.f22776g = z11;
        this.f22777h = dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            T a11 = U.a(this.f22771b, this.f22772c, this.f22773d);
            if (this.f22776g) {
                a11 = T.c(a11, ((C7807Z) this.f22777h.getValue()).w(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            }
            A.b(((C7807Z) this.f22774e.getValue()).w(), a11, this.f22775f, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
