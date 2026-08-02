package J5;

import B4.V;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f14055a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f14056b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14057c;

    public o(PointF pointF, boolean z11, List<H5.a> list) {
        this.f14056b = pointF;
        this.f14057c = z11;
        this.f14055a = new ArrayList(list);
    }

    public final List<H5.a> a() {
        return this.f14055a;
    }

    public final PointF b() {
        return this.f14056b;
    }

    public final void c(o oVar, o oVar2, float f7) {
        if (this.f14056b == null) {
            this.f14056b = new PointF();
        }
        this.f14057c = oVar.f14057c || oVar2.f14057c;
        ArrayList arrayList = oVar.f14055a;
        int size = arrayList.size();
        int size2 = oVar2.f14055a.size();
        ArrayList arrayList2 = oVar2.f14055a;
        if (size != size2) {
            O5.c.c("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = this.f14055a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new H5.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = oVar.f14056b;
        PointF pointF2 = oVar2.f14056b;
        f(O5.f.e(pointF.x, pointF2.x, f7), O5.f.e(pointF.y, pointF2.y, f7));
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            H5.a aVar = (H5.a) arrayList.get(size5);
            H5.a aVar2 = (H5.a) arrayList2.get(size5);
            PointF a11 = aVar.a();
            PointF b11 = aVar.b();
            PointF c11 = aVar.c();
            PointF a12 = aVar2.a();
            PointF b12 = aVar2.b();
            PointF c12 = aVar2.c();
            ((H5.a) arrayList3.get(size5)).d(O5.f.e(a11.x, a12.x, f7), O5.f.e(a11.y, a12.y, f7));
            ((H5.a) arrayList3.get(size5)).e(O5.f.e(b11.x, b12.x, f7), O5.f.e(b11.y, b12.y, f7));
            ((H5.a) arrayList3.get(size5)).f(O5.f.e(c11.x, c12.x, f7), O5.f.e(c11.y, c12.y, f7));
        }
    }

    public final boolean d() {
        return this.f14057c;
    }

    public final void e(boolean z11) {
        this.f14057c = z11;
    }

    public final void f(float f7, float f11) {
        if (this.f14056b == null) {
            this.f14056b = new PointF();
        }
        this.f14056b.set(f7, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f14055a.size());
        sb2.append("closed=");
        return V.d(sb2, this.f14057c, '}');
    }

    public o() {
        this.f14055a = new ArrayList();
    }
}
