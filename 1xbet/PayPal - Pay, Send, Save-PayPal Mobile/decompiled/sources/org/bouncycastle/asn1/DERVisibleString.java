package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERVisibleString extends org.bouncycastle.asn1.ASN1VisibleString {
    public static org.bouncycastle.asn1.DERVisibleString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERVisibleString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERVisibleString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets(), true);
    }

    public static org.bouncycastle.asn1.DERVisibleString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERVisibleString)) {
            return (org.bouncycastle.asn1.DERVisibleString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1VisibleString) {
            return new org.bouncycastle.asn1.DERVisibleString(((org.bouncycastle.asn1.ASN1VisibleString) obj).getHighSpeedVideoFpsRanges, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERVisibleString) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERVisibleString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERVisibleString(java.lang.String str) {
        super(str);
    }
}
