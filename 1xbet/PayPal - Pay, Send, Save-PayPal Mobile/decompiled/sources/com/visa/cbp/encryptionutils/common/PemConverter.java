package com.visa.cbp.encryptionutils.common;

/* loaded from: classes16.dex */
public class PemConverter {
    public static java.lang.String convert(byte[] bArr, java.lang.String str) throws java.io.IOException {
        org.bouncycastle.util.io.pem.PemObject pemObject = new org.bouncycastle.util.io.pem.PemObject(str, bArr);
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        org.bouncycastle.util.io.pem.PemWriter pemWriter = new org.bouncycastle.util.io.pem.PemWriter(stringWriter);
        try {
            pemWriter.writeObject(pemObject);
            pemWriter.close();
            return stringWriter.toString();
        } catch (java.lang.Throwable th) {
            pemWriter.close();
            throw th;
        }
    }
}
