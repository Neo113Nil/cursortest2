package A;

import A0.AbstractC0012b;
import A0.I;
import A0.o1;
import B.K;
import h0.C1989c;
import i0.J;
import i4.InterfaceC2015a;
import java.util.NoSuchElementException;
import k0.C2023c;
import l4.C2062d;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import v.C2520o;
import x.C2582h;
import x.C2588k;
import y4.C2673a;
import z0.C2733I;
import z0.e0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f65l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f66m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f67n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f68o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(C.i iVar, e0 e0Var, InterfaceC2015a interfaceC2015a) {
        super(0);
        this.f65l = 2;
        this.f66m = iVar;
        this.f67n = e0Var;
        this.f68o = (kotlin.jvm.internal.m) interfaceC2015a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r0.f20794E == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r1 = r0.z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r0.A0(r1, r0.f20795F) != true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r5 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r0.f20794E = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        ((x.S0) r10.f67n).f20722e = x.C2588k.y0(r0, (x.InterfaceC2574d) r10.f68o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        return r7;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.f65l) {
            case 0:
                C0008h c0008h = (C0008h) ((P.H) this.f66m).getValue();
                E e3 = (E) this.f67n;
                return new k(e3, c0008h, (C0003c) this.f68o, new K((C2062d) ((B.v) e3.f12d.f136e).getValue(), c0008h));
            case 1:
                AbstractC0012b abstractC0012b = (AbstractC0012b) this.f66m;
                abstractC0012b.removeOnAttachStateChangeListener((I) this.f67n);
                o1 o1Var = (o1) this.f68o;
                kotlin.jvm.internal.l.f("listener", o1Var);
                AbstractC2346c.s(abstractC0012b).f19535a.remove(o1Var);
                return W3.o.f6046a;
            case 2:
                e0 e0Var = (e0) this.f67n;
                ?? r1 = (kotlin.jvm.internal.m) this.f68o;
                C.i iVar = (C.i) this.f66m;
                C1989c y02 = C.i.y0(iVar, e0Var, r1);
                if (y02 == null) {
                    return null;
                }
                C2588k c2588k = iVar.f798y;
                if (W0.l.a(c2588k.f20795F, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return y02.g(c2588k.C0(y02, c2588k.f20795F) ^ (-9223372034707292160L));
            case 3:
                AbstractC2425d abstractC2425d = ((y4.f) this.f66m).f21318b;
                kotlin.jvm.internal.l.c(abstractC2425d);
                return abstractC2425d.n(((C2673a) this.f68o).f21298h.f21365d, ((y4.l) this.f67n).a());
            case 4:
                J j5 = ((C2520o) this.f67n).f20277B;
                C2733I c2733i = (C2733I) this.f68o;
                ((kotlin.jvm.internal.w) this.f66m).f17624k = j5.a(c2733i.f21647k.f17540l.A(), c2733i.getLayoutDirection(), c2733i);
                return W3.o.f6046a;
            default:
                C2588k c2588k2 = (C2588k) this.f66m;
                C2023c c2023c = c2588k2.f20791B;
                while (true) {
                    R.e eVar = (R.e) c2023c.f17544l;
                    int i = eVar.f5108m;
                    boolean z3 = true;
                    boolean z5 = i != 0;
                    W3.o oVar = W3.o.f6046a;
                    if (!z5) {
                        break;
                    } else {
                        if (i == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C1989c c1989c = (C1989c) ((C2582h) eVar.f5106k[i - 1]).f20767a.invoke();
                        if (!(c1989c == null ? true : c2588k2.A0(c1989c, c2588k2.f20795F))) {
                            break;
                        } else {
                            ((C2582h) eVar.l(eVar.f5108m - 1)).f20768b.resumeWith(oVar);
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f65l = i;
        this.f66m = obj;
        this.f67n = obj2;
        this.f68o = obj3;
    }
}
