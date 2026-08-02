package E5;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class i extends P5.a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    private Path f7501q;

    /* renamed from: r, reason: collision with root package name */
    private final P5.a<PointF> f7502r;

    public i(B5.g gVar, P5.a<PointF> aVar) {
        super(gVar, aVar.f21849b, aVar.f21850c, aVar.f21851d, aVar.f21852e, aVar.f21853f, aVar.f21854g, aVar.f21855h);
        this.f7502r = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        T t2;
        T t11 = this.f21850c;
        T t12 = this.f21849b;
        boolean z11 = (t11 == 0 || t12 == 0 || !((PointF) t12).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        if (t12 == 0 || (t2 = this.f21850c) == 0 || z11) {
            return;
        }
        PointF pointF = (PointF) t12;
        PointF pointF2 = (PointF) t2;
        P5.a<PointF> aVar = this.f7502r;
        PointF pointF3 = aVar.f21862o;
        PointF pointF4 = aVar.f21863p;
        int i11 = O5.g.f19991f;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f7 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f7, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f7501q = path;
    }

    final Path j() {
        return this.f7501q;
    }
}
