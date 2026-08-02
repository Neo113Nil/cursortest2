package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface KEKRecipient extends org.bouncycastle.cms.Recipient {
    org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException;
}
