package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERUniversalString extends org.bouncycastle.asn1.ASN1UniversalString {
    public static org.bouncycastle.asn1.DERUniversalString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERUniversalString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERUniversalString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets(), true);
    }

    public static org.bouncycastle.asn1.DERUniversalString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERUniversalString)) {
            return (org.bouncycastle.asn1.DERUniversalString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1UniversalString) {
            return new org.bouncycastle.asn1.DERUniversalString(((org.bouncycastle.asn1.ASN1UniversalString) obj).getHighSpeedVideoFpsRanges, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERUniversalString) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERUniversalString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERUniversalString(byte[] bArr) {
        this(bArr, true);
    }
}
