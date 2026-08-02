package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcKEKRecipientInfoGenerator extends org.bouncycastle.cms.KEKRecipientInfoGenerator {
    public BcKEKRecipientInfoGenerator(byte[] bArr, org.bouncycastle.operator.bc.BcSymmetricKeyWrapper bcSymmetricKeyWrapper) {
        this(new org.bouncycastle.asn1.cms.KEKIdentifier(bArr, null, null), bcSymmetricKeyWrapper);
    }

    public BcKEKRecipientInfoGenerator(org.bouncycastle.asn1.cms.KEKIdentifier kEKIdentifier, org.bouncycastle.operator.bc.BcSymmetricKeyWrapper bcSymmetricKeyWrapper) {
        super(kEKIdentifier, bcSymmetricKeyWrapper);
    }
}
