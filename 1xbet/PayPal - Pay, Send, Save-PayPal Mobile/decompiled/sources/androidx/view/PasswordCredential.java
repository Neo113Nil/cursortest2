package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/credentials/PasswordCredential;", "Landroidx/credentials/Credential;", "", "p0", "p1", "Landroid/os/Bundle;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "id", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getPassword", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PasswordCredential extends androidx.view.Credential {
    public static final java.lang.String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final java.lang.String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.PasswordCredential.Companion INSTANCE = new androidx.view.PasswordCredential.Companion(null);
    public static final java.lang.String TYPE_PASSWORD_CREDENTIAL = "android.credentials.TYPE_PASSWORD_CREDENTIAL";
    private final java.lang.String id;
    private final java.lang.String password;

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    private PasswordCredential(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        super(TYPE_PASSWORD_CREDENTIAL, bundle);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("password should not be empty".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasswordCredential(java.lang.String str, java.lang.String str2) {
        this(str, str2, INSTANCE.toBundle$credentials_release(str, str2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Landroidx/credentials/PasswordCredential$Companion;", "", "<init>", "()V", "", "id", "password", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/credentials/PasswordCredential;", "createFrom$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/PasswordCredential;", "TYPE_PASSWORD_CREDENTIAL", "Ljava/lang/String;", "BUNDLE_KEY_ID", "BUNDLE_KEY_PASSWORD"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String id, java.lang.String password) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.PasswordCredential createFrom$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                java.lang.String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
                return new androidx.view.PasswordCredential(string, string2, data, null);
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasswordCredential(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
