package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class ork {
    public static qf pcc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar) {
        String lrr;
        String yt;
        if (context == null || vjVar == null || qfVar == null) {
            return null;
        }
        lrr = qfVar.lrr();
        yt = hcVar.yt();
        lrr.hashCode();
        switch (lrr) {
            case "0":
                return new vj(context, vjVar, qfVar);
            case "1":
                return new gm(context, vjVar, qfVar);
            case "2":
                return new sf(context, vjVar, qfVar);
            case "5":
                if (qfVar.xb() == 1) {
                    return new nac(context, vjVar, qfVar, qfVar.bg());
                }
                return new dax(context, vjVar, qfVar);
            case "6":
            case "11":
                return new gbb(context, vjVar, qfVar);
            case "7":
            case "14":
                return new tmg(context, vjVar, qfVar);
            case "8":
                return new hc(context, vjVar, qfVar);
            case "9":
            case "16":
                return new jr(context, vjVar, qfVar, lrr, orkVar.pcc(), orkVar.sf(), orkVar.oo(), orkVar.qf());
            case "10":
                return new oo(context, vjVar, qfVar);
            case "12":
                return new dax(context, vjVar, qfVar);
            case "13":
                return new nac(context, vjVar, qfVar);
            case "17":
            case "18":
                return new gpj(context, vjVar, qfVar, lrr, orkVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return new vh(context, vjVar, qfVar, yt + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                return new vh(context, vjVar, qfVar, TextUtils.isEmpty(yt) ? null : yt + "brush_mask.json", "20");
            case "22":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return new vh(context, vjVar, qfVar, yt + "static/lotties/202327swiper-up-star/index.json", "22");
                }
                return new lu(context, vjVar, qfVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return new vh(context, vjVar, qfVar, yt + "static/lotties/202327swiper-up-star/click.json", "23");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return new pcc(context, vjVar, qfVar);
                }
                return new vh(context, vjVar, qfVar, TextUtils.isEmpty(yt) ? null : yt + "swiper_up_star.json", "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return new vh(context, vjVar, qfVar, yt + "static/lotties/gesture-slide.json", "25");
                }
                return null;
            case "29":
                return new wh(context, vjVar, qfVar, orkVar.pcc(), orkVar.sf(), orkVar.oo(), orkVar.qf());
            default:
                return null;
        }
    }
}
