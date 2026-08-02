package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class DHDomainParameters extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x9.DHValidationParms getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    private DHDomainParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = objects.hasMoreElements() ? (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement() : null;
        if (aSN1Encodable != null && (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Integer)) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Encodable);
            aSN1Encodable = objects.hasMoreElements() ? (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement() : null;
        }
        if (aSN1Encodable != null) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x9.DHValidationParms.getInstance(aSN1Encodable.toASN1Primitive());
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.Camera2StreamConfigurationMap;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.x9.DHValidationParms dHValidationParms = this.getHighSpeedVideoFpsRangesFor;
        if (dHValidationParms != null) {
            aSN1EncodableVector.add(dHValidationParms);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x9.DHValidationParms getValidationParms() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getQ() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Integer getP() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getJ() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Integer getG() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x9.DHDomainParameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x9.DHDomainParameters getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x9.DHDomainParameters)) {
            return (org.bouncycastle.asn1.x9.DHDomainParameters) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x9.DHDomainParameters((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid DHDomainParameters: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public DHDomainParameters(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2, org.bouncycastle.asn1.ASN1Integer aSN1Integer3, org.bouncycastle.asn1.ASN1Integer aSN1Integer4, org.bouncycastle.asn1.x9.DHValidationParms dHValidationParms) {
        if (aSN1Integer == null) {
            throw new java.lang.IllegalArgumentException("'p' cannot be null");
        }
        if (aSN1Integer2 == null) {
            throw new java.lang.IllegalArgumentException("'g' cannot be null");
        }
        if (aSN1Integer3 == null) {
            throw new java.lang.IllegalArgumentException("'q' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoSizes = aSN1Integer2;
        this.getHighSpeedVideoFpsRanges = aSN1Integer3;
        this.Camera2StreamConfigurationMap = aSN1Integer4;
        this.getHighSpeedVideoFpsRangesFor = dHValidationParms;
    }

    public DHDomainParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, org.bouncycastle.asn1.x9.DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            throw new java.lang.IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new java.lang.IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new java.lang.IllegalArgumentException("'q' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger3);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger4);
        this.getHighSpeedVideoFpsRangesFor = dHValidationParms;
    }
}
