package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface SignerInformationVerifierProvider {
    org.bouncycastle.cms.SignerInformationVerifier get(org.bouncycastle.cms.SignerId signerId) throws org.bouncycastle.operator.OperatorCreationException;
}
