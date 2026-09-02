package C;

import A.l;
import A.m;
import A.p;
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
import kotlin.jvm.internal.j;
import n.C0792f;
import n.C0793g;
import n.C0794h;
import n.r;
import x.C0857b;

/* loaded from: classes.dex */
public abstract class e {
    public static A.c a(m mVar, FoldingFeature foldingFeature) {
        A.b bVar;
        A.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = A.b.f6h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = A.b.f7i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = A.b.f4f;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = A.b.f5g;
        }
        Rect bounds = foldingFeature.getBounds();
        j.d(bounds, "oemFeature.bounds");
        C0857b c0857b = new C0857b(bounds);
        Rect c2 = mVar.f32a.c();
        if (c0857b.a() == 0 && c0857b.b() == 0) {
            return null;
        }
        if (c0857b.b() != c2.width() && c0857b.a() != c2.height()) {
            return null;
        }
        if (c0857b.b() < c2.width() && c0857b.a() < c2.height()) {
            return null;
        }
        if (c0857b.b() == c2.width() && c0857b.a() == c2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        j.d(bounds2, "oemFeature.bounds");
        return new A.c(new C0857b(bounds2), bVar, bVar2);
    }

    public static l b(m mVar, WindowLayoutInfo info) {
        A.c cVar;
        j.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        j.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                j.d(feature, "feature");
                cVar = a(mVar, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new l(arrayList);
    }

    public static l c(Context context, WindowLayoutInfo info) {
        m mVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        j.e(info, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = p.f35b;
            return b(p.a((Activity) context), info);
        }
        int i4 = p.f35b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z2 = context2 instanceof Activity;
                if (!z2 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        j.d(context2, "iterator.baseContext");
                    }
                }
                if (z2) {
                    mVar = p.a((Activity) context);
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
                    int i5 = Build.VERSION.SDK_INT;
                    r b2 = (i5 >= 30 ? new C0794h() : i5 >= 29 ? new C0793g() : new C0792f()).b();
                    j.d(b2, "Builder().build()");
                    mVar = new m(rect, b2);
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
        j.d(bounds, "wm.currentWindowMetrics.bounds");
        mVar = new m(bounds, a2);
        return b(mVar, info);
    }
}
