package util.h.xy.dw;

/* loaded from: classes5.dex */
public final class ra extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private util.h.xy.dh.rk getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 73) + ((i & 73) << 1)) % 128;
        util.h.xy.dh.rk rkVar = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
        return rkVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dw.ma[] m26444() {
        util.h.xy.dw.ma[] maVarArr;
        int i;
        int i2 = getHighSpeedVideoFpsRanges + 65;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            maVarArr = new util.h.xy.dw.ma[this.getHighResolutionOutputSizeshNQ4ISI.m26342()];
            i = 1;
        } else {
            maVarArr = new util.h.xy.dw.ma[this.getHighResolutionOutputSizeshNQ4ISI.m26342()];
            i = 0;
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i3 ^ 97) + ((i3 & 97) << 1)) % 128;
        while (i != maVarArr.length) {
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 ^ 29) + ((i4 & 29) << 1);
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            util.h.xy.dw.ma m26432 = util.h.xy.dw.ma.m26432(this.getHighResolutionOutputSizeshNQ4ISI.m26345(i));
            if (i5 % 2 != 0) {
                maVarArr[i] = m26432;
                i += 19;
            } else {
                maVarArr[i] = m26432;
                i++;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 109) % 128;
        return maVarArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dw.ma m26442() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.m26342();
            throw null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.m26342() != 0) {
            util.h.xy.dw.ma m26432 = util.h.xy.dw.ma.m26432(this.getHighResolutionOutputSizeshNQ4ISI.m26345(0));
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i3 | 29) << 1) - (i3 ^ 29)) % 128;
            return m26432;
        }
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = ((i4 | 87) << 1) - (i4 ^ 87);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26445() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        int m26342 = this.getHighResolutionOutputSizeshNQ4ISI.m26342();
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return m26342;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m26443() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int m26342 = this.getHighResolutionOutputSizeshNQ4ISI.m26342();
        if (i2 % 2 == 0 ? m26342 > 1 : m26342 > 1) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i3 & 73) + (i3 | 73)) % 128;
            return true;
        }
        int i4 = getHighSpeedVideoFpsRangesFor;
        int i5 = (i4 ^ 63) + ((i4 & 63) << 1);
        getHighSpeedVideoFpsRanges = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public ra(util.h.xy.dw.ma[] maVarArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.ae(maVarArr);
    }

    public ra(util.h.xy.dh.i iVar, util.h.xy.dh.c cVar) {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(iVar);
        dVar.m26290(cVar);
        this.getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.ae(new util.h.xy.dh.aa(dVar));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dw.ra m26441(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj instanceof util.h.xy.dw.ra) {
            return (util.h.xy.dw.ra) obj;
        }
        if (obj == null) {
            getHighSpeedVideoFpsRanges = (i3 + 45) % 128;
            return null;
        }
        util.h.xy.dw.ra raVar = new util.h.xy.dw.ra(util.h.xy.dh.rk.m26341(obj));
        int i4 = getHighSpeedVideoFpsRanges + 97;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private ra(util.h.xy.dh.rk rkVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = rkVar;
    }
}
