package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class McElieceCCA2PrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getOutputFormats));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP() {
        return new org.bouncycastle.pqc.math.linearalgebra.Permutation(this.getHighSpeedVideoFpsRangesFor);
    }

    public int getN() {
        return this.getOutputFormats;
    }

    public int getK() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(getField(), this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2mField(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey) {
            return (org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private McElieceCCA2PrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getOutputFormats = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets();
        this.getHighSpeedVideoSizes = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(5));
    }

    public McElieceCCA2PrivateKey(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getOutputFormats = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = gF2mField.getEncoded();
        this.getHighSpeedVideoSizes = polynomialGF2mSmallM.getEncoded();
        this.getHighSpeedVideoFpsRangesFor = permutation.getEncoded();
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
    }
}
