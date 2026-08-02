package s4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class t extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19310k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f19311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2368e f19312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f19313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Float f19314o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(J j5, InterfaceC2368e interfaceC2368e, M m5, Float f, a4.c cVar) {
        super(2, cVar);
        this.f19311l = j5;
        this.f19312m = interfaceC2368e;
        this.f19313n = m5;
        this.f19314o = f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new t(this.f19311l, this.f19312m, this.f19313n, this.f19314o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (s4.C.h(r2, r7, r19) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[RETURN] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19310k;
        W3.o oVar = W3.o.f6046a;
        InterfaceC2368e interfaceC2368e = this.f19312m;
        M m5 = this.f19313n;
        if (i == 0) {
            G4.l.N(obj);
            G g5 = F.f19231a;
            J j5 = this.f19311l;
            if (j5 == g5) {
                this.f19310k = 1;
                return interfaceC2368e.a(m5, this) == enumC0510a ? enumC0510a : oVar;
            }
            if (j5 == F.f19232b) {
                t4.y h3 = m5.h();
                r rVar = new r(2, null);
                this.f19310k = 2;
            } else {
                t4.y h4 = m5.h();
                H h5 = new H(j5, null);
                int i5 = AbstractC2377n.f19289a;
                a4.i iVar = a4.i.f6649k;
                r4.a aVar = r4.a.f19106k;
                InterfaceC2368e e3 = C.e(C.e(new C2374k(new t4.n(h5, h4, iVar, -2, aVar), new I(2, null))));
                s sVar = new s(interfaceC2368e, m5, this.f19314o, null);
                this.f19310k = 4;
                Object a5 = new t4.n(new C2376m(sVar, null), e3, iVar, -2, aVar).b(iVar, 0, aVar).a(t4.s.f19629k, this);
                if (a5 != enumC0510a) {
                    a5 = oVar;
                }
                if (a5 != enumC0510a) {
                    a5 = oVar;
                }
                if (a5 == enumC0510a) {
                }
            }
        }
        if (i == 1) {
            G4.l.N(obj);
            return oVar;
        }
        if (i != 2) {
            if (i == 3) {
                G4.l.N(obj);
                return oVar;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        this.f19310k = 3;
        if (interfaceC2368e.a(m5, this) == enumC0510a) {
        }
    }
}
