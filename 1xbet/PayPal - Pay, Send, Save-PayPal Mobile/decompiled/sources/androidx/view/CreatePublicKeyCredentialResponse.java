package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/CreatePublicKeyCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "registrationResponseJson", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRegistrationResponseJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePublicKeyCredentialResponse extends androidx.view.CreateCredentialResponse {
    public static final java.lang.String BUNDLE_KEY_REGISTRATION_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreatePublicKeyCredentialResponse.Companion INSTANCE = new androidx.view.CreatePublicKeyCredentialResponse.Companion(null);
    private final java.lang.String registrationResponseJson;

    public final java.lang.String getRegistrationResponseJson() {
        return this.registrationResponseJson;
    }

    private CreatePublicKeyCredentialResponse(java.lang.String str, android.os.Bundle bundle) {
        super(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        this.registrationResponseJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialResponse(java.lang.String str) {
        this(str, INSTANCE.toBundle$credentials_release(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/CreatePublicKeyCredentialResponse$Companion;", "", "<init>", "()V", "", "registrationResponseJson", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/CreatePublicKeyCredentialResponse;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/CreatePublicKeyCredentialResponse;", "BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String registrationResponseJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationResponseJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON, registrationResponseJson);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreatePublicKeyCredentialResponse createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString(androidx.view.CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.CreatePublicKeyCredentialResponse(string, data, null);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialResponse(java.lang.String str, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
