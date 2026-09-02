package y;

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
import g0.h;
import java.util.ArrayList;
import java.util.List;
import m.g;
import m.r;
import w.C0093b;
import w.C0094c;
import w.k;
import w.l;
import w.n;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0104e {
    public static C0094c a(l lVar, FoldingFeature foldingFeature) {
        C0093b c0093b;
        C0093b c0093b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0093b = C0093b.f1282h;
        } else {
            if (type != 2) {
                return null;
            }
            c0093b = C0093b.f1283i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0093b2 = C0093b.f1280f;
        } else {
            if (state != 2) {
                return null;
            }
            c0093b2 = C0093b.f1281g;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 > i5) {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
        }
        Rect a2 = lVar.f1306a.a();
        int i6 = i5 - i3;
        if (i6 == 0 && i4 - i2 == 0) {
            return null;
        }
        int i7 = i4 - i2;
        if (i7 != a2.width() && i6 != a2.height()) {
            return null;
        }
        if (i7 < a2.width() && i6 < a2.height()) {
            return null;
        }
        if (i7 == a2.width() && i6 == a2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new C0094c(new t.b(bounds2), c0093b, c0093b2);
    }

    public static k b(Context context, WindowLayoutInfo windowLayoutInfo) {
        l lVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        h.e(windowLayoutInfo, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = n.f1309b;
            return c(n.a((Activity) context), windowLayoutInfo);
        }
        int i4 = n.f1309b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z2 = context2 instanceof Activity;
                if (!z2 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        h.d(context2, "iterator.baseContext");
                    }
                }
                if (z2) {
                    lVar = n.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i5 = Build.VERSION.SDK_INT;
                    r b2 = (i5 >= 30 ? new m.h() : i5 >= 29 ? new g() : new m.f()).b();
                    h.d(b2, "Builder().build()");
                    lVar = new l(new t.b(rect), b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        r a2 = r.a(null, windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(new t.b(bounds), a2);
        return c(lVar, windowLayoutInfo);
    }

    public static k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        C0094c c0094c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0094c = a(lVar, foldingFeature);
            } else {
                c0094c = null;
            }
            if (c0094c != null) {
                arrayList.add(c0094c);
            }
        }
        return new k(arrayList);
    }
}
