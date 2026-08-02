package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface Committer {
    org.bouncycastle.crypto.Commitment commit(byte[] bArr);

    boolean isRevealed(org.bouncycastle.crypto.Commitment commitment, byte[] bArr);
}
