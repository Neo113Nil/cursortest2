package D5;

import B5.v;
import E5.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class h implements e, a.InterfaceC0168a, k {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f5986a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5987b;

    /* renamed from: c, reason: collision with root package name */
    private final K5.b f5988c;

    /* renamed from: d, reason: collision with root package name */
    private final C5153w<LinearGradient> f5989d = new C5153w<>();

    /* renamed from: e, reason: collision with root package name */
    private final C5153w<RadialGradient> f5990e = new C5153w<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f5991f;

    /* renamed from: g, reason: collision with root package name */
    private final C5.a f5992g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f5993h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f5994i;

    /* renamed from: j, reason: collision with root package name */
    private final J5.g f5995j;

    /* renamed from: k, reason: collision with root package name */
    private final E5.e f5996k;

    /* renamed from: l, reason: collision with root package name */
    private final E5.f f5997l;

    /* renamed from: m, reason: collision with root package name */
    private final E5.k f5998m;

    /* renamed from: n, reason: collision with root package name */
    private final E5.k f5999n;

    /* renamed from: o, reason: collision with root package name */
    private E5.q f6000o;

    /* renamed from: p, reason: collision with root package name */
    private E5.q f6001p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.g f6002q;

    /* renamed from: r, reason: collision with root package name */
    private final int f6003r;

    /* renamed from: s, reason: collision with root package name */
    private E5.a<Float, Float> f6004s;

    /* renamed from: t, reason: collision with root package name */
    float f6005t;

    /* renamed from: u, reason: collision with root package name */
    private E5.c f6006u;

    public h(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar, J5.e eVar) {
        Path path = new Path();
        this.f5991f = path;
        this.f5992g = new C5.a(1);
        this.f5993h = new RectF();
        this.f5994i = new ArrayList();
        this.f6005t = 0.0f;
        this.f5988c = bVar;
        this.f5986a = eVar.f();
        this.f5987b = eVar.i();
        this.f6002q = gVar;
        this.f5995j = eVar.e();
        path.setFillType(eVar.c());
        this.f6003r = (int) (gVar2.d() / 32.0f);
        E5.a<J5.d, J5.d> h11 = eVar.d().h();
        this.f5996k = (E5.e) h11;
        h11.a(this);
        bVar.i(h11);
        E5.a<Integer, Integer> h12 = eVar.g().h();
        this.f5997l = (E5.f) h12;
        h12.a(this);
        bVar.i(h12);
        E5.a<PointF, PointF> h13 = eVar.h().h();
        this.f5998m = (E5.k) h13;
        h13.a(this);
        bVar.i(h13);
        E5.a<PointF, PointF> h14 = eVar.b().h();
        this.f5999n = (E5.k) h14;
        h14.a(this);
        bVar.i(h14);
        if (bVar.n() != null) {
            E5.a<Float, Float> h15 = bVar.n().a().h();
            this.f6004s = h15;
            h15.a(this);
            bVar.i(this.f6004s);
        }
        if (bVar.p() != null) {
            this.f6006u = new E5.c(this, bVar, bVar.p());
        }
    }

    private int[] c(int[] iArr) {
        E5.q qVar = this.f6001p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.g();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        float f7 = this.f5998m.f();
        float f11 = this.f6003r;
        int round = Math.round(f7 * f11);
        int round2 = Math.round(this.f5999n.f() * f11);
        int round3 = Math.round(this.f5996k.f() * f11);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    @Override // D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f5991f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f5994i;
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
        if (obj == 4) {
            this.f5997l.m(cVar);
            return;
        }
        ColorFilter colorFilter = v.f2780F;
        K5.b bVar = this.f5988c;
        if (obj == colorFilter) {
            E5.q qVar = this.f6000o;
            if (qVar != null) {
                bVar.r(qVar);
            }
            if (cVar == null) {
                this.f6000o = null;
                return;
            }
            E5.q qVar2 = new E5.q(cVar, null);
            this.f6000o = qVar2;
            qVar2.a(this);
            bVar.i(this.f6000o);
            return;
        }
        if (obj == v.f2781G) {
            E5.q qVar3 = this.f6001p;
            if (qVar3 != null) {
                bVar.r(qVar3);
            }
            if (cVar == null) {
                this.f6001p = null;
                return;
            }
            this.f5989d.a();
            this.f5990e.a();
            E5.q qVar4 = new E5.q(cVar, null);
            this.f6001p = qVar4;
            qVar4.a(this);
            bVar.i(this.f6001p);
            return;
        }
        if (obj == v.f2789e) {
            E5.a<Float, Float> aVar = this.f6004s;
            if (aVar != null) {
                aVar.m(cVar);
                return;
            }
            E5.q qVar5 = new E5.q(cVar, null);
            this.f6004s = qVar5;
            qVar5.a(this);
            bVar.i(this.f6004s);
            return;
        }
        E5.c cVar2 = this.f6006u;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    @Override // D5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        Shader shader;
        Shader radialGradient;
        E5.q qVar;
        E5.a<Float, Float> aVar;
        E5.c cVar;
        if (this.f5987b) {
            return;
        }
        int i12 = B5.c.f2729d;
        Path path = this.f5991f;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f5994i;
            if (i13 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i13)).getPath(), matrix);
            i13++;
        }
        path.computeBounds(this.f5993h, false);
        J5.g gVar = J5.g.LINEAR;
        J5.g gVar2 = this.f5995j;
        E5.e eVar = this.f5996k;
        E5.k kVar = this.f5999n;
        E5.k kVar2 = this.f5998m;
        if (gVar2 != gVar) {
            long i14 = i();
            C5153w<RadialGradient> c5153w = this.f5990e;
            shader = (RadialGradient) c5153w.b(i14);
            if (shader == null) {
                PointF g10 = kVar2.g();
                PointF g11 = kVar.g();
                J5.d g12 = eVar.g();
                int[] c11 = c(g12.b());
                float[] c12 = g12.c();
                float f7 = g10.x;
                float f11 = g10.y;
                float hypot = (float) Math.hypot(g11.x - f7, g11.y - f11);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                radialGradient = new RadialGradient(f7, f11, hypot, c11, c12, Shader.TileMode.CLAMP);
                c5153w.f(i14, radialGradient);
                shader = radialGradient;
            }
            shader.setLocalMatrix(matrix);
            C5.a aVar2 = this.f5992g;
            aVar2.setShader(shader);
            qVar = this.f6000o;
            if (qVar != null) {
            }
            aVar = this.f6004s;
            if (aVar != null) {
            }
            cVar = this.f6006u;
            if (cVar != null) {
            }
            int i15 = O5.f.f19985b;
            aVar2.setAlpha(Math.max(0, Math.min(255, (int) ((((i11 / 255.0f) * this.f5997l.g().intValue()) / 100.0f) * 255.0f))));
            canvas.drawPath(path, aVar2);
            int i16 = B5.c.f2729d;
        }
        long i17 = i();
        C5153w<LinearGradient> c5153w2 = this.f5989d;
        shader = (LinearGradient) c5153w2.b(i17);
        if (shader == null) {
            PointF g13 = kVar2.g();
            PointF g14 = kVar.g();
            J5.d g15 = eVar.g();
            radialGradient = new LinearGradient(g13.x, g13.y, g14.x, g14.y, c(g15.b()), g15.c(), Shader.TileMode.CLAMP);
            c5153w2.f(i17, radialGradient);
            shader = radialGradient;
        }
        shader.setLocalMatrix(matrix);
        C5.a aVar22 = this.f5992g;
        aVar22.setShader(shader);
        qVar = this.f6000o;
        if (qVar != null) {
            aVar22.setColorFilter((ColorFilter) qVar.g());
        }
        aVar = this.f6004s;
        if (aVar != null) {
            float floatValue = aVar.g().floatValue();
            if (floatValue == 0.0f) {
                aVar22.setMaskFilter(null);
            } else if (floatValue != this.f6005t) {
                aVar22.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f6005t = floatValue;
        }
        cVar = this.f6006u;
        if (cVar != null) {
            cVar.a(aVar22);
        }
        int i152 = O5.f.f19985b;
        aVar22.setAlpha(Math.max(0, Math.min(255, (int) ((((i11 / 255.0f) * this.f5997l.g().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar22);
        int i162 = B5.c.f2729d;
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6002q.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f5994i.add((m) cVar);
            }
        }
    }

    @Override // D5.c
    public final String getName() {
        return this.f5986a;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
