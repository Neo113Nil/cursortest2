package org.jose4j.keys;

/* loaded from: classes18.dex */
public class HmacKey extends javax.crypto.spec.SecretKeySpec {
    public static final java.lang.String ALGORITHM = "HMAC";

    public HmacKey(byte[] bArr) {
        super(bArr, ALGORITHM);
    }
}
