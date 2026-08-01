package com.bytedance.sdk.openadsdk.of;

/* loaded from: classes4.dex */
public enum gbb {
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5);

    private final int kj;
    private final int[] qf;

    gbb(int[] iArr, int i) {
        this.qf = iArr;
        this.kj = i;
    }

    public int pcc(gpj gpjVar) {
        int pcc = gpjVar.pcc();
        return this.qf[pcc <= 9 ? (char) 0 : pcc <= 26 ? (char) 1 : (char) 2];
    }

    public int pcc() {
        return this.kj;
    }
}
