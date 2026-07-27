package com.bytedance.sdk.openadsdk.core.jr.vj;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm;
import com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc;
import com.bytedance.sdk.component.sf.pcc.qf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.vj.sf.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.tmg;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vh;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vy;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class pcc {
    public static final com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc pcc = new com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf.pcc();

    private static boolean pcc(gm gmVar) {
        return true;
    }

    public static void pcc(final gm gmVar, final pcc.InterfaceC0095pcc interfaceC0095pcc) {
        of ofVar;
        AdSlot adSlot;
        if ((gmVar.wh() > 0 || gmVar.hc()) && gmVar.lu() != -2) {
            if (gmVar.lu() != 1) {
                gmVar.vj(6000);
                gmVar.wh(6000);
                gmVar.qf(6000);
                boolean z = gmVar.vj("material_meta") != null && (gmVar.vj("material_meta") instanceof of);
                boolean z2 = gmVar.vj("ad_slot") != null && (gmVar.vj("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    ofVar = (of) gmVar.vj("material_meta");
                    AdSlot adSlot2 = (AdSlot) gmVar.vj("ad_slot");
                    sf(gmVar, ofVar, adSlot2);
                    adSlot = adSlot2;
                } else {
                    ofVar = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final of ofVar2 = ofVar;
                final AdSlot adSlot3 = adSlot;
                final pcc.InterfaceC0095pcc interfaceC0095pcc2 = new pcc.InterfaceC0095pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.vj.pcc.1
                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(gm gmVar2, int i) {
                        pcc.InterfaceC0095pcc interfaceC0095pcc3 = pcc.InterfaceC0095pcc.this;
                        if (interfaceC0095pcc3 != null) {
                            interfaceC0095pcc3.pcc(gmVar2, i);
                        }
                        if (ofVar2 == null || adSlot3 == null) {
                            return;
                        }
                        pcc.sf(gmVar, ofVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(gm gmVar2, int i, String str) {
                        pcc.InterfaceC0095pcc interfaceC0095pcc3 = pcc.InterfaceC0095pcc.this;
                        if (interfaceC0095pcc3 != null) {
                            interfaceC0095pcc3.pcc(gmVar2, i, str);
                        }
                        if (ofVar2 == null || adSlot3 == null) {
                            return;
                        }
                        pcc.sf(gmVar, ofVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i, str);
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void sf(gm gmVar2, int i) {
                        AdSlot adSlot4;
                        pcc.InterfaceC0095pcc interfaceC0095pcc3 = pcc.InterfaceC0095pcc.this;
                        if (interfaceC0095pcc3 != null) {
                            interfaceC0095pcc3.pcc(gmVar2, i);
                        }
                        of ofVar3 = ofVar2;
                        if (ofVar3 != null && (adSlot4 = adSlot3) != null) {
                            pcc.gm(gmVar, ofVar3, adSlot4);
                        }
                        new Object[]{"cancel: ", gmVar.nac()};
                    }
                };
                if (!pcc(gmVar.dax())) {
                    if (interfaceC0095pcc != null) {
                        interfaceC0095pcc.pcc(gmVar, 404, "unexpected url: " + gmVar.dax());
                    }
                    sf(gmVar, ofVar, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                } else {
                    com.bytedance.sdk.component.kj.sf.gm gmVar2 = new com.bytedance.sdk.component.kj.sf.gm("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.jr.vj.pcc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                pcc.pcc.pcc(lu.pcc(), gmVar, interfaceC0095pcc2);
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                    };
                    if (rnn.wh()) {
                        rnn.gm((Runnable) gmVar2);
                        return;
                    } else {
                        gmVar2.run();
                        return;
                    }
                }
            }
        }
        if (interfaceC0095pcc != null) {
            interfaceC0095pcc.pcc(gmVar, 100);
        }
    }

    private static void sf(gm gmVar, of ofVar, AdSlot adSlot) {
        if (pcc(gmVar)) {
            long tmg = gmVar.hc() ? gmVar.tmg() : gmVar.wh();
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, gmVar);
            pcc2.pcc(new vh(gmVar.dax(), tmg));
            oo.pcc("load_video_start", pcc2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(gm gmVar, of ofVar, AdSlot adSlot, long j, int i, String str) {
        if (pcc(gmVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, gmVar);
            ork orkVar = new ork();
            orkVar.pcc(gmVar.dax());
            orkVar.pcc(gmVar.wh());
            orkVar.sf(j);
            orkVar.pcc(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            orkVar.sf(str);
            orkVar.gm("");
            pcc2.pcc(orkVar);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(pcc2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(gm gmVar, of ofVar, AdSlot adSlot, long j) {
        if (pcc(gmVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, gmVar);
            tmg tmgVar = new tmg();
            tmgVar.pcc(gmVar.dax());
            tmgVar.pcc(gmVar.wh());
            tmgVar.sf(j);
            if (gmVar.tz() == 1) {
                tmgVar.gm(1L);
            } else {
                tmgVar.gm(0L);
            }
            pcc2.pcc(tmgVar);
            oo.pcc("load_video_success", pcc2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(gm gmVar, of ofVar, AdSlot adSlot) {
        if (pcc(gmVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, gmVar);
            pcc2.pcc(new vy(gmVar.dax(), gmVar.wh()));
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(pcc2);
        }
    }

    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return qf.gm(str) != null;
    }
}
