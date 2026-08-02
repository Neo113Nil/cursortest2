package org.bouncycastle.eac;

/* loaded from: classes17.dex */
public class EACCertificateBuilder {
    private static final byte[] getHighSpeedVideoFpsRanges = {0};
    private org.bouncycastle.asn1.eac.CertificateHolderReference Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.eac.PackedDate getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.eac.CertificateHolderAuthorization getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.eac.PackedDate getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.eac.PublicKeyDataObject getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.eac.CertificationAuthorityReference getOutputFormats;

    public org.bouncycastle.eac.EACCertificateHolder build(org.bouncycastle.eac.operator.EACSigner eACSigner) throws org.bouncycastle.eac.EACException {
        try {
            org.bouncycastle.asn1.eac.CertificateBody certificateBody = new org.bouncycastle.asn1.eac.CertificateBody(new org.bouncycastle.asn1.DERApplicationSpecific(41, getHighSpeedVideoFpsRanges), this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            java.io.OutputStream outputStream = eACSigner.getOutputStream();
            outputStream.write(certificateBody.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return new org.bouncycastle.eac.EACCertificateHolder(new org.bouncycastle.asn1.eac.CVCertificate(certificateBody, eACSigner.getSignature()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.eac.EACException(sb.toString(), e);
        }
    }

    public EACCertificateBuilder(org.bouncycastle.asn1.eac.CertificationAuthorityReference certificationAuthorityReference, org.bouncycastle.asn1.eac.PublicKeyDataObject publicKeyDataObject, org.bouncycastle.asn1.eac.CertificateHolderReference certificateHolderReference, org.bouncycastle.asn1.eac.CertificateHolderAuthorization certificateHolderAuthorization, org.bouncycastle.asn1.eac.PackedDate packedDate, org.bouncycastle.asn1.eac.PackedDate packedDate2) {
        this.getOutputFormats = certificationAuthorityReference;
        this.getHighSpeedVideoSizesFor = publicKeyDataObject;
        this.Camera2StreamConfigurationMap = certificateHolderReference;
        this.getHighSpeedVideoFpsRangesFor = certificateHolderAuthorization;
        this.getHighSpeedVideoSizes = packedDate;
        this.getHighResolutionOutputSizeshNQ4ISI = packedDate2;
    }
}
