package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u0002\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0014\u0010\u0004\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u0014\u0010\u0005\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u0014\u0010\u0006\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\nH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0005\u0010\u0011\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u000eH\u0086\b¢\u0006\u0004\b\f\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0019H\u0086\f¢\u0006\u0004\b\u0017\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0019H\u0086\f¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\f¢\u0006\u0004\b\u0017\u0010\u001d\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019H\u0086\f¢\u0006\u0004\b\u0017\u0010\u001e\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u001fH\u0086\b¢\u0006\u0004\b\u0013\u0010 \"\u0016\u0010\"\u001a\u00020\n*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u000b\"\u0016\u0010$\u001a\u00020\n*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u000b\"\u0016\u0010&\u001a\u00020\n*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b%\u0010\u000b\"\u0016\u0010(\u001a\u00020\n*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u000b\"\u0016\u0010+\u001a\u00020\u0001*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0016\u0010\"\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u0011\"\u0016\u0010$\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u0011\"\u0016\u0010&\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b%\u0010\u0011\"\u0016\u0010(\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u0011\"\u0016\u0010+\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010\u0011\"\u0016\u0010-\u001a\u00020,*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0016\u0010/\u001a\u00020,*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010.\"\u0016\u0010\u0016\u001a\u00020\u0019*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u00101"}, d2 = {"Landroid/graphics/Color;", "", "component1", "(Landroid/graphics/Color;)F", "component2", "component3", "component4", "c", "plus", "(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;", "", "(I)I", "toColor", "(I)Landroid/graphics/Color;", "", "toColorLong", "(I)J", "(J)F", "(J)Landroid/graphics/Color;", "toColorInt", "(J)I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "convertTo", "(ILandroid/graphics/ColorSpace$Named;)J", "Landroid/graphics/ColorSpace;", "(ILandroid/graphics/ColorSpace;)J", "(JLandroid/graphics/ColorSpace$Named;)J", "(JLandroid/graphics/ColorSpace;)J", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color;", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color;", "", "(Ljava/lang/String;)I", "getAlpha", "alpha", "getRed", "red", "getGreen", "green", "getBlue", "blue", "getLuminance", "(I)F", "luminance", "", "isSrgb", "(J)Z", "isWideGamut", "getColorSpace", "(J)Landroid/graphics/ColorSpace;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ColorKt {
    public static final int component1(int i) {
        return (i >> 24) & 255;
    }

    public static final int component2(int i) {
        return (i >> 16) & 255;
    }

    public static final int component3(int i) {
        return (i >> 8) & 255;
    }

    public static final int component4(int i) {
        return i & 255;
    }

    public static final int getAlpha(int i) {
        return (i >> 24) & 255;
    }

    public static final int getBlue(int i) {
        return i & 255;
    }

    public static final int getGreen(int i) {
        return (i >> 8) & 255;
    }

    public static final int getRed(int i) {
        return (i >> 16) & 255;
    }

    public static final float component1(android.graphics.Color color) {
        return color.getComponent(0);
    }

    public static final float component2(android.graphics.Color color) {
        return color.getComponent(1);
    }

    public static final float component3(android.graphics.Color color) {
        return color.getComponent(2);
    }

    public static final float component4(android.graphics.Color color) {
        return color.getComponent(3);
    }

    public static final android.graphics.Color plus(android.graphics.Color color, android.graphics.Color color2) {
        return androidx.core.graphics.ColorUtils.compositeColors(color2, color);
    }

    public static final float getLuminance(int i) {
        return android.graphics.Color.luminance(i);
    }

    public static final android.graphics.Color toColor(int i) {
        return android.graphics.Color.valueOf(i);
    }

    public static final long toColorLong(int i) {
        return android.graphics.Color.pack(i);
    }

    public static final float component1(long j) {
        return android.graphics.Color.red(j);
    }

    public static final float component2(long j) {
        return android.graphics.Color.green(j);
    }

    public static final float component3(long j) {
        return android.graphics.Color.blue(j);
    }

    public static final float component4(long j) {
        return android.graphics.Color.alpha(j);
    }

    public static final float getAlpha(long j) {
        return android.graphics.Color.alpha(j);
    }

    public static final float getRed(long j) {
        return android.graphics.Color.red(j);
    }

    public static final float getGreen(long j) {
        return android.graphics.Color.green(j);
    }

    public static final float getBlue(long j) {
        return android.graphics.Color.blue(j);
    }

    public static final float getLuminance(long j) {
        return android.graphics.Color.luminance(j);
    }

    public static final android.graphics.Color toColor(long j) {
        return android.graphics.Color.valueOf(j);
    }

    public static final int toColorInt(long j) {
        return android.graphics.Color.toArgb(j);
    }

    public static final boolean isSrgb(long j) {
        return android.graphics.Color.isSrgb(j);
    }

    public static final boolean isWideGamut(long j) {
        return android.graphics.Color.isWideGamut(j);
    }

    public static final android.graphics.ColorSpace getColorSpace(long j) {
        return android.graphics.Color.colorSpace(j);
    }

    public static final long convertTo(int i, android.graphics.ColorSpace.Named named) {
        return android.graphics.Color.convert(i, android.graphics.ColorSpace.get(named));
    }

    public static final long convertTo(int i, android.graphics.ColorSpace colorSpace) {
        return android.graphics.Color.convert(i, colorSpace);
    }

    public static final long convertTo(long j, android.graphics.ColorSpace.Named named) {
        return android.graphics.Color.convert(j, android.graphics.ColorSpace.get(named));
    }

    public static final long convertTo(long j, android.graphics.ColorSpace colorSpace) {
        return android.graphics.Color.convert(j, colorSpace);
    }

    public static final android.graphics.Color convertTo(android.graphics.Color color, android.graphics.ColorSpace.Named named) {
        return color.convert(android.graphics.ColorSpace.get(named));
    }

    public static final android.graphics.Color convertTo(android.graphics.Color color, android.graphics.ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }

    public static final int toColorInt(java.lang.String str) {
        return android.graphics.Color.parseColor(str);
    }
}
