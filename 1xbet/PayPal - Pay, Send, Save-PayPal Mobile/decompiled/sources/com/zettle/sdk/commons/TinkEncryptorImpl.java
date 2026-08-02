package com.zettle.sdk.commons;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0006*\u00020\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/commons/TinkEncryptorImpl;", "Lcom/zettle/sdk/commons/Encryptor;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", "encrypt", "Lcom/google/crypto/tink/Aead;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getLogTag", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class TinkEncryptorImpl implements com.zettle.sdk.commons.Encryptor, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ com.zettle.sdk.core.log.Loggable getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public TinkEncryptorImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = com.zettle.sdk.core.log.LogKt.loggable$default("TinkEncryptor", null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = context.getApplicationContext();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.crypto.tink.Aead>() { // from class: com.zettle.sdk.commons.TinkEncryptorImpl$aead$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.google.crypto.tink.Aead invoke() {
                android.content.Context context2;
                try {
                    com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder builder = new com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder();
                    context2 = com.zettle.sdk.commons.TinkEncryptorImpl.this.getHighSpeedVideoFpsRangesFor;
                    return (com.google.crypto.tink.Aead) builder.withSharedPref(context2, "pp_encryption_key_keyset", "pp_encryption_key_prefs").withKeyTemplate(com.google.crypto.tink.aead.AeadKeyTemplates.AES256_GCM).withMasterKeyUri("android-keystore://pp_encryption_key").build().getKeysetHandle().getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.Aead.class);
                } catch (java.lang.Exception e) {
                    com.zettle.sdk.core.log.LogKt.warn(com.zettle.sdk.commons.TinkEncryptorImpl.this, "Failed to initialize encryption", e);
                    return null;
                }
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        com.zettle.sdk.commons.Encryptor.DefaultImpls.start(this);
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.commons.Encryptor.DefaultImpls.stop(this);
    }

    @Override // com.zettle.sdk.commons.Encryptor
    public final java.lang.String encrypt(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        try {
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = p0.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            com.google.crypto.tink.Aead aead = (com.google.crypto.tink.Aead) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            byte[] encrypt = aead != null ? aead.encrypt(bytes, null) : null;
            if (encrypt != null) {
                return android.util.Base64.encodeToString(encrypt, 2);
            }
            return null;
        } catch (java.lang.Exception e) {
            com.zettle.sdk.core.log.LogKt.warn(this, "Encryption failed", e);
            return null;
        }
    }

    @Override // com.zettle.sdk.commons.Encryptor
    public final java.lang.String decrypt(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        try {
            byte[] decode = android.util.Base64.decode(p0, 2);
            com.google.crypto.tink.Aead aead = (com.google.crypto.tink.Aead) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            byte[] decrypt = aead != null ? aead.decrypt(decode, null) : null;
            if (decrypt == null) {
                return null;
            }
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            return new java.lang.String(decrypt, charset);
        } catch (java.lang.Exception e) {
            com.zettle.sdk.core.log.LogKt.warn(this, "Decryption failed", e);
            return null;
        }
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes();
    }
}
