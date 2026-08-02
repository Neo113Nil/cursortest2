package org.jose4j.keys;

/* loaded from: classes18.dex */
public class AesKey extends javax.crypto.spec.SecretKeySpec {
    public static final java.lang.String ALGORITHM = "AES";

    public AesKey(byte[] bArr) {
        super(bArr, ALGORITHM);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.jose4j.lang.ByteUtil.bitLength(getEncoded().length));
        sb.append(" bit AES key");
        return sb.toString();
    }
}
