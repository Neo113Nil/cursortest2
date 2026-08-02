package D5;

import B5.v;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C5153w;

/* loaded from: classes8.dex */
public final class i extends a {

    /* renamed from: A, reason: collision with root package name */
    private final E5.k f6007A;

    /* renamed from: B, reason: collision with root package name */
    private E5.q f6008B;

    /* renamed from: r, reason: collision with root package name */
    private final String f6009r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6010s;

    /* renamed from: t, reason: collision with root package name */
    private final C5153w<LinearGradient> f6011t;

    /* renamed from: u, reason: collision with root package name */
    private final C5153w<RadialGradient> f6012u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f6013v;

    /* renamed from: w, reason: collision with root package name */
    private final J5.g f6014w;

    /* renamed from: x, reason: collision with root package name */
    private final int f6015x;

    /* renamed from: y, reason: collision with root package name */
    private final E5.e f6016y;

    /* renamed from: z, reason: collision with root package name */
    private final E5.k f6017z;

    public i(com.airbnb.lottie.g gVar, K5.b bVar, J5.f fVar) {
        super(gVar, bVar, fVar.b().a(), fVar.g().a(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f6011t = new C5153w<>();
        this.f6012u = new C5153w<>();
        this.f6013v = new RectF();
        this.f6009r = fVar.j();
        this.f6014w = fVar.f();
        this.f6010s = fVar.n();
        this.f6015x = (int) (gVar.p().d() / 32.0f);
        E5.a<J5.d, J5.d> h11 = fVar.e().h();
        this.f6016y = (E5.e) h11;
        h11.a(this);
        bVar.i(h11);
        E5.a<PointF, PointF> h12 = fVar.l().h();
        this.f6017z = (E5.k) h12;
        h12.a(this);
        bVar.i(h12);
        E5.a<PointF, PointF> h13 = fVar.d().h();
        this.f6007A = (E5.k) h13;
        h13.a(this);
        bVar.i(h13);
    }

    private int[] c(int[] iArr) {
        E5.q qVar = this.f6008B;
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
        float f7 = this.f6017z.f();
        float f11 = this.f6015x;
        int round = Math.round(f7 * f11);
        int round2 = Math.round(this.f6007A.f() * f11);
        int round3 = Math.round(this.f6016y.f() * f11);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    @Override // D5.a, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == v.f2781G) {
            E5.q qVar = this.f6008B;
            K5.b bVar = this.f5941f;
            if (qVar != null) {
                bVar.r(qVar);
            }
            if (cVar == null) {
                this.f6008B = null;
                return;
            }
            E5.q qVar2 = new E5.q(cVar, null);
            this.f6008B = qVar2;
            qVar2.a(this);
            bVar.i(this.f6008B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D5.a, D5.e
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        Shader shader;
        Shader radialGradient;
        if (this.f6010s) {
            return;
        }
        a(this.f6013v, matrix, false);
        J5.g gVar = J5.g.LINEAR;
        J5.g gVar2 = this.f6014w;
        E5.e eVar = this.f6016y;
        E5.k kVar = this.f6007A;
        E5.k kVar2 = this.f6017z;
        if (gVar2 == gVar) {
            long i12 = i();
            C5153w<LinearGradient> c5153w = this.f6011t;
            shader = (LinearGradient) c5153w.b(i12);
            if (shader == null) {
                PointF g10 = kVar2.g();
                PointF g11 = kVar.g();
                J5.d g12 = eVar.g();
                radialGradient = new LinearGradient(g10.x, g10.y, g11.x, g11.y, c(g12.b()), g12.c(), Shader.TileMode.CLAMP);
                c5153w.f(i12, radialGradient);
                shader = radialGradient;
            }
            shader.setLocalMatrix(matrix);
            this.f5944i.setShader(shader);
            super.e(canvas, matrix, i11);
        }
        long i13 = i();
        C5153w<RadialGradient> c5153w2 = this.f6012u;
        shader = (RadialGradient) c5153w2.b(i13);
        if (shader == null) {
            PointF g13 = kVar2.g();
            PointF g14 = kVar.g();
            J5.d g15 = eVar.g();
            int[] c11 = c(g15.b());
            float[] c12 = g15.c();
            radialGradient = new RadialGradient(g13.x, g13.y, (float) Math.hypot(g14.x - r10, g14.y - r11), c11, c12, Shader.TileMode.CLAMP);
            c5153w2.f(i13, radialGradient);
            shader = radialGradient;
        }
        shader.setLocalMatrix(matrix);
        this.f5944i.setShader(shader);
        super.e(canvas, matrix, i11);
    }

    @Override // D5.c
    public final String getName() {
        return this.f6009r;
    }
}
