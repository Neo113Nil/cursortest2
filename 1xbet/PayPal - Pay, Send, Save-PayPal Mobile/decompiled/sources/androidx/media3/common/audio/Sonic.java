package androidx.media3.common.audio;

/* loaded from: classes7.dex */
final class Sonic {
    final androidx.media3.common.audio.Sonic.SonicImpl<?> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final float getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    final float getOutputMinFrameDurationlomOqCM;
    final float getOutputSizes;
    int getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;
    private final int isOutputSupportedFor;
    private final int unwrapAs;

    interface SonicImpl<T> {
        int Camera2StreamConfigurationMap();

        void Camera2StreamConfigurationMap(int i, int i2);

        void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5);

        void Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer, int i);

        int getHighResolutionOutputSizeshNQ4ISI(int i, int i2);

        int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3);

        void getHighResolutionOutputSizeshNQ4ISI();

        void getHighResolutionOutputSizeshNQ4ISI(int i);

        void getHighResolutionOutputSizeshNQ4ISI(int i, long j, long j2);

        T getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRanges(int i);

        T getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(int i, int i2);

        void getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i);

        T getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(int i);

        boolean getInputFormats();

        void getOutputFormats();
    }

    public static long getHighResolutionOutputSizeshNQ4ISI(int i, int i2, float f, float f2, long j) {
        float f3 = (i / i2) * f2;
        double d = f / f2;
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(java.lang.String.valueOf(f3));
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(j);
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            valueOf = valueOf.divide(java.math.BigDecimal.valueOf(d), java.math.RoundingMode.HALF_EVEN);
        }
        if (f3 == 1.0f) {
            return valueOf.longValueExact();
        }
        long longValueExact = valueOf.divide(bigDecimal, java.math.RoundingMode.HALF_EVEN).longValueExact();
        java.math.BigDecimal valueOf2 = java.math.BigDecimal.valueOf(i);
        java.math.BigDecimal divide = valueOf.divide(valueOf2, 20, java.math.RoundingMode.HALF_EVEN);
        java.math.BigDecimal divide2 = valueOf2.divide(bigDecimal, 20, java.math.RoundingMode.HALF_EVEN);
        return longValueExact - divide.multiply(divide2.subtract(divide2.setScale(0, java.math.RoundingMode.FLOOR))).setScale(0, java.math.RoundingMode.FLOOR).longValueExact();
    }

    static long Camera2StreamConfigurationMap(int i, int i2, float f, float f2, long j) {
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(java.lang.String.valueOf((i / i2) * f2));
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(i);
        long longValueExact = valueOf.multiply(java.math.BigDecimal.valueOf(j)).divide(valueOf.divide(bigDecimal, 0, java.math.RoundingMode.FLOOR), 0, java.math.RoundingMode.FLOOR).longValueExact();
        double d = f / f2;
        return (d > 1.0000100135803223d || d < 0.9999899864196777d) ? java.math.BigDecimal.valueOf(longValueExact).multiply(java.math.BigDecimal.valueOf(d)).setScale(0, java.math.RoundingMode.FLOOR).longValueExact() : longValueExact;
    }

    public Sonic(int i, int i2, float f, float f2, int i3, boolean z) {
        this.getOutputStallDurationlomOqCM = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getOutputSizes = f;
        this.getInputFormats = f2;
        this.getOutputMinFrameDurationlomOqCM = i / i3;
        this.unwrapAs = i / 400;
        int i4 = i / 65;
        this.isOutputSupportedFor = i4;
        this.getHighResolutionOutputSizeshNQ4ISI = i4 * 2;
        this.Camera2StreamConfigurationMap = z ? new androidx.media3.common.audio.Sonic.SonicFloatImpl() : new androidx.media3.common.audio.Sonic.SonicShortImpl();
    }

    public final int getHighSpeedVideoFpsRangesFor() {
        com.google.common.base.Preconditions.checkState(this.getOutputFormats >= 0);
        return this.getOutputFormats * this.getHighSpeedVideoFpsRangesFor * this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
    }

    private void getHighSpeedVideoFpsRangesFor(int i, int i2) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i2);
        java.lang.Object highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
        int i4 = this.getOutputFormats;
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(highSpeedVideoSizes, i * i3, highSpeedVideoFpsRanges, i4 * i5, i5 * i2);
        this.getOutputFormats += i2;
    }

    final void getHighSpeedVideoFpsRanges() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7 = this.getOutputFormats;
        float f = this.getOutputSizes;
        float f2 = this.getInputFormats;
        double d = f / f2;
        float f3 = this.getOutputMinFrameDurationlomOqCM * f2;
        int i8 = 1;
        if (d <= 1.0000100135803223d && d >= 0.9999899864196777d) {
            getHighSpeedVideoFpsRangesFor(0, this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges = 0;
        } else {
            int i9 = this.getHighSpeedVideoFpsRanges;
            if (i9 >= this.getHighResolutionOutputSizeshNQ4ISI) {
                int i10 = 0;
                while (true) {
                    int i11 = this.getOutputStallDuration;
                    if (i11 > 0) {
                        i3 = java.lang.Math.min(this.getHighResolutionOutputSizeshNQ4ISI, i11);
                        getHighSpeedVideoFpsRangesFor(i10, i3);
                        this.getOutputStallDuration -= i3;
                    } else {
                        int i12 = this.getOutputStallDurationlomOqCM;
                        int i13 = i12 > 4000 ? i12 / 4000 : i8;
                        if (this.getHighSpeedVideoFpsRangesFor == i8 && i13 == i8) {
                            i = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i10, this.unwrapAs, this.isOutputSupportedFor);
                        } else {
                            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i10, i13);
                            int highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs / i13, this.isOutputSupportedFor / i13);
                            if (i13 != i8) {
                                int i14 = highResolutionOutputSizeshNQ4ISI * i13;
                                int i15 = i13 * 4;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.unwrapAs;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.isOutputSupportedFor;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.getHighSpeedVideoFpsRangesFor == i8) {
                                    i = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i10, i16, i17);
                                } else {
                                    this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i10, i8);
                                    i = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i16, i17);
                                }
                            } else {
                                i = highResolutionOutputSizeshNQ4ISI;
                            }
                        }
                        int i20 = this.Camera2StreamConfigurationMap.getInputFormats() ? this.getOutputSizeshNQ4ISI : i;
                        this.Camera2StreamConfigurationMap.getOutputFormats();
                        this.getOutputSizeshNQ4ISI = i;
                        if (d > 1.0d) {
                            if (d >= 2.0d) {
                                double d2 = (i20 / (d - 1.0d)) + this.getHighSpeedVideoSizes;
                                int round = (int) java.lang.Math.round(d2);
                                this.getHighSpeedVideoSizes = d2 - round;
                                i4 = round;
                            } else {
                                double d3 = ((i20 * (2.0d - d)) / (d - 1.0d)) + this.getHighSpeedVideoSizes;
                                int round2 = (int) java.lang.Math.round(d3);
                                this.getOutputStallDuration = round2;
                                this.getHighSpeedVideoSizes = d3 - round2;
                                i4 = i20;
                            }
                            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i4);
                            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(i4, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, i10, i10 + i20);
                            this.getOutputFormats += i4;
                            i3 = i20 + i4;
                        } else {
                            if (d < 0.5d) {
                                double d4 = ((i20 * d) / (1.0d - d)) + this.getHighSpeedVideoSizes;
                                int round3 = (int) java.lang.Math.round(d4);
                                this.getHighSpeedVideoSizes = d4 - round3;
                                i2 = round3;
                            } else {
                                double d5 = ((i20 * ((2.0d * d) - 1.0d)) / (1.0d - d)) + this.getHighSpeedVideoSizes;
                                int round4 = (int) java.lang.Math.round(d5);
                                this.getOutputStallDuration = round4;
                                this.getHighSpeedVideoSizes = d5 - round4;
                                i2 = i20;
                            }
                            int i21 = i20 + i2;
                            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i21);
                            java.lang.Object highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                            int i22 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
                            int i23 = this.getOutputFormats;
                            int i24 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.System.arraycopy(highSpeedVideoSizes, i22 * i10, highSpeedVideoFpsRanges, i23 * i24, i24 * i20);
                            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(i2, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats + i20, i10 + i20, i10);
                            this.getOutputFormats += i21;
                            i3 = i2;
                        }
                    }
                    i10 += i3;
                    if (this.getHighResolutionOutputSizeshNQ4ISI + i10 > i9) {
                        break;
                    } else {
                        i8 = 1;
                    }
                }
                int i25 = this.getHighSpeedVideoFpsRanges - i10;
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(), i10 * this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(), 0, this.getHighSpeedVideoFpsRangesFor * i25);
                this.getHighSpeedVideoFpsRanges = i25;
            }
        }
        if (f3 == 1.0f || this.getOutputFormats == i7) {
            return;
        }
        int i26 = this.getOutputStallDurationlomOqCM;
        long j3 = (long) (i26 / f3);
        long j4 = i26;
        while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
            j3 /= 2;
            j4 /= 2;
        }
        int i27 = this.getOutputFormats - i7;
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(i27);
        java.lang.Object highSpeedVideoFpsRanges2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
        int i28 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        int i29 = this.getHighSpeedVideoSizesFor;
        int i30 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(highSpeedVideoFpsRanges2, i28 * i7, highSpeedVideoFpsRangesFor, i29 * i30, i30 * i27);
        this.getOutputFormats = i7;
        this.getHighSpeedVideoSizesFor += i27;
        int i31 = 0;
        while (true) {
            i5 = this.getHighSpeedVideoSizesFor - 1;
            if (i31 >= i5) {
                break;
            }
            while (true) {
                i6 = this.getInputSizeshNQ4ISI + 1;
                j = i6;
                long j5 = j * j3;
                j2 = this.getOutputMinFrameDuration;
                if (j5 <= j2 * j4) {
                    break;
                }
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(1);
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(i31, j4, j3);
                this.getOutputMinFrameDuration++;
                this.getOutputFormats++;
            }
            this.getInputSizeshNQ4ISI = i6;
            if (j == j4) {
                this.getInputSizeshNQ4ISI = 0;
                com.google.common.base.Preconditions.checkState(j2 == j3);
                this.getOutputMinFrameDuration = 0;
            }
            i31++;
        }
        if (i5 != 0) {
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(), this.getHighSpeedVideoFpsRangesFor * i5, this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(), 0, (this.getHighSpeedVideoSizesFor - i5) * this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoSizesFor -= i5;
        }
    }

    final class SonicFloatImpl implements androidx.media3.common.audio.Sonic.SonicImpl<float[]> {
        private final float[] Camera2StreamConfigurationMap;
        private float[] getHighResolutionOutputSizeshNQ4ISI;
        private double getHighSpeedVideoFpsRangesFor;
        private double getHighSpeedVideoSizes;
        private float[] getHighSpeedVideoSizesFor;
        private double getOutputFormats;
        private float[] getOutputMinFrameDuration;

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int Camera2StreamConfigurationMap() {
            return 4;
        }

        SonicFloatImpl() {
            this.Camera2StreamConfigurationMap = new float[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI];
            this.getHighResolutionOutputSizeshNQ4ISI = new float[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
            this.getOutputMinFrameDuration = new float[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
            this.getHighSpeedVideoSizesFor = new float[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI(int i, long j, long j2) {
            for (int i2 = 0; i2 < androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor; i2++) {
                float[] fArr = this.getOutputMinFrameDuration;
                int i3 = androidx.media3.common.audio.Sonic.this.getOutputFormats;
                int i4 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
                float[] fArr2 = this.getHighSpeedVideoSizesFor;
                int i5 = (i3 * i4) + i2;
                int i6 = (androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i) + i2;
                float f = fArr2[i6];
                float f2 = fArr2[i6 + androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
                long j3 = androidx.media3.common.audio.Sonic.this.getOutputMinFrameDuration;
                long j4 = (androidx.media3.common.audio.Sonic.this.getInputSizeshNQ4ISI + 1) * j2;
                long j5 = j4 - (j3 * j);
                fArr[i5] = ((j5 * f) + ((r10 - j5) * f2)) / (j4 - (androidx.media3.common.audio.Sonic.this.getInputSizeshNQ4ISI * j2));
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final boolean getInputFormats() {
            if (this.getHighSpeedVideoFpsRangesFor == 0.0d || androidx.media3.common.audio.Sonic.this.getOutputSizeshNQ4ISI == 0) {
                return false;
            }
            double d = this.getHighSpeedVideoSizes;
            double d2 = this.getHighSpeedVideoFpsRangesFor;
            return d <= d2 * 3.0d && d2 * 2.0d > this.getOutputFormats * 3.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            int i3 = androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI / i2;
            int i4 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i2;
            int i5 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
            for (int i6 = 0; i6 < i3; i6++) {
                double d = 0.0d;
                for (int i7 = 0; i7 < i4; i7++) {
                    d += this.getHighResolutionOutputSizeshNQ4ISI[(i6 * i4) + (i * i5) + i7];
                }
                this.Camera2StreamConfigurationMap[i6] = (float) (d / i4);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, 0, i, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
            return getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getOutputFormats = 0.0d;
            this.getHighSpeedVideoFpsRangesFor = 0.0d;
            this.getHighSpeedVideoSizes = 0.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5) {
            float[] fArr = this.getOutputMinFrameDuration;
            float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    fArr[i7] = ((fArr2[i9] * (i - i10)) + (fArr2[i8] * i10)) / i;
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getOutputFormats() {
            this.getOutputFormats = this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRanges(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRanges, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap(this.getOutputMinFrameDuration, androidx.media3.common.audio.Sonic.this.getOutputFormats, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoSizesFor, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(int i, int i2) {
            for (int i3 = 0; i3 < androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i2; i3++) {
                this.getHighResolutionOutputSizeshNQ4ISI[i + i3] = 0.0f;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().get(this.getHighResolutionOutputSizeshNQ4ISI, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRanges * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor, i / 4);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().put(this.getOutputMinFrameDuration, 0, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i);
            byteBuffer.position(byteBuffer.position() + (i * 4 * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor));
        }

        private int getHighResolutionOutputSizeshNQ4ISI(float[] fArr, int i, int i2, int i3) {
            int i4 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i;
            int i5 = 0;
            double d = 0.0d;
            int i6 = i2;
            int i7 = 255;
            double d2 = 1.0d;
            while (i6 <= i3) {
                double d3 = 0.0d;
                for (int i8 = 0; i8 < i6; i8++) {
                    d3 += java.lang.Math.abs(fArr[i4 + i8] - fArr[(i4 + i6) + i8]);
                }
                int i9 = i4;
                double d4 = i6;
                if (i5 * d3 < d2 * d4) {
                    i5 = i6;
                    d2 = d3;
                }
                if (i7 * d3 > d4 * d) {
                    i7 = i6;
                    d = d3;
                }
                i6++;
                i4 = i9;
            }
            this.getHighSpeedVideoFpsRangesFor = d2 / i5;
            this.getHighSpeedVideoSizes = d / i7;
            return i5;
        }

        private float[] Camera2StreamConfigurationMap(float[] fArr, int i, int i2) {
            int length = fArr.length / androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
            return i + i2 <= length ? fArr : java.util.Arrays.copyOf(fArr, (((length * 3) / 2) + i2) * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ float[] getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ float[] getHighSpeedVideoFpsRanges() {
            return this.getOutputMinFrameDuration;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ float[] getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizesFor;
        }
    }

    final class SonicShortImpl implements androidx.media3.common.audio.Sonic.SonicImpl<short[]> {
        private final short[] Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private short[] getHighSpeedVideoSizes;
        private short[] getHighSpeedVideoSizesFor;
        private short[] getOutputFormats;
        private int getOutputMinFrameDuration;

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int Camera2StreamConfigurationMap() {
            return 2;
        }

        SonicShortImpl() {
            this.Camera2StreamConfigurationMap = new short[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI];
            this.getHighSpeedVideoSizes = new short[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
            this.getHighSpeedVideoSizesFor = new short[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
            this.getOutputFormats = new short[androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI(int i, long j, long j2) {
            for (int i2 = 0; i2 < androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor; i2++) {
                short[] sArr = this.getHighSpeedVideoSizesFor;
                int i3 = androidx.media3.common.audio.Sonic.this.getOutputFormats;
                int i4 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
                short[] sArr2 = this.getOutputFormats;
                int i5 = (i3 * i4) + i2;
                int i6 = (androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i) + i2;
                short s = sArr2[i6];
                short s2 = sArr2[i6 + androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor];
                long j3 = androidx.media3.common.audio.Sonic.this.getOutputMinFrameDuration;
                long j4 = (androidx.media3.common.audio.Sonic.this.getInputSizeshNQ4ISI + 1) * j2;
                long j5 = j4 - (j3 * j);
                long j6 = j4 - (androidx.media3.common.audio.Sonic.this.getInputSizeshNQ4ISI * j2);
                sArr[i5] = (short) (((s * j5) + ((j6 - j5) * s2)) / j6);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final boolean getInputFormats() {
            if (this.getHighSpeedVideoFpsRanges == 0 || androidx.media3.common.audio.Sonic.this.getOutputSizeshNQ4ISI == 0) {
                return false;
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoFpsRanges;
            return i <= i2 * 3 && i2 * 2 > this.getOutputMinFrameDuration * 3;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            short[] sArr = this.getHighSpeedVideoSizes;
            int i3 = androidx.media3.common.audio.Sonic.this.getHighResolutionOutputSizeshNQ4ISI / i2;
            int i4 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i2;
            int i5 = androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    i7 += sArr[(i6 * i4) + (i * i5) + i8];
                }
                this.Camera2StreamConfigurationMap[i6] = (short) (i7 / i4);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, 0, i, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
            return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getOutputMinFrameDuration = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5) {
            short[] sArr = this.getHighSpeedVideoSizesFor;
            short[] sArr2 = this.getHighSpeedVideoSizes;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr2[i8] * i10)) / i);
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getOutputFormats() {
            this.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRanges(int i) {
            this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRanges, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, androidx.media3.common.audio.Sonic.this.getOutputFormats, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoSizes(int i) {
            this.getOutputFormats = getHighSpeedVideoFpsRanges(this.getOutputFormats, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoSizesFor, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(int i, int i2) {
            for (int i3 = 0; i3 < androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i2; i3++) {
                this.getHighSpeedVideoSizes[i + i3] = 0;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().get(this.getHighSpeedVideoSizes, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRanges * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor, i / 2);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().put(this.getHighSpeedVideoSizesFor, 0, androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor * i);
            byteBuffer.position(byteBuffer.position() + (i * 2 * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor));
        }

        private int getHighSpeedVideoFpsRangesFor(short[] sArr, int i, int i2, int i3) {
            int i4 = i * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
            int i5 = 255;
            int i6 = 1;
            int i7 = 0;
            int i8 = 0;
            while (i2 <= i3) {
                int i9 = 0;
                for (int i10 = 0; i10 < i2; i10++) {
                    i9 += java.lang.Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
                }
                if (i9 * i7 < i6 * i2) {
                    i7 = i2;
                    i6 = i9;
                }
                if (i9 * i5 > i8 * i2) {
                    i5 = i2;
                    i8 = i9;
                }
                i2++;
            }
            this.getHighSpeedVideoFpsRanges = i6 / i7;
            this.getHighResolutionOutputSizeshNQ4ISI = i8 / i5;
            return i7;
        }

        private short[] getHighSpeedVideoFpsRanges(short[] sArr, int i, int i2) {
            int length = sArr.length / androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor;
            return i + i2 <= length ? sArr : java.util.Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * androidx.media3.common.audio.Sonic.this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ short[] getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ short[] getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final /* bridge */ /* synthetic */ short[] getHighSpeedVideoFpsRangesFor() {
            return this.getOutputFormats;
        }
    }
}
