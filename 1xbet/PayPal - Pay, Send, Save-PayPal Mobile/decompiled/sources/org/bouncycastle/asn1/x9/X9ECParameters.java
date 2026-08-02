package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9ECParameters extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x9.X9ObjectIdentifiers {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.asn1.x9.X9ECPoint Camera2StreamConfigurationMap;
    private org.bouncycastle.math.ec.ECCurve getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x9.X9FieldID getHighSpeedVideoSizes;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private byte[] getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.x9.X9Curve(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
        if (this.getHighSpeedVideoFpsRanges != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean hasSeed() {
        return this.getInputSizeshNQ4ISI != null;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getInputSizeshNQ4ISI);
    }

    public java.math.BigInteger getN() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.math.BigInteger getH() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.math.ec.ECPoint getG() {
        return this.Camera2StreamConfigurationMap.getPoint();
    }

    public org.bouncycastle.asn1.x9.X9FieldID getFieldIDEntry() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x9.X9Curve getCurveEntry() {
        return new org.bouncycastle.asn1.x9.X9Curve(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
    }

    public org.bouncycastle.math.ec.ECCurve getCurve() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x9.X9ECPoint getBaseEntry() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.X9ECParameters) {
            return (org.bouncycastle.asn1.x9.X9ECParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.X9ECParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X9ECParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.asn1.x9.X9ECPoint x9ECPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        org.bouncycastle.asn1.x9.X9FieldID x9FieldID;
        this.getHighResolutionOutputSizeshNQ4ISI = eCCurve;
        this.Camera2StreamConfigurationMap = x9ECPoint;
        this.getHighSpeedVideoSizesFor = bigInteger;
        this.getHighSpeedVideoFpsRanges = bigInteger2;
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpCurve(eCCurve)) {
            x9FieldID = new org.bouncycastle.asn1.x9.X9FieldID(eCCurve.getField().getCharacteristic());
        } else {
            if (!org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(eCCurve)) {
                throw new java.lang.IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] exponentsPresent = ((org.bouncycastle.math.field.PolynomialExtensionField) eCCurve.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                x9FieldID = new org.bouncycastle.asn1.x9.X9FieldID(exponentsPresent[2], exponentsPresent[1]);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new java.lang.IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                x9FieldID = new org.bouncycastle.asn1.x9.X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.getHighSpeedVideoSizes = x9FieldID;
    }

    public X9ECParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.asn1.x9.X9ECPoint x9ECPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(eCCurve, x9ECPoint, bigInteger, bigInteger2, null);
    }

    public X9ECParameters(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.asn1.x9.X9ECPoint x9ECPoint, java.math.BigInteger bigInteger) {
        this(eCCurve, x9ECPoint, bigInteger, null, null);
    }

    private X9ECParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (!(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) || !((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).hasValue(1)) {
            throw new java.lang.IllegalArgumentException("bad version in X9ECParameters");
        }
        this.getHighSpeedVideoSizesFor = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(4)).getValue();
        if (aSN1Sequence.size() == 6) {
            this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
        }
        org.bouncycastle.asn1.x9.X9Curve x9Curve = new org.bouncycastle.asn1.x9.X9Curve(org.bouncycastle.asn1.x9.X9FieldID.getInstance(aSN1Sequence.getObjectAt(1)), this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2)));
        this.getHighResolutionOutputSizeshNQ4ISI = x9Curve.getCurve();
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(3);
        if (objectAt instanceof org.bouncycastle.asn1.x9.X9ECPoint) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.x9.X9ECPoint) objectAt;
        } else {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x9.X9ECPoint(this.getHighResolutionOutputSizeshNQ4ISI, (org.bouncycastle.asn1.ASN1OctetString) objectAt);
        }
        this.getInputSizeshNQ4ISI = x9Curve.getSeed();
    }
}
