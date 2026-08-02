package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EccP256CurvePoint extends org.bouncycastle.oer.its.EccCurvePoint {
    public static final int compressedY0 = 2;
    public static final int compressedY1 = 3;
    public static final int fill = 1;
    public static final int uncompressedP256 = 4;
    public static final int xOnly = 0;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public static class Builder {
        int getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

        static /* synthetic */ org.bouncycastle.oer.its.EccP256CurvePoint getHighSpeedVideoFpsRanges(org.bouncycastle.oer.its.EccP256CurvePoint.Builder builder) {
            return new org.bouncycastle.oer.its.EccP256CurvePoint(builder.getHighResolutionOutputSizeshNQ4ISI, builder.getHighSpeedVideoFpsRangesFor);
        }

        public org.bouncycastle.oer.its.EccP256CurvePoint createFill() {
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            org.bouncycastle.asn1.DERNull dERNull = org.bouncycastle.asn1.DERNull.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = dERNull;
            return new org.bouncycastle.oer.its.EccP256CurvePoint(this.getHighResolutionOutputSizeshNQ4ISI, dERNull);
        }

        public org.bouncycastle.oer.its.EccP256CurvePoint createUncompressedP256(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            this.getHighResolutionOutputSizeshNQ4ISI = 4;
            org.bouncycastle.asn1.DERSequence dERSequence = new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, bigInteger)), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, bigInteger2))});
            this.getHighSpeedVideoFpsRangesFor = dERSequence;
            return new org.bouncycastle.oer.its.EccP256CurvePoint(this.getHighResolutionOutputSizeshNQ4ISI, dERSequence);
        }

        public org.bouncycastle.oer.its.EccP256CurvePoint createXOnly(java.math.BigInteger bigInteger) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            org.bouncycastle.asn1.DEROctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger));
            this.getHighSpeedVideoFpsRangesFor = dEROctetString;
            return new org.bouncycastle.oer.its.EccP256CurvePoint(this.getHighResolutionOutputSizeshNQ4ISI, dEROctetString);
        }

        public org.bouncycastle.oer.its.EccP256CurvePoint createCompressedY1(java.math.BigInteger bigInteger) {
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
            throw new java.lang.IllegalStateException("not fully implemented.");
        }

        public org.bouncycastle.oer.its.EccP256CurvePoint createCompressedY0(java.math.BigInteger bigInteger) {
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            throw new java.lang.IllegalStateException("not fully implemented.");
        }
    }

    public static org.bouncycastle.oer.its.EccP256CurvePoint getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Encodable aSN1OctetString;
        if (obj instanceof org.bouncycastle.oer.its.EccP256CurvePoint) {
            return (org.bouncycastle.oer.its.EccP256CurvePoint) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                aSN1OctetString = org.bouncycastle.asn1.ASN1Null.getInstance(aSN1TaggedObject.getObject());
            } else if (tagNo != 2 && tagNo != 3) {
                if (tagNo != 4) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                aSN1OctetString = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
            }
            org.bouncycastle.oer.its.EccP256CurvePoint.Builder builder = new org.bouncycastle.oer.its.EccP256CurvePoint.Builder();
            builder.getHighResolutionOutputSizeshNQ4ISI = aSN1TaggedObject.getTagNo();
            builder.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
            return org.bouncycastle.oer.its.EccP256CurvePoint.Builder.getHighSpeedVideoFpsRanges(builder);
        }
        aSN1OctetString = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject.getObject());
        org.bouncycastle.oer.its.EccP256CurvePoint.Builder builder2 = new org.bouncycastle.oer.its.EccP256CurvePoint.Builder();
        builder2.getHighResolutionOutputSizeshNQ4ISI = aSN1TaggedObject.getTagNo();
        builder2.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
        return org.bouncycastle.oer.its.EccP256CurvePoint.Builder.getHighSpeedVideoFpsRanges(builder2);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.oer.its.EccCurvePoint
    public byte[] getEncodedPoint() {
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            throw new java.lang.IllegalStateException("x Only not implemented");
        }
        if (i == 2) {
            byte[] octets = org.bouncycastle.asn1.DEROctetString.getInstance(this.getHighSpeedVideoFpsRanges).getOctets();
            byte[] bArr = new byte[octets.length + 1];
            bArr[0] = 2;
            java.lang.System.arraycopy(octets, 0, bArr, 1, octets.length);
            return bArr;
        }
        if (i != 3) {
            if (i != 4) {
                throw new java.lang.IllegalStateException("unknown point choice");
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighSpeedVideoFpsRanges);
            return org.bouncycastle.util.Arrays.concatenate(new byte[]{4}, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets(), org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        }
        byte[] octets2 = org.bouncycastle.asn1.DEROctetString.getInstance(this.getHighSpeedVideoFpsRanges).getOctets();
        byte[] bArr2 = new byte[octets2.length + 1];
        bArr2[0] = 3;
        java.lang.System.arraycopy(octets2, 0, bArr2, 1, octets2.length);
        return bArr2;
    }

    public int getChoice() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.EccP256CurvePoint.Builder builder() {
        return new org.bouncycastle.oer.its.EccP256CurvePoint.Builder();
    }

    public EccP256CurvePoint(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
