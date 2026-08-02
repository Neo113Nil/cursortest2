package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.g;
import com.google.android.material.shape.n;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes4.dex */
public final class l {
    public final n[] a = new n[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final n g = new n();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public static class a {
        public static final l a = new l();
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new n();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(k kVar, float f, RectF rectF, g.a aVar, @NonNull Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        n[] nVarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            nVarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            c cVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f : kVar.e : kVar.h : kVar.g;
            d dVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.b : kVar.a : kVar.d : kVar.c;
            n nVar = nVarArr[i3];
            dVar.getClass();
            dVar.a(nVar, f, cVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            n nVar2 = nVarArr[i2];
            fArr[0] = nVar2.b;
            fArr[1] = nVar2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            n nVar3 = nVarArr[i5];
            nVar3.getClass();
            fArr[z] = 0.0f;
            fArr[1] = nVar3.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[z], fArr[1]);
            } else {
                path.lineTo(fArr[z], fArr[1]);
            }
            nVarArr[i5].b(matrixArr2[i5], path);
            if (aVar != null) {
                n nVar4 = nVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g gVar = g.this;
                f2 = 0.0f;
                BitSet bitSet = gVar.d;
                nVar4.getClass();
                bitSet.set(i5, z);
                n.f[] fVarArr = gVar.b;
                nVar4.a(nVar4.e);
                fVarArr[i5] = new m(new ArrayList(nVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            n nVar5 = nVarArr[i5];
            fArr[0] = nVar5.b;
            fArr[1] = nVar5.c;
            matrixArr2[i5].mapPoints(fArr);
            n nVar6 = nVarArr[i7];
            nVar6.getClass();
            float[] fArr2 = this.i;
            fArr2[0] = f2;
            fArr2[1] = nVar6.a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            n[] nVarArr2 = nVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            n nVar7 = nVarArr2[i5];
            fArr[0] = nVar7.b;
            fArr[1] = nVar7.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            n nVar8 = this.g;
            nVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.j : kVar.i : kVar.l : kVar.k).getClass();
            nVar8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            nVar8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = nVar8.a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                nVar8.b(matrixArr3[i5], path2);
            } else {
                nVar8.b(matrixArr3[i5], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                g gVar2 = g.this;
                z2 = false;
                gVar2.d.set(i5 + 4, false);
                n.f[] fVarArr2 = gVar2.c;
                nVar8.a(nVar8.e);
                fVarArr2[i5] = new m(new ArrayList(nVar8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            i5 = i6;
            z = z2;
            nVarArr = nVarArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    @RequiresApi(19)
    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
