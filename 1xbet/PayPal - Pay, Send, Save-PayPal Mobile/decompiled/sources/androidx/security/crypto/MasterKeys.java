package androidx.security.crypto;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class MasterKeys {

    @java.lang.Deprecated
    public static final android.security.keystore.KeyGenParameterSpec AES256_GCM_SPEC = new android.security.keystore.KeyGenParameterSpec.Builder(androidx.security.crypto.MasterKey.DEFAULT_MASTER_KEY_ALIAS, 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    private MasterKeys() {
    }

    public static java.lang.String getOrCreate(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) throws java.security.GeneralSecurityException, java.io.IOException {
        if (keyGenParameterSpec.getKeySize() != 256) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key size, want 256 bits got ");
            sb.append(keyGenParameterSpec.getKeySize());
            sb.append(" bits");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!java.util.Arrays.equals(keyGenParameterSpec.getBlockModes(), new java.lang.String[]{com.google.android.gms.stats.CodePackage.GCM})) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid block mode, want GCM got ");
            sb2.append(java.util.Arrays.toString(keyGenParameterSpec.getBlockModes()));
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            sb3.append(keyGenParameterSpec.getPurposes());
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        if (!java.util.Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new java.lang.String[]{"NoPadding"})) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("invalid padding mode, want NoPadding got ");
            sb4.append(java.util.Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
        if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() > 0) {
            synchronized (getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!keyStore.containsAlias(keystoreAlias)) {
                    try {
                        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM, "AndroidKeyStore");
                        keyGenerator.init(keyGenParameterSpec);
                        keyGenerator.generateKey();
                    } catch (java.security.ProviderException e) {
                        throw new java.security.GeneralSecurityException(e.getMessage(), e);
                    }
                }
            }
            return keyGenParameterSpec.getKeystoreAlias();
        }
        throw new java.lang.IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
    }
}
