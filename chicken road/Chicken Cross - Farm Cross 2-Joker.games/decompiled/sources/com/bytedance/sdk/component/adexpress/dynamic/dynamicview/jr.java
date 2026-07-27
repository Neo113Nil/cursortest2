package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class jr extends wh {
    String pcc;
    com.bytedance.sdk.component.adexpress.dynamic.oo.kj sf;

    public jr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, String str) {
        super(context, dynamicRootView, kjVar);
        this.pcc = str;
        this.sf = kjVar;
        com.bytedance.sdk.component.adexpress.wh.ork lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.wh.ork getLottieView() {
        String str;
        if (this.hc == null || this.hc.ork() == null || this.vh == null || TextUtils.isEmpty(this.pcc)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = this.hc.ork().vj();
        if (vj == null) {
            str = "";
        } else {
            str = vj.gh();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.pcc + "static/lotties/" + str + ".json";
        com.bytedance.sdk.component.adexpress.wh.ork orkVar = new com.bytedance.sdk.component.adexpress.wh.ork(this.vh);
        orkVar.setImageLottieTosPath(str2);
        orkVar.kj();
        return orkVar;
    }
}
