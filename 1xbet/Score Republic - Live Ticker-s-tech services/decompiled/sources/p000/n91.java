package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import live.football.scorerepublic.MainActivity;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 extends a81 {

    /* JADX INFO: renamed from: m */
    public l91 f5336m;

    /* JADX INFO: renamed from: n */
    public final m91 f5337n;

    public n91(MainActivity mainActivity) {
        super(mainActivity);
        this.f5337n = new m91(this, mainActivity);
    }

    @Override // p000.a81
    /* JADX INFO: renamed from: i */
    public final void mo85i() {
        int i;
        MainActivity mainActivity = (MainActivity) this.f63k;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f5337n);
        }
    }

    @Override // p000.a81
    /* JADX INFO: renamed from: l */
    public final void mo88l(tk0 tk0Var) {
        this.f64l = tk0Var;
        View viewFindViewById = ((MainActivity) this.f63k).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.f5336m != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f5336m);
        }
        l91 l91Var = new l91(this, viewFindViewById, 1);
        this.f5336m = l91Var;
        viewTreeObserver.addOnPreDrawListener(l91Var);
    }
}
