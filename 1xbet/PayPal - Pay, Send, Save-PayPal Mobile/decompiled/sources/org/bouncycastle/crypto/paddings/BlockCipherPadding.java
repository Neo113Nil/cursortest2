package org.bouncycastle.crypto.paddings;

/* loaded from: classes17.dex */
public interface BlockCipherPadding {
    int addPadding(byte[] bArr, int i);

    java.lang.String getPaddingName();

    void init(java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException;

    int padCount(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException;
}
