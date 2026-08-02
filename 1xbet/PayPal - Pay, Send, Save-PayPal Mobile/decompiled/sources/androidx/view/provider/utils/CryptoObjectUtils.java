package androidx.view.provider.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils;", "", "<init>", "()V", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "cryptoObject", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "wrapForBiometricPrompt", "(Landroidx/biometric/BiometricPrompt$CryptoObject;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "", "getOperationHandle", "(Landroidx/biometric/BiometricPrompt$CryptoObject;)J", "Api35Impl", "Api30Impl", "Api28Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CryptoObjectUtils {
    public static final androidx.view.provider.utils.CryptoObjectUtils INSTANCE = new androidx.view.provider.utils.CryptoObjectUtils();

    private CryptoObjectUtils() {
    }

    public final android.hardware.biometrics.BiometricPrompt.CryptoObject wrapForBiometricPrompt(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        android.security.identity.IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        javax.crypto.Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return androidx.credentials.provider.utils.CryptoObjectUtils.Api28Impl.INSTANCE.dA_(cipher);
        }
        java.security.Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return androidx.credentials.provider.utils.CryptoObjectUtils.Api28Impl.INSTANCE.dz_(signature);
        }
        javax.crypto.Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return androidx.credentials.provider.utils.CryptoObjectUtils.Api28Impl.INSTANCE.dB_(mac);
        }
        if (android.os.Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return androidx.credentials.provider.utils.CryptoObjectUtils.Api30Impl.INSTANCE.dC_(identityCredential);
    }

    public final long getOperationHandle(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        android.hardware.biometrics.BiometricPrompt.CryptoObject wrapForBiometricPrompt = wrapForBiometricPrompt(cryptoObject);
        if (wrapForBiometricPrompt != null) {
            return androidx.credentials.provider.utils.CryptoObjectUtils.Api35Impl.INSTANCE.dD_(wrapForBiometricPrompt);
        }
        return 0L;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api35Impl;", "", "<init>", "()V", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "p0", "", "dD_", "(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api35Impl {
        public static final androidx.credentials.provider.utils.CryptoObjectUtils.Api35Impl INSTANCE = new androidx.credentials.provider.utils.CryptoObjectUtils.Api35Impl();

        private Api35Impl() {
        }

        public final long dD_(android.hardware.biometrics.BiometricPrompt.CryptoObject p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return p0.getOperationHandle();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api30Impl;", "", "<init>", "()V", "Landroid/security/identity/IdentityCredential;", "p0", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "dC_", "(Landroid/security/identity/IdentityCredential;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api30Impl {
        public static final androidx.credentials.provider.utils.CryptoObjectUtils.Api30Impl INSTANCE = new androidx.credentials.provider.utils.CryptoObjectUtils.Api30Impl();

        private Api30Impl() {
        }

        public final android.hardware.biometrics.BiometricPrompt.CryptoObject dC_(android.security.identity.IdentityCredential p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(p0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api28Impl;", "", "<init>", "()V", "Ljavax/crypto/Cipher;", "p0", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "dA_", "(Ljavax/crypto/Cipher;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "Ljava/security/Signature;", "dz_", "(Ljava/security/Signature;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "Ljavax/crypto/Mac;", "dB_", "(Ljavax/crypto/Mac;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api28Impl {
        public static final androidx.credentials.provider.utils.CryptoObjectUtils.Api28Impl INSTANCE = new androidx.credentials.provider.utils.CryptoObjectUtils.Api28Impl();

        private Api28Impl() {
        }

        public final android.hardware.biometrics.BiometricPrompt.CryptoObject dA_(javax.crypto.Cipher p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(p0);
        }

        public final android.hardware.biometrics.BiometricPrompt.CryptoObject dz_(java.security.Signature p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(p0);
        }

        public final android.hardware.biometrics.BiometricPrompt.CryptoObject dB_(javax.crypto.Mac p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(p0);
        }
    }
}
