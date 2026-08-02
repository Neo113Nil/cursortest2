package p000;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ai1 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f194a;

    /* JADX INFO: renamed from: b */
    public static final qh1 f195b = new qh1();

    /* JADX INFO: renamed from: c */
    public static final rh1 f196c = new rh1();

    /* JADX INFO: renamed from: a */
    public static ji1 m248a(View view) {
        if (f194a == null) {
            f194a = new WeakHashMap();
        }
        ji1 ji1Var = (ji1) f194a.get(view);
        if (ji1Var != null) {
            return ji1Var;
        }
        ji1 ji1Var2 = new ji1(view);
        f194a.put(view, ji1Var2);
        return ji1Var2;
    }

    /* JADX INFO: renamed from: b */
    public static void m249b(View view, ak1 ak1Var) {
        WindowInsets windowInsetsM271a = ak1Var.m271a();
        if (windowInsetsM271a != null) {
            WindowInsets windowInsetsM5800a = Build.VERSION.SDK_INT >= 30 ? yh1.m5800a(view, windowInsetsM271a) : sh1.m4525a(view, windowInsetsM271a);
            if (windowInsetsM5800a.equals(windowInsetsM271a)) {
                return;
            }
            ak1.m270b(windowInsetsM5800a, view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String[] m250c(C0051b6 c0051b6) {
        return Build.VERSION.SDK_INT >= 31 ? zh1.m5909a(c0051b6) : (String[]) c0051b6.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static C0549om m251d(View view, C0549om c0549om) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0549om + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return zh1.m5910b(view, c0549om);
        }
        yc1 yc1Var = (yc1) view.getTag(R.id.tag_on_receive_content_listener);
        nu0 nu0Var = f195b;
        if (yc1Var == null) {
            if (view instanceof nu0) {
                nu0Var = (nu0) view;
            }
            return nu0Var.mo596a(c0549om);
        }
        C0549om c0549omM5755a = yc1.m5755a(view, c0549om);
        if (c0549omM5755a == null) {
            return null;
        }
        if (view instanceof nu0) {
            nu0Var = (nu0) view;
        }
        return nu0Var.mo596a(c0549omM5755a);
    }

    /* JADX INFO: renamed from: e */
    public static void m252e(View view, C0380k1 c0380k1) {
        if (c0380k1 == null && (xh1.m5662a(view) instanceof C0343j1)) {
            c0380k1 = new C0380k1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0380k1 == null ? null : c0380k1.f4246b);
    }

    /* JADX INFO: renamed from: f */
    public static void m253f(View view, CharSequence charSequence) {
        wh1.m5337d(view, charSequence);
        rh1 rh1Var = f196c;
        if (charSequence == null) {
            rh1Var.f6841j.remove(view);
            view.removeOnAttachStateChangeListener(rh1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(rh1Var);
        } else {
            rh1Var.f6841j.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(rh1Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(rh1Var);
            }
        }
    }
}
