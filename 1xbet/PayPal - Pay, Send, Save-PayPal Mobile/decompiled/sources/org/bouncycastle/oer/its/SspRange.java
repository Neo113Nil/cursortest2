package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SspRange extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.SspRange.Builder setValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.SspRange.Builder setChoice(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public org.bouncycastle.oer.its.SspRange.Builder opaque(org.bouncycastle.oer.its.SequenceOfOctetString sequenceOfOctetString) {
            this.getHighResolutionOutputSizeshNQ4ISI = sequenceOfOctetString;
            this.getHighSpeedVideoSizes = 0;
            return this;
        }

        public org.bouncycastle.oer.its.SspRange.Builder extension(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(bArr);
            this.getHighSpeedVideoSizes = 2;
            return this;
        }

        public org.bouncycastle.oer.its.SspRange createSspRange() {
            return new org.bouncycastle.oer.its.SspRange(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public org.bouncycastle.oer.its.SspRange.Builder bitmapSSPRange(org.bouncycastle.oer.its.BitmapSspRange bitmapSspRange) {
            this.getHighResolutionOutputSizeshNQ4ISI = bitmapSspRange;
            this.getHighSpeedVideoSizes = 3;
            return this;
        }

        public org.bouncycastle.oer.its.SspRange.Builder all() {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERNull.INSTANCE;
            this.getHighSpeedVideoSizes = 0;
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.oer.its.SspRange getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SspRange) {
            return (org.bouncycastle.oer.its.SspRange) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.SspRange(0, org.bouncycastle.oer.its.SequenceOfOctetString.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.SspRange(1, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        if (tagNo != 2) {
            if (tagNo == 3) {
                return new org.bouncycastle.oer.its.SspRange(3, org.bouncycastle.oer.its.BitmapSspRange.getInstance(aSN1TaggedObject.getObject()));
            }
            throw new java.lang.IllegalStateException("unknown choice ".concat(java.lang.String.valueOf(tagNo)));
        }
        try {
            return new org.bouncycastle.oer.its.SspRange(2, new org.bouncycastle.asn1.DEROctetString(aSN1TaggedObject.getObject().getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static org.bouncycastle.oer.its.SspRange.Builder builder() {
        return new org.bouncycastle.oer.its.SspRange.Builder();
    }

    public SspRange(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !(aSN1Encodable instanceof org.bouncycastle.oer.its.BitmapSspRange)) {
                        throw new java.lang.IllegalArgumentException("value is not BitmapSspRange");
                    }
                } else if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString)) {
                    throw new java.lang.IllegalArgumentException("value is not ASN1OctetString");
                }
            } else if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Null)) {
                throw new java.lang.IllegalArgumentException("value is not ASN1Null");
            }
        } else if (!(aSN1Encodable instanceof org.bouncycastle.oer.its.SequenceOfOctetString)) {
            throw new java.lang.IllegalArgumentException("value is not SequenceOfOctetString");
        }
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
