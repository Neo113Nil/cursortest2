package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2007nD extends com.facebook.ads.redexgen.core.AbstractC0685Ew {
    public static java.lang.String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public com.facebook.ads.redexgen.core.C0677Eo A00;

    public abstract android.util.Pair<com.facebook.ads.redexgen.core.C05187s[], com.facebook.ads.redexgen.core.InterfaceC2008nE[]> A0d(com.facebook.ads.redexgen.core.C0677Eo c0677Eo, int[][][] iArr, int[] iArr2, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.androidx.media3.common.Timeline timeline) throws com.facebook.ads.redexgen.core.AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(com.facebook.ads.redexgen.core.InterfaceC05157p[] interfaceC05157pArr, com.facebook.ads.redexgen.core.C2159pg c2159pg, int[] iArr, boolean z) throws com.facebook.ads.redexgen.core.AD {
        int length = interfaceC05157pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            com.facebook.ads.redexgen.core.InterfaceC05157p interfaceC05157p = interfaceC05157pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC05157p.AKM(c2159pg.A08(bestFormatSupportLevel));
                i3 = java.lang.Math.max(i3, com.facebook.ads.redexgen.core.AbstractC05087i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i3 > formatSupportLevel || (i3 == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = i3;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(com.facebook.ads.redexgen.core.InterfaceC05157p interfaceC05157p, com.facebook.ads.redexgen.core.C2159pg c2159pg) throws com.facebook.ads.redexgen.core.AD {
        int[] iArr = new int[c2159pg.A01];
        for (int i = 0; i < c2159pg.A01; i++) {
            iArr[i] = interfaceC05157p.AKM(c2159pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(com.facebook.ads.redexgen.core.InterfaceC05157p[] interfaceC05157pArr) throws com.facebook.ads.redexgen.core.AD {
        int[] iArr = new int[interfaceC05157pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC05157pArr[i].AKO();
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0685Ew
    public final com.facebook.ads.redexgen.core.C0686Ex A0b(com.facebook.ads.redexgen.core.InterfaceC05157p[] interfaceC05157pArr, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.androidx.media3.common.Timeline timeline) throws com.facebook.ads.redexgen.core.AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC05157pArr.length + 1];
        com.facebook.ads.redexgen.core.C2159pg[][] c2159pgArr = new com.facebook.ads.redexgen.core.C2159pg[interfaceC05157pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC05157pArr.length + 1][][];
        for (int i = 0; i < c2159pgArr.length; i++) {
            c2159pgArr[i] = new com.facebook.ads.redexgen.core.C2159pg[c2026nW.A01];
            iArr2[i] = new int[c2026nW.A01][];
        }
        int[] A0a = A0a(interfaceC05157pArr);
        for (int i2 = 0; i2 < c2026nW.A01; i2++) {
            com.facebook.ads.redexgen.core.C2159pg A05 = c2026nW.A05(i2);
            int groupIndex = A0Y(interfaceC05157pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC05157pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC05157pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c2159pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        com.facebook.ads.redexgen.core.C2026nW[] c2026nWArr = new com.facebook.ads.redexgen.core.C2026nW[interfaceC05157pArr.length];
        java.lang.String[] strArr = new java.lang.String[interfaceC05157pArr.length];
        int[] iArr3 = new int[interfaceC05157pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC05157pArr.length;
            java.lang.String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c2026nWArr[i4] = new com.facebook.ads.redexgen.core.C2026nW((com.facebook.ads.redexgen.core.C2159pg[]) com.facebook.ads.redexgen.core.C5C.A1I(c2159pgArr[i4], i5));
                iArr2[i4] = (int[][]) com.facebook.ads.redexgen.core.C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC05157pArr[i4].getName();
                iArr3[i4] = interfaceC05157pArr[i4].A9N();
                i4++;
            } else {
                com.facebook.ads.redexgen.core.C0677Eo c0677Eo = new com.facebook.ads.redexgen.core.C0677Eo(strArr, iArr3, c2026nWArr, A0a, iArr2, new com.facebook.ads.redexgen.core.C2026nW((com.facebook.ads.redexgen.core.C2159pg[]) com.facebook.ads.redexgen.core.C5C.A1I(c2159pgArr[interfaceC05157pArr.length], iArr[interfaceC05157pArr.length])));
                android.util.Pair<com.facebook.ads.redexgen.core.C05187s[], com.facebook.ads.redexgen.core.InterfaceC2008nE[]> A0d = A0d(c0677Eo, iArr2, A0a, c2044no, timeline);
                return new com.facebook.ads.redexgen.core.C0686Ex((com.facebook.ads.redexgen.core.C05187s[]) A0d.first, (com.facebook.ads.redexgen.core.InterfaceC2008nE[]) A0d.second, com.facebook.ads.redexgen.core.AbstractC0682Et.A00(c0677Eo, (com.facebook.ads.redexgen.core.InterfaceC0679Eq[]) A0d.second), c0677Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0685Ew
    public final void A0c(java.lang.Object obj) {
        this.A00 = (com.facebook.ads.redexgen.core.C0677Eo) obj;
    }
}
