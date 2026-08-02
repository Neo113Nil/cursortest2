package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public final class Zuc128Engine extends org.bouncycastle.crypto.engines.Zuc128CoreEngine {
    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public final org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.engines.Zuc128Engine(this);
    }

    private Zuc128Engine(org.bouncycastle.crypto.engines.Zuc128Engine zuc128Engine) {
        super(zuc128Engine);
    }

    public Zuc128Engine() {
    }
}
