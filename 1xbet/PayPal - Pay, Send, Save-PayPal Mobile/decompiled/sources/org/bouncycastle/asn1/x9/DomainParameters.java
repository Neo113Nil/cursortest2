package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class DomainParameters extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x9.ValidationParams Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    private DomainParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = objects.hasMoreElements() ? (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement() : null;
        if (aSN1Encodable == null || !(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Integer)) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Encodable);
            aSN1Encodable = objects.hasMoreElements() ? (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement() : null;
        }
        if (aSN1Encodable != null) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x9.ValidationParams.getInstance(aSN1Encodable.toASN1Primitive());
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.x9.ValidationParams validationParams = this.Camera2StreamConfigurationMap;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x9.ValidationParams getValidationParams() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoFpsRanges.getPositiveValue();
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRangesFor.getPositiveValue();
    }

    public java.math.BigInteger getJ() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public java.math.BigInteger getG() {
        return this.getHighSpeedVideoSizes.getPositiveValue();
    }

    public static org.bouncycastle.asn1.x9.DomainParameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x9.DomainParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.DomainParameters) {
            return (org.bouncycastle.asn1.x9.DomainParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.DomainParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DomainParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, org.bouncycastle.asn1.x9.ValidationParams validationParams) {
        if (bigInteger == null) {
            throw new java.lang.IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new java.lang.IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new java.lang.IllegalArgumentException("'q' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger3);
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger4 != null ? new org.bouncycastle.asn1.ASN1Integer(bigInteger4) : null;
        this.Camera2StreamConfigurationMap = validationParams;
    }
}
