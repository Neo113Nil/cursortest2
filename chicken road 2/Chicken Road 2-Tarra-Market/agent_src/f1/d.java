package f1;

import K0.i;
import O0.g;
import U0.p;
import d1.r;

/* loaded from: classes.dex */
public final class d extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f1046e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.b f1048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e1.b bVar, M0.d dVar) {
        super(dVar);
        this.f1048g = bVar;
    }

    @Override // O0.b
    public final M0.d a(Object obj, M0.d dVar) {
        d dVar2 = new d(this.f1048g, dVar);
        dVar2.f1047f = obj;
        return dVar2;
    }

    @Override // O0.b
    public final Object b(Object obj) {
        N0.a aVar = N0.a.f260a;
        int i2 = this.f1046e;
        if (i2 == 0) {
            V.a.C(obj);
            r rVar = (r) this.f1047f;
            this.f1046e = 1;
            if (this.f1048g.a(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.a.C(obj);
        }
        return i.f206a;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) a((r) obj, (M0.d) obj2)).b(i.f206a);
    }
}
