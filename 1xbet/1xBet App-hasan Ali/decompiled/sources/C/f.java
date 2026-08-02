package C;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1989c;
import i0.K;
import i4.InterfaceC2015a;
import java.util.concurrent.CancellationException;
import k0.C2023c;
import kotlin.jvm.internal.m;
import l4.C2062d;
import p4.C2268h;
import p4.InterfaceC2280u;
import r0.AbstractC2346c;
import x.C2582h;
import x.C2588k;
import z0.e0;

/* loaded from: classes.dex */
public final class f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f785k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f788n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i iVar, e0 e0Var, InterfaceC2015a interfaceC2015a, a4.c cVar) {
        super(2, cVar);
        this.f786l = iVar;
        this.f787m = e0Var;
        this.f788n = (m) interfaceC2015a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new f(this.f786l, this.f787m, this.f788n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ce, code lost:
    
        if (r13 == r0) goto L41;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f785k;
        o oVar = o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return oVar;
        }
        l.N(obj);
        i iVar = this.f786l;
        C2588k c2588k = iVar.f798y;
        e eVar = new e(iVar, this.f787m, this.f788n);
        this.f785k = 1;
        c2588k.getClass();
        C1989c c1989c = (C1989c) eVar.invoke();
        if (c1989c != null && !c2588k.A0(c1989c, c2588k.f20795F)) {
            C2268h c2268h = new C2268h(1, AbstractC2346c.v(this));
            c2268h.r();
            C2582h c2582h = new C2582h(eVar, c2268h);
            C2023c c2023c = c2588k.f20791B;
            c2023c.getClass();
            C1989c c1989c2 = (C1989c) eVar.invoke();
            if (c1989c2 == null) {
                c2268h.resumeWith(oVar);
            } else {
                c2268h.t(new K(12, c2023c, c2582h));
                R.e eVar2 = (R.e) c2023c.f17544l;
                int i5 = new C2062d(0, eVar2.f5108m - 1, 1).f17852l;
                if (i5 >= 0) {
                    while (true) {
                        C1989c c1989c3 = (C1989c) ((C2582h) eVar2.f5106k[i5]).f20767a.invoke();
                        if (c1989c3 != null) {
                            C1989c c5 = c1989c2.c(c1989c3);
                            if (c5.equals(c1989c2)) {
                                eVar2.a(i5 + 1, c2582h);
                                break;
                            }
                            if (!c5.equals(c1989c3)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i6 = eVar2.f5108m - 1;
                                if (i6 <= i5) {
                                    while (true) {
                                        ((C2582h) eVar2.f5106k[i5]).f20768b.g(cancellationException);
                                        if (i6 == i5) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        if (i5 == 0) {
                            break;
                        }
                        i5--;
                    }
                }
                eVar2.a(0, c2582h);
                if (!c2588k.f20796G) {
                    c2588k.B0();
                }
            }
            obj2 = c2268h.q();
        }
        obj2 = oVar;
        return obj2 == enumC0510a ? enumC0510a : oVar;
    }
}
