package K5;

import B5.v;
import E5.q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class h extends b {

    /* renamed from: A, reason: collision with root package name */
    private final RectF f15254A;

    /* renamed from: B, reason: collision with root package name */
    private final C5.a f15255B;

    /* renamed from: C, reason: collision with root package name */
    private final float[] f15256C;

    /* renamed from: D, reason: collision with root package name */
    private final Path f15257D;

    /* renamed from: E, reason: collision with root package name */
    private final e f15258E;

    /* renamed from: F, reason: collision with root package name */
    private q f15259F;

    /* renamed from: G, reason: collision with root package name */
    private q f15260G;

    h(com.airbnb.lottie.g gVar, e eVar) {
        super(gVar, eVar);
        this.f15254A = new RectF();
        C5.a aVar = new C5.a();
        this.f15255B = aVar;
        this.f15256C = new float[8];
        this.f15257D = new Path();
        this.f15258E = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // K5.b, D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        RectF rectF2 = this.f15254A;
        e eVar = this.f15258E;
        rectF2.set(0.0f, 0.0f, eVar.r(), eVar.q());
        this.f15199n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // K5.b, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == v.f2780F) {
            if (cVar == null) {
                this.f15259F = null;
                return;
            } else {
                this.f15259F = new q(cVar, null);
                return;
            }
        }
        if (obj == 1) {
            if (cVar != null) {
                this.f15260G = new q(cVar, null);
                return;
            }
            this.f15260G = null;
            this.f15255B.setColor(this.f15258E.p());
        }
    }

    @Override // K5.b
    public final void l(Canvas canvas, Matrix matrix, int i11) {
        int alpha = Color.alpha(this.f15258E.p());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f15208w.h() == null ? 100 : r2.h().g().intValue())) / 100.0f) * (i11 / 255.0f) * 255.0f);
        C5.a aVar = this.f15255B;
        aVar.setAlpha(intValue);
        q qVar = this.f15260G;
        if (qVar != null) {
            aVar.setColor(((Integer) qVar.g()).intValue());
        }
        q qVar2 = this.f15259F;
        if (qVar2 != null) {
            aVar.setColorFilter((ColorFilter) qVar2.g());
        }
        if (intValue > 0) {
            float[] fArr = this.f15256C;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = r0.r();
            fArr[3] = 0.0f;
            fArr[4] = r0.r();
            fArr[5] = r0.q();
            fArr[6] = 0.0f;
            fArr[7] = r0.q();
            matrix.mapPoints(fArr);
            Path path = this.f15257D;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
