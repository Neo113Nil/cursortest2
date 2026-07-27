package com.bykv.vk.openvk.pcc.pcc.sf.gm;

import com.bykv.vk.openvk.pcc.pcc.sf.gm.gm;

/* loaded from: classes5.dex */
public abstract class pcc implements gm {
    private gm.sf gm;
    private gm.oo kj;
    private gm.pcc oo;
    protected boolean pcc = false;
    private gm.InterfaceC0096gm qf;
    private gm.vj sf;
    private gm.wh vj;
    private gm.qf wh;

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.vj vjVar) {
        this.sf = vjVar;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.sf sfVar) {
        this.gm = sfVar;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.pcc pccVar) {
        this.oo = pccVar;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.wh whVar) {
        this.vj = whVar;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.InterfaceC0096gm interfaceC0096gm) {
        this.qf = interfaceC0096gm;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.oo ooVar) {
        this.kj = ooVar;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public final void pcc(gm.qf qfVar) {
        this.wh = qfVar;
    }

    public void pcc() {
        this.sf = null;
        this.oo = null;
        this.gm = null;
        this.vj = null;
        this.wh = null;
        this.qf = null;
        this.kj = null;
    }

    protected final void sf() {
        try {
            gm.vj vjVar = this.sf;
            if (vjVar != null) {
                vjVar.sf(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void gm() {
        try {
            gm.sf sfVar = this.gm;
            if (sfVar != null) {
                sfVar.pcc(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void pcc(int i) {
        try {
            gm.pcc pccVar = this.oo;
            if (pccVar != null) {
                pccVar.pcc(this, i);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void oo() {
        try {
            gm.wh whVar = this.vj;
            if (whVar != null) {
                whVar.gm(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void pcc(int i, int i2, int i3, int i4) {
        try {
            gm.qf qfVar = this.wh;
            if (qfVar != null) {
                qfVar.pcc(this, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean pcc(int i, int i2) {
        try {
            gm.InterfaceC0096gm interfaceC0096gm = this.qf;
            if (interfaceC0096gm != null) {
                if (interfaceC0096gm.pcc(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean sf(int i, int i2) {
        try {
            gm.oo ooVar = this.kj;
            if (ooVar != null) {
                if (ooVar.sf(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(boolean z) {
        this.pcc = z;
    }
}
