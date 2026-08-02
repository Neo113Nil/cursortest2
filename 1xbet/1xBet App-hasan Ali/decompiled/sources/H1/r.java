package H1;

import G1.C0140k;
import P.C0297i0;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.List;
import java.util.concurrent.CancellationException;
import s4.InterfaceC2368e;

/* loaded from: classes.dex */
public final class r extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2236k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2237l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f2238m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2239n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0297i0 f2240o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2241p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i iVar, InterfaceC0289e0 interfaceC0289e0, C0297i0 c0297i0, InterfaceC0289e0 interfaceC0289e02, a4.c cVar) {
        super(2, cVar);
        this.f2238m = iVar;
        this.f2239n = interfaceC0289e0;
        this.f2240o = c0297i0;
        this.f2241p = interfaceC0289e02;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        r rVar = new r(this.f2238m, this.f2239n, this.f2240o, this.f2241p, cVar);
        rVar.f2237l = obj;
        return rVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC2368e) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        C0140k c0140k;
        C0140k c0140k2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2236k;
        i iVar = this.f2238m;
        InterfaceC0289e0 interfaceC0289e0 = this.f2239n;
        InterfaceC0289e0 interfaceC0289e02 = this.f2241p;
        try {
            if (i == 0) {
                G4.l.N(obj);
                InterfaceC2368e interfaceC2368e = (InterfaceC2368e) this.f2237l;
                int size = ((List) interfaceC0289e0.getValue()).size();
                C0297i0 c0297i0 = this.f2240o;
                if (size > 1) {
                    c0297i0.i(0.0f);
                    c0140k = (C0140k) X3.m.f0((List) interfaceC0289e0.getValue());
                    kotlin.jvm.internal.l.c(c0140k);
                    iVar.g(c0140k);
                    iVar.g((C0140k) ((List) interfaceC0289e0.getValue()).get(((List) interfaceC0289e0.getValue()).size() - 2));
                } else {
                    c0140k = null;
                }
                q qVar = new q(interfaceC0289e0, interfaceC0289e02, c0297i0, 0);
                this.f2237l = c0140k;
                this.f2236k = 1;
                if (interfaceC2368e.a(qVar, this) == enumC0510a) {
                    return enumC0510a;
                }
                c0140k2 = c0140k;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0140k2 = (C0140k) this.f2237l;
                G4.l.N(obj);
            }
            if (((List) interfaceC0289e0.getValue()).size() > 1) {
                interfaceC0289e02.setValue(Boolean.FALSE);
                kotlin.jvm.internal.l.c(c0140k2);
                iVar.e(c0140k2, false);
            }
        } catch (CancellationException unused) {
            if (((List) interfaceC0289e0.getValue()).size() > 1) {
                interfaceC0289e02.setValue(Boolean.FALSE);
            }
        }
        return W3.o.f6046a;
    }
}
