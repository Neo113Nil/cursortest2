package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
class CRMFUtil {
    static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Object aSN1Object, java.io.OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to DER encode object: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFRuntimeException(sb.toString(), e);
        }
    }

    static void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    CRMFUtil() {
    }
}
