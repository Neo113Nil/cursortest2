package e0;

import W0.m;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import i0.AbstractC1998c;
import i0.C1997b;
import i0.InterfaceC2009n;
import k0.C2021a;
import k0.C2022b;

/* loaded from: classes.dex */
public final class b extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final W0.d f16892a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16893b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.c f16894c;

    public b(W0.d dVar, long j5, i4.c cVar) {
        this.f16892a = dVar;
        this.f16893b = j5;
        this.f16894c = cVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C2022b c2022b = new C2022b();
        m mVar = m.f6016k;
        Canvas canvas2 = AbstractC1998c.f17269a;
        C1997b c1997b = new C1997b();
        c1997b.f17266a = canvas;
        C2021a c2021a = c2022b.f17539k;
        W0.c cVar = c2021a.f17535a;
        m mVar2 = c2021a.f17536b;
        InterfaceC2009n interfaceC2009n = c2021a.f17537c;
        long j5 = c2021a.f17538d;
        c2021a.f17535a = this.f16892a;
        c2021a.f17536b = mVar;
        c2021a.f17537c = c1997b;
        c2021a.f17538d = this.f16893b;
        c1997b.k();
        this.f16894c.c(c2022b);
        c1997b.j();
        c2021a.f17535a = cVar;
        c2021a.f17536b = mVar2;
        c2021a.f17537c = interfaceC2009n;
        c2021a.f17538d = j5;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j5 = this.f16893b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        W0.d dVar = this.f16892a;
        point.set(L1.a.b(intBitsToFloat / dVar.c(), dVar), L1.a.b(Float.intBitsToFloat((int) (j5 & 4294967295L)) / dVar.c(), dVar));
        point2.set(point.x / 2, point.y / 2);
    }
}
