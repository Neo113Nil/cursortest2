package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface StagedAgreement extends org.bouncycastle.crypto.BasicAgreement {
    org.bouncycastle.crypto.params.AsymmetricKeyParameter calculateStage(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
