package sg.bigo.ads.q;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.s.C5458a;

/* loaded from: classes3.dex */
public class q extends x {
    public q(C5458a c5458a, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        super(c5458a, arrayList, cVar);
    }

    @Override // sg.bigo.ads.q.x
    public final C5431b a() {
        float a2 = AbstractC4963u.a(this.d, 8);
        return new C5431b(a2, a2, a2, a2, null, this.h, null, this.g);
    }

    @Override // sg.bigo.ads.q.x
    public ArrayList a(C5430a c5430a) {
        a(this.f13249a, (C5431b) null);
        this.f13249a.setOrientation(0);
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a2 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f13249a, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            a(16, 10, 16, 14);
            this.f13249a.addView(a2, new LinearLayout.LayoutParams(-1, AbstractC4963u.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            View a3 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.f13249a, false);
            View a4 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.f13249a, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a3);
            arrayList2.add(a4);
            a(16, 12, 16, 12);
            int a5 = AbstractC4963u.a(this.d, 60);
            this.f13249a.addView(a3, new LinearLayout.LayoutParams(0, a5, 1.0f));
            this.f13249a.addView(new Space(this.d), new LinearLayout.LayoutParams(AbstractC4963u.a(this.d, 15), a5));
            this.f13249a.addView(a4, new LinearLayout.LayoutParams(0, a5, 1.0f));
            return arrayList2;
        }
        if (size == 3) {
            View a6 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a7 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a8 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a6);
            arrayList3.add(a7);
            arrayList3.add(a8);
            a(0, 12, 0, 8);
            int a9 = AbstractC4963u.a(this.d, 72);
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a6, new LinearLayout.LayoutParams(a9, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a7, new LinearLayout.LayoutParams(a9, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a8, new LinearLayout.LayoutParams(a9, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            return arrayList3;
        }
        View a10 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
        View a11 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
        View a12 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
        View a13 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(a10);
        arrayList4.add(a11);
        arrayList4.add(a12);
        arrayList4.add(a13);
        a(0, 12, 0, 8);
        int a14 = AbstractC4963u.a(this.d, 72);
        p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        this.f13249a.addView(a10, new LinearLayout.LayoutParams(a14, -2));
        p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        this.f13249a.addView(a11, new LinearLayout.LayoutParams(a14, -2));
        p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        this.f13249a.addView(a12, new LinearLayout.LayoutParams(a14, -2));
        p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        this.f13249a.addView(a13, new LinearLayout.LayoutParams(a14, -2));
        p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        return arrayList4;
    }
}
