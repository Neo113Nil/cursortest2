package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class RainbowPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private byte[][] getHighResolutionOutputSizeshNQ4ISI;
    private byte[][] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizesFor;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.Camera2StreamConfigurationMap;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.length; i++) {
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI[i]));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.length; i2++) {
            aSN1EncodableVector3.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges[i2]));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector4 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector4.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector4));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getDocLength() {
        return this.getHighSpeedVideoFpsRangesFor.intValueExact();
    }

    public short[][] getCoeffSingular() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighSpeedVideoFpsRanges);
    }

    public short[] getCoeffScalar() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighSpeedVideoSizes);
    }

    public short[][] getCoeffQuadratic() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.pqc.asn1.RainbowPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.RainbowPublicKey) {
            return (org.bouncycastle.pqc.asn1.RainbowPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.RainbowPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private RainbowPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[aSN1Sequence2.size()][];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(i)).getOctets();
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.getHighSpeedVideoFpsRanges = new byte[aSN1Sequence3.size()][];
        for (int i2 = 0; i2 < aSN1Sequence3.size(); i2++) {
            this.getHighSpeedVideoFpsRanges[i2] = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence3.getObjectAt(i2)).getOctets();
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(((org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
    }

    public RainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(i);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr2);
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr3);
    }
}
