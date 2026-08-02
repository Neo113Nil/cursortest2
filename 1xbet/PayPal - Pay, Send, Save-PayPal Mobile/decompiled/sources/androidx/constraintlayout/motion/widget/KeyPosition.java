package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyPosition extends androidx.constraintlayout.motion.widget.KeyPositionBase {
    public static final java.lang.String DRAWPATH = "drawPath";
    public static final java.lang.String PERCENT_HEIGHT = "percentHeight";
    public static final java.lang.String PERCENT_WIDTH = "percentWidth";
    public static final java.lang.String PERCENT_X = "percentX";
    public static final java.lang.String PERCENT_Y = "percentY";
    public static final java.lang.String SIZE_PERCENT = "sizePercent";
    public static final java.lang.String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_AXIS = 3;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    java.lang.String getOutputSizeshNQ4ISI = null;
    int getHighSpeedVideoSizesFor = UNSET;
    int getInputFormats = 0;
    float getOutputMinFrameDuration = Float.NaN;
    float getInputSizeshNQ4ISI = Float.NaN;
    float getOutputStallDuration = Float.NaN;
    float getOutputMinFrameDurationlomOqCM = Float.NaN;
    float getHighSpeedVideoFpsRangesFor = Float.NaN;
    float getOutputFormats = Float.NaN;
    int getOutputStallDurationlomOqCM = 0;
    private float isOutputSupportedForhNQ4ISI = Float.NaN;
    private float isOutputSupportedFor = Float.NaN;

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap) {
    }

    public KeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9054clone() throws java.lang.CloneNotSupportedException {
        return mo9054clone();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyPosition.Loader.Camera2StreamConfigurationMap(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyPosition));
    }

    public void setType(int i) {
        this.getOutputStallDurationlomOqCM = i;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(android.view.View view, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 1) {
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float centerX2 = rectF2.centerX() - centerX;
            float centerY2 = rectF2.centerY() - centerY;
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
        if (i == 2) {
            rectF.centerX();
            rectF.centerY();
            rectF2.centerX();
            rectF2.centerY();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            java.lang.String str2 = strArr[0];
            if (str2 != null) {
                if ("percentX".equals(str2)) {
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
            return;
        }
        if (i != 3) {
            float centerX3 = rectF.centerX();
            float centerY3 = rectF.centerY();
            float centerX4 = rectF2.centerX() - centerX3;
            float centerY4 = rectF2.centerY() - centerY3;
            java.lang.String str3 = strArr[0];
            if (str3 != null) {
                if ("percentX".equals(str3)) {
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
        float centerX5 = rectF.centerX();
        float centerY5 = rectF.centerY();
        float centerX6 = rectF2.centerX();
        float centerY6 = rectF2.centerY();
        if (centerX5 > centerX6) {
            centerX6 = centerX5;
            centerX5 = centerX6;
        }
        if (centerY5 <= centerY6) {
            centerY6 = centerY5;
            centerY5 = centerY6;
        }
        float f9 = centerX6 - centerX5;
        float f10 = centerY5 - centerY6;
        java.lang.String str4 = strArr[0];
        if (str4 != null) {
            if ("percentX".equals(str4)) {
                fArr[0] = (f - centerX5) / f9;
                fArr[1] = (f2 - centerY6) / f10;
                return;
            } else {
                fArr[1] = (f - centerX5) / f9;
                fArr[0] = (f2 - centerY6) / f10;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f - centerX5) / f9;
        strArr[1] = "percentY";
        fArr[1] = (f2 - centerY6) / f10;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int i, int i2, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f, float f2) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX();
        float centerY2 = rectF2.centerY();
        int i3 = this.getOutputStallDurationlomOqCM;
        if (i3 != 1) {
            if (i3 != 2) {
                float f3 = centerX2 - centerX;
                float f4 = centerY2 - centerY;
                float f5 = java.lang.Float.isNaN(this.getOutputStallDuration) ? 0.0f : this.getOutputStallDuration;
                float f6 = java.lang.Float.isNaN(this.getOutputFormats) ? 0.0f : this.getOutputFormats;
                float f7 = java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM) ? 0.0f : this.getOutputMinFrameDurationlomOqCM;
                this.isOutputSupportedForhNQ4ISI = (int) (centerX + (f5 * f3) + ((java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? 0.0f : this.getHighSpeedVideoFpsRangesFor) * f4));
                this.isOutputSupportedFor = (int) (centerY + (f3 * f6) + (f4 * f7));
            } else {
                float f8 = this.getOutputStallDuration;
                this.isOutputSupportedForhNQ4ISI = (i * f8) + 0.0f;
                this.isOutputSupportedFor = (i2 * f8) + 0.0f;
            }
        } else {
            float f9 = centerX2 - centerX;
            float f10 = centerY2 - centerY;
            float f11 = this.getOutputStallDuration;
            float f12 = this.getOutputMinFrameDurationlomOqCM;
            this.isOutputSupportedForhNQ4ISI = centerX + (f9 * f11) + ((-f10) * f12);
            this.isOutputSupportedFor = centerY + (f10 * f11) + (f9 * f12);
        }
        return java.lang.Math.abs(f - this.isOutputSupportedForhNQ4ISI) < 20.0f && java.lang.Math.abs(f2 - this.isOutputSupportedFor) < 20.0f;
    }

    static class Loader {
        private static android.util.SparseIntArray Camera2StreamConfigurationMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            Camera2StreamConfigurationMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_motionTarget, 1);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_framePosition, 2);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_transitionEasing, 3);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_curveFit, 4);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_drawPath, 5);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentX, 6);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentY, 7);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_keyPositionType, 9);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_sizePercent, 8);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentWidth, 11);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_percentHeight, 12);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyPosition_pathMotionArc, 10);
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.constraintlayout.motion.widget.KeyPosition keyPosition, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (Camera2StreamConfigurationMap.get(index)) {
                    case 1:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            keyPosition.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyPosition.getHighSpeedVideoSizes);
                            if (keyPosition.getHighSpeedVideoSizes == -1) {
                                keyPosition.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyPosition.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyPosition.getHighSpeedVideoSizes);
                            break;
                        }
                    case 2:
                        keyPosition.getHighResolutionOutputSizeshNQ4ISI = typedArray.getInt(index, keyPosition.getHighResolutionOutputSizeshNQ4ISI);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            keyPosition.getOutputSizeshNQ4ISI = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.getOutputSizeshNQ4ISI = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        keyPosition.getOutputSizes = typedArray.getInteger(index, keyPosition.getOutputSizes);
                        break;
                    case 5:
                        keyPosition.getInputFormats = typedArray.getInt(index, keyPosition.getInputFormats);
                        break;
                    case 6:
                        keyPosition.getOutputStallDuration = typedArray.getFloat(index, keyPosition.getOutputStallDuration);
                        break;
                    case 7:
                        keyPosition.getOutputMinFrameDurationlomOqCM = typedArray.getFloat(index, keyPosition.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, keyPosition.getInputSizeshNQ4ISI);
                        keyPosition.getOutputMinFrameDuration = f;
                        keyPosition.getInputSizeshNQ4ISI = f;
                        break;
                    case 9:
                        keyPosition.getOutputStallDurationlomOqCM = typedArray.getInt(index, keyPosition.getOutputStallDurationlomOqCM);
                        break;
                    case 10:
                        keyPosition.getHighSpeedVideoSizesFor = typedArray.getInt(index, keyPosition.getHighSpeedVideoSizesFor);
                        break;
                    case 11:
                        keyPosition.getOutputMinFrameDuration = typedArray.getFloat(index, keyPosition.getOutputMinFrameDuration);
                        break;
                    case 12:
                        keyPosition.getInputSizeshNQ4ISI = typedArray.getFloat(index, keyPosition.getInputSizeshNQ4ISI);
                        break;
                    default:
                        Camera2StreamConfigurationMap.get(index);
                        break;
                }
            }
            int i2 = keyPosition.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.getOutputSizeshNQ4ISI = obj.toString();
                break;
            case 1:
                this.getOutputMinFrameDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 2:
                this.getInputSizeshNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 3:
                this.getInputFormats = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 4:
                float floatValue = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                this.getOutputMinFrameDuration = floatValue;
                this.getInputSizeshNQ4ISI = floatValue;
                break;
            case 5:
                this.getOutputStallDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 6:
                this.getOutputMinFrameDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        super.copy(key);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) key;
        this.getOutputSizeshNQ4ISI = keyPosition.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = keyPosition.getHighSpeedVideoSizesFor;
        this.getInputFormats = keyPosition.getInputFormats;
        this.getOutputMinFrameDuration = keyPosition.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getOutputStallDuration = keyPosition.getOutputStallDuration;
        this.getOutputMinFrameDurationlomOqCM = keyPosition.getOutputMinFrameDurationlomOqCM;
        this.getHighSpeedVideoFpsRangesFor = keyPosition.getHighSpeedVideoFpsRangesFor;
        this.getOutputFormats = keyPosition.getOutputFormats;
        this.isOutputSupportedForhNQ4ISI = keyPosition.isOutputSupportedForhNQ4ISI;
        this.isOutputSupportedFor = keyPosition.isOutputSupportedFor;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo9054clone() {
        return new androidx.constraintlayout.motion.widget.KeyPosition().copy(this);
    }
}
