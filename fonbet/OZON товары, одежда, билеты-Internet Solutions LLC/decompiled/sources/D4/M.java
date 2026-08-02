package D4;

import B4.C2581j;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import b1.InterfaceC5505h;
import fd.InterfaceC6512o;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC7772p;

/* loaded from: classes8.dex */
final class M extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, C2581j, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5505h f5830b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f5831c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A1<List<C2581j>> f5832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    M(InterfaceC5505h interfaceC5505h, InterfaceC3978p0<Boolean> interfaceC3978p0, A1<? extends List<C2581j>> a12) {
        super(4);
        this.f5830b = interfaceC5505h;
        this.f5831c = interfaceC3978p0;
        this.f5832d = a12;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC7772p interfaceC7772p, C2581j c2581j, InterfaceC3967k interfaceC3967k, Integer num) {
        C2581j c2581j2;
        InterfaceC7772p interfaceC7772p2 = interfaceC7772p;
        C2581j c2581j3 = c2581j;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        if (!this.f5831c.getValue().booleanValue()) {
            List<C2581j> value = this.f5832d.getValue();
            ListIterator<C2581j> listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c2581j2 = null;
                    break;
                }
                c2581j2 = listIterator.previous();
                if (Intrinsics.d(c2581j3, c2581j2)) {
                    break;
                }
            }
            c2581j3 = c2581j2;
        }
        if (c2581j3 != null) {
            C2843s.a(c2581j3, this.f5830b, a1.c.c(-1263531443, new L(c2581j3, interfaceC7772p2), interfaceC3967k2), interfaceC3967k2, 384);
        }
        return Unit.f71690a;
    }
}
