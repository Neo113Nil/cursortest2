package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.sdk.component.sf.pcc.oo {
    public static volatile ork pcc;
    private ExecutorService oo;
    private List<com.bytedance.sdk.component.sf.pcc.sf> sf = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.sf.pcc.sf> gm = new CopyOnWriteArrayList();

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public int pcc() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public void pcc(int i) {
    }

    public pcc(ExecutorService executorService) {
        this.oo = executorService;
    }

    public static void pcc(ork orkVar) {
        pcc = orkVar;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public ExecutorService sf() {
        ExecutorService pcc2 = pcc != null ? pcc.pcc() : null;
        return pcc2 != null ? pcc2 : this.oo;
    }

    public boolean vj() {
        return (pcc == null || pcc.pcc() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public List<com.bytedance.sdk.component.sf.pcc.sf> gm() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public List<com.bytedance.sdk.component.sf.pcc.sf> oo() {
        return this.gm;
    }
}
