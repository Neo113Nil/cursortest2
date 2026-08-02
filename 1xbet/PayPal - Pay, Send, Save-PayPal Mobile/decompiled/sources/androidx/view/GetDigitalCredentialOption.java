package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/GetDigitalCredentialOption;", "Landroidx/credentials/CredentialOption;", "", "requestJson", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDigitalCredentialOption extends androidx.view.CredentialOption {
    public static final java.lang.String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.GetDigitalCredentialOption.Companion INSTANCE = new androidx.view.GetDigitalCredentialOption.Companion(null);
    private final java.lang.String requestJson;

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set<android.content.ComponentName> set, int i) {
        super(androidx.view.DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, z, z2, set, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.requestJson = str;
        if (!androidx.view.internal.RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new java.lang.IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(java.lang.String str) {
        this(str, INSTANCE.toBundle$credentials_release(str), new android.os.Bundle(), false, false, kotlin.collections.SetsKt.emptySet(), 100);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/GetDigitalCredentialOption$Companion;", "", "<init>", "()V", "", "requestJson", "Landroid/os/Bundle;", "toBundle$credentials_release", "(Ljava/lang/String;)Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "requireSystemProvider", "", "Landroid/content/ComponentName;", "allowedProviders", "Landroidx/credentials/GetDigitalCredentialOption;", "createFrom$credentials_release", "(Landroid/os/Bundle;Landroid/os/Bundle;ZLjava/util/Set;)Landroidx/credentials/GetDigitalCredentialOption;", "BUNDLE_KEY_REQUEST_JSON", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle toBundle$credentials_release(java.lang.String requestJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJson, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetDigitalCredentialOption createFrom$credentials_release(android.os.Bundle requestData, android.os.Bundle candidateQueryData, boolean requireSystemProvider, java.util.Set<android.content.ComponentName> allowedProviders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedProviders, "");
            try {
                java.lang.String string = requestData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new androidx.view.GetDigitalCredentialOption(string, requestData, candidateQueryData, requireSystemProvider, requestData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, requestData.getInt(androidx.view.CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100));
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
