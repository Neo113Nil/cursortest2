package sg.bigo.ads.m;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13077a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ d0 f;

    public c0(d0 d0Var, boolean[] zArr, Pair pair, int i, int i2, int i3) {
        this.f = d0Var;
        this.f13077a = zArr;
        this.b = pair;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.f.d)) {
            return;
        }
        this.f.K = true;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new b0(this));
        TransitionManager.beginDelayedTransition(this.f.k, transitionSet);
        this.f.z.setCornerRadius(this.c);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.B.getLayoutParams();
        int i = this.c;
        marginLayoutParams.setMargins(i, i, i, 0);
        this.f.B.setLayoutParams(marginLayoutParams);
        this.f.C.setCornerRadius(this.c);
        ViewGroup.LayoutParams layoutParams = this.f.D.getLayoutParams();
        int i2 = this.d;
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f.D.setLayoutParams(layoutParams);
        this.f.F.setVisibility(0);
        this.f.F.setTextColor(((Integer) this.b.first).intValue());
        this.f.G.setTextSize(2, 12.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.G.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.f.j.getContext(), 4);
        this.f.G.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f.H.getLayoutParams();
        marginLayoutParams3.topMargin = this.c;
        this.f.H.setLayoutParams(marginLayoutParams3);
        if (sg.bigo.ads.K0.A.a(this.f.H.getItems())) {
            this.f.H.setVisibility(8);
        } else {
            this.f.H.setVisibility(0);
        }
        d0 d0Var = this.f;
        d0Var.B.removeView(d0Var.I);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.e);
        int i3 = this.c;
        layoutParams2.setMargins(i3, i3, i3, i3);
        d0 d0Var2 = this.f;
        d0Var2.A.addView(d0Var2.I, layoutParams2);
        d0 d0Var3 = this.f;
        sg.bigo.ads.h.T t = d0Var3.o;
        TextView textView = d0Var3.E;
        if (textView == null) {
            t.getClass();
        } else {
            t.f12854a.remove(textView);
        }
        d0 d0Var4 = this.f;
        sg.bigo.ads.h.T t2 = d0Var4.o;
        TextView textView2 = d0Var4.G;
        if (textView2 == null) {
            t2.getClass();
        } else {
            t2.f12854a.remove(textView2);
        }
        this.f.E.setTextColor(-14671580);
        this.f.G.setTextColor(-14671580);
    }
}
