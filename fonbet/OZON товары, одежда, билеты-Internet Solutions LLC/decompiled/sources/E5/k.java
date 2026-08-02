package E5;

import Hj.C3143a;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f7507i;

    public k(List<P5.a<PointF>> list) {
        super(list);
        this.f7507i = new PointF();
    }

    @Override // E5.a
    public final Object h(P5.a aVar, float f7) {
        return i(aVar, f7, f7, f7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E5.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final PointF i(P5.a<PointF> aVar, float f7, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = aVar.f21849b;
        if (pointF2 == null || (pointF = aVar.f21850c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        P5.c<A> cVar = this.f7479e;
        if (cVar != 0) {
            PointF pointF5 = (PointF) cVar.b(aVar.f21854g, aVar.f21855h.floatValue(), pointF3, pointF4, f7, e(), this.f7478d);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.f7507i;
        float f13 = pointF3.x;
        float d11 = C3143a.d(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF6.set(d11, C3143a.d(pointF4.y, f14, f12, f14));
        return pointF6;
    }
}
