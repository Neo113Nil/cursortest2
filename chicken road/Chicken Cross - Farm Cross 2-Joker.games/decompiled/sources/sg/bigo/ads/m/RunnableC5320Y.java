package sg.bigo.ads.m;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;

/* renamed from: sg.bigo.ads.m.Y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5320Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13071a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C5321Z g;

    public RunnableC5320Y(C5321Z c5321z, boolean[] zArr, Pair pair, int i, int i2, int i3, int i4) {
        this.g = c5321z;
        this.f13071a = zArr;
        this.b = pair;
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
        this.g.I = true;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new C5319X(this));
        TransitionManager.beginDelayedTransition(this.g.k, transitionSet);
        this.g.z.setCornerRadius(this.c);
        if (this.g.k()) {
            ViewGroup.LayoutParams layoutParams = this.g.r.getLayoutParams();
            layoutParams.height = this.d;
            this.g.r.setLayoutParams(layoutParams);
        }
        int childCount = this.g.A.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.g.A.getChildAt(i);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int i2 = this.d;
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i2;
            if (i == 0) {
                layoutParams2.topMargin = i2;
            }
            if (i == childCount - 1) {
                layoutParams2.bottomMargin = i2;
            }
            if (childAt.getId() == R.id.inter_btn_cta_layout) {
                layoutParams2.topMargin = this.e;
            }
            childAt.setLayoutParams(layoutParams2);
        }
        this.g.B.setCornerRadius(this.d);
        ViewGroup.LayoutParams layoutParams3 = this.g.C.getLayoutParams();
        int i3 = this.f;
        layoutParams3.width = i3;
        layoutParams3.height = i3;
        this.g.C.setLayoutParams(layoutParams3);
        C5321Z c5321z = this.g;
        sg.bigo.ads.h.T t = c5321z.o;
        TextView textView = c5321z.D;
        if (textView == null) {
            t.getClass();
        } else {
            t.f12854a.remove(textView);
        }
        C5321Z c5321z2 = this.g;
        sg.bigo.ads.h.T t2 = c5321z2.o;
        TextView textView2 = c5321z2.E;
        if (textView2 == null) {
            t2.getClass();
        } else {
            t2.f12854a.remove(textView2);
        }
        this.g.D.setTextColor(-14671580);
        this.g.E.setTextColor(-14671580);
        this.g.F.setVisibility(0);
    }
}
