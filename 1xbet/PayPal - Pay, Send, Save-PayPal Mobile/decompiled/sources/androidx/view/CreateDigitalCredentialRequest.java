package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\fR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/CreateDigitalCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "", "p0", "p1", "Landroid/os/Bundle;", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "requestJson", "origin", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateDigitalCredentialRequest extends androidx.view.CreateCredentialRequest {
    public static final java.lang.String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateDigitalCredentialRequest.Companion INSTANCE = new androidx.view.CreateDigitalCredentialRequest.Companion(null);
    public static final java.lang.String UNUSED_USER_ID = "unused";
    private final java.lang.String requestJson;

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    private CreateDigitalCredentialRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, false, false, INSTANCE.populateUnusedDisplayInfo$credentials_release(), str2, false);
        this.requestJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateDigitalCredentialRequest(java.lang.String str, java.lang.String str2) {
        this(str, str2, INSTANCE.toBundle$credentials_release(str), new android.os.Bundle());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/credentials/CreateDigitalCredentialRequest$Companion;", "", "<init>", "()V", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "populateUnusedDisplayInfo$credentials_release", "()Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "requestJson", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "origin", "candidateQueryData", "Landroidx/credentials/CreateDigitalCredentialRequest;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/CreateDigitalCredentialRequest;", "BUNDLE_KEY_REQUEST_JSON", "Ljava/lang/String;", "UNUSED_USER_ID"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.credentials.CreateCredentialRequest.DisplayInfo populateUnusedDisplayInfo$credentials_release() {
            return new androidx.credentials.CreateCredentialRequest.DisplayInfo(androidx.view.CreateDigitalCredentialRequest.UNUSED_USER_ID, (java.lang.CharSequence) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String requestJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateDigitalCredentialRequest createFrom$credentials_release(android.os.Bundle data, java.lang.String origin, android.os.Bundle candidateQueryData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
            if (string == null) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
            return new androidx.view.CreateDigitalCredentialRequest(string, origin, data, candidateQueryData, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateDigitalCredentialRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle, bundle2);
    }
}
