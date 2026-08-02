package D5;

import B5.v;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;

/* loaded from: classes8.dex */
public final class t extends a {

    /* renamed from: r, reason: collision with root package name */
    private final K5.b f6070r;

    /* renamed from: s, reason: collision with root package name */
    private final String f6071s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f6072t;

    /* renamed from: u, reason: collision with root package name */
    private final E5.b f6073u;

    /* renamed from: v, reason: collision with root package name */
    private E5.q f6074v;

    public t(com.airbnb.lottie.g gVar, K5.b bVar, J5.s sVar) {
        super(gVar, bVar, sVar.b().a(), sVar.e().a(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f6070r = bVar;
        this.f6071s = sVar.h();
        this.f6072t = sVar.k();
        E5.a<Integer, Integer> h11 = sVar.c().h();
        this.f6073u = (E5.b) h11;
        h11.a(this);
        bVar.i(h11);
    }

    @Override // D5.a, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        PointF pointF = v.f2785a;
        E5.b bVar = this.f6073u;
        if (obj == 2) {
            bVar.m(cVar);
            return;
        }
        if (obj == v.f2780F) {
            E5.q qVar = this.f6074v;
            K5.b bVar2 = this.f6070r;
            if (qVar != null) {
                bVar2.r(qVar);
            }
            if (cVar == null) {
                this.f6074v = null;
                return;
            }
            E5.q qVar2 = new E5.q(cVar, null);
            this.f6074v = qVar2;
            qVar2.a(this);
            bVar2.i(bVar);
        }
    }

    @Override // D5.a, D5.e
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        if (this.f6072t) {
            return;
        }
        int n11 = this.f6073u.n();
        C5.a aVar = this.f5944i;
        aVar.setColor(n11);
        E5.q qVar = this.f6074v;
        if (qVar != null) {
            aVar.setColorFilter((ColorFilter) qVar.g());
        }
        super.e(canvas, matrix, i11);
    }

    @Override // D5.c
    public final String getName() {
        return this.f6071s;
    }
}
