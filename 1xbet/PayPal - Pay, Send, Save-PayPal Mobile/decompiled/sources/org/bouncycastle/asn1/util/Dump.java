package org.bouncycastle.asn1.util;

/* loaded from: classes17.dex */
public class Dump {
    public static void main(java.lang.String[] strArr) throws java.lang.Exception {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(strArr[0]);
        org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(fileInputStream);
        while (true) {
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                fileInputStream.close();
                return;
            }
            java.lang.System.out.println(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(readObject));
        }
    }
}
