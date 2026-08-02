package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class RevRepContentBuilder {
    private org.bouncycastle.asn1.ASN1EncodableVector Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1EncodableVector();
    private org.bouncycastle.asn1.ASN1EncodableVector getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1EncodableVector();
    private org.bouncycastle.asn1.ASN1EncodableVector getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1EncodableVector();

    public org.bouncycastle.asn1.cmp.RevRepContent build() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap));
        if (this.getHighResolutionOutputSizeshNQ4ISI.size() != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI)));
        }
        if (this.getHighSpeedVideoFpsRanges.size() != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRanges)));
        }
        return org.bouncycastle.asn1.cmp.RevRepContent.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public org.bouncycastle.asn1.cmp.RevRepContentBuilder addCrl(org.bouncycastle.asn1.x509.CertificateList certificateList) {
        this.getHighSpeedVideoFpsRanges.add(certificateList);
        return this;
    }

    public org.bouncycastle.asn1.cmp.RevRepContentBuilder add(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo, org.bouncycastle.asn1.crmf.CertId certId) {
        if (this.Camera2StreamConfigurationMap.size() != this.getHighResolutionOutputSizeshNQ4ISI.size()) {
            throw new java.lang.IllegalStateException("status and revCerts sequence must be in common order");
        }
        this.Camera2StreamConfigurationMap.add(pKIStatusInfo);
        this.getHighResolutionOutputSizeshNQ4ISI.add(certId);
        return this;
    }

    public org.bouncycastle.asn1.cmp.RevRepContentBuilder add(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this.Camera2StreamConfigurationMap.add(pKIStatusInfo);
        return this;
    }
}
