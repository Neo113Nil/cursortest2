package sg.bigo.ads.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public class S0 extends AbstractC5391n {
    public MediaView C;
    public float D;
    public float E;
    public Bitmap F;

    public S0(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    public static void a(S0 s0, ViewGroup viewGroup) {
        s0.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
        View findViewById = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
        if (s0.C == null || imageView == null || s0.F == null) {
            return;
        }
        AbstractC5446j.a(1, new M0(s0, viewGroup, imageView, findViewById));
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void a(double d) {
    }

    public void c(ViewGroup viewGroup) {
        sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.d);
        int i = a2.f12567a;
        int i2 = a2.b;
        int c = AbstractC4963u.c(viewGroup.getContext());
        int i3 = (int) (((c * 1.0f) * i2) / i);
        sg.bigo.ads.U.r rVar = new sg.bigo.ads.U.r(c, i3);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = i3 - AbstractC4963u.a(viewGroup.getContext(), 25);
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.C.getLayoutParams();
        layoutParams2.height = i3;
        this.C.setLayoutParams(layoutParams2);
        a(viewGroup, rVar);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n, sg.bigo.ads.h.F1
    public final void e() {
        this.B = true;
        View findViewById = this.u.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final MediaView k() {
        return this.C;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final ViewGroup m() {
        return this.C;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final Button n() {
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void q() {
        ViewGroup viewGroup = this.u;
        if (viewGroup != null) {
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
            this.C = mediaView;
            mediaView.setImageBlurBorder(false);
            c(this.u);
            TextView textView = (TextView) this.u.findViewById(R.id.tv_desc_below);
            if (textView != null) {
                sg.bigo.ads.P.b popPage = this.d.getPopPage();
                String str = popPage != null ? ((sg.bigo.ads.U0.m) popPage).c : "";
                if (TextUtils.isEmpty(str)) {
                    str = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).c();
                }
                if (TextUtils.isEmpty(str)) {
                    ViewGroup viewGroup2 = this.u;
                    str = AbstractC4944a.a(viewGroup2 != null ? viewGroup2.getContext() : this.d.k.e, R.string.bigo_ad_description_default, new Object[0]);
                }
                textView.setText(str);
                textView.setTag(6);
                sg.bigo.ads.C.f.a(this.u, textView, 8, this.d, 0);
            }
            TextView textView2 = (TextView) this.u.findViewById(R.id.tv_gp_info_extra_about);
            if (textView2 != null) {
                textView2.setTag(27);
                sg.bigo.ads.C.f.a(this.u, textView2, 8, this.d, 0);
            }
            ImageView imageView = (ImageView) this.u.findViewById(R.id.iv_gp_info_extra_arrow);
            if (imageView != null) {
                imageView.setTag(27);
                sg.bigo.ads.C.f.a(this.u, imageView, 8, this.d, 0);
            }
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void u() {
        String[] strArr;
        int i;
        int i2;
        S0 s0 = this;
        int h = h();
        if (h == 1) {
            s0.a(-1);
        } else {
            s0.a(ViewCompat.MEASURED_STATE_MASK);
        }
        int i3 = 0;
        boolean z = h == 1;
        ViewGroup viewGroup = s0.u;
        if (viewGroup != null) {
            sg.bigo.ads.P.b popPage = s0.d.getPopPage();
            if (popPage == null || (strArr = ((sg.bigo.ads.U0.m) popPage).e) == null || strArr.length <= 0) {
                if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) s0.d.e())).z0 != null) {
                    sg.bigo.ads.U0.h[] hVarArr = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) s0.d.e())).z0;
                    String[] strArr2 = new String[hVarArr.length];
                    for (int i4 = 0; i4 < hVarArr.length; i4++) {
                        strArr2[i4] = hVarArr[i4].c;
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
            }
            boolean z2 = strArr == null || strArr.length == 0;
            if (strArr != null && 1 == strArr.length) {
                z2 = TextUtils.isEmpty(strArr[0]);
            }
            if (z2) {
                s0.a(new N0(s0, viewGroup, z));
            } else {
                s0.a(viewGroup, strArr, z);
            }
            ViewGroup viewGroup2 = s0.u;
            IconListView iconListView = (IconListView) viewGroup2.findViewById(R.id.download_msg_list);
            if (iconListView != null && s0.y != null) {
                iconListView.setThemeWhite(!z);
                iconListView.a(s0.y);
                sg.bigo.ads.C.f.a(viewGroup2, iconListView, 8, s0.d, 0);
            }
            ViewGroup viewGroup3 = s0.u;
            int i5 = z ? -16777216 : -1;
            int a2 = z ? sg.bigo.ads.K0.I.a(ViewCompat.MEASURED_STATE_MASK, "#B3000000") : sg.bigo.ads.K0.I.a(-1, "#B3FFFFFF");
            ((TextView) viewGroup3.findViewById(R.id.inter_title)).setTextColor(i5);
            ((TextView) viewGroup3.findViewById(R.id.tv_gp_info_extra_about)).setTextColor(i5);
            ((TextView) viewGroup3.findViewById(R.id.inter_description)).setTextColor(a2);
            ((TextView) viewGroup3.findViewById(R.id.tv_desc_below)).setTextColor(a2);
            View findViewById = s0.u.findViewById(R.id.bigo_ad_mask_vertical);
            GradientDrawable gradientDrawable = (GradientDrawable) findViewById.getBackground();
            int[] iArr = new int[2];
            if (z) {
                iArr[0] = 16777215;
                iArr[1] = -1;
            } else {
                iArr[0] = 2105636;
                iArr[1] = -16777216;
            }
            gradientDrawable.setColors(iArr);
            findViewById.setBackground(gradientDrawable);
            RoundedImageView roundedImageView = (RoundedImageView) s0.u.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(AbstractC4963u.a(r6.getContext(), 6));
            }
            if (s0.z != null) {
                int i6 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) s0.d.e())).p == null ? 0 : ((sg.bigo.ads.U0.b) ((InterfaceC5087a) s0.d.e())).p.f;
                if (i6 > 0) {
                    float f = i6 * 0.01f;
                    if (f > 0.15f) {
                        f = 0.15f;
                    }
                    int round = Math.round(s0.z.getContext().getResources().getDisplayMetrics().heightPixels * f);
                    ViewGroup.LayoutParams layoutParams = s0.z.getLayoutParams();
                    layoutParams.height = round;
                    s0.z.setLayoutParams(layoutParams);
                } else {
                    s0.z.setVisibility(8);
                }
                s0.z.setTextColor(z ? sg.bigo.ads.K0.I.a(ViewCompat.MEASURED_STATE_MASK, "#4D202124") : sg.bigo.ads.K0.I.a(-1, "#4DFFFFFF"));
            }
            Button button = (Button) s0.u.findViewById(R.id.inter_btn_cta);
            ViewGroup viewGroup4 = (ViewGroup) s0.u.findViewById(R.id.inter_btn_cta_layout);
            if (button != null && viewGroup4 != null) {
                ViewGroup viewGroup5 = s0.u;
                C5389m i7 = i();
                sg.bigo.ads.h.T.a(button, i7.f13179a, null);
                if (o()) {
                    AbstractC5140Q.a((View) viewGroup4);
                }
                TextView textView = (TextView) viewGroup5.findViewById(R.id.inter_company);
                if (textView != null) {
                    textView.setTextColor(i7.f13179a);
                }
            }
            sg.bigo.ads.P.b popPage2 = s0.d.getPopPage();
            if (popPage2 != null) {
                sg.bigo.ads.U0.m mVar = (sg.bigo.ads.U0.m) popPage2;
                if (mVar.d != null) {
                    ViewGroup viewGroup6 = s0.u;
                    AutoNextLineLinearLayout autoNextLineLinearLayout = (AutoNextLineLinearLayout) viewGroup6.findViewById(R.id.fbl_genre);
                    String[] strArr3 = mVar.d;
                    try {
                        Context context = viewGroup6.getContext();
                        int a3 = AbstractC4963u.a(context, 1);
                        int a4 = AbstractC4963u.a(context, 5);
                        int a5 = AbstractC4963u.a(context, 12);
                        int a6 = AbstractC4963u.a(context, 14);
                        int a7 = AbstractC4963u.a(context, 28);
                        int a8 = z ? sg.bigo.ads.K0.I.a(ViewCompat.MEASURED_STATE_MASK, "#B3000000") : sg.bigo.ads.K0.I.a(-1, "#B3FFFFFF");
                        int a9 = z ? sg.bigo.ads.K0.I.a(ViewCompat.MEASURED_STATE_MASK, "#26202124") : sg.bigo.ads.K0.I.a(-1, "#26FFFFFF");
                        int i8 = 0;
                        while (i8 < strArr3.length) {
                            String str = strArr3[i8];
                            if (TextUtils.isEmpty(str)) {
                                i = a9;
                                i2 = i3;
                            } else {
                                TextView textView2 = new TextView(context);
                                textView2.setText(str);
                                textView2.setTextColor(a8);
                                textView2.setTextSize(13.0f);
                                textView2.setPadding(a5, a4, a5, a4);
                                textView2.setGravity(17);
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setShape(i3);
                                gradientDrawable2.setStroke(a3, a9);
                                gradientDrawable2.setCornerRadius(a6);
                                textView2.setBackground(gradientDrawable2);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, a7);
                                layoutParams2.topMargin = a5;
                                layoutParams2.rightMargin = a5;
                                textView2.setTag(27);
                                i = a9;
                                i2 = 0;
                                sg.bigo.ads.C.f.a(viewGroup6, textView2, 8, s0.d, 0);
                                autoNextLineLinearLayout.addView(textView2, layoutParams2);
                            }
                            i8++;
                            s0 = this;
                            i3 = i2;
                            a9 = i;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public int w() {
        return -1;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(ViewGroup viewGroup, View view, int i, int i2, int i3, View... viewArr) {
        super.a(viewGroup, view, i, i2, i3, viewArr);
        MediaView mediaView = this.C;
        if (mediaView != null) {
            sg.bigo.ads.N.g gVar = (sg.bigo.ads.N.g) mediaView.getViewImpl();
            K0 k0 = new K0(this);
            sg.bigo.ads.r1.q qVar = ((sg.bigo.ads.d1.s) gVar).b;
            if (qVar instanceof sg.bigo.ads.r1.n) {
                ((sg.bigo.ads.r1.n) qVar).setIVideoPlayerViewListener(k0);
            }
        }
        Q1 q1 = this.w;
        boolean z = false;
        int i4 = q1 != null ? q1.i : 0;
        View findViewById = viewGroup.findViewById(R.id.inter_media_container);
        sg.bigo.ads.C.f.a(findViewById, 9);
        Q1 q12 = this.w;
        if (q12 == null || !q12.g) {
            MediaView mediaView2 = this.C;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(false);
            }
            if (findViewById != null) {
                sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, AbstractC5144a1.p, 0);
            }
        } else {
            MediaView mediaView3 = this.C;
            if (mediaView3 != null) {
                mediaView3.setOtherClickAreaClick(true);
            }
            if (findViewById != null) {
                sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, this.d, i4);
            }
        }
        Q1 q13 = this.w;
        if (q13 != null && q13.f) {
            z = true;
        }
        MediaView mediaView4 = this.C;
        if (mediaView4 != null) {
            sg.bigo.ads.C.f.a(viewGroup, mediaView4, 8, this.d, i4);
            this.C.setMediaAreaClickable(z);
            ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) this.C.getViewImpl())).a(!z);
        }
    }

    public final RoundedFrameLayout a(ViewGroup viewGroup, Context context, String str, Bitmap bitmap, int i, boolean z, boolean z2) {
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 4));
        roundedFrameLayout.setStrokeWidth(AbstractC4963u.a(context, 1));
        roundedFrameLayout.setStrokeColor(sg.bigo.ads.K0.I.a(-7829368, "#08000000"));
        AdImageView adImageView = new AdImageView(context);
        int a2 = AbstractC4963u.a(context, 200);
        adImageView.setBlurBorder(false);
        if (bitmap == null) {
            adImageView.setBackgroundColor(sg.bigo.ads.K0.I.a(-7829368, "#FFE1E1E6"));
            adImageView.setImageDrawable(AbstractC4944a.c(context, R.drawable.bigo_ad_icon_default_only_icon));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, a2);
            layoutParams.width = a2;
            layoutParams.height = a2;
            roundedFrameLayout.setLayoutParams(layoutParams);
            adImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, a2));
            adImageView.c.a(new Q0(this, adImageView, viewGroup, a2, z, roundedFrameLayout));
            adImageView.a(str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).T);
        } else {
            int a3 = AbstractC4963u.a(viewGroup.getContext(), 20);
            int width = (int) (((a2 * 1.0f) * bitmap.getWidth()) / bitmap.getHeight());
            sg.bigo.ads.U.r rVar = new sg.bigo.ads.U.r(width, a2);
            if (z && width < AbstractC4963u.c(viewGroup.getContext()) - a3) {
                int i2 = a2 - a3;
                rVar = new sg.bigo.ads.U.r((int) (((i2 * 1.0f) * bitmap.getWidth()) / bitmap.getHeight()), i2);
            }
            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(rVar.getWidth(), rVar.getHeight()));
            adImageView.setImageBitmap(bitmap);
            if (z) {
                a(viewGroup, bitmap, rVar, a2);
            }
        }
        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        roundedFrameLayout.addView(adImageView);
        if (i != 1 && i != 2) {
            sg.bigo.ads.C.f.a(viewGroup, roundedFrameLayout, 8, this.d, i);
        }
        if (z2 && !z) {
            sg.bigo.ads.Z.c.a((View) roundedFrameLayout, 10);
            roundedFrameLayout.setBackgroundColor(-1);
        }
        return roundedFrameLayout;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(View view) {
        View findViewById;
        if (this.e == null || (findViewById = view.findViewById(R.id.inter_ad_tag_layout)) == null) {
            return;
        }
        this.e.a(findViewById, 0);
    }

    public final void a(ViewGroup viewGroup, String[] strArr, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context;
        int i6;
        FrameLayout.LayoutParams layoutParams;
        Q1 q1;
        Q1 q12;
        Integer a2;
        sg.bigo.ads.T0.q qVar = this.x;
        int intValue = (qVar == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.click_type"))) == null) ? 0 : a2.intValue();
        ScrollView scrollView = (ScrollView) viewGroup.findViewById(R.id.native_view);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewGroup.findViewById(R.id.bigo_ad_scroll_images);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        Context context2 = viewGroup.getContext();
        boolean z2 = strArr == null || strArr.length == 0 || strArr.length == 1;
        int i7 = 8;
        int i8 = -2;
        if (z2) {
            linearLayout.addView(a(viewGroup, context2, (strArr == null || 1 != strArr.length) ? "" : strArr[0], this.j, intValue, true, z));
            i = -2;
            i2 = 8;
        } else {
            int a3 = AbstractC4963u.a(context2, 20);
            int a4 = AbstractC4963u.a(context2, 12);
            int i9 = 0;
            while (i9 < strArr.length) {
                String str = strArr[i9];
                if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                    i3 = i9;
                    i4 = a3;
                    i5 = i8;
                    context = context2;
                    i6 = i7;
                } else {
                    i3 = i9;
                    int i10 = a3;
                    context = context2;
                    i6 = i7;
                    RoundedFrameLayout a5 = a(viewGroup, context2, str, (Bitmap) null, intValue, false, z);
                    i5 = -2;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.leftMargin = i3 == 0 ? i10 : a4;
                    if (i3 + 1 == strArr.length) {
                        i4 = i10;
                        layoutParams2.rightMargin = i4;
                    } else {
                        i4 = i10;
                    }
                    linearLayout.addView(a5, layoutParams2);
                    if (intValue == 2) {
                        sg.bigo.ads.C.f.a(viewGroup, a5, i6, this.d, intValue);
                    }
                }
                i9 = i3 + 1;
                i8 = i5;
                a3 = i4;
                i7 = i6;
                context2 = context;
            }
            i = i8;
            i2 = i7;
        }
        if (z2) {
            layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
        } else {
            layoutParams = new FrameLayout.LayoutParams(i, AbstractC4963u.a(viewGroup.getContext(), 202));
        }
        horizontalScrollView.addView(linearLayout, layoutParams);
        if (intValue == 3) {
            if (z2 && (q1 = this.w) != null && q1.f) {
                horizontalScrollView.setTag(9);
                sg.bigo.ads.C.f.a(viewGroup, horizontalScrollView, i2, this.d, intValue);
                return;
            }
            return;
        }
        if (z2 && (q12 = this.w) != null && q12.f) {
            horizontalScrollView.setTag(9);
            sg.bigo.ads.C.f.a(viewGroup, horizontalScrollView, i2, this.d, intValue);
        } else {
            horizontalScrollView.setOnTouchListener(new R0(this, horizontalScrollView, 5, intValue));
        }
        if (scrollView != null) {
            scrollView.setOnTouchListener(new R0(this, scrollView, 10, intValue));
        }
    }

    public final void a(ViewGroup viewGroup, Bitmap bitmap, sg.bigo.ads.U.r rVar, int i) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.fl_multi_container);
        if (frameLayout != null) {
            int c = AbstractC4963u.c(viewGroup.getContext());
            int a2 = AbstractC4963u.a(viewGroup.getContext(), 20);
            int i2 = c - (a2 * 2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.leftMargin = a2;
            marginLayoutParams.rightMargin = a2;
            frameLayout.setLayoutParams(marginLayoutParams);
            if (rVar.getWidth() < i2) {
                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_blur_bg);
                View findViewById = viewGroup.findViewById(R.id.iv_blur_bg_mask);
                if (imageView == null || bitmap == null) {
                    return;
                }
                AbstractC5446j.a(1, null, new P0(this, viewGroup, bitmap, imageView, i2, i, findViewById), 0L);
            }
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void a(int i) {
        ViewGroup viewGroup = this.u;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i);
        }
    }

    public void a(ViewGroup viewGroup, sg.bigo.ads.U.r rVar) {
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = rVar.b;
        findViewById.setLayoutParams(layoutParams);
    }
}
