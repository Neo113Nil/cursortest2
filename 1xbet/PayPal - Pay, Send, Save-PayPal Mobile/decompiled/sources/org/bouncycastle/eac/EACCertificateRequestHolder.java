package org.bouncycastle.eac;

/* loaded from: classes17.dex */
public class EACCertificateRequestHolder {
    private org.bouncycastle.asn1.eac.CVCertificateRequest getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.eac.CVCertificateRequest toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isInnerSignatureValid(org.bouncycastle.eac.operator.EACSignatureVerifier eACSignatureVerifier) throws org.bouncycastle.eac.EACException {
        try {
            java.io.OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.getHighSpeedVideoSizes.getCertificateBody().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return eACSignatureVerifier.verify(this.getHighSpeedVideoSizes.getInnerSignature());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.eac.PublicKeyDataObject getPublicKeyDataObject() {
        return this.getHighSpeedVideoSizes.getPublicKey();
    }

    private static org.bouncycastle.asn1.eac.CVCertificateRequest getHighSpeedVideoSizes(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.eac.CVCertificateRequest.getInstance(bArr);
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

    public EACCertificateRequestHolder(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoSizes(bArr));
    }

    public EACCertificateRequestHolder(org.bouncycastle.asn1.eac.CVCertificateRequest cVCertificateRequest) {
        this.getHighSpeedVideoSizes = cVCertificateRequest;
    }
}
