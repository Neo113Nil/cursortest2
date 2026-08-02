package E5;

import Cd.C2749j;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends g<Integer> {
    public b(List<P5.a<Integer>> list) {
        super(list);
    }

    @Override // E5.a
    final Object h(P5.a aVar, float f7) {
        return Integer.valueOf(o(aVar, f7));
    }

    public final int n() {
        return o(b(), d());
    }

    public final int o(P5.a<Integer> aVar, float f7) {
        float f11;
        Float f12;
        if (aVar.f21849b == null || aVar.f21850c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        P5.c<A> cVar = this.f7479e;
        Integer num = aVar.f21849b;
        if (cVar == 0 || (f12 = aVar.f21855h) == null) {
            f11 = f7;
        } else {
            f11 = f7;
            Integer num2 = (Integer) cVar.b(aVar.f21854g, f12.floatValue(), num, aVar.f21850c, f11, e(), this.f7478d);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return C2749j.e(O5.f.b(f11, 0.0f, 1.0f), num.intValue(), aVar.f21850c.intValue());
    }
}
