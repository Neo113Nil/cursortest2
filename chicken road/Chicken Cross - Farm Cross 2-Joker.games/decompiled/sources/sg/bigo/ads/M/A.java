package sg.bigo.ads.M;

import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes3.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12422a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup.MarginLayoutParams d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ sg.bigo.ads.U.r h;
    public final /* synthetic */ sg.bigo.ads.U.r i;
    public final /* synthetic */ RoundedFrameLayout j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ ViewGroup.MarginLayoutParams n;
    public final /* synthetic */ B o;

    public A(B b, ViewGroup viewGroup, ViewGroup viewGroup2, int i, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, sg.bigo.ads.U.r rVar, sg.bigo.ads.U.r rVar2, RoundedFrameLayout roundedFrameLayout, int i5, int i6, int i7, ViewGroup.MarginLayoutParams marginLayoutParams2) {
        this.o = b;
        this.f12422a = viewGroup;
        this.b = viewGroup2;
        this.c = i;
        this.d = marginLayoutParams;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = rVar;
        this.i = rVar2;
        this.j = roundedFrameLayout;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = marginLayoutParams2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.o.j.u) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade());
        transitionSet.addListener((Transition.TransitionListener) new z(this));
        TransitionManager.beginDelayedTransition(this.b, transitionSet);
        int i = this.c;
        if (5 == this.o.q) {
            i = AbstractC4963u.a(this.f12422a.getContext(), 80);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.d;
        marginLayoutParams.width = this.e - this.f;
        marginLayoutParams.height = i;
        this.f12422a.setLayoutParams(marginLayoutParams);
        int i2 = this.g - i;
        int i3 = this.h.b;
        if (i3 > i2) {
            int i4 = (int) (((i2 * 1.0f) * r2.f12567a) / i3);
            sg.bigo.ads.U.r rVar = this.i;
            sg.bigo.ads.U.r a2 = sg.bigo.ads.U.r.a(rVar.f12567a, rVar.b, i4, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            marginLayoutParams2.width = a2.f12567a;
            marginLayoutParams2.height = a2.b;
            this.j.setLayoutParams(marginLayoutParams2);
            this.j.setCornerRadius(this.k);
        }
        int i5 = this.l - this.m;
        int i6 = i5 / 2;
        this.n.bottomMargin = Math.abs((((i5 - i) - this.f) / 2) - i6);
        this.j.setLayoutParams(this.n);
        ViewGroup viewGroup = this.f12422a;
        if (this.o.r == 0) {
            viewGroup = (ViewGroup) this.b.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        }
        sg.bigo.ads.L.r.b(viewGroup, this.o.r);
    }
}
