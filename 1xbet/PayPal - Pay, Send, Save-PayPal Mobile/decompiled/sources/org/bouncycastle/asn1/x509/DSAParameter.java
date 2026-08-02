package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class DSAParameter extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoFpsRangesFor.getPositiveValue();
    }

    public java.math.BigInteger getP() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPositiveValue();
    }

    public java.math.BigInteger getG() {
        return this.Camera2StreamConfigurationMap.getPositiveValue();
    }

    public static org.bouncycastle.asn1.x509.DSAParameter getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.DSAParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.DSAParameter) {
            return (org.bouncycastle.asn1.x509.DSAParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.DSAParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DSAParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
    }

    public DSAParameter(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger3);
    }
}
