package androidx.view.playservices.controllers.identityauth.beginsignin;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginSignInControllerUtility {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.beginsignin.BeginSignInControllerUtility.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.beginsignin.BeginSignInControllerUtility.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/content/Context;", "context", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Landroidx/credentials/GetCredentialRequest;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(androidx.view.GetCredentialRequest request, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder = new com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
            long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            boolean z = false;
            boolean z2 = false;
            for (androidx.view.CredentialOption credentialOption : request.getCredentialOptions()) {
                if (credentialOption instanceof androidx.view.GetPasswordOption) {
                    builder.setPasswordRequestOptions(new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder().setSupported(true).build());
                    if (!z && !credentialOption.getIsAutoSelectAllowed()) {
                        z = false;
                    }
                    z = true;
                } else if ((credentialOption instanceof androidx.view.GetPublicKeyCredentialOption) && !z2) {
                    if (j < 231815000) {
                        builder.setPasskeysSignInRequestOptions(androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((androidx.view.GetPublicKeyCredentialOption) credentialOption));
                    } else {
                        builder.setPasskeyJsonSignInRequestOptions(androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((androidx.view.GetPublicKeyCredentialOption) credentialOption));
                    }
                    z2 = true;
                } else if (credentialOption instanceof com.google.android.libraries.identity.googleid.GetGoogleIdOption) {
                    com.google.android.libraries.identity.googleid.GetGoogleIdOption getGoogleIdOption = (com.google.android.libraries.identity.googleid.GetGoogleIdOption) credentialOption;
                    com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setFilterByAuthorizedAccounts(getGoogleIdOption.getZzc()).setNonce(getGoogleIdOption.getZzb()).setRequestVerifiedPhoneNumber(getGoogleIdOption.getZzf()).setServerClientId(getGoogleIdOption.getZza()).setSupported(true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supported, "");
                    if (getGoogleIdOption.getZzd() != null) {
                        java.lang.String zzd = getGoogleIdOption.getZzd();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzd);
                        supported.associateLinkedAccounts(zzd, getGoogleIdOption.getIdTokenDepositionScopes());
                    }
                    com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions build = supported.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                    builder.setGoogleIdTokenRequestOptions(build);
                    if (!z && !getGoogleIdOption.getZzg()) {
                        z = false;
                    }
                    z = true;
                }
            }
            if (j > 241217000) {
                builder.setPreferImmediatelyAvailableCredentials(request.getPreferImmediatelyAvailableCredentials());
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest build2 = builder.setAutoSelectEnabled(z).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
            return build2;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
