package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.P1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.M.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5002t implements F {
    public static Bitmap p;

    /* renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.K0.E f12454a;
    public final String b;
    public final sg.bigo.ads.T0.q c;
    public final sg.bigo.ads.T0.q d;
    public sg.bigo.ads.K0.E f;
    public sg.bigo.ads.K0.E g;
    public r h;
    public final sg.bigo.ads.L.N j;
    public View k;
    public final sg.bigo.ads.P.j o;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public int l = 1;
    public int m = 0;
    public final ArrayList n = new ArrayList();

    public C5002t(sg.bigo.ads.P.j jVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.T0.q qVar2, sg.bigo.ads.L.N n) {
        this.j = n;
        this.c = qVar;
        this.d = qVar2;
        this.o = jVar;
        this.b = ((sg.bigo.ads.U0.b) jVar.f12482a).L;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public void a(boolean z) {
        if (!z) {
            sg.bigo.ads.K0.E e = this.f;
            if (e != null) {
                e.d();
            }
            sg.bigo.ads.K0.E e2 = this.g;
            if (e2 != null) {
                e2.d();
                return;
            }
            return;
        }
        sg.bigo.ads.K0.E e3 = this.f;
        if (e3 != null && e3.b()) {
            this.f.e();
        }
        sg.bigo.ads.K0.E e4 = this.g;
        if (e4 == null || !e4.b()) {
            return;
        }
        this.g.e();
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final int b() {
        return this.l;
    }

    @Override // sg.bigo.ads.M.F
    public final AtomicBoolean c() {
        return this.i;
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public void d() {
        g();
        p = null;
    }

    public int e() {
        sg.bigo.ads.T0.q qVar = this.d;
        if (qVar == null) {
            return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen;
        }
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
            if (2 == (a2 != null ? a2.intValue() : 1)) {
                return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen_immersive;
            }
        }
        return sg.bigo.ads.L.r.a(this.c) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen;
    }

    public final void f() {
        this.m = 2;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((P1) it.next()).a();
            it.remove();
        }
    }

    public final void g() {
        this.l = 4;
        sg.bigo.ads.K0.E e = this.f12454a;
        if (e != null) {
            e.a();
        }
        sg.bigo.ads.K0.E e2 = this.g;
        if (e2 != null) {
            e2.a();
        }
        sg.bigo.ads.K0.E e3 = this.f;
        if (e3 != null) {
            e3.a();
            this.f = null;
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    public final void h() {
        sg.bigo.ads.K0.E e = this.f;
        if (e != null) {
            e.a();
            this.f = null;
        }
        int i = 5;
        if (this.i.get() && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.j.U.e())).V0 == null) {
            sg.bigo.ads.T0.q qVar = this.d;
            if (qVar != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.time_for_auto_click"));
                int intValue = a2 != null ? a2.intValue() : -1;
                if (intValue == 0) {
                    i = 1;
                } else if (intValue == 1) {
                    i = 3;
                } else if (intValue != 2) {
                    i = intValue != 3 ? 0 : 10;
                }
                if (i > 0) {
                    C4999p c4999p = new C4999p(this, i * 1000, i);
                    this.f = c4999p;
                    c4999p.e();
                }
            }
            sg.bigo.ads.T0.q qVar2 = this.d;
            if (qVar2 == null) {
                return;
            }
            Integer a3 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.time_for_show_backup"));
            int a4 = Q1.a(a3 != null ? a3.intValue() : -1);
            if (a4 > 0) {
                C4990g c4990g = new C4990g(this, a4 * 1000);
                this.g = c4990g;
                c4990g.e();
                return;
            }
            return;
        }
        sg.bigo.ads.T0.q qVar3 = this.d;
        if (qVar3 == null) {
            return;
        }
        Integer a5 = sg.bigo.ads.K0.z.a(qVar3.a("video_play_page.auto_click"));
        int intValue2 = a5 != null ? a5.intValue() : 0;
        if (intValue2 < 2 || intValue2 > 7) {
            return;
        }
        if (intValue2 <= 5) {
            r6 = intValue2;
        } else if (intValue2 == 7) {
            Integer a6 = sg.bigo.ads.K0.z.a(this.c.a("splash_duration"));
            int max = Math.max(0, a6 != null ? a6.intValue() : 0);
            if (max > 0 && this.f12454a != null) {
                r6 = max - 1;
            }
        }
        if (r6 >= 0) {
            C5000q c5000q = new C5000q(this, r6 * 1000, r6);
            this.f = c5000q;
            c5000q.e();
        } else if (intValue2 == 6) {
            this.h = new r(this);
        }
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void onAdClicked() {
        sg.bigo.ads.K0.E e = this.f;
        if (e != null) {
            e.a();
            this.f = null;
        }
        if (this.h != null) {
            this.h = null;
        }
        this.e.set(true);
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public final void onAdImpression() {
        VideoController videoController;
        if (this.l == 2 && (videoController = this.j.U.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new C4993j(this));
            videoController.setBackupLoadCallback(new C4994k(this));
        }
        h();
        sg.bigo.ads.P.j jVar = this.j.Z;
        AbstractC5446j.a(3, null, new RunnableC5001s(jVar == null ? "" : jVar.b.l), 0L);
    }

    @Override // sg.bigo.ads.M.F
    public final void a(P1 p1) {
        if (p1 == null) {
            return;
        }
        if (p != null) {
            p1.a();
            return;
        }
        this.n.add(p1);
        if (this.m == 1) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.j.U.e());
        if (!kVar.p()) {
            String e = kVar.e();
            if (sg.bigo.ads.K0.I.a((CharSequence) e)) {
                f();
                return;
            } else {
                this.m = 1;
                sg.bigo.ads.s0.x.a(this.j.k.e, null, e, kVar.T, new C4992i(this));
                return;
            }
        }
        String a2 = sg.bigo.ads.U.q.a(kVar.j(), this.j.k.e);
        if (sg.bigo.ads.K0.I.a((CharSequence) a2)) {
            f();
        } else {
            this.m = 1;
            AbstractC5446j.a(3, null, new RunnableC4991h(this, Uri.parse(a2).getPath()), 0L);
        }
    }

    @Override // sg.bigo.ads.M.F
    public final void a() {
        r rVar = this.h;
        if (rVar != null) {
            rVar.run();
            this.h = null;
        }
    }

    public void a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        boolean z = this instanceof x;
        if (viewGroup2 != null) {
            if (z) {
                viewGroup2.setVisibility(8);
            } else {
                sg.bigo.ads.L.r.b(viewGroup2, i);
            }
        }
    }

    @Override // sg.bigo.ads.M.InterfaceC5003u
    public void a(boolean z, ViewGroup viewGroup, int i) {
        int i2;
        sg.bigo.ads.C.l lVar;
        int i3;
        String g;
        int i4;
        if (!z) {
            View view = this.k;
            if (view != null) {
                this.l = 3;
                view.setVisibility(8);
                g();
                return;
            }
            return;
        }
        View view2 = this.k;
        if (view2 == null) {
            this.l = 2;
            sg.bigo.ads.P.c cVar = (InterfaceC5087a) this.j.U.e();
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
            if (bVar.k == 2 && !((sg.bigo.ads.U0.k) cVar).W0) {
                this.i.set(true);
            }
            this.k = AbstractC4944a.a(viewGroup.getContext(), e(), null, false);
            viewGroup.addView(this.k, 1, new ViewGroup.LayoutParams(-1, -1));
            viewGroup.setTag(11);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (mediaView != null) {
                mediaView.setImageBlurBorder(false);
            }
            AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
            sg.bigo.ads.C.l lVar2 = this.j.U;
            ArrayList arrayList = new ArrayList();
            boolean a2 = sg.bigo.ads.L.r.a(this.c);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
            if (imageView != null) {
                imageView.setTag(1);
                if (a2) {
                    sg.bigo.ads.N.d dVar = this.o.c;
                    if ((dVar instanceof SplashAdRequest) && (i4 = ((SplashAdRequest) dVar).i) != 0) {
                        imageView.setImageResource(i4);
                    }
                } else {
                    sg.bigo.ads.U0.h hVar = ((sg.bigo.ads.U0.k) cVar).y0;
                    String str = hVar != null ? hVar.c : null;
                    if (!sg.bigo.ads.K0.I.a((CharSequence) str) && URLUtil.isNetworkUrl(str)) {
                        sg.bigo.ads.s0.u.f13300a.a(this.j.k.e, null, str, bVar.T, new C4995l(this, imageView, lVar2));
                    } else {
                        sg.bigo.ads.L.r.a(lVar2, new C4998o(imageView));
                    }
                }
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                textView.setTag(2);
                if (a2) {
                    sg.bigo.ads.N.d dVar2 = this.o.c;
                    g = dVar2 instanceof SplashAdRequest ? ((SplashAdRequest) dVar2).j : null;
                } else {
                    g = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar2.e())).g();
                }
                if (!TextUtils.isEmpty(g)) {
                    textView.setText(g);
                }
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
            if (sg.bigo.ads.K0.I.a((CharSequence) this.b)) {
                textView2.setVisibility(8);
            } else {
                textView3.setText(R.string.bigo_ad_tag);
                textView2.setText(this.b);
                textView2.setPadding(AbstractC4963u.a(textView2.getContext(), 4), AbstractC4963u.a(textView2.getContext(), 1), AbstractC4963u.a(textView2.getContext(), 4), AbstractC4963u.a(textView2.getContext(), 1));
            }
            Button button = (Button) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (button != null) {
                button.setTag(7);
                if (!TextUtils.isEmpty(lVar2.getCallToAction())) {
                    button.setText(lVar2.getCallToAction());
                }
                arrayList.add(button);
                if (sg.bigo.ads.L.r.b()) {
                    button.getLayoutParams().width = AbstractC4963u.a(button.getContext(), 333);
                }
                Drawable background = button.getBackground();
                sg.bigo.ads.T0.q qVar = this.d;
                if (qVar != null && (background instanceof GradientDrawable)) {
                    Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.cta_color"));
                    ((GradientDrawable) background).setColor(AbstractC5164f1.a(lVar2, a3 != null ? a3.intValue() : 0, null));
                }
            }
            TextView textView4 = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_description);
            if (textView4 != null) {
                textView4.setTag(6);
                String c = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar2.e())).c();
                if (!TextUtils.isEmpty(c)) {
                    textView4.setText(c);
                }
                arrayList.add(textView4);
            }
            TextView textView5 = (TextView) viewGroup.findViewById(R.id.inter_warning);
            if (textView5 != null) {
                textView5.setTag(8);
                String warning = lVar2.getWarning();
                if (!TextUtils.isEmpty(warning)) {
                    textView5.setText(warning);
                }
                arrayList.add(textView5);
            }
            ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.splash_rating_star);
            if (imageView2 != null) {
                String creativeId = lVar2.getCreativeId();
                if (creativeId == null) {
                    creativeId = "";
                }
                Bitmap a4 = AbstractC4962t.a(imageView2.getContext(), (sg.bigo.ads.C.x.a(4, creativeId) * 0.5f) + 3.5f, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half, false);
                if (a4 != null) {
                    imageView2.setTag(26);
                    imageView2.setImageBitmap(a4);
                }
            }
            lVar2.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
            if (mediaView != null) {
                if (sg.bigo.ads.L.r.b()) {
                    mediaView.getLayoutParams().width = -2;
                    i2 = -1;
                    mediaView.getLayoutParams().height = -1;
                } else {
                    i2 = -1;
                }
                if (lVar2.getCreativeType() == NativeAd.CreativeType.VIDEO) {
                    ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
                }
            } else {
                i2 = -1;
            }
            if (this.d != null) {
                C4996m c4996m = new C4996m();
                View findViewById = viewGroup.findViewById(R.id.layout_contain_view);
                Integer a5 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.click_type"));
                int intValue = a5 != null ? a5.intValue() : 0;
                if (mediaView != null) {
                    Integer a6 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.media_view_clickable_switch"));
                    if ((a6 != null ? a6.intValue() : 0) == 1) {
                        sg.bigo.ads.C.f.a(viewGroup, mediaView, 8, lVar2, intValue);
                    } else {
                        sg.bigo.ads.C.f.a(viewGroup, mediaView, 8, c4996m, intValue);
                    }
                    if (findViewById != null) {
                        findViewById.setTag(9);
                    }
                    Integer a7 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.other_space_clickable_switch"));
                    if ((a7 != null ? a7.intValue() : 0) == 1) {
                        mediaView.setOtherClickAreaClick(true);
                        sg.bigo.ads.C.f.a(viewGroup, viewGroup, 8, lVar2, intValue);
                        if (findViewById != null) {
                            sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, lVar2, intValue);
                        }
                    } else {
                        mediaView.setOtherClickAreaClick(false);
                        sg.bigo.ads.C.f.a(viewGroup, viewGroup, 8, c4996m, intValue);
                        if (findViewById != null) {
                            sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, c4996m, intValue);
                        }
                    }
                }
                if (button != null) {
                    sg.bigo.ads.C.f.a(viewGroup, button, 8, lVar2, intValue);
                }
                if (imageView != null) {
                    if (a2) {
                        sg.bigo.ads.C.f.a(viewGroup, imageView, 8, c4996m, intValue);
                    } else {
                        sg.bigo.ads.C.f.a(viewGroup, imageView, 8, lVar2, intValue);
                    }
                }
                if (textView != null) {
                    if (a2) {
                        sg.bigo.ads.C.f.a(viewGroup, textView, 8, c4996m, intValue);
                    } else {
                        sg.bigo.ads.C.f.a(viewGroup, textView, 8, lVar2, intValue);
                    }
                }
                View findViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
                if (findViewById2 != null) {
                    sg.bigo.ads.C.f.a(viewGroup, findViewById2, 8, c4996m, intValue);
                }
                View findViewById3 = viewGroup.findViewById(R.id.layout_ad_component);
                if (findViewById3 != null) {
                    findViewById3.setTag(18);
                    Integer a8 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.ad_component_clickable_switch"));
                    if ((a8 != null ? a8.intValue() : 0) == 1) {
                        sg.bigo.ads.C.f.a(viewGroup, findViewById3, 8, lVar2, intValue);
                    } else {
                        sg.bigo.ads.C.f.a(viewGroup, findViewById3, 8, c4996m, intValue);
                    }
                }
                if (findViewById != null) {
                    Integer a9 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.below_area_dp"));
                    int intValue2 = a9 != null ? a9.intValue() : 0;
                    Integer a10 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.below_area_clickable"));
                    boolean z2 = (a10 != null ? a10.intValue() : 0) == 1;
                    Integer a11 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.up_area_dp"));
                    int intValue3 = a11 != null ? a11.intValue() : 0;
                    Integer a12 = sg.bigo.ads.K0.z.a(this.d.a("video_play_page.up_area_clickable"));
                    lVar = lVar2;
                    i3 = i2;
                    sg.bigo.ads.L.r.a(viewGroup, findViewById, intValue2, z2, intValue3, (a12 != null ? a12.intValue() : 0) == 1, 8, intValue, lVar);
                } else {
                    lVar = lVar2;
                    i3 = i2;
                }
            } else {
                lVar = lVar2;
                i3 = i2;
                Integer a13 = sg.bigo.ads.K0.z.a(this.c.a("splash_clickable_area"));
                int intValue4 = a13 != null ? a13.intValue() : 0;
                if (intValue4 == 1) {
                    sg.bigo.ads.C.f.a(viewGroup, viewGroup, 1, lVar, 0);
                } else if (intValue4 == 2 && mediaView != null) {
                    mediaView.setOnTouchListener(null);
                }
            }
            Integer a14 = sg.bigo.ads.K0.z.a(this.c.a("splash_cta_type"));
            int intValue5 = a14 != null ? a14.intValue() : 0;
            sg.bigo.ads.T0.q qVar2 = this.d;
            if (qVar2 != null) {
                Integer a15 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.is_cta_show_animation"));
                int intValue6 = a15 != null ? a15.intValue() : 0;
                if (intValue6 < 1 || intValue6 > 6) {
                    intValue6 = 1;
                }
                intValue5 = intValue6 + i3;
            }
            if (intValue5 == 5 && button != null) {
                button.setTextSize(2, 15.0f);
                button.setBackground(null);
                View findViewById4 = viewGroup.findViewById(R.id.splash_footer_bg);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                    findViewById4.setTag(14);
                    if (this.d != null) {
                        sg.bigo.ads.C.f.a(viewGroup, findViewById4, 8, lVar, 0);
                    } else {
                        sg.bigo.ads.C.f.a(viewGroup, findViewById4, 1, lVar, 0);
                    }
                }
            }
            a(viewGroup, intValue5);
            return;
        }
        this.l = 2;
        view2.setVisibility(0);
    }
}
