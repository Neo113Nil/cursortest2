package com.bytedance.sdk.component.vj.pcc;

import com.bytedance.sdk.component.vj.qf;
import com.bytedance.sdk.component.vj.wh;
import java.util.Map;

/* loaded from: classes4.dex */
public class gm<T> implements wh {
    private T gm;
    private String oo;
    Map<String, String> pcc;
    private int sf;
    private qf vj;

    public gm(int i, T t, String str) {
        this.sf = i;
        this.gm = t;
        this.oo = str;
    }

    public gm(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.pcc = map;
    }

    public void pcc(qf qfVar) {
        this.vj = qfVar;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public int pcc() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public T sf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public String gm() {
        return this.oo;
    }
}
