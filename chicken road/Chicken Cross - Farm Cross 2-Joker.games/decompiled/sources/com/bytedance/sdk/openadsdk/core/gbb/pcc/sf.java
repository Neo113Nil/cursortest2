package com.bytedance.sdk.openadsdk.core.gbb.pcc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class sf {
    protected int gm;
    protected double oo;
    public int pcc;
    protected final Context sf;
    public int vj;
    public pcc wh;

    public static class pcc {
        public boolean gm;
        public int pcc;
        public int sf;
    }

    public abstract com.bytedance.sdk.openadsdk.core.gbb.pcc pcc(String str, File file, List<gm> list);

    public sf(Context context, int i, int i2) {
        this.gm = 0;
        this.oo = 0.0d;
        if (i2 > 0 && i > 0) {
            this.oo = i / i2;
        }
        float kj = rj.kj(context);
        if (kj != 0.0f && i > 0) {
            this.gm = (int) (i / kj);
        }
        this.sf = context.getApplicationContext();
    }

    protected void pcc(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            oo.pcc().pcc("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String pcc(String str, List<gm> list) {
        int i = this.pcc;
        String str2 = null;
        if (i >= 5) {
            return null;
        }
        this.pcc = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
            gm.gm(str);
            com.bytedance.sdk.component.qf.sf vj = gm.vj();
            str2 = vj.oo();
            vj.pcc();
            return str2;
        } catch (Exception e) {
            pcc(e, 0);
            if (list.isEmpty()) {
                return str2;
            }
            gm.sf((of) null, list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            return str2;
        }
    }
}
