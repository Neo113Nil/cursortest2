package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006"}, d2 = {"Landroidx/credentials/CreatePasswordResponse;", "Landroidx/credentials/CreateCredentialResponse;", "Landroid/os/Bundle;", "p0", "<init>", "(Landroid/os/Bundle;)V", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePasswordResponse extends androidx.view.CreateCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreatePasswordResponse.Companion INSTANCE = new androidx.view.CreatePasswordResponse.Companion(null);

    private CreatePasswordResponse(android.os.Bundle bundle) {
        super(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
    }

    public CreatePasswordResponse() {
        this(new android.os.Bundle());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/CreatePasswordResponse$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/CreatePasswordResponse;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/CreatePasswordResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreatePasswordResponse createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new androidx.view.CreatePasswordResponse(data, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePasswordResponse(android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle);
    }
}
