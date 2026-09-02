package A;

import android.app.Activity;
import d1.r;

/* loaded from: classes.dex */
public final class k extends O0.g implements U0.p {

    /* renamed from: e, reason: collision with root package name */
    public int f27e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f29g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f30h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, M0.d dVar) {
        super(dVar);
        this.f29g = bVar;
        this.f30h = activity;
    }

    @Override // O0.b
    public final M0.d a(Object obj, M0.d dVar) {
        k kVar = new k(this.f29g, this.f30h, dVar);
        kVar.f28f = obj;
        return kVar;
    }

    @Override // O0.b
    public final Object b(Object obj) {
        N0.a aVar = N0.a.f260a;
        int i2 = this.f27e;
        if (i2 == 0) {
            V.a.C(obj);
            r rVar = (r) this.f28f;
            i iVar = new i(0, rVar);
            b bVar = this.f29g;
            ((B.a) bVar.f9c).a(this.f30h, new r.c(), iVar);
            j jVar = new j(bVar, iVar);
            this.f27e = 1;
            if (d1.j.a(rVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.a.C(obj);
        }
        return K0.i.f206a;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) a((r) obj, (M0.d) obj2)).b(K0.i.f206a);
    }
}
