package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public interface KGCMMultiplier {
    void init(long[] jArr);

    void multiplyH(long[] jArr);
}
