package androidx.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0015B=\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/credentials/CreatePasswordRequest;", "Landroidx/credentials/CreateCredentialRequest;", "", "p0", "p1", "", "p2", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "p3", "p4", "p5", "Landroid/os/Bundle;", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "id", "password", "origin", "preferImmediatelyAvailableCredentials", "isAutoSelectAllowed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getPassword", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePasswordRequest extends androidx.view.CreateCredentialRequest {
    public static final java.lang.String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final java.lang.String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreatePasswordRequest.Companion INSTANCE = new androidx.view.CreatePasswordRequest.Companion(null);
    private final java.lang.String id;
    private final java.lang.String password;

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    /* synthetic */ CreatePasswordRequest(java.lang.String str, java.lang.String str2, boolean z, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str3, boolean z2, android.os.Bundle bundle, android.os.Bundle bundle2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, displayInfo, (i & 16) != 0 ? null : str3, z2, (i & 64) != 0 ? INSTANCE.toCredentialDataBundle$credentials_release(str, str2) : bundle, (i & 128) != 0 ? INSTANCE.toCandidateDataBundle$credentials_release() : bundle2);
    }

    private CreatePasswordRequest(java.lang.String str, java.lang.String str2, boolean z, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str3, boolean z2, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str3, z2);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("password should not be empty".toString());
        }
    }

    public /* synthetic */ CreatePasswordRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        this(str, str2, z2, new androidx.credentials.CreateCredentialRequest.DisplayInfo(str, null), str3, z, null, null, 192, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        this(str, str2, z2, new androidx.credentials.CreateCredentialRequest.DisplayInfo(str, null, str4), str3, z, null, null, 192, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/credentials/CreatePasswordRequest$Companion;", "", "<init>", "()V", "", "id", "password", "Landroid/os/Bundle;", "toCredentialDataBundle$credentials_release", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "toCandidateDataBundle$credentials_release", "()Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "origin", "candidateQueryData", "Landroidx/credentials/CreatePasswordRequest;", "createFrom$credentials_release", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/CreatePasswordRequest;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toCredentialDataBundle$credentials_release(java.lang.String id, java.lang.String password) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toCandidateDataBundle$credentials_release() {
            return new android.os.Bundle();
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreatePasswordRequest createFrom$credentials_release(android.os.Bundle data, java.lang.String origin, android.os.Bundle candidateQueryData) {
            androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            try {
                java.lang.String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                java.lang.String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
                try {
                    displayInfo = androidx.credentials.CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(data);
                } catch (java.lang.IllegalArgumentException unused) {
                    displayInfo = new androidx.credentials.CreateCredentialRequest.DisplayInfo(string, null);
                }
                return new androidx.view.CreatePasswordRequest(string, string2, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), displayInfo, origin, data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), data, candidateQueryData, null);
            } catch (java.lang.Exception unused2) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePasswordRequest(java.lang.String str, java.lang.String str2, boolean z, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str3, boolean z2, android.os.Bundle bundle, android.os.Bundle bundle2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, displayInfo, str3, z2, bundle, bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this(str, str2, str3, z, false, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, false, false, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(java.lang.String str, java.lang.String str2) {
        this(str, str2, null, false, false, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }
}
