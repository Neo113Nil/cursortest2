package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EccP384CurvePoint extends org.bouncycastle.oer.its.EccCurvePoint {
    public static final int compressedY0 = 2;
    public static final int compressedY1 = 3;
    public static final int fill = 1;
    public static final int uncompressedP384 = 4;
    public static final int xOnly = 0;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;

    public static class Builder {
        int getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

        static /* synthetic */ org.bouncycastle.oer.its.EccP384CurvePoint getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.oer.its.EccP384CurvePoint.Builder builder) {
            return new org.bouncycastle.oer.its.EccP384CurvePoint(builder.getHighSpeedVideoFpsRangesFor, builder.getHighSpeedVideoSizes);
        }

        public org.bouncycastle.oer.its.EccP384CurvePoint createFill() {
            this.getHighSpeedVideoFpsRangesFor = 1;
            org.bouncycastle.asn1.DERNull dERNull = org.bouncycastle.asn1.DERNull.INSTANCE;
            this.getHighSpeedVideoSizes = dERNull;
            return new org.bouncycastle.oer.its.EccP384CurvePoint(this.getHighSpeedVideoFpsRangesFor, dERNull);
        }

        public org.bouncycastle.oer.its.EccP384CurvePoint createUncompressedP384(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            this.getHighSpeedVideoFpsRangesFor = 4;
            org.bouncycastle.asn1.DERSequence dERSequence = new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(48, bigInteger)), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(48, bigInteger2))});
            this.getHighSpeedVideoSizes = dERSequence;
            return new org.bouncycastle.oer.its.EccP384CurvePoint(this.getHighSpeedVideoFpsRangesFor, dERSequence);
        }

        public org.bouncycastle.oer.its.EccP384CurvePoint createXOnly(java.math.BigInteger bigInteger) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            org.bouncycastle.asn1.DEROctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger));
            this.getHighSpeedVideoSizes = dEROctetString;
            return new org.bouncycastle.oer.its.EccP384CurvePoint(this.getHighSpeedVideoFpsRangesFor, dEROctetString);
        }

        public org.bouncycastle.oer.its.EccP384CurvePoint createCompressedY1(java.math.BigInteger bigInteger) {
            this.getHighSpeedVideoFpsRangesFor = 3;
            throw new java.lang.IllegalStateException("not fully implemented.");
        }

        public org.bouncycastle.oer.its.EccP384CurvePoint createCompressedY0(java.math.BigInteger bigInteger) {
            this.getHighSpeedVideoFpsRangesFor = 2;
            throw new java.lang.IllegalStateException("not fully implemented.");
        }
    }

    public static org.bouncycastle.oer.its.EccP384CurvePoint getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Encodable aSN1OctetString;
        if (obj instanceof org.bouncycastle.oer.its.EccP384CurvePoint) {
            return (org.bouncycastle.oer.its.EccP384CurvePoint) obj;
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
            org.bouncycastle.oer.its.EccP384CurvePoint.Builder builder = new org.bouncycastle.oer.its.EccP384CurvePoint.Builder();
            builder.getHighSpeedVideoFpsRangesFor = aSN1TaggedObject.getTagNo();
            builder.getHighSpeedVideoSizes = aSN1OctetString;
            return org.bouncycastle.oer.its.EccP384CurvePoint.Builder.getHighResolutionOutputSizeshNQ4ISI(builder);
        }
        aSN1OctetString = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject.getObject());
        org.bouncycastle.oer.its.EccP384CurvePoint.Builder builder2 = new org.bouncycastle.oer.its.EccP384CurvePoint.Builder();
        builder2.getHighSpeedVideoFpsRangesFor = aSN1TaggedObject.getTagNo();
        builder2.getHighSpeedVideoSizes = aSN1OctetString;
        return org.bouncycastle.oer.its.EccP384CurvePoint.Builder.getHighResolutionOutputSizeshNQ4ISI(builder2);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.oer.its.EccCurvePoint
    public byte[] getEncodedPoint() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            throw new java.lang.IllegalStateException("x Only not implemented");
        }
        if (i == 2) {
            byte[] octets = org.bouncycastle.asn1.DEROctetString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI).getOctets();
            byte[] bArr = new byte[octets.length + 1];
            bArr[0] = 2;
            java.lang.System.arraycopy(octets, 0, bArr, 1, octets.length);
            return bArr;
        }
        if (i != 3) {
            if (i != 4) {
                throw new java.lang.IllegalStateException("unknown point choice");
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            return org.bouncycastle.util.Arrays.concatenate(new byte[]{4}, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets(), org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        }
        byte[] octets2 = org.bouncycastle.asn1.DEROctetString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI).getOctets();
        byte[] bArr2 = new byte[octets2.length + 1];
        bArr2[0] = 3;
        java.lang.System.arraycopy(octets2, 0, bArr2, 1, octets2.length);
        return bArr2;
    }

    public int getChoice() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.EccP384CurvePoint.Builder builder() {
        return new org.bouncycastle.oer.its.EccP384CurvePoint.Builder();
    }

    public EccP384CurvePoint(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
