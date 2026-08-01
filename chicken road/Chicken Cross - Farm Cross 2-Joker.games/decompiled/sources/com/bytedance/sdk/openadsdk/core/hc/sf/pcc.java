package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tz;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.vy.wh.sf {
    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf
    public void gbb(String str) {
        super.gbb(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText("(" + String.format(tz.pcc(this.sf, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str))) + ")");
        } catch (Exception unused) {
        }
    }
}
