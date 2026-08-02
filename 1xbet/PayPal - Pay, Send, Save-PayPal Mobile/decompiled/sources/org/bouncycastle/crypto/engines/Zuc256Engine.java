package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public final class Zuc256Engine extends org.bouncycastle.crypto.engines.Zuc256CoreEngine {
    @Override // org.bouncycastle.crypto.engines.Zuc256CoreEngine, org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public final org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.engines.Zuc256Engine(this);
    }

    private Zuc256Engine(org.bouncycastle.crypto.engines.Zuc256Engine zuc256Engine) {
        super(zuc256Engine);
    }

    public Zuc256Engine(int i) {
        super(i);
    }

    public Zuc256Engine() {
    }
}
