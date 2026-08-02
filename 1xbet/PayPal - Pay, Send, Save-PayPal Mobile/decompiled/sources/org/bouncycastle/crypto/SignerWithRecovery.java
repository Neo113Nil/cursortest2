package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface SignerWithRecovery extends org.bouncycastle.crypto.Signer {
    byte[] getRecoveredMessage();

    boolean hasFullMessage();

    void updateWithRecoveredMessage(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException;
}
