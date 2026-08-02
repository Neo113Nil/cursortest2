package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 {

    /* JADX INFO: renamed from: b */
    public static final ak1 f228b;

    /* JADX INFO: renamed from: a */
    public final xj1 f229a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f228b = vj1.f8205w;
        } else if (i >= 30) {
            f228b = tj1.f7457v;
        } else {
            f228b = xj1.f8974b;
        }
    }

    public ak1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f229a = new wj1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f229a = new vj1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f229a = new uj1(this, windowInsets);
        } else if (i >= 30) {
            this.f229a = new tj1(this, windowInsets);
        } else {
            this.f229a = new sj1(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ak1 m270b(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        ak1 ak1Var = new ak1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ai1.f194a;
            ak1 ak1VarM5160a = vh1.m5160a(view);
            xj1 xj1Var = ak1Var.f229a;
            xj1Var.mo3944t(ak1VarM5160a);
            View rootView = view.getRootView();
            xj1Var.mo3935d(rootView);
            xj1Var.mo3939m(rootView);
            xj1Var.mo3940n();
            xj1Var.mo3945u(view.getWindowSystemUiVisibility());
        }
        return ak1Var;
    }

    /* JADX INFO: renamed from: a */
    public final WindowInsets m271a() {
        xj1 xj1Var = this.f229a;
        if (xj1Var instanceof pj1) {
            return ((pj1) xj1Var).f6171c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ak1) {
            return Objects.equals(this.f229a, ((ak1) obj).f229a);
        }
        return false;
    }

    public final int hashCode() {
        xj1 xj1Var = this.f229a;
        if (xj1Var == null) {
            return 0;
        }
        return xj1Var.hashCode();
    }

    public ak1() {
        this.f229a = new xj1(this);
    }
}
