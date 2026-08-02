package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption;", "", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getType", "Landroid/os/Bundle;", "getCandidateQueryData", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetCredentialOption.Companion INSTANCE = new androidx.view.provider.BeginGetCredentialOption.Companion(null);
    private final android.os.Bundle candidateQueryData;
    private final java.lang.String id;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption$Companion;", "", "<init>", "()V", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/BeginGetCredentialOption;", "createFrom$credentials_release", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialOption;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialOption createFrom$credentials_release(java.lang.String id, java.lang.String type, android.os.Bundle candidateQueryData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                return androidx.view.provider.BeginGetPasswordOption.INSTANCE.createFrom$credentials_release(candidateQueryData, id);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                return androidx.view.provider.BeginGetPublicKeyCredentialOption.INSTANCE.createFrom$credentials_release(candidateQueryData, id);
            }
            return new androidx.view.provider.BeginGetCustomCredentialOption(id, type, candidateQueryData);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BeginGetCredentialOption(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.id = str;
        this.type = str2;
        this.candidateQueryData = bundle;
    }

    public final android.os.Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }
}
