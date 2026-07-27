package com.bytedance.sdk.openadsdk.of;

import androidx.compose.material.TextFieldImplKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes4.dex */
final class tmg {
    private static final int[][] pcc = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] sf = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] gm = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, -1, -1}, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, TextFieldImplKt.AnimationDuration}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] oo = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean sf(int i) {
        return i == -1;
    }

    static void pcc(gm gmVar) {
        gmVar.pcc((byte) -1);
    }

    static void pcc(pcc pccVar, kj kjVar, gpj gpjVar, int i, gm gmVar) throws lo {
        pcc(gmVar);
        pcc(gpjVar, gmVar);
        pcc(kjVar, i, gmVar);
        sf(gpjVar, gmVar);
        pcc(pccVar, i, gmVar);
    }

    static void pcc(gpj gpjVar, gm gmVar) throws lo {
        oo(gmVar);
        gm(gmVar);
        gm(gpjVar, gmVar);
        sf(gmVar);
    }

    static void pcc(kj kjVar, int i, gm gmVar) throws lo {
        int pcc2;
        pcc pccVar = new pcc();
        pcc(kjVar, i, pccVar);
        for (int i2 = 0; i2 < pccVar.pcc(); i2++) {
            boolean pcc3 = pccVar.pcc((pccVar.pcc() - 1) - i2);
            int[] iArr = oo[i2];
            gmVar.pcc(iArr[0], iArr[1], pcc3);
            int i3 = 8;
            if (i2 < 8) {
                pcc2 = 8;
                i3 = (gmVar.sf() - i2) - 1;
            } else {
                pcc2 = (gmVar.pcc() - 7) + (i2 - 8);
            }
            gmVar.pcc(i3, pcc2, pcc3);
        }
    }

    static void sf(gpj gpjVar, gm gmVar) throws lo {
        if (gpjVar.pcc() < 7) {
            return;
        }
        pcc pccVar = new pcc();
        pcc(gpjVar, pccVar);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean pcc2 = pccVar.pcc(i);
                i--;
                gmVar.pcc(i2, (gmVar.pcc() - 11) + i3, pcc2);
                gmVar.pcc((gmVar.pcc() - 11) + i3, i2, pcc2);
            }
        }
    }

    static void pcc(pcc pccVar, int i, gm gmVar) throws lo {
        boolean z;
        int sf2 = gmVar.sf() - 1;
        int pcc2 = gmVar.pcc() - 1;
        int i2 = 0;
        int i3 = -1;
        while (sf2 > 0) {
            if (sf2 == 6) {
                sf2--;
            }
            while (pcc2 >= 0 && pcc2 < gmVar.pcc()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = sf2 - i4;
                    if (sf(gmVar.pcc(i5, pcc2))) {
                        if (i2 < pccVar.pcc()) {
                            z = pccVar.pcc(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && vh.pcc(i, i5, pcc2)) {
                            z = !z;
                        }
                        gmVar.pcc(i5, pcc2, z);
                    }
                }
                pcc2 += i3;
            }
            i3 = -i3;
            pcc2 += i3;
            sf2 -= 2;
        }
        if (i2 != pccVar.pcc()) {
            throw new lo("Not all bits consumed: " + i2 + FileSystemKt.UnixPathSeparator + pccVar.pcc());
        }
    }

    static int pcc(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int pcc(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int pcc2 = pcc(i2);
        int i3 = i << (pcc2 - 1);
        while (pcc(i3) >= pcc2) {
            i3 ^= i2 << (pcc(i3) - pcc2);
        }
        return i3;
    }

    static void pcc(kj kjVar, int i, pcc pccVar) throws lo {
        if (!jr.pcc(i)) {
            throw new lo("Invalid mask pattern");
        }
        int pcc2 = (kjVar.pcc() << 3) | i;
        pccVar.pcc(pcc2, 5);
        pccVar.pcc(pcc(pcc2, 1335), 10);
        pcc pccVar2 = new pcc();
        pccVar2.pcc(21522, 15);
        pccVar.sf(pccVar2);
        if (pccVar.pcc() != 15) {
            throw new lo("should not happen but we got: " + pccVar.pcc());
        }
    }

    static void pcc(gpj gpjVar, pcc pccVar) throws lo {
        pccVar.pcc(gpjVar.pcc(), 6);
        pccVar.pcc(pcc(gpjVar.pcc(), 7973), 12);
        if (pccVar.pcc() != 18) {
            throw new lo("should not happen but we got: " + pccVar.pcc());
        }
    }

    private static void sf(gm gmVar) {
        int i = 8;
        while (i < gmVar.sf() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (sf(gmVar.pcc(i, 6))) {
                gmVar.pcc(i, 6, i3);
            }
            if (sf(gmVar.pcc(6, i))) {
                gmVar.pcc(6, i, i3);
            }
            i = i2;
        }
    }

    private static void gm(gm gmVar) throws lo {
        if (gmVar.pcc(8, gmVar.pcc() - 8) == 0) {
            throw new lo();
        }
        gmVar.pcc(8, gmVar.pcc() - 8, 1);
    }

    private static void pcc(int i, int i2, gm gmVar) throws lo {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!sf(gmVar.pcc(i4, i2))) {
                throw new lo();
            }
            gmVar.pcc(i4, i2, 0);
        }
    }

    private static void sf(int i, int i2, gm gmVar) throws lo {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!sf(gmVar.pcc(i, i4))) {
                throw new lo();
            }
            gmVar.pcc(i, i4, 0);
        }
    }

    private static void gm(int i, int i2, gm gmVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = sf[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                gmVar.pcc(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void oo(int i, int i2, gm gmVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = pcc[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                gmVar.pcc(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void oo(gm gmVar) throws lo {
        int length = pcc[0].length;
        oo(0, 0, gmVar);
        oo(gmVar.sf() - length, 0, gmVar);
        oo(0, gmVar.sf() - length, gmVar);
        pcc(0, 7, gmVar);
        pcc(gmVar.sf() - 8, 7, gmVar);
        pcc(0, gmVar.sf() - 8, gmVar);
        sf(7, 0, gmVar);
        sf(gmVar.pcc() - 8, 0, gmVar);
        sf(7, gmVar.pcc() - 7, gmVar);
    }

    private static void gm(gpj gpjVar, gm gmVar) {
        if (gpjVar.pcc() < 2) {
            return;
        }
        int[] iArr = gm[gpjVar.pcc() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && sf(gmVar.pcc(i2, i))) {
                        gm(i2 - 2, i - 2, gmVar);
                    }
                }
            }
        }
    }
}
