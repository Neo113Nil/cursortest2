package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class McEliecePrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getInputFormats;
    private int getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getInputFormats));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getOutputFormats));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getSInv() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP2() {
        return new org.bouncycastle.pqc.math.linearalgebra.Permutation(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP1() {
        return new org.bouncycastle.pqc.math.linearalgebra.Permutation(this.getHighSpeedVideoFpsRangesFor);
    }

    public int getN() {
        return this.getInputFormats;
    }

    public int getK() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(getField(), this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2mField(this.Camera2StreamConfigurationMap);
    }

    public static org.bouncycastle.pqc.asn1.McEliecePrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.McEliecePrivateKey) {
            return (org.bouncycastle.pqc.asn1.McEliecePrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.McEliecePrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private McEliecePrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getInputFormats = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.getOutputFormats = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(5)).getOctets();
        this.getHighSpeedVideoSizes = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(6)).getOctets();
    }

    public McEliecePrivateKey(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix) {
        this.getInputFormats = i;
        this.getOutputFormats = i2;
        this.Camera2StreamConfigurationMap = gF2mField.getEncoded();
        this.getHighSpeedVideoFpsRanges = polynomialGF2mSmallM.getEncoded();
        this.getHighSpeedVideoSizes = gF2Matrix.getEncoded();
        this.getHighSpeedVideoFpsRangesFor = permutation.getEncoded();
        this.getHighResolutionOutputSizeshNQ4ISI = permutation2.getEncoded();
    }
}
