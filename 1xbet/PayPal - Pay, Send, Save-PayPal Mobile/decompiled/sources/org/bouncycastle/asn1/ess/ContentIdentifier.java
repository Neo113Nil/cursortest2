package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class ContentIdentifier extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1OctetString getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.ess.ContentIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.ContentIdentifier) {
            return (org.bouncycastle.asn1.ess.ContentIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.ContentIdentifier(org.bouncycastle.asn1.ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public ContentIdentifier(byte[] bArr) {
        this(new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    private ContentIdentifier(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoSizes = aSN1OctetString;
    }
}
