package sg.bigo.ads.q;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.s.C5458a;

/* loaded from: classes3.dex */
public final class v extends x {
    public final int j;
    public final C5431b k;

    public v(C5458a c5458a, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        super(c5458a, arrayList, cVar);
        this.j = AbstractC4963u.a(this.d, 72);
        float a2 = AbstractC4963u.a(this.d, 8);
        this.k = new C5431b(a2, a2, a2, a2, null, this.h, null, this.g);
    }

    @Override // sg.bigo.ads.q.x
    public final C5431b a() {
        float a2 = AbstractC4963u.a(this.d, 8);
        return new C5431b(a2, a2, a2, a2, new Rect(0, AbstractC4963u.a(this.d, 12), 0, 0), this.h, null, this.g);
    }

    @Override // sg.bigo.ads.q.x
    public final ArrayList a(C5430a c5430a) {
        ArrayList arrayList;
        View a2;
        View a3;
        View a4;
        View a5;
        View a6;
        View view;
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a7 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f13249a, false);
            a(this.f13249a, this.k);
            this.f13249a.setOrientation(0);
            arrayList = new ArrayList();
            arrayList.add(a7);
            a(20, 16, 20, 16);
            this.f13249a.addView(a7, new LinearLayout.LayoutParams(-1, AbstractC4963u.a(this.d, 60)));
        } else if (size == 2) {
            this.f = true;
            View a8 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f13249a, false);
            View a9 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f13249a, false);
            a(this.f13249a, this.k);
            this.f13249a.setOrientation(1);
            arrayList = new ArrayList();
            arrayList.add(a8);
            arrayList.add(a9);
            a(20, 16, 20, 16);
            int a10 = AbstractC4963u.a(this.d, 60);
            this.f13249a.addView(a8, new LinearLayout.LayoutParams(-1, a10));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a10);
            layoutParams.topMargin = AbstractC4963u.a(this.d, 20);
            this.f13249a.addView(a9, layoutParams);
        } else if (size == 3) {
            View a11 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a12 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a13 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            a(this.f13249a, (C5431b) null);
            this.f13249a.setOrientation(0);
            arrayList = new ArrayList();
            arrayList.add(a11);
            arrayList.add(a12);
            arrayList.add(a13);
            a(0, 0, 0, 16);
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a11, new LinearLayout.LayoutParams(this.j, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a12, new LinearLayout.LayoutParams(this.j, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
            this.f13249a.addView(a13, new LinearLayout.LayoutParams(this.j, -2));
            p.a(0, 60, 1.0f, this.f13249a, new Space(this.d));
        } else {
            if (size != 4) {
                if (size != 5) {
                    a2 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a3 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a4 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a5 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a6 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    view = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                } else {
                    a2 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a3 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a4 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a5 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    a6 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
                    view = null;
                }
                return a(a2, a3, a4, a5, a6, view);
            }
            View a14 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a15 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a16 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            View a17 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f13249a, false);
            a(this.f13249a, (C5431b) null);
            this.f13249a.setOrientation(1);
            this.f13249a.setGravity(1);
            arrayList = new ArrayList();
            arrayList.add(a14);
            arrayList.add(a15);
            arrayList.add(a16);
            arrayList.add(a17);
            arrayList.add(a17);
            a(0, 0, 0, 16);
            LinearLayout linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(0);
            this.f13249a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            linearLayout.addView(a14, new LinearLayout.LayoutParams(this.j, -2));
            linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            linearLayout.addView(a15, new LinearLayout.LayoutParams(this.j, -2));
            linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = AbstractC4963u.a(this.d, 12);
            this.f13249a.addView(linearLayout2, layoutParams2);
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            linearLayout2.addView(a16, new LinearLayout.LayoutParams(this.j, -1));
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            linearLayout2.addView(a17, new LinearLayout.LayoutParams(this.j, -2));
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        }
        return arrayList;
    }

    public final ArrayList a(View view, View view2, View view3, View view4, View view5, View view6) {
        a(this.f13249a, (C5431b) null);
        this.f13249a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.f13249a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.j, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.j, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.j, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC4963u.a(this.d, 12);
        this.f13249a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.j, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.j, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.j, -2));
        } else {
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(this.j, -2));
        }
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }
}
