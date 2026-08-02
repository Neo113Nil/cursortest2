package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class WidgetFrame {
    public static float phone_orientation = Float.NaN;
    private final java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> Camera2StreamConfigurationMap;
    public float alpha;
    public int bottom;
    androidx.constraintlayout.core.motion.utils.TypedBundle getHighResolutionOutputSizeshNQ4ISI;
    public float interpolatedPos;
    public int left;

    /* renamed from: name, reason: collision with root package name */
    public java.lang.String f2723name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    public void setCustomValue(androidx.constraintlayout.core.motion.CustomAttribute customAttribute, float[] fArr) {
    }

    public int width() {
        return java.lang.Math.max(0, this.right - this.left);
    }

    public int height() {
        return java.lang.Math.max(0, this.bottom - this.top);
    }

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
        this.f2723name = null;
    }

    public WidgetFrame(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
        this.f2723name = null;
        this.widget = constraintWidget;
    }

    public WidgetFrame(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
        this.f2723name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    public void updateAttributes(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        if (widgetFrame != null) {
            this.pivotX = widgetFrame.pivotX;
            this.pivotY = widgetFrame.pivotY;
            this.rotationX = widgetFrame.rotationX;
            this.rotationY = widgetFrame.rotationY;
            this.rotationZ = widgetFrame.rotationZ;
            this.translationX = widgetFrame.translationX;
            this.translationY = widgetFrame.translationY;
            this.translationZ = widgetFrame.translationZ;
            this.scaleX = widgetFrame.scaleX;
            this.scaleY = widgetFrame.scaleY;
            this.alpha = widgetFrame.alpha;
            this.visibility = widgetFrame.visibility;
            this.getHighResolutionOutputSizeshNQ4ISI = widgetFrame.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap.clear();
            for (androidx.constraintlayout.core.motion.CustomVariable customVariable : widgetFrame.Camera2StreamConfigurationMap.values()) {
                this.Camera2StreamConfigurationMap.put(customVariable.getName(), customVariable.copy());
            }
        }
    }

    public boolean isDefaultTransform() {
        return java.lang.Float.isNaN(this.rotationX) && java.lang.Float.isNaN(this.rotationY) && java.lang.Float.isNaN(this.rotationZ) && java.lang.Float.isNaN(this.translationX) && java.lang.Float.isNaN(this.translationY) && java.lang.Float.isNaN(this.translationZ) && java.lang.Float.isNaN(this.scaleX) && java.lang.Float.isNaN(this.scaleY) && java.lang.Float.isNaN(this.alpha);
    }

    public static void interpolate(int i, int i2, androidx.constraintlayout.core.state.WidgetFrame widgetFrame, androidx.constraintlayout.core.state.WidgetFrame widgetFrame2, androidx.constraintlayout.core.state.WidgetFrame widgetFrame3, androidx.constraintlayout.core.state.Transition transition, float f) {
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3 = 100.0f * f;
        int i12 = (int) f3;
        int i13 = widgetFrame2.left;
        int i14 = widgetFrame2.top;
        int i15 = widgetFrame3.left;
        int i16 = widgetFrame3.top;
        int i17 = widgetFrame2.right;
        int i18 = widgetFrame2.bottom;
        int i19 = widgetFrame3.right - i15;
        int i20 = widgetFrame3.bottom - i16;
        float f4 = widgetFrame2.alpha;
        float f5 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i13 -= (int) (i19 / 2.0f);
            i14 -= (int) (i20 / 2.0f);
            i3 = i20;
            i4 = i19;
            if (java.lang.Float.isNaN(f4)) {
                f4 = 0.0f;
            }
        } else {
            i3 = i18 - i14;
            i4 = i17 - i13;
        }
        if (widgetFrame3.visibility == 8) {
            i15 -= (int) (i4 / 2.0f);
            i16 -= (int) (i3 / 2.0f);
            i19 = i4;
            i20 = i3;
            if (java.lang.Float.isNaN(f5)) {
                f5 = 0.0f;
            }
        }
        if (java.lang.Float.isNaN(f4) && !java.lang.Float.isNaN(f5)) {
            f4 = 1.0f;
        }
        if (!java.lang.Float.isNaN(f4) && java.lang.Float.isNaN(f5)) {
            f5 = 1.0f;
        }
        if (widgetFrame2.visibility == 4) {
            f4 = 0.0f;
        }
        if (widgetFrame3.visibility == 4) {
            f5 = 0.0f;
        }
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            f2 = f;
            i5 = i13;
            i6 = i15;
        } else {
            int i21 = i13;
            androidx.constraintlayout.core.state.Transition.KeyPosition findPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i12);
            androidx.constraintlayout.core.state.Transition.KeyPosition findNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i12);
            if (findPreviousPosition == findNextPosition) {
                findNextPosition = null;
            }
            if (findPreviousPosition != null) {
                i7 = i;
                i21 = (int) (findPreviousPosition.Camera2StreamConfigurationMap * i7);
                i9 = i15;
                i8 = i2;
                i14 = (int) (findPreviousPosition.getHighSpeedVideoFpsRanges * i8);
                i10 = findPreviousPosition.getHighSpeedVideoFpsRangesFor;
            } else {
                i7 = i;
                i8 = i2;
                i9 = i15;
                i10 = 0;
            }
            if (findNextPosition != null) {
                i6 = (int) (findNextPosition.Camera2StreamConfigurationMap * i7);
                i16 = (int) (findNextPosition.getHighSpeedVideoFpsRanges * i8);
                i11 = findNextPosition.getHighSpeedVideoFpsRangesFor;
            } else {
                i11 = 100;
                i6 = i9;
            }
            f2 = (f3 - i10) / (i11 - i10);
            i5 = i21;
        }
        widgetFrame.widget = widgetFrame2.widget;
        int i22 = (int) (i5 + ((i6 - i5) * f2));
        widgetFrame.left = i22;
        int i23 = (int) (i14 + (f2 * (i16 - i14)));
        widgetFrame.top = i23;
        float f6 = 1.0f - f;
        widgetFrame.right = i22 + ((int) ((i4 * f6) + (i19 * f)));
        widgetFrame.bottom = i23 + ((int) ((f6 * i3) + (i20 * f)));
        widgetFrame.pivotX = getHighSpeedVideoFpsRangesFor(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f);
        widgetFrame.pivotY = getHighSpeedVideoFpsRangesFor(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f);
        widgetFrame.rotationX = getHighSpeedVideoFpsRangesFor(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f);
        widgetFrame.rotationY = getHighSpeedVideoFpsRangesFor(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f);
        widgetFrame.rotationZ = getHighSpeedVideoFpsRangesFor(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f);
        widgetFrame.scaleX = getHighSpeedVideoFpsRangesFor(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f);
        widgetFrame.scaleY = getHighSpeedVideoFpsRangesFor(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f);
        widgetFrame.translationX = getHighSpeedVideoFpsRangesFor(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f);
        widgetFrame.translationY = getHighSpeedVideoFpsRangesFor(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f);
        widgetFrame.translationZ = getHighSpeedVideoFpsRangesFor(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f);
        widgetFrame.alpha = getHighSpeedVideoFpsRangesFor(f4, f5, 1.0f, f);
        java.util.Set<java.lang.String> keySet = widgetFrame3.Camera2StreamConfigurationMap.keySet();
        widgetFrame.Camera2StreamConfigurationMap.clear();
        for (java.lang.String str : keySet) {
            if (widgetFrame2.Camera2StreamConfigurationMap.containsKey(str)) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = widgetFrame2.Camera2StreamConfigurationMap.get(str);
                androidx.constraintlayout.core.motion.CustomVariable customVariable2 = widgetFrame3.Camera2StreamConfigurationMap.get(str);
                androidx.constraintlayout.core.motion.CustomVariable customVariable3 = new androidx.constraintlayout.core.motion.CustomVariable(customVariable);
                widgetFrame.Camera2StreamConfigurationMap.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(java.lang.Float.valueOf(getHighSpeedVideoFpsRangesFor(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f)));
                } else {
                    int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[numberOfInterpolatedValues];
                    float[] fArr2 = new float[numberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i24 = 0; i24 < numberOfInterpolatedValues; i24++) {
                        fArr[i24] = getHighSpeedVideoFpsRangesFor(fArr[i24], fArr2[i24], 0.0f, f);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private static float getHighSpeedVideoFpsRangesFor(float f, float f2, float f3, float f4) {
        boolean isNaN = java.lang.Float.isNaN(f);
        boolean isNaN2 = java.lang.Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }

    public float centerX() {
        return this.left + ((this.right - r0) / 2.0f);
    }

    public float centerY() {
        return this.top + ((this.bottom - r0) / 2.0f);
    }

    public androidx.constraintlayout.core.state.WidgetFrame update() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public androidx.constraintlayout.core.state.WidgetFrame update(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public boolean containsCustom(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.containsKey(str);
    }

    public void addCustomColor(java.lang.String str, int i) {
        setCustomAttribute(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, i);
    }

    public int getCustomColor(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            return this.Camera2StreamConfigurationMap.get(str).getColorValue();
        }
        return -21880;
    }

    public void addCustomFloat(java.lang.String str, float f) {
        setCustomAttribute(str, 901, f);
    }

    public float getCustomFloat(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            return this.Camera2StreamConfigurationMap.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public void setCustomAttribute(java.lang.String str, int i, float f) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            this.Camera2StreamConfigurationMap.get(str).setFloatValue(f);
        } else {
            this.Camera2StreamConfigurationMap.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, f));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, int i2) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            this.Camera2StreamConfigurationMap.get(str).setIntValue(i2);
        } else {
            this.Camera2StreamConfigurationMap.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, i2));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, boolean z) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            this.Camera2StreamConfigurationMap.get(str).setBooleanValue(z);
        } else {
            this.Camera2StreamConfigurationMap.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, z));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, java.lang.String str2) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            this.Camera2StreamConfigurationMap.get(str).setStringValue(str2);
        } else {
            this.Camera2StreamConfigurationMap.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, str2));
        }
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
        return this.Camera2StreamConfigurationMap.keySet();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean setValue(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1383228885:
                if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1349088399:
                if (str.equals(io.reactivex.annotations.SchedulerSupport.CUSTOM)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 115029:
                if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c = 17;
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
                phone_orientation = cLElement.getFloat();
                return true;
            case 1:
                this.bottom = cLElement.getInt();
                return true;
            case 2:
                androidx.constraintlayout.core.parser.CLObject cLObject = (androidx.constraintlayout.core.parser.CLObject) cLElement;
                int size = cLObject.size();
                for (int i = 0; i < size; i++) {
                    androidx.constraintlayout.core.parser.CLElement value = ((androidx.constraintlayout.core.parser.CLKey) cLObject.get(i)).getValue();
                    java.lang.String content = value.content();
                    if (content.matches("#[0-9a-fA-F]+")) {
                        setCustomAttribute(this.f2723name, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, java.lang.Integer.parseInt(content.substring(1), 16));
                    } else if (value instanceof androidx.constraintlayout.core.parser.CLNumber) {
                        setCustomAttribute(this.f2723name, 901, value.getFloat());
                    } else {
                        setCustomAttribute(this.f2723name, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, content);
                    }
                }
                return true;
            case 3:
                this.rotationX = cLElement.getFloat();
                return true;
            case 4:
                this.rotationY = cLElement.getFloat();
                return true;
            case 5:
                this.rotationZ = cLElement.getFloat();
                return true;
            case 6:
                this.translationX = cLElement.getFloat();
                return true;
            case 7:
                this.translationY = cLElement.getFloat();
                return true;
            case '\b':
                this.translationZ = cLElement.getFloat();
                return true;
            case '\t':
                this.pivotX = cLElement.getFloat();
                return true;
            case '\n':
                this.pivotY = cLElement.getFloat();
                return true;
            case 11:
                this.scaleX = cLElement.getFloat();
                return true;
            case '\f':
                this.scaleY = cLElement.getFloat();
                return true;
            case '\r':
                this.top = cLElement.getInt();
                return true;
            case 14:
                this.left = cLElement.getInt();
                return true;
            case 15:
                this.alpha = cLElement.getFloat();
                return true;
            case 16:
                this.right = cLElement.getInt();
                return true;
            case 17:
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public java.lang.String getId() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget == null) {
            return "unknown";
        }
        return constraintWidget.stringId;
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb) {
        return serialize(sb, false);
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb, boolean z) {
        sb.append("{\n");
        int i = this.left;
        sb.append(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
        int i2 = this.top;
        sb.append(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
        sb.append(": ");
        sb.append(i2);
        sb.append(",\n");
        int i3 = this.right;
        sb.append(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
        sb.append(": ");
        sb.append(i3);
        sb.append(",\n");
        int i4 = this.bottom;
        sb.append(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
        sb.append(": ");
        sb.append(i4);
        sb.append(",\n");
        getHighSpeedVideoFpsRangesFor(sb, "pivotX", this.pivotX);
        getHighSpeedVideoFpsRangesFor(sb, "pivotY", this.pivotY);
        getHighSpeedVideoFpsRangesFor(sb, "rotationX", this.rotationX);
        getHighSpeedVideoFpsRangesFor(sb, "rotationY", this.rotationY);
        getHighSpeedVideoFpsRangesFor(sb, "rotationZ", this.rotationZ);
        getHighSpeedVideoFpsRangesFor(sb, "translationX", this.translationX);
        getHighSpeedVideoFpsRangesFor(sb, "translationY", this.translationY);
        getHighSpeedVideoFpsRangesFor(sb, "translationZ", this.translationZ);
        getHighSpeedVideoFpsRangesFor(sb, "scaleX", this.scaleX);
        getHighSpeedVideoFpsRangesFor(sb, "scaleY", this.scaleY);
        getHighSpeedVideoFpsRangesFor(sb, "alpha", this.alpha);
        int i5 = this.visibility;
        sb.append("visibility");
        sb.append(": ");
        sb.append(i5);
        sb.append(",\n");
        getHighSpeedVideoFpsRangesFor(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type : androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = this.widget.getAnchor(type);
                if (anchor != null && anchor.mTarget != null) {
                    sb.append("Anchor");
                    sb.append(type.name());
                    sb.append(": ['");
                    java.lang.String str = anchor.mTarget.getOwner().stringId;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb.append(str);
                    sb.append("', '");
                    sb.append(anchor.mTarget.getType().name());
                    sb.append("', '");
                    sb.append(anchor.mMargin);
                    sb.append("'],\n");
                }
            }
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor(sb, "phone_orientation", phone_orientation);
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor(sb, "phone_orientation", phone_orientation);
        }
        if (this.Camera2StreamConfigurationMap.size() != 0) {
            sb.append("custom : {\n");
            for (java.lang.String str2 : this.Camera2StreamConfigurationMap.keySet()) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = this.Camera2StreamConfigurationMap.get(str2);
                sb.append(str2);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case 901:
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                        sb.append("'");
                        sb.append(androidx.constraintlayout.core.motion.CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, java.lang.String str, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public androidx.constraintlayout.core.motion.utils.TypedBundle getMotionProperties() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
