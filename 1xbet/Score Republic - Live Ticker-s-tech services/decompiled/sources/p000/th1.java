package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class th1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public ak1 f7448a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f7449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xt0 f7450c;

    public th1(View view, xt0 xt0Var) {
        this.f7449b = view;
        this.f7450c = xt0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ak1 ak1VarM270b = ak1.m270b(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        xt0 xt0Var = this.f7450c;
        if (i < 30) {
            uh1.m4919a(windowInsets, this.f7449b);
            if (ak1VarM270b.equals(this.f7448a)) {
                return ((C0347j5) xt0Var).m2821a(view, ak1VarM270b).m271a();
            }
        }
        this.f7448a = ak1VarM270b;
        ak1 ak1VarM2821a = ((C0347j5) xt0Var).m2821a(view, ak1VarM270b);
        if (i >= 30) {
            return ak1VarM2821a.m271a();
        }
        view.requestApplyInsets();
        return ak1VarM2821a.m271a();
    }
}
