package sg.bigo.ads.L;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static ArrayList f12395a = null;
    public static boolean b = false;
    public static boolean c = false;

    public static void a(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2 || i == 3) {
            viewGroup = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_cta_inner);
            viewGroup.setVisibility(0);
        }
        if (i == 0) {
            View a2 = AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_cta_bg, viewGroup, false);
            if (a2 != null) {
                viewGroup.addView(a2);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.3f), Keyframe.ofFloat(0.8f, 0.0f)), PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.8f, 1.07f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.8f, 1.54f)));
                if (f12395a == null) {
                    f12395a = new ArrayList();
                }
                f12395a.add(ofPropertyValuesHolder);
                ofPropertyValuesHolder.setDuration(1000L);
                ofPropertyValuesHolder.setInterpolator(AbstractC4954k.a(2));
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.start();
                return;
            }
            return;
        }
        if (i == 1) {
            View a3 = AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_arrow, viewGroup, false);
            if (a3 != null) {
                viewGroup.addView(a3);
                float a4 = AbstractC4963u.a(viewGroup.getContext(), 6);
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(a3, PropertyValuesHolder.ofKeyframe("translationX", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.24f, -a4), Keyframe.ofFloat(0.44f, a4), Keyframe.ofFloat(0.64f, 0.0f)));
                if (f12395a == null) {
                    f12395a = new ArrayList();
                }
                f12395a.add(ofPropertyValuesHolder2);
                ofPropertyValuesHolder2.setDuration(1000L);
                ofPropertyValuesHolder2.setRepeatCount(-1);
                ofPropertyValuesHolder2.start();
                return;
            }
            return;
        }
        if (i == 2) {
            a(viewGroup);
            viewGroup.postDelayed(new RunnableC4976j(viewGroup), 150L);
            return;
        }
        if (i == 3) {
            View a5 = AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_flash, viewGroup, false);
            if (a5 != null) {
                a5.getLayoutParams();
                viewGroup.addView(a5);
                viewGroup.post(new RunnableC4977k(viewGroup, a5));
                return;
            }
            return;
        }
        if (i == 4) {
            a(viewGroup, false);
            return;
        }
        if (i != 5) {
            return;
        }
        AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_slide, viewGroup, true);
        View findViewById = viewGroup.findViewById(R.id.splash_slide);
        if (findViewById != null) {
            float a6 = AbstractC4963u.a(viewGroup.getContext(), 10);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "translationY", 0.0f, a6, (-2.0f) * a6, 0.0f, 0.0f);
            if (f12395a == null) {
                f12395a = new ArrayList();
            }
            f12395a.add(ofFloat);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.start();
        }
    }

    public static boolean b() {
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        return gVar != null && gVar.O == 1;
    }

    public static void b(ViewGroup viewGroup, int i) {
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
        if (findViewById == null) {
            return;
        }
        findViewById.setAlpha(0.0f);
        viewGroup.post(new RunnableC4975i(i, findViewById, viewGroup));
    }

    public static void a(View view, C4968b c4968b) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", view.getHeight() * 0.6f, 0.0f));
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.addListener(c4968b);
        ofPropertyValuesHolder.start();
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        int i = R.layout.bigo_ad_splash_item_click_guide;
        if (z) {
            i = R.layout.bigo_ad_splash_endpage_item_click_guide;
        }
        View a2 = AbstractC4944a.a(viewGroup.getContext(), i, viewGroup, false);
        if (a2 != null) {
            viewGroup.addView(a2);
            View findViewById = a2.findViewById(R.id.click_gesture);
            View findViewById2 = a2.findViewById(R.id.click_ripple);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
            rotateAnimation.setDuration(200L);
            rotateAnimation.setStartOffset(560L);
            rotateAnimation.setFillAfter(true);
            RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
            rotateAnimation2.setDuration(240L);
            rotateAnimation2.setFillAfter(true);
            AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(400L);
            scaleAnimation.setInterpolator(AbstractC4954k.a(2));
            scaleAnimation.setFillAfter(true);
            animationSet.addAnimation(scaleAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(400L);
            scaleAnimation.setInterpolator(AbstractC4954k.a(2));
            alphaAnimation.setFillAfter(true);
            animationSet.addAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new C4978l(findViewById2));
            rotateAnimation.setAnimationListener(new C4979m(findViewById, rotateAnimation2));
            rotateAnimation2.setAnimationListener(new C4980n(findViewById, rotateAnimation, findViewById2, animationSet));
            findViewById.startAnimation(rotateAnimation);
        }
    }

    public static void a(ViewGroup viewGroup) {
        View a2 = AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_ripple, viewGroup, false);
        if (a2 != null) {
            viewGroup.addView(a2);
            Interpolator a3 = AbstractC4954k.a(2);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.2f, 0.2f, 0.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f, 2.5f, 4.5f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f, 2.5f, 4.5f));
            if (f12395a == null) {
                f12395a = new ArrayList();
            }
            f12395a.add(ofPropertyValuesHolder);
            ofPropertyValuesHolder.setDuration(1000L);
            ofPropertyValuesHolder.setInterpolator(a3);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.start();
        }
    }

    public static void a() {
        ArrayList arrayList = f12395a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ObjectAnimator) it.next()).cancel();
            }
            f12395a.clear();
            f12395a = null;
        }
    }

    public static boolean a(sg.bigo.ads.T0.q qVar) {
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        int i = gVar == null ? 0 : gVar.O;
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("splash_style"));
        return i == 0 && (a2 != null ? a2.intValue() : 0) == 1;
    }

    public static void a(sg.bigo.ads.C.l lVar, ValueCallback valueCallback) {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e());
        if (kVar.p()) {
            String a2 = sg.bigo.ads.U.q.a(kVar.j(), lVar.k.e);
            if (sg.bigo.ads.K0.I.a((CharSequence) a2)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                AbstractC5446j.a(3, null, new RunnableC4973g(Uri.parse(a2).getPath(), lVar, valueCallback), 0L);
                return;
            }
        }
        String e = kVar.e();
        if (sg.bigo.ads.K0.I.a((CharSequence) e)) {
            valueCallback.onReceiveValue(null);
        } else {
            sg.bigo.ads.s0.x.a(lVar.k.e, null, e, kVar.T, new C4974h(valueCallback));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(View view, View view2, int i, boolean z, int i2, boolean z2, int i3, int i4, sg.bigo.ads.C.l lVar) {
        ViewGroup.LayoutParams layoutParams;
        if (!(view2 instanceof FrameLayout) && !(view2 instanceof RelativeLayout)) {
            AbstractC5496a.a("SplashAd", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i > 0) {
            View view3 = new View(context);
            view3.setId(R.id.bigo_ad_interstitial_below_area_click);
            view3.setTag(25);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, AbstractC4963u.a(context, i), 80);
            } else {
                if (viewGroup instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, AbstractC4963u.a(context, i));
                    layoutParams2.addRule(12);
                    layoutParams = layoutParams2;
                }
                if (z) {
                    sg.bigo.ads.C.f.a(view, view3, i3, new p(view), i4);
                } else {
                    sg.bigo.ads.C.f.a(view, view3, i3, lVar, i4);
                }
            }
            viewGroup.addView(view3, layoutParams);
            if (z) {
            }
        }
        if (i2 > 0) {
            View view4 = new View(context);
            view4.setTag(24);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(view4, new FrameLayout.LayoutParams(-1, AbstractC4963u.a(context, i2)));
            } else if (viewGroup instanceof RelativeLayout) {
                viewGroup.addView(view4, new RelativeLayout.LayoutParams(-1, AbstractC4963u.a(context, i)));
            }
            if (z2) {
                sg.bigo.ads.C.f.a(view, view4, i3, lVar, i4);
            } else {
                sg.bigo.ads.C.f.a(view, view4, i3, new q(view), i4);
            }
        }
    }
}
