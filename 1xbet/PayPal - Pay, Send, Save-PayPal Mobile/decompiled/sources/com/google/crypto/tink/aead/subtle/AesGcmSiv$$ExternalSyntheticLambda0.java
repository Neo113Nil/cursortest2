package com.google.crypto.tink.aead.subtle;

/* loaded from: classes4.dex */
public final /* synthetic */ class AesGcmSiv$$ExternalSyntheticLambda0 implements com.google.crypto.tink.aead.internal.AesGcmSiv.ThrowingSupplier {
    @Override // com.google.crypto.tink.aead.internal.AesGcmSiv.ThrowingSupplier
    public final java.lang.Object get() {
        javax.crypto.Cipher cipherSupplier;
        cipherSupplier = com.google.crypto.tink.aead.subtle.AesGcmSiv.cipherSupplier();
        return cipherSupplier;
    }
}
