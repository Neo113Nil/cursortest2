package com.bytedance.sdk.component.sf.pcc.sf;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class qf extends oo {
    final transient int[] kj;
    final transient byte[][] qf;

    qf(pcc pccVar, int i) {
        super(null);
        vy.pcc(pccVar.sf, 0L, i);
        vj vjVar = pccVar.pcc;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (vjVar.gm == vjVar.sf) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += vjVar.gm - vjVar.sf;
            i4++;
            vjVar = vjVar.wh;
        }
        this.qf = new byte[i4][];
        this.kj = new int[i4 * 2];
        vj vjVar2 = pccVar.pcc;
        int i5 = 0;
        while (i2 < i) {
            this.qf[i5] = vjVar2.pcc;
            i2 += vjVar2.gm - vjVar2.sf;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.kj;
            iArr[i5] = i2;
            iArr[this.qf.length + i5] = vjVar2.sf;
            vjVar2.oo = true;
            i5++;
            vjVar2 = vjVar2.wh;
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public String pcc() {
        return vj().pcc();
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public String sf() {
        return vj().sf();
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public oo pcc(int i, int i2) {
        return vj().pcc(i, i2);
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public byte pcc(int i) {
        vy.pcc(this.kj[this.qf.length - 1], i, 1L);
        int sf = sf(i);
        int i2 = sf == 0 ? 0 : this.kj[sf - 1];
        int[] iArr = this.kj;
        byte[][] bArr = this.qf;
        return bArr[sf][(i - i2) + iArr[bArr.length + sf]];
    }

    private int sf(int i) {
        int binarySearch = Arrays.binarySearch(this.kj, 0, this.qf.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public int gm() {
        return this.kj[this.qf.length - 1];
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public byte[] oo() {
        int[] iArr = this.kj;
        byte[][] bArr = this.qf;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.kj;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.qf[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public boolean pcc(int i, oo ooVar, int i2, int i3) {
        if (i < 0 || i > gm() - i3) {
            return false;
        }
        int sf = sf(i);
        while (i3 > 0) {
            int i4 = sf == 0 ? 0 : this.kj[sf - 1];
            int min = Math.min(i3, ((this.kj[sf] - i4) + i4) - i);
            int[] iArr = this.kj;
            byte[][] bArr = this.qf;
            if (!ooVar.pcc(i2, bArr[sf], (i - i4) + iArr[bArr.length + sf], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            sf++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public boolean pcc(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > gm() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int sf = sf(i);
        while (i3 > 0) {
            int i4 = sf == 0 ? 0 : this.kj[sf - 1];
            int min = Math.min(i3, ((this.kj[sf] - i4) + i4) - i);
            int[] iArr = this.kj;
            byte[][] bArr2 = this.qf;
            if (!vy.pcc(bArr2[sf], (i - i4) + iArr[bArr2.length + sf], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            sf++;
        }
        return true;
    }

    private oo vj() {
        return new oo(oo());
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo) {
            oo ooVar = (oo) obj;
            if (ooVar.gm() == gm() && pcc(0, ooVar, 0, gm())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public int hashCode() {
        int i = this.vj;
        if (i != 0) {
            return i;
        }
        int length = this.qf.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.qf[i2];
            int[] iArr = this.kj;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.vj = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf.oo
    public String toString() {
        return vj().toString();
    }
}
