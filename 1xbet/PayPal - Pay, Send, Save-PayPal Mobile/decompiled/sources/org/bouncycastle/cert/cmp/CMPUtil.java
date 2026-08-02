package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
class CMPUtil {
    static void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Object aSN1Object, java.io.OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to DER encode object: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPRuntimeException(sb.toString(), e);
        }
    }

    CMPUtil() {
    }
}
