package sg.bigo.ads.q;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* loaded from: classes3.dex */
public abstract class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f13247a;
    public final sg.bigo.ads.r.c b;
    public long c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public n(ViewGroup viewGroup, sg.bigo.ads.r.c cVar) {
        this.f13247a = viewGroup;
        this.b = cVar;
    }

    public void a(C5430a c5430a) {
        if (c5430a != null && c5430a.c > 0) {
            c5430a.b.post(new m(c5430a));
        }
    }

    public abstract boolean a();

    public final void b() {
        if (this.d || this.e) {
            return;
        }
        this.e = true;
        this.f = false;
        if (this.c == 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        this.f13247a.postDelayed(this, Math.max((Math.min(99, Math.max(0, this.b.f)) * 1000) - (SystemClock.elapsedRealtime() - this.c), 0L));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && !this.f && a()) {
            this.d = true;
        }
        this.e = false;
    }

    public final void a(ViewGroup viewGroup, RealtimeBlurLinearLayout realtimeBlurLinearLayout, Integer num, C5430a c5430a) {
        X.c(realtimeBlurLinearLayout);
        viewGroup.addView(realtimeBlurLinearLayout);
        sg.bigo.ads.Z.c.a((View) realtimeBlurLinearLayout, 100.0f);
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
        }
        ValueAnimator a2 = num == null ? null : sg.bigo.ads.E0.p.a(this.f13247a, num.intValue(), new i());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.1f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new j(this, a2, c5430a));
        realtimeBlurLinearLayout.startAnimation(translateAnimation);
    }
}
