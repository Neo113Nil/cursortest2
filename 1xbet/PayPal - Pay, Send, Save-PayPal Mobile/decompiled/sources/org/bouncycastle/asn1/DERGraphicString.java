package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERGraphicString extends org.bouncycastle.asn1.ASN1GraphicString {
    public static org.bouncycastle.asn1.DERGraphicString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERGraphicString)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERGraphicString(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets());
    }

    public static org.bouncycastle.asn1.DERGraphicString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERGraphicString)) {
            return (org.bouncycastle.asn1.DERGraphicString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1GraphicString) {
            return new org.bouncycastle.asn1.DERGraphicString(((org.bouncycastle.asn1.ASN1GraphicString) obj).Camera2StreamConfigurationMap, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERGraphicString) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERGraphicString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERGraphicString(byte[] bArr) {
        this(bArr, true);
    }
}
