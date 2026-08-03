package androidx.core.hardware.fingerprint;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class FingerprintManagerCompat {
    private final android.content.Context mContext;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult authenticationResult) {
        }
    }

    public static androidx.core.hardware.fingerprint.FingerprintManagerCompat from(android.content.Context context) {
        return new androidx.core.hardware.fingerprint.FingerprintManagerCompat(context);
    }

    private FingerprintManagerCompat(android.content.Context context) {
        this.mContext = context;
    }

    public boolean hasEnrolledFingerprints() {
        android.hardware.fingerprint.FingerprintManager fingerprintManagerOrNull;
        return android.os.Build.VERSION.SDK_INT >= 23 && (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) != null && androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.hasEnrolledFingerprints(fingerprintManagerOrNull);
    }

    public boolean isHardwareDetected() {
        android.hardware.fingerprint.FingerprintManager fingerprintManagerOrNull;
        return android.os.Build.VERSION.SDK_INT >= 23 && (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) != null && androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.isHardwareDetected(fingerprintManagerOrNull);
    }

    @java.lang.Deprecated
    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject, int i, androidx.core.os.CancellationSignal cancellationSignal, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        authenticate(cryptoObject, i, cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, authenticationCallback, handler);
    }

    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject, int i, android.os.CancellationSignal cancellationSignal, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        android.hardware.fingerprint.FingerprintManager fingerprintManagerOrNull;
        if (android.os.Build.VERSION.SDK_INT < 23 || (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) == null) {
            return;
        }
        androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.authenticate(fingerprintManagerOrNull, wrapCryptoObject(cryptoObject), cancellationSignal, i, wrapCallback(authenticationCallback), handler);
    }

    private static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context context) {
        return androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.getFingerprintManagerOrNull(context);
    }

    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject) {
        return androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.wrapCryptoObject(cryptoObject);
    }

    static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoObject) {
        return androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.unwrapCryptoObject(cryptoObject);
    }

    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(final androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback authenticationCallback) {
        return new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback() { // from class: androidx.core.hardware.fingerprint.FingerprintManagerCompat.1
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
                androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback.this.onAuthenticationError(i, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i, java.lang.CharSequence charSequence) {
                androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback.this.onAuthenticationHelp(i, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationResult) {
                androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback.this.onAuthenticationSucceeded(new androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.unwrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.getCryptoObject(authenticationResult))));
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback.this.onAuthenticationFailed();
            }
        };
    }

    public static class CryptoObject {
        private final javax.crypto.Cipher mCipher;
        private final javax.crypto.Mac mMac;
        private final java.security.Signature mSignature;

        public CryptoObject(java.security.Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        public java.security.Signature getSignature() {
            return this.mSignature;
        }

        public javax.crypto.Cipher getCipher() {
            return this.mCipher;
        }

        public javax.crypto.Mac getMac() {
            return this.mMac;
        }
    }

    public static final class AuthenticationResult {
        private final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject mCryptoObject;

        public AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasEnrolledFingerprints(java.lang.Object obj) {
            return ((android.hardware.fingerprint.FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean isHardwareDetected(java.lang.Object obj) {
            return ((android.hardware.fingerprint.FingerprintManager) obj).isHardwareDetected();
        }

        static void authenticate(java.lang.Object obj, java.lang.Object obj2, android.os.CancellationSignal cancellationSignal, int i, java.lang.Object obj3, android.os.Handler handler) {
            ((android.hardware.fingerprint.FingerprintManager) obj).authenticate((android.hardware.fingerprint.FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject(java.lang.Object obj) {
            return ((android.hardware.fingerprint.FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context context) {
            if (android.os.Build.VERSION.SDK_INT == 23) {
                return (android.hardware.fingerprint.FingerprintManager) context.getSystemService(android.hardware.fingerprint.FingerprintManager.class);
            }
            if (android.os.Build.VERSION.SDK_INT <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (android.hardware.fingerprint.FingerprintManager) context.getSystemService(android.hardware.fingerprint.FingerprintManager.class);
        }

        public static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(java.lang.Object obj) {
            android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoObject = (android.hardware.fingerprint.FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }
}
