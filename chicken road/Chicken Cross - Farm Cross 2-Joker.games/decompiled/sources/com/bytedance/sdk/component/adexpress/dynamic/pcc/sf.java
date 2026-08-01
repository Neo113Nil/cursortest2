package com.bytedance.sdk.component.adexpress.dynamic.pcc;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.atb;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dax;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fum;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gbb;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jsj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nac;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.of;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ork;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qy;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tmg;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tsz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vy;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ye;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zti;
import com.bytedance.sdk.component.adexpress.dynamic.oo.kj;
import com.bytedance.sdk.component.adexpress.oo;
import com.bytedance.sdk.component.adexpress.sf.hc;

/* loaded from: classes4.dex */
public class sf {
    public static vj pcc(Context context, DynamicRootView dynamicRootView, kj kjVar) {
        hc renderRequest;
        if (context == null || dynamicRootView == null || kjVar == null || kjVar.ork() == null) {
            return null;
        }
        switch (kjVar.ork().pcc()) {
            case -1:
                return new ye(context, dynamicRootView, kjVar);
            case 0:
                return new qy(context, dynamicRootView, kjVar);
            case 1:
                return new vh(context, dynamicRootView, kjVar);
            case 2:
                return new qf(context, dynamicRootView, kjVar);
            case 3:
                return new vy(context, dynamicRootView, kjVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hc(context, dynamicRootView, kjVar);
            case 5:
                return new gbb(context, dynamicRootView, kjVar);
            case 6:
            case 9:
            case 17:
                return new wh(context, dynamicRootView, kjVar);
            case 7:
                return new zti(context, dynamicRootView, kjVar);
            case 8:
                return new lu(context, dynamicRootView, kjVar);
            case 10:
                return new dax(context, dynamicRootView, kjVar);
            case 11:
                return new yt(context, dynamicRootView, kjVar);
            case 12:
                return new ork(context, dynamicRootView, kjVar);
            case 13:
                return new jsj(context, dynamicRootView, kjVar);
            case 14:
                return new tsz(context, dynamicRootView, kjVar);
            case 15:
                if (oo.sf()) {
                    return new mk(context, dynamicRootView, kjVar);
                }
                return new atb(context, dynamicRootView, kjVar);
            case 16:
                return new vh(context, dynamicRootView, kjVar);
            case 18:
                return new of(context, dynamicRootView, kjVar);
            case 19:
                return new tz(context, dynamicRootView, kjVar);
            case 20:
                return new lo(context, dynamicRootView, kjVar);
            case 21:
                return new fum(context, dynamicRootView, kjVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kj(context, dynamicRootView, kjVar);
            case 23:
                return new nac(context, dynamicRootView, kjVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oo(context, dynamicRootView, kjVar);
            case 25:
                return new tmg(context, dynamicRootView, kjVar);
            case 26:
                if ("vertical".equals(kjVar.ork().vj().pv())) {
                    return new lq(context, dynamicRootView, kjVar);
                }
                return new gm(context, dynamicRootView, kjVar);
            case 27:
                return new atb(context, dynamicRootView, kjVar);
            case 28:
                if (!oo.sf() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new jr(context, dynamicRootView, kjVar, renderRequest.yt());
            default:
                return null;
        }
    }
}
