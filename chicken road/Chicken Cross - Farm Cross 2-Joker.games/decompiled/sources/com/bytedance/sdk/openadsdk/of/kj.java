package com.bytedance.sdk.openadsdk.of;

/* loaded from: classes4.dex */
public enum kj {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final kj[] vj;
    private final int wh;

    static {
        kj kjVar = L;
        kj kjVar2 = M;
        kj kjVar3 = Q;
        vj = new kj[]{kjVar2, kjVar, H, kjVar3};
    }

    kj(int i) {
        this.wh = i;
    }

    public int pcc() {
        return this.wh;
    }
}
