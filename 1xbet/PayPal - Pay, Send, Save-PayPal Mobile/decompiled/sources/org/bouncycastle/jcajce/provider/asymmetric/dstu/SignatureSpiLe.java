package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class SignatureSpiLe extends org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi {
    private static void getHighSpeedVideoFpsRanges(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        try {
            byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1OctetString.fromByteArray(bArr)).getOctets();
            getHighSpeedVideoFpsRanges(octets);
            try {
                return super.engineVerify(new org.bouncycastle.asn1.DEROctetString(octets).getEncoded());
            } catch (java.security.SignatureException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new java.security.SignatureException(e2.toString());
            }
        } catch (java.io.IOException unused) {
            throw new java.security.SignatureException("error decoding signature bytes.");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(super.engineSign()).getOctets();
        getHighSpeedVideoFpsRanges(octets);
        try {
            return new org.bouncycastle.asn1.DEROctetString(octets).getEncoded();
        } catch (java.lang.Exception e) {
            throw new java.security.SignatureException(e.toString());
        }
    }
}
