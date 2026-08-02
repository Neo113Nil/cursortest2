package util.h.xy.eq;

/* loaded from: classes18.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoSizes;
    private static char[] getOutputFormats = {41907, 41919, 41908, 41900, 41913, 41906, 41980, 41902, 41905, 41904, 41896, 41903, 41909, 41915, 41958, 41917};
    private static char getHighSpeedVideoFpsRangesFor = 38466;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r0.f2641 == r0.f2636) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (r0.f2640 != r0.f2635) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        util.h.xy.eq.b.Camera2StreamConfigurationMap = (util.h.xy.eq.b.getHighSpeedVideoFpsRanges + 25) % 128;
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r0.f2639 != r0.f2637) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011f, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r0.f2641 == r0.f2636) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = Camera2StreamConfigurationMap + 89;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = Camera2StreamConfigurationMap + 117;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                mcVar.f2638 = 1;
            } else {
                mcVar.f2638 = 0;
            }
            while (mcVar.f2638 < i2) {
                int i6 = getHighSpeedVideoFpsRanges + 51;
                Camera2StreamConfigurationMap = i6 % 128;
                if (i6 % 2 == 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 - 1];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
            cArr3[i7] = (char) (cArr3[i7] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static util.h.xy.ef.a getHighResolutionOutputSizeshNQ4ISI(java.security.SecureRandom secureRandom, int i) {
        util.h.xy.ef.a aVar = new util.h.xy.ef.a();
        aVar.mo26532(new util.h.xy.ef.re(secureRandom, i));
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 53) % 128;
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ef.a m26687(util.h.xy.dh.i iVar, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        if (util.h.xy.dq.mb.f1479.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.dq.mb.f1516.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 192);
        }
        if (util.h.xy.dq.mb.f1492.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 256);
        }
        if (util.h.xy.dq.mb.f1507.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.dq.mb.f1457.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 192);
        }
        if (util.h.xy.dq.mb.f1490.m26325(iVar)) {
            util.h.xy.ef.a highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(secureRandom, 256);
            int i = getHighResolutionOutputSizeshNQ4ISI + 9;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            throw null;
        }
        if (util.h.xy.dq.mb.f1503.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.dq.mb.f1476.m26325(iVar)) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 192);
        }
        if (util.h.xy.dq.mb.f1511.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 256);
        }
        if (util.h.xy.du.ra.f1735.m26325(iVar)) {
            util.h.xy.el.ra raVar = new util.h.xy.el.ra();
            raVar.mo26532(new util.h.xy.ef.re(secureRandom, 192));
            return raVar;
        }
        if (util.h.xy.ds.b.f1534.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.ds.b.f1535.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 192);
        }
        if (util.h.xy.ds.b.f1532.m26325(iVar)) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 256);
        }
        if (util.h.xy.dn.mb.f1386.m26325(iVar)) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 33;
            getHighSpeedVideoSizes = i2 % 128;
            return i2 % 2 != 0 ? getHighResolutionOutputSizeshNQ4ISI(secureRandom, 15223) : getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.eq.ma.getHighSpeedVideoFpsRanges.m26325(iVar)) {
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.dr.mb.f1524.m26325(iVar)) {
            util.h.xy.el.ma maVar = new util.h.xy.el.ma();
            maVar.mo26532(new util.h.xy.ef.re(secureRandom, 64));
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 105;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                return maVar;
            }
            throw null;
        }
        if (util.h.xy.du.ra.f1723.m26325(iVar)) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
            return getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
        }
        if (util.h.xy.du.ra.f1726.m26325(iVar)) {
            int i4 = getHighSpeedVideoSizes + 111;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            util.h.xy.ef.a highResolutionOutputSizeshNQ4ISI2 = i4 % 2 == 0 ? getHighResolutionOutputSizeshNQ4ISI(secureRandom, 29398) : getHighResolutionOutputSizeshNQ4ISI(secureRandom, 128);
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
            return highResolutionOutputSizeshNQ4ISI2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (38 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0003\r㘚㘚\u0002\b\u0007\u0004\u0005\u0000\u0001\f\u0004\r\b\u0007\u0005\u0002\u000f\u0000\u0000\u0006\u0006\u000f㗠", 25 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(iVar);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
