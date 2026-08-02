package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERT61String extends org.bouncycastle.asn1.ASN1T61String {
    public static org.bouncycastle.asn1.DERT61String getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof org.bouncycastle.asn1.DERT61String)) ? getInstance((java.lang.Object) object) : new org.bouncycastle.asn1.DERT61String(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets(), true);
    }

    public static org.bouncycastle.asn1.DERT61String getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.DERT61String)) {
            return (org.bouncycastle.asn1.DERT61String) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1T61String) {
            return new org.bouncycastle.asn1.DERT61String(((org.bouncycastle.asn1.ASN1T61String) obj).Camera2StreamConfigurationMap, false);
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.DERT61String) fromByteArray((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    DERT61String(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public DERT61String(byte[] bArr) {
        this(bArr, true);
    }

    public DERT61String(java.lang.String str) {
        super(str);
    }
}
