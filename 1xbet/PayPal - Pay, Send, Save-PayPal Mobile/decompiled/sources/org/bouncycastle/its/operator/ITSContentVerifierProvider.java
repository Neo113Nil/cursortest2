package org.bouncycastle.its.operator;

/* loaded from: classes17.dex */
public interface ITSContentVerifierProvider {
    org.bouncycastle.operator.ContentVerifier get(int i) throws org.bouncycastle.operator.OperatorCreationException;

    org.bouncycastle.its.ITSCertificate getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
