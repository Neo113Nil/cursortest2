package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg {
    private static final AtomicInteger pcc = new AtomicInteger(0);
    private static final AtomicBoolean sf = new AtomicBoolean(false);

    public static void pcc(String str) {
        AtomicBoolean atomicBoolean = sf;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.lu.kj(lu.pcc())) {
                atomicBoolean.set(false);
            } else {
                pcc.pcc();
                sf(str);
            }
        }
    }

    public static void sf(final String str) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.tmg.1
            @Override // java.lang.Runnable
            public void run() {
                final List<String> list;
                final String gpj = com.bytedance.sdk.openadsdk.utils.kun.gpj();
                com.bytedance.sdk.openadsdk.dax.oo.pcc(0, gpj);
                final boolean sf2 = com.bytedance.sdk.openadsdk.utils.sf.sf();
                if (!sf2) {
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("ipv6");
                            return pccVar;
                        }
                    });
                }
                if (TextUtils.isEmpty(gpj)) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, gpj, -1, "url is null");
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", "", -2, "url is null", null, null);
                    if (sf2) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.2
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("ipv6");
                            return pccVar;
                        }
                    });
                    return;
                }
                final com.bytedance.sdk.component.qf.sf.oo sf3 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
                if (sf2) {
                    try {
                        sf3.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.3
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("ipv6");
                                return pccVar;
                            }
                        });
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, gpj, -2, e.getMessage());
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", gpj, -3, e.getMessage(), null, null);
                        if (!sf2) {
                            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.5
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                    pccVar.sf("ipv6");
                                    return pccVar;
                                }
                            });
                        }
                        com.bytedance.sdk.component.utils.lo.gm("build ipv6 request failed:" + e.getMessage(), new Object[0]);
                        return;
                    }
                }
                sf3.gm(gpj);
                if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                    List<String> lo = com.bytedance.sdk.openadsdk.utils.kun.lo();
                    if (!lo.isEmpty()) {
                        sf3.pcc(lo);
                        sf3.pcc(60L, TimeUnit.SECONDS);
                    }
                    list = lo;
                } else {
                    list = null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("connect_type", com.bytedance.sdk.component.utils.jsj.pcc(lu.pcc(), 0L));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("device_id", Long.parseLong(str));
                }
                jSONObject.put("header", com.bytedance.sdk.openadsdk.oo.pcc.pcc.pcc().sf());
                try {
                    jSONObject.put("id", lu.gm().pcc((AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.tsz) null, 0));
                } catch (Throwable th) {
                    th.getMessage();
                }
                JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qy(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                if (encryptType4 != null && encryptType4.optInt("cypher") == 4) {
                    jsj.sf(true);
                    sf3.sf("x-pgli18n", "4");
                    sf3.sf("Content-Type", "application/json; charset=utf-8");
                } else {
                    jsj.sf(false);
                }
                if (tmg.sf(encryptType4)) {
                    jSONObject = encryptType4;
                }
                sf3.sf("Content-Type", "application/json; charset=utf-8");
                sf3.sf("User-Agent", com.bytedance.sdk.openadsdk.utils.kun.oo());
                sf3.pcc(jSONObject);
                sf3.pcc(6);
                sf3.sf("send_i_p_v6");
                sf3.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.4
                    @Override // com.bytedance.sdk.component.qf.pcc.pcc
                    public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                        if (sfVar.wh()) {
                            tmg.sf(sfVar.oo(), gpj, gmVar, list);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, gpj, sfVar.pcc(), sfVar.sf());
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", gpj, sfVar.pcc(), sfVar.sf(), sf3.gm(), list);
                        if (!sf2) {
                            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.4.1
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                    pccVar.sf("ipv6");
                                    return pccVar;
                                }
                            });
                        }
                        tmg.oo();
                    }

                    @Override // com.bytedance.sdk.component.qf.pcc.pcc
                    public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                        if (iOException != null) {
                            com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, gpj, 1, iOException.getMessage());
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", gpj, -1, iOException.getMessage(), sf3.gm(), list);
                            if (!sf2) {
                                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.1.4.2
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                        pccVar.sf("ipv6");
                                        return pccVar;
                                    }
                                });
                            }
                        }
                        tmg.oo();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5 A[Catch: JSONException -> 0x0170, TryCatch #0 {JSONException -> 0x0170, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x002f, B:11:0x0038, B:13:0x0046, B:25:0x0098, B:27:0x00af, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:38:0x00d8, B:40:0x00ec, B:43:0x00f5, B:45:0x00fb, B:47:0x0115, B:50:0x011e, B:52:0x0132, B:55:0x0069, B:58:0x0073, B:61:0x007d, B:64:0x013b, B:66:0x0167), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void sf(String str, String str2, com.bytedance.sdk.component.qf.sf.gm gmVar, List<String> list) {
        char c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("cypher");
            boolean sf2 = com.bytedance.sdk.openadsdk.utils.sf.sf();
            if (optInt != 4) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -4, "cypher type error", gmVar.gm(), list);
                if (sf2) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.3
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("ipv6");
                        return pccVar;
                    }
                });
                return;
            }
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString("message"));
            if (decryptType4.second != null) {
                JSONObject jSONObject2 = new JSONObject((String) decryptType4.second);
                String optString = jSONObject2.optString("ip_type");
                int hashCode = optString.hashCode();
                if (hashCode == 3239397) {
                    if (optString.equals("ipv4")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3239399) {
                    if (hashCode == 1959784951 && optString.equals("invalid")) {
                        c = 2;
                        if (c != 0) {
                            if (jSONObject2.has("ip")) {
                                String optString2 = jSONObject2.optString("ip");
                                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, optString2);
                                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", "key_ipv4");
                                HashMap hashMap = new HashMap();
                                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, optString2);
                                com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(hashMap);
                                com.bytedance.sdk.openadsdk.dax.oo.pcc(1, str2);
                                if (sf2) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.5
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                        pccVar.sf("ipv6");
                                        return pccVar;
                                    }
                                });
                                return;
                            }
                            com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 4, "no ip");
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -6, "no ip", gmVar.gm(), list);
                            if (sf2) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.6
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                    pccVar.sf("ipv6");
                                    return pccVar;
                                }
                            });
                            return;
                        }
                        if (c != 1) {
                            if (c != 2) {
                                com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 3, "no ip type ");
                                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -7, "no ip type ", gmVar.gm(), list);
                                if (sf2) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.9
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                        pccVar.sf("ipv6");
                                        return pccVar;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (jSONObject2.has("ip")) {
                            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                            com.bytedance.sdk.openadsdk.dax.oo.pcc(1, str2);
                            if (sf2) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.7
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                    pccVar.sf("ipv6");
                                    return pccVar;
                                }
                            });
                            return;
                        }
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 4, "no ip");
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -6, "no ip", gmVar.gm(), list);
                        if (sf2) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.8
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("ipv6");
                                return pccVar;
                            }
                        });
                        return;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (optString.equals("ipv6")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            } else {
                int intValue = ((Integer) decryptType4.first).intValue();
                com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 2, "decrypt failed ".concat(String.valueOf(intValue)));
                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(intValue)), gmVar.gm(), list);
                if (sf2) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.4
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("ipv6");
                        return pccVar;
                    }
                });
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("ipv6", str2, -8, "decrypt failed, wrong data ", gmVar.gm(), list);
            if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                return;
            }
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.tmg.10
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("ipv6");
                    return pccVar;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm() {
        pcc.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oo() {
        if (pcc.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.rnn.pcc().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tmg.2
                @Override // java.lang.Runnable
                public void run() {
                    tmg.sf(hc.pcc(lu.pcc()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    private static class pcc implements jsj.pcc {
        private static final AtomicBoolean pcc = new AtomicBoolean(false);
        private static volatile long sf = -1;

        private pcc() {
        }

        public static void pcc() {
            if (pcc.compareAndSet(false, true)) {
                sf = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.jsj.pcc(new pcc(), lu.pcc());
            }
        }

        public void sf() {
            com.bytedance.sdk.component.utils.jsj.pcc(this);
        }

        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - sf >= 2000 && i != 0) {
                tmg.gm();
                tmg.sf(hc.pcc(lu.pcc()));
                sf();
            }
        }
    }
}
