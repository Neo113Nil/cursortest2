package androidx.core.hardware.fingerprint;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public class FingerprintManagerCompat {

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

    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject, int i, android.os.CancellationSignal cancellationSignal, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
    }

    @java.lang.Deprecated
    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject, int i, androidx.core.os.CancellationSignal cancellationSignal, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
    }

    public boolean hasEnrolledFingerprints() {
        return false;
    }

    public boolean isHardwareDetected() {
        return false;
    }

    public static androidx.core.hardware.fingerprint.FingerprintManagerCompat from(android.content.Context context) {
        return new androidx.core.hardware.fingerprint.FingerprintManagerCompat();
    }

    private FingerprintManagerCompat() {
    }

    public static class CryptoObject {
        private final javax.crypto.Mac Camera2StreamConfigurationMap;
        private final javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI;
        private final java.security.Signature getHighSpeedVideoFpsRanges;

        public CryptoObject(java.security.Signature signature) {
            this.getHighSpeedVideoFpsRanges = signature;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = null;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.getHighResolutionOutputSizeshNQ4ISI = cipher;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.Camera2StreamConfigurationMap = mac;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = null;
        }

        public java.security.Signature getSignature() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public javax.crypto.Cipher getCipher() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public javax.crypto.Mac getMac() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes7.dex */
    public static final class AuthenticationResult {
        private final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getHighSpeedVideoSizes;

        public AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject) {
            this.getHighSpeedVideoSizes = cryptoObject;
        }

        public final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getCryptoObject() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
