package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0010\u0011\u0012\u000fB#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse;", "", "", "Landroidx/credentials/provider/CreateEntry;", "createEntries", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/RemoteEntry;)V", "Ljava/util/List;", "getCreateEntries", "()Ljava/util/List;", "Landroidx/credentials/provider/RemoteEntry;", "getRemoteEntry", "()Landroidx/credentials/provider/RemoteEntry;", "Companion", "Builder", "Api34Impl", "Api23Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginCreateCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginCreateCredentialResponse.Companion INSTANCE = new androidx.view.provider.BeginCreateCredentialResponse.Companion(null);
    private final java.util.List<androidx.view.provider.CreateEntry> createEntries;
    private final androidx.view.provider.RemoteEntry remoteEntry;

    public BeginCreateCredentialResponse(java.util.List<androidx.view.provider.CreateEntry> list, androidx.view.provider.RemoteEntry remoteEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.createEntries = list;
        this.remoteEntry = remoteEntry;
    }

    public /* synthetic */ BeginCreateCredentialResponse(java.util.List list, androidx.view.provider.RemoteEntry remoteEntry, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : remoteEntry);
    }

    public final java.util.List<androidx.view.provider.CreateEntry> getCreateEntries() {
        return this.createEntries;
    }

    public final androidx.view.provider.RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "", "<init>", "()V", "", "Landroidx/credentials/provider/CreateEntry;", "createEntries", "setCreateEntries", "(Ljava/util/List;)Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "createEntry", "addCreateEntry", "(Landroidx/credentials/provider/CreateEntry;)Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "setRemoteEntry", "(Landroidx/credentials/provider/RemoteEntry;)Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "build", "()Landroidx/credentials/provider/BeginCreateCredentialResponse;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/provider/RemoteEntry;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.view.provider.RemoteEntry getHighSpeedVideoFpsRanges;
        private java.util.List<androidx.view.provider.CreateEntry> getHighSpeedVideoSizes = new java.util.ArrayList();

        public final androidx.credentials.provider.BeginCreateCredentialResponse.Builder setCreateEntries(java.util.List<androidx.view.provider.CreateEntry> createEntries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createEntries, "");
            this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) createEntries);
            return this;
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse.Builder addCreateEntry(androidx.view.provider.CreateEntry createEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createEntry, "");
            this.getHighSpeedVideoSizes.add(createEntry);
            return this;
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse.Builder setRemoteEntry(androidx.view.provider.RemoteEntry remoteEntry) {
            this.getHighSpeedVideoFpsRanges = remoteEntry;
            return this;
        }

        public final androidx.view.provider.BeginCreateCredentialResponse build() {
            return new androidx.view.provider.BeginCreateCredentialResponse(kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialResponse;)V", "getHighSpeedVideoSizes", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.BeginCreateCredentialResponse.Api34Impl INSTANCE = new androidx.credentials.provider.BeginCreateCredentialResponse.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void Camera2StreamConfigurationMap(android.os.Bundle p0, androidx.view.provider.BeginCreateCredentialResponse p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            p0.putParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToFrameworkResponse(p1));
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginCreateCredentialResponse getHighSpeedVideoSizes(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.service.credentials.BeginCreateCredentialResponse beginCreateCredentialResponse = (android.service.credentials.BeginCreateCredentialResponse) p0.getParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", android.service.credentials.BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToJetpackResponse(beginCreateCredentialResponse);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Api23Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialResponse;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api23Impl {
        public static final androidx.credentials.provider.BeginCreateCredentialResponse.Api23Impl INSTANCE = new androidx.credentials.provider.BeginCreateCredentialResponse.Api23Impl();

        private Api23Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoFpsRangesFor(android.os.Bundle p0, androidx.view.provider.BeginCreateCredentialResponse p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            androidx.view.provider.CreateEntry.INSTANCE.marshall$credentials_release(p1.getCreateEntries(), p0);
            androidx.view.provider.RemoteEntry remoteEntry = p1.getRemoteEntry();
            if (remoteEntry != null) {
                androidx.view.provider.RemoteEntry.INSTANCE.marshall$credentials_release(remoteEntry, p0);
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginCreateCredentialResponse getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.List<androidx.view.provider.CreateEntry> unmarshallCreateEntries$credentials_release = androidx.view.provider.CreateEntry.INSTANCE.unmarshallCreateEntries$credentials_release(p0);
            androidx.view.provider.RemoteEntry unmarshallRemoteEntry$credentials_release = androidx.view.provider.RemoteEntry.INSTANCE.unmarshallRemoteEntry$credentials_release(p0);
            if (unmarshallCreateEntries$credentials_release.isEmpty() && unmarshallRemoteEntry$credentials_release == null) {
                return null;
            }
            return new androidx.view.provider.BeginCreateCredentialResponse(unmarshallCreateEntries$credentials_release, unmarshallRemoteEntry$credentials_release);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "response", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/provider/BeginCreateCredentialResponse;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.BeginCreateCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.os.Bundle bundle = new android.os.Bundle();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.BeginCreateCredentialResponse.Api34Impl.Camera2StreamConfigurationMap(bundle, response);
                return bundle;
            }
            androidx.credentials.provider.BeginCreateCredentialResponse.Api23Impl.getHighSpeedVideoFpsRangesFor(bundle, response);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreateCredentialResponse fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.BeginCreateCredentialResponse.Api34Impl.getHighSpeedVideoSizes(bundle);
            }
            return androidx.credentials.provider.BeginCreateCredentialResponse.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(bundle);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginCreateCredentialResponse fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.BeginCreateCredentialResponse beginCreateCredentialResponse) {
        return INSTANCE.asBundle(beginCreateCredentialResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginCreateCredentialResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
