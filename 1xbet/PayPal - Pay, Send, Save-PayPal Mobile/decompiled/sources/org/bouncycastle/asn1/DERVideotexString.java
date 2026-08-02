package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERVideotexString extends org.bouncycastle.asn1.ASN1VideotexString {
    public static org.bouncycastle.asn1.DERVideotexString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERVideotexString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERVideotexString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets());
    }

    public static org.bouncycastle.asn1.DERVideotexString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERVideotexString)) {
            return (org.bouncycastle.asn1.DERVideotexString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1VideotexString) {
            return new org.bouncycastle.asn1.DERVideotexString(((org.bouncycastle.asn1.ASN1VideotexString) obj).getHighSpeedVideoFpsRanges, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERVideotexString) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERVideotexString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERVideotexString(byte[] bArr) {
        this(bArr, true);
    }
}
