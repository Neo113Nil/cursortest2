package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.pcc.gm;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gbb extends com.bytedance.pcc.sf<hc> {
    @Override // com.bytedance.pcc.sf
    public void pcc(ArrayList<hc> arrayList, final gm.sf<hc> sfVar) {
        if (!lu.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc())) {
            sfVar.pcc(arrayList, false);
            return;
        }
        Iterator<hc> it = arrayList.iterator();
        while (it.hasNext()) {
            final hc next = it.next();
            if (!com.bytedance.sdk.component.qf.gm.wh.pcc(next.ork())) {
                ArrayList<hc> arrayList2 = new ArrayList<>();
                arrayList2.add(next);
                sfVar.pcc(arrayList2, true);
            } else if (next.vj() >= pcc(next.vh())) {
                ArrayList<hc> arrayList3 = new ArrayList<>();
                arrayList3.add(next);
                sfVar.pcc(arrayList3, true);
            } else {
                rnn.pcc().submit(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.gbb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gbb.this.pcc(next, (gm.sf<hc>) sfVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(hc hcVar, gm.sf<hc> sfVar) {
        String pcc = com.bytedance.sdk.openadsdk.qy.pcc.pcc(hcVar.ork(), hcVar.vy());
        com.bytedance.sdk.openadsdk.oo.pcc.gm gmVar = new com.bytedance.sdk.openadsdk.oo.pcc.gm();
        gmVar.pcc("User-Agent", kun.oo());
        gmVar.pcc("csj_client_source_from", "1");
        gmVar.pcc(pcc);
        com.bytedance.sdk.component.wh.pcc.vj.oo pcc2 = gmVar.pcc();
        com.bytedance.sdk.component.wh.pcc.wh.oo ooVar = new com.bytedance.sdk.component.wh.pcc.wh.oo(hcVar.wh(), pcc, hcVar.vy(), hcVar.kj(), hcVar.vh());
        ooVar.sf(true);
        ArrayList<hc> arrayList = new ArrayList<>();
        arrayList.add(hcVar);
        if (pcc2 != null && pcc2.pcc()) {
            sfVar.pcc(arrayList, true);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new com.bytedance.sdk.openadsdk.oo.pcc.vy(true, ooVar));
            return;
        }
        if (pcc2 != null) {
            ooVar.sf(pcc2.sf());
            ooVar.gm(pcc2.gm());
        }
        if (hcVar.vj() >= pcc(hcVar.vh())) {
            sfVar.pcc(arrayList, true);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new com.bytedance.sdk.openadsdk.oo.pcc.vy(false, ooVar));
        } else {
            sfVar.pcc(arrayList, false);
        }
    }

    @Override // com.bytedance.pcc.sf
    public long pcc() {
        return gm.pcc().gm().pcc;
    }

    @Override // com.bytedance.pcc.sf
    public int sf() {
        return gm.pcc().gm().sf;
    }

    @Override // com.bytedance.pcc.sf
    public String oo() {
        return "track_urls";
    }

    @Override // com.bytedance.pcc.sf
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public hc pcc(String str, byte[] bArr, int i, int i2) {
        try {
            hc hcVar = new hc(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            hcVar.pcc(i);
            hcVar.sf(i2);
            return hcVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.pcc.sf
    public long vj() {
        return gm.pcc().gm().gm;
    }

    public int pcc(String str) {
        com.bytedance.sdk.openadsdk.oo.pcc.ork mua = com.bytedance.sdk.openadsdk.core.settings.vh.sf().mua();
        if (mua == null) {
            return 3;
        }
        return mua.pcc(str);
    }

    @Override // com.bytedance.pcc.sf
    public gm.InterfaceC0115gm qf() {
        return sf.pcc();
    }

    @Override // com.bytedance.pcc.sf
    public int kj() {
        return gm.pcc().gm().wh;
    }

    @Override // com.bytedance.pcc.sf
    public int vy() {
        return gm.pcc().gm().qf;
    }

    @Override // com.bytedance.pcc.sf
    public long ork() {
        return gm.pcc().gm().kj;
    }

    @Override // com.bytedance.pcc.sf
    public boolean wh() {
        return sf.sf();
    }
}
