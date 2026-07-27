package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public class F1 extends W {
    public volatile sg.bigo.ads.C.l d;
    public C5085c e;
    public ImageView g;
    public ImageView h;
    public Bitmap j;
    public Bitmap n;
    public int i = 0;
    public final ArrayList k = new ArrayList();
    public boolean l = false;
    public boolean m = false;
    public int o = 0;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final T f = new T();

    public F1(sg.bigo.ads.C.l lVar) {
        this.d = lVar;
    }

    public void a(ViewGroup viewGroup) {
        AbstractC4962t.a(viewGroup.getContext(), this.j, new C5200q1(this, viewGroup));
    }

    public void b(ViewGroup viewGroup) {
        this.m = true;
        a(new C5197p1(this, viewGroup));
    }

    public final synchronized void c() {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e());
        if (kVar.p()) {
            Bitmap bitmap = this.n;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.p.compareAndSet(false, true)) {
                    String e = kVar.e();
                    if (sg.bigo.ads.K0.I.a((CharSequence) e)) {
                        return;
                    }
                    sg.bigo.ads.s0.x.a(this.d.k.e, null, e, kVar.T, new C5206s1(this));
                }
            }
        }
    }

    public T d() {
        return this.f;
    }

    public void e() {
    }

    public final void f() {
        if (this.j == null) {
            ImageView imageView = this.g;
            if (imageView != null && this.l) {
                this.l = true;
                a(new C5194o1(this, imageView));
            }
            if (this.h == null || !this.m) {
                return;
            }
            a(new C5227z1(this));
        }
    }

    public static void b(View view) {
        AdOptionsView adOptionsView;
        if (view == null || (adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setVisibility(adOptionsView.findViewWithTag("ad_options_real_view") == null ? 8 : 0);
    }

    public void a(ViewGroup viewGroup, View view, int i, int i2, int i3, View... viewArr) {
        a(viewGroup, view, null, i, i2, i3, viewArr);
        sg.bigo.ads.K0.X.a(view, new C5209t1(this));
    }

    public void a(ViewGroup viewGroup, View view, E1 e1, int i, int i2, int i3, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        sg.bigo.ads.P.b popPage = this.d.getPopPage();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(e1, textView, ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).g(), popPage == null ? "" : ((sg.bigo.ads.U0.m) popPage).b);
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(e1, textView2, ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).c(), popPage == null ? "" : ((sg.bigo.ads.U0.m) popPage).c);
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_warning);
        if (textView3 != null) {
            textView3.setTag(8);
            String warning = this.d.getWarning();
            if (TextUtils.isEmpty(warning)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(warning);
            }
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView4 != null) {
            textView4.setTag(7);
            a(e1, textView4, this.d.getCallToAction(), "");
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.inter_btn_cta_main);
        if (textView5 != null) {
            textView5.setTag(7);
            a(e1, textView5, AbstractC4944a.a(textView5.getContext(), R.string.bigo_ad_cta_default, new Object[0]), "");
            arrayList.add(textView5);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.inter_end_page_image);
        if (imageView != null) {
            imageView.setTag(5);
            C5215v1 c5215v1 = new C5215v1(imageView);
            Bitmap bitmap = this.n;
            if (bitmap != null) {
                c5215v1.onReceiveValue(bitmap);
            } else {
                a(new C5218w1(this, c5215v1));
            }
        }
        TextView textView6 = (TextView) view.findViewById(R.id.inter_company);
        if (textView6 != null) {
            textView6.setTag(26);
            if (popPage != null) {
                sg.bigo.ads.U0.m mVar = (sg.bigo.ads.U0.m) popPage;
                if (!sg.bigo.ads.K0.I.a((CharSequence) mVar.f)) {
                    a(e1, textView6, mVar.f, "");
                    arrayList.add(textView6);
                }
            }
            textView6.setVisibility(8);
            arrayList.add(textView6);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.inter_star_num);
        View findViewById = view.findViewById(R.id.inter_star_layout);
        if (textView7 != null && findViewById != null) {
            findViewById.setTag(26);
            textView7.setText("4." + (sg.bigo.ads.C.x.a(7, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).U) + 3));
            arrayList.add(findViewById);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.inter_commit_num);
        if (textView8 != null) {
            textView8.setTag(26);
            textView8.setText(((sg.bigo.ads.C.x.a(901, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).U) + 100) + "K") + ServerSentEventKt.SPACE + AbstractC4944a.a(viewGroup.getContext(), R.string.bigo_ad_comment_num_text, new Object[0]));
            arrayList.add(textView8);
        }
        TextView textView9 = (TextView) view.findViewById(R.id.inter_download_num);
        View findViewById2 = view.findViewById(R.id.inter_download_num_layout);
        if (textView9 != null && findViewById2 != null) {
            findViewById2.setTag(26);
            textView9.setText((sg.bigo.ads.C.x.a(100, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).U) + 1) + "M+");
            arrayList.add(findViewById2);
        }
        View findViewById3 = view.findViewById(R.id.inter_everyone_layout);
        if (findViewById3 != null) {
            findViewById3.setTag(26);
            arrayList.add(findViewById3);
        }
        this.g = (ImageView) view.findViewById(R.id.inter_icon);
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        MediaView mediaView = (MediaView) view.findViewById(R.id.inter_media);
        this.d.f0 = i3;
        this.d.a(viewGroup, mediaView, this.g, adOptionsView, arrayList, i2, viewArr);
        if (this.g == null || this.d.hasIcon()) {
            return;
        }
        String str = popPage != null ? ((sg.bigo.ads.U0.m) popPage).f12576a : "";
        if (!sg.bigo.ads.K0.I.a((CharSequence) str) && URLUtil.isNetworkUrl(str)) {
            if (!sg.bigo.ads.O.g.f12472a.B.a(9) || !URLUtil.isHttpUrl(str)) {
                sg.bigo.ads.s0.u.f13300a.a(this.d.k.e, null, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).T, new C5221x1(this));
                return;
            } else {
                if (this.d == null || this.d.e() == null) {
                    return;
                }
                sg.bigo.ads.s1.b.a(3000, 10220, "Invalid http url: " + str, this.d.e());
                return;
            }
        }
        if (i == 2) {
            this.g.setImageDrawable(AbstractC4944a.c(this.g.getContext(), R.drawable.bigo_ad_icon_default));
            return;
        }
        if (i == 1) {
            ImageView imageView2 = this.g;
            this.l = true;
            a(new C5194o1(this, imageView2));
        } else if (i == 3) {
            this.g.setImageDrawable(AbstractC4944a.c(this.g.getContext(), R.drawable.bigo_ad_icon_novideo_default));
        }
    }

    public final synchronized void a(ValueCallback valueCallback) {
        a(new C1(this, valueCallback));
    }

    public final synchronized void a(P1 p1) {
        if (this.j != null) {
            p1.a();
            return;
        }
        this.k.add(p1);
        if (this.i == 1) {
            return;
        }
        this.i = 1;
        a(new B1(this));
    }

    public final synchronized void a(B1 b1) {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e());
        if (kVar.p()) {
            String a2 = sg.bigo.ads.U.q.a(kVar.j(), this.d.k.e);
            if (sg.bigo.ads.K0.I.a((CharSequence) a2)) {
                b1.onReceiveValue(null);
                return;
            }
            AbstractC5446j.a(3, null, new D1(this, Uri.parse(a2).getPath(), b1), 0L);
        } else {
            String e = kVar.e();
            if (sg.bigo.ads.K0.I.a((CharSequence) e)) {
                b1.onReceiveValue(null);
                return;
            }
            sg.bigo.ads.s0.x.a(this.d.k.e, null, e, kVar.T, new C5188m1(b1));
        }
    }

    public void a(View view) {
        if (this.e == null) {
            return;
        }
        this.e.a(view.findViewById(R.id.inter_options), 0);
        View findViewById = view.findViewById(R.id.inter_ad_label_layout);
        if (findViewById == null) {
            this.e.a(view.findViewById(R.id.inter_ad_label), 0);
            this.e.a(view.findViewById(R.id.inter_advertiser), 0);
            return;
        }
        this.e.a(findViewById, 0);
    }

    public static void a(E1 e1, TextView textView, String str, String str2) {
        Pair a2;
        if (e1 != null && (a2 = e1.a(textView, str, str2)) != null) {
            str = (String) a2.first;
            str2 = (String) a2.second;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }
}
