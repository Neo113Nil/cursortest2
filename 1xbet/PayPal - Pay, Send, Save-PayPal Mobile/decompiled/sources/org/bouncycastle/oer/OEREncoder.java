package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class OEREncoder {
    public static byte[] toByteArray(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, org.bouncycastle.oer.OERDefinition.Element element) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            new org.bouncycastle.oer.OEROutputStream(byteArrayOutputStream).write(aSN1Encodable, element);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e.getMessage(), e);
        }
    }
}
