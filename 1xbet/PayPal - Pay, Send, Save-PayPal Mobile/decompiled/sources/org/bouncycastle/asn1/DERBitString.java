package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERBitString extends org.bouncycastle.asn1.ASN1BitString {
    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    public static org.bouncycastle.asn1.DERBitString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERBitString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERBitString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets(), true);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte b = this.getHighSpeedVideoSizes[0];
        int length = this.getHighSpeedVideoSizes.length;
        int i = length - 1;
        byte b2 = this.getHighSpeedVideoSizes[i];
        byte b3 = (byte) ((255 << (b & 255)) & this.getHighSpeedVideoSizes[i]);
        if (b2 == b3) {
            aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 3, this.getHighSpeedVideoSizes);
            return;
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(3);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, i);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(b3);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoSizes.length);
    }

    public static org.bouncycastle.asn1.DERBitString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERBitString)) {
            return (org.bouncycastle.asn1.DERBitString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1BitString) {
            return convert((org.bouncycastle.asn1.ASN1BitString) obj);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return convert((org.bouncycastle.asn1.ASN1BitString) fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.DERBitString convert(org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        return (org.bouncycastle.asn1.DERBitString) aSN1BitString.getHighSpeedVideoFpsRangesFor();
    }

    DERBitString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER), 0);
    }

    public DERBitString(int i) {
        super(getBytes(i), getPadBits(i));
    }

    public DERBitString(byte b, int i) {
        super(b, i);
    }
}
