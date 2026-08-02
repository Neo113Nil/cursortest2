package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0769a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f7, float f11) {
            drawable.setHotspot(f7, f11);
        }

        static void f(Drawable drawable, int i11, int i12, int i13, int i14) {
            drawable.setHotspotBounds(i11, i12, i13, i14);
        }

        static void g(Drawable drawable, int i11) {
            drawable.setTint(i11);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i11) {
            return drawable.setLayoutDirection(i11);
        }
    }

    public static void a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        C0769a.a(drawable, theme);
    }

    public static boolean b(@NonNull Drawable drawable) {
        return C0769a.b(drawable);
    }

    public static ColorFilter c(@NonNull Drawable drawable) {
        return C0769a.c(drawable);
    }

    public static int d(@NonNull Drawable drawable) {
        return b.a(drawable);
    }

    public static void e(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0769a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static void f(@NonNull Drawable drawable, float f7, float f11) {
        C0769a.e(drawable, f7, f11);
    }

    public static void g(@NonNull Drawable drawable, int i11, int i12, int i13, int i14) {
        C0769a.f(drawable, i11, i12, i13, i14);
    }

    public static boolean h(@NonNull Drawable drawable, int i11) {
        return b.b(drawable, i11);
    }

    public static void i(@NonNull Drawable drawable, int i11) {
        C0769a.g(drawable, i11);
    }

    public static void j(@NonNull Drawable drawable, ColorStateList colorStateList) {
        C0769a.h(drawable, colorStateList);
    }

    public static void k(@NonNull Drawable drawable, PorterDuff.Mode mode) {
        C0769a.i(drawable, mode);
    }
}
