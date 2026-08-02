package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/credentials/CreateCustomCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "", "type", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CreateCustomCredentialResponse extends androidx.view.CreateCredentialResponse {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCustomCredentialResponse(java.lang.String str, android.os.Bundle bundle) {
        super(str, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("type should not be empty".toString());
        }
    }
}
