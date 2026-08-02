package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/credentials/provider/RemoteEntry;", "", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Landroid/app/PendingIntent;)V", "", "isAutoSelect", "(Landroid/app/PendingIntent;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Z", "()Z", "setAutoSelect", "(Z)V", "Companion", "Builder", "Api34Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.RemoteEntry.Companion INSTANCE = new androidx.view.provider.RemoteEntry.Companion(null);
    private boolean isAutoSelect;
    private final android.app.PendingIntent pendingIntent;

    public RemoteEntry(android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.pendingIntent = pendingIntent;
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    /* renamed from: isAutoSelect, reason: from getter */
    public final boolean getIsAutoSelect() {
        return this.isAutoSelect;
    }

    public final void setAutoSelect(boolean z) {
        this.isAutoSelect = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteEntry(android.app.PendingIntent pendingIntent, boolean z) {
        this(pendingIntent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.isAutoSelect = z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/provider/RemoteEntry$Builder;", "", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Landroid/app/PendingIntent;)V", "Landroidx/credentials/provider/RemoteEntry;", "build", "()Landroidx/credentials/provider/RemoteEntry;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/app/PendingIntent;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final android.app.PendingIntent Camera2StreamConfigurationMap;

        public Builder(android.app.PendingIntent pendingIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
            this.Camera2StreamConfigurationMap = pendingIntent;
        }

        public final androidx.view.provider.RemoteEntry build() {
            return new androidx.view.provider.RemoteEntry(this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/RemoteEntry$Api34Impl;", "", "<init>", "()V", "Landroid/service/credentials/RemoteEntry;", "p0", "Landroidx/credentials/provider/RemoteEntry;", "dy_", "(Landroid/service/credentials/RemoteEntry;)Landroidx/credentials/provider/RemoteEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.RemoteEntry.Api34Impl INSTANCE = new androidx.credentials.provider.RemoteEntry.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.RemoteEntry dy_(android.service.credentials.RemoteEntry p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.app.slice.Slice slice = p0.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return androidx.view.provider.RemoteEntry.INSTANCE.fromSlice(slice);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/credentials/provider/RemoteEntry$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "Landroid/app/slice/Slice;", "toSlice", "(Landroidx/credentials/provider/RemoteEntry;)Landroid/app/slice/Slice;", "slice", "fromSlice", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/RemoteEntry;", "Landroid/service/credentials/RemoteEntry;", "fromRemoteEntry", "(Landroid/service/credentials/RemoteEntry;)Landroidx/credentials/provider/RemoteEntry;", "Landroid/os/Bundle;", "bundle", "", "marshall$credentials_release", "(Landroidx/credentials/provider/RemoteEntry;Landroid/os/Bundle;)V", "unmarshallRemoteEntry$credentials_release", "(Landroid/os/Bundle;)Landroidx/credentials/provider/RemoteEntry;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.app.slice.Slice toSlice(androidx.view.provider.RemoteEntry remoteEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteEntry, "");
            android.app.PendingIntent pendingIntent = remoteEntry.getPendingIntent();
            android.app.slice.Slice.Builder builder = new android.app.slice.Slice.Builder(android.net.Uri.EMPTY, new android.app.slice.SliceSpec("RemoteEntry", 1));
            builder.addAction(pendingIntent, new android.app.slice.Slice.Builder(builder).addHints(java.util.Collections.singletonList("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            if (remoteEntry.getIsAutoSelect()) {
                builder.addInt(1, null, kotlin.collections.CollectionsKt.listOf("androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT"));
            }
            android.app.slice.Slice build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.RemoteEntry fromSlice(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            java.util.List<android.app.slice.SliceItem> items = slice.getItems();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(items, "");
            boolean z = false;
            android.app.PendingIntent pendingIntent = null;
            for (android.app.slice.SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT")) {
                    z = true;
                }
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(pendingIntent);
                return new androidx.view.provider.RemoteEntry(pendingIntent, z);
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteEntry, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.RemoteEntry.Api34Impl.dy_(remoteEntry);
            }
            return null;
        }

        public final void marshall$credentials_release(androidx.view.provider.RemoteEntry remoteEntry, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteEntry, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putParcelable("androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT", remoteEntry.getPendingIntent());
        }

        public final androidx.view.provider.RemoteEntry unmarshallRemoteEntry$credentials_release(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT");
            if (pendingIntent == null) {
                return null;
            }
            return new androidx.view.provider.RemoteEntry(pendingIntent);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.view.provider.RemoteEntry) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pendingIntent, ((androidx.view.provider.RemoteEntry) other).pendingIntent);
        }
        return false;
    }

    public final int hashCode() {
        return this.pendingIntent.hashCode();
    }

    @kotlin.jvm.JvmStatic
    public static final android.app.slice.Slice toSlice(androidx.view.provider.RemoteEntry remoteEntry) {
        return INSTANCE.toSlice(remoteEntry);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.RemoteEntry fromSlice(android.app.slice.Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
        return INSTANCE.fromRemoteEntry(remoteEntry);
    }
}
