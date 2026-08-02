package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public interface EncryptedValuePadder {
    byte[] getPaddedData(byte[] bArr);

    byte[] getUnpaddedData(byte[] bArr);
}
