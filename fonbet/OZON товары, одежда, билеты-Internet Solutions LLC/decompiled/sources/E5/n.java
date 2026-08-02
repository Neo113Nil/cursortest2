package E5;

import E5.a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f7512i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f7513j;

    /* renamed from: k, reason: collision with root package name */
    private final d f7514k;

    /* renamed from: l, reason: collision with root package name */
    private final d f7515l;

    /* renamed from: m, reason: collision with root package name */
    protected P5.c<Float> f7516m;

    /* renamed from: n, reason: collision with root package name */
    protected P5.c<Float> f7517n;

    public n(d dVar, d dVar2) {
        super(Collections.EMPTY_LIST);
        this.f7512i = new PointF();
        this.f7513j = new PointF();
        this.f7514k = dVar;
        this.f7515l = dVar2;
        l(this.f7478d);
    }

    @Override // E5.a
    public final PointF g() {
        return n(0.0f);
    }

    @Override // E5.a
    final /* bridge */ /* synthetic */ PointF h(P5.a<PointF> aVar, float f7) {
        return n(f7);
    }

    @Override // E5.a
    public final void l(float f7) {
        d dVar = this.f7514k;
        dVar.l(f7);
        d dVar2 = this.f7515l;
        dVar2.l(f7);
        this.f7512i.set(dVar.g().floatValue(), dVar2.g().floatValue());
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f7475a;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a.InterfaceC0168a) arrayList.get(i11)).f();
            i11++;
        }
    }

    final PointF n(float f7) {
        float f11;
        Float f12;
        d dVar;
        P5.a<Float> b11;
        d dVar2;
        P5.a<Float> b12;
        Float f13 = null;
        if (this.f7516m == null || (b12 = (dVar2 = this.f7514k).b()) == null) {
            f11 = f7;
            f12 = null;
        } else {
            float d11 = dVar2.d();
            Float f14 = b12.f21855h;
            P5.c<Float> cVar = this.f7516m;
            float f15 = b12.f21854g;
            f11 = f7;
            f12 = cVar.b(f15, f14 == null ? f15 : f14.floatValue(), b12.f21849b, b12.f21850c, f7, f7, d11);
        }
        if (this.f7517n != null && (b11 = (dVar = this.f7515l).b()) != null) {
            float d12 = dVar.d();
            Float f16 = b11.f21855h;
            P5.c<Float> cVar2 = this.f7517n;
            float f17 = b11.f21854g;
            f13 = cVar2.b(f17, f16 == null ? f17 : f16.floatValue(), b11.f21849b, b11.f21850c, f11, f11, d12);
        }
        PointF pointF = this.f7512i;
        PointF pointF2 = this.f7513j;
        if (f12 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f12.floatValue(), 0.0f);
        }
        if (f13 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f13.floatValue());
        return pointF2;
    }

    public final void o(P5.c<Float> cVar) {
        P5.c<Float> cVar2 = this.f7516m;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f7516m = cVar;
    }

    public final void p(P5.c<Float> cVar) {
        P5.c<Float> cVar2 = this.f7517n;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f7517n = cVar;
    }
}
