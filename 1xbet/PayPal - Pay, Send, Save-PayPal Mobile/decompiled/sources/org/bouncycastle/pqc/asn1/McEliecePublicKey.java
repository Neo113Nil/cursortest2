package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class McEliecePublicKey extends org.bouncycastle.asn1.ASN1Object {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes.getEncoded()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getT() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getN() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.pqc.asn1.McEliecePublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.McEliecePublicKey) {
            return (org.bouncycastle.pqc.asn1.McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.McEliecePublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private McEliecePublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }

    public McEliecePublicKey(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(gF2Matrix);
    }
}
