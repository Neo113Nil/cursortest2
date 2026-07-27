package com.bytedance.sdk.openadsdk.dax.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;

/* loaded from: classes4.dex */
public class sf {
    private String gm;
    private int oo;
    private String pcc;
    private int qf;
    private of sf;
    private boolean vj;
    private String wh;
    private int kj = 0;
    private int vy = 0;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public of sf() {
        return this.sf;
    }

    public void pcc(of ofVar) {
        this.sf = ofVar;
    }

    public String gm() {
        of ofVar;
        if (TextUtils.isEmpty(this.gm) && (ofVar = this.sf) != null) {
            this.gm = kun.pcc(ofVar);
        }
        return this.gm;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public int oo() {
        return this.oo;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public boolean vj() {
        return this.vj;
    }

    public void pcc(boolean z) {
        this.vj = z;
    }

    public String wh() {
        return this.wh;
    }

    public void gm(String str) {
        this.wh = str;
    }

    public int qf() {
        return this.qf;
    }

    public void sf(int i) {
        this.qf = i;
    }

    public int kj() {
        return this.kj;
    }

    public int vy() {
        return this.vy;
    }
}
