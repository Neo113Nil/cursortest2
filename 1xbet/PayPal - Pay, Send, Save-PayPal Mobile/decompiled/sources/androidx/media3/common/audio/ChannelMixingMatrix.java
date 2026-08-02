package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class ChannelMixingMatrix {
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final float[] getHighSpeedVideoSizes;
    private final int getInputSizeshNQ4ISI;

    @java.lang.Deprecated
    public static androidx.media3.common.audio.ChannelMixingMatrix create(int i, int i2) {
        return createForConstantGain(i, i2);
    }

    public static androidx.media3.common.audio.ChannelMixingMatrix createForConstantGain(int i, int i2) {
        return new androidx.media3.common.audio.ChannelMixingMatrix(i, i2, getHighSpeedVideoFpsRangesFor(i, i2));
    }

    public static androidx.media3.common.audio.ChannelMixingMatrix createForConstantPower(int i, int i2) {
        return new androidx.media3.common.audio.ChannelMixingMatrix(i, i2, getHighSpeedVideoSizes(i, i2));
    }

    public ChannelMixingMatrix(int i, int i2, float[] fArr) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "Input channel count must be positive.");
        com.google.common.base.Preconditions.checkArgument(i2 > 0, "Output channel count must be positive.");
        com.google.common.base.Preconditions.checkArgument(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Coefficient at index ");
                sb.append(i3);
                sb.append(" is negative.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        this.getHighSpeedVideoSizes = fArr;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i4 = 0;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float mixingCoefficient = getMixingCoefficient(i4, i5);
                boolean z4 = i4 == i5;
                if (mixingCoefficient != 1.0f && z4) {
                    z2 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z = false;
                    if (!z4) {
                        z3 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        boolean z5 = isSquare() && z3;
        this.getHighSpeedVideoFpsRanges = z5;
        this.Camera2StreamConfigurationMap = z5 && z2;
    }

    public final int getInputChannelCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getOutputChannelCount() {
        return this.getInputSizeshNQ4ISI;
    }

    public final float getMixingCoefficient(int i, int i2) {
        return this.getHighSpeedVideoSizes[(i * this.getInputSizeshNQ4ISI) + i2];
    }

    public final boolean isZero() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isSquare() {
        return this.getHighSpeedVideoFpsRangesFor == this.getInputSizeshNQ4ISI;
    }

    public final boolean isDiagonal() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isIdentity() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.media3.common.audio.ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.getHighSpeedVideoSizes.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.getHighSpeedVideoSizes;
            if (i < fArr2.length) {
                fArr[i] = fArr2[i] * f;
                i++;
            } else {
                return new androidx.media3.common.audio.ChannelMixingMatrix(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, fArr);
            }
        }
    }

    private static float[] getHighSpeedVideoFpsRangesFor(int i, int i2) {
        if (i == i2) {
            float[] fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
            return fArr;
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Default channel mixing coefficients for ");
        sb.append(i);
        sb.append("->");
        sb.append(i2);
        sb.append(" are not yet implemented.");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    private static float[] getHighSpeedVideoSizes(int i, int i2) {
        if (i2 == 1) {
            switch (i) {
                case 1:
                    return new float[]{1.0f};
                case 2:
                    return new float[]{0.7071f, 0.7071f};
                case 3:
                    return new float[]{0.7071f, 0.7071f, 1.0f};
                case 4:
                    return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
                case 5:
                    return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
                case 6:
                    return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Default constant power channel mixing coefficients for ");
                    sb.append(i);
                    sb.append("->1 are not implemented.");
                    throw new java.lang.UnsupportedOperationException(sb.toString());
            }
        }
        if (i2 == 2) {
            switch (i) {
                case 1:
                    return new float[]{0.7071f, 0.7071f};
                case 2:
                    return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
                case 3:
                    return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
                case 4:
                    return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
                case 5:
                    return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
                case 6:
                    return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
                default:
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Default constant power channel mixing coefficients for ");
                    sb2.append(i);
                    sb2.append("->2 are not implemented.");
                    throw new java.lang.UnsupportedOperationException(sb2.toString());
            }
        }
        if (i != i2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Default constant power channel mixing coefficients for ");
            sb3.append(i);
            sb3.append("->");
            sb3.append(i2);
            sb3.append(" are not implemented.");
            throw new java.lang.UnsupportedOperationException(sb3.toString());
        }
        float[] fArr = new float[i2 * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[(i2 * i3) + i3] = 1.0f;
        }
        return fArr;
    }
}
