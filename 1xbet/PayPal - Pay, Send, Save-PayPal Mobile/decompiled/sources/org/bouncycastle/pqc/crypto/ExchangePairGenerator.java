package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public interface ExchangePairGenerator {
    org.bouncycastle.pqc.crypto.ExchangePair GenerateExchange(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter);

    org.bouncycastle.pqc.crypto.ExchangePair generateExchange(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter);
}
