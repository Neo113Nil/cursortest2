package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERIA5String extends org.bouncycastle.asn1.ASN1IA5String {
    public static org.bouncycastle.asn1.DERIA5String getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERIA5String)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERIA5String(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets(), true);
    }

    public static org.bouncycastle.asn1.DERIA5String getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERIA5String)) {
            return (org.bouncycastle.asn1.DERIA5String) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1IA5String) {
            return new org.bouncycastle.asn1.DERIA5String(((org.bouncycastle.asn1.ASN1IA5String) obj).Camera2StreamConfigurationMap, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERIA5String) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERIA5String(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERIA5String(java.lang.String str, boolean z) {
        super(str, z);
    }

    public DERIA5String(java.lang.String str) {
        this(str, false);
    }
}
