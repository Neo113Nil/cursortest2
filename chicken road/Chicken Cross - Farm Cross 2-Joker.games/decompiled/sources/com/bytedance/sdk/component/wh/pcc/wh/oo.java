package com.bytedance.sdk.component.wh.pcc.wh;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public class oo {
    private final boolean gm;
    private String kj;
    private final String pcc;
    private String qf;
    private final String sf;
    private boolean tmg;
    private boolean vh;
    private final int vj;
    private final String wh;
    private int oo = -1;
    private int vy = 0;
    private String ork = null;

    public oo(String str, String str2, boolean z, int i, String str3) {
        this.pcc = str;
        this.sf = str2;
        this.gm = z;
        this.vj = i;
        this.wh = str3;
    }

    public String pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public boolean gm() {
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

    public String wh() {
        return this.wh;
    }

    public void pcc(String str) {
        this.qf = str;
    }

    public String qf() {
        return this.qf;
    }

    public void sf(int i) {
        this.vy = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.qf)) {
            this.qf = String.valueOf(this.vy);
        } else {
            this.qf += "," + this.vy;
        }
    }

    public int kj() {
        return this.vy;
    }

    public void sf(String str) {
        this.kj = str;
    }

    public String vy() {
        return this.kj;
    }

    public void gm(String str) {
        this.ork = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.kj)) {
            this.kj = String.valueOf(this.ork);
        } else {
            this.kj += "," + this.ork;
        }
    }

    public void pcc(boolean z) {
        this.vh = z;
    }

    public boolean ork() {
        return this.vh;
    }

    public Runnable pcc(String str, Map<String, String> map) {
        return pcc.pcc().pcc(this, str, map);
    }

    public boolean vh() {
        return this.oo == -1;
    }

    public void sf(boolean z) {
        this.tmg = z;
    }

    public boolean tmg() {
        return this.tmg;
    }
}
