package b2;

import B.K;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import g1.C1969c;
import java.util.ArrayList;
import r.C2327e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f7255p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f7256a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f7257b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f7258c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f7259d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f7260e;
    public PathMeasure f;

    /* renamed from: g, reason: collision with root package name */
    public final j f7261g;

    /* renamed from: h, reason: collision with root package name */
    public float f7262h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f7263j;

    /* renamed from: k, reason: collision with root package name */
    public float f7264k;

    /* renamed from: l, reason: collision with root package name */
    public int f7265l;

    /* renamed from: m, reason: collision with root package name */
    public String f7266m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f7267n;

    /* renamed from: o, reason: collision with root package name */
    public final C2327e f7268o;

    public m() {
        this.f7258c = new Matrix();
        this.f7262h = 0.0f;
        this.i = 0.0f;
        this.f7263j = 0.0f;
        this.f7264k = 0.0f;
        this.f7265l = 255;
        this.f7266m = null;
        this.f7267n = null;
        this.f7268o = new C2327e(0);
        this.f7261g = new j();
        this.f7256a = new Path();
        this.f7257b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i5) {
        char c5;
        float f;
        float f5;
        int i6;
        j jVar2 = jVar;
        char c6 = 1;
        jVar2.f7243a.set(matrix);
        Matrix matrix2 = jVar2.f7243a;
        matrix2.preConcat(jVar2.f7250j);
        canvas.save();
        char c7 = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = jVar2.f7244b;
            if (i7 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i7);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i, i5);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f6 = i / this.f7263j;
                float f7 = i5 / this.f7264k;
                float min = Math.min(f6, f7);
                Matrix matrix3 = this.f7258c;
                matrix3.set(matrix2);
                matrix3.postScale(f6, f7);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c7], fArr[c6]);
                boolean z3 = c6;
                boolean z5 = c7;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f8 = (fArr[z5 ? 1 : 0] * fArr[3]) - (fArr[z3 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f8) / max : 0.0f;
                if (abs != 0.0f) {
                    lVar.getClass();
                    Path path = this.f7256a;
                    path.reset();
                    C1969c[] c1969cArr = lVar.f7252a;
                    if (c1969cArr != null) {
                        C1969c.b(c1969cArr, path);
                    }
                    Path path2 = this.f7257b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f7254c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f9 = iVar.i;
                        if (f9 != 0.0f || iVar.f7238j != 1.0f) {
                            float f10 = iVar.f7239k;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (iVar.f7238j + f10) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z5);
                            float length = this.f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f.getSegment(f13, length, path, z3);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f14, path, z3);
                            } else {
                                f = 0.0f;
                                this.f.getSegment(f13, f14, path, z3);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix3);
                        K k5 = iVar.f;
                        if ((((Shader) k5.f638c) == null && k5.f637b == 0) ? false : true) {
                            if (this.f7260e == null) {
                                i6 = 16777215;
                                Paint paint = new Paint(1);
                                this.f7260e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i6 = 16777215;
                            }
                            Paint paint2 = this.f7260e;
                            Shader shader = (Shader) k5.f638c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f7237h * 255.0f));
                                f5 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = k5.f637b;
                                float f15 = iVar.f7237h;
                                PorterDuff.Mode mode = p.f7280t;
                                f5 = 255.0f;
                                paint2.setColor((i8 & i6) | (((int) (Color.alpha(i8) * f15)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f7254c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f5 = 255.0f;
                            i6 = 16777215;
                        }
                        K k6 = iVar.f7234d;
                        if (((Shader) k6.f638c) != null || k6.f637b != 0) {
                            if (this.f7259d == null) {
                                Paint paint3 = new Paint(1);
                                this.f7259d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f7259d;
                            Paint.Join join = iVar.f7241m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f7240l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f7242n);
                            Shader shader2 = (Shader) k6.f638c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f7236g * f5));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i9 = k6.f637b;
                                float f16 = iVar.f7236g;
                                PorterDuff.Mode mode2 = p.f7280t;
                                paint4.setColor((i9 & i6) | (((int) (Color.alpha(i9) * f16)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f7235e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c5 = 1;
                i7++;
                jVar2 = jVar;
                c6 = c5;
                c7 = 0;
            }
            c5 = c6;
            i7++;
            jVar2 = jVar;
            c6 = c5;
            c7 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f7265l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f7265l = i;
    }

    public m(m mVar) {
        this.f7258c = new Matrix();
        this.f7262h = 0.0f;
        this.i = 0.0f;
        this.f7263j = 0.0f;
        this.f7264k = 0.0f;
        this.f7265l = 255;
        this.f7266m = null;
        this.f7267n = null;
        C2327e c2327e = new C2327e(0);
        this.f7268o = c2327e;
        this.f7261g = new j(mVar.f7261g, c2327e);
        this.f7256a = new Path(mVar.f7256a);
        this.f7257b = new Path(mVar.f7257b);
        this.f7262h = mVar.f7262h;
        this.i = mVar.i;
        this.f7263j = mVar.f7263j;
        this.f7264k = mVar.f7264k;
        this.f7265l = mVar.f7265l;
        this.f7266m = mVar.f7266m;
        String str = mVar.f7266m;
        if (str != null) {
            c2327e.put(str, this);
        }
        this.f7267n = mVar.f7267n;
    }
}
