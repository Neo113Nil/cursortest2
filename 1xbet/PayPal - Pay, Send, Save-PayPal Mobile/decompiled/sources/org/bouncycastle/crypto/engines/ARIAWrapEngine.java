package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ARIAWrapEngine extends org.bouncycastle.crypto.engines.RFC3394WrapEngine {
    public ARIAWrapEngine(boolean z) {
        super(new org.bouncycastle.crypto.engines.ARIAEngine(), z);
    }

    public ARIAWrapEngine() {
        super(new org.bouncycastle.crypto.engines.ARIAEngine());
    }
}
