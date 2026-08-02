package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vh1 {
    /* JADX INFO: renamed from: a */
    public static ak1 m5160a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ak1 ak1VarM270b = ak1.m270b(rootWindowInsets, null);
        xj1 xj1Var = ak1VarM270b.f229a;
        xj1Var.mo3944t(ak1VarM270b);
        View rootView = view.getRootView();
        xj1Var.mo3935d(rootView);
        xj1Var.mo3939m(rootView);
        xj1Var.mo3940n();
        return ak1VarM270b;
    }
}
