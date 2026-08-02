package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "", "", "allowedUserIds", "Landroid/os/Bundle;", "candidateQueryData", "id", "<init>", "(Ljava/util/Set;Landroid/os/Bundle;Ljava/lang/String;)V", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginGetPasswordOption extends androidx.view.provider.BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetPasswordOption.Companion INSTANCE = new androidx.view.provider.BeginGetPasswordOption.Companion(null);
    private final java.util.Set<java.lang.String> allowedUserIds;

    public final java.util.Set<java.lang.String> getAllowedUserIds() {
        return this.allowedUserIds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPasswordOption(java.util.Set<java.lang.String> set, android.os.Bundle bundle, java.lang.String str) {
        super(str, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.allowedUserIds = set;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "Landroidx/credentials/provider/BeginGetPasswordOption;", "createForTest", "(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/credentials/provider/BeginGetPasswordOption;", "createFrom$credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetPasswordOption createForTest(android.os.Bundle data, java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return createFrom$credentials_release(data, id);
        }

        public final androidx.view.provider.BeginGetPasswordOption createFrom$credentials_release(android.os.Bundle data, java.lang.String id) {
            java.util.Set emptySet;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            java.util.ArrayList<java.lang.String> stringArrayList = data.getStringArrayList(androidx.view.GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (emptySet = kotlin.collections.CollectionsKt.toSet(stringArrayList)) == null) {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            return new androidx.view.provider.BeginGetPasswordOption(emptySet, data, id);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginGetPasswordOption createForTest(android.os.Bundle bundle, java.lang.String str) {
        return INSTANCE.createForTest(bundle, str);
    }
}
