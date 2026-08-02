package org.bouncycastle.asn1.misc;

/* loaded from: classes17.dex */
public class ScryptParams extends org.bouncycastle.asn1.ASN1Object {
    private final java.math.BigInteger Camera2StreamConfigurationMap;
    private final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private final java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getSalt() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public java.math.BigInteger getParallelizationParameter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getKeyLength() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getCostParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getBlockSize() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.misc.ScryptParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.misc.ScryptParams) {
            return (org.bouncycastle.asn1.misc.ScryptParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.misc.ScryptParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ScryptParams(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
        this.Camera2StreamConfigurationMap = bigInteger4;
    }

    public ScryptParams(byte[] bArr, int i, int i2, int i3, int i4) {
        this(bArr, java.math.BigInteger.valueOf(i), java.math.BigInteger.valueOf(i2), java.math.BigInteger.valueOf(i3), java.math.BigInteger.valueOf(i4));
    }

    public ScryptParams(byte[] bArr, int i, int i2, int i3) {
        this(bArr, java.math.BigInteger.valueOf(i), java.math.BigInteger.valueOf(i2), java.math.BigInteger.valueOf(i3), (java.math.BigInteger) null);
    }

    private ScryptParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 5) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid sequence: size = ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).getValue();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3)).getValue();
        this.Camera2StreamConfigurationMap = aSN1Sequence.size() == 5 ? org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4)).getValue() : null;
    }
}
