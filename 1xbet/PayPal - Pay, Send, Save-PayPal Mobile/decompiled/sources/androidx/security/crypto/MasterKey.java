package androidx.security.crypto;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class MasterKey {

    @java.lang.Deprecated
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    private final android.security.keystore.KeyGenParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;

    @java.lang.Deprecated
    public enum KeyScheme {
        AES256_GCM
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return 300;
    }

    MasterKey(java.lang.String str, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = (android.security.keystore.KeyGenParameterSpec) obj;
    }

    public final boolean isKeyStoreBacked() {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.getHighSpeedVideoFpsRanges);
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            return false;
        }
    }

    public final boolean isUserAuthenticationRequired() {
        android.security.keystore.KeyGenParameterSpec keyGenParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        return keyGenParameterSpec != null && androidx.security.crypto.MasterKey.Api23Impl.getHighSpeedVideoFpsRanges(keyGenParameterSpec);
    }

    public final int getUserAuthenticationValidityDurationSeconds() {
        android.security.keystore.KeyGenParameterSpec keyGenParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI;
        if (keyGenParameterSpec == null) {
            return 0;
        }
        return androidx.security.crypto.MasterKey.Api23Impl.getHighSpeedVideoSizes(keyGenParameterSpec);
    }

    public final boolean isStrongBoxBacked() {
        android.security.keystore.KeyGenParameterSpec keyGenParameterSpec;
        if (android.os.Build.VERSION.SDK_INT < 28 || (keyGenParameterSpec = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            return false;
        }
        return androidx.security.crypto.MasterKey.Api28Impl.Camera2StreamConfigurationMap(keyGenParameterSpec);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MasterKey{keyAlias=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", isKeyStoreBacked=");
        sb.append(isKeyStoreBacked());
        sb.append("}");
        return sb.toString();
    }

    @java.lang.Deprecated
    public static final class Builder {
        final java.lang.String Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final android.content.Context getHighSpeedVideoFpsRanges;
        android.security.keystore.KeyGenParameterSpec getHighSpeedVideoFpsRangesFor;
        androidx.security.crypto.MasterKey.KeyScheme getHighSpeedVideoSizes;
        boolean getInputFormats;
        int getOutputFormats;

        public Builder(android.content.Context context) {
            this(context, androidx.security.crypto.MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        public Builder(android.content.Context context, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
            this.Camera2StreamConfigurationMap = str;
        }

        public final androidx.security.crypto.MasterKey.Builder setKeyScheme(androidx.security.crypto.MasterKey.KeyScheme keyScheme) {
            if (keyScheme.ordinal() == 0) {
                if (this.getHighSpeedVideoFpsRangesFor != null) {
                    throw new java.lang.IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.getHighSpeedVideoSizes = keyScheme;
                return this;
            }
            throw new java.lang.IllegalArgumentException("Unsupported scheme: ".concat(java.lang.String.valueOf(keyScheme)));
        }

        public final androidx.security.crypto.MasterKey.Builder setUserAuthenticationRequired(boolean z) {
            return setUserAuthenticationRequired(z, androidx.security.crypto.MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public final androidx.security.crypto.MasterKey.Builder setUserAuthenticationRequired(boolean z, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getOutputFormats = i;
            return this;
        }

        public final androidx.security.crypto.MasterKey.Builder setRequestStrongBoxBacked(boolean z) {
            this.getInputFormats = z;
            return this;
        }

        public final androidx.security.crypto.MasterKey.Builder setKeyGenParameterSpec(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) {
            if (this.getHighSpeedVideoSizes != null) {
                throw new java.lang.IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (!this.Camera2StreamConfigurationMap.equals(androidx.security.crypto.MasterKey.Builder.Api23Impl.getHighSpeedVideoSizes(keyGenParameterSpec))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyGenParamSpec's key alias does not match provided alias (");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(" vs ");
                sb.append(androidx.security.crypto.MasterKey.Builder.Api23Impl.getHighSpeedVideoSizes(keyGenParameterSpec));
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoFpsRangesFor = keyGenParameterSpec;
            return this;
        }

        public final androidx.security.crypto.MasterKey build() throws java.security.GeneralSecurityException, java.io.IOException {
            return androidx.security.crypto.MasterKey.Builder.Api23Impl.getHighSpeedVideoFpsRangesFor(this);
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static java.lang.String getHighSpeedVideoSizes(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }

            static androidx.security.crypto.MasterKey getHighSpeedVideoFpsRangesFor(androidx.security.crypto.MasterKey.Builder builder) throws java.security.GeneralSecurityException, java.io.IOException {
                if (builder.getHighSpeedVideoSizes == null && builder.getHighSpeedVideoFpsRangesFor == null) {
                    throw new java.lang.IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (builder.getHighSpeedVideoSizes == androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM) {
                    android.security.keystore.KeyGenParameterSpec.Builder keySize = new android.security.keystore.KeyGenParameterSpec.Builder(builder.Camera2StreamConfigurationMap, 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (builder.getHighResolutionOutputSizeshNQ4ISI) {
                        keySize.setUserAuthenticationRequired(true);
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            androidx.security.crypto.MasterKey.Builder.Api23Impl.Api30Impl.Camera2StreamConfigurationMap(keySize, builder.getOutputFormats, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(builder.getOutputFormats);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 28 && builder.getInputFormats && builder.getHighSpeedVideoFpsRanges.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        androidx.security.crypto.MasterKey.Builder.Api23Impl.Api28Impl.getHighSpeedVideoFpsRangesFor(keySize);
                    }
                    builder.getHighSpeedVideoFpsRangesFor = keySize.build();
                }
                if (builder.getHighSpeedVideoFpsRangesFor == null) {
                    throw new java.lang.NullPointerException("KeyGenParameterSpec was null after build() check");
                }
                return new androidx.security.crypto.MasterKey(androidx.security.crypto.MasterKeys.getOrCreate(builder.getHighSpeedVideoFpsRangesFor), builder.getHighSpeedVideoFpsRangesFor);
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static void getHighSpeedVideoFpsRangesFor(android.security.keystore.KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            static class Api30Impl {
                private Api30Impl() {
                }

                static void Camera2StreamConfigurationMap(android.security.keystore.KeyGenParameterSpec.Builder builder, int i, int i2) {
                    builder.setUserAuthenticationParameters(i, i2);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isUserAuthenticationRequired();
        }

        static int getHighSpeedVideoSizes(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }
    }

    /* loaded from: classes7.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isStrongBoxBacked();
        }
    }
}
