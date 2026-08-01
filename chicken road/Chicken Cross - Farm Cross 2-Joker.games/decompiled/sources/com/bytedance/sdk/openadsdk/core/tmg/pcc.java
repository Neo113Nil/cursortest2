package com.bytedance.sdk.openadsdk.core.tmg;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
class pcc {
    private volatile boolean gm = true;
    private volatile boolean oo = false;
    private PglSSManager pcc;
    private volatile boolean sf;

    public pcc() {
        pcc();
    }

    public synchronized void pcc() {
        Context pcc;
        String oo;
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        if (!this.sf) {
            try {
                pcc = lu.pcc();
                oo = ork.sf().oo();
                if (TextUtils.isEmpty(oo)) {
                    oo = ork.pcc("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                ork();
                this.sf = false;
            }
            if (TextUtils.isEmpty(oo)) {
                return;
            }
            String pcc2 = hc.pcc(pcc);
            String sf = com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf();
            PglSSConfig build = PglSSConfig.builder().setAppId(oo).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(sf2)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, sf2);
            }
            Set<String> vd = vh.sf().vd();
            if (vd != null && !vd.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, vd);
            }
            String lu = kun.lu();
            if (!TextUtils.isEmpty(lu)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, lu);
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                Set<String> gga = vh.sf().gga();
                if (gga != null && !gga.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, gga);
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, vh.sf().rc());
            String pcc3 = vj.pcc(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(pcc3)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, pcc3);
            }
            build.setCustomInfo(hashMap);
            new Object[]{"init sec sdk, custom info is:", hashMap};
            build.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    oo.pcc(str, false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.1.1
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(str).sf(str2);
                        }
                    });
                }
            });
            PglSSManager.init(pcc, build, null, null, pcc2, sf);
            vy();
            this.sf = true;
            try {
                if (this.gm) {
                    gm(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                lo.gm("mssdk", th.getMessage());
            }
        }
    }

    public boolean sf() {
        return this.sf;
    }

    private boolean kj() {
        if (!this.sf && this.gm) {
            pcc();
        }
        return this.sf;
    }

    private void vy() {
        if (this.pcc == null) {
            this.pcc = PglSSManager.getInstance();
        }
    }

    public void pcc(String str) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void pcc(final Map<String, Object> map) {
        if (kj()) {
            vy();
            if (this.pcc != null) {
                jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            pcc.this.pcc.setCustomInfo(map);
                            new Object[]{"map param custom info is: ", map};
                        } catch (Throwable th) {
                            lo.gm("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void gm() {
        if (kj()) {
            vy();
            if (this.pcc != null) {
                jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, lu.oo().fum());
                            pcc.this.pcc.setCustomInfo(hashMap);
                            new Object[]{"custom info is: ", hashMap};
                        } catch (Throwable th) {
                            lo.gm("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void sf(String str) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public void pcc(String str, Map<String, Object> map) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public String oo() {
        String sf = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("sec_token", "");
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                String token = pglSSManager.getToken();
                if (!TextUtils.isEmpty(token) && !TextUtils.equals(sf, token)) {
                    com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("sec_token", token);
                }
                return token;
            }
        }
        return sf;
    }

    public String vj() {
        if (!kj()) {
            return "";
        }
        vy();
        PglSSManager pglSSManager = this.pcc;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public long wh() {
        if (!kj()) {
            return 0L;
        }
        vy();
        PglSSManager pglSSManager = this.pcc;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public void pcc(MotionEvent motionEvent) {
        if (sf()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int qf() {
        if (this.gm) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public Map<String, String> pcc(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!kj() || (featureHash = this.pcc.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    private Class ork() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.gm = true;
        } catch (Throwable unused2) {
            this.gm = false;
            return cls;
        }
        return cls;
    }

    private void gm(final String str) {
        if (this.oo || TextUtils.isEmpty(str)) {
            return;
        }
        lu.vj().pcc(new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("secsdk_init_error").sf(str);
            }
        }, false);
        this.oo = true;
    }
}
