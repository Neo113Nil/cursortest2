package com.bytedance.adsdk.ugeno.vy.gm;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.vy.oo.gm;

/* loaded from: classes4.dex */
public abstract class pcc extends gm {
    private int gga;

    public abstract String hc(String str);

    public pcc(Context context) {
        super(context);
        this.gga = ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        this.pcc = jr(this.pcc);
        super.sf();
        ((com.bytedance.adsdk.ugeno.vy.oo.pcc) this.vj).setColorFilter(this.gga);
        ((com.bytedance.adsdk.ugeno.vy.oo.pcc) this.vj).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private String jr(String str) {
        String hc = hc(str);
        if (TextUtils.isEmpty(hc)) {
            return "";
        }
        return "local://".concat(String.valueOf(hc));
    }

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm, com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.gga = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm
    protected String gm() {
        return "drawable";
    }
}
