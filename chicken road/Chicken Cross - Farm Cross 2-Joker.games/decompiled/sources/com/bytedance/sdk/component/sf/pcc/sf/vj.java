package com.bytedance.sdk.component.sf.pcc.sf;

/* loaded from: classes4.dex */
final class vj {
    int gm;
    boolean oo;
    final byte[] pcc;
    vj qf;
    int sf;
    boolean vj;
    vj wh;

    vj() {
        this.pcc = new byte[8192];
        this.vj = true;
        this.oo = false;
    }

    vj(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.pcc = bArr;
        this.sf = i;
        this.gm = i2;
        this.oo = z;
        this.vj = z2;
    }

    final vj pcc() {
        this.oo = true;
        return new vj(this.pcc, this.sf, this.gm, true, false);
    }

    public final vj sf() {
        vj vjVar = this.wh;
        vj vjVar2 = vjVar != this ? vjVar : null;
        vj vjVar3 = this.qf;
        if (vjVar3 != null) {
            vjVar3.wh = vjVar;
        }
        vj vjVar4 = this.wh;
        if (vjVar4 != null) {
            vjVar4.qf = vjVar3;
        }
        this.wh = null;
        this.qf = null;
        return vjVar2;
    }

    public final vj pcc(vj vjVar) {
        vjVar.qf = this;
        vjVar.wh = this.wh;
        this.wh.qf = vjVar;
        this.wh = vjVar;
        return vjVar;
    }
}
