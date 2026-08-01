package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gpj extends lu {
    private TextView pcc;

    public gpj(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.lu
    protected void pcc(Context context, View view) {
        addView(view);
        this.pcc = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.lu
    public void setShakeText(String str) {
        if (this.pcc == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.pcc.setText(com.bytedance.sdk.component.utils.tz.sf(this.pcc.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                e.getMessage();
                return;
            }
        }
        this.pcc.setText(str);
    }
}
