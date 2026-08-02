package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/DigitalCredential;", "Landroidx/credentials/Credential;", "", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "credentialJson", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getCredentialJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DigitalCredential extends androidx.view.Credential {
    public static final java.lang.String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.DigitalCredential.Companion INSTANCE = new androidx.view.DigitalCredential.Companion(null);
    public static final java.lang.String TYPE_DIGITAL_CREDENTIAL = "androidx.credentials.TYPE_DIGITAL_CREDENTIAL";
    private final java.lang.String credentialJson;

    public final java.lang.String getCredentialJson() {
        return this.credentialJson;
    }

    private DigitalCredential(java.lang.String str, android.os.Bundle bundle) {
        super(TYPE_DIGITAL_CREDENTIAL, bundle);
        this.credentialJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigitalCredential(java.lang.String str) {
        this(str, INSTANCE.toBundle$credentials_release(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/credentials/DigitalCredential$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/DigitalCredential;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/DigitalCredential;", "", "responseJson", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", "TYPE_DIGITAL_CREDENTIAL", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.DigitalCredential createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.Object obj = data.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                return obj instanceof byte[] ? new androidx.view.DigitalCredential(new java.lang.String((byte[]) obj, kotlin.text.Charsets.UTF_8), data, defaultConstructorMarker) : new androidx.view.DigitalCredential((java.lang.String) obj, data, defaultConstructorMarker);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String responseJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            byte[] bytes = responseJson.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            if (bytes.length >= 500000) {
                bundle.putByteArray("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", bytes);
                return bundle;
            }
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", responseJson);
            return bundle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DigitalCredential(java.lang.String str, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
