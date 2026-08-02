package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public interface AEADBlockCipher extends org.bouncycastle.crypto.modes.AEADCipher {
    org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
}
