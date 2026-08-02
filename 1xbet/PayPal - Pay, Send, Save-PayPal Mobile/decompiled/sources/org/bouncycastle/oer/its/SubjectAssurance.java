package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SubjectAssurance extends org.bouncycastle.asn1.DEROctetString {
    public static org.bouncycastle.oer.its.SubjectAssurance getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.SubjectAssurance ? (org.bouncycastle.oer.its.SubjectAssurance) obj : new org.bouncycastle.oer.its.SubjectAssurance(org.bouncycastle.asn1.DEROctetString.getInstance(obj).getOctets());
    }

    public SubjectAssurance(byte[] bArr) {
        super(bArr);
    }

    public SubjectAssurance(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1Encodable);
    }
}
