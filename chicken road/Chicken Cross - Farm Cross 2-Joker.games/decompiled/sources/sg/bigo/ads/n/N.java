package sg.bigo.ads.n;

import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.EnumC5207t;

/* loaded from: classes3.dex */
public class N extends C5358D {
    public IconListView T;

    public N(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    public static void a(N n) {
        int i;
        if (n.D == null || n.B) {
            return;
        }
        boolean o = n.o();
        Context context = n.D.getContext();
        int a2 = AbstractC4963u.a(context, 12);
        int a3 = AbstractC4963u.a(context, 8);
        int a4 = AbstractC4963u.a(context, 48);
        C5389m i2 = n.i();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new C5406v(n));
        transitionSet.addListener((Transition.TransitionListener) new C5364J(n, new boolean[]{false, false}, o, i2));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(n.v, transitionSet);
        TextView textView = n.H;
        if (textView != null) {
            int currentTextColor = textView.getCurrentTextColor();
            EnumC5207t enumC5207t = EnumC5207t.f;
            i = a3;
            long duration = transitionSet.getDuration();
            TextView[] textViewArr = {n.H};
            if (!sg.bigo.ads.K0.A.c(textViewArr)) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (duration >= 0) {
                    ofFloat.setDuration(duration);
                }
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new sg.bigo.ads.E0.d(currentTextColor, -14671580, textViewArr));
                ofFloat.start();
            }
        } else {
            i = a3;
        }
        TextView textView2 = n.I;
        if (textView2 != null) {
            int currentTextColor2 = textView2.getCurrentTextColor();
            EnumC5207t enumC5207t2 = EnumC5207t.f;
            long duration2 = transitionSet.getDuration();
            TextView[] textViewArr2 = {n.I};
            if (!sg.bigo.ads.K0.A.c(textViewArr2)) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (duration2 >= 0) {
                    ofFloat2.setDuration(duration2);
                }
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.addUpdateListener(new sg.bigo.ads.E0.d(currentTextColor2, -10525849, textViewArr2));
                ofFloat2.start();
            }
        }
        n.D.setOutlineProvider(new sg.bigo.ads.N0.b(AbstractC4963u.a(context, 12)));
        n.D.setPadding(a2, a2, a2, a2);
        n.D.getLayoutParams().width = AbstractC4963u.a(n.D.getContext(), 288);
        LinearLayout linearLayout = n.S;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(a4);
            ((RelativeLayout.LayoutParams) n.S.getLayoutParams()).addRule(0, 0);
        }
        RoundedImageView roundedImageView = n.L;
        if (roundedImageView != null) {
            ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
            layoutParams.width = a4;
            layoutParams.height = a4;
        }
        TextView textView3 = n.H;
        if (textView3 != null) {
            textView3.setMaxLines(2);
        }
        int i3 = R.id.inter_text_layout;
        IconListView iconListView = n.T;
        if (iconListView != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) iconListView.getLayoutParams();
            if (sg.bigo.ads.K0.A.a(n.T.getItems())) {
                n.T.setVisibility(8);
            } else {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                layoutParams2.topMargin = i;
                i3 = n.T.getId();
                n.T.setVisibility(0);
                AbstractC5140Q.a(10, 100, 300L, new L(n), new M());
                a2 = i;
            }
        }
        Button button = n.J;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.addRule(3, i3);
            layoutParams3.addRule(1, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
            layoutParams3.topMargin = a2;
        }
        EnumC5207t enumC5207t3 = EnumC5207t.f;
        enumC5207t3.a(n.H, n.I);
        enumC5207t3.a(n.D);
        enumC5207t3.a(n.J);
        RoundedImageView roundedImageView2 = n.L;
        if (roundedImageView2 != null) {
            roundedImageView2.setCornerRadius(AbstractC4963u.a(roundedImageView2.getContext(), 8));
        }
        n.D.requestLayout();
    }

    @Override // sg.bigo.ads.n.C5358D
    public final void b(int i) {
    }

    @Override // sg.bigo.ads.n.C5358D
    public final void c(int i) {
        Button button = this.J;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(1);
            LinearLayout linearLayout = this.S;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).addRule(0, this.J.getId());
            }
        }
        super.c(i);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final int g() {
        return Math.min(0, super.g());
    }

    @Override // sg.bigo.ads.n.C5358D, sg.bigo.ads.n.C5408w
    public final int w() {
        return R.id.inter_component_26;
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void x() {
        super.x();
        IconListView iconListView = this.T;
        if (iconListView != null) {
            List<sg.bigo.ads.v.g> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                sg.bigo.ads.v.g gVar = items.get(i);
                sg.bigo.ads.C.f.a(gVar.d, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.d, 8, this.d, this.w.i);
                sg.bigo.ads.C.f.a(gVar.g, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.g, 8, this.d, this.w.i);
            }
        }
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void z() {
        if (this.D == null) {
            return;
        }
        a(Math.max(1, super.g()), new RunnableC5362H(this, new RunnableC5360F(this)));
    }

    @Override // sg.bigo.ads.n.C5358D, sg.bigo.ads.n.C5408w
    public final boolean a(EnumC5207t enumC5207t) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
        if (!super.a(enumC5207t) || (realtimeBlurLinearLayout = this.D) == null) {
            return false;
        }
        IconListView iconListView = (IconListView) realtimeBlurLinearLayout.findViewById(R.id.inter_download_msg);
        this.T = iconListView;
        iconListView.a(this.y);
        return true;
    }
}
