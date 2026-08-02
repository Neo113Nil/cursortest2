package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CrlIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1UTCTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes.toASN1Primitive());
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getCrlNumber() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public org.bouncycastle.asn1.x500.X500Name getCrlIssuer() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1UTCTime getCrlIssuedTime() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.CrlIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CrlIdentifier) {
            return (org.bouncycastle.asn1.esf.CrlIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CrlIdentifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlIdentifier(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = x500Name;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1UTCTime;
        if (bigInteger != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        }
    }

    public CrlIdentifier(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this(x500Name, aSN1UTCTime, null);
    }

    private CrlIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 3) {
            throw new java.lang.IllegalArgumentException();
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1UTCTime.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }
}
