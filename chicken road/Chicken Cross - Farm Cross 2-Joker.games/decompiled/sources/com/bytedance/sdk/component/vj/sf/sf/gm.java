package com.bytedance.sdk.component.vj.sf.sf;

import com.bytedance.sdk.component.vj.gpj;
import com.bytedance.sdk.component.vj.lu;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class gm implements wh {
    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, gpj gpjVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        com.bytedance.sdk.component.vj.sf nac = gmVar.nac();
        com.bytedance.sdk.component.vj.sf.gm.wh dax = gmVar.dax();
        if (nac != null && dax != null) {
            if (nac.wh()) {
                if (gpjVar != null) {
                    gpjVar.pcc("data_cache", gmVar);
                }
                lu sf = dax.sf(nac);
                r7 = sf != null ? sf.pcc(gmVar.qf()) : null;
                if (gpjVar != null) {
                    gpjVar.sf("data_cache", gmVar);
                }
                new Object[]{"step 4-1 Read memory-level data key is", gmVar.qf(), "url is ", gmVar.pcc(), "imageData is null  ", Boolean.valueOf(r7 == null)};
            }
            if (nac.qf() && r7 == null) {
                if (gpjVar != null) {
                    gpjVar.pcc("disk_cache", gmVar);
                }
                byte[] pcc = pcc(nac, dax, gmVar.qf());
                if (pcc != null) {
                    pcc(gmVar.nac(), dax, gmVar.qf(), pcc);
                }
                if (gpjVar != null) {
                    gpjVar.sf("disk_cache", gmVar);
                }
                new Object[]{"step 4-2 Read disk cache key is ", gmVar.qf(), "url is ", gmVar.pcc(), "imageData is null  ", Boolean.valueOf(pcc == null)};
                r7 = pcc;
            }
        }
        if (dax != null && r7 == null) {
            if (gpjVar != null) {
                gpjVar.pcc("net_request", gmVar);
            }
            r7 = pcc(dax, gmVar, pccVar);
            new Object[]{"step 4-3 net request cache key is  ", gmVar.qf(), "url is ", gmVar.pcc(), " imageData is null ", Boolean.valueOf(r7 == null)};
            if (gpjVar != null) {
                gpjVar.sf("net_request", gmVar);
            }
        }
        if (r7 == null) {
            new Object[]{"step 4-4 net fail cache key is  ", gmVar.qf(), "url is ", gmVar.pcc(), " imageData is null ", Boolean.valueOf(r7 == null)};
            return false;
        }
        gmVar.pcc(r7);
        return true;
    }

    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public String pcc() {
        return "data_intercept";
    }

    private byte[] pcc(com.bytedance.sdk.component.vj.sf.gm.wh whVar, com.bytedance.sdk.component.vj.sf.gm.gm gmVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        com.bytedance.sdk.component.vj.oo vj = whVar.vj();
        gmVar.pcc(false);
        try {
            com.bytedance.sdk.component.vj.wh pcc = vj.pcc(new com.bytedance.sdk.component.vj.pcc.sf(gmVar.pcc(), false, false, gmVar.lu()));
            if (pcc == null) {
                pccVar.pcc(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int pcc2 = pcc.pcc();
            if (pcc2 == 200) {
                byte[] bArr = (byte[]) pcc.sf();
                if (bArr == null) {
                    pccVar.pcc(pcc2, pcc.gm(), new Exception("net data is empty"));
                    return null;
                }
                pcc(gmVar.nac(), whVar, gmVar.qf(), bArr);
                sf(gmVar.nac(), whVar, gmVar.qf(), bArr);
                return bArr;
            }
            Object sf = pcc.sf();
            pccVar.pcc(pcc2, pcc.gm(), sf instanceof Throwable ? (Throwable) sf : null);
            return null;
        } catch (Throwable th) {
            pccVar.pcc(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] pcc(com.bytedance.sdk.component.vj.sf sfVar, com.bytedance.sdk.component.vj.sf.gm.wh whVar, String str) {
        whVar.gm(sfVar);
        Collection<com.bytedance.sdk.component.vj.gm> oo = whVar.oo();
        if (oo == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.vj.gm> it = oo.iterator();
        while (it.hasNext()) {
            byte[] pcc = it.next().pcc((com.bytedance.sdk.component.vj.gm) str);
            if (pcc != null) {
                return pcc;
            }
        }
        return null;
    }

    private void pcc(com.bytedance.sdk.component.vj.sf sfVar, com.bytedance.sdk.component.vj.sf.gm.wh whVar, String str, byte[] bArr) {
        if (sfVar == null || !sfVar.wh()) {
            return;
        }
        whVar.sf(sfVar).pcc(str, bArr);
    }

    private void sf(final com.bytedance.sdk.component.vj.sf sfVar, final com.bytedance.sdk.component.vj.sf.gm.wh whVar, final String str, final byte[] bArr) {
        if (sfVar == null || !sfVar.qf()) {
            return;
        }
        whVar.kj().submit(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.sf.gm.1
            @Override // java.lang.Runnable
            public void run() {
                whVar.gm(sfVar).pcc(str, bArr);
            }
        });
    }
}
