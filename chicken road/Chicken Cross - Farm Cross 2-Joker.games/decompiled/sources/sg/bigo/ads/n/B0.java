package sg.bigo.ads.n;

import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13128a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C0 g;

    public B0(C0 c0, boolean[] zArr, boolean z, int i, int i2, int i3, int i4) {
        this.g = c0;
        this.f13128a = zArr;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.g.d)) {
            return;
        }
        C0 c0 = this.g;
        c0.Y = true;
        C5389m i = c0.i();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade());
        transitionSet.addListener((Transition.TransitionListener) new A0(this, i));
        TransitionManager.beginDelayedTransition(this.g.v, transitionSet);
        this.g.P.setCornerRadius(this.c);
        if (this.g.C()) {
            ViewGroup.LayoutParams layoutParams = this.g.D.getLayoutParams();
            layoutParams.height = this.d;
            this.g.D.setLayoutParams(layoutParams);
        }
        int childCount = this.g.Q.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.g.Q.getChildAt(i2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int i3 = this.d;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
            if (i2 == 0) {
                layoutParams2.topMargin = i3;
            }
            if (i2 == childCount - 1) {
                layoutParams2.bottomMargin = i3;
            }
            if (childAt.getId() == R.id.inter_btn_cta_layout) {
                layoutParams2.topMargin = this.e;
            }
            childAt.setLayoutParams(layoutParams2);
        }
        this.g.R.setCornerRadius(this.d);
        ViewGroup.LayoutParams layoutParams3 = this.g.S.getLayoutParams();
        int i4 = this.f;
        layoutParams3.width = i4;
        layoutParams3.height = i4;
        this.g.S.setLayoutParams(layoutParams3);
        C0 c02 = this.g;
        sg.bigo.ads.h.T t = c02.s;
        TextView textView = c02.T;
        if (textView == null) {
            t.getClass();
        } else {
            t.f12854a.remove(textView);
        }
        C0 c03 = this.g;
        sg.bigo.ads.h.T t2 = c03.s;
        TextView textView2 = c03.U;
        if (textView2 == null) {
            t2.getClass();
        } else {
            t2.f12854a.remove(textView2);
        }
        this.g.T.setTextColor(-14671580);
        this.g.U.setTextColor(-14671580);
        this.g.V.setVisibility(0);
    }
}
