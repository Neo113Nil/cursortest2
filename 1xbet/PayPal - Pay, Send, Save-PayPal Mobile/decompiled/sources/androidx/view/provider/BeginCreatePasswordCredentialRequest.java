package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/credentials/provider/BeginCreatePasswordCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Landroidx/credentials/provider/CallingAppInfo;Landroid/os/Bundle;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginCreatePasswordCredentialRequest extends androidx.view.provider.BeginCreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginCreatePasswordCredentialRequest.Companion INSTANCE = new androidx.view.provider.BeginCreatePasswordCredentialRequest.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreatePasswordCredentialRequest(androidx.view.provider.CallingAppInfo callingAppInfo, android.os.Bundle bundle) {
        super(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, callingAppInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/provider/BeginCreatePasswordCredentialRequest$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BeginCreatePasswordCredentialRequest;", "createFrom$credentials_release", "(Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)Landroidx/credentials/provider/BeginCreatePasswordCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreatePasswordCredentialRequest createFrom$credentials_release(android.os.Bundle data, androidx.view.provider.CallingAppInfo callingAppInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                return new androidx.view.provider.BeginCreatePasswordCredentialRequest(callingAppInfo, data);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
