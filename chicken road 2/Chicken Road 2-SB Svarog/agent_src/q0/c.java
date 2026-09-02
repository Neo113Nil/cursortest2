package q0;

import W.g;
import Y.i;
import a.AbstractC0018a;
import a0.f;
import f0.p;
import m0.AbstractC0062t;
import m0.r;
import o0.n;
import o0.q;
import p0.h;

/* loaded from: classes.dex */
public final class c extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1134f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p0.d f1136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0.b f1137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p0.d dVar, p0.b bVar, Y.d dVar2) {
        super(dVar2);
        this.f1136h = dVar;
        this.f1137i = bVar;
    }

    @Override // a0.b
    public final Y.d b(Y.d dVar, Object obj) {
        c cVar = new c(this.f1136h, this.f1137i, dVar);
        cVar.f1135g = obj;
        return cVar;
    }

    @Override // a0.b
    public final Object c(Object obj) {
        o0.c nVar;
        int i2 = this.f1134f;
        g gVar = g.f394a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0018a.C(obj);
            return gVar;
        }
        AbstractC0018a.C(obj);
        r rVar = (r) this.f1135g;
        p0.b bVar = this.f1137i;
        i iVar = bVar.f1107b;
        int i3 = bVar.f1108c;
        if (i3 == -3) {
            i3 = -2;
        }
        int i4 = bVar.f1109d;
        p dVar = new d(bVar, null);
        if (i3 != -2) {
            if (i3 != -1) {
                nVar = i3 != 0 ? i3 != Integer.MAX_VALUE ? i4 == 1 ? new o0.c(i3) : new n(i3, i4) : new o0.c(Integer.MAX_VALUE) : i4 == 1 ? new o0.c(0) : new n(1, i4);
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
                nVar = new n(1, 2);
            }
        } else if (i4 == 1) {
            o0.g.f1086a.getClass();
            nVar = new o0.c(o0.f.f1085b);
        } else {
            nVar = new n(1, i4);
        }
        q qVar = new q(AbstractC0062t.e(rVar, iVar), nVar);
        qVar.M(3, qVar, dVar);
        this.f1134f = 1;
        Object a2 = h.a(this.f1136h, qVar, true, this);
        Z.a aVar = Z.a.f411b;
        if (a2 != aVar) {
            a2 = gVar;
        }
        return a2 == aVar ? aVar : gVar;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        return ((c) b((Y.d) obj2, (r) obj)).c(g.f394a);
    }
}
