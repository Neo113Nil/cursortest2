package androidx.core.content.res;

/* loaded from: classes3.dex */
public final class ComplexColorCompat {
    private final android.content.res.ColorStateList Camera2StreamConfigurationMap;
    private final android.graphics.Shader getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    private ComplexColorCompat(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i) {
        this.getHighSpeedVideoFpsRangesFor = shader;
        this.Camera2StreamConfigurationMap = colorStateList;
        this.getHighSpeedVideoSizes = i;
    }

    static androidx.core.content.res.ComplexColorCompat getHighSpeedVideoFpsRanges(android.graphics.Shader shader) {
        return new androidx.core.content.res.ComplexColorCompat(shader, null, 0);
    }

    static androidx.core.content.res.ComplexColorCompat getHighSpeedVideoFpsRanges(android.content.res.ColorStateList colorStateList) {
        return new androidx.core.content.res.ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    static androidx.core.content.res.ComplexColorCompat getHighSpeedVideoFpsRangesFor(int i) {
        return new androidx.core.content.res.ComplexColorCompat(null, null, i);
    }

    public final android.graphics.Shader getShader() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getColor() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setColor(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public final boolean isGradient() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        return this.getHighSpeedVideoFpsRangesFor == null && (colorStateList = this.Camera2StreamConfigurationMap) != null && colorStateList.isStateful();
    }

    public final boolean onStateChanged(int[] iArr) {
        if (!isStateful()) {
            return false;
        }
        android.content.res.ColorStateList colorStateList = this.Camera2StreamConfigurationMap;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.getHighSpeedVideoSizes) {
            return false;
        }
        this.getHighSpeedVideoSizes = colorForState;
        return true;
    }

    public final boolean willDraw() {
        return isGradient() || this.getHighSpeedVideoSizes != 0;
    }

    public static androidx.core.content.res.ComplexColorCompat inflate(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        try {
            return getHighSpeedVideoFpsRanges(resources, i, theme);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static androidx.core.content.res.ComplexColorCompat getHighSpeedVideoFpsRanges(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        int next;
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        java.lang.String name2 = xml.getName();
        name2.hashCode();
        if (name2.equals("gradient")) {
            return getHighSpeedVideoFpsRanges(androidx.core.content.res.GradientColorInflaterCompat.getHighSpeedVideoFpsRanges(resources, xml, asAttributeSet, theme));
        }
        if (name2.equals("selector")) {
            return getHighSpeedVideoFpsRanges(androidx.core.content.res.ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(xml.getPositionDescription());
        sb.append(": unsupported complex color tag ");
        sb.append(name2);
        throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
    }
}
