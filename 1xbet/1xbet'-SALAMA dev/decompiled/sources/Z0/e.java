package Z0;

import P.f0;
import P.g0;
import P.h0;
import P.i0;
import P.q0;
import X0.l;
import X0.m;
import X0.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static X0.c a(m mVar, FoldingFeature foldingFeature) {
        X0.b bVar;
        X0.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = X0.b.f7430z;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = X0.b.f7423A;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = X0.b.f7428x;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = X0.b.f7429y;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        U0.b bVar3 = new U0.b(bounds);
        Rect rectC = mVar.f7456a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new X0.c(new U0.b(bounds2), bVar, bVar2);
    }

    public static l b(m mVar, WindowLayoutInfo windowLayoutInfo) {
        X0.c cVarA;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVarA = a(mVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new l(arrayList);
    }

    public static l c(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        boolean z4;
        i0 g0Var;
        m mVar;
        h.e(windowLayoutInfo, "info");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            if (i7 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i8 = o.f7459b;
            return b(o.a((Activity) context), windowLayoutInfo);
        }
        int i9 = o.f7459b;
        if (i7 >= 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            q0 q0VarG = q0.g(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            h.d(bounds, "wm.currentWindowMetrics.bounds");
            mVar = new m(bounds, q0VarG);
        } else {
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalArgumentException("Context " + context + " is not a UiContext");
                }
                z4 = baseContext instanceof Activity;
                if (z4 || (baseContext instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                h.d(baseContext, "iterator.baseContext");
            }
            if (z4) {
                mVar = o.a((Activity) context);
            } else {
                if (!(baseContext instanceof InputMethodService)) {
                    throw new IllegalArgumentException(context + " is not a UiContext");
                }
                Object systemService = context.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "wm.defaultDisplay");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect(0, 0, point.x, point.y);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    g0Var = new h0();
                } else {
                    g0Var = i10 >= 29 ? new g0() : new f0();
                }
                q0 q0VarB = g0Var.b();
                h.d(q0VarB, "Builder().build()");
                mVar = new m(rect, q0VarB);
            }
        }
        return b(mVar, windowLayoutInfo);
    }
}
