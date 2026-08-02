package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERBMPString extends org.bouncycastle.asn1.ASN1BMPString {
    public static org.bouncycastle.asn1.DERBMPString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERBMPString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERBMPString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets());
    }

    public static org.bouncycastle.asn1.DERBMPString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERBMPString)) {
            return (org.bouncycastle.asn1.DERBMPString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1BMPString) {
            return new org.bouncycastle.asn1.DERBMPString(((org.bouncycastle.asn1.ASN1BMPString) obj).getHighSpeedVideoFpsRangesFor);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERBMPString) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERBMPString(char[] cArr) {
        super(cArr);
    }

    DERBMPString(byte[] bArr) {
        super(bArr);
    }

    public DERBMPString(java.lang.String str) {
        super(str);
    }
}
