package E5;

import java.util.List;

/* loaded from: classes.dex */
public final class f extends g<Integer> {
    public f(List<P5.a<Integer>> list) {
        super(list);
    }

    @Override // E5.a
    final Object h(P5.a aVar, float f7) {
        return Integer.valueOf(o(aVar, f7));
    }

    public final int n() {
        return o(b(), d());
    }

    final int o(P5.a<Integer> aVar, float f7) {
        float f11;
        if (aVar.f21849b == null || aVar.f21850c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        P5.c<A> cVar = this.f7479e;
        if (cVar != 0) {
            f11 = f7;
            Integer num = (Integer) cVar.b(aVar.f21854g, aVar.f21855h.floatValue(), aVar.f21849b, aVar.f21850c, f11, e(), this.f7478d);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f7;
        }
        int g10 = aVar.g();
        int d11 = aVar.d();
        int i11 = O5.f.f19985b;
        return (int) ((f11 * (d11 - g10)) + g10);
    }
}
