package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/GetCredentialResponse;", "", "Landroidx/credentials/Credential;", "credential", "<init>", "(Landroidx/credentials/Credential;)V", "Landroidx/credentials/Credential;", "getCredential", "()Landroidx/credentials/Credential;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.GetCredentialResponse.Companion INSTANCE = new androidx.view.GetCredentialResponse.Companion(null);
    private final androidx.view.Credential credential;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/GetCredentialResponse$Companion;", "", "<init>", "()V", "Landroidx/credentials/GetCredentialResponse;", "response", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/GetCredentialResponse;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/GetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.GetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE", response.getCredential().getType());
            bundle.putBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA", response.getCredential().getData());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetCredentialResponse fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE");
            if (string == null || (bundle2 = bundle.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                return null;
            }
            return new androidx.view.GetCredentialResponse(androidx.view.Credential.INSTANCE.createFrom(string, bundle2));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetCredentialResponse(androidx.view.Credential credential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
        this.credential = credential;
    }

    public final androidx.view.Credential getCredential() {
        return this.credential;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.GetCredentialResponse fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.GetCredentialResponse getCredentialResponse) {
        return INSTANCE.asBundle(getCredentialResponse);
    }
}
