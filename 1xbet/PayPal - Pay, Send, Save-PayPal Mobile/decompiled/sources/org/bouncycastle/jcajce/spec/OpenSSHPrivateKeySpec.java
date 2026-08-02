package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class OpenSSHPrivateKeySpec extends java.security.spec.EncodedKeySpec {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.security.spec.EncodedKeySpec
    public java.lang.String getFormat() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        super(bArr);
        java.lang.String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                throw new java.lang.IllegalArgumentException("unknown byte encoding");
            }
            str = "OpenSSH";
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
