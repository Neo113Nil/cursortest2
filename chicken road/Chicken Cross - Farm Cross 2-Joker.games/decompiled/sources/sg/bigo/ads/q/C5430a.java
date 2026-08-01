package sg.bigo.ads.q;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.L0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.s.C5458a;

/* renamed from: sg.bigo.ads.q.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5430a {

    /* renamed from: a, reason: collision with root package name */
    public final RealtimeBlurLinearLayout f13238a;
    public final ViewFlow b;
    public final int c;

    public C5430a(RealtimeBlurLinearLayout realtimeBlurLinearLayout, int i) {
        this.f13238a = realtimeBlurLinearLayout;
        this.b = (ViewFlow) realtimeBlurLinearLayout.findViewById(R.id.inter_icon_ads_view_flow);
        this.c = i;
    }

    public static C5430a a(Context context, sg.bigo.ads.r.c cVar, List list, ArrayList arrayList) {
        int a2;
        boolean z;
        x qVar;
        boolean z2 = false;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) AbstractC4944a.a(context, R.layout.bigo_ad_layout_interstitial_icon_view_flow, null, false);
        int i = cVar.g;
        C5430a c5430a = new C5430a(realtimeBlurLinearLayout, (int) ((i < 0 ? 0 : i) * 1000));
        c5430a.b.setViewStyle(3);
        c5430a.b.setDividerWidth(0);
        if (!cVar.d()) {
            switch (cVar.a()) {
                case 1:
                case 3:
                    c5430a.b.setContentMaxWidthSpace(AbstractC4963u.a(context, 20));
                    break;
                case 2:
                case 4:
                    c5430a.b.setContentMaxWidthSpace(0);
                    break;
                case 5:
                case 6:
                    c5430a.b.setContentMaxWidthSpace(AbstractC4963u.a(context, 47));
                    ((ViewGroup.MarginLayoutParams) c5430a.b.getLayoutParams()).bottomMargin = 0;
                    break;
            }
        } else {
            c5430a.b.setContentMaxWidthSpace(0);
            ((LinearLayout.LayoutParams) c5430a.b.getLayoutParams()).bottomMargin = 0;
        }
        arrayList.clear();
        List<NativeAd> list2 = list;
        while (!A.a(list2)) {
            C5458a c5458a = new C5458a(context);
            if (!A.a(list2)) {
                if (cVar.d()) {
                    z = z2;
                    a2 = 1;
                } else {
                    a2 = sg.bigo.ads.r.c.a(cVar);
                    z = true;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (NativeAd nativeAd : list2) {
                        if (!(nativeAd instanceof sg.bigo.ads.C.l) || ((sg.bigo.ads.C.l) nativeAd).t()) {
                            arrayList4.add(nativeAd);
                        } else {
                            arrayList5.add(nativeAd);
                        }
                    }
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        NativeAd nativeAd2 = (NativeAd) it.next();
                        if (arrayList2.size() < a2) {
                            arrayList2.add(nativeAd2);
                            arrayList.add(nativeAd2);
                        } else {
                            arrayList3.add(nativeAd2);
                        }
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext() && arrayList2.size() < a2) {
                        NativeAd nativeAd3 = (NativeAd) it2.next();
                        arrayList2.add(nativeAd3);
                        arrayList.add(nativeAd3);
                        it2.remove();
                    }
                    arrayList3.addAll(arrayList4);
                    arrayList.addAll(arrayList3);
                }
                if (a2 == 1) {
                    arrayList.addAll(arrayList3);
                    arrayList3.clear();
                }
                if (cVar.d()) {
                    qVar = new w(c5458a, arrayList2, cVar);
                } else {
                    int a3 = cVar.a();
                    qVar = a3 != 2 ? a3 != 3 ? a3 != 4 ? a3 != 5 ? a3 != 6 ? new q(c5458a, arrayList2, cVar) : new v(c5458a, arrayList2, cVar) : new u(c5458a, arrayList2, cVar) : new t(c5458a, arrayList2, cVar) : new s(c5458a, arrayList2, cVar) : new r(c5458a, arrayList2, cVar);
                }
                qVar.a(c5430a, z);
                c5458a.b = qVar;
                list2 = arrayList3;
            }
            z zVar = new z();
            ((ViewGroup.LayoutParams) zVar).width = -1;
            ((ViewGroup.LayoutParams) zVar).height = -2;
            zVar.e = 48;
            zVar.d = 3;
            c5430a.b.addView(c5458a, zVar);
            z2 = false;
        }
        return c5430a;
    }
}
