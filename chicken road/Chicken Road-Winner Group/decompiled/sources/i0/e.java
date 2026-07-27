package i0;

import D.H;
import D.J;
import D.K;
import D.V;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.C0262b;
import g0.C0303b;
import g0.C0304c;
import g0.C0311j;
import g0.C0312k;
import g0.C0314m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class e {
    public static C0304c a(C0312k c0312k, FoldingFeature foldingFeature) {
        C0303b c0303b;
        C0303b c0303b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0303b = C0303b.f4952g;
        } else {
            if (type != 2) {
                return null;
            }
            c0303b = C0303b.f4953h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0303b2 = C0303b.f4951e;
        } else {
            if (state != 2) {
                return null;
            }
            c0303b2 = C0303b.f;
        }
        Rect bounds = foldingFeature.getBounds();
        j.d(bounds, "oemFeature.bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (i3 > i5) {
            throw new IllegalArgumentException(B0.c.g(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(B0.c.g(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect a3 = c0312k.f4971a.a();
        int i7 = i6 - i4;
        if (i7 == 0 && i5 - i3 == 0) {
            return null;
        }
        int i8 = i5 - i3;
        if (i8 != a3.width() && i7 != a3.height()) {
            return null;
        }
        if (i8 < a3.width() && i7 < a3.height()) {
            return null;
        }
        if (i8 == a3.width() && i7 == a3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        j.d(bounds2, "oemFeature.bounds");
        return new C0304c(new C0262b(bounds2), c0303b, c0303b2);
    }

    public static C0311j b(Context context, WindowLayoutInfo info) {
        C0312k c0312k;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        j.e(info, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            if (i3 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i4 = C0314m.f4974b;
            return c(C0314m.a((Activity) context), info);
        }
        int i5 = C0314m.f4974b;
        if (i3 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z3 = context2 instanceof Activity;
                if (!z3 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        j.d(context2, "iterator.baseContext");
                    }
                }
                if (z3) {
                    c0312k = C0314m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    j.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i6 = Build.VERSION.SDK_INT;
                    V b3 = (i6 >= 30 ? new K() : i6 >= 29 ? new J() : new H()).b();
                    j.d(b3, "Builder().build()");
                    c0312k = new C0312k(new C0262b(rect), b3);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        V a3 = V.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        j.d(bounds, "wm.currentWindowMetrics.bounds");
        c0312k = new C0312k(new C0262b(bounds), a3);
        return c(c0312k, info);
    }

    public static C0311j c(C0312k c0312k, WindowLayoutInfo info) {
        C0304c c0304c;
        j.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        j.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                j.d(feature, "feature");
                c0304c = a(c0312k, feature);
            } else {
                c0304c = null;
            }
            if (c0304c != null) {
                arrayList.add(c0304c);
            }
        }
        return new C0311j(arrayList);
    }
}
