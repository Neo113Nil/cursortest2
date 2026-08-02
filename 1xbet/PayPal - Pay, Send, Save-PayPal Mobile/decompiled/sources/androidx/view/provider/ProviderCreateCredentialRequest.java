package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "", "Landroidx/credentials/CreateCredentialRequest;", "callingRequest", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BiometricPromptResult;", "biometricPromptResult", "<init>", "(Landroidx/credentials/CreateCredentialRequest;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;)V", "Landroidx/credentials/CreateCredentialRequest;", "getCallingRequest", "()Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/provider/CallingAppInfo;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Landroidx/credentials/provider/BiometricPromptResult;", "getBiometricPromptResult", "()Landroidx/credentials/provider/BiometricPromptResult;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProviderCreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.ProviderCreateCredentialRequest.Companion INSTANCE = new androidx.view.provider.ProviderCreateCredentialRequest.Companion(null);
    private final androidx.view.provider.BiometricPromptResult biometricPromptResult;
    private final androidx.view.provider.CallingAppInfo callingAppInfo;
    private final androidx.view.CreateCredentialRequest callingRequest;

    public ProviderCreateCredentialRequest(androidx.view.CreateCredentialRequest createCredentialRequest, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
        this.callingRequest = createCredentialRequest;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
    }

    public /* synthetic */ ProviderCreateCredentialRequest(androidx.view.CreateCredentialRequest createCredentialRequest, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(createCredentialRequest, callingAppInfo, (i & 4) != 0 ? null : biometricPromptResult);
    }

    public final androidx.view.CreateCredentialRequest getCallingRequest() {
        return this.callingRequest;
    }

    public final androidx.view.provider.CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final androidx.view.provider.BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/ProviderCreateCredentialRequest$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "request", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/provider/ProviderCreateCredentialRequest;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/ProviderCreateCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.ProviderCreateCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_TYPE", request.getCallingRequest().getType());
            bundle.putBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CREDENTIAL_DATA", request.getCallingRequest().getCredentialData());
            bundle.putBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CANDIDATE_QUERY_DATA", request.getCallingRequest().getCandidateQueryData());
            androidx.view.provider.CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderCreateCredentialRequest fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_TYPE");
            if (string == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing request type.");
            }
            android.os.Bundle bundle2 = bundle.getBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CREDENTIAL_DATA");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            android.os.Bundle bundle3 = bundle2;
            android.os.Bundle bundle4 = bundle.getBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CANDIDATE_QUERY_DATA");
            if (bundle4 == null) {
                bundle4 = new android.os.Bundle();
            }
            android.os.Bundle bundle5 = bundle4;
            java.lang.String string2 = bundle.getString(androidx.view.provider.CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            androidx.view.provider.CallingAppInfo extractCallingAppInfo = androidx.view.provider.CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            if (extractCallingAppInfo == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            try {
                return new androidx.view.provider.ProviderCreateCredentialRequest(androidx.view.CreateCredentialRequest.INSTANCE.createFrom(string, bundle3, bundle5, false, string2), extractCallingAppInfo, null, 4, null);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException("Conversion failed with ".concat(java.lang.String.valueOf(e)));
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.ProviderCreateCredentialRequest fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.ProviderCreateCredentialRequest providerCreateCredentialRequest) {
        return INSTANCE.asBundle(providerCreateCredentialRequest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderCreateCredentialRequest(androidx.view.CreateCredentialRequest createCredentialRequest, androidx.view.provider.CallingAppInfo callingAppInfo) {
        this(createCredentialRequest, callingAppInfo, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
    }
}
