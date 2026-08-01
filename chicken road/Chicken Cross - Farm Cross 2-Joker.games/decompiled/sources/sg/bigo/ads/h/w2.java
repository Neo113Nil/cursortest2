package sg.bigo.ads.h;

import android.view.animation.Animation;
import android.widget.RelativeLayout;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class w2 extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f12939a;

    public w2(x2 x2Var) {
        this.f12939a = x2Var;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        y2 y2Var = this.f12939a.f12942a;
        if (y2Var.j.n == null || y2Var.i.getTop() <= 0 || this.f12939a.f12942a.j.n.getBottom() <= this.f12939a.f12942a.i.getTop()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12939a.f12942a.j.n.getLayoutParams();
        layoutParams.addRule(8, 0);
        layoutParams.addRule(2, R.id.inter_ad_info);
        this.f12939a.f12942a.j.n.setLayoutParams(layoutParams);
    }
}
