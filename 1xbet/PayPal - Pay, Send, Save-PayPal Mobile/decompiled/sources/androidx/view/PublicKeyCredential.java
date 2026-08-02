package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/PublicKeyCredential;", "Landroidx/credentials/Credential;", "", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "authenticationResponseJson", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAuthenticationResponseJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PublicKeyCredential extends androidx.view.Credential {
    public static final java.lang.String BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON";
    public static final java.lang.String BUNDLE_KEY_SUBTYPE = "androidx.credentials.BUNDLE_KEY_SUBTYPE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.PublicKeyCredential.Companion INSTANCE = new androidx.view.PublicKeyCredential.Companion(null);
    public static final java.lang.String TYPE_PUBLIC_KEY_CREDENTIAL = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL";
    private final java.lang.String authenticationResponseJson;

    public final java.lang.String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    private PublicKeyCredential(java.lang.String str, android.os.Bundle bundle) {
        super(TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredential(java.lang.String str) {
        this(str, INSTANCE.toBundle$credentials_release(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/credentials/PublicKeyCredential$Companion;", "", "<init>", "()V", "", "authenticationResponseJson", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/PublicKeyCredential;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/PublicKeyCredential;", "TYPE_PUBLIC_KEY_CREDENTIAL", "Ljava/lang/String;", "BUNDLE_KEY_SUBTYPE", "BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String authenticationResponseJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResponseJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON, authenticationResponseJson);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.PublicKeyCredential createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString(androidx.view.PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.PublicKeyCredential(string, data, null);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PublicKeyCredential(java.lang.String str, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
