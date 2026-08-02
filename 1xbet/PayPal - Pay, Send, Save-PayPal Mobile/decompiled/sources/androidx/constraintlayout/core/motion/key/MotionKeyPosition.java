package androidx.constraintlayout.core.motion.key;

/* loaded from: classes6.dex */
public class MotionKeyPosition extends androidx.constraintlayout.core.motion.key.MotionKey {
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public int mCurveFit = UNSET;
    public java.lang.String mTransitionEasing = null;
    public int mPathMotionArc = UNSET;
    public int mDrawPath = 0;
    public float mPercentWidth = Float.NaN;
    public float mPercentHeight = Float.NaN;
    public float mPercentX = Float.NaN;
    public float mPercentY = Float.NaN;
    public float mAltPercentX = Float.NaN;
    public float mAltPercentY = Float.NaN;
    public int mPositionType = 0;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float Camera2StreamConfigurationMap = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public MotionKeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9052clone() throws java.lang.CloneNotSupportedException {
        return mo9052clone();
    }

    public void positionAttributes(androidx.constraintlayout.core.motion.MotionWidget motionWidget, androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        int i = this.mPositionType;
        if (i == 1) {
            float centerX = floatRect.centerX();
            float centerY = floatRect.centerY();
            float centerX2 = floatRect2.centerX() - centerX;
            float centerY2 = floatRect2.centerY() - centerY;
            float hypot = (float) java.lang.Math.hypot(centerX2, centerY2);
            if (hypot < 1.0E-4d) {
                java.lang.System.out.println("distance ~ 0");
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                return;
            }
            float f3 = centerX2 / hypot;
            float f4 = centerY2 / hypot;
            float f5 = f2 - centerY;
            float f6 = f - centerX;
            float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
            float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
            java.lang.String str = strArr[0];
            if (str != null) {
                if ("percentX".equals(str)) {
                    fArr[0] = f8;
                    fArr[1] = f7;
                    return;
                }
                return;
            }
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
            return;
        }
        if (i != 2) {
            float centerX3 = floatRect.centerX();
            float centerY3 = floatRect.centerY();
            float centerX4 = floatRect2.centerX() - centerX3;
            float centerY4 = floatRect2.centerY() - centerY3;
            java.lang.String str2 = strArr[0];
            if (str2 != null) {
                if ("percentX".equals(str2)) {
                    fArr[0] = (f - centerX3) / centerX4;
                    fArr[1] = (f2 - centerY3) / centerY4;
                    return;
                } else {
                    fArr[1] = (f - centerX3) / centerX4;
                    fArr[0] = (f2 - centerY3) / centerY4;
                    return;
                }
            }
            strArr[0] = "percentX";
            fArr[0] = (f - centerX3) / centerX4;
            strArr[1] = "percentY";
            fArr[1] = (f2 - centerY3) / centerY4;
            return;
        }
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        androidx.constraintlayout.core.motion.MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        java.lang.String str3 = strArr[0];
        if (str3 != null) {
            if ("percentX".equals(str3)) {
                fArr[0] = f / width;
                fArr[1] = f2 / height;
                return;
            } else {
                fArr[1] = f / width;
                fArr[0] = f2 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f / width;
        strArr[1] = "percentY";
        fArr[1] = f2 / height;
    }

    public boolean intersects(int i, int i2, androidx.constraintlayout.core.motion.utils.FloatRect floatRect, androidx.constraintlayout.core.motion.utils.FloatRect floatRect2, float f, float f2) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX();
        float centerY2 = floatRect2.centerY();
        int i3 = this.mPositionType;
        if (i3 != 1) {
            if (i3 != 2) {
                float f3 = centerX2 - centerX;
                float f4 = centerY2 - centerY;
                float f5 = java.lang.Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
                float f6 = java.lang.Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
                float f7 = java.lang.Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
                this.getHighSpeedVideoFpsRangesFor = (int) (centerX + (f5 * f3) + ((java.lang.Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f4));
                this.Camera2StreamConfigurationMap = (int) (centerY + (f3 * f6) + (f4 * f7));
            } else {
                float f8 = this.mPercentX;
                this.getHighSpeedVideoFpsRangesFor = (i * f8) + 0.0f;
                this.Camera2StreamConfigurationMap = (i2 * f8) + 0.0f;
            }
        } else {
            float f9 = centerX2 - centerX;
            float f10 = centerY2 - centerY;
            float f11 = this.mPercentX;
            float f12 = this.mPercentY;
            this.getHighSpeedVideoFpsRangesFor = centerX + (f9 * f11) + ((-f10) * f12);
            this.Camera2StreamConfigurationMap = centerY + (f10 * f11) + (f9 * f12);
        }
        return java.lang.Math.abs(f - this.getHighSpeedVideoFpsRangesFor) < 20.0f && java.lang.Math.abs(f2 - this.Camera2StreamConfigurationMap) < 20.0f;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.getHighSpeedVideoFpsRangesFor = motionKeyPosition.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = motionKeyPosition.Camera2StreamConfigurationMap;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo9052clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        }
        if (i == 508) {
            this.mCurveFit = i2;
            return true;
        }
        if (i == 510) {
            this.mPositionType = i2;
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        switch (i) {
            case 503:
                this.mPercentWidth = f;
                return true;
            case 504:
                this.mPercentHeight = f;
                return true;
            case 505:
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f;
                return true;
            case 507:
                this.mPercentY = f;
                return true;
            default:
                return super.setValue(i, f);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 501) {
            this.mTransitionEasing = str.toString();
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.getId(str);
    }
}
