package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Vj {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6915a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Vj$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Vj.a();
        }
    });

    public static final JSONObject a(String str, int i) {
        JSONObject a2 = Ek.a(str, "targetViewId", "id", str);
        a2.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        return a2;
    }

    public static final Jq b(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Jq e = e(windowInsets);
        Jq c = c(windowInsets);
        Jq d = d(windowInsets);
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return a(e, c, d, new Jq(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final Jq c(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Y5.f6965a.getClass();
        if (Y5.t()) {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            return new Jq(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!Y5.r()) {
            return (Jq) f6915a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new Jq(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final Jq d(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Y5.f6965a.getClass();
        if (!Y5.u()) {
            return (Jq) f6915a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int i4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            i = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner.getRadius());
        } else {
            i = 0;
        }
        if (roundedCorner2 != null) {
            i2 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner2.getRadius());
        } else {
            i2 = 0;
        }
        if (roundedCorner3 != null) {
            i3 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner3.getRadius());
        } else {
            i3 = 0;
        }
        if (roundedCorner4 != null) {
            i4 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner4.getRadius());
        }
        return new Jq(Math.max(i, i2), Math.max(i2, i3), Math.max(i4, i3), Math.max(i, i4));
    }

    public static final Jq e(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Y5.f6965a.getClass();
        if (!Y5.t()) {
            return Y5.s() ? new Jq(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (Jq) f6915a.getValue();
        }
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return new Jq(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        Y5.f6965a.getClass();
        if (Y5.t()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.show(WindowInsetsCompat.Type.systemBars());
            insetsController.show(WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (Y5.w()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(0);
        }
    }

    public static final void b(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        Y5.f6965a.getClass();
        if (Y5.r()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
            WindowCompat.setDecorFitsSystemWindows(window, true);
        }
    }

    public static final Jq a() {
        return new Jq(0, 0, 0, 0);
    }

    public static final Jq a(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (Jq) f6915a.getValue());
    }

    public static final Jq a(Jq area, Jq display, Jq roundedCorner, Jq navigationBar) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(roundedCorner, "roundedCorner");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        return new Jq(ComparisonsKt.maxOf(area.f6658a, display.f6658a, roundedCorner.f6658a, navigationBar.f6658a), ComparisonsKt.maxOf(area.b, display.b, roundedCorner.b, navigationBar.b), ComparisonsKt.maxOf(area.c, display.c, roundedCorner.c, navigationBar.c), ComparisonsKt.maxOf(area.d, display.d, roundedCorner.d, navigationBar.d));
    }

    public static final void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        Y5.f6965a.getClass();
        if (Y5.t()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (Y5.w()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    public static final void a(Window window, int i) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = i;
        window.setAttributes(attributes);
        WindowCompat.setDecorFitsSystemWindows(window, false);
    }
}
