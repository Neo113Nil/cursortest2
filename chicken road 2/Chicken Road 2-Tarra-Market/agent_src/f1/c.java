package f1;

import K0.i;
import O0.g;
import U0.p;
import b1.AbstractC0030s;
import b1.r;
import d1.f;
import d1.n;
import d1.q;
import e1.h;

/* loaded from: classes.dex */
public final class c extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f1042e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.d f1044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.b f1045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e1.d dVar, e1.b bVar, M0.d dVar2) {
        super(dVar2);
        this.f1044g = dVar;
        this.f1045h = bVar;
    }

    @Override // O0.b
    public final M0.d a(Object obj, M0.d dVar) {
        c cVar = new c(this.f1044g, this.f1045h, dVar);
        cVar.f1043f = obj;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
    @Override // O0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        d1.c nVar;
        d1.c cVar;
        Object a2;
        N0.a aVar = N0.a.f260a;
        int i2 = this.f1042e;
        i iVar = i.f206a;
        if (i2 == 0) {
            V.a.C(obj);
            r rVar = (r) this.f1043f;
            e1.b bVar = this.f1045h;
            int i3 = bVar.f979b;
            if (i3 == -3) {
                i3 = -2;
            }
            p dVar = new d(bVar, null);
            int i4 = bVar.f980c;
            if (i3 != -2) {
                if (i3 != -1) {
                    if (i3 == 0) {
                        nVar = i4 == 1 ? new d1.c(0, null) : new n(1, i4, null);
                    } else if (i3 != Integer.MAX_VALUE) {
                        cVar = i4 == 1 ? new d1.c(i3, null) : new n(i3, i4, null);
                    } else {
                        nVar = new d1.c(Integer.MAX_VALUE, null);
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                    }
                    cVar = new n(1, 2, null);
                }
                q qVar = new q(AbstractC0030s.f(rVar, bVar.f978a), cVar);
                qVar.L(3, qVar, dVar);
                this.f1042e = 1;
                a2 = h.a(this.f1044g, qVar, true, this);
                if (a2 != aVar) {
                    a2 = iVar;
                }
                if (a2 != aVar) {
                    return aVar;
                }
            } else if (i4 == 1) {
                d1.g.f937M.getClass();
                nVar = new d1.c(f.f936b, null);
            } else {
                nVar = new n(1, i4, null);
            }
            cVar = nVar;
            q qVar2 = new q(AbstractC0030s.f(rVar, bVar.f978a), cVar);
            qVar2.L(3, qVar2, dVar);
            this.f1042e = 1;
            a2 = h.a(this.f1044g, qVar2, true, this);
            if (a2 != aVar) {
            }
            if (a2 != aVar) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.a.C(obj);
        }
        return iVar;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) a((r) obj, (M0.d) obj2)).b(i.f206a);
    }
}
