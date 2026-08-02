package com.zettle.sdk.commons;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/commons/Encryptor;", "Lcom/zettle/sdk/core/Module;", "", "ciphertext", "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", "plaintext", "encrypt", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Encryptor extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.Encryptor.Companion INSTANCE = com.zettle.sdk.commons.Encryptor.Companion.Camera2StreamConfigurationMap;

    java.lang.String decrypt(java.lang.String ciphertext);

    java.lang.String encrypt(java.lang.String plaintext);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.commons.Encryptor encryptor) {
            com.zettle.sdk.core.Module.DefaultImpls.start(encryptor);
        }

        public static void stop(com.zettle.sdk.commons.Encryptor encryptor) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(encryptor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/commons/Encryptor$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/Encryptor;", "create$core_publicRelease", "(Landroid/content/Context;)Lcom/zettle/sdk/commons/Encryptor;", "Ljava/lang/Class;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.commons.Encryptor.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.commons.Encryptor.Companion();
        private static final java.lang.Class<com.zettle.sdk.commons.Encryptor> TYPE = com.zettle.sdk.commons.Encryptor.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.commons.Encryptor> getTYPE$core_publicRelease() {
            return TYPE;
        }

        public final com.zettle.sdk.commons.Encryptor create$core_publicRelease(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.zettle.sdk.commons.TinkEncryptorImpl(context);
        }
    }
}
