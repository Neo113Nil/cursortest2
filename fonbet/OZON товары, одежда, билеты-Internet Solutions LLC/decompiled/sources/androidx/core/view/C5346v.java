package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import s2.InterfaceMenuItemC9585b;

/* renamed from: androidx.core.view.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5346v {

    /* renamed from: androidx.core.view.v$a */
    static class a {
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c11, int i11) {
            return menuItem.setAlphabeticShortcut(c11, i11);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c11, int i11) {
            return menuItem.setNumericShortcut(c11, i11);
        }

        static MenuItem l(MenuItem menuItem, char c11, char c12, int i11, int i12) {
            return menuItem.setShortcut(c11, c12, i11, i12);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static void a(@NonNull MenuItem menuItem, char c11, int i11) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setAlphabeticShortcut(c11, i11);
        } else {
            a.g(menuItem, c11, i11);
        }
    }

    public static void b(@NonNull MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setContentDescription(charSequence);
        } else {
            a.h(menuItem, charSequence);
        }
    }

    public static void c(@NonNull MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setIconTintList(colorStateList);
        } else {
            a.i(menuItem, colorStateList);
        }
    }

    public static void d(@NonNull MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setIconTintMode(mode);
        } else {
            a.j(menuItem, mode);
        }
    }

    public static void e(@NonNull MenuItem menuItem, char c11, int i11) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setNumericShortcut(c11, i11);
        } else {
            a.k(menuItem, c11, i11);
        }
    }

    public static void f(@NonNull MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC9585b) {
            ((InterfaceMenuItemC9585b) menuItem).setTooltipText(charSequence);
        } else {
            a.m(menuItem, charSequence);
        }
    }
}
