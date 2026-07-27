package sg.bigo.ads.n;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13133a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ G0 f;

    public F0(G0 g0, boolean[] zArr, boolean z, int i, int i2, int i3) {
        this.f = g0;
        this.f13133a = zArr;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.f.d)) {
            return;
        }
        G0 g0 = this.f;
        g0.a0 = true;
        C5389m i = g0.i();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new E0(this, i));
        TransitionManager.beginDelayedTransition(this.f.v, transitionSet);
        this.f.P.setCornerRadius(this.c);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.R.getLayoutParams();
        int i2 = this.c;
        marginLayoutParams.setMargins(i2, i2, i2, 0);
        this.f.R.setLayoutParams(marginLayoutParams);
        this.f.S.setCornerRadius(this.c);
        ViewGroup.LayoutParams layoutParams = this.f.T.getLayoutParams();
        int i3 = this.d;
        layoutParams.width = i3;
        layoutParams.height = i3;
        this.f.T.setLayoutParams(layoutParams);
        this.f.V.setVisibility(0);
        this.f.V.setTextColor(i.f13179a);
        this.f.W.setTextSize(2, 12.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.W.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.f.u.getContext(), 4);
        this.f.W.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f.X.getLayoutParams();
        marginLayoutParams3.topMargin = this.c;
        this.f.X.setLayoutParams(marginLayoutParams3);
        if (sg.bigo.ads.K0.A.a(this.f.X.getItems())) {
            this.f.X.setVisibility(8);
        } else {
            this.f.X.setVisibility(0);
        }
        G0 g02 = this.f;
        g02.R.removeView(g02.Y);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.e);
        int i4 = this.c;
        layoutParams2.setMargins(i4, i4, i4, i4);
        G0 g03 = this.f;
        g03.Q.addView(g03.Y, layoutParams2);
        G0 g04 = this.f;
        sg.bigo.ads.h.T t = g04.s;
        TextView textView = g04.U;
        if (textView == null) {
            t.getClass();
        } else {
            t.f12854a.remove(textView);
        }
        G0 g05 = this.f;
        sg.bigo.ads.h.T t2 = g05.s;
        TextView textView2 = g05.W;
        if (textView2 == null) {
            t2.getClass();
        } else {
            t2.f12854a.remove(textView2);
        }
        this.f.U.setTextColor(-14671580);
        this.f.W.setTextColor(-14671580);
    }
}
