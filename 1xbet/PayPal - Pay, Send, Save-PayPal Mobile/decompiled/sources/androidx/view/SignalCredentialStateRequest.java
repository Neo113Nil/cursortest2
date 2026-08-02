package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f"}, d2 = {"Landroidx/credentials/SignalCredentialStateRequest;", "", "", "type", "requestJson", "Landroid/os/Bundle;", "requestData", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getRequestJson", "Landroid/os/Bundle;", "getRequestData", "()Landroid/os/Bundle;", "getOrigin", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SignalCredentialStateRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.SignalCredentialStateRequest.Companion INSTANCE = new androidx.view.SignalCredentialStateRequest.Companion(null);
    public static final java.lang.String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private final java.lang.String origin;
    private final android.os.Bundle requestData;
    private final java.lang.String requestJson;
    private final java.lang.String type;

    public SignalCredentialStateRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.type = str;
        this.requestJson = str2;
        this.requestData = bundle;
        this.origin = str3;
    }

    public /* synthetic */ SignalCredentialStateRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final android.os.Bundle getRequestData() {
        return this.requestData;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/SignalCredentialStateRequest$Companion;", "", "<init>", "()V", "", "requestType", "Landroid/os/Bundle;", "requestData", "origin", "Landroidx/credentials/SignalCredentialStateRequest;", "createFrom", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/credentials/SignalCredentialStateRequest;", "requestJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/SignalCredentialStateRequest;", "SIGNAL_REQUEST_JSON_KEY", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SignalCredentialStateRequest createFrom(java.lang.String requestType, android.os.Bundle requestData, java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestData, "");
            java.lang.String string = requestData.getString("androidx.credentials.signal_request_json_key");
            if (string == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing requestJson");
            }
            return createFrom(requestType, string, origin);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SignalCredentialStateRequest createFrom(java.lang.String requestType, java.lang.String requestJson, java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            int hashCode = requestType.hashCode();
            if (hashCode != -1620108889) {
                if (hashCode != 661746467) {
                    if (hashCode == 847956843 && requestType.equals(androidx.view.SignalUnknownCredentialRequest.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE)) {
                        return new androidx.view.SignalUnknownCredentialRequest(requestJson, origin);
                    }
                } else if (requestType.equals(androidx.view.SignalCurrentUserDetailsRequest.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE)) {
                    return new androidx.view.SignalCurrentUserDetailsRequest(requestJson, origin);
                }
            } else if (requestType.equals(androidx.view.SignalAllAcceptedCredentialIdsRequest.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE)) {
                return new androidx.view.SignalAllAcceptedCredentialIdsRequest(requestJson, origin);
            }
            throw new java.lang.IllegalArgumentException("Request type is not supported");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SignalCredentialStateRequest createFrom(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return INSTANCE.createFrom(str, str2, str3);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SignalCredentialStateRequest createFrom(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        return INSTANCE.createFrom(str, bundle, str2);
    }
}
