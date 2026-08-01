package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.adsdk.ugeno.vy.wh.sf {
    private String uae;
    private String xf;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        if (TextUtils.isEmpty(this.uae) || TextUtils.equals(this.uae, "null")) {
            this.uae = "";
        }
        if (TextUtils.isEmpty(this.xf) || TextUtils.equals(this.xf, "null")) {
            this.xf = "";
        }
        this.pcc = this.xf + this.uae;
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText(this.pcc);
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf
    public void gbb(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.uae) || TextUtils.equals(this.uae, "null")) {
            this.uae = "";
        }
        if (TextUtils.isEmpty(this.xf) || TextUtils.equals(this.xf, "null")) {
            this.xf = "";
        }
        this.pcc = this.xf + str + this.uae;
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText(this.pcc);
        try {
            float f = this.zti ? this.tsz : this.jsj;
            float f2 = this.pq ? this.mk : this.jsj;
            float measureText = ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).getPaint().measureText(this.pcc);
            if (measureText >= 0.0f) {
                vj((int) (f + measureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        if (str.equals("before")) {
            this.xf = str2;
        } else if (str.equals("after")) {
            this.uae = str2;
        }
    }

    public int oo() {
        return this.bg;
    }
}
