package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00142\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B)\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData;", "", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "cryptoObject", "", "allowedAuthenticators", "", "isCreatedFromBundle", "<init>", "(Landroidx/biometric/BiometricPrompt$CryptoObject;IZ)V", "(Landroidx/biometric/BiometricPrompt$CryptoObject;I)V", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", com.visa.cbp.getEncExpo.warmup, "getAllowedAuthenticators", "()I", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "Companion", "Builder", "ApiMinImpl", "Api35Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BiometricPromptData {
    public static final java.lang.String BUNDLE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS";
    public static final java.lang.String BUNDLE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.BUNDLE_HINT_CRYPTO_OP_ID";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BiometricPromptData.Companion INSTANCE = new androidx.view.provider.BiometricPromptData.Companion(null);
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{15, 255, 32768, 32783, 33023});
    private final int allowedAuthenticators;
    private final androidx.biometric.BiometricPrompt.CryptoObject cryptoObject;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public BiometricPromptData(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, int i, boolean z) {
        this.cryptoObject = cryptoObject;
        this.allowedAuthenticators = i;
        this.Camera2StreamConfigurationMap = z;
        if (!z && !getHighSpeedVideoFpsRanges.contains(java.lang.Integer.valueOf(i))) {
            throw new java.lang.IllegalArgumentException("The allowed authenticator must be specified according to the BiometricPrompt spec.".toString());
        }
        if (cryptoObject != null && !androidx.view.provider.BiometricPromptData.Companion.access$isStrongAuthenticationType(INSTANCE, java.lang.Integer.valueOf(i))) {
            throw new java.lang.IllegalArgumentException("If the cryptoObject is non-null, the allowedAuthenticator value must be Authenticators.BIOMETRIC_STRONG.".toString());
        }
    }

    public /* synthetic */ BiometricPromptData(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cryptoObject, (i2 & 2) != 0 ? 255 : i, (i2 & 4) != 0 ? false : z);
    }

    public final androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    public final int getAllowedAuthenticators() {
        return this.allowedAuthenticators;
    }

    public /* synthetic */ BiometricPromptData(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cryptoObject, (i2 & 2) != 0 ? 255 : i);
    }

    public BiometricPromptData(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, int i) {
        this(cryptoObject, i, false);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BiometricPromptData;", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BiometricPromptData;", "biometricPromptData", "toBundle", "(Landroidx/credentials/provider/BiometricPromptData;)Landroid/os/Bundle;", "", "BUNDLE_HINT_ALLOWED_AUTHENTICATORS", "Ljava/lang/String;", "BUNDLE_HINT_CRYPTO_OP_ID", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BiometricPromptData fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            try {
                if (!bundle.containsKey(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS)) {
                    throw new java.lang.IllegalArgumentException("Bundle lacks allowed authenticator key.");
                }
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    return androidx.credentials.provider.BiometricPromptData.Api35Impl.getHighSpeedVideoFpsRangesFor(bundle);
                }
                return androidx.credentials.provider.BiometricPromptData.ApiMinImpl.getHighSpeedVideoFpsRanges(bundle);
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle(androidx.view.provider.BiometricPromptData biometricPromptData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricPromptData, "");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return androidx.credentials.provider.BiometricPromptData.Api35Impl.Camera2StreamConfigurationMap(biometricPromptData);
            }
            return androidx.credentials.provider.BiometricPromptData.ApiMinImpl.getHighSpeedVideoFpsRanges(biometricPromptData);
        }

        public static final /* synthetic */ boolean access$isStrongAuthenticationType(androidx.view.provider.BiometricPromptData.Companion companion, java.lang.Integer num) {
            return num != null && (num.intValue() & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 0;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Builder;", "", "<init>", "()V", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "cryptoObject", "setCryptoObject", "(Landroidx/biometric/BiometricPrompt$CryptoObject;)Landroidx/credentials/provider/BiometricPromptData$Builder;", "", "allowedAuthenticators", "setAllowedAuthenticators", "(I)Landroidx/credentials/provider/BiometricPromptData$Builder;", "Landroidx/credentials/provider/BiometricPromptData;", "build", "()Landroidx/credentials/provider/BiometricPromptData;", "Camera2StreamConfigurationMap", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/Integer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.biometric.BiometricPrompt.CryptoObject getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.Integer Camera2StreamConfigurationMap;

        public final androidx.credentials.provider.BiometricPromptData.Builder setCryptoObject(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
            this.getHighSpeedVideoFpsRanges = cryptoObject;
            return this;
        }

        public final androidx.credentials.provider.BiometricPromptData.Builder setAllowedAuthenticators(int allowedAuthenticators) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(allowedAuthenticators);
            return this;
        }

        public final androidx.view.provider.BiometricPromptData build() {
            java.lang.Integer num = this.Camera2StreamConfigurationMap;
            return new androidx.view.provider.BiometricPromptData(this.getHighSpeedVideoFpsRanges, num != null ? num.intValue() : 255);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\t"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$ApiMinImpl;", "", "<init>", "()V", "Landroidx/credentials/provider/BiometricPromptData;", "p0", "Landroid/os/Bundle;", "getHighSpeedVideoFpsRanges", "(Landroidx/credentials/provider/BiometricPromptData;)Landroid/os/Bundle;", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BiometricPromptData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class ApiMinImpl {
        public static final androidx.credentials.provider.BiometricPromptData.ApiMinImpl INSTANCE = new androidx.credentials.provider.BiometricPromptData.ApiMinImpl();

        private ApiMinImpl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.os.Bundle getHighSpeedVideoFpsRanges(androidx.view.provider.BiometricPromptData p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, p0.getAllowedAuthenticators());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BiometricPromptData getHighSpeedVideoFpsRanges(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new androidx.view.provider.BiometricPromptData(null, p0.getInt(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Api35Impl;", "", "<init>", "()V", "Landroidx/credentials/provider/BiometricPromptData;", "p0", "Landroid/os/Bundle;", "Camera2StreamConfigurationMap", "(Landroidx/credentials/provider/BiometricPromptData;)Landroid/os/Bundle;", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BiometricPromptData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Api35Impl {
        public static final androidx.credentials.provider.BiometricPromptData.Api35Impl INSTANCE = new androidx.credentials.provider.BiometricPromptData.Api35Impl();

        private Api35Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.os.Bundle Camera2StreamConfigurationMap(androidx.view.provider.BiometricPromptData p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, p0.getAllowedAuthenticators());
            if (p0.getCryptoObject() != null) {
                bundle.putLong(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_CRYPTO_OP_ID, androidx.view.provider.utils.CryptoObjectUtils.INSTANCE.getOperationHandle(p0.getCryptoObject()));
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BiometricPromptData getHighSpeedVideoFpsRangesFor(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return new androidx.view.provider.BiometricPromptData(null, p0.getInt(androidx.view.provider.BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle toBundle(androidx.view.provider.BiometricPromptData biometricPromptData) {
        return INSTANCE.toBundle(biometricPromptData);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BiometricPromptData fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    public BiometricPromptData(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        this(cryptoObject, 0, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
