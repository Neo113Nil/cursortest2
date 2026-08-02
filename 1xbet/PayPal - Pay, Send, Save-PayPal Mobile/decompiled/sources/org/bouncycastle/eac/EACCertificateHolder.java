package org.bouncycastle.eac;

/* loaded from: classes17.dex */
public class EACCertificateHolder {
    private org.bouncycastle.asn1.eac.CVCertificate getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.eac.CVCertificate toASN1Structure() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isSignatureValid(org.bouncycastle.eac.operator.EACSignatureVerifier eACSignatureVerifier) throws org.bouncycastle.eac.EACException {
        try {
            java.io.OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.getHighSpeedVideoFpsRanges.getBody().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return eACSignatureVerifier.verify(this.getHighSpeedVideoFpsRanges.getSignature());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.eac.PublicKeyDataObject getPublicKeyDataObject() {
        return this.getHighSpeedVideoFpsRanges.getBody().getPublicKey();
    }

    private static org.bouncycastle.asn1.eac.CVCertificate getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.eac.CVCertificate.getInstance(bArr);
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.eac.EACIOException(sb2.toString(), e2);
        } catch (org.bouncycastle.asn1.ASN1ParsingException e3) {
            if (e3.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e3.getCause());
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("malformed data: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.eac.EACIOException(sb3.toString(), e3);
        }
    }

    public EACCertificateHolder(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoFpsRanges(bArr));
    }

    public EACCertificateHolder(org.bouncycastle.asn1.eac.CVCertificate cVCertificate) {
        this.getHighSpeedVideoFpsRanges = cVCertificate;
    }
}
