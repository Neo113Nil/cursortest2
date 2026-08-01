package com.bytedance.sdk.openadsdk.oo.pcc;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ork {
    public static ork pcc = new ork();
    private final Map<String, pcc> gm = new HashMap();
    private volatile boolean oo;
    private pcc sf;

    private int sf() {
        pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.pcc();
        }
        return 3;
    }

    private int gm() {
        pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.sf();
        }
        return 30;
    }

    public void pcc(pcc pccVar) {
        this.sf = pccVar;
    }

    public void pcc(String str, pcc pccVar) {
        if (TextUtils.isEmpty(str) || pccVar == null) {
            return;
        }
        this.gm.put(str, pccVar);
    }

    public int pcc(String str) {
        if (!pcc()) {
            return 4;
        }
        pcc pccVar = this.gm.get(str);
        if (pccVar == null) {
            return sf();
        }
        return pccVar.pcc();
    }

    public int sf(String str) {
        pcc pccVar = this.gm.get(str);
        if (pccVar == null) {
            return gm();
        }
        return pccVar.sf();
    }

    public boolean pcc() {
        return this.oo;
    }

    public void pcc(boolean z) {
        this.oo = z;
    }

    public static class pcc {
        private final int pcc;
        private final int sf;

        public pcc(int i, int i2) {
            this.pcc = (i < 0 || i > 5) ? 3 : i;
            this.sf = i2 < 10 ? 30 : i2;
        }

        public int pcc() {
            return this.pcc;
        }

        public int sf() {
            return this.sf;
        }
    }
}
