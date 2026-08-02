package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4736j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f4737k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ a81 f4738l;

    public /* synthetic */ l91(a81 a81Var, View view, int i) {
        this.f4736j = i;
        this.f4738l = a81Var;
        this.f4737k = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.f4736j;
        View view = this.f4737k;
        a81 a81Var = this.f4738l;
        switch (i) {
            case 0:
                if (((o91) a81Var.f64l).mo3000a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((o91) ((n91) a81Var).f64l).mo3000a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
