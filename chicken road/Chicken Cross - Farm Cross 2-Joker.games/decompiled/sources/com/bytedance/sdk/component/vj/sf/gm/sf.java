package com.bytedance.sdk.component.vj.sf.gm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.dax;
import com.bytedance.sdk.component.vj.hc;
import com.bytedance.sdk.component.vj.jr;
import com.bytedance.sdk.component.vj.lu;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.sf.gm.gm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class sf implements jr {
    private volatile wh pcc;

    private sf() {
    }

    public static jr pcc(Context context, hc hcVar) {
        sf sfVar = new sf();
        sfVar.sf(context, hcVar);
        return sfVar;
    }

    private void sf(Context context, hc hcVar) {
        if (this.pcc != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (hcVar == null) {
            hcVar = vj.pcc(context);
        }
        this.pcc = new wh(context, hcVar);
    }

    @Override // com.bytedance.sdk.component.vj.jr
    public ork pcc(String str) {
        return new gm.sf(this.pcc).gm(str);
    }

    @Override // com.bytedance.sdk.component.vj.jr
    public InputStream pcc(String str, String str2) {
        byte[] pcc;
        if (this.pcc != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = dax.pcc(str);
            }
            lu gm = this.pcc.gm();
            if (gm != null && (pcc = gm.pcc(str2)) != null) {
                return new ByteArrayInputStream(pcc);
            }
            Collection<com.bytedance.sdk.component.vj.gm> oo = this.pcc.oo();
            if (oo != null) {
                Iterator<com.bytedance.sdk.component.vj.gm> it = oo.iterator();
                while (it.hasNext()) {
                    InputStream pcc2 = it.next().pcc(str2);
                    if (pcc2 != null) {
                        return pcc2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vj.jr
    public boolean pcc(String str, String str2, String str3) {
        if (this.pcc == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = dax.pcc(str);
        }
        com.bytedance.sdk.component.vj.gm pcc = this.pcc.pcc(str3);
        if (pcc != null) {
            return pcc.sf(str2);
        }
        return false;
    }
}
