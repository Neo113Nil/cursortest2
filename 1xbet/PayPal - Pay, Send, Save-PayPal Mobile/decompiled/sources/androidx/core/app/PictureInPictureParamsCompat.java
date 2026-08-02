package androidx.core.app;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0004)*+,Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010'"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat;", "", "", "isEnabled", "Landroid/util/Rational;", "aspectRatio", "", "Landroid/app/RemoteAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Landroid/graphics/Rect;", "sourceRectHint", "isSeamlessResizeEnabled", "closeAction", "expandedAspectRatio", "", "title", "subTitle", "<init>", "(ZLandroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZLandroid/app/RemoteAction;Landroid/util/Rational;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/app/PictureInPictureParams;", "toPictureInPictureParams", "()Landroid/app/PictureInPictureParams;", "Z", "()Z", "Landroid/util/Rational;", "getAspectRatio", "()Landroid/util/Rational;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Landroid/graphics/Rect;", "getSourceRectHint", "()Landroid/graphics/Rect;", "Landroid/app/RemoteAction;", "getCloseAction", "()Landroid/app/RemoteAction;", "getExpandedAspectRatio", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getSubTitle", "Builder", "Api26Impl", "Api31Impl", "Api33Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PictureInPictureParamsCompat {
    private final java.util.List<android.app.RemoteAction> actions;
    private final android.util.Rational aspectRatio;
    private final android.app.RemoteAction closeAction;
    private final android.util.Rational expandedAspectRatio;
    private final boolean isEnabled;
    private final boolean isSeamlessResizeEnabled;
    private final android.graphics.Rect sourceRectHint;
    private final java.lang.CharSequence subTitle;
    private final java.lang.CharSequence title;

    public PictureInPictureParamsCompat(boolean z, android.util.Rational rational, java.util.List<android.app.RemoteAction> list, android.graphics.Rect rect, boolean z2, android.app.RemoteAction remoteAction, android.util.Rational rational2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.isEnabled = z;
        this.aspectRatio = rational;
        this.actions = list;
        this.sourceRectHint = rect;
        this.isSeamlessResizeEnabled = z2;
        this.closeAction = remoteAction;
        this.expandedAspectRatio = rational2;
        this.title = charSequence;
        this.subTitle = charSequence2;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final android.util.Rational getAspectRatio() {
        return this.aspectRatio;
    }

    public /* synthetic */ PictureInPictureParamsCompat(boolean z, android.util.Rational rational, java.util.List list, android.graphics.Rect rect, boolean z2, android.app.RemoteAction remoteAction, android.util.Rational rational2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : rational, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : rect, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : remoteAction, (i & 64) != 0 ? null : rational2, (i & 128) != 0 ? null : charSequence, (i & 256) == 0 ? charSequence2 : null);
    }

    public final java.util.List<android.app.RemoteAction> getActions() {
        return this.actions;
    }

    public final android.graphics.Rect getSourceRectHint() {
        return this.sourceRectHint;
    }

    /* renamed from: isSeamlessResizeEnabled, reason: from getter */
    public final boolean getIsSeamlessResizeEnabled() {
        return this.isSeamlessResizeEnabled;
    }

    public final android.app.RemoteAction getCloseAction() {
        return this.closeAction;
    }

    public final android.util.Rational getExpandedAspectRatio() {
        return this.expandedAspectRatio;
    }

    public final java.lang.CharSequence getTitle() {
        return this.title;
    }

    public final java.lang.CharSequence getSubTitle() {
        return this.subTitle;
    }

    public final android.app.PictureInPictureParams toPictureInPictureParams() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.app.PictureInPictureParamsCompat.Api33Impl.getHighSpeedVideoFpsRanges(this.aspectRatio, this.actions, this.sourceRectHint, this.isEnabled, this.isSeamlessResizeEnabled, this.expandedAspectRatio, this.closeAction, this.title, this.subTitle);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.app.PictureInPictureParamsCompat.Api31Impl.getHighSpeedVideoSizes(this.aspectRatio, this.actions, this.sourceRectHint, this.isEnabled, this.isSeamlessResizeEnabled);
        }
        return androidx.core.app.PictureInPictureParamsCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.aspectRatio, this.actions, this.sourceRectHint);
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\u001fJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010&R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00100R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010)R\u0018\u00104\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00102\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00103"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "", "<init>", "()V", "", "enabled", "setEnabled", "(Z)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "Landroid/util/Rational;", "aspectRatio", "setAspectRatio", "(Landroid/util/Rational;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "", "Landroid/app/RemoteAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "setActions", "(Ljava/util/List;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "Landroid/graphics/Rect;", "sourceRectHint", "setSourceRectHint", "(Landroid/graphics/Rect;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "seamlessResizeEnabled", "setSeamlessResizeEnabled", "closeAction", "setCloseAction", "(Landroid/app/RemoteAction;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "expandedAspectRatio", "setExpandedAspectRatio", "", "title", "setTitle", "(Ljava/lang/CharSequence;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "subTitle", "setSubTitle", "Landroidx/core/app/PictureInPictureParamsCompat;", "build", "()Landroidx/core/app/PictureInPictureParamsCompat;", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/util/Rational;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getInputSizeshNQ4ISI", "Landroid/graphics/Rect;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Landroid/app/RemoteAction;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Ljava/lang/CharSequence;", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private android.app.RemoteAction getOutputMinFrameDuration;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private android.util.Rational getOutputFormats;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private android.util.Rational getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.CharSequence getInputFormats;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private android.graphics.Rect getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private java.lang.CharSequence getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap = true;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.util.List<android.app.RemoteAction> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setEnabled(boolean enabled) {
            this.Camera2StreamConfigurationMap = enabled;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setAspectRatio(android.util.Rational aspectRatio) {
            this.getHighResolutionOutputSizeshNQ4ISI = aspectRatio;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setActions(java.util.List<android.app.RemoteAction> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
            this.getHighSpeedVideoFpsRangesFor = actions;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setSourceRectHint(android.graphics.Rect sourceRectHint) {
            this.getHighSpeedVideoFpsRanges = sourceRectHint;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setSeamlessResizeEnabled(boolean seamlessResizeEnabled) {
            this.getHighSpeedVideoSizes = seamlessResizeEnabled;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setCloseAction(android.app.RemoteAction closeAction) {
            this.getOutputMinFrameDuration = closeAction;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setExpandedAspectRatio(android.util.Rational expandedAspectRatio) {
            this.getOutputFormats = expandedAspectRatio;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setTitle(java.lang.CharSequence title) {
            this.getInputFormats = title;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat.Builder setSubTitle(java.lang.CharSequence subTitle) {
            this.getHighSpeedVideoSizesFor = subTitle;
            return this;
        }

        public final androidx.core.app.PictureInPictureParamsCompat build() {
            return new androidx.core.app.PictureInPictureParamsCompat(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api26Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "Landroid/app/PictureInPictureParams;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Api26Impl {
        public static final androidx.core.app.PictureInPictureParamsCompat.Api26Impl INSTANCE = new androidx.core.app.PictureInPictureParamsCompat.Api26Impl();

        private Api26Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.app.PictureInPictureParams getHighResolutionOutputSizeshNQ4ISI(android.util.Rational p0, java.util.List<android.app.RemoteAction> p1, android.graphics.Rect p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            android.app.PictureInPictureParams build = new android.app.PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api31Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "", "p3", "p4", "Landroid/app/PictureInPictureParams;", "getHighSpeedVideoSizes", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZZ)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Api31Impl {
        public static final androidx.core.app.PictureInPictureParamsCompat.Api31Impl INSTANCE = new androidx.core.app.PictureInPictureParamsCompat.Api31Impl();

        private Api31Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.app.PictureInPictureParams getHighSpeedVideoSizes(android.util.Rational p0, java.util.List<android.app.RemoteAction> p1, android.graphics.Rect p2, boolean p3, boolean p4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            android.app.PictureInPictureParams build = new android.app.PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).setAutoEnterEnabled(p3).setSeamlessResizeEnabled(p4).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api33Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "", "p3", "p4", "p5", "p6", "", "p7", "p8", "Landroid/app/PictureInPictureParams;", "getHighSpeedVideoFpsRanges", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZZLandroid/util/Rational;Landroid/app/RemoteAction;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Api33Impl {
        public static final androidx.core.app.PictureInPictureParamsCompat.Api33Impl INSTANCE = new androidx.core.app.PictureInPictureParamsCompat.Api33Impl();

        private Api33Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.app.PictureInPictureParams getHighSpeedVideoFpsRanges(android.util.Rational p0, java.util.List<android.app.RemoteAction> p1, android.graphics.Rect p2, boolean p3, boolean p4, android.util.Rational p5, android.app.RemoteAction p6, java.lang.CharSequence p7, java.lang.CharSequence p8) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            android.app.PictureInPictureParams build = new android.app.PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).setAutoEnterEnabled(p3).setSeamlessResizeEnabled(p4).setExpandedAspectRatio(p5).setCloseAction(p6).setTitle(p7).setSubtitle(p8).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }
    }

    public PictureInPictureParamsCompat() {
        this(false, null, null, null, false, null, null, null, null, 511, null);
    }
}
