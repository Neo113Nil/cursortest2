package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/GetRestoreCredentialOption;", "Landroidx/credentials/CredentialOption;", "", "requestJson", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "Companion_"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRestoreCredentialOption extends androidx.view.CredentialOption {
    private static final androidx.credentials.GetRestoreCredentialOption.Companion_ Companion_ = new androidx.credentials.GetRestoreCredentialOption.Companion_(null);
    private final java.lang.String requestJson;

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRestoreCredentialOption(java.lang.String str) {
        super(androidx.view.RestoreCredential.TYPE_RESTORE_CREDENTIAL, androidx.credentials.GetRestoreCredentialOption.Companion_.getHighSpeedVideoFpsRanges(str), new android.os.Bundle(), false, false, kotlin.collections.SetsKt.emptySet(), 2000);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.requestJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/GetRestoreCredentialOption$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public static final /* synthetic */ android.os.Bundle getHighSpeedVideoFpsRanges(java.lang.String str) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST", str);
            return bundle;
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
