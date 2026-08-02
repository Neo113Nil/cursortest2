package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/credentials/ClearCredentialStateRequest;", "", "", "requestType", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRequestType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "requestBundle", "Landroid/os/Bundle;", "getRequestBundle", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClearCredentialStateRequest {
    public static final java.lang.String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public static final java.lang.String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";
    private final android.os.Bundle requestBundle;
    private final java.lang.String requestType;

    public ClearCredentialStateRequest(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.requestType = str;
        android.os.Bundle bundle = new android.os.Bundle();
        this.requestBundle = bundle;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, TYPE_CLEAR_CREDENTIAL_STATE) && !kotlin.jvm.internal.Intrinsics.areEqual(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The request type ");
            sb.append(str);
            sb.append(" is not supported.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
        }
    }

    public /* synthetic */ ClearCredentialStateRequest(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }

    public final java.lang.String getRequestType() {
        return this.requestType;
    }

    public final android.os.Bundle getRequestBundle() {
        return this.requestBundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
