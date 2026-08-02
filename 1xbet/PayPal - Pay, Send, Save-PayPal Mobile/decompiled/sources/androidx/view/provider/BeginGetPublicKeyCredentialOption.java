package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "Landroid/os/Bundle;", "candidateQueryData", "", "id", "requestJson", "", "clientDataHash", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[B)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "[B", "getClientDataHash", "()[B", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginGetPublicKeyCredentialOption extends androidx.view.provider.BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetPublicKeyCredentialOption.Companion INSTANCE = new androidx.view.provider.BeginGetPublicKeyCredentialOption.Companion(null);
    private final byte[] clientDataHash;
    private final java.lang.String requestJson;

    public /* synthetic */ BeginGetPublicKeyCredentialOption(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, str2, (i & 8) != 0 ? null : bArr);
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, byte[] bArr) {
        super(str, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.requestJson = str2;
        this.clientDataHash = bArr;
        if (!androidx.view.provider.utils.RequestValidationUtil.INSTANCE.isValidJSON(str2)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "createFromEntrySlice$credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetPublicKeyCredentialOption createFrom$credentials_release(android.os.Bundle data, java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.provider.BeginGetPublicKeyCredentialOption(data, id, string, byteArray);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetPublicKeyCredentialOption createFromEntrySlice$credentials_release(android.os.Bundle data, java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new androidx.view.provider.BeginGetPublicKeyCredentialOption(data, id, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        this(bundle, str, str2, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }
}
