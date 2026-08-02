package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameworkImplHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.internal.FrameworkImplHelper.Companion INSTANCE = new androidx.view.internal.FrameworkImplHelper.Companion(null);

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper$Companion;", "", "<init>", "()V", "Landroid/credentials/GetCredentialResponse;", "response", "Landroidx/credentials/GetCredentialResponse;", "convertGetResponseToJetpackClass", "(Landroid/credentials/GetCredentialResponse;)Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/credentials/GetCredentialRequest;", "convertGetRequestToFrameworkClass", "(Landroidx/credentials/GetCredentialRequest;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "builder", "", "setOriginForGetRequest", "(Landroidx/credentials/GetCredentialRequest;Landroid/credentials/GetCredentialRequest$Builder;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.credentials.Credential credential = response.getCredential();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credential, "");
            androidx.view.Credential.Companion companion = androidx.view.Credential.INSTANCE;
            java.lang.String type = credential.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            android.os.Bundle data = credential.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
            return new androidx.view.GetCredentialResponse(companion.createFrom(type, data));
        }

        @kotlin.jvm.JvmStatic
        public final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(androidx.view.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.credentials.GetCredentialRequest.Builder builder = new android.credentials.GetCredentialRequest.Builder(androidx.view.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request));
            for (androidx.view.CredentialOption credentialOption : request.getCredentialOptions()) {
                builder.addCredentialOption(new android.credentials.CredentialOption.Builder(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
            }
            setOriginForGetRequest(request, builder);
            android.credentials.GetCredentialRequest build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.jvm.JvmStatic
        public final void setOriginForGetRequest(androidx.view.GetCredentialRequest request, android.credentials.GetCredentialRequest.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            if (request.getOrigin() != null) {
                builder.setOrigin(request.getOrigin());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setOriginForGetRequest(androidx.view.GetCredentialRequest getCredentialRequest, android.credentials.GetCredentialRequest.Builder builder) {
        INSTANCE.setOriginForGetRequest(getCredentialRequest, builder);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
        return INSTANCE.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    @kotlin.jvm.JvmStatic
    public static final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(androidx.view.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.convertGetRequestToFrameworkClass(getCredentialRequest);
    }
}
