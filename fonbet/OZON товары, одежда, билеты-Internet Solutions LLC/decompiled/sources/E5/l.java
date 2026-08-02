package E5;

import java.util.List;

/* loaded from: classes8.dex */
public final class l extends g<P5.d> {

    /* renamed from: i, reason: collision with root package name */
    private final P5.d f7508i;

    public l(List<P5.a<P5.d>> list) {
        super(list);
        this.f7508i = new P5.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E5.a
    public final Object h(P5.a aVar, float f7) {
        T t2;
        float f11;
        T t11 = aVar.f21849b;
        if (t11 == 0 || (t2 = aVar.f21850c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        P5.d dVar = (P5.d) t11;
        P5.d dVar2 = (P5.d) t2;
        P5.c<A> cVar = this.f7479e;
        if (cVar != 0) {
            f11 = f7;
            P5.d dVar3 = (P5.d) cVar.b(aVar.f21854g, aVar.f21855h.floatValue(), dVar, dVar2, f11, e(), this.f7478d);
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f11 = f7;
        }
        float e11 = O5.f.e(dVar.b(), dVar2.b(), f11);
        float e12 = O5.f.e(dVar.c(), dVar2.c(), f11);
        P5.d dVar4 = this.f7508i;
        dVar4.d(e11, e12);
        return dVar4;
    }
}
