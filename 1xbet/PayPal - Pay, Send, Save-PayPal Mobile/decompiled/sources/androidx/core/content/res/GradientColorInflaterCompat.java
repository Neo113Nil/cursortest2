package androidx.core.content.res;

/* loaded from: classes3.dex */
final class GradientColorInflaterCompat {
    private GradientColorInflaterCompat() {
    }

    static android.graphics.Shader getHighSpeedVideoFpsRanges(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        java.lang.String name2 = xmlPullParser.getName();
        if (!name2.equals("gradient")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name2);
            throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
        }
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.core.R.styleable.GradientColor);
        float namedFloat = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "startX", androidx.core.R.styleable.GradientColor_android_startX, 0.0f);
        float namedFloat2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "startY", androidx.core.R.styleable.GradientColor_android_startY, 0.0f);
        float namedFloat3 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "endX", androidx.core.R.styleable.GradientColor_android_endX, 0.0f);
        float namedFloat4 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "endY", androidx.core.R.styleable.GradientColor_android_endY, 0.0f);
        float namedFloat5 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "centerX", androidx.core.R.styleable.GradientColor_android_centerX, 0.0f);
        float namedFloat6 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "centerY", androidx.core.R.styleable.GradientColor_android_centerY, 0.0f);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "type", androidx.core.R.styleable.GradientColor_android_type, 0);
        int namedColor = androidx.core.content.res.TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "startColor", androidx.core.R.styleable.GradientColor_android_startColor, 0);
        boolean hasAttribute = androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "centerColor");
        int namedColor2 = androidx.core.content.res.TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "centerColor", androidx.core.R.styleable.GradientColor_android_centerColor, 0);
        int namedColor3 = androidx.core.content.res.TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "endColor", androidx.core.R.styleable.GradientColor_android_endColor, 0);
        int namedInt2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "tileMode", androidx.core.R.styleable.GradientColor_android_tileMode, 0);
        float namedFloat7 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "gradientRadius", androidx.core.R.styleable.GradientColor_android_gradientRadius, 0.0f);
        obtainAttributes.recycle();
        androidx.core.content.res.GradientColorInflaterCompat.ColorStops highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(resources, xmlPullParser, attributeSet, theme), namedColor, namedColor3, hasAttribute, namedColor2);
        if (namedInt != 1) {
            if (namedInt == 2) {
                return new android.graphics.SweepGradient(namedFloat5, namedFloat6, highSpeedVideoSizes.getHighSpeedVideoFpsRanges, highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor);
            }
            return new android.graphics.LinearGradient(namedFloat, namedFloat2, namedFloat3, namedFloat4, highSpeedVideoSizes.getHighSpeedVideoFpsRanges, highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(namedInt2));
        }
        if (namedFloat7 <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        return new android.graphics.RadialGradient(namedFloat5, namedFloat6, namedFloat7, highSpeedVideoSizes.getHighSpeedVideoFpsRanges, highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(namedInt2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r8 = new java.lang.StringBuilder();
        r8.append(r9.getPositionDescription());
        r8.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r8.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops getHighSpeedVideoSizes(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.core.R.styleable.GradientColorItem);
                boolean hasValue = obtainAttributes.hasValue(androidx.core.R.styleable.GradientColorItem_android_color);
                boolean hasValue2 = obtainAttributes.hasValue(androidx.core.R.styleable.GradientColorItem_android_offset);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = obtainAttributes.getColor(androidx.core.R.styleable.GradientColorItem_android_color, 0);
                float f = obtainAttributes.getFloat(androidx.core.R.styleable.GradientColorItem_android_offset, 0.0f);
                obtainAttributes.recycle();
                arrayList2.add(java.lang.Integer.valueOf(color));
                arrayList.add(java.lang.Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(arrayList2, arrayList);
        }
        return null;
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops getHighSpeedVideoSizes(androidx.core.content.res.GradientColorInflaterCompat.ColorStops colorStops, int i, int i2, boolean z, int i3) {
        if (colorStops != null) {
            return colorStops;
        }
        if (z) {
            return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(i, i3, i2);
        }
        return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(i, i2);
    }

    private static android.graphics.Shader.TileMode getHighSpeedVideoSizes(int i) {
        if (i == 1) {
            return android.graphics.Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return android.graphics.Shader.TileMode.MIRROR;
        }
        return android.graphics.Shader.TileMode.CLAMP;
    }

    static final class ColorStops {
        final int[] getHighSpeedVideoFpsRanges;
        final float[] getHighSpeedVideoFpsRangesFor;

        ColorStops(java.util.List<java.lang.Integer> list, java.util.List<java.lang.Float> list2) {
            int size = list.size();
            this.getHighSpeedVideoFpsRanges = new int[size];
            this.getHighSpeedVideoFpsRangesFor = new float[size];
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoFpsRanges[i] = list.get(i).intValue();
                this.getHighSpeedVideoFpsRangesFor[i] = list2.get(i).floatValue();
            }
        }

        ColorStops(int i, int i2) {
            this.getHighSpeedVideoFpsRanges = new int[]{i, i2};
            this.getHighSpeedVideoFpsRangesFor = new float[]{0.0f, 1.0f};
        }

        ColorStops(int i, int i2, int i3) {
            this.getHighSpeedVideoFpsRanges = new int[]{i, i2, i3};
            this.getHighSpeedVideoFpsRangesFor = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
