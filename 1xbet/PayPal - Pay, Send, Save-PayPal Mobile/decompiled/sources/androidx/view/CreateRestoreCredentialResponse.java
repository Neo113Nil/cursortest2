package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "responseJson", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getResponseJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateRestoreCredentialResponse extends androidx.view.CreateCredentialResponse {
    public static final java.lang.String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateRestoreCredentialResponse.Companion INSTANCE = new androidx.view.CreateRestoreCredentialResponse.Companion(null);
    private final java.lang.String responseJson;

    public final java.lang.String getResponseJson() {
        return this.responseJson;
    }

    private CreateRestoreCredentialResponse(java.lang.String str, android.os.Bundle bundle) {
        super(androidx.view.RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialResponse(java.lang.String str) {
        this(str, INSTANCE.toBundle$credentials_release(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/CreateRestoreCredentialResponse;", "createFrom", "(Landroid/os/Bundle;)Landroidx/credentials/CreateRestoreCredentialResponse;", "", "responseJson", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", "BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateRestoreCredentialResponse createFrom(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            java.lang.String string = data.getString(androidx.view.CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string == null) {
                throw new androidx.view.exceptions.CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
            }
            return new androidx.view.CreateRestoreCredentialResponse(string, data, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String responseJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, responseJson);
            return bundle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateRestoreCredentialResponse createFrom(android.os.Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    public /* synthetic */ CreateRestoreCredentialResponse(java.lang.String str, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
