package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001f !\u001eBA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/credentials/provider/CredentialEntry;", "", "", "type", "Landroidx/credentials/provider/BeginGetCredentialOption;", "beginGetCredentialOption", "", "entryGroupId", "", "isDefaultIconPreferredAsSingleProvider", "affiliatedDomain", "Landroidx/credentials/provider/BiometricPromptData;", "biometricPromptData", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroidx/credentials/provider/BiometricPromptData;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "getBeginGetCredentialOption", "()Landroidx/credentials/provider/BeginGetCredentialOption;", "Ljava/lang/CharSequence;", "getEntryGroupId", "()Ljava/lang/CharSequence;", "Z", "()Z", "getAffiliatedDomain", "Landroidx/credentials/provider/BiometricPromptData;", "getBiometricPromptData", "()Landroidx/credentials/provider/BiometricPromptData;", "Companion", "Api34Impl", "Api35Impl", "Api28Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CredentialEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.CredentialEntry.Companion INSTANCE = new androidx.view.provider.CredentialEntry.Companion(null);
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX = "androidx.credentials.provider.extra.HAS_DEFAULT_ICON_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";
    public static final java.lang.String EXTRA_CREDENTIAL_ENTRY_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE";
    public static final java.lang.String EXTRA_CREDENTIAL_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.SUBTITLE_";
    public static final java.lang.String EXTRA_CREDENTIAL_TITLE_PREFIX = "androidx.credentials.provider.extra.TITLE_";
    public static final java.lang.String EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX = "androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_";
    public static final java.lang.String EXTRA_CREDENTIAL_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    public static final java.lang.String FALSE_STRING = "false";
    public static final int REVISION_ID = 1;
    public static final java.lang.String SLICE_HINT_AFFILIATED_DOMAIN = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";
    public static final java.lang.String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";
    public static final java.lang.String SLICE_HINT_AUTO_ALLOWED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";
    public static final java.lang.String SLICE_HINT_AUTO_SELECT_FROM_OPTION = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";
    public static final java.lang.String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";
    public static final java.lang.String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CRYPTO_OP_ID";
    public static final java.lang.String SLICE_HINT_DEDUPLICATION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";
    public static final java.lang.String SLICE_HINT_DEFAULT_ICON_RES_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";
    public static final java.lang.String SLICE_HINT_ICON = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";
    public static final java.lang.String SLICE_HINT_IS_DEFAULT_ICON_PREFERRED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";
    public static final java.lang.String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";
    public static final java.lang.String SLICE_HINT_OPTION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";
    public static final java.lang.String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";
    public static final java.lang.String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";
    public static final java.lang.String SLICE_HINT_TITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";
    public static final java.lang.String SLICE_HINT_TYPE_DISPLAY_NAME = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";
    public static final java.lang.String TRUE_STRING = "true";
    private final java.lang.CharSequence affiliatedDomain;
    private final androidx.view.provider.BeginGetCredentialOption beginGetCredentialOption;
    private final androidx.view.provider.BiometricPromptData biometricPromptData;
    private final java.lang.CharSequence entryGroupId;
    private final boolean isDefaultIconPreferredAsSingleProvider;
    private final java.lang.String type;

    public CredentialEntry(java.lang.String str, androidx.view.provider.BeginGetCredentialOption beginGetCredentialOption, java.lang.CharSequence charSequence, boolean z, java.lang.CharSequence charSequence2, androidx.view.provider.BiometricPromptData biometricPromptData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beginGetCredentialOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        this.type = str;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = charSequence;
        this.isDefaultIconPreferredAsSingleProvider = z;
        this.affiliatedDomain = charSequence2;
        this.biometricPromptData = biometricPromptData;
    }

    public /* synthetic */ CredentialEntry(java.lang.String str, androidx.view.provider.BeginGetCredentialOption beginGetCredentialOption, java.lang.CharSequence charSequence, boolean z, java.lang.CharSequence charSequence2, androidx.view.provider.BiometricPromptData biometricPromptData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, beginGetCredentialOption, charSequence, z, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : biometricPromptData);
    }

    public java.lang.String getType() {
        return this.type;
    }

    public final androidx.view.provider.BeginGetCredentialOption getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    public final java.lang.CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    /* renamed from: isDefaultIconPreferredAsSingleProvider, reason: from getter */
    public final boolean getIsDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    public final java.lang.CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    public final androidx.view.provider.BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Api34Impl;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "p0", "Landroidx/credentials/provider/CredentialEntry;", "db_", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/CredentialEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Api34Impl {
        public static final androidx.credentials.provider.CredentialEntry.Api34Impl INSTANCE = new androidx.credentials.provider.CredentialEntry.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.CredentialEntry db_(android.service.credentials.CredentialEntry p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.app.slice.Slice slice = p0.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return androidx.view.provider.CredentialEntry.INSTANCE.fromSlice$credentials_release(slice);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Api35Impl;", "", "<init>", "()V", "Landroidx/credentials/provider/CredentialEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "Landroid/app/slice/Slice;", "toSlice", "(Landroidx/credentials/provider/CredentialEntry;)Landroid/app/slice/Slice;", "slice", "fromSlice", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/CredentialEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api35Impl {
        public static final androidx.credentials.provider.CredentialEntry.Api35Impl INSTANCE = new androidx.credentials.provider.CredentialEntry.Api35Impl();

        private Api35Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.app.slice.Slice toSlice(androidx.view.provider.CredentialEntry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            if (entry instanceof androidx.view.provider.PasswordCredentialEntry) {
                return androidx.view.provider.PasswordCredentialEntry.INSTANCE.toSlice((androidx.view.provider.PasswordCredentialEntry) entry);
            }
            if (entry instanceof androidx.view.provider.PublicKeyCredentialEntry) {
                return androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.toSlice((androidx.view.provider.PublicKeyCredentialEntry) entry);
            }
            if (entry instanceof androidx.view.provider.CustomCredentialEntry) {
                return androidx.view.provider.CustomCredentialEntry.INSTANCE.toSlice((androidx.view.provider.CustomCredentialEntry) entry);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.CredentialEntry fromSlice(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            try {
                android.app.slice.SliceSpec spec = slice.getSpec();
                java.lang.String type = spec != null ? spec.getType() : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    androidx.view.provider.PasswordCredentialEntry fromSlice = androidx.view.provider.PasswordCredentialEntry.INSTANCE.fromSlice(slice);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice);
                    return fromSlice;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    androidx.view.provider.PublicKeyCredentialEntry fromSlice2 = androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.fromSlice(slice);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice2);
                    return fromSlice2;
                }
                androidx.view.provider.CustomCredentialEntry fromSlice3 = androidx.view.provider.CustomCredentialEntry.INSTANCE.fromSlice(slice);
                kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice3);
                return fromSlice3;
            } catch (java.lang.Exception unused) {
                return androidx.view.provider.CustomCredentialEntry.INSTANCE.fromSlice(slice);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Api28Impl;", "", "<init>", "()V", "Landroidx/credentials/provider/CredentialEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "Landroid/app/slice/Slice;", "toSlice", "(Landroidx/credentials/provider/CredentialEntry;)Landroid/app/slice/Slice;", "slice", "fromSlice", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/CredentialEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api28Impl {
        public static final androidx.credentials.provider.CredentialEntry.Api28Impl INSTANCE = new androidx.credentials.provider.CredentialEntry.Api28Impl();

        private Api28Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.app.slice.Slice toSlice(androidx.view.provider.CredentialEntry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            if (entry instanceof androidx.view.provider.PasswordCredentialEntry) {
                return androidx.view.provider.PasswordCredentialEntry.INSTANCE.toSlice((androidx.view.provider.PasswordCredentialEntry) entry);
            }
            if (entry instanceof androidx.view.provider.PublicKeyCredentialEntry) {
                return androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.toSlice((androidx.view.provider.PublicKeyCredentialEntry) entry);
            }
            if (entry instanceof androidx.view.provider.CustomCredentialEntry) {
                return androidx.view.provider.CustomCredentialEntry.INSTANCE.toSlice((androidx.view.provider.CustomCredentialEntry) entry);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.CredentialEntry fromSlice(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            try {
                android.app.slice.SliceSpec spec = slice.getSpec();
                java.lang.String type = spec != null ? spec.getType() : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    androidx.view.provider.PasswordCredentialEntry fromSlice = androidx.view.provider.PasswordCredentialEntry.INSTANCE.fromSlice(slice);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice);
                    return fromSlice;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    androidx.view.provider.PublicKeyCredentialEntry fromSlice2 = androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.fromSlice(slice);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice2);
                    return fromSlice2;
                }
                androidx.view.provider.CustomCredentialEntry fromSlice3 = androidx.view.provider.CustomCredentialEntry.INSTANCE.fromSlice(slice);
                kotlin.jvm.internal.Intrinsics.checkNotNull(fromSlice3);
                return fromSlice3;
            } catch (java.lang.Exception unused) {
                return androidx.view.provider.CustomCredentialEntry.INSTANCE.fromSlice(slice);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010*\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010&\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0014\u0010'\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0014\u0010(\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0014\u0010)\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0014\u0010*\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u001eR\u0014\u0010,\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0014\u0010-\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u001eR\u0014\u0010.\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u0014\u0010/\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u0014\u00100\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u001eR\u0014\u00101\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u001eR\u0014\u00102\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\u001eR\u0014\u00103\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\u001eR\u0014\u00104\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u001eR\u0014\u00105\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\u001eR\u0014\u00106\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u0014\u00107\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\u001eR\u0014\u00108\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u001eR\u0014\u00109\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\u001eR\u0014\u0010:\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u001eR\u0014\u0010;\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\u001eR\u0014\u0010<\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u001eR\u0014\u0010=\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\u001eR\u0014\u0010>\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u001eR\u0014\u0010?\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\u001eR\u0014\u0010@\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\u001eR\u0014\u0010B\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u001e"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Companion;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "Landroidx/credentials/provider/CredentialEntry;", "fromCredentialEntry", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/CredentialEntry;", "Landroid/app/slice/Slice;", "slice", "fromSlice$credentials_release", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/CredentialEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "toSlice$credentials_release", "(Landroidx/credentials/provider/CredentialEntry;)Landroid/app/slice/Slice;", "", "Landroid/os/Bundle;", "bundle", "", "marshall$credentials_release", "(Ljava/util/List;Landroid/os/Bundle;)V", "", "index", "marshallCommonProperties$credentials_release", "(Landroidx/credentials/provider/CredentialEntry;Landroid/os/Bundle;I)V", "unmarshallCredentialEntries$credentials_release", "(Landroid/os/Bundle;)Ljava/util/List;", "", "TRUE_STRING", "Ljava/lang/String;", "FALSE_STRING", "REVISION_ID", com.visa.cbp.getEncExpo.warmup, "SLICE_HINT_TYPE_DISPLAY_NAME", "SLICE_HINT_TITLE", "SLICE_HINT_SUBTITLE", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_ICON", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_OPTION_ID", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_BIOMETRIC_PROMPT_DATA", "SLICE_HINT_ALLOWED_AUTHENTICATORS", "SLICE_HINT_CRYPTO_OP_ID", "EXTRA_CREDENTIAL_ENTRY_SIZE", "EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX", "EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX", "EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX", "EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX", "EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX", "EXTRA_CREDENTIAL_TITLE_PREFIX", "EXTRA_CREDENTIAL_SUBTITLE_PREFIX", "EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX", "EXTRA_CREDENTIAL_TYPE_ICON_PREFIX"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialEntry, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.CredentialEntry.Api34Impl.db_(credentialEntry);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.CredentialEntry fromSlice$credentials_release(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return androidx.credentials.provider.CredentialEntry.Api35Impl.fromSlice(slice);
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.credentials.provider.CredentialEntry.Api28Impl.fromSlice(slice);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final android.app.slice.Slice toSlice$credentials_release(androidx.view.provider.CredentialEntry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return androidx.credentials.provider.CredentialEntry.Api35Impl.toSlice(entry);
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.credentials.provider.CredentialEntry.Api28Impl.toSlice(entry);
            }
            return null;
        }

        public final void marshall$credentials_release(java.util.List<? extends androidx.view.provider.CredentialEntry> list, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putInt(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.view.provider.CredentialEntry credentialEntry = list.get(i);
                if (credentialEntry instanceof androidx.view.provider.PasswordCredentialEntry) {
                    androidx.view.provider.PasswordCredentialEntry.INSTANCE.marshall$credentials_release((androidx.view.provider.PasswordCredentialEntry) credentialEntry, bundle, i);
                } else if (credentialEntry instanceof androidx.view.provider.PublicKeyCredentialEntry) {
                    androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.marshall$credentials_release((androidx.view.provider.PublicKeyCredentialEntry) credentialEntry, bundle, i);
                } else if (credentialEntry instanceof androidx.view.provider.CustomCredentialEntry) {
                    androidx.view.provider.CustomCredentialEntry.INSTANCE.marshall$credentials_release((androidx.view.provider.CustomCredentialEntry) credentialEntry, bundle, i);
                }
            }
        }

        public final void marshallCommonProperties$credentials_release(androidx.view.provider.CredentialEntry credentialEntry, android.os.Bundle bundle, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialEntry, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getType());
            bundle.putString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getBeginGetCredentialOption().getId());
            bundle.putString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getBeginGetCredentialOption().getType());
            bundle.putBundle(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getBeginGetCredentialOption().getCandidateQueryData());
            bundle.putCharSequence(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getEntryGroupId());
            bundle.putBoolean(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX.concat(java.lang.String.valueOf(i)), credentialEntry.getIsDefaultIconPreferredAsSingleProvider());
            java.lang.CharSequence affiliatedDomain = credentialEntry.getAffiliatedDomain();
            if (affiliatedDomain != null) {
                bundle.putCharSequence(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX.concat(java.lang.String.valueOf(i)), affiliatedDomain);
            }
        }

        public final java.util.List<androidx.view.provider.CredentialEntry> unmarshallCredentialEntries$credentials_release(android.os.Bundle bundle) {
            java.lang.Object unmarshall$credentials_release;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = bundle.getInt(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, 0);
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.String string = bundle.getString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX.concat(java.lang.String.valueOf(i2)));
                if (string == null) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(string, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    unmarshall$credentials_release = androidx.view.provider.PasswordCredentialEntry.INSTANCE.unmarshall$credentials_release(bundle, i2);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(string, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    unmarshall$credentials_release = androidx.view.provider.PublicKeyCredentialEntry.INSTANCE.unmarshall$credentials_release(bundle, i2);
                } else {
                    unmarshall$credentials_release = androidx.view.provider.CustomCredentialEntry.INSTANCE.unmarshall$credentials_release(bundle, i2, string);
                }
                if (unmarshall$credentials_release == null) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList.add(unmarshall$credentials_release);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return INSTANCE.fromCredentialEntry(credentialEntry);
    }
}
