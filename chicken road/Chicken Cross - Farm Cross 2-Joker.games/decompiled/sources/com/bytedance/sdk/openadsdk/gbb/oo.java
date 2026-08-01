package com.bytedance.sdk.openadsdk.gbb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oo.hc;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class oo {
    private volatile boolean gm;
    private volatile long oo;
    private String pcc;
    private hc sf;
    private final HashSet<String> vj = new HashSet<>();

    public oo(hc hcVar) {
        this.sf = hcVar;
    }

    public void pcc(String str) {
        hc hcVar;
        if (oo() && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.pcc)) {
                this.pcc = str;
            }
            if (gm(str) && !this.vj.contains(str)) {
                this.vj.add(str);
                boolean sf = sf();
                boolean vj = vj();
                long currentTimeMillis = sf ? System.currentTimeMillis() - this.oo : -1L;
                if (vj || (hcVar = this.sf) == null) {
                    return;
                }
                hcVar.pcc(this.pcc, str, currentTimeMillis);
            }
        }
    }

    public void sf(String str) {
        hc hcVar;
        if (oo() && !TextUtils.isEmpty(str) && gm(str) && !this.vj.contains(str)) {
            this.vj.add(str);
            boolean sf = sf();
            boolean vj = vj();
            boolean oo = oo(str);
            long currentTimeMillis = sf ? System.currentTimeMillis() - this.oo : -1L;
            if (!oo || vj || (hcVar = this.sf) == null) {
                return;
            }
            hcVar.pcc(this.pcc, str, currentTimeMillis);
        }
    }

    public void pcc() {
        if (oo()) {
            this.oo = System.currentTimeMillis();
            this.gm = true;
        }
    }

    public boolean sf() {
        return this.gm;
    }

    public void gm() {
        this.pcc = null;
        this.oo = 0L;
        this.gm = false;
        this.vj.clear();
    }

    public boolean oo() {
        return com.bytedance.sdk.openadsdk.utils.sf.vj();
    }

    private boolean gm(String str) {
        if (str != null) {
            return str.startsWith("intent://") || str.startsWith("market://") || str.contains("play.google.com/store");
        }
        return false;
    }

    private boolean vj() {
        return this.gm && this.oo != 0 && System.currentTimeMillis() - this.oo <= 5000;
    }

    private boolean oo(String str) {
        return !TextUtils.equals(this.pcc, str);
    }
}
