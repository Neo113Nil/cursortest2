package androidx.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u0013R\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/GetPublicKeyCredentialOption;", "Landroidx/credentials/CredentialOption;", "", "p0", "", "p1", "", "Landroid/content/ComponentName;", "p2", "Landroid/os/Bundle;", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;[BLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "requestJson", "clientDataHash", "allowedProviders", "(Ljava/lang/String;[BLjava/util/Set;)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "[B", "getClientDataHash", "()[B", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPublicKeyCredentialOption extends androidx.view.CredentialOption {
    public static final java.lang.String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final java.lang.String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final java.lang.String BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.GetPublicKeyCredentialOption.Companion INSTANCE = new androidx.view.GetPublicKeyCredentialOption.Companion(null);
    private final byte[] clientDataHash;
    private final java.lang.String requestJson;

    /* synthetic */ GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr, java.util.Set set, android.os.Bundle bundle, android.os.Bundle bundle2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, set, bundle, bundle2, (i2 & 32) != 0 ? 100 : i);
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    private GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr, java.util.Set<android.content.ComponentName> set, android.os.Bundle bundle, android.os.Bundle bundle2, int i) {
        super(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, true, set, i);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr, java.util.Set<android.content.ComponentName> set) {
        this(str, bArr, set, r0.toRequestDataBundle$credentials_release(str, bArr), r0.toRequestDataBundle$credentials_release(str, bArr), 0, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        androidx.view.GetPublicKeyCredentialOption.Companion companion = INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Landroidx/credentials/GetPublicKeyCredentialOption$Companion;", "", "<init>", "()V", "", "requestJson", "", "clientDataHash", "Landroid/os/Bundle;", "toRequestDataBundle$credentials_release", "(Ljava/lang/String;[B)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Landroid/content/ComponentName;", "allowedProviders", "candidateQueryData", "Landroidx/credentials/GetPublicKeyCredentialOption;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/util/Set;Landroid/os/Bundle;)Landroidx/credentials/GetPublicKeyCredentialOption;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toRequestDataBundle$credentials_release(java.lang.String requestJson, byte[] clientDataHash) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.view.PublicKeyCredential.BUNDLE_KEY_SUBTYPE, androidx.view.GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetPublicKeyCredentialOption createFrom$credentials_release(android.os.Bundle data, java.util.Set<android.content.ComponentName> allowedProviders, android.os.Bundle candidateQueryData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedProviders, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.GetPublicKeyCredentialOption(string, byteArray, allowedProviders, data, candidateQueryData, data.getInt(androidx.view.CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100), null);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr, java.util.Set set, android.os.Bundle bundle, android.os.Bundle bundle2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, set, bundle, bundle2, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialOption(java.lang.String str, byte[] bArr) {
        this(str, bArr, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialOption(java.lang.String str) {
        this(str, null, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
