package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608p6 implements io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter f6636a = new io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    public final io.appmetrica.analytics.coreapi.internal.crypto.Encrypter getAesRsaEncrypter() {
        return this.f6636a;
    }
}
