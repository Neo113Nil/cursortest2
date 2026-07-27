package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends fum {
    private gpj pcc;

    public wh(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        pcc(context, i, i2, i3, jSONObject);
    }

    private void pcc(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        gpj gpjVar = new gpj(context, com.bytedance.sdk.component.adexpress.gm.pcc.gm(context), i, i2, i3, jSONObject);
        this.pcc = gpjVar;
        addView(gpjVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.pcc.setLayoutParams(layoutParams);
    }

    public gpj getShakeView() {
        return this.pcc;
    }

    public void setShakeText(String str) {
        if (this.pcc == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.pcc.setShakeText("");
        } else {
            this.pcc.setShakeText(str);
        }
    }
}
