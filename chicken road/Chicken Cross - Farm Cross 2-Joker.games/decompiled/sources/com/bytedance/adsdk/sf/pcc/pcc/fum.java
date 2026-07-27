package com.bytedance.adsdk.sf.pcc.pcc;

import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class fum implements gm, pcc.InterfaceC0101pcc {
    private final List<pcc.InterfaceC0101pcc> gm = new ArrayList();
    private final gpj.pcc oo;
    private final String pcc;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> qf;
    private final boolean sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> wh;

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
    }

    public fum(com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.gpj gpjVar) {
        this.pcc = gpjVar.pcc();
        this.sf = gpjVar.wh();
        this.oo = gpjVar.sf();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = gpjVar.oo().pcc();
        this.vj = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc2 = gpjVar.gm().pcc();
        this.wh = pcc2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc3 = gpjVar.vj().pcc();
        this.qf = pcc3;
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pccVar.pcc(pcc3);
        pcc.pcc(this);
        pcc2.pcc(this);
        pcc3.pcc(this);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        for (int i = 0; i < this.gm.size(); i++) {
            this.gm.get(i).pcc();
        }
    }

    void pcc(pcc.InterfaceC0101pcc interfaceC0101pcc) {
        this.gm.add(interfaceC0101pcc);
    }

    gpj.pcc sf() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> gm() {
        return this.vj;
    }

    public com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> oo() {
        return this.wh;
    }

    public com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vj() {
        return this.qf;
    }

    public boolean wh() {
        return this.sf;
    }
}
