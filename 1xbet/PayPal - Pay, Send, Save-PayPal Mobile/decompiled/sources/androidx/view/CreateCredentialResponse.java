package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/credentials/CreateCredentialResponse;", "", "", "type", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CreateCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateCredentialResponse.Companion INSTANCE = new androidx.view.CreateCredentialResponse.Companion(null);
    private final android.os.Bundle data;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/credentials/CreateCredentialResponse$Companion;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/CreateCredentialResponse;", "createFrom", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/CreateCredentialResponse;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/CreateCredentialResponse;", "response", "asBundle", "(Landroidx/credentials/CreateCredentialResponse;)Landroid/os/Bundle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialResponse createFrom(java.lang.String type, android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                int hashCode = type.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && type.equals(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return androidx.view.CreatePublicKeyCredentialResponse.INSTANCE.createFrom$credentials_release(data);
                        }
                    } else if (type.equals(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return androidx.view.CreatePasswordResponse.INSTANCE.createFrom$credentials_release(data);
                    }
                } else if (type.equals(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return androidx.view.CreateDigitalCredentialResponse.INSTANCE.createFrom$credentials_release(data);
                }
                throw new androidx.view.internal.FrameworkClassParsingException();
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.CreateCustomCredentialResponse(type, data);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialResponse fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE");
            if (string == null || (bundle2 = bundle.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                return null;
            }
            return createFrom(string, bundle2);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.CreateCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE", response.getType());
            bundle.putBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA", response.getData());
            return bundle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CreateCredentialResponse(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.type = str;
        this.data = bundle;
    }

    public final android.os.Bundle getData() {
        return this.data;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialResponse fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialResponse createFrom(java.lang.String str, android.os.Bundle bundle) {
        return INSTANCE.createFrom(str, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.CreateCredentialResponse createCredentialResponse) {
        return INSTANCE.asBundle(createCredentialResponse);
    }
}
