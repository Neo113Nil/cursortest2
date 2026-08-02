package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class RevDetails extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.crmf.CertTemplate getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.Extensions getCrlEntryDetails() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.crmf.CertTemplate getCertDetails() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.RevDetails getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.RevDetails) {
            return (org.bouncycastle.asn1.cmp.RevDetails) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.RevDetails(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RevDetails(org.bouncycastle.asn1.crmf.CertTemplate certTemplate, org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this.getHighResolutionOutputSizeshNQ4ISI = certTemplate;
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions.toASN1Primitive());
    }

    public RevDetails(org.bouncycastle.asn1.crmf.CertTemplate certTemplate, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighResolutionOutputSizeshNQ4ISI = certTemplate;
        this.getHighSpeedVideoSizes = extensions;
    }

    public RevDetails(org.bouncycastle.asn1.crmf.CertTemplate certTemplate) {
        this.getHighResolutionOutputSizeshNQ4ISI = certTemplate;
    }

    private RevDetails(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.CertTemplate.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
