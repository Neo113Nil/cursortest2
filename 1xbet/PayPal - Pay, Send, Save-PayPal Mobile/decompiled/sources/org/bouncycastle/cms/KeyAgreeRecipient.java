package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface KeyAgreeRecipient extends org.bouncycastle.cms.Recipient {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrivateKeyAlgorithmIdentifier();

    org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, byte[] bArr) throws org.bouncycastle.cms.CMSException;
}
