package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface Xof extends org.bouncycastle.crypto.ExtendedDigest {
    int doFinal(byte[] bArr, int i, int i2);

    int doOutput(byte[] bArr, int i, int i2);
}
