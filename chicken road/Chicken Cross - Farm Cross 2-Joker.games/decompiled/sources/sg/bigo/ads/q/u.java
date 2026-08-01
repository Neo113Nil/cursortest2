package sg.bigo.ads.q;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.s.C5458a;

/* loaded from: classes3.dex */
public final class u extends x {
    public u(C5458a c5458a, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        super(c5458a, arrayList, cVar);
        this.f = true;
    }

    @Override // sg.bigo.ads.q.x
    public final C5431b a() {
        float a2 = AbstractC4963u.a(this.d, 8);
        return new C5431b(a2, a2, a2, a2, new Rect(0, AbstractC4963u.a(this.d, 10), 0, 0), this.h, null, this.g);
    }

    @Override // sg.bigo.ads.q.x
    public final ArrayList a(C5430a c5430a) {
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            View a2 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
            a(this.f13249a, (C5431b) null);
            this.f13249a.setOrientation(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            a(12, 0, 12, 12);
            this.f13249a.addView(a2, new LinearLayout.LayoutParams(-1, AbstractC4963u.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            View a3 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
            View a4 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
            this.f13249a.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            int a5 = AbstractC4963u.a(this.d, 60);
            LinearLayout linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(0);
            a(linearLayout, (C5431b) null);
            linearLayout.setPadding(AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 0), AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 12));
            this.f13249a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(a3, new LinearLayout.LayoutParams(-1, a5));
            arrayList2.add(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setOrientation(0);
            a(linearLayout2, (C5431b) null);
            linearLayout2.setPadding(AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 0), AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 12));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = AbstractC4963u.a(this.d, 8);
            this.f13249a.addView(linearLayout2, layoutParams);
            linearLayout2.addView(a4, new LinearLayout.LayoutParams(-1, a5));
            arrayList2.add(linearLayout2);
            return arrayList2;
        }
        View a6 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
        View a7 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
        View a8 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f13249a, false);
        this.f13249a.setOrientation(1);
        ArrayList arrayList3 = new ArrayList();
        int a9 = AbstractC4963u.a(this.d, 60);
        LinearLayout linearLayout3 = new LinearLayout(this.d);
        linearLayout3.setOrientation(0);
        a(linearLayout3, (C5431b) null);
        linearLayout3.setPadding(AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 0), AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 12));
        this.f13249a.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(a6, new LinearLayout.LayoutParams(-1, a9));
        arrayList3.add(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(this.d);
        linearLayout4.setOrientation(0);
        a(linearLayout4, (C5431b) null);
        linearLayout4.setPadding(AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 0), AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC4963u.a(this.d, 8);
        layoutParams2.bottomMargin = AbstractC4963u.a(this.d, 8);
        this.f13249a.addView(linearLayout4, layoutParams2);
        linearLayout4.addView(a7, new LinearLayout.LayoutParams(-1, a9));
        arrayList3.add(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(this.d);
        linearLayout5.setOrientation(0);
        a(linearLayout5, (C5431b) null);
        linearLayout5.setPadding(AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 0), AbstractC4963u.a(this.d, 12), AbstractC4963u.a(this.d, 12));
        this.f13249a.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
        linearLayout5.addView(a8, new LinearLayout.LayoutParams(-1, a9));
        arrayList3.add(linearLayout5);
        return arrayList3;
    }
}
