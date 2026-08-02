package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/provider/AuthenticationAction;", "", "", "title", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "Companion", "Builder", "Api34Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticationAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.AuthenticationAction.Companion INSTANCE = new androidx.view.provider.AuthenticationAction.Companion(null);
    private final android.app.PendingIntent pendingIntent;
    private final java.lang.CharSequence title;

    public AuthenticationAction(java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        if (charSequence.length() <= 0) {
            throw new java.lang.IllegalArgumentException("title must not be empty".toString());
        }
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final java.lang.CharSequence getTitle() {
        return this.title;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/provider/AuthenticationAction$Builder;", "", "", "title", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "Landroidx/credentials/provider/AuthenticationAction;", "build", "()Landroidx/credentials/provider/AuthenticationAction;", "getHighSpeedVideoSizes", "Ljava/lang/CharSequence;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroid/app/PendingIntent;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

        public Builder(java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
            this.getHighSpeedVideoFpsRangesFor = charSequence;
            this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
        }

        public final androidx.view.provider.AuthenticationAction build() {
            return new androidx.view.provider.AuthenticationAction(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/AuthenticationAction$Api34Impl;", "", "<init>", "()V", "Landroid/service/credentials/Action;", "p0", "Landroidx/credentials/provider/AuthenticationAction;", "cT_", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/AuthenticationAction;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.AuthenticationAction.Api34Impl INSTANCE = new androidx.credentials.provider.AuthenticationAction.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.AuthenticationAction cT_(android.service.credentials.Action p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.app.slice.Slice slice = p0.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return androidx.view.provider.AuthenticationAction.INSTANCE.fromSlice(slice);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f*\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/credentials/provider/AuthenticationAction$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/AuthenticationAction;", "authenticationAction", "Landroid/app/slice/Slice;", "toSlice", "(Landroidx/credentials/provider/AuthenticationAction;)Landroid/app/slice/Slice;", "slice", "fromSlice", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/AuthenticationAction;", "Landroid/service/credentials/Action;", "fromAction", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/AuthenticationAction;", "", "Landroid/os/Bundle;", "bundle", "", "marshall$credentials_release", "(Ljava/util/List;Landroid/os/Bundle;)V", "unmarshallAuthActionList$credentials_release", "(Landroid/os/Bundle;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.app.slice.Slice toSlice(androidx.view.provider.AuthenticationAction authenticationAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAction, "");
            java.lang.CharSequence title = authenticationAction.getTitle();
            android.app.PendingIntent pendingIntent = authenticationAction.getPendingIntent();
            android.app.slice.Slice.Builder builder = new android.app.slice.Slice.Builder(android.net.Uri.EMPTY, new android.app.slice.SliceSpec("AuthenticationAction", 0));
            builder.addAction(pendingIntent, new android.app.slice.Slice.Builder(builder).addHints(java.util.Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")).build(), null).addText(title, null, kotlin.collections.CollectionsKt.listOf("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE"));
            android.app.slice.Slice build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.AuthenticationAction fromSlice(android.app.slice.Slice slice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slice, "");
            java.util.List<android.app.slice.SliceItem> items = slice.getItems();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(items, "");
            java.lang.CharSequence charSequence = null;
            android.app.PendingIntent pendingIntent = null;
            for (android.app.slice.SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE")) {
                    charSequence = sliceItem.getText();
                }
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(charSequence);
                kotlin.jvm.internal.Intrinsics.checkNotNull(pendingIntent);
                return new androidx.view.provider.AuthenticationAction(charSequence, pendingIntent);
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.AuthenticationAction fromAction(android.service.credentials.Action authenticationAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAction, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.AuthenticationAction.Api34Impl.cT_(authenticationAction);
            }
            return null;
        }

        public final void marshall$credentials_release(java.util.List<androidx.view.provider.AuthenticationAction> list, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putInt("androidx.credentials.provider.extra.AUTH_ACTION_SIZE", list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bundle.putParcelable("androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_".concat(java.lang.String.valueOf(i)), list.get(i).getPendingIntent());
                bundle.putCharSequence("androidx.credentials.provider.extra.AUTH_ACTION_TITLE_".concat(java.lang.String.valueOf(i)), list.get(i).getTitle());
            }
        }

        public final java.util.List<androidx.view.provider.AuthenticationAction> unmarshallAuthActionList$credentials_release(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = bundle.getInt("androidx.credentials.provider.extra.AUTH_ACTION_SIZE", 0);
            for (int i2 = 0; i2 < i; i2++) {
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_".concat(java.lang.String.valueOf(i2)));
                java.lang.CharSequence charSequence = bundle.getCharSequence("androidx.credentials.provider.extra.AUTH_ACTION_TITLE_".concat(java.lang.String.valueOf(i2)));
                if (pendingIntent == null || charSequence == null) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList.add(new androidx.view.provider.AuthenticationAction(charSequence, pendingIntent));
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
        if (!(other instanceof androidx.view.provider.AuthenticationAction)) {
            return false;
        }
        androidx.view.provider.AuthenticationAction authenticationAction = (androidx.view.provider.AuthenticationAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, authenticationAction.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingIntent, authenticationAction.pendingIntent);
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.pendingIntent.hashCode();
    }

    @kotlin.jvm.JvmStatic
    public static final android.app.slice.Slice toSlice(androidx.view.provider.AuthenticationAction authenticationAction) {
        return INSTANCE.toSlice(authenticationAction);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.AuthenticationAction fromSlice(android.app.slice.Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.AuthenticationAction fromAction(android.service.credentials.Action action) {
        return INSTANCE.fromAction(action);
    }
}
