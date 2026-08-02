package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/AuthenticationError;", "", "", "errorCode", "", "errorMsg", "<init>", "(ILjava/lang/CharSequence;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/CharSequence;", "getErrorMsg", "()Ljava/lang/CharSequence;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticationError {
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_ERROR = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE";
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK = "BIOMETRIC_AUTH_ERROR_CODE";
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE";
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK = "BIOMETRIC_AUTH_ERROR_MESSAGE";
    private final int errorCode;
    private final java.lang.CharSequence errorMsg;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.AuthenticationError.Companion INSTANCE = new androidx.view.provider.AuthenticationError.Companion(null);
    private static final java.lang.String TAG = "AuthenticationError";
    private static final java.util.LinkedHashMap<java.lang.Integer, java.lang.Integer> biometricFrameworkToJetpackErrorMap = kotlin.collections.MapsKt.linkedMapOf(kotlin.TuplesKt.to(5, 5), kotlin.TuplesKt.to(12, 12), kotlin.TuplesKt.to(1, 1), kotlin.TuplesKt.to(7, 7), kotlin.TuplesKt.to(9, 9), kotlin.TuplesKt.to(11, 11), kotlin.TuplesKt.to(14, 14), kotlin.TuplesKt.to(4, 4), kotlin.TuplesKt.to(15, 15), kotlin.TuplesKt.to(3, 3), kotlin.TuplesKt.to(2, 2), kotlin.TuplesKt.to(10, 10), kotlin.TuplesKt.to(8, 8));

    public AuthenticationError(int i, java.lang.CharSequence charSequence) {
        this.errorCode = i;
        this.errorMsg = charSequence;
    }

    public /* synthetic */ AuthenticationError(int i, java.lang.CharSequence charSequence, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : charSequence);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0080D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R6\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/credentials/provider/AuthenticationError$Companion;", "", "<init>", "()V", "", "frameworkCode", "convertFrameworkBiometricErrorToJetpack$credentials_release", "(I)I", "uiErrorCode", "", "uiErrorMessage", "", "isFrameworkBiometricPrompt", "Landroidx/credentials/provider/AuthenticationError;", "createFrom$credentials_release", "(ILjava/lang/CharSequence;Z)Landroidx/credentials/provider/AuthenticationError;", "", "TAG", "Ljava/lang/String;", "getTAG$credentials_release", "()Ljava/lang/String;", "EXTRA_BIOMETRIC_AUTH_ERROR", "EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "biometricFrameworkToJetpackErrorMap", "Ljava/util/LinkedHashMap;", "getBiometricFrameworkToJetpackErrorMap$credentials_release", "()Ljava/util/LinkedHashMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getTAG$credentials_release() {
            return androidx.view.provider.AuthenticationError.TAG;
        }

        public final java.util.LinkedHashMap<java.lang.Integer, java.lang.Integer> getBiometricFrameworkToJetpackErrorMap$credentials_release() {
            return androidx.view.provider.AuthenticationError.biometricFrameworkToJetpackErrorMap;
        }

        public final int convertFrameworkBiometricErrorToJetpack$credentials_release(int frameworkCode) {
            if (getBiometricFrameworkToJetpackErrorMap$credentials_release().containsKey(java.lang.Integer.valueOf(frameworkCode))) {
                java.lang.Integer num = getBiometricFrameworkToJetpackErrorMap$credentials_release().get(java.lang.Integer.valueOf(frameworkCode));
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                return num.intValue();
            }
            getTAG$credentials_release();
            return frameworkCode;
        }

        public static /* synthetic */ androidx.view.provider.AuthenticationError createFrom$credentials_release$default(androidx.view.provider.AuthenticationError.Companion companion, int i, java.lang.CharSequence charSequence, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return companion.createFrom$credentials_release(i, charSequence, z);
        }

        public final androidx.view.provider.AuthenticationError createFrom$credentials_release(int uiErrorCode, java.lang.CharSequence uiErrorMessage, boolean isFrameworkBiometricPrompt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiErrorMessage, "");
            if (isFrameworkBiometricPrompt) {
                uiErrorCode = convertFrameworkBiometricErrorToJetpack$credentials_release(uiErrorCode);
            }
            return new androidx.view.provider.AuthenticationError(uiErrorCode, uiErrorMessage);
        }

        public final androidx.view.provider.AuthenticationError createFrom$credentials_release(int i, java.lang.CharSequence charSequence) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            return createFrom$credentials_release$default(this, i, charSequence, false, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.CharSequence getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.AuthenticationError)) {
            return false;
        }
        androidx.view.provider.AuthenticationError authenticationError = (androidx.view.provider.AuthenticationError) other;
        return this.errorCode == authenticationError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMsg, authenticationError.errorMsg);
    }

    public final int hashCode() {
        int i = this.errorCode;
        return java.util.Objects.hash(java.lang.Integer.valueOf(i), this.errorMsg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationError(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }
}
