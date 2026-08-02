package K5;

import B5.s;
import B5.v;
import E5.q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class d extends b {

    /* renamed from: A, reason: collision with root package name */
    private final C5.a f15221A;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f15222B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f15223C;

    /* renamed from: D, reason: collision with root package name */
    private final s f15224D;

    /* renamed from: E, reason: collision with root package name */
    private q f15225E;

    /* renamed from: F, reason: collision with root package name */
    private q f15226F;

    d(com.airbnb.lottie.g gVar, e eVar) {
        super(gVar, eVar);
        this.f15221A = new C5.a(3);
        this.f15222B = new Rect();
        this.f15223C = new Rect();
        this.f15224D = gVar.s(eVar.n());
    }

    @Override // K5.b, D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        if (this.f15224D != null) {
            float c11 = O5.g.c();
            rectF.set(0.0f, 0.0f, r3.e() * c11, r3.c() * c11);
            this.f15199n.mapRect(rectF);
        }
    }

    @Override // K5.b, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == v.f2780F) {
            if (cVar == null) {
                this.f15225E = null;
                return;
            } else {
                this.f15225E = new q(cVar, null);
                return;
            }
        }
        if (obj == v.f2783I) {
            if (cVar == null) {
                this.f15226F = null;
            } else {
                this.f15226F = new q(cVar, null);
            }
        }
    }

    @Override // K5.b
    public final void l(@NonNull Canvas canvas, Matrix matrix, int i11) {
        Bitmap o11;
        q qVar = this.f15226F;
        com.airbnb.lottie.g gVar = this.f15200o;
        s sVar = this.f15224D;
        if ((qVar == null || (o11 = (Bitmap) qVar.g()) == null) && (o11 = gVar.o(this.f15201p.n())) == null) {
            o11 = sVar != null ? sVar.a() : null;
        }
        if (o11 == null || o11.isRecycled() || sVar == null) {
            return;
        }
        float c11 = O5.g.c();
        C5.a aVar = this.f15221A;
        aVar.setAlpha(i11);
        q qVar2 = this.f15225E;
        if (qVar2 != null) {
            aVar.setColorFilter((ColorFilter) qVar2.g());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = o11.getWidth();
        int height = o11.getHeight();
        Rect rect = this.f15222B;
        rect.set(0, 0, width, height);
        gVar.getClass();
        Rect rect2 = this.f15223C;
        rect2.set(0, 0, (int) (o11.getWidth() * c11), (int) (o11.getHeight() * c11));
        canvas.drawBitmap(o11, rect, rect2, aVar);
        canvas.restore();
    }
}
