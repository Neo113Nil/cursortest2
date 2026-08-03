package s;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0989a {
    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(android.graphics.drawable.Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static android.graphics.ColorFilter c(android.graphics.drawable.Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void d(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void e(android.graphics.drawable.Drawable drawable, float f2, float f3) {
        drawable.setHotspot(f2, f3);
    }

    public static void f(android.graphics.drawable.Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setHotspotBounds(i2, i3, i4, i5);
    }

    public static void g(android.graphics.drawable.Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void h(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void i(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
