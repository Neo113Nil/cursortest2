package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/credentials/provider/BeginCreatePublicKeyCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "requestJson", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroid/os/Bundle;", "candidateQueryData", "", "clientDataHash", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/CallingAppInfo;Landroid/os/Bundle;[B)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "[B", "getClientDataHash", "()[B", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginCreatePublicKeyCredentialRequest extends androidx.view.provider.BeginCreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginCreatePublicKeyCredentialRequest.Companion INSTANCE = new androidx.view.provider.BeginCreatePublicKeyCredentialRequest.Companion(null);
    private final byte[] clientDataHash;
    private final java.lang.String requestJson;

    public /* synthetic */ BeginCreatePublicKeyCredentialRequest(java.lang.String str, androidx.view.provider.CallingAppInfo callingAppInfo, android.os.Bundle bundle, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, callingAppInfo, bundle, (i & 8) != 0 ? null : bArr);
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreatePublicKeyCredentialRequest(java.lang.String str, androidx.view.provider.CallingAppInfo callingAppInfo, android.os.Bundle bundle, byte[] bArr) {
        super(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, callingAppInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!androidx.view.provider.utils.RequestValidationUtil.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/credentials/provider/BeginCreatePublicKeyCredentialRequest$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BeginCreatePublicKeyCredentialRequest;", "createForTest", "(Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)Landroidx/credentials/provider/BeginCreatePublicKeyCredentialRequest;", "createFrom$credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreatePublicKeyCredentialRequest createForTest(android.os.Bundle data, androidx.view.provider.CallingAppInfo callingAppInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return createFrom$credentials_release(data, callingAppInfo);
        }

        public final androidx.view.provider.BeginCreatePublicKeyCredentialRequest createFrom$credentials_release(android.os.Bundle data, androidx.view.provider.CallingAppInfo callingAppInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.provider.BeginCreatePublicKeyCredentialRequest(string, callingAppInfo, data, byteArray);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginCreatePublicKeyCredentialRequest createForTest(android.os.Bundle bundle, androidx.view.provider.CallingAppInfo callingAppInfo) {
        return INSTANCE.createForTest(bundle, callingAppInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeginCreatePublicKeyCredentialRequest(java.lang.String str, androidx.view.provider.CallingAppInfo callingAppInfo, android.os.Bundle bundle) {
        this(str, callingAppInfo, bundle, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
    }
}
