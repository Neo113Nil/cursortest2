package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/credentials/Credential;", "", "", "type", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Credential {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.Credential.Companion INSTANCE = new androidx.view.Credential.Companion(null);
    private final android.os.Bundle data;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Landroidx/credentials/Credential$Companion;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/Credential;", "createFrom", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/Credential;", "Landroid/credentials/Credential;", "credential", "(Landroid/credentials/Credential;)Landroidx/credentials/Credential;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.Credential createFrom(java.lang.String type, android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return androidx.view.DigitalCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -1072734346:
                        if (type.equals(androidx.view.RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return androidx.view.RestoreCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -543568185:
                        if (type.equals(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return androidx.view.PasswordCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -95037569:
                        if (type.equals(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return androidx.view.PublicKeyCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                }
                throw new androidx.view.internal.FrameworkClassParsingException();
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.CustomCredential(type, data);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.Credential createFrom(android.credentials.Credential credential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            java.lang.String type = credential.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            android.os.Bundle data = credential.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
            return createFrom(type, data);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Credential(java.lang.String str, android.os.Bundle bundle) {
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
    public static final androidx.view.Credential createFrom(java.lang.String str, android.os.Bundle bundle) {
        return INSTANCE.createFrom(str, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.Credential createFrom(android.credentials.Credential credential) {
        return INSTANCE.createFrom(credential);
    }
}
