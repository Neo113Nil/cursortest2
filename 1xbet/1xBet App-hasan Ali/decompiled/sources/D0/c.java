package D0;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public abstract class c {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void f(MenuItem menuItem, char c5, int i) {
        menuItem.setAlphabeticShortcut(c5, i);
    }

    public static void g(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void h(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void i(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void j(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void k(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void l(MenuItem menuItem, char c5, int i) {
        menuItem.setNumericShortcut(c5, i);
    }

    public static void m(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void n(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void o(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void q(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
