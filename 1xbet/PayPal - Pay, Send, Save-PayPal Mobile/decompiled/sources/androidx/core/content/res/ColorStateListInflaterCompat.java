package androidx.core.content.res;

/* loaded from: classes3.dex */
public final class ColorStateListInflaterCompat {
    private static final java.lang.ThreadLocal<android.util.TypedValue> getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    public static android.content.res.ColorStateList inflate(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i), theme);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
    }

    public static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name2 = xmlPullParser.getName();
        if (!name2.equals("selector")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid color state list tag ");
            sb.append(name2);
            throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
        }
        return Camera2StreamConfigurationMap(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.content.res.ColorStateList Camera2StreamConfigurationMap(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(resources, theme, attributeSet, androidx.core.R.styleable.ColorStateListItem);
                int resourceId = Camera2StreamConfigurationMap.getResourceId(androidx.core.R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !getHighSpeedVideoFpsRanges(resources, resourceId)) {
                    try {
                        color = createFromXml(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (java.lang.Exception unused) {
                    }
                    float f2 = 1.0f;
                    if (!Camera2StreamConfigurationMap.hasValue(androidx.core.R.styleable.ColorStateListItem_android_alpha)) {
                        f2 = Camera2StreamConfigurationMap.getFloat(androidx.core.R.styleable.ColorStateListItem_android_alpha, 1.0f);
                    } else if (Camera2StreamConfigurationMap.hasValue(androidx.core.R.styleable.ColorStateListItem_alpha)) {
                        f2 = Camera2StreamConfigurationMap.getFloat(androidx.core.R.styleable.ColorStateListItem_alpha, 1.0f);
                    }
                    if (android.os.Build.VERSION.SDK_INT < 31 && Camera2StreamConfigurationMap.hasValue(androidx.core.R.styleable.ColorStateListItem_android_lStar)) {
                        f = Camera2StreamConfigurationMap.getFloat(androidx.core.R.styleable.ColorStateListItem_android_lStar, -1.0f);
                    } else {
                        f = Camera2StreamConfigurationMap.getFloat(androidx.core.R.styleable.ColorStateListItem_lStar, -1.0f);
                    }
                    Camera2StreamConfigurationMap.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != androidx.core.R.attr.alpha && attributeNameResource != androidx.core.R.attr.lStar) {
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i4] = attributeNameResource;
                            i4++;
                        }
                    }
                    int[] trimStateSet = android.util.StateSet.trimStateSet(iArr3, i4);
                    iArr2 = androidx.core.content.res.GrowingArrayUtils.getHighResolutionOutputSizeshNQ4ISI(iArr2, i3, getHighResolutionOutputSizeshNQ4ISI(color, f2, f));
                    int[][] iArr4 = (int[][]) androidx.core.content.res.GrowingArrayUtils.getHighSpeedVideoSizes(iArr, i3, trimStateSet);
                    i3++;
                    iArr = iArr4;
                }
                color = Camera2StreamConfigurationMap.getColor(androidx.core.R.styleable.ColorStateListItem_android_color, -65281);
                float f22 = 1.0f;
                if (!Camera2StreamConfigurationMap.hasValue(androidx.core.R.styleable.ColorStateListItem_android_alpha)) {
                }
                if (android.os.Build.VERSION.SDK_INT < 31) {
                }
                f = Camera2StreamConfigurationMap.getFloat(androidx.core.R.styleable.ColorStateListItem_lStar, -1.0f);
                Camera2StreamConfigurationMap.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = android.util.StateSet.trimStateSet(iArr32, i42);
                iArr2 = androidx.core.content.res.GrowingArrayUtils.getHighResolutionOutputSizeshNQ4ISI(iArr2, i3, getHighResolutionOutputSizeshNQ4ISI(color, f22, f));
                int[][] iArr42 = (int[][]) androidx.core.content.res.GrowingArrayUtils.getHighSpeedVideoSizes(iArr, i3, trimStateSet2);
                i3++;
                iArr = iArr42;
            }
            i2 = 1;
        }
        int[] iArr5 = new int[i3];
        int[][] iArr6 = new int[i3][];
        java.lang.System.arraycopy(iArr2, 0, iArr5, 0, i3);
        java.lang.System.arraycopy(iArr, 0, iArr6, 0, i3);
        return new android.content.res.ColorStateList(iArr6, iArr5);
    }

    private static boolean getHighSpeedVideoFpsRanges(android.content.res.Resources resources, int i) {
        android.util.TypedValue highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        resources.getValue(i, highSpeedVideoFpsRanges, true);
        return highSpeedVideoFpsRanges.type >= 28 && highSpeedVideoFpsRanges.type <= 31;
    }

    private static android.util.TypedValue getHighSpeedVideoFpsRanges() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = getHighSpeedVideoSizes;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static android.content.res.TypedArray Camera2StreamConfigurationMap(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int clamp = androidx.core.math.MathUtils.clamp((int) ((android.graphics.Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            androidx.core.content.res.CamColor highSpeedVideoFpsRanges = androidx.core.content.res.CamColor.getHighSpeedVideoFpsRanges(i);
            i = androidx.core.content.res.CamColor.toColor(highSpeedVideoFpsRanges.getHighSpeedVideoSizes, highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor, f2);
        }
        return (i & 16777215) | (clamp << 24);
    }
}
