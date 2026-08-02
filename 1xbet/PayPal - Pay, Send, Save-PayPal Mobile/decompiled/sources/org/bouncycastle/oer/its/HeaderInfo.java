package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class HeaderInfo extends org.bouncycastle.asn1.ASN1Object {
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1EncodableVector());
    }

    public static org.bouncycastle.oer.its.HeaderInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.HeaderInfo) {
            return (org.bouncycastle.oer.its.HeaderInfo) obj;
        }
        return null;
    }
}
