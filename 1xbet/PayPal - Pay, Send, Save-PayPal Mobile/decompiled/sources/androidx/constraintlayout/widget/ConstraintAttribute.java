package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintAttribute {
    private int Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getOutputFormats;
    private androidx.constraintlayout.widget.ConstraintAttribute.AttributeType getOutputMinFrameDuration;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isMethod() {
        return this.getOutputFormats;
    }

    public int getIntegerValue() {
        return this.getHighSpeedVideoSizes;
    }

    public float getFloatValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getStringValue() {
        return this.getHighSpeedVideoSizesFor;
    }

    public boolean isBooleanValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getColorValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.constraintlayout.widget.ConstraintAttribute.AttributeType getType() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isContinuous() {
        int ordinal = this.getOutputMinFrameDuration.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public void setFloatValue(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public void setColorValue(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public void setIntValue(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setStringValue(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.getOutputMinFrameDuration.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.getOutputMinFrameDuration) {
            case INT_TYPE:
                return this.getHighSpeedVideoSizes;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.getHighResolutionOutputSizeshNQ4ISI;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.getHighSpeedVideoFpsRanges ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.getOutputMinFrameDuration) {
            case INT_TYPE:
                fArr[0] = this.getHighSpeedVideoSizes;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.getHighResolutionOutputSizeshNQ4ISI;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.Camera2StreamConfigurationMap;
                float pow = (float) java.lang.Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) java.lang.Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) java.lang.Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.getHighSpeedVideoFpsRanges ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.getHighResolutionOutputSizeshNQ4ISI;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (this.getOutputMinFrameDuration) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.getHighSpeedVideoSizes = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.getHighResolutionOutputSizeshNQ4ISI = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int HSVToColor = android.graphics.Color.HSVToColor(fArr);
                int i = (int) (fArr[3] * 255.0f);
                int i2 = (i & (~(i >> 31))) - 255;
                this.Camera2StreamConfigurationMap = (((i2 & (i2 >> 31)) + 255) << 24) | (HSVToColor & 16777215);
                return;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.getHighSpeedVideoFpsRanges = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.getHighResolutionOutputSizeshNQ4ISI = fArr[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute) {
        androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType;
        if (constraintAttribute != null && (attributeType = this.getOutputMinFrameDuration) == constraintAttribute.getOutputMinFrameDuration) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.getHighSpeedVideoSizes == constraintAttribute.getHighSpeedVideoSizes) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.getHighResolutionOutputSizeshNQ4ISI == constraintAttribute.getHighResolutionOutputSizeshNQ4ISI;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.Camera2StreamConfigurationMap == constraintAttribute.Camera2StreamConfigurationMap;
                case STRING_TYPE:
                    return this.getHighSpeedVideoSizes == constraintAttribute.getHighSpeedVideoSizes;
                case BOOLEAN_TYPE:
                    return this.getHighSpeedVideoFpsRanges == constraintAttribute.getHighSpeedVideoFpsRanges;
                case DIMENSION_TYPE:
                    return this.getHighResolutionOutputSizeshNQ4ISI == constraintAttribute.getHighResolutionOutputSizeshNQ4ISI;
                default:
                    return false;
            }
        }
        return false;
    }

    public ConstraintAttribute(java.lang.String str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType) {
        this.getOutputFormats = false;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputMinFrameDuration = attributeType;
    }

    public ConstraintAttribute(java.lang.String str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType, java.lang.Object obj, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputMinFrameDuration = attributeType;
        this.getOutputFormats = z;
        setValue(obj);
    }

    public ConstraintAttribute(androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute, java.lang.Object obj) {
        this.getOutputFormats = false;
        this.getHighSpeedVideoFpsRangesFor = constraintAttribute.getHighSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = constraintAttribute.getOutputMinFrameDuration;
        setValue(obj);
    }

    public void setValue(java.lang.Object obj) {
        switch (this.getOutputMinFrameDuration) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.getHighSpeedVideoSizes = ((java.lang.Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.Camera2StreamConfigurationMap = ((java.lang.Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.getHighSpeedVideoSizesFor = (java.lang.String) obj;
                break;
            case BOOLEAN_TYPE:
                this.getHighSpeedVideoFpsRanges = ((java.lang.Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Float) obj).floatValue();
                break;
        }
    }

    public static java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> extractAttributes(java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> hashMap, android.view.View view) {
        java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> hashMap2 = new java.util.HashMap<>();
        java.lang.Class<?> cls = view.getClass();
        for (java.lang.String str : hashMap.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(constraintAttribute, java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor())));
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    hashMap2.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(constraintAttribute, cls.getMethod(sb.toString(), new java.lang.Class[0]).invoke(view, new java.lang.Object[0])));
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        return hashMap2;
    }

    public static void setAttributes(android.view.View view, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> hashMap) {
        java.lang.Class<?> cls = view.getClass();
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = hashMap.get(next);
            if (!constraintAttribute.getOutputFormats) {
                next = "set".concat(java.lang.String.valueOf(next));
            }
            try {
                switch (constraintAttribute.getOutputMinFrameDuration) {
                    case INT_TYPE:
                        cls.getMethod(next, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.getHighSpeedVideoSizes));
                        continue;
                    case FLOAT_TYPE:
                        cls.getMethod(next, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(constraintAttribute.getHighResolutionOutputSizeshNQ4ISI));
                        continue;
                    case COLOR_TYPE:
                        cls.getMethod(next, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.Camera2StreamConfigurationMap));
                        continue;
                    case COLOR_DRAWABLE_TYPE:
                        java.lang.reflect.Method method = cls.getMethod(next, android.graphics.drawable.Drawable.class);
                        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.Camera2StreamConfigurationMap);
                        method.invoke(view, colorDrawable);
                        continue;
                    case STRING_TYPE:
                        cls.getMethod(next, java.lang.CharSequence.class).invoke(view, constraintAttribute.getHighSpeedVideoSizesFor);
                        continue;
                    case BOOLEAN_TYPE:
                        cls.getMethod(next, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(constraintAttribute.getHighSpeedVideoFpsRanges));
                        continue;
                    case DIMENSION_TYPE:
                        cls.getMethod(next, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(constraintAttribute.getHighResolutionOutputSizeshNQ4ISI));
                        continue;
                    case REFERENCE_TYPE:
                        cls.getMethod(next, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(constraintAttribute.getHighSpeedVideoSizes));
                        continue;
                    default:
                        continue;
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public void applyCustom(android.view.View view) {
        java.lang.Class<?> cls = view.getClass();
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (!this.getOutputFormats) {
            str = "set".concat(java.lang.String.valueOf(str));
        }
        try {
            switch (this.getOutputMinFrameDuration) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
                    break;
                case FLOAT_TYPE:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
                    break;
                case COLOR_TYPE:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
                    break;
                case COLOR_DRAWABLE_TYPE:
                    java.lang.reflect.Method method = cls.getMethod(str, android.graphics.drawable.Drawable.class);
                    android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                    colorDrawable.setColor(this.Camera2StreamConfigurationMap);
                    method.invoke(view, colorDrawable);
                    break;
                case STRING_TYPE:
                    cls.getMethod(str, java.lang.CharSequence.class).invoke(view, this.getHighSpeedVideoSizesFor);
                    break;
                case BOOLEAN_TYPE:
                    cls.getMethod(str, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
                    break;
                case DIMENSION_TYPE:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
                    break;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    public static void parse(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> hashMap) {
        androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType;
        java.lang.Object valueOf;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        java.lang.String str = null;
        java.lang.Object obj = null;
        androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.Character.toUpperCase(str.charAt(0)));
                    sb.append(str.substring(1));
                    str = sb.toString();
                }
            } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customBoolean) {
                obj = java.lang.Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE;
                    valueOf = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customDimension) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE;
                    valueOf = java.lang.Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE;
                    valueOf = java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE;
                    valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customStringValue) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.CustomAttribute_customReference) {
                    attributeType = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = java.lang.Integer.valueOf(resourceId);
                }
                java.lang.Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new androidx.constraintlayout.widget.ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }
}
