package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
public class MotionWidget implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    androidx.constraintlayout.core.motion.MotionWidget.Motion Camera2StreamConfigurationMap;
    androidx.constraintlayout.core.motion.MotionWidget.PropertySet getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.core.state.WidgetFrame getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;

    public static class Motion {
        public java.lang.String mAnimateRelativeTo = null;
        public int mAnimateCircleAngleTo = 0;
        public java.lang.String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public java.lang.String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;
    }

    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public androidx.constraintlayout.core.motion.MotionWidget findViewById(int i) {
        return null;
    }

    public androidx.constraintlayout.core.motion.MotionWidget getParent() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public MotionWidget() {
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.state.WidgetFrame();
        this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.motion.MotionWidget.Motion();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.motion.MotionWidget.PropertySet();
    }

    public void setVisibility(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.visibility = i;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges.getId();
    }

    public void layout(int i, int i2, int i3, int i4) {
        setBounds(i, i2, i3, i4);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges.left);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRanges.top);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRanges.right);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRanges.bottom);
        return sb.toString();
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.state.WidgetFrame((androidx.constraintlayout.core.widgets.ConstraintWidget) null);
        }
        this.getHighSpeedVideoFpsRanges.top = i2;
        this.getHighSpeedVideoFpsRanges.left = i;
        this.getHighSpeedVideoFpsRanges.right = i3;
        this.getHighSpeedVideoFpsRanges.bottom = i4;
    }

    public MotionWidget(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.state.WidgetFrame();
        this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.motion.MotionWidget.Motion();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.motion.MotionWidget.PropertySet();
        this.getHighSpeedVideoFpsRanges = widgetFrame;
    }

    public void updateMotion(androidx.constraintlayout.core.motion.utils.TypedValues typedValues) {
        if (this.getHighSpeedVideoFpsRanges.getMotionProperties() != null) {
            this.getHighSpeedVideoFpsRanges.getMotionProperties().applyDelta(typedValues);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (setValueAttributes(i, i2)) {
            return true;
        }
        return setValueMotion(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 605) {
            this.Camera2StreamConfigurationMap.mAnimateRelativeTo = str;
            return true;
        }
        return setValueMotion(i, str);
    }

    public boolean setValueMotion(int i, int i2) {
        switch (i) {
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO /* 606 */:
                this.Camera2StreamConfigurationMap.mAnimateCircleAngleTo = i2;
                return true;
            case 607:
                this.Camera2StreamConfigurationMap.mPathMotionArc = i2;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH /* 608 */:
                this.Camera2StreamConfigurationMap.mDrawPath = i2;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO /* 609 */:
                this.Camera2StreamConfigurationMap.mPolarRelativeTo = i2;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS /* 610 */:
                this.Camera2StreamConfigurationMap.mQuantizeMotionSteps = i2;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE /* 611 */:
                this.Camera2StreamConfigurationMap.mQuantizeInterpolatorType = i2;
                return true;
            case androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID /* 612 */:
                this.Camera2StreamConfigurationMap.mQuantizeInterpolatorID = i2;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueMotion(int i, java.lang.String str) {
        if (i == 603) {
            this.Camera2StreamConfigurationMap.mTransitionEasing = str;
            return true;
        }
        if (i != 604) {
            return false;
        }
        this.Camera2StreamConfigurationMap.mQuantizeInterpolatorString = str;
        return true;
    }

    public boolean setValueMotion(int i, float f) {
        switch (i) {
            case 600:
                this.Camera2StreamConfigurationMap.mMotionStagger = f;
                return true;
            case 601:
                this.Camera2StreamConfigurationMap.mPathRotate = f;
                return true;
            case 602:
                this.Camera2StreamConfigurationMap.mQuantizeMotionPhase = f;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueAttributes(int i, float f) {
        switch (i) {
            case 303:
                this.getHighSpeedVideoFpsRanges.alpha = f;
                return true;
            case 304:
                this.getHighSpeedVideoFpsRanges.translationX = f;
                return true;
            case 305:
                this.getHighSpeedVideoFpsRanges.translationY = f;
                return true;
            case 306:
                this.getHighSpeedVideoFpsRanges.translationZ = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.getHighSpeedVideoFpsRanges.rotationX = f;
                return true;
            case 309:
                this.getHighSpeedVideoFpsRanges.rotationY = f;
                return true;
            case 310:
                this.getHighSpeedVideoFpsRanges.rotationZ = f;
                return true;
            case 311:
                this.getHighSpeedVideoFpsRanges.scaleX = f;
                return true;
            case 312:
                this.getHighSpeedVideoFpsRanges.scaleY = f;
                return true;
            case 313:
                this.getHighSpeedVideoFpsRanges.pivotX = f;
                return true;
            case 314:
                this.getHighSpeedVideoFpsRanges.pivotY = f;
                return true;
            case 315:
                this.getHighSpeedVideoFpsRangesFor = f;
                return true;
            case 316:
                this.getHighSpeedVideoSizes = f;
                return true;
        }
    }

    public float getValueAttributes(int i) {
        switch (i) {
            case 303:
                return this.getHighSpeedVideoFpsRanges.alpha;
            case 304:
                return this.getHighSpeedVideoFpsRanges.translationX;
            case 305:
                return this.getHighSpeedVideoFpsRanges.translationY;
            case 306:
                return this.getHighSpeedVideoFpsRanges.translationZ;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.getHighSpeedVideoFpsRanges.rotationX;
            case 309:
                return this.getHighSpeedVideoFpsRanges.rotationY;
            case 310:
                return this.getHighSpeedVideoFpsRanges.rotationZ;
            case 311:
                return this.getHighSpeedVideoFpsRanges.scaleX;
            case 312:
                return this.getHighSpeedVideoFpsRanges.scaleY;
            case 313:
                return this.getHighSpeedVideoFpsRanges.pivotX;
            case 314:
                return this.getHighSpeedVideoFpsRanges.pivotY;
            case 315:
                return this.getHighSpeedVideoFpsRangesFor;
            case 316:
                return this.getHighSpeedVideoSizes;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        int id = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(str);
        return id != -1 ? id : androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.getId(str);
    }

    public int getTop() {
        return this.getHighSpeedVideoFpsRanges.top;
    }

    public int getLeft() {
        return this.getHighSpeedVideoFpsRanges.left;
    }

    public int getBottom() {
        return this.getHighSpeedVideoFpsRanges.bottom;
    }

    public int getRight() {
        return this.getHighSpeedVideoFpsRanges.right;
    }

    public void setPivotX(float f) {
        this.getHighSpeedVideoFpsRanges.pivotX = f;
    }

    public void setPivotY(float f) {
        this.getHighSpeedVideoFpsRanges.pivotY = f;
    }

    public float getRotationX() {
        return this.getHighSpeedVideoFpsRanges.rotationX;
    }

    public void setRotationX(float f) {
        this.getHighSpeedVideoFpsRanges.rotationX = f;
    }

    public float getRotationY() {
        return this.getHighSpeedVideoFpsRanges.rotationY;
    }

    public void setRotationY(float f) {
        this.getHighSpeedVideoFpsRanges.rotationY = f;
    }

    public float getRotationZ() {
        return this.getHighSpeedVideoFpsRanges.rotationZ;
    }

    public void setRotationZ(float f) {
        this.getHighSpeedVideoFpsRanges.rotationZ = f;
    }

    public float getTranslationX() {
        return this.getHighSpeedVideoFpsRanges.translationX;
    }

    public void setTranslationX(float f) {
        this.getHighSpeedVideoFpsRanges.translationX = f;
    }

    public float getTranslationY() {
        return this.getHighSpeedVideoFpsRanges.translationY;
    }

    public void setTranslationY(float f) {
        this.getHighSpeedVideoFpsRanges.translationY = f;
    }

    public void setTranslationZ(float f) {
        this.getHighSpeedVideoFpsRanges.translationZ = f;
    }

    public float getTranslationZ() {
        return this.getHighSpeedVideoFpsRanges.translationZ;
    }

    public float getScaleX() {
        return this.getHighSpeedVideoFpsRanges.scaleX;
    }

    public void setScaleX(float f) {
        this.getHighSpeedVideoFpsRanges.scaleX = f;
    }

    public float getScaleY() {
        return this.getHighSpeedVideoFpsRanges.scaleY;
    }

    public void setScaleY(float f) {
        this.getHighSpeedVideoFpsRanges.scaleY = f;
    }

    public int getVisibility() {
        return this.getHighResolutionOutputSizeshNQ4ISI.visibility;
    }

    public float getPivotX() {
        return this.getHighSpeedVideoFpsRanges.pivotX;
    }

    public float getPivotY() {
        return this.getHighSpeedVideoFpsRanges.pivotY;
    }

    public float getAlpha() {
        return this.getHighSpeedVideoFpsRanges.alpha;
    }

    public int getX() {
        return this.getHighSpeedVideoFpsRanges.left;
    }

    public int getY() {
        return this.getHighSpeedVideoFpsRanges.top;
    }

    public int getWidth() {
        return this.getHighSpeedVideoFpsRanges.right - this.getHighSpeedVideoFpsRanges.left;
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges.bottom - this.getHighSpeedVideoFpsRanges.top;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getWidgetFrame() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
        return this.getHighSpeedVideoFpsRanges.getCustomAttributeNames();
    }

    public void setCustomAttribute(java.lang.String str, int i, float f) {
        this.getHighSpeedVideoFpsRanges.setCustomAttribute(str, i, f);
    }

    public void setCustomAttribute(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.setCustomAttribute(str, i, i2);
    }

    public void setCustomAttribute(java.lang.String str, int i, boolean z) {
        this.getHighSpeedVideoFpsRanges.setCustomAttribute(str, i, z);
    }

    public void setCustomAttribute(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges.setCustomAttribute(str, i, str2);
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.getCustomAttribute(str);
    }

    public void setInterpolatedValue(androidx.constraintlayout.core.motion.CustomAttribute customAttribute, float[] fArr) {
        this.getHighSpeedVideoFpsRanges.setCustomAttribute(customAttribute.getHighSpeedVideoSizes, 901, fArr[0]);
    }
}
