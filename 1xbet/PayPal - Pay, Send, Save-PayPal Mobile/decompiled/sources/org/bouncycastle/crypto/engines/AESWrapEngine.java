package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class AESWrapEngine extends org.bouncycastle.crypto.engines.RFC3394WrapEngine {
    public AESWrapEngine(boolean z) {
        super(new org.bouncycastle.crypto.engines.AESEngine(), z);
    }

    public AESWrapEngine() {
        super(new org.bouncycastle.crypto.engines.AESEngine());
    }
}
