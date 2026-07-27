package sg.bigo.ads.M;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.L.RunnableC4977k;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5164f1;

/* renamed from: sg.bigo.ads.M.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4989f implements InterfaceC5003u {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.T0.q f12444a;
    public final ViewGroup b;
    public final sg.bigo.ads.L.N c;
    public final ViewGroup d;
    public int e;
    public boolean f;
    public final C5085c g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4989f(ViewGroup viewGroup, sg.bigo.ads.L.N n, sg.bigo.ads.T0.q qVar, C5085c c5085c) {
        int i;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        Button button;
        AdOptionsView adOptionsView;
        String str;
        View findViewById;
        ArrayList arrayList;
        View view;
        AdOptionsView adOptionsView2;
        ImageView imageView2;
        int i2;
        char c;
        this.e = 1;
        this.f12444a = qVar;
        this.b = viewGroup;
        this.c = n;
        this.g = c5085c;
        Context context = viewGroup.getContext();
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.guide_click"));
            if ((a2 != null ? a2.intValue() : 0) == 4) {
                i = R.layout.bigo_ad_splash_endpage1_slide;
                ViewGroup viewGroup2 = (ViewGroup) AbstractC4944a.a(context, i, null, false);
                this.d = viewGroup2;
                this.e = 3;
                ArrayList arrayList2 = new ArrayList();
                imageView = (ImageView) viewGroup2.findViewById(R.id.inter_icon);
                textView = (TextView) viewGroup2.findViewById(R.id.inter_title);
                textView2 = (TextView) viewGroup2.findViewById(R.id.inter_description);
                button = (Button) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_cta);
                adOptionsView = (AdOptionsView) viewGroup2.findViewById(R.id.inter_options);
                View findViewById2 = viewGroup2.findViewById(R.id.inter_ad_label);
                sg.bigo.ads.C.l lVar = n.U;
                sg.bigo.ads.P.b popPage = lVar.getPopPage();
                if (textView != null) {
                    textView.setTag(2);
                    String g = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).g();
                    String str2 = popPage == null ? "" : ((sg.bigo.ads.U0.m) popPage).b;
                    if (!TextUtils.isEmpty(g)) {
                        textView.setText(g);
                    } else if (!TextUtils.isEmpty(str2)) {
                        textView.setText(str2);
                    }
                    arrayList2.add(textView);
                }
                if (textView2 != null) {
                    textView2.setTag(6);
                    String c2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).c();
                    String str3 = popPage == null ? "" : ((sg.bigo.ads.U0.m) popPage).c;
                    if (!TextUtils.isEmpty(c2)) {
                        textView2.setText(c2);
                    } else if (!TextUtils.isEmpty(str3)) {
                        textView2.setText(str3);
                    }
                    arrayList2.add(textView2);
                }
                if (button != null) {
                    button.setTag(7);
                    String callToAction = lVar.getCallToAction();
                    if (!TextUtils.isEmpty(callToAction)) {
                        button.setText(callToAction);
                    } else if (!TextUtils.isEmpty("")) {
                        button.setText("");
                    }
                    arrayList2.add(button);
                    if (qVar != null) {
                        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("endpage.cta_color"));
                        str = null;
                        int a4 = AbstractC5164f1.a(lVar, a3 != null ? a3.intValue() : 0, null);
                        if (button.getBackground() instanceof GradientDrawable) {
                            ((GradientDrawable) button.getBackground()).setColor(a4);
                        }
                        if (adOptionsView != null) {
                            adOptionsView.setTag(4);
                            adOptionsView.a(lVar.e(), ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).O);
                        }
                        if (imageView != null) {
                            String str4 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).y0 != null ? ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).y0.c : str;
                            imageView.setTag(1);
                            if (sg.bigo.ads.K0.I.a((CharSequence) str4) || !URLUtil.isNetworkUrl(str4)) {
                                sg.bigo.ads.L.r.a(n.U, new C4988e(imageView));
                            } else {
                                sg.bigo.ads.s0.u.f13300a.a(n.k.e, null, str4, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).T, new C4984a(this, imageView));
                            }
                        }
                        findViewById = viewGroup2.findViewById(R.id.layout_contain_view);
                        if (findViewById != null || qVar == null) {
                            arrayList = arrayList2;
                            view = findViewById2;
                            adOptionsView2 = adOptionsView;
                            imageView2 = imageView;
                            i2 = 1;
                        } else {
                            Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("endpage.click_type"));
                            i2 = a5 != null ? a5.intValue() : 1;
                            Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("endpage.below_area_dp"));
                            int intValue = a6 != null ? a6.intValue() : 0;
                            Integer a7 = sg.bigo.ads.K0.z.a(qVar.a("endpage.below_area_clickable"));
                            boolean z = (a7 != null ? a7.intValue() : 0) == 1;
                            Integer a8 = sg.bigo.ads.K0.z.a(qVar.a("endpage.up_area_dp"));
                            int intValue2 = a8 != null ? a8.intValue() : 0;
                            Integer a9 = sg.bigo.ads.K0.z.a(qVar.a("endpage.up_area_clickable"));
                            arrayList = arrayList2;
                            view = findViewById2;
                            boolean z2 = z;
                            adOptionsView2 = adOptionsView;
                            int i3 = intValue2;
                            imageView2 = imageView;
                            sg.bigo.ads.L.r.a(viewGroup2, findViewById, intValue, z2, i3, (a9 != null ? a9.intValue() : 0) == 1, 9, i2, lVar);
                            if (imageView2 != null) {
                                sg.bigo.ads.C.f.a(viewGroup, imageView2, 4, lVar, i2);
                            }
                        }
                        if (qVar != null) {
                            Integer a10 = sg.bigo.ads.K0.z.a(qVar.a("endpage.other_space_clickable_switch"));
                            if (1 == (a10 != null ? a10.intValue() : 1)) {
                                sg.bigo.ads.C.f.a(viewGroup, viewGroup2, 4, lVar, i2);
                                c = 0;
                                X.a(viewGroup2, new C4986c(this, adOptionsView2, view));
                                lVar.f0 = 9;
                                View[] viewArr = new View[1];
                                viewArr[c] = viewGroup2;
                                lVar.a(viewGroup, (MediaView) null, imageView2, adOptionsView2, arrayList, 9, viewArr);
                            }
                        }
                        c = 0;
                        sg.bigo.ads.C.f.a(viewGroup, viewGroup2, 4, new C4985b(), 0);
                        X.a(viewGroup2, new C4986c(this, adOptionsView2, view));
                        lVar.f0 = 9;
                        View[] viewArr2 = new View[1];
                        viewArr2[c] = viewGroup2;
                        lVar.a(viewGroup, (MediaView) null, imageView2, adOptionsView2, arrayList, 9, viewArr2);
                    }
                }
                str = null;
                if (adOptionsView != null) {
                }
                if (imageView != null) {
                }
                findViewById = viewGroup2.findViewById(R.id.layout_contain_view);
                if (findViewById != null) {
                }
                arrayList = arrayList2;
                view = findViewById2;
                adOptionsView2 = adOptionsView;
                imageView2 = imageView;
                i2 = 1;
                if (qVar != null) {
                }
                c = 0;
                sg.bigo.ads.C.f.a(viewGroup, viewGroup2, 4, new C4985b(), 0);
                X.a(viewGroup2, new C4986c(this, adOptionsView2, view));
                lVar.f0 = 9;
                View[] viewArr22 = new View[1];
                viewArr22[c] = viewGroup2;
                lVar.a(viewGroup, (MediaView) null, imageView2, adOptionsView2, arrayList, 9, viewArr22);
            }
        }
        i = R.layout.bigo_ad_splash_endpage1;
        ViewGroup viewGroup22 = (ViewGroup) AbstractC4944a.a(context, i, null, false);
        this.d = viewGroup22;
        this.e = 3;
        ArrayList arrayList22 = new ArrayList();
        imageView = (ImageView) viewGroup22.findViewById(R.id.inter_icon);
        textView = (TextView) viewGroup22.findViewById(R.id.inter_title);
        textView2 = (TextView) viewGroup22.findViewById(R.id.inter_description);
        button = (Button) viewGroup22.findViewById(R.id.bigo_ad_splash_btn_cta);
        adOptionsView = (AdOptionsView) viewGroup22.findViewById(R.id.inter_options);
        View findViewById22 = viewGroup22.findViewById(R.id.inter_ad_label);
        sg.bigo.ads.C.l lVar2 = n.U;
        sg.bigo.ads.P.b popPage2 = lVar2.getPopPage();
        if (textView != null) {
        }
        if (textView2 != null) {
        }
        if (button != null) {
        }
        str = null;
        if (adOptionsView != null) {
        }
        if (imageView != null) {
        }
        findViewById = viewGroup22.findViewById(R.id.layout_contain_view);
        if (findViewById != null) {
        }
        arrayList = arrayList22;
        view = findViewById22;
        adOptionsView2 = adOptionsView;
        imageView2 = imageView;
        i2 = 1;
        if (qVar != null) {
        }
        c = 0;
        sg.bigo.ads.C.f.a(viewGroup, viewGroup22, 4, new C4985b(), 0);
        X.a(viewGroup22, new C4986c(this, adOptionsView2, view));
        lVar2.f0 = 9;
        View[] viewArr222 = new View[1];
        viewArr222[c] = viewGroup22;
        lVar2.a(viewGroup, (MediaView) null, imageView2, adOptionsView2, arrayList, 9, viewArr222);
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z) {
        throw null;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void a(boolean z, ViewGroup viewGroup, int i) {
        E e;
        int i2;
        Integer a2;
        if (!this.f) {
            this.f = true;
            this.b.removeViewAt(1);
            this.b.addView(this.d, 1, new ViewGroup.LayoutParams(-1, -1));
            this.d.setVisibility(8);
        }
        this.e = z ? 2 : 3;
        this.d.setVisibility(z ? 0 : 8);
        if (z) {
            sg.bigo.ads.L.r.c = true;
            sg.bigo.ads.T0.q qVar = this.f12444a;
            int intValue = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.guide_click"))) == null) ? 0 : a2.intValue();
            ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.bigo_ad_splash_btn_cta_container);
            Button button = (Button) this.d.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (viewGroup2 != null) {
                if (intValue == 4 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View findViewById = this.d.findViewById(R.id.splash_footer_bg);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                        findViewById.setTag(14);
                        sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, this.c.U, 0);
                    }
                }
                if (intValue == 2) {
                    viewGroup2 = (ViewGroup) viewGroup2.findViewById(R.id.bigo_ad_splash_cta_inner);
                    viewGroup2.setVisibility(0);
                }
                if (intValue == 1) {
                    AbstractC5140Q.a((View) viewGroup2);
                } else if (intValue == 2) {
                    View a3 = AbstractC4944a.a(viewGroup2.getContext(), R.layout.bigo_ad_splash_item_flash, viewGroup2, false);
                    if (a3 != null) {
                        ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
                        layoutParams.width = AbstractC4963u.a(a3.getContext(), 34);
                        layoutParams.height = AbstractC4963u.a(a3.getContext(), 40);
                        viewGroup2.addView(a3);
                        viewGroup2.post(new RunnableC4977k(viewGroup2, a3));
                    }
                } else if (intValue == 3) {
                    sg.bigo.ads.L.r.a(viewGroup2, true);
                } else if (intValue == 4) {
                    AbstractC4944a.a(viewGroup2.getContext(), R.layout.bigo_ad_splash_endpage_item_slide, viewGroup2, true);
                    View findViewById2 = viewGroup2.findViewById(R.id.splash_slide);
                    View findViewById3 = viewGroup2.findViewById(R.id.splash_slide_hand);
                    if (findViewById2 != null && findViewById3 != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById3, "alpha", 0.0f, 1.0f);
                        ofFloat.setDuration(300L);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById3, "alpha", 1.0f, 0.0f);
                        ofFloat2.setDuration(300L);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById3, "translationY", 100.0f, -160.0f);
                        ofFloat3.setDuration(300L);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat2, ofFloat3);
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat4.setDuration(500L);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(ofFloat, animatorSet, ofFloat4);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById2, "translationY", 20.0f, 0.0f);
                        ofFloat5.setDuration(300L);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(findViewById2, "translationY", 0.0f, 20.0f);
                        ofFloat6.setDuration(300L);
                        ofFloat6.setInterpolator(new DecelerateInterpolator());
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playSequentially(ofFloat6, ofFloat5);
                        AnimatorSet animatorSet4 = (AnimatorSet) new WeakReference(new AnimatorSet()).get();
                        if (animatorSet4 != null) {
                            animatorSet4.playTogether(animatorSet2, animatorSet3);
                            animatorSet4.addListener(new sg.bigo.ads.L.o(animatorSet4));
                            animatorSet4.start();
                        }
                    }
                }
            }
            View findViewById4 = this.d.findViewById(R.id.layout_playable_loading);
            if (findViewById4 != null && (e = this.c.S) != null && e.h != 0) {
                sg.bigo.ads.T0.q qVar2 = this.f12444a;
                if (qVar2 != null) {
                    Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("endpage.ad_component_layout"));
                    i2 = a4 != null ? a4.intValue() : 0;
                } else {
                    i2 = 1;
                }
                int i3 = (sg.bigo.ads.O.g.f12472a.C.f12488a == 2 && 2 == i2) ? 1 : 0;
                findViewById4.setVisibility(i3 == 0 ? 4 : 0);
                r6 = i3;
            }
            sg.bigo.ads.s1.b.a(this.c.U.e(), r6 != 0 ? 4 : 1, i);
        }
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final int b() {
        throw null;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void d() {
        throw null;
    }
}
