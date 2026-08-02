package D5;

import B5.v;
import E5.a;
import J5.t;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class o implements a.InterfaceC0168a, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f6042c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6043d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.g f6044e;

    /* renamed from: f, reason: collision with root package name */
    private final E5.a<?, PointF> f6045f;

    /* renamed from: g, reason: collision with root package name */
    private final E5.a<?, PointF> f6046g;

    /* renamed from: h, reason: collision with root package name */
    private final E5.d f6047h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6050k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f6040a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f6041b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f6048i = new b();

    /* renamed from: j, reason: collision with root package name */
    private E5.a<Float, Float> f6049j = null;

    public o(com.airbnb.lottie.g gVar, K5.b bVar, J5.l lVar) {
        this.f6042c = lVar.c();
        this.f6043d = lVar.f();
        this.f6044e = gVar;
        E5.a<PointF, PointF> h11 = lVar.d().h();
        this.f6045f = h11;
        E5.a<PointF, PointF> h12 = ((I5.f) lVar.e()).h();
        this.f6046g = h12;
        E5.a<?, ?> h13 = lVar.b().h();
        this.f6047h = (E5.d) h13;
        bVar.i(h11);
        bVar.i(h12);
        bVar.i(h13);
        h11.a(this);
        h12.a(this);
        h13.a(this);
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        if (obj == v.f2791g) {
            this.f6046g.m(cVar);
        } else if (obj == v.f2793i) {
            this.f6045f.m(cVar);
        } else if (obj == v.f2792h) {
            this.f6047h.m(cVar);
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6050k = false;
        this.f6044e.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i11 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f6048i.a(uVar);
                    uVar.c(this);
                    i11++;
                }
            }
            if (cVar instanceof q) {
                this.f6049j = ((q) cVar).d();
            }
            i11++;
        }
    }

    @Override // D5.c
    public final String getName() {
        return this.f6042c;
    }

    @Override // D5.m
    public final Path getPath() {
        float f7;
        E5.a<Float, Float> aVar;
        boolean z11 = this.f6050k;
        Path path = this.f6040a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f6043d) {
            this.f6050k = true;
            return path;
        }
        PointF g10 = this.f6046g.g();
        float f11 = g10.x / 2.0f;
        float f12 = g10.y / 2.0f;
        E5.d dVar = this.f6047h;
        float n11 = dVar == null ? 0.0f : dVar.n();
        if (n11 == 0.0f && (aVar = this.f6049j) != null) {
            n11 = Math.min(aVar.g().floatValue(), Math.min(f11, f12));
        }
        float min = Math.min(f11, f12);
        if (n11 > min) {
            n11 = min;
        }
        PointF g11 = this.f6045f.g();
        path.moveTo(g11.x + f11, (g11.y - f12) + n11);
        path.lineTo(g11.x + f11, (g11.y + f12) - n11);
        RectF rectF = this.f6041b;
        if (n11 > 0.0f) {
            float f13 = g11.x + f11;
            float f14 = n11 * 2.0f;
            f7 = 2.0f;
            float f15 = g11.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f7 = 2.0f;
        }
        path.lineTo((g11.x - f11) + n11, g11.y + f12);
        if (n11 > 0.0f) {
            float f16 = g11.x - f11;
            float f17 = g11.y + f12;
            float f18 = n11 * f7;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(g11.x - f11, (g11.y - f12) + n11);
        if (n11 > 0.0f) {
            float f19 = g11.x - f11;
            float f21 = g11.y - f12;
            float f22 = n11 * f7;
            rectF.set(f19, f21, f19 + f22, f22 + f21);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((g11.x + f11) - n11, g11.y - f12);
        if (n11 > 0.0f) {
            float f23 = g11.x + f11;
            float f24 = n11 * f7;
            float f25 = g11.y - f12;
            rectF.set(f23 - f24, f25, f23, f24 + f25);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f6048i.b(path);
        this.f6050k = true;
        return path;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
