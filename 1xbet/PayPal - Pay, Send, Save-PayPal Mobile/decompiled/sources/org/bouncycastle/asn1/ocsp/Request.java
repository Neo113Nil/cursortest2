package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class Request extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ocsp.CertID getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.Extensions getSingleRequestExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ocsp.CertID getReqCert() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.ocsp.Request getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.Request getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.Request) {
            return (org.bouncycastle.asn1.ocsp.Request) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.Request(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Request(org.bouncycastle.asn1.ocsp.CertID certID, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = certID;
        this.getHighResolutionOutputSizeshNQ4ISI = extensions;
    }

    private Request(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ocsp.CertID.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }
}
