package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class McElieceCCA2PublicKey extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor.getEncoded()));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getT() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getN() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey) {
            return (org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private McElieceCCA2PublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }

    public McElieceCCA2PublicKey(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(gF2Matrix.getEncoded());
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
    }
}
