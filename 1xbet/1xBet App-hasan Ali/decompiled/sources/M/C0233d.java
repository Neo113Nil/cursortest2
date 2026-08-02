package M;

import s4.InterfaceC2369f;
import y.C2645a;
import y.C2646b;
import y.C2647c;
import y.C2648d;
import y.C2649e;
import y.C2651g;
import y.C2652h;
import y.C2655k;
import y.InterfaceC2653i;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233d implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3305k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z.p f3306l;

    public /* synthetic */ C0233d(Z.p pVar, int i) {
        this.f3305k = i;
        this.f3306l = pVar;
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        switch (this.f3305k) {
            case 0:
                InterfaceC2653i interfaceC2653i = (InterfaceC2653i) obj;
                boolean z3 = interfaceC2653i instanceof C2651g;
                Z.p pVar = this.f3306l;
                if (z3) {
                    pVar.add(interfaceC2653i);
                } else if (interfaceC2653i instanceof C2652h) {
                    pVar.remove(((C2652h) interfaceC2653i).f21122a);
                } else if (interfaceC2653i instanceof C2648d) {
                    pVar.add(interfaceC2653i);
                } else if (interfaceC2653i instanceof C2649e) {
                    pVar.remove(((C2649e) interfaceC2653i).f21118a);
                } else if (interfaceC2653i instanceof y.l) {
                    pVar.add(interfaceC2653i);
                } else if (interfaceC2653i instanceof y.m) {
                    pVar.remove(((y.m) interfaceC2653i).f21126a);
                } else if (interfaceC2653i instanceof C2655k) {
                    pVar.remove(((C2655k) interfaceC2653i).f21124a);
                }
                break;
            default:
                InterfaceC2653i interfaceC2653i2 = (InterfaceC2653i) obj;
                boolean z5 = interfaceC2653i2 instanceof C2651g;
                Z.p pVar2 = this.f3306l;
                if (z5) {
                    pVar2.add(interfaceC2653i2);
                } else if (interfaceC2653i2 instanceof C2652h) {
                    pVar2.remove(((C2652h) interfaceC2653i2).f21122a);
                } else if (interfaceC2653i2 instanceof C2648d) {
                    pVar2.add(interfaceC2653i2);
                } else if (interfaceC2653i2 instanceof C2649e) {
                    pVar2.remove(((C2649e) interfaceC2653i2).f21118a);
                } else if (interfaceC2653i2 instanceof y.l) {
                    pVar2.add(interfaceC2653i2);
                } else if (interfaceC2653i2 instanceof y.m) {
                    pVar2.remove(((y.m) interfaceC2653i2).f21126a);
                } else if (interfaceC2653i2 instanceof C2655k) {
                    pVar2.remove(((C2655k) interfaceC2653i2).f21124a);
                } else if (interfaceC2653i2 instanceof C2646b) {
                    pVar2.add(interfaceC2653i2);
                } else if (interfaceC2653i2 instanceof C2647c) {
                    pVar2.remove(((C2647c) interfaceC2653i2).f21117a);
                } else if (interfaceC2653i2 instanceof C2645a) {
                    pVar2.remove(((C2645a) interfaceC2653i2).f21116a);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
