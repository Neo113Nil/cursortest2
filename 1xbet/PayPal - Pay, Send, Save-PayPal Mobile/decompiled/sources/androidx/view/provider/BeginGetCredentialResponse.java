package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u0001:\u0004\u0016\u0017\u0018\u0015BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse;", "", "", "Landroidx/credentials/provider/CredentialEntry;", "credentialEntries", "Landroidx/credentials/provider/Action;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Landroidx/credentials/provider/AuthenticationAction;", "authenticationActions", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/credentials/provider/RemoteEntry;)V", "Ljava/util/List;", "getCredentialEntries", "()Ljava/util/List;", "getActions", "getAuthenticationActions", "Landroidx/credentials/provider/RemoteEntry;", "getRemoteEntry", "()Landroidx/credentials/provider/RemoteEntry;", "Companion", "Builder", "Api34Impl", "Api23Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginGetCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetCredentialResponse.Companion INSTANCE = new androidx.view.provider.BeginGetCredentialResponse.Companion(null);
    private final java.util.List<androidx.view.provider.Action> actions;
    private final java.util.List<androidx.view.provider.AuthenticationAction> authenticationActions;
    private final java.util.List<androidx.view.provider.CredentialEntry> credentialEntries;
    private final androidx.view.provider.RemoteEntry remoteEntry;

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialResponse(java.util.List<? extends androidx.view.provider.CredentialEntry> list, java.util.List<androidx.view.provider.Action> list2, java.util.List<androidx.view.provider.AuthenticationAction> list3, androidx.view.provider.RemoteEntry remoteEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.credentialEntries = list;
        this.actions = list2;
        this.authenticationActions = list3;
        this.remoteEntry = remoteEntry;
    }

    public /* synthetic */ BeginGetCredentialResponse(java.util.List list, java.util.List list2, java.util.List list3, androidx.view.provider.RemoteEntry remoteEntry, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? null : remoteEntry);
    }

    public final java.util.List<androidx.view.provider.CredentialEntry> getCredentialEntries() {
        return this.credentialEntries;
    }

    public final java.util.List<androidx.view.provider.Action> getActions() {
        return this.actions;
    }

    public final java.util.List<androidx.view.provider.AuthenticationAction> getAuthenticationActions() {
        return this.authenticationActions;
    }

    public final androidx.view.provider.RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "", "<init>", "()V", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "setRemoteEntry", "(Landroidx/credentials/provider/RemoteEntry;)Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "Landroidx/credentials/provider/CredentialEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "addCredentialEntry", "(Landroidx/credentials/provider/CredentialEntry;)Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "", "entries", "setCredentialEntries", "(Ljava/util/List;)Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "Landroidx/credentials/provider/Action;", "action", "addAction", "(Landroidx/credentials/provider/Action;)Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "setActions", "Landroidx/credentials/provider/AuthenticationAction;", "authenticationAction", "addAuthenticationAction", "(Landroidx/credentials/provider/AuthenticationAction;)Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "authenticationEntries", "setAuthenticationActions", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "build", "()Landroidx/credentials/provider/BeginGetCredentialResponse;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/provider/RemoteEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private androidx.view.provider.RemoteEntry getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.util.List<androidx.view.provider.CredentialEntry> Camera2StreamConfigurationMap = new java.util.ArrayList();

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.util.List<androidx.view.provider.Action> getHighSpeedVideoSizes = new java.util.ArrayList();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.util.List<androidx.view.provider.AuthenticationAction> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder setRemoteEntry(androidx.view.provider.RemoteEntry remoteEntry) {
            this.getHighSpeedVideoFpsRangesFor = remoteEntry;
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder addCredentialEntry(androidx.view.provider.CredentialEntry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            this.Camera2StreamConfigurationMap.add(entry);
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder setCredentialEntries(java.util.List<? extends androidx.view.provider.CredentialEntry> entries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "");
            this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) entries);
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder addAction(androidx.view.provider.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            this.getHighSpeedVideoSizes.add(action);
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder setActions(java.util.List<androidx.view.provider.Action> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
            this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) actions);
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder addAuthenticationAction(androidx.view.provider.AuthenticationAction authenticationAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAction, "");
            this.getHighResolutionOutputSizeshNQ4ISI.add(authenticationAction);
            return this;
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse.Builder setAuthenticationActions(java.util.List<androidx.view.provider.AuthenticationAction> authenticationEntries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationEntries, "");
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) authenticationEntries);
            return this;
        }

        public final androidx.view.provider.BeginGetCredentialResponse build() {
            return new androidx.view.provider.BeginGetCredentialResponse(kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap), kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes), kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.BeginGetCredentialResponse.Api34Impl INSTANCE = new androidx.credentials.provider.BeginGetCredentialResponse.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoFpsRangesFor(android.os.Bundle p0, androidx.view.provider.BeginGetCredentialResponse p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            p0.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(p1));
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialResponse getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) p0.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", android.service.credentials.BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToJetpackResponse(beginGetCredentialResponse);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api23Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api23Impl {
        public static final androidx.credentials.provider.BeginGetCredentialResponse.Api23Impl INSTANCE = new androidx.credentials.provider.BeginGetCredentialResponse.Api23Impl();

        private Api23Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle p0, androidx.view.provider.BeginGetCredentialResponse p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            androidx.view.provider.CredentialEntry.INSTANCE.marshall$credentials_release(p1.getCredentialEntries(), p0);
            androidx.view.provider.Action.INSTANCE.marshall$credentials_release(p1.getActions(), p0);
            androidx.view.provider.AuthenticationAction.INSTANCE.marshall$credentials_release(p1.getAuthenticationActions(), p0);
            androidx.view.provider.RemoteEntry remoteEntry = p1.getRemoteEntry();
            if (remoteEntry != null) {
                androidx.view.provider.RemoteEntry.INSTANCE.marshall$credentials_release(remoteEntry, p0);
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialResponse getHighSpeedVideoFpsRangesFor(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.List<androidx.view.provider.CredentialEntry> unmarshallCredentialEntries$credentials_release = androidx.view.provider.CredentialEntry.INSTANCE.unmarshallCredentialEntries$credentials_release(p0);
            java.util.List<androidx.view.provider.Action> unmarshallActionList$credentials_release = androidx.view.provider.Action.INSTANCE.unmarshallActionList$credentials_release(p0);
            java.util.List<androidx.view.provider.AuthenticationAction> unmarshallAuthActionList$credentials_release = androidx.view.provider.AuthenticationAction.INSTANCE.unmarshallAuthActionList$credentials_release(p0);
            androidx.view.provider.RemoteEntry unmarshallRemoteEntry$credentials_release = androidx.view.provider.RemoteEntry.INSTANCE.unmarshallRemoteEntry$credentials_release(p0);
            if (unmarshallCredentialEntries$credentials_release.isEmpty() && unmarshallActionList$credentials_release.isEmpty() && unmarshallAuthActionList$credentials_release.isEmpty() && unmarshallRemoteEntry$credentials_release == null) {
                return null;
            }
            return new androidx.view.provider.BeginGetCredentialResponse(unmarshallCredentialEntries$credentials_release, unmarshallActionList$credentials_release, unmarshallAuthActionList$credentials_release, unmarshallRemoteEntry$credentials_release);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "response", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/provider/BeginGetCredentialResponse;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.BeginGetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.os.Bundle bundle = new android.os.Bundle();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.BeginGetCredentialResponse.Api34Impl.getHighSpeedVideoFpsRangesFor(bundle, response);
                return bundle;
            }
            androidx.credentials.provider.BeginGetCredentialResponse.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(bundle, response);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialResponse fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.BeginGetCredentialResponse.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(bundle);
            }
            return androidx.credentials.provider.BeginGetCredentialResponse.Api23Impl.getHighSpeedVideoFpsRangesFor(bundle);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginGetCredentialResponse fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
        return INSTANCE.asBundle(beginGetCredentialResponse);
    }

    public BeginGetCredentialResponse() {
        this(null, null, null, null, 15, null);
    }
}
