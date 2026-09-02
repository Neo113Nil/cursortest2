package q0;

import W.g;
import a.AbstractC0018a;
import a0.f;
import f0.p;
import o0.r;

/* loaded from: classes.dex */
public final class d extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1138f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p0.b f1140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p0.b bVar, Y.d dVar) {
        super(dVar);
        this.f1140h = bVar;
    }

    @Override // a0.b
    public final Y.d b(Y.d dVar, Object obj) {
        d dVar2 = new d(this.f1140h, dVar);
        dVar2.f1139g = obj;
        return dVar2;
    }

    @Override // a0.b
    public final Object c(Object obj) {
        int i2 = this.f1138f;
        if (i2 == 0) {
            AbstractC0018a.C(obj);
            r rVar = (r) this.f1139g;
            this.f1138f = 1;
            Object a2 = this.f1140h.a(rVar, this);
            Z.a aVar = Z.a.f411b;
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0018a.C(obj);
        }
        return g.f394a;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        return ((d) b((Y.d) obj2, (r) obj)).c(g.f394a);
    }
}
