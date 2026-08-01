package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xf {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5082a;

    public xf(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5082a = new WeakReference(activity);
    }

    public final DisplayMetrics a() {
        Activity activity = (Activity) this.f5082a.get();
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    public final wf b() {
        DisplayMetrics a2 = a();
        int i = a2.widthPixels;
        int i2 = a2.heightPixels;
        float f = a2.density;
        WindowInsetsCompat c = c();
        if (c == null) {
            return new wf(i, i2, f, null, null, 24, null);
        }
        Insets insets = c.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        DisplayCutoutCompat displayCutout = c.getDisplayCutout();
        Insets of = displayCutout != null ? Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : Insets.NONE;
        Intrinsics.checkNotNull(of);
        Insets of2 = Insets.of(Math.max(insets.left, of.left), Math.max(insets.top, of.top), Math.max(insets.right, of.right), Math.max(insets.bottom, of.bottom));
        Intrinsics.checkNotNullExpressionValue(of2, "of(...)");
        int i3 = (i - of2.left) - of2.right;
        int i4 = (i2 - of2.top) - of2.bottom;
        mb.c("VAST rendering container computed: width=" + i3 + ", height=" + i4 + ", density=" + f, null, 2, null);
        return new wf(i3, i4, f, null, of2, 8, null);
    }

    public final WindowInsetsCompat c() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.f5082a.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
        mb.a("Window insets retrieved: " + rootWindowInsets, (Throwable) null, 2, (Object) null);
        return rootWindowInsets;
    }
}
