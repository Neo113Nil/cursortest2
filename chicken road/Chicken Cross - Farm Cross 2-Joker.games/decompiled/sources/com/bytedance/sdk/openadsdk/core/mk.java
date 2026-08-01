package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class mk {
    public static ConcurrentHashMap<Integer, mk> pcc = new ConcurrentHashMap<>();
    private int oo;
    private int vj;
    private String wh;
    private String sf = "";
    private String gm = "";

    public String pcc() {
        return this.wh;
    }

    public String sf() {
        return this.sf;
    }

    public String gm() {
        return this.gm;
    }

    public int oo() {
        return this.oo;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public int vj() {
        return this.vj;
    }

    public void sf(int i) {
        this.vj = i;
    }

    private void wh() {
        this.sf = "";
        this.gm = "";
        this.oo = 0;
        this.vj = 0;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar != null) {
            String qxv = ofVar.qxv();
            if (!TextUtils.isEmpty(qxv)) {
                this.wh = qxv;
            }
            String xy = ofVar.xy();
            if (TextUtils.isEmpty(xy) && ofVar.on()) {
                xy = ofVar.ibs().vy();
            }
            if (!TextUtils.isEmpty(xy)) {
                String[] split = xy.split("/");
                if (split.length >= 3) {
                    this.sf = split[2];
                }
            }
            if (ofVar.xfm() == null || TextUtils.isEmpty(ofVar.xfm().gm())) {
                return;
            }
            this.gm = ofVar.xfm().gm();
        }
    }

    public static void sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null || TextUtils.isEmpty(ofVar.hl())) {
            return;
        }
        Integer valueOf = Integer.valueOf(ofVar.kot());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (pcc == null) {
            pcc = new ConcurrentHashMap<>();
        }
        mk mkVar = pcc.containsKey(valueOf) ? pcc.get(valueOf) : null;
        if (mkVar == null) {
            mkVar = new mk();
        }
        String qxv = ofVar.qxv();
        if (TextUtils.isEmpty(qxv) || !qxv.equals(mkVar.pcc())) {
            mkVar.wh();
            mkVar.pcc(ofVar);
            pcc.put(valueOf, mkVar);
        }
    }

    public static void gm(int i) {
        mk mkVar;
        if (i == 0) {
            return;
        }
        if (pcc == null) {
            pcc = new ConcurrentHashMap<>();
        }
        if (!pcc.containsKey(Integer.valueOf(i)) || (mkVar = pcc.get(Integer.valueOf(i))) == null) {
            return;
        }
        mkVar.sf(1);
    }

    public static void gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        mk mkVar;
        if (ofVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(ofVar.kot());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (pcc == null) {
            pcc = new ConcurrentHashMap<>();
        }
        if (!pcc.containsKey(valueOf) || (mkVar = pcc.get(valueOf)) == null) {
            return;
        }
        mkVar.pcc(1);
    }
}
