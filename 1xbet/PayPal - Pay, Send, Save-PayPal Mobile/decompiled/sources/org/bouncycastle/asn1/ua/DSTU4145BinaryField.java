package org.bouncycastle.asn1.ua;

/* loaded from: classes17.dex */
public class DSTU4145BinaryField extends org.bouncycastle.asn1.ASN1Object {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        if (this.getHighSpeedVideoFpsRanges == 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getM() {
        return this.getHighSpeedVideoSizes;
    }

    public int getK3() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getK2() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getK1() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ua.DSTU4145BinaryField getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ua.DSTU4145BinaryField) {
            return (org.bouncycastle.asn1.ua.DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ua.DSTU4145BinaryField(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DSTU4145BinaryField(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1Sequence)) {
                throw new java.lang.IllegalArgumentException("object parse error");
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
    }

    public DSTU4145BinaryField(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = i3;
        this.Camera2StreamConfigurationMap = i4;
    }

    public DSTU4145BinaryField(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
