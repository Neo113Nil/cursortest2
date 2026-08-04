package A;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorMatrix f5b = new ColorMatrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorMatrix f6c = new ColorMatrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z4;
        float[] fArr;
        float fLog;
        float fPow;
        float fLog2;
        ColorMatrix colorMatrix = this.f5b;
        colorMatrix.reset();
        float f7 = this.f8e;
        float f8 = 1.0f;
        float[] fArr2 = this.f4a;
        boolean z7 = true;
        if (f7 != 1.0f) {
            float f9 = 1.0f - f7;
            float f10 = 0.2999f * f9;
            float f11 = 0.587f * f9;
            float f12 = f9 * 0.114f;
            fArr2[0] = f10 + f7;
            fArr2[1] = f11;
            fArr2[2] = f12;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = f10;
            fArr2[6] = f11 + f7;
            fArr2[7] = f12;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = f10;
            fArr2[11] = f11;
            fArr2[12] = f12 + f7;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            colorMatrix.set(fArr2);
            z4 = true;
        } else {
            z4 = false;
        }
        float f13 = this.f9f;
        ColorMatrix colorMatrix2 = this.f6c;
        if (f13 != 1.0f) {
            colorMatrix2.setScale(f13, f13, f13, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z4 = true;
        }
        float f14 = this.f10g;
        if (f14 != 1.0f) {
            if (f14 <= 0.0f) {
                f14 = 0.01f;
            }
            float f15 = (5000.0f / f14) / 100.0f;
            if (f15 > 66.0f) {
                double d7 = f15 - 60.0f;
                fPow = ((float) Math.pow(d7, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d7, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f15)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f15 < 66.0f) {
                fLog2 = f15 > 19.0f ? (((float) Math.log(f15 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            fArr2[0] = fMin / fMin4;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = fMin2 / fMin5;
            fArr2[7] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = 0.0f;
            fArr2[11] = 0.0f;
            fArr2[12] = fMin6;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            f8 = 1.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            fArr = fArr2;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z4 = true;
        } else {
            fArr = fArr2;
        }
        float f16 = this.f7d;
        if (f16 != f8) {
            fArr[0] = f16;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f16;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f16;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else {
            z7 = z4;
        }
        if (z7) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            imageView.clearColorFilter();
        }
    }
}
