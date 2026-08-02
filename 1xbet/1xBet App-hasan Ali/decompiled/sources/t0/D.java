package t0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.C2268h;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class D extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19436k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f19437l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f19438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(long j5, E e3, a4.c cVar) {
        super(2, cVar);
        this.f19437l = j5;
        this.f19438m = e3;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new D(this.f19437l, this.f19438m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (p4.AbstractC2282w.f(8, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (p4.AbstractC2282w.f(r4 - 8, r10) == r0) goto L15;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19436k;
        long j5 = this.f19437l;
        if (i == 0) {
            G4.l.N(obj);
            this.f19436k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                C2268h c2268h = this.f19438m.f19441m;
                if (c2268h != null) {
                    c2268h.resumeWith(G4.l.p(new l(j5)));
                }
                return W3.o.f6046a;
            }
            G4.l.N(obj);
        }
        this.f19436k = 2;
    }
}
