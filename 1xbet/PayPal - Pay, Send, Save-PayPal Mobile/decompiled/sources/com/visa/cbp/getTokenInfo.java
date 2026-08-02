package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getTokenInfo {
    public int BuildConfig;
    public int ReplenishAckRequest;
    public int valueOf;

    public static void BuildConfig(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int ReplenishAckRequest(int i) {
        com.visa.cbp.ConfirmReplenishRequest confirmReplenishRequest = com.visa.cbp.ConfirmReplenishRequest.valueOf;
        return ((confirmReplenishRequest.ReplenishAckRequest[0][(i >>> 24) & 255] + confirmReplenishRequest.ReplenishAckRequest[1][(i >>> 16) & 255]) ^ confirmReplenishRequest.ReplenishAckRequest[2][(i >>> 8) & 255]) + confirmReplenishRequest.ReplenishAckRequest[3][i & 255];
    }
}
