package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f4967a;
    public final DisplayMetrics b;
    public final Function0 c;
    public final DisplayMetrics d;
    public final float e;
    public final int f;

    public q6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(realDisplayMetrics, "realDisplayMetrics");
        this.f4967a = windowManager;
        this.b = displayMetrics;
        this.c = androidVersion;
        this.d = realDisplayMetrics;
        this.e = displayMetrics.density;
        this.f = displayMetrics.densityDpi;
    }

    public static final int a() {
        return Build.VERSION.SDK_INT;
    }

    public final r6 b() {
        try {
            if (((Number) this.c.invoke()).intValue() >= 30) {
                return a(this.f4967a);
            }
            DisplayMetrics displayMetrics = this.b;
            return new r6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            mb.b("Cannot create device size", e);
            return new r6(0, 0);
        }
    }

    public final float c() {
        return this.e;
    }

    public final int d() {
        return this.f;
    }

    public final r6 e() {
        try {
            if (((Number) this.c.invoke()).intValue() >= 30) {
                Rect bounds = this.f4967a.getCurrentWindowMetrics().getBounds();
                return new r6(bounds.width(), bounds.height());
            }
            this.d.setTo(this.b);
            Display defaultDisplay = this.f4967a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.d);
            }
            DisplayMetrics displayMetrics = this.d;
            return new r6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            mb.b("Cannot create size", e);
            return new r6(0, 0);
        }
    }

    public final r6 a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new r6(bounds.width() - i, bounds.height() - i2);
    }

    public /* synthetic */ q6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 function0, DisplayMetrics displayMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i & 4) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.q6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(q6.a());
            }
        } : function0, (i & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }
}
