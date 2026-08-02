package androidx.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BG\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB3\b\u0016\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000e\u0010\u0013R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/credentials/GetPasswordOption;", "Landroidx/credentials/CredentialOption;", "", "", "p0", "", "p1", "Landroid/content/ComponentName;", "p2", "Landroid/os/Bundle;", "p3", "p4", "", "p5", "<init>", "(Ljava/util/Set;ZLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "allowedUserIds", "isAutoSelectAllowed", "allowedProviders", "(Ljava/util/Set;ZLjava/util/Set;)V", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPasswordOption extends androidx.view.CredentialOption {
    public static final java.lang.String BUNDLE_KEY_ALLOWED_USER_IDS = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.GetPasswordOption.Companion INSTANCE = new androidx.view.GetPasswordOption.Companion(null);
    private final java.util.Set<java.lang.String> allowedUserIds;

    /* synthetic */ GetPasswordOption(java.util.Set set, boolean z, java.util.Set set2, android.os.Bundle bundle, android.os.Bundle bundle2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, z, set2, bundle, bundle2, (i2 & 32) != 0 ? 1000 : i);
    }

    public final java.util.Set<java.lang.String> getAllowedUserIds() {
        return this.allowedUserIds;
    }

    private GetPasswordOption(java.util.Set<java.lang.String> set, boolean z, java.util.Set<android.content.ComponentName> set2, android.os.Bundle bundle, android.os.Bundle bundle2, int i) {
        super(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, set2, i);
        this.allowedUserIds = set;
    }

    public /* synthetic */ GetPasswordOption(java.util.Set set, boolean z, java.util.Set set2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPasswordOption(java.util.Set<java.lang.String> set, boolean z, java.util.Set<android.content.ComponentName> set2) {
        this(set, z, set2, r0.toBundle$credentials_release(set), r0.toBundle$credentials_release(set), 0, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        androidx.view.GetPasswordOption.Companion companion = INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/GetPasswordOption$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Landroid/content/ComponentName;", "allowedProviders", "candidateQueryData", "Landroidx/credentials/GetPasswordOption;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/util/Set;Landroid/os/Bundle;)Landroidx/credentials/GetPasswordOption;", "", "allowUserIds", "toBundle$credentials_release", "(Ljava/util/Set;)Landroid/os/Bundle;", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetPasswordOption createFrom$credentials_release(android.os.Bundle data, java.util.Set<android.content.ComponentName> allowedProviders, android.os.Bundle candidateQueryData) {
            java.util.Set emptySet;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedProviders, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            java.util.ArrayList<java.lang.String> stringArrayList = data.getStringArrayList(androidx.view.GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (emptySet = kotlin.collections.CollectionsKt.toSet(stringArrayList)) == null) {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            return new androidx.view.GetPasswordOption(emptySet, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, data, candidateQueryData, data.getInt(androidx.view.CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 1000), null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.util.Set<java.lang.String> allowUserIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowUserIds, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList(androidx.view.GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS, new java.util.ArrayList<>(allowUserIds));
            return bundle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetPasswordOption(java.util.Set set, boolean z, java.util.Set set2, android.os.Bundle bundle, android.os.Bundle bundle2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, z, set2, bundle, bundle2, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(java.util.Set<java.lang.String> set, boolean z) {
        this(set, z, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(java.util.Set<java.lang.String> set) {
        this(set, false, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    public GetPasswordOption() {
        this(null, false, null, 7, null);
    }
}
