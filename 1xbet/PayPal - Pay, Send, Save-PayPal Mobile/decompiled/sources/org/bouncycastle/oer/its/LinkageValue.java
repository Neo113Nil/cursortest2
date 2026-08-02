package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class LinkageValue extends org.bouncycastle.asn1.DEROctetString {
    public static org.bouncycastle.oer.its.LinkageValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.LinkageValue) {
            return (org.bouncycastle.oer.its.LinkageValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.LinkageValue(org.bouncycastle.asn1.ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }

    public LinkageValue(byte[] bArr) {
        super(bArr);
    }

    public LinkageValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1Encodable);
    }
}
