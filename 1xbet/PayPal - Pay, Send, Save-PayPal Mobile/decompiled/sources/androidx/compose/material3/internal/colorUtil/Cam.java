package androidx.compose.material3.internal.colorUtil;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\"\u0010\u0019"}, d2 = {"Landroidx/compose/material3/internal/colorUtil/Cam;", "", "", "hue", "chroma", "j", "m", lib.android.paypal.com.magnessdk.g.n2, "jstar", "astar", "bstar", "<init>", "(FFFFFFFF)V", "other", "distance", "(Landroidx/compose/material3/internal/colorUtil/Cam;)F", "", "viewedInSrgb", "()I", "Landroidx/compose/material3/internal/colorUtil/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "viewed", "(Landroidx/compose/material3/internal/colorUtil/Frame;)I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHue", "()F", "getChroma", "getJ", "getM", "getS", "getJstar", "setJstar", "(F)V", "getAstar", "getBstar", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Cam {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private float jstar;
    private final float m;
    private final float s;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.internal.colorUtil.Cam.Companion INSTANCE = new androidx.compose.material3.internal.colorUtil.Cam.Companion(null);
    public static final int $stable = 8;

    public Cam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.hue = f;
        this.chroma = f2;
        this.j = f3;
        this.m = f4;
        this.s = f5;
        this.jstar = f6;
        this.astar = f7;
        this.bstar = f8;
    }

    public final float getHue() {
        return this.hue;
    }

    public final float getChroma() {
        return this.chroma;
    }

    public final float getJ() {
        return this.j;
    }

    public final float getM() {
        return this.m;
    }

    public final float getS() {
        return this.s;
    }

    public final float getJstar() {
        return this.jstar;
    }

    public final void setJstar(float f) {
        this.jstar = f;
    }

    public final float getAstar() {
        return this.astar;
    }

    public final float getBstar() {
        return this.bstar;
    }

    public final float distance(androidx.compose.material3.internal.colorUtil.Cam other) {
        float f = this.jstar - other.jstar;
        float f2 = this.astar - other.astar;
        float f3 = this.bstar - other.bstar;
        return (float) (java.lang.Math.pow(java.lang.Math.sqrt((f * f) + (f2 * f2) + (f3 * f3)), 0.63d) * 1.41d);
    }

    public final int viewedInSrgb() {
        return viewed(androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault());
    }

    public final int viewed(androidx.compose.material3.internal.colorUtil.Frame frame) {
        float f;
        float f2 = this.chroma;
        if (f2 != 0.0f) {
            if (this.j != 0.0f) {
                f = f2 / ((float) java.lang.Math.sqrt(r3 / 100.0f));
                float pow = f / ((float) java.lang.Math.pow(1.64f - ((float) java.lang.Math.pow((float) java.lang.Math.pow(0.28999999165534973d, frame.getN()), 0.7300000190734863d)), 1.1111111640930176d));
                float f3 = (this.hue * 3.1415927f) / 180.0f;
                float cos = (float) java.lang.Math.cos(2.0f + f3);
                float aw = frame.getAw();
                float pow2 = (float) java.lang.Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ());
                float nc = frame.getNc();
                float ncb = frame.getNcb();
                float nbb = (aw * pow2) / frame.getNbb();
                double d = f3;
                float sin = (float) java.lang.Math.sin(d);
                float cos2 = (float) java.lang.Math.cos(d);
                float f4 = (((0.305f + nbb) * 23.0f) * pow) / ((((((((cos + 3.8f) * 0.25f) * 3846.1538f) * nc) * ncb) * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = nbb * 460.0f;
                float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                float f10 = ((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f;
                float max = java.lang.Math.max(0.0f, (java.lang.Math.abs(f8) * 27.13f) / (400.0f - java.lang.Math.abs(f8)));
                float signum = java.lang.Math.signum(f8);
                float fl = 100.0f / frame.getFl();
                float pow3 = (float) java.lang.Math.pow(max, 2.3809523582458496d);
                float max2 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f9) * 27.13f) / (400.0f - java.lang.Math.abs(f9)));
                float signum2 = java.lang.Math.signum(f9);
                float fl2 = 100.0f / frame.getFl();
                float pow4 = (float) java.lang.Math.pow(max2, 2.3809523582458496d);
                float max3 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f10) * 27.13f) / (400.0f - java.lang.Math.abs(f10)));
                float signum3 = java.lang.Math.signum(f10);
                float fl3 = 100.0f / frame.getFl();
                float pow5 = (float) java.lang.Math.pow(max3, 2.3809523582458496d);
                float f11 = ((signum * fl) * pow3) / frame.getRgbD()[0];
                float f12 = ((signum2 * fl2) * pow4) / frame.getRgbD()[1];
                float f13 = ((signum3 * fl3) * pow5) / frame.getRgbD()[2];
                float[][] cam16rgb_to_xyz = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
                float[] fArr = cam16rgb_to_xyz[0];
                float f14 = fArr[0];
                float f15 = fArr[1];
                float f16 = fArr[2];
                float[] fArr2 = cam16rgb_to_xyz[1];
                float f17 = fArr2[0];
                float f18 = fArr2[1];
                float f19 = fArr2[2];
                float[] fArr3 = cam16rgb_to_xyz[2];
                return androidx.core.graphics.ColorUtils.XYZToColor((f14 * f11) + (f15 * f12) + (f16 * f13), (f17 * f11) + (f18 * f12) + (f19 * f13), (f11 * fArr3[0]) + (f12 * fArr3[1]) + (f13 * fArr3[2]));
            }
        }
        f = 0.0f;
        float pow6 = f / ((float) java.lang.Math.pow(1.64f - ((float) java.lang.Math.pow((float) java.lang.Math.pow(0.28999999165534973d, frame.getN()), 0.7300000190734863d)), 1.1111111640930176d));
        float f32 = (this.hue * 3.1415927f) / 180.0f;
        float cos3 = (float) java.lang.Math.cos(2.0f + f32);
        float aw2 = frame.getAw();
        float pow22 = (float) java.lang.Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ());
        float nc2 = frame.getNc();
        float ncb2 = frame.getNcb();
        float nbb2 = (aw2 * pow22) / frame.getNbb();
        double d2 = f32;
        float sin2 = (float) java.lang.Math.sin(d2);
        float cos22 = (float) java.lang.Math.cos(d2);
        float f42 = (((0.305f + nbb2) * 23.0f) * pow6) / ((((((((cos3 + 3.8f) * 0.25f) * 3846.1538f) * nc2) * ncb2) * 23.0f) + ((11.0f * pow6) * cos22)) + ((pow6 * 108.0f) * sin2));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = nbb2 * 460.0f;
        float f82 = (((451.0f * f52) + f72) + (288.0f * f62)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        float f102 = ((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f;
        float max4 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f82) * 27.13f) / (400.0f - java.lang.Math.abs(f82)));
        float signum4 = java.lang.Math.signum(f82);
        float fl4 = 100.0f / frame.getFl();
        float pow32 = (float) java.lang.Math.pow(max4, 2.3809523582458496d);
        float max22 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f92) * 27.13f) / (400.0f - java.lang.Math.abs(f92)));
        float signum22 = java.lang.Math.signum(f92);
        float fl22 = 100.0f / frame.getFl();
        float pow42 = (float) java.lang.Math.pow(max22, 2.3809523582458496d);
        float max32 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f102) * 27.13f) / (400.0f - java.lang.Math.abs(f102)));
        float signum32 = java.lang.Math.signum(f102);
        float fl32 = 100.0f / frame.getFl();
        float pow52 = (float) java.lang.Math.pow(max32, 2.3809523582458496d);
        float f112 = ((signum4 * fl4) * pow32) / frame.getRgbD()[0];
        float f122 = ((signum22 * fl22) * pow42) / frame.getRgbD()[1];
        float f132 = ((signum32 * fl32) * pow52) / frame.getRgbD()[2];
        float[][] cam16rgb_to_xyz2 = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
        float[] fArr4 = cam16rgb_to_xyz2[0];
        float f142 = fArr4[0];
        float f152 = fArr4[1];
        float f162 = fArr4[2];
        float[] fArr22 = cam16rgb_to_xyz2[1];
        float f172 = fArr22[0];
        float f182 = fArr22[1];
        float f192 = fArr22[2];
        float[] fArr32 = cam16rgb_to_xyz2[2];
        return androidx.core.graphics.ColorUtils.XYZToColor((f142 * f112) + (f152 * f122) + (f162 * f132), (f172 * f112) + (f182 * f122) + (f192 * f132), (f112 * fArr32[0]) + (f122 * fArr32[1]) + (f132 * fArr32[2]));
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/material3/internal/colorUtil/Cam$Companion;", "", "<init>", "()V", "", "hue", "chroma", "lstar", "", "getInt", "(FFF)I", "argb", "Landroidx/compose/material3/internal/colorUtil/Cam;", "fromInt", "(I)Landroidx/compose/material3/internal/colorUtil/Cam;", "p0", "p1", "p2", "Landroidx/compose/material3/internal/colorUtil/Frame;", "p3", "Camera2StreamConfigurationMap", "(FFFLandroidx/compose/material3/internal/colorUtil/Frame;)Landroidx/compose/material3/internal/colorUtil/Cam;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getInt(float hue, float chroma, float lstar) {
            float f;
            float f2 = chroma;
            androidx.compose.material3.internal.colorUtil.Frame frame = androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault();
            if (kotlin.jvm.internal.Intrinsics.areEqual(frame, androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault())) {
                return androidx.compose.material3.internal.colorUtil.HctSolver.INSTANCE.solveToInt(hue, f2, lstar);
            }
            if (f2 >= 1.0d && java.lang.Math.round(lstar) > 0.0d && java.lang.Math.round(lstar) < 100.0d) {
                float f3 = 0.0f;
                float min = hue < 0.0f ? 0.0f : java.lang.Math.min(360.0f, hue);
                float f4 = 0.0f;
                boolean z = true;
                androidx.compose.material3.internal.colorUtil.Cam cam = null;
                float f5 = f2;
                while (java.lang.Math.abs(f4 - f2) >= 0.4000000059604645d) {
                    float f6 = 1000.0f;
                    float f7 = f3;
                    float f8 = 100.0f;
                    androidx.compose.material3.internal.colorUtil.Cam cam2 = null;
                    float f9 = 1000.0f;
                    while (true) {
                        if (java.lang.Math.abs(f7 - f8) <= 0.009999999776482582d) {
                            f = f5;
                            f3 = 0.0f;
                            break;
                        }
                        float f10 = ((f8 - f7) / 2.0f) + f7;
                        int viewedInSrgb = Camera2StreamConfigurationMap(f10, f5, min, androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault()).viewedInSrgb();
                        float lstarFromInt = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.lstarFromInt(viewedInSrgb);
                        float f11 = f6;
                        float f12 = f9;
                        float abs = java.lang.Math.abs(lstar - lstarFromInt);
                        if (abs < 0.2f) {
                            androidx.compose.material3.internal.colorUtil.Cam fromInt = fromInt(viewedInSrgb);
                            f = f5;
                            float distance = fromInt.distance(Camera2StreamConfigurationMap(fromInt.getJ(), fromInt.getChroma(), min, androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault()));
                            if (distance <= 1.0f) {
                                cam2 = fromInt;
                                f11 = abs;
                                f9 = distance;
                                f3 = 0.0f;
                                if (f11 != 0.0f && f9 == 0.0f) {
                                    break;
                                }
                                if (lstarFromInt >= lstar) {
                                    f7 = f10;
                                } else {
                                    f8 = f10;
                                }
                                f6 = f11;
                                f5 = f;
                            }
                        } else {
                            f = f5;
                        }
                        f9 = f12;
                        f3 = 0.0f;
                        if (f11 != 0.0f) {
                        }
                        if (lstarFromInt >= lstar) {
                        }
                        f6 = f11;
                        f5 = f;
                    }
                    if (!z) {
                        if (cam2 == null) {
                            f2 = f;
                        } else {
                            cam = cam2;
                            f4 = f;
                        }
                        f5 = ((f2 - f4) / 2.0f) + f4;
                    } else {
                        if (cam2 != null) {
                            return cam2.viewed(frame);
                        }
                        f5 = ((f2 - f4) / 2.0f) + f4;
                        z = false;
                    }
                }
                if (cam != null) {
                    return cam.viewed(frame);
                }
            }
            return androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.intFromLstar(lstar);
        }

        public final androidx.compose.material3.internal.colorUtil.Cam fromInt(int argb) {
            androidx.compose.material3.internal.colorUtil.Frame frame = androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault();
            float[] xyzFromInt = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.xyzFromInt(argb);
            float[][] xyz_to_cam16rgb = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.getXYZ_TO_CAM16RGB();
            float f = xyzFromInt[0];
            float[] fArr = xyz_to_cam16rgb[0];
            float f2 = fArr[0];
            float f3 = xyzFromInt[1];
            float f4 = fArr[1];
            float f5 = xyzFromInt[2];
            float f6 = fArr[2];
            float[] fArr2 = xyz_to_cam16rgb[1];
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            float f9 = fArr2[2];
            float[] fArr3 = xyz_to_cam16rgb[2];
            float f10 = fArr3[0];
            float f11 = fArr3[1];
            float f12 = fArr3[2];
            float f13 = frame.getRgbD()[0] * ((f2 * f) + (f4 * f3) + (f6 * f5));
            float f14 = frame.getRgbD()[1] * ((f7 * f) + (f8 * f3) + (f9 * f5));
            float f15 = frame.getRgbD()[2] * ((f * f10) + (f3 * f11) + (f5 * f12));
            float pow = (float) java.lang.Math.pow((frame.getFl() * java.lang.Math.abs(f13)) / 100.0f, 0.41999998688697815d);
            float pow2 = (float) java.lang.Math.pow((frame.getFl() * java.lang.Math.abs(f14)) / 100.0f, 0.41999998688697815d);
            float pow3 = (float) java.lang.Math.pow((frame.getFl() * java.lang.Math.abs(f15)) / 100.0f, 0.41999998688697815d);
            float signum = ((java.lang.Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
            float signum2 = ((java.lang.Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
            float signum3 = ((java.lang.Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
            float f16 = (((signum * 11.0f) + ((-12.0f) * signum2)) + signum3) / 11.0f;
            float f17 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
            float f18 = signum2 * 20.0f;
            float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
            float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
            float atan2 = (((float) java.lang.Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
            if (atan2 < 0.0f) {
                atan2 += 360.0f;
            } else if (atan2 >= 360.0f) {
                atan2 -= 360.0f;
            }
            float f21 = atan2;
            float f22 = (f21 * 3.1415927f) / 180.0f;
            float pow4 = ((float) java.lang.Math.pow((f20 * frame.getNbb()) / frame.getAw(), frame.getC() * frame.getZ())) * 100.0f;
            float pow5 = ((float) java.lang.Math.pow(((((((((float) java.lang.Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * frame.getNc()) * frame.getNcb()) * ((float) java.lang.Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) java.lang.Math.pow(1.64f - ((float) java.lang.Math.pow(0.28999999165534973d, frame.getN())), 0.7300000190734863d)) * ((float) java.lang.Math.sqrt(pow4 / 100.0f));
            float flRoot = pow5 * frame.getFlRoot();
            float sqrt = (float) java.lang.Math.sqrt((r3 * frame.getC()) / (frame.getAw() + 4.0f));
            float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
            float log = ((float) java.lang.Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
            double d = f22;
            return new androidx.compose.material3.internal.colorUtil.Cam(f21, pow5, pow4, flRoot, sqrt * 50.0f, f23, log * ((float) java.lang.Math.cos(d)), log * ((float) java.lang.Math.sin(d)));
        }

        private static androidx.compose.material3.internal.colorUtil.Cam Camera2StreamConfigurationMap(float p0, float p1, float p2, androidx.compose.material3.internal.colorUtil.Frame p3) {
            float flRoot = p1 * p3.getFlRoot();
            float sqrt = (float) java.lang.Math.sqrt(((p1 / ((float) java.lang.Math.sqrt(p0 / 100.0d))) * p3.getC()) / (p3.getAw() + 4.0f));
            float f = (1.7f * p0) / ((0.007f * p0) + 1.0f);
            float log = ((float) java.lang.Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
            double d = (3.1415927f * p2) / 180.0f;
            return new androidx.compose.material3.internal.colorUtil.Cam(p2, p1, p0, flRoot, sqrt * 50.0f, f, log * ((float) java.lang.Math.cos(d)), log * ((float) java.lang.Math.sin(d)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
