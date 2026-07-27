package com.bytedance.sdk.component.wh.pcc.pcc;

import com.bytedance.sdk.component.wh.pcc.qf;
import java.util.List;
import java.util.Queue;

/* loaded from: classes4.dex */
public class wh implements oo {
    private Queue<String> gbb;
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.pcc gm;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc hc;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc kj;
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.sf oo;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc ork;
    vj pcc = qf.wh().gm();
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.wh qf;
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.vj sf;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc tmg;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vh;
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.qf vj;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vy;
    private com.bytedance.sdk.component.wh.pcc.pcc.sf.gm wh;

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(int i, long j) {
    }

    public wh(Queue<String> queue) {
        this.gbb = queue;
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
            this.kj = qf.wh().vh();
            this.sf = new com.bytedance.sdk.component.wh.pcc.pcc.sf.vj(this.kj, queue);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
            if (qf.wh().vy() != null) {
                this.ork = qf.wh().vy();
            } else {
                this.ork = qf.wh().tmg();
            }
            this.oo = new com.bytedance.sdk.component.wh.pcc.pcc.sf.sf(this.ork, queue);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
            this.vy = qf.wh().tmg();
            this.gm = new com.bytedance.sdk.component.wh.pcc.pcc.sf.pcc(this.vy, queue);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
            this.vh = qf.wh().tmg();
            this.vj = new com.bytedance.sdk.component.wh.pcc.pcc.sf.qf(this.vh, queue);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
            this.tmg = qf.wh().hc();
            this.wh = new com.bytedance.sdk.component.wh.pcc.pcc.sf.gm(this.tmg, queue);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
            this.hc = qf.wh().gbb();
            this.qf = new com.bytedance.sdk.component.wh.pcc.pcc.sf.wh(this.hc, queue);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        try {
            byte oo = pccVar.oo();
            byte vj = pccVar.vj();
            if (oo == 0 && vj == 1 && com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
                this.sf.pcc(pccVar);
                return;
            }
            if (oo == 3 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
                this.oo.pcc(pccVar);
                return;
            }
            if (oo == 0 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
                this.gm.pcc(pccVar);
                return;
            }
            if (oo == 1 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
                this.vj.pcc(pccVar);
                return;
            }
            if (oo == 1 && vj == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
                this.wh.pcc(pccVar);
            } else if (oo == 2 && vj == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
                this.qf.pcc(pccVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(int i, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar = list.get(0);
        byte vj = pccVar.vj();
        byte oo = pccVar.oo();
        if (oo == 0 && vj == 1 && com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
            this.sf.pcc(i, list);
            return;
        }
        if (oo == 3 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
            this.oo.pcc(i, list);
            return;
        }
        if (oo == 0 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
            this.gm.pcc(i, list);
            return;
        }
        if (oo == 1 && vj == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
            this.vj.pcc(i, list);
            return;
        }
        if (oo == 1 && vj == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
            this.wh.pcc(i, list);
        } else if (oo == 2 && vj == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
            this.qf.pcc(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc;
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc2;
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc3;
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc4;
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc5;
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc6;
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc() && this.sf.sf(i, i2) && (pcc6 = this.sf.pcc(i, i2)) != null && pcc6.size() != 0) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.lu(), 1);
            return pcc6;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj() && this.oo.sf(i, i2) && (pcc5 = this.oo.pcc(i, i2)) != null && pcc5.size() != 0) {
            return pcc5;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf() && this.gm.sf(i, i2) && (pcc4 = this.gm.pcc(i, i2)) != null && pcc4.size() != 0) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.gpj(), 1);
            return pcc4;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm() && this.vj.sf(i, i2) && (pcc3 = this.vj.pcc(i, i2)) != null && pcc3.size() != 0) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.lo(), 1);
            return pcc3;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo() && this.wh.sf(i, i2) && (pcc2 = this.wh.pcc(i, i2)) != null && pcc2.size() != 0) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.fum(), 1);
            return pcc2;
        }
        if (!com.bytedance.sdk.component.wh.pcc.sf.pcc.wh() || !this.qf.sf(i, i2) || (pcc = this.qf.pcc(i, i2)) == null || pcc.size() == 0) {
            return null;
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public boolean pcc(int i, boolean z) {
        com.bytedance.sdk.component.wh.pcc.pcc.sf.wh whVar;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar;
        com.bytedance.sdk.component.wh.pcc.pcc.sf.gm gmVar;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar2;
        com.bytedance.sdk.component.wh.pcc.pcc.sf.qf qfVar;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar3;
        com.bytedance.sdk.component.wh.pcc.pcc.sf.pcc pccVar4;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar5;
        com.bytedance.sdk.component.wh.pcc.pcc.sf.sf sfVar;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar6;
        com.bytedance.sdk.component.wh.pcc.pcc.sf.vj vjVar;
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar7;
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc() && (vjVar = this.sf) != null && (pccVar7 = this.kj) != null && vjVar.sf(i, pccVar7.pcc())) {
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj() && (sfVar = this.oo) != null && (pccVar6 = this.ork) != null && sfVar.sf(i, pccVar6.pcc())) {
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf() && (pccVar4 = this.gm) != null && (pccVar5 = this.vy) != null && pccVar4.sf(i, pccVar5.pcc())) {
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm() && (qfVar = this.vj) != null && (pccVar3 = this.vh) != null && qfVar.sf(i, pccVar3.pcc())) {
            return true;
        }
        if (!com.bytedance.sdk.component.wh.pcc.sf.pcc.oo() || (gmVar = this.wh) == null || (pccVar2 = this.tmg) == null || !gmVar.sf(i, pccVar2.pcc())) {
            return com.bytedance.sdk.component.wh.pcc.sf.pcc.wh() && (whVar = this.qf) != null && (pccVar = this.hc) != null && whVar.sf(i, pccVar.pcc());
        }
        return true;
    }
}
