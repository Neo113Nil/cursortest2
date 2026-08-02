package p000;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b10 extends AbstractC0846wn {

    /* JADX INFO: renamed from: m */
    public ImageView f670m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0057bc f671n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Activity f672o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f673p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ d10 f674q;

    public b10(d10 d10Var, AbstractC0057bc abstractC0057bc, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f674q = d10Var;
        this.f671n = abstractC0057bc;
        this.f672o = activity;
        this.f673p = onGlobalLayoutListener;
    }

    @Override // p000.AbstractC0846wn
    /* JADX INFO: renamed from: d */
    public final void mo551d(Drawable drawable) {
        m80.m3343j("Downloading Image Cleared");
        ImageView imageView = this.f670m;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        m554g();
    }

    @Override // p000.AbstractC0846wn
    /* JADX INFO: renamed from: e */
    public final void mo552e(Drawable drawable) {
        m80.m3343j("Downloading Image Failed");
        ImageView imageView = this.f670m;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        new Exception("Image loading failed!");
        m80.m3346m("Image download failure ");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f673p;
        if (onGlobalLayoutListener != null) {
            this.f671n.mo631c().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
        d10 d10Var = this.f674q;
        an0 an0Var = d10Var.f1510m;
        CountDownTimer countDownTimer = (CountDownTimer) an0Var.f254k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            an0Var.f254k = null;
        }
        an0 an0Var2 = d10Var.f1511n;
        CountDownTimer countDownTimer2 = (CountDownTimer) an0Var2.f254k;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            an0Var2.f254k = null;
        }
        d10Var.f1516s = null;
        d10Var.f1517t = null;
    }

    @Override // p000.AbstractC0846wn
    /* JADX INFO: renamed from: f */
    public final void mo553f(Object obj) {
        Drawable drawable = (Drawable) obj;
        m80.m3343j("Downloading Image Success!!!");
        ImageView imageView = this.f670m;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        m554g();
    }

    /* JADX INFO: renamed from: g */
    public final void m554g() {
        AbstractC0057bc abstractC0057bc = this.f671n;
        if (!abstractC0057bc.mo629a().f150i.booleanValue()) {
            abstractC0057bc.mo632d().setOnTouchListener(new a10(0, this));
        }
        d10 d10Var = this.f674q;
        an0 an0Var = d10Var.f1510m;
        b90 b90Var = new b90(21, this);
        an0Var.getClass();
        an0Var.f254k = new c11(5000L, b90Var).start();
        if (abstractC0057bc.mo629a().f152k.booleanValue()) {
            an0 an0Var2 = d10Var.f1511n;
            nu1 nu1Var = new nu1(22, this);
            an0Var2.getClass();
            an0Var2.f254k = new c11(20000L, nu1Var).start();
        }
        this.f672o.runOnUiThread(new RunnableC0897y0(8, this));
    }
}
