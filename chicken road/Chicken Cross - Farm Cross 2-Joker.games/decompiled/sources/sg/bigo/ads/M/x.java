package sg.bigo.ads.M;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.L.C4970d;
import sg.bigo.ads.L.C4971e;
import sg.bigo.ads.L.C4972f;
import sg.bigo.ads.R;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.t0.C5479b;

/* loaded from: classes3.dex */
public final class x extends C5002t {
    public C5479b q;
    public boolean r;
    public float s;
    public float t;
    public final float[] u;
    public long v;
    public boolean w;
    public ViewOnTouchListenerC5004v x;

    public x(sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2, sg.bigo.ads.L.N n) {
        super(jVar, qVar, qVar2, n);
        this.r = true;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = new float[]{-1.0f, -1.0f, -1.0f};
        this.v = 0L;
        this.x = new ViewOnTouchListenerC5004v(this);
    }

    public static void a(x xVar) {
        xVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - xVar.v;
        if (!xVar.r || j <= 2000) {
            return;
        }
        xVar.v = elapsedRealtime;
        xVar.j.U.a((sg.bigo.ads.U.j) null, 8, 22);
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void d() {
        g();
        C5002t.p = null;
        C5479b c5479b = this.q;
        if (c5479b != null) {
            c5479b.b();
            this.q = null;
        }
        this.x = null;
    }

    @Override // sg.bigo.ads.M.C5002t
    public final int e() {
        sg.bigo.ads.T0.q qVar = this.d;
        if (qVar == null) {
            return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction;
        }
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
            if (2 == (a2 != null ? a2.intValue() : 1)) {
                return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction_immersive;
            }
        }
        return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction;
    }

    public final int i() {
        Integer a2;
        sg.bigo.ads.T0.q qVar = this.d;
        if (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.interactive_method"))) == null) {
            return 0;
        }
        return a2.intValue();
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z) {
        super.a(z);
        this.r = z;
    }

    @Override // sg.bigo.ads.M.C5002t, sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        super.a(z, viewGroup, -1);
        if (!z || this.w) {
            return;
        }
        sg.bigo.ads.L.r.b = true;
        this.w = true;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_fl_interaction_container);
        int i2 = R.layout.bigo_ad_item_interaction_vertical;
        if (this.j.getStyle() == SplashAd.Style.HORIZONTAL) {
            i2 = R.layout.bigo_ad_item_interaction_horizontal;
        }
        if (viewGroup2 != null) {
            View a2 = AbstractC4944a.a(viewGroup2.getContext(), i2, viewGroup2, false);
            viewGroup2.removeAllViews();
            viewGroup2.addView(a2);
            ImageView imageView = (ImageView) a2.findViewById(R.id.inter_iv_interaction_arrow);
            ImageView imageView2 = (ImageView) a2.findViewById(R.id.inter_iv_interaction_phone);
            TextView textView = (TextView) a2.findViewById(R.id.inter_tv_interaction_type);
            if (imageView != null && imageView2 != null && textView != null) {
                int i3 = i();
                int i4 = R.drawable.bigo_ad_interaction_shake_arrow;
                int i5 = R.drawable.bigo_ad_interaction_shake_phone;
                String string = a2.getContext().getString(R.string.bigo_ad_interaction_shake);
                if (i3 != 1) {
                    if (i3 == 2) {
                        i5 = R.drawable.bigo_ad_interaction_slide_hand;
                        i4 = R.drawable.bigo_ad_interaction_slide_line;
                        string = a2.getContext().getString(R.string.bigo_ad_interaction_slide);
                    } else if (i3 == 3) {
                        i4 = R.drawable.bigo_ad_interaction_twist_arrow;
                        string = a2.getContext().getString(R.string.bigo_ad_interaction_twist);
                        i5 = sg.bigo.ads.L.r.b() ? R.drawable.bigo_ad_interaction_twist_landscape_phone : R.drawable.bigo_ad_interaction_twist_phone;
                    }
                } else if (sg.bigo.ads.L.r.b()) {
                    i5 = R.drawable.bigo_ad_interaction_shake_landscape_phone;
                }
                imageView.setImageResource(i4);
                imageView2.setImageResource(i5);
                textView.setText(string);
                if (i3 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "rotation", 0.0f, 10.0f);
                    ofFloat.setDuration(300L);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "rotation", 10.0f, -10.0f);
                    ofFloat2.setDuration(300L);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "rotation", -10.0f, 0.0f);
                    ofFloat3.setDuration(300L);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat4.setDuration(500L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    animatorSet.addListener(new C4971e(animatorSet));
                    animatorSet.start();
                } else if (i3 == 2) {
                    imageView2.setTranslationY(AbstractC4963u.a(imageView2.getContext(), 60));
                    float translationY = imageView2.getTranslationY();
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f);
                    ofFloat5.setDuration(100L);
                    float a3 = AbstractC4963u.a(imageView2.getContext(), 200);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView2, "alpha", 1.0f, 0.0f);
                    ofFloat6.setDuration(800L);
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView2, "translationY", translationY, -a3);
                    ofFloat7.setDuration(800L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat6, ofFloat7);
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat8.setDuration(500L);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playSequentially(ofFloat5, animatorSet2, ofFloat8);
                    animatorSet3.addListener(new C4972f(animatorSet3));
                    animatorSet3.start();
                } else if (i3 == 3) {
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView2, "rotation", 0.0f, 25.0f);
                    ofFloat9.setDuration(300L);
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(imageView2, "rotation", 25.0f, -25.0f);
                    ofFloat10.setDuration(300L);
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(imageView2, "rotation", -25.0f, 0.0f);
                    ofFloat11.setDuration(300L);
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat12.setDuration(500L);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playSequentially(ofFloat9, ofFloat10, ofFloat11, ofFloat12);
                    animatorSet4.addListener(new C4970d(animatorSet4));
                    animatorSet4.start();
                }
            }
        }
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (2 == i()) {
            if (findViewById != null) {
                findViewById.setOnTouchListener(this.x);
            }
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(this.x);
            }
        }
        Context context = viewGroup.getContext();
        int i6 = i();
        if (this.q == null && context != null && (1 == i6 || 3 == i6)) {
            this.q = new C5479b(context, Arrays.asList(4, 9, 1), new C5005w(this));
        }
        C5479b c5479b = this.q;
        if (c5479b != null) {
            c5479b.a();
        }
    }
}
