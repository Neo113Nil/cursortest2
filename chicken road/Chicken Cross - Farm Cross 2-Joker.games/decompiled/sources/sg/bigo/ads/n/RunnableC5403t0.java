package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import sg.bigo.ads.K0.AbstractC4963u;

/* renamed from: sg.bigo.ads.n.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5403t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13192a;
    public final /* synthetic */ C5407v0 b;

    public RunnableC5403t0(C5407v0 c5407v0, View view) {
        this.b = c5407v0;
        this.f13192a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.b.d)) {
            return;
        }
        this.f13192a.setVisibility(0);
        C5407v0 c5407v0 = this.b;
        View view = c5407v0.P;
        if (view != null && c5407v0.Q != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            c5407v0.Q.getLocationOnScreen(iArr2);
            ViewGroup.LayoutParams layoutParams = c5407v0.Q.getLayoutParams();
            layoutParams.width = (iArr[0] - iArr2[0]) - AbstractC4963u.a(c5407v0.u.getContext(), 28);
            c5407v0.Q.setLayoutParams(layoutParams);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
        translateAnimation.setDuration(600L);
        this.f13192a.startAnimation(translateAnimation);
    }
}
