package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/RestoreCredential;", "Landroidx/credentials/Credential;", "", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "authenticationResponseJson", "Ljava/lang/String;", "getAuthenticationResponseJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RestoreCredential extends androidx.view.Credential {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.RestoreCredential.Companion INSTANCE = new androidx.view.RestoreCredential.Companion(null);
    public static final java.lang.String TYPE_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_RESTORE_CREDENTIAL";
    private final java.lang.String authenticationResponseJson;

    public final java.lang.String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    private RestoreCredential(java.lang.String str, android.os.Bundle bundle) {
        super(TYPE_RESTORE_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/RestoreCredential$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/RestoreCredential;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/RestoreCredential;", "", "TYPE_RESTORE_CREDENTIAL", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.RestoreCredential createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
            if (string == null) {
                throw new androidx.view.exceptions.NoCredentialException("The device does not contain a restore credential.");
            }
            return new androidx.view.RestoreCredential(string, data, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RestoreCredential(java.lang.String str, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
