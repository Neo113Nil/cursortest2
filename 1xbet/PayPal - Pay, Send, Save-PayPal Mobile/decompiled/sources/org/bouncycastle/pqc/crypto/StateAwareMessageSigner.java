package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public interface StateAwareMessageSigner extends org.bouncycastle.pqc.crypto.MessageSigner {
    org.bouncycastle.crypto.params.AsymmetricKeyParameter getUpdatedPrivateKey();
}
