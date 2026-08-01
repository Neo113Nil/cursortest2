package com.bytedance.sdk.component.wh.pcc.oo.pcc;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.sdk.component.wh.pcc.oo.pcc {
    private byte gm;
    private String kj;
    private byte oo;
    private String ork;
    protected JSONObject pcc;
    private long qf;
    private sf sf;
    private int vh;
    private long vj;
    private byte vy;
    private long wh;

    public pcc(String str, JSONObject jSONObject) {
        this.kj = str;
        this.pcc = jSONObject;
    }

    public pcc(String str, sf sfVar) {
        this.kj = str;
        this.sf = sfVar;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public sf pcc() {
        return this.sf;
    }

    private pcc() {
    }

    public String ork() {
        return this.ork;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public synchronized JSONObject wh() {
        sf sfVar;
        if (this.pcc == null && (sfVar = this.sf) != null) {
            this.pcc = sfVar.pcc(ork());
        }
        return this.pcc;
    }

    public void pcc(byte b) {
        this.vy = b;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte sf() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public String gm() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte oo() {
        return this.gm;
    }

    public void sf(byte b) {
        this.gm = b;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void pcc(long j) {
        this.vj = j;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public long qf() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void sf(long j) {
        this.wh = j;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public long kj() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void gm(long j) {
        this.qf = j;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public int vy() {
        return this.vh;
    }

    public void pcc(int i) {
        this.vh = i;
    }

    public void gm(byte b) {
        this.oo = b;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte vj() {
        return this.oo;
    }
}
