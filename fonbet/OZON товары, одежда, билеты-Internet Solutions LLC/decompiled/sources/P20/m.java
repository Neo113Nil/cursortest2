package P20;

import B4.C2584m;
import J20.C3373c;
import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class m extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f21716b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f21717c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2584m f21718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, e eVar, C2584m c2584m) {
        super(4);
        this.f21716b = list;
        this.f21717c = eVar;
        this.f21718d = c2584m;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            b bVar = (b) this.f21716b.get(intValue);
            interfaceC3967k2.o(1679202581);
            String b11 = bVar.b();
            String valueOf = String.valueOf(bVar.c());
            boolean z11 = C7714v.P(this.f21717c.c()) == intValue;
            interfaceC3967k2.o(1024006079);
            C2584m c2584m = this.f21718d;
            boolean F11 = interfaceC3967k2.F(c2584m) | interfaceC3967k2.n(bVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new h(c2584m, bVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C3373c.b(b11, null, valueOf, z11, null, null, (Function0) C11, null, interfaceC3967k2, 48, 368);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
