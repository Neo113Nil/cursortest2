package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class LinkedCertificate extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.DigestInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighSpeedVideoFpsRanges;
        if (x500Name != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) x500Name));
        }
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRangesFor;
        if (generalNames != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) generalNames));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.DigestInfo getDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.GeneralName getCertLocation() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x500.X500Name getCertIssuer() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getCACerts() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.bc.LinkedCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.LinkedCertificate) {
            return (org.bouncycastle.asn1.bc.LinkedCertificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.LinkedCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public LinkedCertificate(org.bouncycastle.asn1.x509.DigestInfo digestInfo, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.getHighSpeedVideoSizes = digestInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        this.getHighSpeedVideoFpsRanges = x500Name;
        this.getHighSpeedVideoFpsRangesFor = generalNames;
    }

    public LinkedCertificate(org.bouncycastle.asn1.x509.DigestInfo digestInfo, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this(digestInfo, generalName, null, null);
    }

    private LinkedCertificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DigestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            for (int i = 2; i != aSN1Sequence.size(); i++) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        throw new java.lang.IllegalArgumentException("unknown tag in tagged field");
                    }
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
                }
            }
        }
    }
}
