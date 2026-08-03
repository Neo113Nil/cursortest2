package com.digitalturbine.ignite.encryption.generator;

/* loaded from: classes2.dex */
public final class a {
    public final java.security.spec.AlgorithmParameterSpec a() {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : create specs", "KeyGeneratorSpecCreator");
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return new android.security.keystore.KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
        }
        return null;
    }
}
