package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0028a;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0028a f3062j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ i50 f3063k;

    public h50(i50 i50Var, C0028a c0028a) {
        this.f3063k = i50Var;
        this.f3062j = c0028a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0028a c0028a = this.f3062j;
        c50 c50Var = c0028a.f537c;
        c0028a.m427k();
        C0443lr.m3276i((ViewGroup) c50Var.f1112P.getParent(), this.f3063k.f3437j).m3285h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
