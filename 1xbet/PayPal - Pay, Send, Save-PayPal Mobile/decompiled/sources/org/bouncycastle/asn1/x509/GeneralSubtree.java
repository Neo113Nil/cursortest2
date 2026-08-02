package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class GeneralSubtree extends org.bouncycastle.asn1.ASN1Object {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(0);
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRanges;
        if (aSN1Integer != null && !aSN1Integer.hasValue(0)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges));
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = this.getHighSpeedVideoSizes;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getMinimum() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRanges;
        return aSN1Integer == null ? getHighSpeedVideoFpsRangesFor : aSN1Integer.getValue();
    }

    public java.math.BigInteger getMaximum() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoSizes;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public org.bouncycastle.asn1.x509.GeneralName getBase() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.GeneralSubtree getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new org.bouncycastle.asn1.x509.GeneralSubtree(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.GeneralSubtree getInstance(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof org.bouncycastle.asn1.x509.GeneralSubtree ? (org.bouncycastle.asn1.x509.GeneralSubtree) obj : new org.bouncycastle.asn1.x509.GeneralSubtree(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
    }

    public GeneralSubtree(org.bouncycastle.asn1.x509.GeneralName generalName, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        if (bigInteger2 != null) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        }
        this.getHighSpeedVideoFpsRanges = bigInteger == null ? null : new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    public GeneralSubtree(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this(generalName, null, null);
    }

    private GeneralSubtree(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
                    return;
                } else if (tagNo != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad tag number: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else {
                if (size != 3) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad sequence size: ");
                    sb2.append(aSN1Sequence.size());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject2 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                if (aSN1TaggedObject2.getTagNo() != 0) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Bad tag number for 'minimum': ");
                    sb3.append(aSN1TaggedObject2.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject2, false);
                aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2));
                if (aSN1TaggedObject.getTagNo() != 1) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Bad tag number for 'maximum': ");
                    sb4.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
        }
    }
}
