package sg.bigo.ads.h;

import android.view.animation.Animation;
import android.widget.RelativeLayout;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class R1 extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S1 f12850a;

    public R1(S1 s1) {
        this.f12850a = s1;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        T1 t1 = this.f12850a.f12853a;
        if (t1.j.n == null || t1.i.getTop() <= 0 || this.f12850a.f12853a.j.n.getBottom() <= this.f12850a.f12853a.i.getTop() || !(this.f12850a.f12853a.j.n.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12850a.f12853a.j.n.getLayoutParams();
        layoutParams.addRule(8, 0);
        layoutParams.addRule(2, R.id.inter_ad_info);
        this.f12850a.f12853a.j.n.setLayoutParams(layoutParams);
    }
}
