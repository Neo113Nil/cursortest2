package org.jose4j.keys;

/* loaded from: classes18.dex */
public class PbkdfKey extends javax.crypto.spec.SecretKeySpec {
    public static final java.lang.String ALGORITHM = "PBKDF2";

    public PbkdfKey(java.lang.String str) {
        super(org.jose4j.lang.StringUtil.getBytesUtf8(str), ALGORITHM);
    }
}
