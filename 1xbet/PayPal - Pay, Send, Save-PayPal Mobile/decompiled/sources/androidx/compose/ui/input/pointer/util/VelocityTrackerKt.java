package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0012\u001a\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010\u001e\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010 \"(\u0010!\u001a\u00020\u001c8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&*\f\b\u0002\u0010)\"\u00020\u00142\u00020\u0014*\u0018\b\u0002\u0010*\"\b\u0012\u0004\u0012\u00020\u00140\n2\b\u0012\u0004\u0012\u00020\u00140\n"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "", "addPointerInputChange", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPointerInputChange-0AR0LA0", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "p0", "", "p1", "", "p2", "getHighSpeedVideoFpsRanges", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "", "x", "y", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "([F[FII[F)[F", "", "p3", "getHighResolutionOutputSizeshNQ4ISI", "([F[FIZ)F", "([F[F)F", "VelocityTrackerAddPointsFix", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "Vector", "Matrix"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VelocityTrackerKt {
    private static boolean VelocityTrackerAddPointsFix = true;

    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    public static final void addPointerInputChange(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        m7333addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    /* renamed from: addPointerInputChange-0AR0LA0, reason: not valid java name */
    public static final void m7333addPointerInputChange0AR0LA0(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
        velocityTracker.getPlatformVelocityTracker().mo7320addPointerInputChangeUv8p0NA(pointerInputChange, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.util.DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new androidx.compose.ui.input.pointer.util.DataPointAtTime(j, f);
        } else {
            dataPointAtTime.setTime(j);
            dataPointAtTime.setDataPoint(f);
        }
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            fArr3 = new float[kotlin.ranges.RangesKt.coerceAtLeast(i2 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i, i2, fArr3);
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 <= 0) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            kotlin.collections.ArraysKt.copyInto(fArr4[i10], fArr7, 0, 0, i);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fArr7, fArr8);
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * highResolutionOutputSizeshNQ4ISI);
                }
            }
            float sqrt = (float) java.lang.Math.sqrt(getHighResolutionOutputSizeshNQ4ISI(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i13 = 0; i13 < i; i13++) {
                fArr7[i13] = fArr7[i13] * f;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? 0.0f : getHighResolutionOutputSizeshNQ4ISI(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; i15 >= 0; i15--) {
            float highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    highResolutionOutputSizeshNQ4ISI2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = highResolutionOutputSizeshNQ4ISI2 / fArr10[i15];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float f2 = 0.0f;
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            float f3 = fArr2[i4];
            if (f != f3) {
                float f4 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (f - f3);
                f2 += (f4 - (java.lang.Math.signum(f2) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f2) * 2.0f)))) * java.lang.Math.abs(f4);
                if (i3 == i2) {
                    f2 *= 0.5f;
                }
            }
            i3--;
            f = f3;
        }
        return java.lang.Math.signum(f2) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f2) * 2.0f));
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    public static final void setVelocityTrackerAddPointsFix(boolean z) {
        VelocityTrackerAddPointsFix = z;
    }
}
