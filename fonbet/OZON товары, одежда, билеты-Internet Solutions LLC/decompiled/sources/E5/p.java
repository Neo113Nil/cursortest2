package E5;

import B5.v;
import E5.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f7521a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f7522b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f7523c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f7524d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f7525e;

    /* renamed from: f, reason: collision with root package name */
    private a<PointF, PointF> f7526f;

    /* renamed from: g, reason: collision with root package name */
    private a<?, PointF> f7527g;

    /* renamed from: h, reason: collision with root package name */
    private a<P5.d, P5.d> f7528h;

    /* renamed from: i, reason: collision with root package name */
    private a<Float, Float> f7529i;

    /* renamed from: j, reason: collision with root package name */
    private a<Integer, Integer> f7530j;

    /* renamed from: k, reason: collision with root package name */
    private d f7531k;

    /* renamed from: l, reason: collision with root package name */
    private d f7532l;

    /* renamed from: m, reason: collision with root package name */
    private a<?, Float> f7533m;

    /* renamed from: n, reason: collision with root package name */
    private a<?, Float> f7534n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7535o;

    public p(I5.l lVar) {
        this.f7526f = lVar.b() == null ? null : lVar.b().h();
        this.f7527g = lVar.e() == null ? null : lVar.e().h();
        this.f7528h = lVar.g() == null ? null : lVar.g().h();
        this.f7529i = lVar.f() == null ? null : lVar.f().h();
        this.f7531k = lVar.h() == null ? null : (d) lVar.h().h();
        this.f7535o = lVar.k();
        if (this.f7531k != null) {
            this.f7522b = new Matrix();
            this.f7523c = new Matrix();
            this.f7524d = new Matrix();
            this.f7525e = new float[9];
        } else {
            this.f7522b = null;
            this.f7523c = null;
            this.f7524d = null;
            this.f7525e = null;
        }
        this.f7532l = lVar.i() == null ? null : (d) lVar.i().h();
        if (lVar.d() != null) {
            this.f7530j = lVar.d().h();
        }
        if (lVar.j() != null) {
            this.f7533m = lVar.j().h();
        } else {
            this.f7533m = null;
        }
        if (lVar.c() != null) {
            this.f7534n = lVar.c().h();
        } else {
            this.f7534n = null;
        }
    }

    private void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f7525e[i11] = 0.0f;
        }
    }

    public final void a(K5.b bVar) {
        bVar.i(this.f7530j);
        bVar.i(this.f7533m);
        bVar.i(this.f7534n);
        bVar.i(this.f7526f);
        bVar.i(this.f7527g);
        bVar.i(this.f7528h);
        bVar.i(this.f7529i);
        bVar.i(this.f7531k);
        bVar.i(this.f7532l);
    }

    public final void b(a.InterfaceC0168a interfaceC0168a) {
        a<Integer, Integer> aVar = this.f7530j;
        if (aVar != null) {
            aVar.a(interfaceC0168a);
        }
        a<?, Float> aVar2 = this.f7533m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0168a);
        }
        a<?, Float> aVar3 = this.f7534n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0168a);
        }
        a<PointF, PointF> aVar4 = this.f7526f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0168a);
        }
        a<?, PointF> aVar5 = this.f7527g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0168a);
        }
        a<P5.d, P5.d> aVar6 = this.f7528h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0168a);
        }
        a<Float, Float> aVar7 = this.f7529i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0168a);
        }
        d dVar = this.f7531k;
        if (dVar != null) {
            dVar.a(interfaceC0168a);
        }
        d dVar2 = this.f7532l;
        if (dVar2 != null) {
            dVar2.a(interfaceC0168a);
        }
    }

    public final boolean c(P5.c cVar, Object obj) {
        if (obj == v.f2785a) {
            a<PointF, PointF> aVar = this.f7526f;
            if (aVar == null) {
                this.f7526f = new q(cVar, new PointF());
                return true;
            }
            aVar.m(cVar);
            return true;
        }
        if (obj == v.f2786b) {
            a<?, PointF> aVar2 = this.f7527g;
            if (aVar2 == null) {
                this.f7527g = new q(cVar, new PointF());
                return true;
            }
            aVar2.m(cVar);
            return true;
        }
        if (obj == v.f2787c) {
            a<?, PointF> aVar3 = this.f7527g;
            if (aVar3 instanceof n) {
                ((n) aVar3).o(cVar);
                return true;
            }
        }
        if (obj == v.f2788d) {
            a<?, PointF> aVar4 = this.f7527g;
            if (aVar4 instanceof n) {
                ((n) aVar4).p(cVar);
                return true;
            }
        }
        if (obj == v.f2794j) {
            a<P5.d, P5.d> aVar5 = this.f7528h;
            if (aVar5 == null) {
                this.f7528h = new q(cVar, new P5.d());
                return true;
            }
            aVar5.m(cVar);
            return true;
        }
        if (obj == v.f2795k) {
            a<Float, Float> aVar6 = this.f7529i;
            if (aVar6 == null) {
                this.f7529i = new q(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.m(cVar);
            return true;
        }
        if (obj == 3) {
            a<Integer, Integer> aVar7 = this.f7530j;
            if (aVar7 == null) {
                this.f7530j = new q(cVar, 100);
                return true;
            }
            aVar7.m(cVar);
            return true;
        }
        if (obj == v.f2808x) {
            a<?, Float> aVar8 = this.f7533m;
            if (aVar8 == null) {
                this.f7533m = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.m(cVar);
            return true;
        }
        if (obj == v.f2809y) {
            a<?, Float> aVar9 = this.f7534n;
            if (aVar9 == null) {
                this.f7534n = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.m(cVar);
            return true;
        }
        if (obj == v.f2796l) {
            if (this.f7531k == null) {
                this.f7531k = new d(Collections.singletonList(new P5.a(Float.valueOf(0.0f))));
            }
            this.f7531k.m(cVar);
            return true;
        }
        if (obj != v.f2797m) {
            return false;
        }
        if (this.f7532l == null) {
            this.f7532l = new d(Collections.singletonList(new P5.a(Float.valueOf(0.0f))));
        }
        this.f7532l.m(cVar);
        return true;
    }

    public final a<?, Float> e() {
        return this.f7534n;
    }

    public final Matrix f() {
        PointF g10;
        P5.d g11;
        PointF g12;
        Matrix matrix = this.f7521a;
        matrix.reset();
        a<?, PointF> aVar = this.f7527g;
        if (aVar != null && (g12 = aVar.g()) != null) {
            float f7 = g12.x;
            if (f7 != 0.0f || g12.y != 0.0f) {
                matrix.preTranslate(f7, g12.y);
            }
        }
        if (!this.f7535o) {
            a<Float, Float> aVar2 = this.f7529i;
            if (aVar2 != null) {
                float floatValue = aVar2 instanceof q ? aVar2.g().floatValue() : ((d) aVar2).n();
                if (floatValue != 0.0f) {
                    matrix.preRotate(floatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f7478d;
            PointF g13 = aVar.g();
            float f12 = g13.x;
            float f13 = g13.y;
            aVar.l(1.0E-4f + f11);
            PointF g14 = aVar.g();
            aVar.l(f11);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(g14.y - f13, g14.x - f12)));
        }
        if (this.f7531k != null) {
            float cos = this.f7532l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.n()) + 90.0f));
            float sin = this.f7532l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.n()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r1.n()));
            d();
            float[] fArr = this.f7525e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f7522b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f7523c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f14;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f7524d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<P5.d, P5.d> aVar3 = this.f7528h;
        if (aVar3 != null && (g11 = aVar3.g()) != null && (g11.b() != 1.0f || g11.c() != 1.0f)) {
            matrix.preScale(g11.b(), g11.c());
        }
        a<PointF, PointF> aVar4 = this.f7526f;
        if (aVar4 != null && (g10 = aVar4.g()) != null) {
            float f15 = g10.x;
            if (f15 != 0.0f || g10.y != 0.0f) {
                matrix.preTranslate(-f15, -g10.y);
            }
        }
        return matrix;
    }

    public final Matrix g(float f7) {
        a<?, PointF> aVar = this.f7527g;
        PointF g10 = aVar == null ? null : aVar.g();
        a<P5.d, P5.d> aVar2 = this.f7528h;
        P5.d g11 = aVar2 == null ? null : aVar2.g();
        Matrix matrix = this.f7521a;
        matrix.reset();
        if (g10 != null) {
            matrix.preTranslate(g10.x * f7, g10.y * f7);
        }
        if (g11 != null) {
            double d11 = f7;
            matrix.preScale((float) Math.pow(g11.b(), d11), (float) Math.pow(g11.c(), d11));
        }
        a<Float, Float> aVar3 = this.f7529i;
        if (aVar3 != null) {
            float floatValue = aVar3.g().floatValue();
            a<PointF, PointF> aVar4 = this.f7526f;
            PointF g12 = aVar4 != null ? aVar4.g() : null;
            matrix.preRotate(floatValue * f7, g12 == null ? 0.0f : g12.x, g12 != null ? g12.y : 0.0f);
        }
        return matrix;
    }

    public final a<?, Integer> h() {
        return this.f7530j;
    }

    public final a<?, Float> i() {
        return this.f7533m;
    }

    public final void j(float f7) {
        a<Integer, Integer> aVar = this.f7530j;
        if (aVar != null) {
            aVar.l(f7);
        }
        a<?, Float> aVar2 = this.f7533m;
        if (aVar2 != null) {
            aVar2.l(f7);
        }
        a<?, Float> aVar3 = this.f7534n;
        if (aVar3 != null) {
            aVar3.l(f7);
        }
        a<PointF, PointF> aVar4 = this.f7526f;
        if (aVar4 != null) {
            aVar4.l(f7);
        }
        a<?, PointF> aVar5 = this.f7527g;
        if (aVar5 != null) {
            aVar5.l(f7);
        }
        a<P5.d, P5.d> aVar6 = this.f7528h;
        if (aVar6 != null) {
            aVar6.l(f7);
        }
        a<Float, Float> aVar7 = this.f7529i;
        if (aVar7 != null) {
            aVar7.l(f7);
        }
        d dVar = this.f7531k;
        if (dVar != null) {
            dVar.l(f7);
        }
        d dVar2 = this.f7532l;
        if (dVar2 != null) {
            dVar2.l(f7);
        }
    }
}
