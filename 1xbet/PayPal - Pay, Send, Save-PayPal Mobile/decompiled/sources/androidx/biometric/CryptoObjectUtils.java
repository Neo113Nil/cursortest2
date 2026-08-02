package androidx.biometric;

/* loaded from: classes3.dex */
class CryptoObjectUtils {
    private CryptoObjectUtils() {
    }

    static androidx.biometric.BiometricPrompt.CryptoObject D_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
        android.security.identity.PresentationSession O_;
        android.security.identity.IdentityCredential M_;
        if (cryptoObject == null) {
            return null;
        }
        javax.crypto.Cipher I_ = androidx.biometric.CryptoObjectUtils.Api28Impl.I_(cryptoObject);
        if (I_ != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(I_);
        }
        java.security.Signature K_ = androidx.biometric.CryptoObjectUtils.Api28Impl.K_(cryptoObject);
        if (K_ != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(K_);
        }
        javax.crypto.Mac J_ = androidx.biometric.CryptoObjectUtils.Api28Impl.J_(cryptoObject);
        if (J_ != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(J_);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (M_ = androidx.biometric.CryptoObjectUtils.Api30Impl.M_(cryptoObject)) != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(M_);
        }
        if (android.os.Build.VERSION.SDK_INT < 33 || (O_ = androidx.biometric.CryptoObjectUtils.Api33Impl.O_(cryptoObject)) == null) {
            return null;
        }
        return new androidx.biometric.BiometricPrompt.CryptoObject(O_);
    }

    static android.hardware.biometrics.BiometricPrompt.CryptoObject E_(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        android.security.identity.PresentationSession presentationSession;
        android.security.identity.IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        javax.crypto.Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return androidx.biometric.CryptoObjectUtils.Api28Impl.G_(cipher);
        }
        java.security.Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return androidx.biometric.CryptoObjectUtils.Api28Impl.F_(signature);
        }
        javax.crypto.Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return androidx.biometric.CryptoObjectUtils.Api28Impl.H_(mac);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (identityCredential = cryptoObject.getIdentityCredential()) != null) {
            return androidx.biometric.CryptoObjectUtils.Api30Impl.L_(identityCredential);
        }
        if (android.os.Build.VERSION.SDK_INT < 33 || (presentationSession = cryptoObject.getPresentationSession()) == null) {
            return null;
        }
        return androidx.biometric.CryptoObjectUtils.Api33Impl.N_(presentationSession);
    }

    static androidx.biometric.BiometricPrompt.CryptoObject getHighSpeedVideoSizes(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        javax.crypto.Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(cipher);
        }
        java.security.Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(signature);
        }
        javax.crypto.Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new androidx.biometric.BiometricPrompt.CryptoObject(mac);
        }
        return null;
    }

    static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getHighSpeedVideoFpsRangesFor(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        javax.crypto.Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(cipher);
        }
        java.security.Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(signature);
        }
        javax.crypto.Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(mac);
        }
        if ((android.os.Build.VERSION.SDK_INT < 30 || cryptoObject.getIdentityCredential() == null) && android.os.Build.VERSION.SDK_INT >= 33) {
            cryptoObject.getPresentationSession();
        }
        return null;
    }

    static androidx.biometric.BiometricPrompt.CryptoObject getHighSpeedVideoFpsRangesFor() {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            android.security.keystore.KeyGenParameterSpec.Builder highSpeedVideoFpsRangesFor = androidx.biometric.CryptoObjectUtils.Api23Impl.getHighSpeedVideoFpsRangesFor("androidxBiometric", 3);
            androidx.biometric.CryptoObjectUtils.Api23Impl.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
            androidx.biometric.CryptoObjectUtils.Api23Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor);
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM, "AndroidKeyStore");
            androidx.biometric.CryptoObjectUtils.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(keyGenerator, androidx.biometric.CryptoObjectUtils.Api23Impl.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor));
            keyGenerator.generateKey();
            javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) keyStore.getKey("androidxBiometric", null);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new androidx.biometric.BiometricPrompt.CryptoObject(cipher);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableKeyException | java.security.cert.CertificateException | javax.crypto.NoSuchPaddingException unused) {
            return null;
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject N_(android.security.identity.PresentationSession presentationSession) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(presentationSession);
        }

        static android.security.identity.PresentationSession O_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject L_(android.security.identity.IdentityCredential identityCredential) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(identityCredential);
        }

        static android.security.identity.IdentityCredential M_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject G_(javax.crypto.Cipher cipher) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(cipher);
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject F_(java.security.Signature signature) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(signature);
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject H_(javax.crypto.Mac mac) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(mac);
        }

        static javax.crypto.Cipher I_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static java.security.Signature K_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        static javax.crypto.Mac J_(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.security.keystore.KeyGenParameterSpec.Builder getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
            return new android.security.keystore.KeyGenParameterSpec.Builder(str, i);
        }

        static void Camera2StreamConfigurationMap(android.security.keystore.KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void getHighSpeedVideoFpsRangesFor(android.security.keystore.KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }

        static android.security.keystore.KeyGenParameterSpec getHighSpeedVideoFpsRanges(android.security.keystore.KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(javax.crypto.KeyGenerator keyGenerator, android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) throws java.security.InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }
    }
}
