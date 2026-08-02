package E5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f7503i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f7504j;

    /* renamed from: k, reason: collision with root package name */
    private final PathMeasure f7505k;

    /* renamed from: l, reason: collision with root package name */
    private i f7506l;

    public j(ArrayList arrayList) {
        super(arrayList);
        this.f7503i = new PointF();
        this.f7504j = new float[2];
        this.f7505k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E5.a
    public final Object h(P5.a aVar, float f7) {
        float f11;
        i iVar = (i) aVar;
        Path j11 = iVar.j();
        if (j11 == null) {
            return (PointF) aVar.f21849b;
        }
        P5.c<A> cVar = this.f7479e;
        if (cVar != 0) {
            f11 = f7;
            PointF pointF = (PointF) cVar.b(iVar.f21854g, iVar.f21855h.floatValue(), (PointF) iVar.f21849b, (PointF) iVar.f21850c, e(), f11, this.f7478d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f11 = f7;
        }
        i iVar2 = this.f7506l;
        PathMeasure pathMeasure = this.f7505k;
        if (iVar2 != iVar) {
            pathMeasure.setPath(j11, false);
            this.f7506l = iVar;
        }
        float length = pathMeasure.getLength() * f11;
        float[] fArr = this.f7504j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.f7503i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
