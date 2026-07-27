package com.bytedance.sdk.component.vj.sf.sf;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.vj.gpj;

/* loaded from: classes4.dex */
public class pcc<T> implements wh {
    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, gpj gpjVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        Bitmap pcc;
        String kj = gmVar.kj();
        gmVar.pcc();
        com.bytedance.sdk.component.vj.sf nac = gmVar.nac();
        com.bytedance.sdk.component.vj.sf.gm.wh dax = gmVar.dax();
        if (nac == null || dax == null || !nac.vj() || !pcc(gmVar) || (pcc = dax.pcc(nac).pcc(kj)) == null) {
            return true;
        }
        gmVar.pcc();
        pccVar.pcc(new com.bytedance.sdk.component.vj.sf.gm.oo().pcc(gmVar, pcc, null, false));
        return false;
    }

    private boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar) {
        int vh = gmVar.vh();
        return vh == 1 || vh == 2;
    }

    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public String pcc() {
        return "bitmap_cache";
    }
}
