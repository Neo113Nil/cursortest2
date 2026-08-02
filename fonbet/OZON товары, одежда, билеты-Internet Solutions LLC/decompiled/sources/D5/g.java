package D5;

import B5.v;
import E5.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements e, a.InterfaceC0168a, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f5973a;

    /* renamed from: b, reason: collision with root package name */
    private final C5.a f5974b;

    /* renamed from: c, reason: collision with root package name */
    private final K5.b f5975c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5976d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5977e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f5978f;

    /* renamed from: g, reason: collision with root package name */
    private final E5.b f5979g;

    /* renamed from: h, reason: collision with root package name */
    private final E5.f f5980h;

    /* renamed from: i, reason: collision with root package name */
    private E5.q f5981i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.g f5982j;

    /* renamed from: k, reason: collision with root package name */
    private E5.a<Float, Float> f5983k;

    /* renamed from: l, reason: collision with root package name */
    float f5984l;

    /* renamed from: m, reason: collision with root package name */
    private E5.c f5985m;

    public g(com.airbnb.lottie.g gVar, K5.b bVar, J5.p pVar) {
        Path path = new Path();
        this.f5973a = path;
        C5.a aVar = new C5.a(1);
        this.f5974b = aVar;
        this.f5978f = new ArrayList();
        this.f5975c = bVar;
        this.f5976d = pVar.d();
        this.f5977e = pVar.f();
        this.f5982j = gVar;
        if (bVar.n() != null) {
            E5.a<Float, Float> h11 = bVar.n().a().h();
            this.f5983k = h11;
            h11.a(this);
            bVar.i(this.f5983k);
        }
        if (bVar.p() != null) {
            this.f5985m = new E5.c(this, bVar, bVar.p());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f5979g = null;
            this.f5980h = null;
            return;
        }
        androidx.core.graphics.e.b(aVar, bVar.m().a());
        path.setFillType(pVar.c());
        E5.a<Integer, Integer> h12 = pVar.b().h();
        this.f5979g = (E5.b) h12;
        h12.a(this);
        bVar.i(h12);
        E5.a<Integer, Integer> h13 = pVar.e().h();
        this.f5980h = (E5.f) h13;
        h13.a(this);
        bVar.i(h13);
    }

    @Override // D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f5973a;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f5978f;
            if (i11 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i11)).getPath(), matrix);
                i11++;
            }
        }
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        PointF pointF = v.f2785a;
        if (obj == 1) {
            this.f5979g.m(cVar);
            return;
        }
        if (obj == 4) {
            this.f5980h.m(cVar);
            return;
        }
        ColorFilter colorFilter = v.f2780F;
        K5.b bVar = this.f5975c;
        if (obj == colorFilter) {
            E5.q qVar = this.f5981i;
            if (qVar != null) {
                bVar.r(qVar);
            }
            if (cVar == null) {
                this.f5981i = null;
                return;
            }
            E5.q qVar2 = new E5.q(cVar);
            this.f5981i = qVar2;
            qVar2.a(this);
            bVar.i(this.f5981i);
            return;
        }
        if (obj == v.f2789e) {
            E5.a<Float, Float> aVar = this.f5983k;
            if (aVar != null) {
                aVar.m(cVar);
                return;
            }
            E5.q qVar3 = new E5.q(cVar);
            this.f5983k = qVar3;
            qVar3.a(this);
            bVar.i(this.f5983k);
            return;
        }
        E5.c cVar2 = this.f5985m;
        if (obj == 5 && cVar2 != null) {
            cVar2.b(cVar);
            return;
        }
        if (obj == v.f2776B && cVar2 != null) {
            cVar2.e(cVar);
            return;
        }
        if (obj == v.f2777C && cVar2 != null) {
            cVar2.c(cVar);
            return;
        }
        if (obj == v.f2778D && cVar2 != null) {
            cVar2.d(cVar);
        } else {
            if (obj != v.f2779E || cVar2 == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // D5.e
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        if (this.f5977e) {
            return;
        }
        int i12 = B5.c.f2729d;
        int n11 = this.f5979g.n();
        int i13 = O5.f.f19985b;
        int i14 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i11 / 255.0f) * this.f5980h.g().intValue()) / 100.0f) * 255.0f))) << 24) | (n11 & 16777215);
        C5.a aVar = this.f5974b;
        aVar.setColor(max);
        E5.q qVar = this.f5981i;
        if (qVar != null) {
            aVar.setColorFilter((ColorFilter) qVar.g());
        }
        E5.a<Float, Float> aVar2 = this.f5983k;
        if (aVar2 != null) {
            float floatValue = aVar2.g().floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f5984l) {
                aVar.setMaskFilter(this.f5975c.o(floatValue));
            }
            this.f5984l = floatValue;
        }
        E5.c cVar = this.f5985m;
        if (cVar != null) {
            cVar.a(aVar);
        }
        Path path = this.f5973a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f5978f;
            if (i14 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                int i15 = B5.c.f2729d;
                return;
            } else {
                path.addPath(((m) arrayList.get(i14)).getPath(), matrix);
                i14++;
            }
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f5982j.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f5978f.add((m) cVar);
            }
        }
    }

    @Override // D5.c
    public final String getName() {
        return this.f5976d;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
