package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MT implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final com.facebook.ads.redexgen.core.C0998Re A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public MT(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = c1636gi;
        this.A00 = c0998Re;
    }

    private final void A02() {
        com.facebook.ads.redexgen.core.T5 A0G = this.A01.A0G();
        if (A0G != null) {
            com.facebook.ads.Ad A6k = A0G.A6k();
            java.lang.String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (A6k != null && A0G.A6o() != null) {
                A0G.A6o().onError(A6k, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        android.content.ComponentName component = new android.content.ComponentName(com.facebook.ads.redexgen.core.AbstractC1089Us.A05(com.facebook.ads.redexgen.core.AbstractC1089Us.A02.get()), A00(39, 61, 63));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setComponent(component);
        java.lang.String A00 = A00(26, 13, 4);
        intent2.putExtra(A00, intent.getStringExtra(A00));
        java.lang.String A002 = A00(0, 26, 126);
        intent2.putExtra(A002, intent.getIntExtra(A002, -1));
        try {
            this.A01.A0F().AID();
            com.facebook.ads.redexgen.core.C1140Wu.A09(c0998Re.A05(), intent2);
        } catch (com.facebook.ads.redexgen.core.C1138Ws unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final java.lang.String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        this.A01.A0F().AHp();
        if (i2 != -1) {
            this.A01.A0F().AHo(i2);
            A02();
            return false;
        }
        com.facebook.ads.redexgen.core.C0998Re c0998Re = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        c0998Re.A05().finish();
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
    }
}
