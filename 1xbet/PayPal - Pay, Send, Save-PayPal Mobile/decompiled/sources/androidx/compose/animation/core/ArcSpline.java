package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "", "getPos", "(F[F)V", "getSlope", "Landroidx/compose/animation/core/ArcSpline$Arc;", "getHighSpeedVideoFpsRanges", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "Camera2StreamConfigurationMap", "", "Z", "getHighSpeedVideoFpsRangesFor", "Arc"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArcSpline {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor = true;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.ArcSpline.Arc[][] Camera2StreamConfigurationMap;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r9 != 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r7 == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[LOOP:1: B:13:0x0042->B:14:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcSpline(int[] iArr, float[] fArr, float[][] fArr2) {
        int length;
        int i;
        int length2 = fArr.length - 1;
        androidx.compose.animation.core.ArcSpline.Arc[][] arcArr = new androidx.compose.animation.core.ArcSpline.Arc[length2][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length2) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            i6 = 4;
                            if (i5 != 4) {
                                i6 = 5;
                            }
                        }
                    }
                    i2 = 2;
                    i3 = i2;
                    float[] fArr3 = fArr2[i4];
                    int i7 = i4 + 1;
                    float[] fArr4 = fArr2[i7];
                    float f = fArr[i4];
                    float f2 = fArr[i7];
                    length = (fArr3.length % 2) + (fArr3.length / 2);
                    androidx.compose.animation.core.ArcSpline.Arc[] arcArr2 = new androidx.compose.animation.core.ArcSpline.Arc[length];
                    i = 0;
                    while (i < length) {
                        int i8 = i * 2;
                        int i9 = i8 + 1;
                        int i10 = i;
                        androidx.compose.animation.core.ArcSpline.Arc[] arcArr3 = arcArr2;
                        arcArr3[i10] = new androidx.compose.animation.core.ArcSpline.Arc(i3, f, f2, fArr3[i8], fArr3[i9], fArr4[i8], fArr4[i9]);
                        i = i10 + 1;
                        arcArr2 = arcArr3;
                    }
                    arcArr[i4] = arcArr2;
                    i4 = i7;
                }
                i2 = 1;
                i3 = i2;
                float[] fArr32 = fArr2[i4];
                int i72 = i4 + 1;
                float[] fArr42 = fArr2[i72];
                float f3 = fArr[i4];
                float f22 = fArr[i72];
                length = (fArr32.length % 2) + (fArr32.length / 2);
                androidx.compose.animation.core.ArcSpline.Arc[] arcArr22 = new androidx.compose.animation.core.ArcSpline.Arc[length];
                i = 0;
                while (i < length) {
                }
                arcArr[i4] = arcArr22;
                i4 = i72;
            }
            i3 = i6;
            float[] fArr322 = fArr2[i4];
            int i722 = i4 + 1;
            float[] fArr422 = fArr2[i722];
            float f32 = fArr[i4];
            float f222 = fArr[i722];
            length = (fArr322.length % 2) + (fArr322.length / 2);
            androidx.compose.animation.core.ArcSpline.Arc[] arcArr222 = new androidx.compose.animation.core.ArcSpline.Arc[length];
            i = 0;
            while (i < length) {
            }
            arcArr[i4] = arcArr222;
            i4 = i722;
        }
        this.Camera2StreamConfigurationMap = arcArr;
    }

    public final void getPos(float time, float[] v) {
        androidx.compose.animation.core.ArcSpline.Arc[][] arcArr = this.Camera2StreamConfigurationMap;
        androidx.compose.animation.core.ArcSpline.Arc[][] arcArr2 = arcArr;
        int length = arcArr2.length - 1;
        int i = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = v.length;
        if (!this.getHighSpeedVideoFpsRangesFor) {
            time = java.lang.Math.min(java.lang.Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f = time - time1;
            int i2 = 0;
            while (i < length2 - 1) {
                androidx.compose.animation.core.ArcSpline.Arc arc = arcArr[length][i2];
                if (arc.isLinear) {
                    v[i] = arc.getLinearX(time1) + (arc.ellipseCenterX * f);
                    v[i + 1] = arc.getLinearY(time1) + (arc.ellipseCenterY * f);
                } else {
                    arc.setPoint(time1);
                    v[i] = arc.ellipseCenterX + (arc.ellipseA * arc.getOutputFormats) + (arc.calcDX() * f);
                    v[i + 1] = arc.ellipseCenterY + (arc.ellipseB * arc.getHighSpeedVideoSizesFor) + (arc.calcDY() * f);
                }
                i += 2;
                i2++;
            }
            return;
        }
        int length3 = arcArr2.length;
        boolean z = false;
        for (int i3 = 0; i3 < length3; i3++) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2 - 1) {
                androidx.compose.animation.core.ArcSpline.Arc arc2 = arcArr[i3][i5];
                if (time <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        v[i4] = arc2.getLinearX(time);
                        v[i4 + 1] = arc2.getLinearY(time);
                    } else {
                        arc2.setPoint(time);
                        v[i4] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.getOutputFormats);
                        v[i4 + 1] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.getHighSpeedVideoSizesFor);
                    }
                    z = true;
                }
                i4 += 2;
                i5++;
            }
            if (z) {
                return;
            }
        }
    }

    public final void getSlope(float time, float[] v) {
        androidx.compose.animation.core.ArcSpline.Arc[][] arcArr = this.Camera2StreamConfigurationMap;
        float time1 = arcArr[0][0].getTime1();
        androidx.compose.animation.core.ArcSpline.Arc[][] arcArr2 = arcArr;
        float time2 = arcArr[arcArr2.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v.length;
        int length2 = arcArr2.length;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length - 1) {
                androidx.compose.animation.core.ArcSpline.Arc arc = arcArr[i][i3];
                if (time2 <= arc.getTime2()) {
                    if (!arc.isLinear) {
                        arc.setPoint(time2);
                        v[i2] = arc.calcDX();
                        v[i2 + 1] = arc.calcDY();
                    } else {
                        v[i2] = arc.ellipseCenterX;
                        v[i2 + 1] = arc.ellipseCenterY;
                    }
                    z = true;
                }
                i2 += 2;
                i3++;
            }
            if (z) {
                return;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010%\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010(\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010,\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0014\u0010-\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001dR\u0014\u00100\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001dR\u0014\u00103\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0015\u00105\u001a\u00020\u00048Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0012R\u0015\u00107\u001a\u00020\u00048Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0012"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "time", "", "setPoint", "(F)V", "calcX", "()F", "calcY", "calcDX", "calcDY", "getLinearX", "(F)F", "getLinearY", "p0", "getHighSpeedVideoFpsRanges", "buildTable$animation_core", "(FFFF)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTime1", "getTime2", "getOutputFormats", "getHighSpeedVideoSizes", "getInputFormats", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "", "[F", "getOutputMinFrameDuration", "getOutputStallDurationlomOqCM", "ellipseA", "ellipseB", "", "isLinear", "Z", "ellipseCenterX", "ellipseCenterY", "getLinearDX$animation_core", "linearDX", "getLinearDY$animation_core", "linearDY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Arc {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private float getHighSpeedVideoSizesFor;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final float getInputFormats;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final float getOutputMinFrameDuration;
        private float getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final float[] getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private final float getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final float Camera2StreamConfigurationMap;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private float getOutputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final float getHighSpeedVideoSizes;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final float getOutputStallDurationlomOqCM;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final float getHighSpeedVideoFpsRanges;
        public final boolean isLinear;
        private final float time1;
        private final float time2;

        public Arc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.time1 = f;
            this.time2 = f2;
            this.getHighSpeedVideoSizes = f3;
            this.Camera2StreamConfigurationMap = f4;
            this.getHighResolutionOutputSizeshNQ4ISI = f5;
            this.getHighSpeedVideoFpsRanges = f6;
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            boolean z = true;
            boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
            float f9 = z2 ? -1.0f : 1.0f;
            this.getOutputStallDurationlomOqCM = f9;
            float f10 = 1.0f / (f2 - f);
            this.getOutputMinFrameDuration = f10;
            this.getInputSizeshNQ4ISI = new float[101];
            boolean z3 = i == 3;
            if (z3 || java.lang.Math.abs(f7) < 0.001f || java.lang.Math.abs(f8) < 0.001f) {
                float hypot = (float) java.lang.Math.hypot(f8, f7);
                this.getHighSpeedVideoFpsRangesFor = hypot;
                this.getInputFormats = hypot * f10;
                this.ellipseCenterX = f7 * f10;
                this.ellipseCenterY = f8 * f10;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f7 * f9;
                this.ellipseB = f8 * (-f9);
                this.ellipseCenterX = z2 ? f5 : f3;
                this.ellipseCenterY = z2 ? f4 : f6;
                buildTable$animation_core(f3, f4, f5, f6);
                this.getInputFormats = this.getHighSpeedVideoFpsRangesFor * f10;
                z = z3;
            }
            this.isLinear = z;
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        /* renamed from: getLinearDX$animation_core, reason: from getter */
        public final float getEllipseCenterX() {
            return this.ellipseCenterX;
        }

        /* renamed from: getLinearDY$animation_core, reason: from getter */
        public final float getEllipseCenterY() {
            return this.ellipseCenterY;
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.getOutputFormats);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.getHighSpeedVideoSizesFor);
        }

        public final float calcDX() {
            float f = this.ellipseA * this.getHighSpeedVideoSizesFor;
            return f * this.getOutputStallDurationlomOqCM * (this.getInputFormats / ((float) java.lang.Math.hypot(f, (-this.ellipseB) * this.getOutputFormats)));
        }

        public final float calcDY() {
            float f = this.ellipseA;
            float f2 = this.getHighSpeedVideoSizesFor;
            float f3 = (-this.ellipseB) * this.getOutputFormats;
            return f3 * this.getOutputStallDurationlomOqCM * (this.getInputFormats / ((float) java.lang.Math.hypot(f * f2, f3)));
        }

        public final float getLinearX(float time) {
            float f = this.time1;
            float f2 = this.getOutputMinFrameDuration;
            float f3 = this.getHighSpeedVideoSizes;
            return f3 + ((time - f) * f2 * (this.getHighResolutionOutputSizeshNQ4ISI - f3));
        }

        public final float getLinearY(float time) {
            float f = this.time1;
            float f2 = this.getOutputMinFrameDuration;
            float f3 = this.Camera2StreamConfigurationMap;
            return f3 + ((time - f) * f2 * (this.getHighSpeedVideoFpsRanges - f3));
        }

        private final float getHighSpeedVideoFpsRanges(float p0) {
            if (p0 <= 0.0f) {
                return 0.0f;
            }
            if (p0 >= 1.0f) {
                return 1.0f;
            }
            float f = p0 * 100.0f;
            int i = (int) f;
            float[] fArr = this.getInputSizeshNQ4ISI;
            float f2 = fArr[i];
            return f2 + ((f - i) * (fArr[i + 1] - f2));
        }

        public final void buildTable$animation_core(float x1, float y1, float x2, float y2) {
            float[] fArr;
            float f;
            float f2;
            float f3 = y1 - y2;
            fArr = androidx.compose.animation.core.ArcSplineKt.getHighSpeedVideoFpsRangesFor;
            int length = fArr.length - 1;
            float f4 = length;
            float[] fArr2 = this.getInputSizeshNQ4ISI;
            if (length > 0) {
                float f5 = f3;
                int i = 1;
                float f6 = 0.0f;
                f2 = 0.0f;
                while (true) {
                    f = f4;
                    double radians = (float) java.lang.Math.toRadians((i * 90.0d) / length);
                    float sin = ((float) java.lang.Math.sin(radians)) * (x2 - x1);
                    float cos = ((float) java.lang.Math.cos(radians)) * f3;
                    f2 += (float) java.lang.Math.hypot(sin - f6, cos - f5);
                    fArr[i] = f2;
                    if (i == length) {
                        break;
                    }
                    i++;
                    f6 = sin;
                    f5 = cos;
                    f4 = f;
                }
            } else {
                f = f4;
                f2 = 0.0f;
            }
            this.getHighSpeedVideoFpsRangesFor = f2;
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    fArr[i2] = fArr[i2] / f2;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float f7 = i3 / 100.0f;
                int binarySearch$default = kotlin.collections.ArraysKt.binarySearch$default(fArr, f7, 0, 0, 6, (java.lang.Object) null);
                if (binarySearch$default >= 0) {
                    fArr2[i3] = binarySearch$default / f;
                } else if (binarySearch$default == -1) {
                    fArr2[i3] = 0.0f;
                } else {
                    int i4 = -binarySearch$default;
                    int i5 = i4 - 2;
                    float f8 = i5;
                    float f9 = fArr[i5];
                    fArr2[i3] = (f8 + ((f7 - f9) / (fArr[i4 - 1] - f9))) / f;
                }
            }
        }

        public final void setPoint(float time) {
            double highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((this.getOutputStallDurationlomOqCM == -1.0f ? this.time2 - time : time - this.time1) * this.getOutputMinFrameDuration) * 1.5707964f;
            this.getOutputFormats = (float) java.lang.Math.sin(highSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizesFor = (float) java.lang.Math.cos(highSpeedVideoFpsRanges);
        }
    }
}
