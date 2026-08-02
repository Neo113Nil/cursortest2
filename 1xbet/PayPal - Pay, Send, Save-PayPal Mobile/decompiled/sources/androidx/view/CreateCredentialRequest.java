package androidx.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dBK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\r\u0010\u0018"}, d2 = {"Landroidx/credentials/CreateCredentialRequest;", "", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getCredentialData", "()Landroid/os/Bundle;", "getCandidateQueryData", "Z", "()Z", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "getDisplayInfo", "()Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "getOrigin", "Companion", "DisplayInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CreateCredentialRequest {
    public static final java.lang.String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";
    public static final java.lang.String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CreateCredentialRequest.Companion INSTANCE = new androidx.view.CreateCredentialRequest.Companion(null);
    private final android.os.Bundle candidateQueryData;
    private final android.os.Bundle credentialData;
    private final androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;
    private final java.lang.String origin;
    private final boolean preferImmediatelyAvailableCredentials;
    private final java.lang.String type;

    public CreateCredentialRequest(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, androidx.credentials.CreateCredentialRequest.DisplayInfo displayInfo, java.lang.String str2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfo, "");
        this.type = str;
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.displayInfo = displayInfo;
        this.origin = str2;
        this.preferImmediatelyAvailableCredentials = z3;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z3);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final android.os.Bundle getCredentialData() {
        return this.credentialData;
    }

    public final android.os.Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    /* renamed from: isSystemProviderRequired, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    /* renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final androidx.credentials.CreateCredentialRequest.DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    /* renamed from: preferImmediatelyAvailableCredentials, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078GX\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "", "userId", "userDisplayName", "Landroid/graphics/drawable/Icon;", "credentialTypeIcon", "", "preferDefaultProvider", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Ljava/lang/CharSequence;", "getUserId", "()Ljava/lang/CharSequence;", "getUserDisplayName", "Landroid/graphics/drawable/Icon;", "getCredentialTypeIcon", "()Landroid/graphics/drawable/Icon;", "Ljava/lang/String;", "getPreferDefaultProvider", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayInfo {
        public static final java.lang.String BUNDLE_KEY_CREDENTIAL_TYPE_ICON = "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON";
        public static final java.lang.String BUNDLE_KEY_DEFAULT_PROVIDER = "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER";
        public static final java.lang.String BUNDLE_KEY_REQUEST_DISPLAY_INFO = "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO";
        public static final java.lang.String BUNDLE_KEY_USER_DISPLAY_NAME = "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME";
        public static final java.lang.String BUNDLE_KEY_USER_ID = "androidx.credentials.BUNDLE_KEY_USER_ID";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.credentials.CreateCredentialRequest.DisplayInfo.Companion INSTANCE = new androidx.credentials.CreateCredentialRequest.DisplayInfo.Companion(null);
        private final android.graphics.drawable.Icon credentialTypeIcon;
        private final java.lang.String preferDefaultProvider;
        private final java.lang.CharSequence userDisplayName;
        private final java.lang.CharSequence userId;

        public DisplayInfo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Icon icon, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            this.userId = charSequence;
            this.userDisplayName = charSequence2;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (charSequence.length() <= 0) {
                throw new java.lang.IllegalArgumentException("userId should not be empty".toString());
            }
        }

        public final java.lang.CharSequence getUserId() {
            return this.userId;
        }

        public final java.lang.CharSequence getUserDisplayName() {
            return this.userDisplayName;
        }

        public final android.graphics.drawable.Icon getCredentialTypeIcon() {
            return this.credentialTypeIcon;
        }

        public final java.lang.String getPreferDefaultProvider() {
            return this.preferDefaultProvider;
        }

        public /* synthetic */ DisplayInfo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i & 2) != 0 ? null : charSequence2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisplayInfo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            this(charSequence, charSequence2, (android.graphics.drawable.Icon) null, (java.lang.String) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisplayInfo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str) {
            this(charSequence, charSequence2, (android.graphics.drawable.Icon) null, str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence(BUNDLE_KEY_USER_ID, this.userId);
            if (!android.text.TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence(BUNDLE_KEY_USER_DISPLAY_NAME, this.userDisplayName);
            }
            if (!android.text.TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString(BUNDLE_KEY_DEFAULT_PROVIDER, this.preferDefaultProvider);
            }
            return bundle;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b"}, d2 = {"Landroidx/credentials/CreateCredentialRequest$DisplayInfo$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "from", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "createFrom", "(Landroid/os/Bundle;)Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "BUNDLE_KEY_REQUEST_DISPLAY_INFO", "Ljava/lang/String;", "BUNDLE_KEY_USER_ID", "BUNDLE_KEY_USER_DISPLAY_NAME", "BUNDLE_KEY_CREDENTIAL_TYPE_ICON", "BUNDLE_KEY_DEFAULT_PROVIDER"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.credentials.CreateCredentialRequest.DisplayInfo createFrom(android.os.Bundle from) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
                try {
                    android.os.Bundle bundle = from.getBundle(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_REQUEST_DISPLAY_INFO);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bundle);
                    java.lang.CharSequence charSequence = bundle.getCharSequence(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_USER_ID);
                    java.lang.CharSequence charSequence2 = bundle.getCharSequence(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_USER_DISPLAY_NAME);
                    android.graphics.drawable.Icon icon = (android.graphics.drawable.Icon) bundle.getParcelable(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_CREDENTIAL_TYPE_ICON);
                    java.lang.String string = bundle.getString(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_DEFAULT_PROVIDER);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(charSequence);
                    return new androidx.credentials.CreateCredentialRequest.DisplayInfo(charSequence, charSequence2, icon, string);
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalArgumentException(e);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.credentials.CreateCredentialRequest.DisplayInfo createFrom(android.os.Bundle bundle) {
            return INSTANCE.createFrom(bundle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DisplayInfo(java.lang.CharSequence charSequence) {
            this(charSequence, (java.lang.CharSequence) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/credentials/CreateCredentialRequest$Companion;", "", "<init>", "()V", "Landroid/credentials/CreateCredentialRequest;", "request", "Landroidx/credentials/CreateCredentialRequest;", "createFrom", "(Landroid/credentials/CreateCredentialRequest;)Landroidx/credentials/CreateCredentialRequest;", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "requireSystemProvider", "origin", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLjava/lang/String;)Landroidx/credentials/CreateCredentialRequest;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "Ljava/lang/String;", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialRequest createFrom(android.credentials.CreateCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.lang.String type = request.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            android.os.Bundle credentialData = request.getCredentialData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credentialData, "");
            android.os.Bundle candidateQueryData = request.getCandidateQueryData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(candidateQueryData, "");
            return createFrom(type, credentialData, candidateQueryData, request.isSystemProviderRequired(), request.getOrigin());
        }

        public static /* synthetic */ androidx.view.CreateCredentialRequest createFrom$default(androidx.view.CreateCredentialRequest.Companion companion, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                str2 = null;
            }
            return companion.createFrom(str, bundle, bundle2, z, str2);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialRequest createFrom(java.lang.String type, android.os.Bundle credentialData, android.os.Bundle candidateQueryData, boolean requireSystemProvider, java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            try {
                int hashCode = type.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && type.equals(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            java.lang.String string = credentialData.getString(androidx.view.PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                            if (string != null && string.hashCode() == 589054771 && string.equals(androidx.view.CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST)) {
                                return androidx.view.CreatePublicKeyCredentialRequest.INSTANCE.createFrom$credentials_release(credentialData, origin, candidateQueryData);
                            }
                            throw new androidx.view.internal.FrameworkClassParsingException();
                        }
                    } else if (type.equals(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return androidx.view.CreatePasswordRequest.INSTANCE.createFrom$credentials_release(credentialData, origin, candidateQueryData);
                    }
                } else if (type.equals(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return androidx.view.CreateDigitalCredentialRequest.Companion.createFrom$credentials_release(credentialData, origin, candidateQueryData);
                }
                throw new androidx.view.internal.FrameworkClassParsingException();
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.CreateCustomCredentialRequest(type, credentialData, candidateQueryData, requireSystemProvider, androidx.credentials.CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(credentialData), credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), origin, credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false));
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialRequest createFrom(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
            return createFrom$default(this, str, bundle, bundle2, z, null, 16, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialRequest createFrom(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, java.lang.String str2) {
        return INSTANCE.createFrom(str, bundle, bundle2, z, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialRequest createFrom(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z) {
        return INSTANCE.createFrom(str, bundle, bundle2, z);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialRequest createFrom(android.credentials.CreateCredentialRequest createCredentialRequest) {
        return INSTANCE.createFrom(createCredentialRequest);
    }
}
