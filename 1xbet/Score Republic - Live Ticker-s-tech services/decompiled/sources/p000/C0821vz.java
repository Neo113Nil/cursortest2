package p000;

import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: vz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821vz extends bc1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ WindowManager.LayoutParams f8303w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ WindowManager f8304x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC0057bc f8305y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0821vz(View view, nu1 nu1Var, WindowManager.LayoutParams layoutParams, WindowManager windowManager, AbstractC0057bc abstractC0057bc) {
        super(view, nu1Var);
        this.f8303w = layoutParams;
        this.f8304x = windowManager;
        this.f8305y = abstractC0057bc;
    }

    @Override // p000.bc1
    /* JADX INFO: renamed from: b */
    public final float mo637b() {
        return this.f8303w.x;
    }

    @Override // p000.bc1
    /* JADX INFO: renamed from: c */
    public final void mo638c(float f) {
        WindowManager.LayoutParams layoutParams = this.f8303w;
        layoutParams.x = (int) f;
        this.f8304x.updateViewLayout(this.f8305y.mo632d(), layoutParams);
    }
}
