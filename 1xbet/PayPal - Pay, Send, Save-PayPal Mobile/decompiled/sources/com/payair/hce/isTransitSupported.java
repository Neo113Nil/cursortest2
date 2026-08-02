package com.payair.hce;

/* loaded from: classes4.dex */
public final class isTransitSupported {
    public int DigitizedCardProfile;
    public int valueOf;
    public int values;

    public static void values(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int writeReplace(int i) {
        com.payair.hce.assignTrack2ConstructionData assigntrack2constructiondata = com.payair.hce.assignTrack2ConstructionData.writeReplace;
        return ((assigntrack2constructiondata.values[0][(i >>> 24) & 255] + assigntrack2constructiondata.values[1][(i >>> 16) & 255]) ^ assigntrack2constructiondata.values[2][(i >>> 8) & 255]) + assigntrack2constructiondata.values[3][i & 255];
    }
}
