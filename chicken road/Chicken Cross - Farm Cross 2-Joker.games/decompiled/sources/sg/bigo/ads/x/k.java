package sg.bigo.ads.x;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.C.t;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.C5213v;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public class k extends AbstractC5204s implements InterfaceC5495a {
    public static int j0 = 340;
    public LinearLayout a0;
    public sg.bigo.ads.E.d b0;
    public int c0;
    public boolean d0;
    public final WeakHashMap e0;
    public View f0;
    public boolean g0;
    public AbstractC5204s h0;
    public final C5499c i0;

    public k(Activity activity) {
        super(activity);
        this.e0 = new WeakHashMap();
        this.i0 = new C5499c(this);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void E0() {
        Integer a2;
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || this.t == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
        v0();
        int i = 15;
        if (this.t != null && (this.c0 != this.e0.size() ? (a2 = z.a(this.t.a("multi_ads.force_staying_time"))) != null : (a2 = z.a(this.t.a("multi_ads_endpage.force_staying_time"))) != null)) {
            i = a2.intValue();
        }
        if (this.c0 != this.e0.size()) {
            this.g.a(i, this.i0);
            return;
        }
        AdCountDownButton adCountDownButton2 = this.g;
        C5499c c5499c = this.i0;
        C5213v c5213v = adCountDownButton2.b;
        if (c5213v != null) {
            c5213v.a();
            adCountDownButton2.b = null;
            adCountDownButton2.a(i, c5499c);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return R.layout.bigo_ad_activity_vertical_twins_owner;
    }

    public final void H0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            C5213v c5213v = adCountDownButton.b;
            if (c5213v != null) {
                c5213v.a();
            }
            this.g = null;
        }
        sg.bigo.ads.E.d dVar = this.b0;
        synchronized (dVar.n0) {
            Iterator it = dVar.o0.keySet().iterator();
            while (it.hasNext()) {
                Ad ad = (sg.bigo.ads.C.l) it.next();
                if ((ad instanceof sg.bigo.ads.Q.d) && !((sg.bigo.ads.Q.d) ad).b()) {
                    ad.destroy();
                    it.remove();
                }
            }
        }
        Iterator it2 = this.e0.keySet().iterator();
        while (it2.hasNext()) {
            ((AbstractC5144a1) it2.next()).w();
            it2.remove();
        }
    }

    public final int I0() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.getMillisUntilFinished() <= 0) {
            return 0;
        }
        return Math.round(this.g.getMillisUntilFinished() / 1000.0f);
    }

    public void J0() {
    }

    public final void K0() {
        sg.bigo.ads.E.d dVar = this.b0;
        if (dVar == null || this.f0 == null) {
            return;
        }
        Iterator it = dVar.o0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((sg.bigo.ads.E.c) ((Map.Entry) it.next()).getValue()).f12263a && (i = i + 1) == this.b0.o0.size()) {
                AbstractC5446j.a(3, new h(this));
                return;
            }
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean M() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    @Override // sg.bigo.ads.h.AbstractC5151c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        sg.bigo.ads.C.l lVar;
        sg.bigo.ads.C.l lVar2;
        sg.bigo.ads.C.l lVar3;
        sg.bigo.ads.C.l lVar4;
        BaseAdActivityImpl qVar;
        sg.bigo.ads.C.l D = ((C5185l1) this.e).D();
        if (!(D instanceof sg.bigo.ads.E.d)) {
            this.f12687a.finish();
            return;
        }
        this.b0 = (sg.bigo.ads.E.d) D;
        l(0);
        w0();
        H();
        this.a0 = (LinearLayout) this.f12687a.findViewById(R.id.bigo_ad_twins_sub_ad_container);
        this.f0 = this.f12687a.findViewById(R.id.bigo_ad_background_view);
        sg.bigo.ads.E.d dVar = this.b0;
        dVar.m0 = new C5500d(this);
        if (this.a0 == null) {
            this.f12687a.finish();
            return;
        }
        int i = dVar.u0;
        int a2 = AbstractC4963u.a(this.f12687a, 16);
        int a3 = AbstractC4963u.a(this.f12687a, 10);
        if (this.f12687a.getResources().getDisplayMetrics().heightPixels <= 2000) {
            j0 = 270;
        }
        int a4 = AbstractC4963u.a(this.f12687a, j0);
        for (int i2 = 0; i2 < i; i2++) {
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(this.f12687a);
            roundedFrameLayout.setCornerRadius(a2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a4);
            layoutParams.leftMargin = a3;
            layoutParams.rightMargin = a3;
            if (i2 % 2 == 0) {
                layoutParams.topMargin = a2;
            }
            roundedFrameLayout.setLayoutParams(layoutParams);
            this.a0.addView(roundedFrameLayout, 0);
            sg.bigo.ads.E.d dVar2 = this.b0;
            if (dVar2.q0.get() == dVar2.u0) {
                lVar3 = dVar2.c(i2);
            } else {
                Iterator it = dVar2.o0.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lVar = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    sg.bigo.ads.E.c cVar = (sg.bigo.ads.E.c) entry.getValue();
                    if (!cVar.f && cVar.f12263a) {
                        cVar.f = true;
                        lVar = (sg.bigo.ads.C.l) entry.getKey();
                        break;
                    }
                }
                if (lVar == null) {
                    for (Map.Entry entry2 : dVar2.o0.entrySet()) {
                        sg.bigo.ads.E.c cVar2 = (sg.bigo.ads.E.c) entry2.getValue();
                        if (!cVar2.f) {
                            cVar2.f = true;
                            lVar3 = (sg.bigo.ads.C.l) entry2.getKey();
                        }
                    }
                }
                lVar2 = lVar;
                ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar2.e())).b1.set(this.b0.c(lVar2));
                sg.bigo.ads.E.c cVar3 = (sg.bigo.ads.E.c) this.b0.o0.get(lVar2);
                boolean z = cVar3 == null ? cVar3.f12263a : false;
                if (lVar2 instanceof t) {
                    lVar4 = lVar2;
                    qVar = new q(this.f12687a, this, roundedFrameLayout, lVar4, i2, this.f0, z);
                } else {
                    lVar4 = lVar2;
                    qVar = new s(this.f12687a, this, roundedFrameLayout, lVar2, i2, this.f0, z);
                }
                this.e0.put(qVar, roundedFrameLayout);
                qVar.v();
                if (i2 != 0) {
                    sg.bigo.ads.P.c e = lVar4.e();
                    TextView textView = (TextView) this.f12687a.findViewById(R.id.inter_warning);
                    if (textView != null) {
                        textView.setTag(8);
                        if (TextUtils.isEmpty(lVar4.getWarning())) {
                            textView.setVisibility(8);
                        } else {
                            textView.setVisibility(0);
                            textView.setText(lVar4.getWarning());
                        }
                    }
                    AdOptionsView adOptionsView = (AdOptionsView) this.f12687a.findViewById(R.id.inter_options);
                    if (adOptionsView != null) {
                        adOptionsView.setTag(4);
                        adOptionsView.a(e, ((sg.bigo.ads.U0.b) e).O);
                    }
                    String str = ((sg.bigo.ads.U0.b) e).L;
                    TextView textView2 = (TextView) this.f12687a.findViewById(R.id.inter_advertiser);
                    TextView textView3 = (TextView) this.f12687a.findViewById(R.id.inter_ad_label);
                    if (textView2 != null) {
                        if (TextUtils.isEmpty(str)) {
                            textView2.setVisibility(8);
                        } else {
                            textView2.setText(str);
                            int a5 = AbstractC4963u.a(textView2.getContext(), 4);
                            int a6 = AbstractC4963u.a(textView2.getContext(), 1);
                            textView2.setPadding(a5, a6, a5, a6);
                        }
                        if (textView3 != null) {
                            textView3.setText(R.string.bigo_ad_tag);
                        }
                    }
                }
            }
            lVar2 = lVar3;
            ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar2.e())).b1.set(this.b0.c(lVar2));
            sg.bigo.ads.E.c cVar32 = (sg.bigo.ads.E.c) this.b0.o0.get(lVar2);
            if (cVar32 == null) {
            }
            if (lVar2 instanceof t) {
            }
            this.e0.put(qVar, roundedFrameLayout);
            qVar.v();
            if (i2 != 0) {
            }
        }
        X.a(this.f, new e(this));
        E0();
        K0();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        super.R();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        Iterator it = this.e0.keySet().iterator();
        while (it.hasNext()) {
            ((q) it.next()).R();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        Iterator it = this.e0.keySet().iterator();
        while (it.hasNext()) {
            ((q) it.next()).S();
        }
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void a(int i, int i2) {
    }

    public void a(sg.bigo.ads.C.l lVar) {
        if (lVar instanceof sg.bigo.ads.E.e) {
            ((sg.bigo.ads.E.e) lVar).m0 = true;
            C5497a c5497a = new C5497a(this.f12687a, I0());
            this.b0.k0 = lVar;
            c5497a.l = lVar;
            c5497a.v();
            this.h0 = c5497a;
            return;
        }
        if (lVar instanceof sg.bigo.ads.E.f) {
            ((sg.bigo.ads.E.f) lVar).w0 = true;
            C5498b c5498b = new C5498b(this.f12687a, I0());
            this.b0.k0 = lVar;
            c5498b.l = lVar;
            c5498b.v();
            this.h0 = c5498b;
        }
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final View b() {
        return null;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        return new Q1();
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void c(int i) {
        if (i != 11 || this.c0 >= this.e0.size()) {
            return;
        }
        this.c0++;
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final boolean d() {
        return this.g0;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        if (this.c0 == this.e0.size() && this.d0) {
            return true;
        }
        if (this.c0 >= this.e0.size()) {
            return false;
        }
        Iterator it = this.e0.keySet().iterator();
        while (it.hasNext()) {
            if (((q) it.next()).Z() && this.c0 < this.e0.size()) {
                this.c0++;
            }
        }
        if (this.c0 != this.e0.size()) {
            return false;
        }
        E0();
        return false;
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void i() {
        this.g0 = true;
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final ValueCallback j() {
        return null;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void u0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void v0() {
        sg.bigo.ads.T0.q qVar = this.t;
        if (qVar == null || this.g == null) {
            super.v0();
            return;
        }
        Integer a2 = z.a(qVar.a("multi_ads.close_button_style"));
        int i = 1;
        int intValue = a2 != null ? a2.intValue() : 1;
        if (this.c0 == this.e0.size()) {
            Integer a3 = z.a(this.t.a("multi_ads_endpage.close_button_style"));
            if (a3 != null) {
                i = a3.intValue();
            }
        } else {
            i = intValue;
        }
        AbstractC5164f1.a(i, this.g);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        AbstractC5204s abstractC5204s = this.h0;
        if (abstractC5204s != null) {
            abstractC5204s.w();
            this.h0 = null;
        }
        super.w();
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void a(boolean z, int i, int i2, int i3, sg.bigo.ads.U.j jVar, sg.bigo.ads.C.l lVar, q qVar) {
        View view;
        int i4;
        if (z) {
            lVar.a(jVar, i2, i3);
            return;
        }
        if (i3 != 35 && (!((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).p() || 1 != i)) {
            lVar.a(jVar, i2, i3);
            return;
        }
        View view2 = (View) this.e0.get(qVar);
        Iterator it = this.e0.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != qVar) {
                view = (View) entry.getValue();
                break;
            }
        }
        if (view2 == null || view == null) {
            a(lVar);
            H0();
        } else {
            AbstractC4954k.a(view2, view, new j(this, lVar));
        }
        String str = jVar.b != null ? jVar.b.x + "," + jVar.b.y : "";
        sg.bigo.ads.P.c e = lVar.e();
        String o = lVar.o();
        HashMap a2 = sg.bigo.ads.s1.b.a(e, (sg.bigo.ads.Q.b) null, false);
        a2.put("ad_size", o);
        AbstractC5081e.a(a2, "click_area", str, i3, "click_module");
        a2.put("click_source", String.valueOf(i2));
        a2.put("interaction_type", String.valueOf(1));
        a2.put("click_action", String.valueOf(1));
        boolean z2 = e instanceof InterfaceC5087a;
        if (z2) {
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) e);
            sg.bigo.ads.P.r rVar = kVar.E0;
            if (rVar != null) {
                a2.put("creative_size", rVar.f12490a + "*" + rVar.b);
            }
            if (kVar.p()) {
                a2.put("backup_creative", String.valueOf(kVar.T0));
            }
            sg.bigo.ads.s1.b.c(a2, e);
            sg.bigo.ads.s1.b.b(a2, e);
            if (z2 && (i4 = kVar.c1.get()) > 0) {
                a2.put("ad_click_indx", String.valueOf(i4));
            }
            sg.bigo.ads.s1.b.a(a2, e);
        }
        sg.bigo.ads.s1.b.a("06002073", a2);
    }
}
