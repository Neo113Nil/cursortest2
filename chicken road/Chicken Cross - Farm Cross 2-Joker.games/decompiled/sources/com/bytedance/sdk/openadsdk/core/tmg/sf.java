package com.bytedance.sdk.openadsdk.core.tmg;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class sf {
    private static com.bytedance.sdk.openadsdk.core.tmg.pcc pcc;

    private sf() {
        pcc = new com.bytedance.sdk.openadsdk.core.tmg.pcc();
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar;
        if (TextUtils.isEmpty(str) || (pccVar = pcc) == null) {
            return;
        }
        pccVar.pcc(str);
    }

    public void sf(String str) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar;
        if (TextUtils.isEmpty(str) || (pccVar = pcc) == null) {
            return;
        }
        pccVar.sf(str);
    }

    public void pcc(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(map);
        }
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    public static sf sf() {
        return pcc.pcc;
    }

    public void pcc(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(str, map);
        }
    }

    public boolean gm() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar == null) {
            return false;
        }
        return pccVar.sf();
    }

    public String oo() {
        String oo;
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        return (pccVar == null || (oo = pccVar.oo()) == null) ? "" : oo;
    }

    public Map<String, String> pcc(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.pcc(str, bArr);
        }
        return new HashMap();
    }

    public String vj() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.vj();
        }
        return "";
    }

    public long wh() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return 0L;
    }

    public int qf() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.qf();
        }
        return 1;
    }

    public void pcc(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(motionEvent);
        }
    }

    private static class pcc {
        private static final sf pcc = new sf();
    }
}
