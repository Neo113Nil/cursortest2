package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class UnsignedInteger extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        int i = this.getHighSpeedVideoSizes;
        byte[] byteArray = this.Camera2StreamConfigurationMap.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            java.lang.System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        return new org.bouncycastle.asn1.DERTaggedObject(false, i, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(byteArray));
    }

    public java.math.BigInteger getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getTagNo() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.eac.UnsignedInteger getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.eac.UnsignedInteger) {
            return (org.bouncycastle.asn1.eac.UnsignedInteger) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.eac.UnsignedInteger(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    private UnsignedInteger(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        this.getHighSpeedVideoSizes = aSN1TaggedObject.getTagNo();
        this.Camera2StreamConfigurationMap = new java.math.BigInteger(1, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false).getOctets());
    }

    public UnsignedInteger(int i, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
