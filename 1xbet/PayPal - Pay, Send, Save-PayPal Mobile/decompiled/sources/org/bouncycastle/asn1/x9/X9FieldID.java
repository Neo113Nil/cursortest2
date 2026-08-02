package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9FieldID extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x9.X9ObjectIdentifiers {
    private org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Primitive getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x9.X9FieldID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.X9FieldID) {
            return (org.bouncycastle.asn1.x9.X9FieldID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.X9FieldID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private X9FieldID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = aSN1Sequence.getObjectAt(1).toASN1Primitive();
    }

    public X9FieldID(java.math.BigInteger bigInteger) {
        this.getHighResolutionOutputSizeshNQ4ISI = prime_field;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    public X9FieldID(int i, int i2, int i3, int i4) {
        this.getHighResolutionOutputSizeshNQ4ISI = characteristic_two_field;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new java.lang.IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(tpBasis);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new java.lang.IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(ppBasis);
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(i2));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(i3));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(i4));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
