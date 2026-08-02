package E5;

import java.util.List;

/* loaded from: classes.dex */
public final class d extends g<Float> {
    public d(List<P5.a<Float>> list) {
        super(list);
    }

    @Override // E5.a
    final Object h(P5.a aVar, float f7) {
        return Float.valueOf(o(aVar, f7));
    }

    public final float n() {
        return o(b(), d());
    }

    final float o(P5.a<Float> aVar, float f7) {
        float f11;
        if (aVar.f21849b == null || aVar.f21850c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        P5.c<A> cVar = this.f7479e;
        if (cVar != 0) {
            f11 = f7;
            Float f12 = (Float) cVar.b(aVar.f21854g, aVar.f21855h.floatValue(), aVar.f21849b, aVar.f21850c, f11, e(), this.f7478d);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f7;
        }
        return O5.f.e(aVar.f(), aVar.c(), f11);
    }
}
