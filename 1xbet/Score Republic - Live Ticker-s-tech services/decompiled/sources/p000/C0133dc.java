package p000;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: renamed from: dc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0133dc implements ly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1618a;

    /* JADX INFO: renamed from: b */
    public final ly0 f1619b;

    public C0133dc(x80 x80Var, ly0 ly0Var) {
        this.f1618a = 2;
        this.f1619b = ly0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f1618a;
        ly0 ly0Var = this.f1619b;
        switch (i) {
            case 0:
                return new C0093cc((Application) ly0Var.get());
            case 1:
                return new C0784uz((n11) ly0Var.get());
            default:
                Application application = (Application) ly0Var.get();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics;
        }
    }

    public /* synthetic */ C0133dc(ly0 ly0Var, int i) {
        this.f1618a = i;
        this.f1619b = ly0Var;
    }
}
