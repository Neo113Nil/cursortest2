package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class Accuracy extends org.bouncycastle.asn1.ASN1Object {
    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer2));
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer3 = this.getHighSpeedVideoFpsRanges;
        if (aSN1Integer3 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer3));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getSeconds() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getMicros() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.tsp.Accuracy getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.Accuracy) {
            return (org.bouncycastle.asn1.tsp.Accuracy) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.Accuracy(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private Accuracy(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = null;
        for (int i = 0; i < aSN1Sequence.size(); i++) {
            if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1Integer) {
                this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(i);
            } else if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
                    this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
                    int intValueExact = aSN1Integer.intValueExact();
                    if (intValueExact <= 0 || intValueExact > 999) {
                        throw new java.lang.IllegalArgumentException("Invalid millis field : not in (1..999)");
                    }
                } else {
                    if (tagNo != 1) {
                        throw new java.lang.IllegalArgumentException("Invalid tag number");
                    }
                    org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
                    this.getHighSpeedVideoFpsRanges = aSN1Integer2;
                    int intValueExact2 = aSN1Integer2.intValueExact();
                    if (intValueExact2 <= 0 || intValueExact2 > 999) {
                        throw new java.lang.IllegalArgumentException("Invalid micros field : not in (1..999)");
                    }
                }
            } else {
                continue;
            }
        }
    }

    public Accuracy(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2, org.bouncycastle.asn1.ASN1Integer aSN1Integer3) {
        int intValueExact;
        int intValueExact2;
        if (aSN1Integer2 != null && ((intValueExact2 = aSN1Integer2.intValueExact()) <= 0 || intValueExact2 > 999)) {
            throw new java.lang.IllegalArgumentException("Invalid millis field : not in (1..999)");
        }
        if (aSN1Integer3 != null && ((intValueExact = aSN1Integer3.intValueExact()) <= 0 || intValueExact > 999)) {
            throw new java.lang.IllegalArgumentException("Invalid micros field : not in (1..999)");
        }
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer2;
        this.getHighSpeedVideoFpsRanges = aSN1Integer3;
    }

    protected Accuracy() {
    }
}
