package b0;

/* loaded from: classes.dex */
public abstract class e {
    public static Z.c a(Z.k kVar, androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        Z.b bVar;
        Z.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = Z.b.f1840g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = Z.b.f1841h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = Z.b.f1838e;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = Z.b.f1839f;
        }
        android.graphics.Rect bounds = foldingFeature.getBounds();
        kotlin.jvm.internal.i.d(bounds, "oemFeature.bounds");
        W.b bVar3 = new W.b(bounds);
        android.graphics.Rect c2 = kVar.f1862a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != c2.width() && bVar3.a() != c2.height()) {
            return null;
        }
        if (bVar3.b() < c2.width() && bVar3.a() < c2.height()) {
            return null;
        }
        if (bVar3.b() == c2.width() && bVar3.a() == c2.height()) {
            return null;
        }
        android.graphics.Rect bounds2 = foldingFeature.getBounds();
        kotlin.jvm.internal.i.d(bounds2, "oemFeature.bounds");
        return new Z.c(new W.b(bounds2), bVar, bVar2);
    }

    public static Z.j b(Z.k kVar, androidx.window.extensions.layout.WindowLayoutInfo info) {
        Z.c cVar;
        kotlin.jvm.internal.i.e(info, "info");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.i.d(displayFeatures, "info.displayFeatures");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                kotlin.jvm.internal.i.d(feature, "feature");
                cVar = a(kVar, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new Z.j(arrayList);
    }

    public static Z.j c(android.content.Context context, androidx.window.extensions.layout.WindowLayoutInfo info) {
        Z.k kVar;
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowInsets windowInsets;
        android.view.WindowMetrics currentWindowMetrics2;
        android.graphics.Rect bounds;
        kotlin.jvm.internal.i.e(info, "info");
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof android.app.Activity)) {
                throw new java.lang.UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = Z.m.f1865b;
            return b(Z.m.a((android.app.Activity) context), info);
        }
        int i4 = Z.m.f1865b;
        if (i2 < 30) {
            android.content.Context context2 = context;
            while (context2 instanceof android.content.ContextWrapper) {
                boolean z2 = context2 instanceof android.app.Activity;
                if (!z2 && !(context2 instanceof android.inputmethodservice.InputMethodService)) {
                    android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        kotlin.jvm.internal.i.d(context2, "iterator.baseContext");
                    }
                }
                if (z2) {
                    kVar = Z.m.a((android.app.Activity) context);
                } else {
                    if (!(context2 instanceof android.inputmethodservice.InputMethodService)) {
                        throw new java.lang.IllegalArgumentException(context + " is not a UiContext");
                    }
                    java.lang.Object systemService = context.getSystemService("window");
                    kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                    kotlin.jvm.internal.i.d(defaultDisplay, "wm.defaultDisplay");
                    android.graphics.Point point = new android.graphics.Point();
                    defaultDisplay.getRealSize(point);
                    android.graphics.Rect rect = new android.graphics.Rect(0, 0, point.x, point.y);
                    int i5 = android.os.Build.VERSION.SDK_INT;
                    y.Q b2 = (i5 >= 30 ? new y.H() : i5 >= 29 ? new y.G() : new y.F()).b();
                    kotlin.jvm.internal.i.d(b2, "Builder().build()");
                    kVar = new Z.k(rect, b2);
                }
            }
            throw new java.lang.IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        y.Q a2 = y.Q.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        kotlin.jvm.internal.i.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new Z.k(bounds, a2);
        return b(kVar, info);
    }
}
