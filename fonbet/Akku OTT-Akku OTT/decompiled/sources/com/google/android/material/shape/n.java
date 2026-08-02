package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public static class a extends f {
        public final c c;

        public a(c cVar) {
            this.c = cVar;
        }

        @Override // com.google.android.material.shape.n.f
        public final void a(Matrix matrix, @NonNull com.google.android.material.shadow.a aVar, int i, @NonNull Canvas canvas) {
            float f;
            c cVar = this.c;
            float f2 = cVar.f;
            float f3 = cVar.g;
            RectF rectF = new RectF(cVar.b, cVar.c, cVar.d, cVar.e);
            Paint paint = aVar.b;
            boolean z = f3 < 0.0f;
            Path path = aVar.g;
            int[] iArr = com.google.android.material.shadow.a.k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = aVar.f;
                iArr[2] = aVar.e;
                iArr[3] = aVar.d;
                f = 0.0f;
            } else {
                path.rewind();
                f = 0.0f;
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = -i;
                rectF.inset(f4, f4);
                iArr[0] = 0;
                iArr[1] = aVar.d;
                iArr[2] = aVar.e;
                iArr[3] = aVar.f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= f) {
                return;
            }
            float f5 = 1.0f - (i / width);
            float[] fArr = com.google.android.material.shadow.a.l;
            fArr[1] = f5;
            fArr[2] = ((1.0f - f5) / 2.0f) + f5;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.h);
            }
            canvas.drawArc(rectF, f2, f3, true, paint);
            canvas.restore();
        }
    }

    public static class b extends f {
        public final d c;
        public final float d;
        public final float e;

        public b(d dVar, float f, float f2) {
            this.c = dVar;
            this.d = f;
            this.e = f2;
        }

        @Override // com.google.android.material.shape.n.f
        public final void a(Matrix matrix, @NonNull com.google.android.material.shadow.a aVar, int i, @NonNull Canvas canvas) {
            d dVar = this.c;
            float f = dVar.c;
            float f2 = this.e;
            float f3 = dVar.b;
            float f4 = this.d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int i2 = aVar.f;
            int[] iArr = com.google.android.material.shadow.a.i;
            iArr[0] = i2;
            iArr[1] = aVar.e;
            iArr[2] = aVar.d;
            Paint paint = aVar.c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, com.google.android.material.shadow.a.j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.c;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.e) / (dVar.b - this.d)));
        }
    }

    public static class c extends e {
        public static final RectF h = new RectF();

        @Deprecated
        public final float b;

        @Deprecated
        public final float c;

        @Deprecated
        public final float d;

        @Deprecated
        public final float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // com.google.android.material.shape.n.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f = this.d;
            float f2 = this.e;
            RectF rectF = h;
            rectF.set(this.b, this.c, f, f2);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {
        public float b;
        public float c;

        @Override // com.google.android.material.shape.n.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {
        public static final Matrix b = new Matrix();
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas);
    }

    public n() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.b;
        float f6 = this.c;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f = this.d;
        cVar.g = f4;
        this.g.add(new a(cVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        d dVar = new d();
        dVar.b = f2;
        dVar.c = f3;
        this.f.add(dVar);
        b bVar = new b(dVar, this.b, this.c);
        float b2 = bVar.b() + 270.0f;
        float b3 = bVar.b() + 270.0f;
        a(b2);
        this.g.add(bVar);
        this.d = b3;
        this.b = f2;
        this.c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.a = f2;
        this.b = 0.0f;
        this.c = f2;
        this.d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
