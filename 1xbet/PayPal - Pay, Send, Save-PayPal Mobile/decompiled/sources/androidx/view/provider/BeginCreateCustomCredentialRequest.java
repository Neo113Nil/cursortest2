package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/credentials/provider/BeginCreateCustomCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class BeginCreateCustomCredentialRequest extends androidx.view.provider.BeginCreateCredentialRequest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreateCustomCredentialRequest(java.lang.String str, android.os.Bundle bundle, androidx.view.provider.CallingAppInfo callingAppInfo) {
        super(str, bundle, callingAppInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("type should not be empty".toString());
        }
    }
}
