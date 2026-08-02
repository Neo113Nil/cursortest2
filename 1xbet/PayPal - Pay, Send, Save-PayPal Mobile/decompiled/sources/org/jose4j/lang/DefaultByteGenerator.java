package org.jose4j.lang;

/* loaded from: classes18.dex */
public class DefaultByteGenerator implements org.jose4j.lang.ByteGenerator {
    private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();

    @Override // org.jose4j.lang.ByteGenerator
    public byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
        return bArr;
    }
}
