package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b&\u0018\u0000  2\u00020\u0001:\u0002! BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\t\u0010\u0019R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/credentials/CredentialOption;", "", "", "type", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getRequestData", "()Landroid/os/Bundle;", "getCandidateQueryData", "Z", "()Z", "Ljava/util/Set;", "getAllowedProviders", "()Ljava/util/Set;", com.visa.cbp.getEncExpo.warmup, "getTypePriorityHint", "()I", "Companion", "PriorityHints"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CredentialOption {
    public static final java.lang.String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";
    public static final java.lang.String BUNDLE_KEY_TYPE_PRIORITY_VALUE = "androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.CredentialOption.Companion INSTANCE = new androidx.view.CredentialOption.Companion(null);
    public static final int PRIORITY_DEFAULT = 2000;
    public static final int PRIORITY_OIDC_OR_SIMILAR = 500;
    public static final int PRIORITY_PASSKEY_OR_SIMILAR = 100;
    public static final int PRIORITY_PASSWORD_OR_SIMILAR = 1000;
    private final java.util.Set<android.content.ComponentName> allowedProviders;
    private final android.os.Bundle candidateQueryData;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;
    private final android.os.Bundle requestData;
    private final java.lang.String type;
    private final int typePriorityHint;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/credentials/CredentialOption$PriorityHints;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface PriorityHints {
    }

    public CredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set<android.content.ComponentName> set, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.type = str;
        this.requestData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.allowedProviders = set;
        this.typePriorityHint = i;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
        bundle2.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final android.os.Bundle getRequestData() {
        return this.requestData;
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

    public final java.util.Set<android.content.ComponentName> getAllowedProviders() {
        return this.allowedProviders;
    }

    public final int getTypePriorityHint() {
        return this.typePriorityHint;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e"}, d2 = {"Landroidx/credentials/CredentialOption$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "extractAutoSelectValue$credentials_release", "(Landroid/os/Bundle;)Z", "Landroid/credentials/CredentialOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "Landroidx/credentials/CredentialOption;", "createFrom", "(Landroid/credentials/CredentialOption;)Landroidx/credentials/CredentialOption;", "", "type", "requestData", "candidateQueryData", "requireSystemProvider", "", "Landroid/content/ComponentName;", "allowedProviders", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLjava/util/Set;)Landroidx/credentials/CredentialOption;", "", "PRIORITY_PASSKEY_OR_SIMILAR", com.visa.cbp.getEncExpo.warmup, "PRIORITY_OIDC_OR_SIMILAR", "PRIORITY_PASSWORD_OR_SIMILAR", "PRIORITY_DEFAULT", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "Ljava/lang/String;", "BUNDLE_KEY_TYPE_PRIORITY_VALUE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean extractAutoSelectValue$credentials_release(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CredentialOption createFrom(android.credentials.CredentialOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            java.lang.String type = option.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            android.os.Bundle credentialRetrievalData = option.getCredentialRetrievalData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credentialRetrievalData, "");
            android.os.Bundle candidateQueryData = option.getCandidateQueryData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(candidateQueryData, "");
            boolean isSystemProviderRequired = option.isSystemProviderRequired();
            java.util.Set<android.content.ComponentName> allowedProviders = option.getAllowedProviders();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedProviders, "");
            return createFrom(type, credentialRetrievalData, candidateQueryData, isSystemProviderRequired, allowedProviders);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CredentialOption createFrom(java.lang.String type, android.os.Bundle requestData, android.os.Bundle candidateQueryData, boolean requireSystemProvider, java.util.Set<android.content.ComponentName> allowedProviders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedProviders, "");
            try {
                int hashCode = type.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && type.equals(androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            java.lang.String string = requestData.getString(androidx.view.PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                            if (string != null && string.hashCode() == -613058807 && string.equals(androidx.view.GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION)) {
                                return androidx.view.GetPublicKeyCredentialOption.INSTANCE.createFrom$credentials_release(requestData, allowedProviders, candidateQueryData);
                            }
                            throw new androidx.view.internal.FrameworkClassParsingException();
                        }
                    } else if (type.equals(androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return androidx.view.GetPasswordOption.INSTANCE.createFrom$credentials_release(requestData, allowedProviders, candidateQueryData);
                    }
                } else if (type.equals(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return androidx.view.GetDigitalCredentialOption.INSTANCE.createFrom$credentials_release(requestData, candidateQueryData, requireSystemProvider, allowedProviders);
                }
                throw new androidx.view.internal.FrameworkClassParsingException();
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.GetCustomCredentialOption(requestData, type, candidateQueryData, requireSystemProvider, requestData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, requestData.getInt(androidx.view.CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 2000));
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CredentialOption createFrom(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, java.util.Set<android.content.ComponentName> set) {
        return INSTANCE.createFrom(str, bundle, bundle2, z, set);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CredentialOption createFrom(android.credentials.CredentialOption credentialOption) {
        return INSTANCE.createFrom(credentialOption);
    }
}
