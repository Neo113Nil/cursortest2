package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class BeginGetCustomCredentialOption extends androidx.view.provider.BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetCustomCredentialOption.Companion INSTANCE = new androidx.view.provider.BeginGetCustomCredentialOption.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        super(str, str2, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("id should not be empty".toString());
        }
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("type should not be empty".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "type", "Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "createFromEntrySlice$credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCustomCredentialOption createFrom$credentials_release(android.os.Bundle data, java.lang.String id, java.lang.String type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new androidx.view.provider.BeginGetCustomCredentialOption(id, type, data);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCustomCredentialOption createFromEntrySlice$credentials_release(android.os.Bundle data, java.lang.String id, java.lang.String type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new androidx.view.provider.BeginGetCustomCredentialOption(id, type, data);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
