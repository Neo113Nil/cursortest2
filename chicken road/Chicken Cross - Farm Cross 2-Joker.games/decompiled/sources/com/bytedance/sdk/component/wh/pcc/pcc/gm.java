package com.bytedance.sdk.component.wh.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class gm implements oo {
    private com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.sf gm;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc kj;
    private qf oo;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc ork;
    private com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.oo pcc;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc qf;
    private com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc sf;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc tmg;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vh;
    private com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.wh vj;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vy;
    private com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.vj wh;

    public gm() {
        Context vj = com.bytedance.sdk.component.wh.pcc.qf.wh().vj();
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
            this.qf = com.bytedance.sdk.component.wh.pcc.qf.wh().vh();
            this.pcc = new com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.oo(vj, this.qf);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
            if (com.bytedance.sdk.component.wh.pcc.qf.wh().vy() != null) {
                this.vy = com.bytedance.sdk.component.wh.pcc.qf.wh().vy();
            } else {
                this.vy = com.bytedance.sdk.component.wh.pcc.qf.wh().tmg();
            }
            this.gm = new com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.sf(vj, this.vy);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
            this.kj = com.bytedance.sdk.component.wh.pcc.qf.wh().tmg();
            this.sf = new com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc(vj, this.kj);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
            this.ork = com.bytedance.sdk.component.wh.pcc.qf.wh().tmg();
            this.oo = new qf(vj, this.ork);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
            this.vh = com.bytedance.sdk.component.wh.pcc.qf.wh().hc();
            this.vj = new com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.wh(vj, this.vh);
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
            this.tmg = com.bytedance.sdk.component.wh.pcc.qf.wh().gbb();
            this.wh = new com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.vj(vj, this.tmg);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        if (pccVar == null) {
            return;
        }
        try {
            pccVar.sf(System.currentTimeMillis());
            if (pccVar.oo() == 0 && pccVar.vj() == 1) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
                    this.pcc.pcc(pccVar);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 3 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
                    this.gm.pcc(pccVar);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 0 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
                    this.sf.pcc(pccVar);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 1 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
                    this.oo.pcc(pccVar);
                }
            } else if (pccVar.oo() == 1 && pccVar.vj() == 3) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
                    this.vj.pcc(pccVar);
                }
            } else if (pccVar.oo() == 2 && pccVar.vj() == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
                this.wh.pcc(pccVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.pq(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(int i, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.ptr(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.qcw(), list.size());
            }
            if (pccVar.oo() == 0 && pccVar.vj() == 1) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
                    this.pcc.sf(list);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 3 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
                    this.gm.sf(list);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 0 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
                    this.sf.sf(list);
                    return;
                }
                return;
            }
            if (pccVar.oo() == 1 && pccVar.vj() == 2) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
                    this.oo.sf(list);
                }
            } else if (pccVar.oo() == 1 && pccVar.vj() == 3) {
                if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
                    this.vj.sf(list);
                }
            } else if (pccVar.oo() == 2 && pccVar.vj() == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
                this.wh.sf(list);
            }
        }
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        if (pccVar.oo() == 0 && pccVar.vj() == 1 && com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
            if (this.qf.sf() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc = this.pcc.pcc(this.qf.sf() - i, "_id");
            if (pcc != null && pcc.size() != 0) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tsz(), 1);
            }
            return pcc;
        }
        if (pccVar.oo() == 3 && pccVar.vj() == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
            if (this.vy.sf() > i) {
                return this.gm.pcc(this.vy.sf() - i, "_id");
            }
        } else if (pccVar.oo() == 0 && pccVar.vj() == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
            if (this.kj.sf() > i) {
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc2 = this.sf.pcc(this.kj.sf() - i, "_id");
                if (pcc2 != null && pcc2.size() != 0) {
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.mk(), 1);
                }
                return pcc2;
            }
        } else if (pccVar.oo() == 1 && pccVar.vj() == 2 && com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
            if (this.ork.sf() > i) {
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc3 = this.oo.pcc(this.ork.sf() - i, "_id");
                if (pcc3 != null && pcc3.size() != 0) {
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.atb(), 1);
                }
                return pcc3;
            }
        } else if (pccVar.oo() == 1 && pccVar.vj() == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
            if (this.vh.sf() > i) {
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc4 = this.vj.pcc(this.vh.sf() - i, "_id");
                if (pcc4 != null && pcc4.size() != 0) {
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.ye(), 1);
                }
                return pcc4;
            }
        } else if (pccVar.oo() == 2 && pccVar.vj() == 3 && com.bytedance.sdk.component.wh.pcc.sf.pcc.wh() && this.tmg.sf() > i) {
            return this.wh.pcc(this.tmg.sf() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc()) {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc = this.pcc.pcc("_id");
            if (pcc(pcc, list)) {
                pcc.size();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.of(), 1);
                return pcc;
            }
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj()) {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc2 = this.gm.pcc("_id");
            if (pcc(pcc2, list)) {
                pcc2.size();
                return pcc2;
            }
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf()) {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc3 = this.sf.pcc("_id");
            if (pcc(pcc3, list)) {
                pcc3.size();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.yt(), 1);
                return pcc3;
            }
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm()) {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf = this.oo.sf("_id");
            if (pcc(sf, list)) {
                sf.size();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.qy(), 1);
                return sf;
            }
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.oo()) {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf2 = this.vj.sf("_id");
            if (pcc(sf2, list)) {
                sf2.size();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.jsj(), 1);
                return sf2;
            }
        }
        if (!com.bytedance.sdk.component.wh.pcc.sf.pcc.wh()) {
            return null;
        }
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf3 = this.wh.sf("_id");
        if (!pcc(sf3, list)) {
            return null;
        }
        sf3.size();
        return sf3;
    }

    private boolean pcc(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.wh.pcc.oo.pcc next = it.next();
                    if (next != null) {
                        String gm = next.gm();
                        if (!TextUtils.isEmpty(gm) && list2.contains(gm)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public boolean pcc(int i, boolean z) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.vj vjVar;
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.wh whVar;
        qf qfVar;
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc pccVar;
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.sf sfVar;
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.oo ooVar;
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc() && (ooVar = this.pcc) != null && ooVar.pcc(i)) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.gbb(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.vj() && (sfVar = this.gm) != null && sfVar.pcc(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.sf() && (pccVar = this.sf) != null && pccVar.pcc(i)) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.jr(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.wh.pcc.sf.pcc.gm() && (qfVar = this.oo) != null && qfVar.pcc(i)) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.dax(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.wh.pcc.sf.pcc.oo() || (whVar = this.vj) == null || !whVar.pcc(i)) {
            return com.bytedance.sdk.component.wh.pcc.sf.pcc.wh() && (vjVar = this.wh) != null && vjVar.pcc(i);
        }
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.nac(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(int i, long j) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(i, j);
        }
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.sf sfVar = this.gm;
        if (sfVar != null) {
            sfVar.pcc(i, j);
        }
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.pcc(i, j);
        }
        qf qfVar = this.oo;
        if (qfVar != null) {
            qfVar.pcc(i, j);
        }
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.wh whVar = this.vj;
        if (whVar != null) {
            whVar.pcc(i, j);
        }
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.vj vjVar = this.wh;
        if (vjVar != null) {
            vjVar.pcc(i, j);
        }
    }
}
