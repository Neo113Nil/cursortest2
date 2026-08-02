package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class CMSAlgorithmProtection extends org.bouncycastle.asn1.ASN1Object {
    public static final int MAC = 2;
    public static final int SIGNATURE = 1;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoSizes;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cms.CMSAlgorithmProtection getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.CMSAlgorithmProtection) {
            return (org.bouncycastle.asn1.cms.CMSAlgorithmProtection) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.CMSAlgorithmProtection(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMSAlgorithmProtection(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier == null || algorithmIdentifier2 == null) {
            throw new java.lang.NullPointerException("AlgorithmIdentifiers cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        if (i == 1) {
            this.getHighSpeedVideoSizes = algorithmIdentifier2;
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException("Unknown type: ".concat(java.lang.String.valueOf(i)));
            }
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier2;
        }
    }

    private CMSAlgorithmProtection(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("Sequence wrong size: One of signatureAlgorithm or macAlgorithm must be present");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1TaggedObject.getTagNo() == 1) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            this.getHighSpeedVideoFpsRangesFor = null;
        } else if (aSN1TaggedObject.getTagNo() == 2) {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag found: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
