package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult;", "", "", "authenticationType", "<init>", "(I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getAuthenticationType", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticationResult {
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";
    public static final java.lang.String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private final int authenticationType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.AuthenticationResult.Companion INSTANCE = new androidx.view.provider.AuthenticationResult.Companion(null);
    private static final java.util.LinkedHashMap<java.lang.Integer, java.lang.Integer> biometricFrameworkToJetpackResultMap = kotlin.collections.MapsKt.linkedMapOf(kotlin.TuplesKt.to(2, 2), kotlin.TuplesKt.to(1, 1));

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult$Companion;", "", "<init>", "()V", "", "frameworkCode", "convertFrameworkBiometricResultToJetpack$credentials_release", "(I)I", "uiAuthenticationType", "", "isFrameworkBiometricPrompt", "Landroidx/credentials/provider/AuthenticationResult;", "createFrom$credentials_release", "(IZ)Landroidx/credentials/provider/AuthenticationResult;", "", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE", "Ljava/lang/String;", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "biometricFrameworkToJetpackResultMap", "Ljava/util/LinkedHashMap;", "getBiometricFrameworkToJetpackResultMap$credentials_release", "()Ljava/util/LinkedHashMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.LinkedHashMap<java.lang.Integer, java.lang.Integer> getBiometricFrameworkToJetpackResultMap$credentials_release() {
            return androidx.view.provider.AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials_release(int frameworkCode) {
            if (getBiometricFrameworkToJetpackResultMap$credentials_release().containsKey(java.lang.Integer.valueOf(frameworkCode))) {
                java.lang.Integer num = getBiometricFrameworkToJetpackResultMap$credentials_release().get(java.lang.Integer.valueOf(frameworkCode));
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                return num.intValue();
            }
            androidx.view.provider.AuthenticationError.INSTANCE.getTAG$credentials_release();
            return frameworkCode;
        }

        public static /* synthetic */ androidx.view.provider.AuthenticationResult createFrom$credentials_release$default(androidx.view.provider.AuthenticationResult.Companion companion, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return companion.createFrom$credentials_release(i, z);
        }

        public final androidx.view.provider.AuthenticationResult createFrom$credentials_release(int uiAuthenticationType, boolean isFrameworkBiometricPrompt) {
            if (isFrameworkBiometricPrompt) {
                uiAuthenticationType = convertFrameworkBiometricResultToJetpack$credentials_release(uiAuthenticationType);
            }
            return new androidx.view.provider.AuthenticationResult(uiAuthenticationType);
        }

        public final androidx.view.provider.AuthenticationResult createFrom$credentials_release(int i) {
            return createFrom$credentials_release$default(this, i, false, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthenticationResult(int i) {
        this.authenticationType = i;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.view.provider.AuthenticationResult) && this.authenticationType == ((androidx.view.provider.AuthenticationResult) other).authenticationType;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.authenticationType));
    }
}
