package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\f"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "", "requestJson", "", "isCloudBackupEnabled", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "Z", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateRestoreCredentialRequest extends androidx.view.CreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateRestoreCredentialRequest.Companion INSTANCE = new androidx.view.CreateRestoreCredentialRequest.Companion(null);
    private final boolean isCloudBackupEnabled;
    private final java.lang.String requestJson;

    public /* synthetic */ CreateRestoreCredentialRequest(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    /* renamed from: isCloudBackupEnabled, reason: from getter */
    public final boolean getIsCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CreateRestoreCredentialRequest(java.lang.String str, boolean z) {
        super(androidx.view.RestoreCredential.TYPE_RESTORE_CREDENTIAL, androidx.view.CreateRestoreCredentialRequest.Companion.access$toCredentialDataBundle(r0, str, z), new android.os.Bundle(), false, false, androidx.view.CreateRestoreCredentialRequest.Companion.access$getDisplayInfoFromJson(r0, str), null, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.view.CreateRestoreCredentialRequest.Companion companion = INSTANCE;
        this.requestJson = str;
        this.isCloudBackupEnabled = z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Landroidx/credentials/CreateCredentialRequest$DisplayInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ androidx.credentials.CreateCredentialRequest.DisplayInfo access$getDisplayInfoFromJson(androidx.view.CreateRestoreCredentialRequest.Companion companion, java.lang.String str) {
            return getHighResolutionOutputSizeshNQ4ISI(str);
        }

        private static androidx.credentials.CreateCredentialRequest.DisplayInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
            try {
                java.lang.String string = new org.json.JSONObject(p0).getJSONObject("user").getString("id");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                return new androidx.credentials.CreateCredentialRequest.DisplayInfo(string, (java.lang.CharSequence) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } catch (java.lang.Exception unused) {
                throw new java.lang.IllegalArgumentException("user.id must be defined in requestJson");
            }
        }

        public static final /* synthetic */ android.os.Bundle access$toCredentialDataBundle(androidx.view.CreateRestoreCredentialRequest.Companion companion, java.lang.String str, boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST", str);
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD", z);
            return bundle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialRequest(java.lang.String str) {
        this(str, false, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
