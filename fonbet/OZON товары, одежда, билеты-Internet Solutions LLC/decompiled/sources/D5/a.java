package D5;

import B5.v;
import E5.a;
import J5.t;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class a implements a.InterfaceC0168a, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.g f5940e;

    /* renamed from: f, reason: collision with root package name */
    protected final K5.b f5941f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f5943h;

    /* renamed from: i, reason: collision with root package name */
    final C5.a f5944i;

    /* renamed from: j, reason: collision with root package name */
    private final E5.d f5945j;

    /* renamed from: k, reason: collision with root package name */
    private final E5.f f5946k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f5947l;

    /* renamed from: m, reason: collision with root package name */
    private final E5.d f5948m;

    /* renamed from: n, reason: collision with root package name */
    private E5.q f5949n;

    /* renamed from: o, reason: collision with root package name */
    private E5.a<Float, Float> f5950o;

    /* renamed from: p, reason: collision with root package name */
    float f5951p;

    /* renamed from: q, reason: collision with root package name */
    private E5.c f5952q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f5936a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f5937b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f5938c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f5939d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f5942g = new ArrayList();

    /* renamed from: D5.a$a, reason: collision with other inner class name */
    private static final class C0132a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f5953a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final u f5954b;

        C0132a(u uVar) {
            this.f5954b = uVar;
        }
    }

    a(com.airbnb.lottie.g gVar, K5.b bVar, Paint.Cap cap, Paint.Join join, float f7, I5.d dVar, I5.b bVar2, List<I5.b> list, I5.b bVar3) {
        C5.a aVar = new C5.a(1);
        this.f5944i = aVar;
        this.f5951p = 0.0f;
        this.f5940e = gVar;
        this.f5941f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f7);
        this.f5946k = (E5.f) dVar.h();
        this.f5945j = (E5.d) bVar2.h();
        if (bVar3 == null) {
            this.f5948m = null;
        } else {
            this.f5948m = (E5.d) bVar3.h();
        }
        this.f5947l = new ArrayList(list.size());
        this.f5943h = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f5947l.add(list.get(i11).h());
        }
        bVar.i(this.f5946k);
        bVar.i(this.f5945j);
        for (int i12 = 0; i12 < this.f5947l.size(); i12++) {
            bVar.i((E5.a) this.f5947l.get(i12));
        }
        E5.d dVar2 = this.f5948m;
        if (dVar2 != null) {
            bVar.i(dVar2);
        }
        this.f5946k.a(this);
        this.f5945j.a(this);
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((E5.a) this.f5947l.get(i13)).a(this);
        }
        E5.d dVar3 = this.f5948m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (bVar.n() != null) {
            E5.a<Float, Float> h11 = bVar.n().a().h();
            this.f5950o = h11;
            h11.a(this);
            bVar.i(this.f5950o);
        }
        if (bVar.p() != null) {
            this.f5952q = new E5.c(this, bVar, bVar.p());
        }
    }

    @Override // D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        int i11 = B5.c.f2729d;
        Path path = this.f5937b;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f5942g;
            if (i12 >= arrayList.size()) {
                RectF rectF2 = this.f5939d;
                path.computeBounds(rectF2, false);
                float n11 = this.f5945j.n() / 2.0f;
                rectF2.set(rectF2.left - n11, rectF2.top - n11, rectF2.right + n11, rectF2.bottom + n11);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                int i13 = B5.c.f2729d;
                return;
            }
            C0132a c0132a = (C0132a) arrayList.get(i12);
            for (int i14 = 0; i14 < c0132a.f5953a.size(); i14++) {
                path.addPath(((m) c0132a.f5953a.get(i14)).getPath(), matrix);
            }
            i12++;
        }
    }

    @Override // H5.f
    public void d(P5.c cVar, Object obj) {
        PointF pointF = v.f2785a;
        if (obj == 4) {
            this.f5946k.m(cVar);
            return;
        }
        if (obj == v.f2798n) {
            this.f5945j.m(cVar);
            return;
        }
        ColorFilter colorFilter = v.f2780F;
        K5.b bVar = this.f5941f;
        if (obj == colorFilter) {
            E5.q qVar = this.f5949n;
            if (qVar != null) {
                bVar.r(qVar);
            }
            if (cVar == null) {
                this.f5949n = null;
                return;
            }
            E5.q qVar2 = new E5.q(cVar, null);
            this.f5949n = qVar2;
            qVar2.a(this);
            bVar.i(this.f5949n);
            return;
        }
        if (obj == v.f2789e) {
            E5.a<Float, Float> aVar = this.f5950o;
            if (aVar != null) {
                aVar.m(cVar);
                return;
            }
            E5.q qVar3 = new E5.q(cVar, null);
            this.f5950o = qVar3;
            qVar3.a(this);
            bVar.i(this.f5950o);
            return;
        }
        E5.c cVar2 = this.f5952q;
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
    public void e(Canvas canvas, Matrix matrix, int i11) {
        float f7;
        float f11;
        float[] fArr;
        a aVar = this;
        int i12 = B5.c.f2729d;
        if (O5.g.e(matrix)) {
            return;
        }
        float f12 = 100.0f;
        int i13 = O5.f.f19985b;
        boolean z11 = false;
        int max = Math.max(0, Math.min(255, (int) ((((i11 / 255.0f) * aVar.f5946k.n()) / 100.0f) * 255.0f)));
        C5.a aVar2 = aVar.f5944i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(O5.g.d(matrix) * aVar.f5945j.n());
        float f13 = 0.0f;
        if (aVar2.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = aVar.f5947l;
        float f14 = 1.0f;
        if (!arrayList.isEmpty()) {
            float d11 = O5.g.d(matrix);
            int i14 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f5943h;
                if (i14 >= size) {
                    break;
                }
                float floatValue = ((Float) ((E5.a) arrayList.get(i14)).g()).floatValue();
                fArr[i14] = floatValue;
                if (i14 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i14] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i14] = 0.1f;
                }
                fArr[i14] = fArr[i14] * d11;
                i14++;
            }
            E5.d dVar = aVar.f5948m;
            aVar2.setPathEffect(new DashPathEffect(fArr, dVar == null ? 0.0f : dVar.g().floatValue() * d11));
            int i15 = B5.c.f2729d;
        }
        E5.q qVar = aVar.f5949n;
        if (qVar != null) {
            aVar2.setColorFilter((ColorFilter) qVar.g());
        }
        E5.a<Float, Float> aVar3 = aVar.f5950o;
        if (aVar3 != null) {
            float floatValue2 = aVar3.g().floatValue();
            if (floatValue2 == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue2 != aVar.f5951p) {
                aVar2.setMaskFilter(aVar.f5941f.o(floatValue2));
            }
            aVar.f5951p = floatValue2;
        }
        E5.c cVar = aVar.f5952q;
        if (cVar != null) {
            cVar.a(aVar2);
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f5942g;
            if (i16 >= arrayList2.size()) {
                int i17 = B5.c.f2729d;
                return;
            }
            C0132a c0132a = (C0132a) arrayList2.get(i16);
            u uVar = c0132a.f5954b;
            Path path = aVar.f5937b;
            if (uVar != null) {
                int i18 = B5.c.f2729d;
                if (c0132a.f5954b != null) {
                    path.reset();
                    for (int size2 = c0132a.f5953a.size() - 1; size2 >= 0; size2--) {
                        path.addPath(((m) c0132a.f5953a.get(size2)).getPath(), matrix);
                    }
                    float floatValue3 = c0132a.f5954b.i().g().floatValue() / f12;
                    float floatValue4 = c0132a.f5954b.d().g().floatValue() / f12;
                    float floatValue5 = c0132a.f5954b.h().g().floatValue() / 360.0f;
                    if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                        PathMeasure pathMeasure = aVar.f5936a;
                        pathMeasure.setPath(path, z11);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length += pathMeasure.getLength();
                        }
                        float f15 = floatValue5 * length;
                        float f16 = (floatValue3 * length) + f15;
                        float min = Math.min((floatValue4 * length) + f15, (f16 + length) - f14);
                        int size3 = c0132a.f5953a.size() - 1;
                        float f17 = f13;
                        while (size3 >= 0) {
                            Path path2 = aVar.f5938c;
                            path2.set(((m) c0132a.f5953a.get(size3)).getPath());
                            path2.transform(matrix);
                            pathMeasure.setPath(path2, z11);
                            float length2 = pathMeasure.getLength();
                            if (min > length) {
                                float f18 = min - length;
                                if (f18 < f17 + length2 && f17 < f18) {
                                    O5.g.a(path2, f16 > length ? (f16 - length) / length2 : 0.0f, Math.min(f18 / length2, f14), 0.0f);
                                    canvas.drawPath(path2, aVar2);
                                    f11 = 0.0f;
                                    f17 += length2;
                                    size3--;
                                    aVar = this;
                                    f13 = f11;
                                    z11 = false;
                                    f14 = 1.0f;
                                }
                            }
                            float f19 = f17 + length2;
                            if (f19 >= f16 && f17 <= min) {
                                if (f19 > min || f16 >= f17) {
                                    f11 = 0.0f;
                                    O5.g.a(path2, f16 < f17 ? 0.0f : (f16 - f17) / length2, min > f19 ? 1.0f : (min - f17) / length2, 0.0f);
                                    canvas.drawPath(path2, aVar2);
                                    f17 += length2;
                                    size3--;
                                    aVar = this;
                                    f13 = f11;
                                    z11 = false;
                                    f14 = 1.0f;
                                } else {
                                    canvas.drawPath(path2, aVar2);
                                }
                            }
                            f11 = 0.0f;
                            f17 += length2;
                            size3--;
                            aVar = this;
                            f13 = f11;
                            z11 = false;
                            f14 = 1.0f;
                        }
                        f7 = f13;
                        int i19 = B5.c.f2729d;
                    } else {
                        canvas.drawPath(path, aVar2);
                        int i21 = B5.c.f2729d;
                    }
                }
                f7 = f13;
            } else {
                f7 = f13;
                int i22 = B5.c.f2729d;
                path.reset();
                for (int size4 = c0132a.f5953a.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((m) c0132a.f5953a.get(size4)).getPath(), matrix);
                }
                int i23 = B5.c.f2729d;
                canvas.drawPath(path, aVar2);
            }
            i16++;
            aVar = this;
            f13 = f7;
            z11 = false;
            f12 = 100.0f;
            f14 = 1.0f;
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f5940e.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0132a c0132a = null;
        u uVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f5942g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == t.a.INDIVIDUALLY) {
                    if (c0132a != null) {
                        arrayList.add(c0132a);
                    }
                    C0132a c0132a2 = new C0132a(uVar3);
                    uVar3.c(this);
                    c0132a = c0132a2;
                }
            }
            if (cVar2 instanceof m) {
                if (c0132a == null) {
                    c0132a = new C0132a(uVar);
                }
                c0132a.f5953a.add((m) cVar2);
            }
        }
        if (c0132a != null) {
            arrayList.add(c0132a);
        }
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
