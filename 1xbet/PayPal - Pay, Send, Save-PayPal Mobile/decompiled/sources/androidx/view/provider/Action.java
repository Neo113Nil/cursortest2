package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/Action;", "", "", "title", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "subtitle", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "getSubtitle", "Companion", "Builder", "Api34Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Action {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.Action.Companion INSTANCE = new androidx.view.provider.Action.Companion(null);
    private final android.app.PendingIntent pendingIntent;
    private final java.lang.CharSequence subtitle;
    private final java.lang.CharSequence title;

    public Action(java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence2;
        if (charSequence.length() <= 0) {
            throw new java.lang.IllegalArgumentException("title must not be empty".toString());
        }
    }

    public /* synthetic */ Action(java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, java.lang.CharSequence charSequence2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2);
    }

    public final java.lang.CharSequence getTitle() {
        return this.title;
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final java.lang.CharSequence getSubtitle() {
        return this.subtitle;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f"}, d2 = {"Landroidx/credentials/provider/Action$Builder;", "", "", "title", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "subtitle", "setSubtitle", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/Action$Builder;", "Landroidx/credentials/provider/Action;", "build", "()Landroidx/credentials/provider/Action;", "getHighSpeedVideoFpsRanges", "Ljava/lang/CharSequence;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroid/app/PendingIntent;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private java.lang.CharSequence Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final android.app.PendingIntent getHighSpeedVideoFpsRangesFor;

        public Builder(java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
            this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
            this.getHighSpeedVideoFpsRangesFor = pendingIntent;
        }

        public final androidx.credentials.provider.Action.Builder setSubtitle(java.lang.CharSequence subtitle) {
            this.Camera2StreamConfigurationMap = subtitle;
            return this;
        }

        public final androidx.view.provider.Action build() {
            return new androidx.view.provider.Action(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/Action$Api34Impl;", "", "<init>", "()V", "Landroid/service/credentials/Action;", "p0", "Landroidx/credentials/provider/Action;", "cS_", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/Action;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.Action.Api34Impl INSTANCE = new androidx.credentials.provider.Action.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.Action cS_(android.service.credentials.Action p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.app.slice.Slice slice = p0.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return androidx.view.provider.Action.INSTANCE.fromSlice(slice);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f*\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/credentials/provider/Action$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/Action;", "action", "Landroid/app/slice/Slice;", "toSlice", "(Landroidx/credentials/provider/Action;)Landroid/app/slice/Slice;", "slice", "fromSlice", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/Action;", "Landroid/service/credentials/Action;", "fromAction", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/Action;", "", "Landroid/os/Bundle;", "bundle", "", "marshall$credentials_release", "(Ljava/util/List;Landroid/os/Bundle;)V", "unmarshallActionList$credentials_release", "(Landroid/os/Bundle;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.app.slice.Slice toSlice(androidx.view.provider.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            java.lang.CharSequence title = action.getTitle();
            java.lang.CharSequence subtitle = action.getSubtitle();
            android.app.PendingIntent pendingIntent = action.getPendingIntent();
            android.app.slice.Slice.Builder addText = new android.app.slice.Slice.Builder(android.net.Uri.EMPTY, new android.app.slice.SliceSpec("Action", 0)).addText(title, null, kotlin.collections.CollectionsKt.listOf("androidx.credentials.provider.action.HINT_ACTION_TITLE")).addText(subtitle, null, kotlin.collections.CollectionsKt.listOf("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
            addText.addAction(pendingIntent, new android.app.slice.Slice.Builder(addText).addHints(java.util.Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build(), null);
            android.app.slice.Slice build = addText.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.Action fromSlice(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            java.util.List<android.app.slice.SliceItem> items = slice.getItems();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(items, "");
            java.lang.CharSequence charSequence = "";
            android.app.PendingIntent pendingIntent = null;
            java.lang.CharSequence charSequence2 = null;
            for (android.app.slice.SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.action.HINT_ACTION_TITLE")) {
                    charSequence = sliceItem.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charSequence, "");
                } else if (sliceItem.hasHint("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT")) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")) {
                    pendingIntent = sliceItem.getAction();
                }
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(pendingIntent);
                return new androidx.view.provider.Action(charSequence, pendingIntent, charSequence2);
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.Action fromAction(android.service.credentials.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.Action.Api34Impl.cS_(action);
            }
            return null;
        }

        public final void marshall$credentials_release(java.util.List<androidx.view.provider.Action> list, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putInt("androidx.credentials.provider.extra.ACTION_SIZE", list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bundle.putParcelable("androidx.credentials.provider.extra.ACTION_PENDING_INTENT_".concat(java.lang.String.valueOf(i)), list.get(i).getPendingIntent());
                bundle.putCharSequence("androidx.credentials.provider.extra.ACTION_TITLE_".concat(java.lang.String.valueOf(i)), list.get(i).getTitle());
                bundle.putCharSequence("androidx.credentials.provider.extra.ACTION_SUBTITLE_".concat(java.lang.String.valueOf(i)), list.get(i).getSubtitle());
            }
        }

        public final java.util.List<androidx.view.provider.Action> unmarshallActionList$credentials_release(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = bundle.getInt("androidx.credentials.provider.extra.ACTION_SIZE", 0);
            for (int i2 = 0; i2 < i; i2++) {
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("androidx.credentials.provider.extra.ACTION_PENDING_INTENT_".concat(java.lang.String.valueOf(i2)));
                java.lang.CharSequence charSequence = bundle.getCharSequence("androidx.credentials.provider.extra.ACTION_TITLE_".concat(java.lang.String.valueOf(i2)));
                java.lang.CharSequence charSequence2 = bundle.getCharSequence("androidx.credentials.provider.extra.ACTION_SUBTITLE_".concat(java.lang.String.valueOf(i2)));
                if (pendingIntent == null || charSequence == null) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList.add(new androidx.view.provider.Action(charSequence, pendingIntent, charSequence2));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.Action)) {
            return false;
        }
        androidx.view.provider.Action action = (androidx.view.provider.Action) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, action.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingIntent, action.pendingIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, action.subtitle);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.pendingIntent.hashCode();
        java.lang.CharSequence charSequence = this.subtitle;
        return (((hashCode * 31) + hashCode2) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    @kotlin.jvm.JvmStatic
    public static final android.app.slice.Slice toSlice(androidx.view.provider.Action action) {
        return INSTANCE.toSlice(action);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.Action fromSlice(android.app.slice.Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.Action fromAction(android.service.credentials.Action action) {
        return INSTANCE.fromAction(action);
    }
}
