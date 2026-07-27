package o0;

import E.O;
import E.Q;
import E.S;
import E.b0;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import m0.C1267b;
import m0.C1268c;
import m0.k;
import m0.l;
import m0.n;

/* loaded from: classes.dex */
public abstract class e {
    public static C1268c a(l lVar, FoldingFeature foldingFeature) {
        C1267b c1267b;
        C1267b c1267b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c1267b = C1267b.f11094g;
        } else {
            if (type != 2) {
                return null;
            }
            c1267b = C1267b.f11095h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c1267b2 = C1267b.f11092e;
        } else {
            if (state != 2) {
                return null;
            }
            c1267b2 = C1267b.f11093f;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        j0.b bVar = new j0.b(bounds);
        Rect c2 = lVar.f11118a.c();
        if (bVar.a() == 0 && bVar.b() == 0) {
            return null;
        }
        if (bVar.b() != c2.width() && bVar.a() != c2.height()) {
            return null;
        }
        if (bVar.b() < c2.width() && bVar.a() < c2.height()) {
            return null;
        }
        if (bVar.b() == c2.width() && bVar.a() == c2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new C1268c(new j0.b(bounds2), c1267b, c1267b2);
    }

    public static k b(Context context, WindowLayoutInfo info) {
        l lVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(info, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = n.f11121b;
            return c(n.a((Activity) context), info);
        }
        int i6 = n.f11121b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z = context2 instanceof Activity;
                if (!z && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        i.d(context2, "iterator.baseContext");
                    }
                }
                if (z) {
                    lVar = n.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    i.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i7 = Build.VERSION.SDK_INT;
                    b0 b6 = (i7 >= 30 ? new S() : i7 >= 29 ? new Q() : new O()).b();
                    i.d(b6, "Builder().build()");
                    lVar = new l(rect, b6);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        b0 a6 = b0.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(bounds, a6);
        return c(lVar, info);
    }

    public static k c(l lVar, WindowLayoutInfo info) {
        C1268c c1268c;
        i.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                i.d(feature, "feature");
                c1268c = a(lVar, feature);
            } else {
                c1268c = null;
            }
            if (c1268c != null) {
                arrayList.add(c1268c);
            }
        }
        return new k(arrayList);
    }
}
