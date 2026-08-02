package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
class DerUtil {
    static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        try {
            return aSN1Primitive.getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot get encoding: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString()) { // from class: org.bouncycastle.crypto.util.DerUtil.1
                @Override // java.lang.Throwable
                public final java.lang.Throwable getCause() {
                    return e;
                }
            };
        }
    }

    static org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges(byte[] bArr) {
        return bArr == null ? new org.bouncycastle.asn1.DEROctetString(new byte[0]) : new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    DerUtil() {
    }
}
