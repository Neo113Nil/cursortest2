package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/CreateDigitalCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "", "responseJson", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getResponseJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateDigitalCredentialResponse extends androidx.view.CreateCredentialResponse {
    public static final java.lang.String BUNDLE_KEY_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_RESPONSE_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateDigitalCredentialResponse.Companion INSTANCE = new androidx.view.CreateDigitalCredentialResponse.Companion(null);
    private final java.lang.String responseJson;

    public final java.lang.String getResponseJson() {
        return this.responseJson;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDigitalCredentialResponse(java.lang.String str) {
        super(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL, INSTANCE.toBundle$credentials_release(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.responseJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("responseJson must not be empty, and must be a valid JSON".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/CreateDigitalCredentialResponse$Companion;", "", "<init>", "()V", "", "responseJson", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/CreateDigitalCredentialResponse;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/CreateDigitalCredentialResponse;", "BUNDLE_KEY_RESPONSE_JSON", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String responseJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.CreateDigitalCredentialResponse.BUNDLE_KEY_RESPONSE_JSON, responseJson);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateDigitalCredentialResponse createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString(androidx.view.CreateDigitalCredentialResponse.BUNDLE_KEY_RESPONSE_JSON);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.CreateDigitalCredentialResponse(string);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
