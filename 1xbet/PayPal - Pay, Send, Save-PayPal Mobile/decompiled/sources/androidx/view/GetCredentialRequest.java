package androidx.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aBA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0016"}, d2 = {"Landroidx/credentials/GetCredentialRequest;", "", "", "Landroidx/credentials/CredentialOption;", "credentialOptions", "", "origin", "", "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "Ljava/util/List;", "getCredentialOptions", "()Ljava/util/List;", "Ljava/lang/String;", "getOrigin", "()Ljava/lang/String;", "Z", "getPreferIdentityDocUi", "()Z", "Landroid/content/ComponentName;", "getPreferUiBrandingComponentName", "()Landroid/content/ComponentName;", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCredentialRequest {
    public static final java.lang.String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.GetCredentialRequest.Companion INSTANCE = new androidx.view.GetCredentialRequest.Companion(null);
    private final java.util.List<androidx.view.CredentialOption> credentialOptions;
    private final java.lang.String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;
    private final android.content.ComponentName preferUiBrandingComponentName;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, java.lang.String str, boolean z, android.content.ComponentName componentName, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z2;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("credentialOptions should not be empty".toString());
        }
        if (list.size() > 1) {
            java.util.List<? extends androidx.view.CredentialOption> list2 = list;
            int i = 0;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((androidx.view.CredentialOption) it.next()) instanceof androidx.view.GetDigitalCredentialOption) && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 0 && i != this.credentialOptions.size()) {
                throw new java.lang.IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            java.util.Iterator<androidx.view.CredentialOption> it2 = this.credentialOptions.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof androidx.view.GetRestoreCredentialOption) {
                    throw new java.lang.IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }

    public /* synthetic */ GetCredentialRequest(java.util.List list, java.lang.String str, boolean z, android.content.ComponentName componentName, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }

    public final java.util.List<androidx.view.CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    public final android.content.ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    /* renamed from: preferImmediatelyAvailableCredentials, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Builder;", "", "<init>", "()V", "Landroidx/credentials/CredentialOption;", "credentialOption", "addCredentialOption", "(Landroidx/credentials/CredentialOption;)Landroidx/credentials/GetCredentialRequest$Builder;", "", "credentialOptions", "setCredentialOptions", "(Ljava/util/List;)Landroidx/credentials/GetCredentialRequest$Builder;", "", "origin", "setOrigin", "(Ljava/lang/String;)Landroidx/credentials/GetCredentialRequest$Builder;", "", "preferImmediatelyAvailableCredentials", "setPreferImmediatelyAvailableCredentials", "(Z)Landroidx/credentials/GetCredentialRequest$Builder;", "Landroid/content/ComponentName;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "setPreferUiBrandingComponentName", "(Landroid/content/ComponentName;)Landroidx/credentials/GetCredentialRequest$Builder;", "preferIdentityDocUi", "setPreferIdentityDocUi", "Landroidx/credentials/GetCredentialRequest;", "build", "()Landroidx/credentials/GetCredentialRequest;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Landroid/content/ComponentName;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.util.List<androidx.view.CredentialOption> Camera2StreamConfigurationMap = new java.util.ArrayList();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private android.content.ComponentName getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoSizes;

        public final androidx.credentials.GetCredentialRequest.Builder addCredentialOption(androidx.view.CredentialOption credentialOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialOption, "");
            this.Camera2StreamConfigurationMap.add(credentialOption);
            return this;
        }

        public final androidx.credentials.GetCredentialRequest.Builder setCredentialOptions(java.util.List<? extends androidx.view.CredentialOption> credentialOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialOptions, "");
            this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) credentialOptions);
            return this;
        }

        public final androidx.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
            this.getHighSpeedVideoFpsRangesFor = origin;
            return this;
        }

        public final androidx.credentials.GetCredentialRequest.Builder setPreferImmediatelyAvailableCredentials(boolean preferImmediatelyAvailableCredentials) {
            this.getHighSpeedVideoSizes = preferImmediatelyAvailableCredentials;
            return this;
        }

        public final androidx.credentials.GetCredentialRequest.Builder setPreferUiBrandingComponentName(android.content.ComponentName component) {
            this.getHighSpeedVideoFpsRanges = component;
            return this;
        }

        public final androidx.credentials.GetCredentialRequest.Builder setPreferIdentityDocUi(boolean preferIdentityDocUi) {
            this.getHighResolutionOutputSizeshNQ4ISI = preferIdentityDocUi;
            return this;
        }

        public final androidx.view.GetCredentialRequest build() {
            return new androidx.view.GetCredentialRequest(kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Companion;", "", "<init>", "()V", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/os/Bundle;", "getRequestMetadataBundle", "(Landroidx/credentials/GetCredentialRequest;)Landroid/os/Bundle;", "Landroid/credentials/GetCredentialRequest;", "createFrom", "(Landroid/credentials/GetCredentialRequest;)Landroidx/credentials/GetCredentialRequest;", "", "Landroidx/credentials/CredentialOption;", "credentialOptions", "", "origin", "metadata", "(Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/GetCredentialRequest;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle getRequestMetadataBundle(androidx.view.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.getPreferUiBrandingComponentName());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetCredentialRequest createFrom(android.credentials.GetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.List<android.credentials.CredentialOption> credentialOptions = request.getCredentialOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credentialOptions, "");
            java.util.List<android.credentials.CredentialOption> list = credentialOptions;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (android.credentials.CredentialOption credentialOption : list) {
                androidx.view.CredentialOption.Companion companion = androidx.view.CredentialOption.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(credentialOption);
                arrayList.add(companion.createFrom(credentialOption));
            }
            java.lang.String origin = request.getOrigin();
            android.os.Bundle data = request.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
            return createFrom(arrayList, origin, data);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetCredentialRequest createFrom(java.util.List<? extends androidx.view.CredentialOption> credentialOptions, java.lang.String origin, android.os.Bundle metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            try {
                boolean z = metadata.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI");
                androidx.credentials.GetCredentialRequest.Builder preferImmediatelyAvailableCredentials = new androidx.credentials.GetCredentialRequest.Builder().setCredentialOptions(credentialOptions).setPreferIdentityDocUi(z).setPreferUiBrandingComponentName((android.content.ComponentName) metadata.getParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME")).setPreferImmediatelyAvailableCredentials(metadata.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (origin != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(origin);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (java.lang.Exception unused) {
                throw new androidx.view.internal.FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getRequestMetadataBundle(androidx.view.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.getRequestMetadataBundle(getCredentialRequest);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.GetCredentialRequest createFrom(java.util.List<? extends androidx.view.CredentialOption> list, java.lang.String str, android.os.Bundle bundle) {
        return INSTANCE.createFrom(list, str, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.createFrom(getCredentialRequest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, java.lang.String str, boolean z, android.content.ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, java.lang.String str, boolean z) {
        this(list, str, z, null, false, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, java.lang.String str) {
        this(list, str, false, null, false, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list) {
        this(list, null, false, null, false, 30, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}
