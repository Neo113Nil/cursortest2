package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9Curve extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x9.X9ObjectIdentifiers {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.math.ec.ECCurve getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;

    public X9Curve(org.bouncycastle.math.ec.ECCurve eCCurve, byte[] bArr) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = eCCurve;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpCurve(this.getHighResolutionOutputSizeshNQ4ISI)) {
            aSN1ObjectIdentifier = prime_field;
        } else {
            if (!org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(this.getHighResolutionOutputSizeshNQ4ISI)) {
                throw new java.lang.IllegalArgumentException("This type of ECCurve is not implemented");
            }
            aSN1ObjectIdentifier = characteristic_two_field;
        }
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.x9.X9FieldElement x9FieldElement;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        if (!this.getHighSpeedVideoFpsRanges.equals((org.bouncycastle.asn1.ASN1Primitive) prime_field)) {
            if (this.getHighSpeedVideoFpsRanges.equals((org.bouncycastle.asn1.ASN1Primitive) characteristic_two_field)) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.x9.X9FieldElement(this.getHighResolutionOutputSizeshNQ4ISI.getA()).toASN1Primitive());
                x9FieldElement = new org.bouncycastle.asn1.x9.X9FieldElement(this.getHighResolutionOutputSizeshNQ4ISI.getB());
            }
            if (this.Camera2StreamConfigurationMap != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(this.Camera2StreamConfigurationMap));
            }
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.x9.X9FieldElement(this.getHighResolutionOutputSizeshNQ4ISI.getA()).toASN1Primitive());
        x9FieldElement = new org.bouncycastle.asn1.x9.X9FieldElement(this.getHighResolutionOutputSizeshNQ4ISI.getB());
        aSN1EncodableVector.add(x9FieldElement.toASN1Primitive());
        if (this.Camera2StreamConfigurationMap != null) {
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.math.ec.ECCurve getCurve() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public X9Curve(org.bouncycastle.math.ec.ECCurve eCCurve) {
        this(eCCurve, null);
    }

    public X9Curve(org.bouncycastle.asn1.x9.X9FieldID x9FieldID, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int intValueExact;
        int i;
        int i2;
        org.bouncycastle.math.ec.ECCurve f2m;
        this.getHighSpeedVideoFpsRanges = null;
        org.bouncycastle.asn1.ASN1ObjectIdentifier identifier = x9FieldID.getIdentifier();
        this.getHighSpeedVideoFpsRanges = identifier;
        if (identifier.equals((org.bouncycastle.asn1.ASN1Primitive) prime_field)) {
            f2m = new org.bouncycastle.math.ec.ECCurve.Fp(((org.bouncycastle.asn1.ASN1Integer) x9FieldID.getParameters()).getValue(), new java.math.BigInteger(1, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets()), new java.math.BigInteger(1, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        } else {
            if (!this.getHighSpeedVideoFpsRanges.equals((org.bouncycastle.asn1.ASN1Primitive) characteristic_two_field)) {
                throw new java.lang.IllegalArgumentException("This type of ECCurve is not implemented");
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(x9FieldID.getParameters());
            int intValueExact2 = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence2.getObjectAt(0)).intValueExact();
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1);
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) tpBasis)) {
                i = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intValueExact();
                i2 = 0;
                intValueExact = 0;
            } else {
                if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) ppBasis)) {
                    throw new java.lang.IllegalArgumentException("This type of EC basis is not implemented");
                }
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence2.getObjectAt(2));
                int intValueExact3 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(0)).intValueExact();
                int intValueExact4 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(1)).intValueExact();
                intValueExact = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(2)).intValueExact();
                i = intValueExact3;
                i2 = intValueExact4;
            }
            f2m = new org.bouncycastle.math.ec.ECCurve.F2m(intValueExact2, i, i2, intValueExact, new java.math.BigInteger(1, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets()), new java.math.BigInteger(1, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = f2m;
        if (aSN1Sequence.size() == 3) {
            this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(2)).getBytes();
        }
    }
}
