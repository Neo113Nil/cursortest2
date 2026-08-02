package androidx.core.graphics.drawable;

/* loaded from: classes3.dex */
public final class DrawableCompat {
    public static android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable drawable) {
        return drawable;
    }

    @androidx.annotation.ReplaceWith(expression = "drawable.jumpToCurrentState()")
    @java.lang.Deprecated
    public static void jumpToCurrentState(android.graphics.drawable.Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @androidx.annotation.ReplaceWith(expression = "drawable.setAutoMirrored(mirrored)")
    @java.lang.Deprecated
    public static void setAutoMirrored(android.graphics.drawable.Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    @androidx.annotation.ReplaceWith(expression = "drawable.isAutoMirrored()")
    @java.lang.Deprecated
    public static boolean isAutoMirrored(android.graphics.drawable.Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void setHotspot(android.graphics.drawable.Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void setHotspotBounds(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void setTint(android.graphics.drawable.Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void setTintList(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void setTintMode(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    @androidx.annotation.ReplaceWith(expression = "drawable.getAlpha()")
    @java.lang.Deprecated
    public static int getAlpha(android.graphics.drawable.Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void applyTheme(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean canApplyTheme(android.graphics.drawable.Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void clearColorFilter(android.graphics.drawable.Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends android.graphics.drawable.Drawable> T unwrap(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof androidx.core.graphics.drawable.WrappedDrawable ? (T) ((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static boolean setLayoutDirection(android.graphics.drawable.Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static int getLayoutDirection(android.graphics.drawable.Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    private DrawableCompat() {
    }
}
