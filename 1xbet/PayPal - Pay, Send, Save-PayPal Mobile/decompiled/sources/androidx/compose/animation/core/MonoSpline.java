package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "time", "", "y", "", "periodicBias", "<init>", "([F[[FF)V", "", "p0", "p1", "getHighSpeedVideoSizes", "(II)[[F", "t", "j", "getPos", "(FI)F", "Landroidx/compose/animation/core/AnimationVector;", "v", "index", "", "(FLandroidx/compose/animation/core/AnimationVector;I)V", "getHighSpeedVideoFpsRangesFor", "(F[F)V", "getSlope", "[F", "Camera2StreamConfigurationMap", "[[F", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonoSpline {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float[][] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float[] Camera2StreamConfigurationMap;
    private final float[][] getHighSpeedVideoSizes;

    public MonoSpline(float[] fArr, float[][] fArr2, float f) {
        int i;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.getHighSpeedVideoFpsRangesFor = new float[length2];
        int i3 = length - 1;
        float[][] highSpeedVideoSizes = getHighSpeedVideoSizes(i3, length2);
        float[][] highSpeedVideoSizes2 = getHighSpeedVideoSizes(length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                float f2 = fArr[i6];
                float f3 = fArr[i5];
                float[] fArr3 = highSpeedVideoSizes[i5];
                float f4 = (fArr2[i6][i4] - fArr2[i5][i4]) / (f2 - f3);
                fArr3[i4] = f4;
                if (i5 == 0) {
                    highSpeedVideoSizes2[i5][i4] = f4;
                } else {
                    highSpeedVideoSizes2[i5][i4] = (highSpeedVideoSizes[i5 - 1][i4] + f4) * 0.5f;
                }
                i5 = i6;
            }
            highSpeedVideoSizes2[i3][i4] = highSpeedVideoSizes[length - 2][i4];
        }
        if (!java.lang.Float.isNaN(f)) {
            for (int i7 = 0; i7 < length2; i7++) {
                float[] fArr4 = highSpeedVideoSizes[length - 2];
                float f5 = fArr4[i7];
                float[] fArr5 = highSpeedVideoSizes[0];
                float f6 = (f5 * (1.0f - f)) + (fArr5[i7] * f);
                fArr5[i7] = f6;
                fArr4[i7] = f6;
                highSpeedVideoSizes2[i3][i7] = f6;
                highSpeedVideoSizes2[0][i7] = f6;
            }
        }
        int i8 = 0;
        while (i8 < i3) {
            int i9 = i2;
            while (i9 < length2) {
                float f7 = highSpeedVideoSizes[i8][i9];
                if (f7 == 0.0f) {
                    highSpeedVideoSizes2[i8][i9] = 0.0f;
                    highSpeedVideoSizes2[i8 + 1][i9] = 0.0f;
                    i = length2;
                } else {
                    float f8 = highSpeedVideoSizes2[i8][i9] / f7;
                    int i10 = i8 + 1;
                    float f9 = highSpeedVideoSizes2[i10][i9] / f7;
                    i = length2;
                    float hypot = (float) java.lang.Math.hypot(f8, f9);
                    if (hypot > 9.0d) {
                        float f10 = 3.0f / hypot;
                        float[] fArr6 = highSpeedVideoSizes2[i8];
                        float[] fArr7 = highSpeedVideoSizes[i8];
                        fArr6[i9] = f8 * f10 * fArr7[i9];
                        highSpeedVideoSizes2[i10][i9] = f10 * f9 * fArr7[i9];
                    }
                }
                i9++;
                length2 = i;
            }
            i8++;
            i2 = 0;
        }
        this.Camera2StreamConfigurationMap = fArr;
        this.getHighSpeedVideoSizes = fArr2;
        this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes2;
    }

    private static float[][] getHighSpeedVideoSizes(int p0, int p1) {
        float[][] fArr = new float[p0][];
        for (int i = 0; i < p0; i++) {
            fArr[i] = new float[p1];
        }
        return fArr;
    }

    public final float getPos(float t, int j) {
        int i;
        float[][] fArr = this.getHighSpeedVideoSizes;
        float[][] fArr2 = this.getHighSpeedVideoFpsRanges;
        float[] fArr3 = this.Camera2StreamConfigurationMap;
        int length = fArr3.length;
        int i2 = 0;
        if (t <= fArr3[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (t < fArr3[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float f = fArr[i][j];
            float f2 = fArr3[i];
            return f + ((t - f2) * getHighSpeedVideoFpsRangesFor(f2, j));
        }
        while (i2 < length - 1) {
            float[] fArr4 = this.Camera2StreamConfigurationMap;
            float f3 = fArr4[i2];
            if (t == f3) {
                return fArr[i2][j];
            }
            int i3 = i2 + 1;
            float f4 = fArr4[i3];
            if (t < f4) {
                float f5 = f4 - f3;
                return androidx.compose.animation.core.MonoSplineKt.hermiteInterpolate(f5, (t - f3) / f5, fArr[i2][j], fArr[i3][j], fArr2[i2][j], fArr2[i3][j]);
            }
            i2 = i3;
        }
        return 0.0f;
    }

    public static /* synthetic */ void getPos$default(androidx.compose.animation.core.MonoSpline monoSpline, float f, androidx.compose.animation.core.AnimationVector animationVector, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        monoSpline.getPos(f, animationVector, i);
    }

    public final void getPos(float time, androidx.compose.animation.core.AnimationVector v, int index) {
        int i;
        float[] fArr = this.Camera2StreamConfigurationMap;
        int length = fArr.length;
        int i2 = 0;
        int length2 = this.getHighSpeedVideoSizes[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            getHighSpeedVideoFpsRangesFor(fArr[i], this.getHighSpeedVideoFpsRangesFor);
            while (i2 < length2) {
                v.set$animation_core(i2, this.getHighSpeedVideoSizes[i][i2] + ((time - this.Camera2StreamConfigurationMap[i]) * this.getHighSpeedVideoFpsRangesFor[i2]));
                i2++;
            }
            return;
        }
        int i3 = index;
        while (i3 < length - 1) {
            float[] fArr2 = this.Camera2StreamConfigurationMap;
            float f = fArr2[i3];
            if (time == f) {
                while (i2 < length2) {
                    v.set$animation_core(i2, this.getHighSpeedVideoSizes[i3][i2]);
                    i2++;
                }
                return;
            }
            int i4 = i3 + 1;
            float f2 = fArr2[i4];
            if (time < f2) {
                float f3 = f2 - f;
                float f4 = (time - f) / f3;
                while (i2 < length2) {
                    float[][] fArr3 = this.getHighSpeedVideoSizes;
                    float f5 = fArr3[i3][i2];
                    float f6 = fArr3[i4][i2];
                    float[][] fArr4 = this.getHighSpeedVideoFpsRanges;
                    v.set$animation_core(i2, androidx.compose.animation.core.MonoSplineKt.hermiteInterpolate(f3, f4, f5, f6, fArr4[i3][i2], fArr4[i4][i2]));
                    i2++;
                }
                return;
            }
            i3 = i4;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(float p0, float[] p1) {
        int length = this.getHighSpeedVideoSizes[0].length;
        float[] fArr = this.Camera2StreamConfigurationMap;
        int length2 = fArr.length;
        float f = fArr[0];
        int i = length2 - 1;
        float f2 = fArr[i];
        if (p0 < f) {
            p0 = f;
        }
        if (p0 <= f2) {
            f2 = p0;
        }
        if (p1.length >= length) {
            int i2 = 0;
            while (i2 < i) {
                float[] fArr2 = this.Camera2StreamConfigurationMap;
                int i3 = i2 + 1;
                float f3 = fArr2[i3];
                if (f2 <= f3) {
                    float f4 = fArr2[i2];
                    float f5 = f3 - f4;
                    float f6 = (f2 - f4) / f5;
                    for (int i4 = 0; i4 < length; i4++) {
                        float[][] fArr3 = this.getHighSpeedVideoSizes;
                        float f7 = fArr3[i2][i4];
                        float f8 = fArr3[i3][i4];
                        float[][] fArr4 = this.getHighSpeedVideoFpsRanges;
                        p1[i4] = androidx.compose.animation.core.MonoSplineKt.hermiteDifferential(f5, f6, f7, f8, fArr4[i2][i4], fArr4[i3][i4]) / f5;
                    }
                    return;
                }
                i2 = i3;
            }
        }
    }

    public static /* synthetic */ void getSlope$default(androidx.compose.animation.core.MonoSpline monoSpline, float f, androidx.compose.animation.core.AnimationVector animationVector, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        monoSpline.getSlope(f, animationVector, i);
    }

    public final void getSlope(float time, androidx.compose.animation.core.AnimationVector v, int index) {
        int i;
        float[] fArr = this.Camera2StreamConfigurationMap;
        float[][] fArr2 = this.getHighSpeedVideoSizes;
        float[][] fArr3 = this.getHighSpeedVideoFpsRanges;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float[] fArr4 = fArr3[i];
            if (fArr4.length >= length2) {
                while (i2 < length2) {
                    v.set$animation_core(i2, fArr4[i2]);
                    i2++;
                }
                return;
            }
            return;
        }
        int i3 = index;
        while (i3 < length - 1) {
            int i4 = i3 + 1;
            float f = fArr[i4];
            if (time <= f) {
                float f2 = fArr[i3];
                float f3 = f - f2;
                float f4 = (time - f2) / f3;
                while (i2 < length2) {
                    v.set$animation_core(i2, androidx.compose.animation.core.MonoSplineKt.hermiteDifferential(f3, f4, fArr2[i3][i2], fArr2[i4][i2], fArr3[i3][i2], fArr3[i4][i2]) / f3);
                    i2++;
                }
                return;
            }
            i3 = i4;
        }
    }

    private final float getHighSpeedVideoFpsRangesFor(float p0, int p1) {
        float[] fArr = this.Camera2StreamConfigurationMap;
        float[][] fArr2 = this.getHighSpeedVideoSizes;
        float[][] fArr3 = this.getHighSpeedVideoFpsRanges;
        int length = fArr.length;
        int i = 0;
        float f = fArr[0];
        int i2 = length - 1;
        float f2 = fArr[i2];
        if (p0 < f) {
            p0 = f;
        }
        if (p0 <= f2) {
            f2 = p0;
        }
        while (i < i2) {
            int i3 = i + 1;
            float f3 = fArr[i3];
            if (f2 <= f3) {
                float f4 = fArr2[i][p1];
                float f5 = fArr2[i3][p1];
                float f6 = fArr3[i][p1];
                float f7 = fArr3[i3][p1];
                float f8 = fArr[i];
                float f9 = f3 - f8;
                return androidx.compose.animation.core.MonoSplineKt.hermiteDifferential(f9, (f2 - f8) / f9, f4, f5, f6, f7) / f9;
            }
            i = i3;
        }
        return 0.0f;
    }
}
