package com.bytedance.sdk.component.vj.sf.gm;

import com.bytedance.sdk.component.vj.vh;
import java.util.Map;

/* loaded from: classes4.dex */
public class oo<T> implements vh {
    private T gm;
    private boolean kj;
    private T oo;
    private com.bytedance.sdk.component.vj.qf ork;
    private String pcc;
    private Map<String, String> qf;
    private String sf;
    private int vh;
    private int vj;
    private boolean vy;
    private int wh;

    public oo pcc(gm gmVar, T t) {
        this.gm = t;
        this.pcc = gmVar.kj();
        this.sf = gmVar.pcc();
        this.vj = gmVar.sf();
        this.wh = gmVar.gm();
        this.vy = gmVar.tmg();
        this.ork = gmVar.gbb();
        this.vh = gmVar.jr();
        return this;
    }

    public oo pcc(gm gmVar, T t, Map<String, String> map, boolean z) {
        this.qf = map;
        this.kj = z;
        return pcc(gmVar, t);
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public String pcc() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public T sf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public T gm() {
        return this.oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.vj.vh
    public void pcc(Object obj) {
        this.oo = this.gm;
        this.gm = obj;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public Map<String, String> oo() {
        return this.qf;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public boolean vj() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public boolean wh() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public int qf() {
        return this.vh;
    }
}
