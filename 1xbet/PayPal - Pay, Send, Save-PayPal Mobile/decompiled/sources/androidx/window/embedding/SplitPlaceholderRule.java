package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001.Bw\b\u0010\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\n\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "", "tag", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "Landroid/content/Intent;", "placeholderIntent", "", "isSticky", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "finishPrimaryWithPlaceholder", "", "minWidthDp", "minHeightDp", "minSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "maxAspectRatioInPortrait", "maxAspectRatioInLandscape", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "<init>", "(Ljava/lang/String;Ljava/util/Set;Landroid/content/Intent;ZLandroidx/window/embedding/SplitRule$FinishBehavior;IIILandroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/SplitAttributes;)V", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/SplitPlaceholderRule;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "Landroid/content/Intent;", "getPlaceholderIntent", "()Landroid/content/Intent;", "Z", "()Z", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "getFinishPrimaryWithPlaceholder", "()Landroidx/window/embedding/SplitRule$FinishBehavior;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitPlaceholderRule extends androidx.window.embedding.SplitRule {
    private final java.util.Set<androidx.window.embedding.ActivityFilter> filters;
    private final androidx.window.embedding.SplitRule.FinishBehavior finishPrimaryWithPlaceholder;
    private final boolean isSticky;
    private final android.content.Intent placeholderIntent;

    public final java.util.Set<androidx.window.embedding.ActivityFilter> getFilters() {
        return this.filters;
    }

    public final android.content.Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    /* renamed from: isSticky, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    public final androidx.window.embedding.SplitRule.FinishBehavior getFinishPrimaryWithPlaceholder() {
        return this.finishPrimaryWithPlaceholder;
    }

    public /* synthetic */ SplitPlaceholderRule(java.lang.String str, java.util.Set set, android.content.Intent intent, boolean z, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, androidx.window.embedding.SplitAttributes splitAttributes, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, set, intent, z, (i4 & 16) != 0 ? androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS : finishBehavior, (i4 & 32) != 0 ? 600 : i, (i4 & 64) != 0 ? 600 : i2, (i4 & 128) != 0 ? 600 : i3, (i4 & 256) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 512) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(java.lang.String str, java.util.Set<androidx.window.embedding.ActivityFilter> set, android.content.Intent intent, boolean z, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, androidx.window.embedding.SplitAttributes splitAttributes) {
        super(str, i, i2, i3, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishBehavior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        androidx.core.util.Preconditions.checkArgument(!kotlin.jvm.internal.Intrinsics.areEqual(finishBehavior, androidx.window.embedding.SplitRule.FinishBehavior.NEVER), "NEVER is not a valid configuration for SplitPlaceholderRule. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API.", new java.lang.Object[0]);
        this.filters = kotlin.collections.CollectionsKt.toSet(set);
        this.placeholderIntent = intent;
        this.isSticky = z;
        this.finishPrimaryWithPlaceholder = finishBehavior;
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010:R\u0016\u00109\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010;R\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010="}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "Landroid/content/Intent;", "placeholderIntent", "<init>", "(Ljava/util/Set;Landroid/content/Intent;)V", "Landroidx/window/embedding/SplitPlaceholderRule;", com.visa.cbp.DeviceInfo.valueOf, "(Landroidx/window/embedding/SplitPlaceholderRule;)V", "", "minWidthDp", "setMinWidthDp", "(I)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "minHeightDp", "setMinHeightDp", "minSmallestWidthDp", "setMinSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "aspectRatio", "setMaxAspectRatioInPortrait", "(Landroidx/window/embedding/EmbeddingAspectRatio;)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "setMaxAspectRatioInLandscape", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "finishPrimaryWithPlaceholder", "setFinishPrimaryWithPlaceholder", "(Landroidx/window/embedding/SplitRule$FinishBehavior;)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "", "isSticky", "setSticky", "(Z)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "setDefaultSplitAttributes", "(Landroidx/window/embedding/SplitAttributes;)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "build", "()Landroidx/window/embedding/SplitPlaceholderRule;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getInputSizeshNQ4ISI", "Landroid/content/Intent;", "Camera2StreamConfigurationMap", "getOutputSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getOutputMinFrameDuration", "Landroidx/window/embedding/EmbeddingAspectRatio;", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "Z", "Landroidx/window/embedding/SplitAttributes;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.window.embedding.SplitAttributes getOutputSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAspectRatio getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.window.embedding.SplitRule.FinishBehavior getOutputMinFrameDuration;
        private final java.util.Set<androidx.window.embedding.ActivityFilter> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;
        private int getInputFormats;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final android.content.Intent Camera2StreamConfigurationMap;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAspectRatio getOutputFormats;

        /* renamed from: getOutputSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        public Builder(java.util.Set<androidx.window.embedding.ActivityFilter> set, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            this.getHighSpeedVideoSizes = set;
            this.Camera2StreamConfigurationMap = intent;
            this.getHighResolutionOutputSizeshNQ4ISI = 600;
            this.getHighSpeedVideoFpsRangesFor = 600;
            this.getInputFormats = 600;
            this.getOutputFormats = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.getInputSizeshNQ4ISI = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.getOutputMinFrameDuration = androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS;
            this.getOutputSizes = new androidx.window.embedding.SplitAttributes.Builder().build();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule) {
            this(splitPlaceholderRule.getFilters(), splitPlaceholderRule.getPlaceholderIntent());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPlaceholderRule, "");
            setTag(splitPlaceholderRule.getTag()).setMinWidthDp(splitPlaceholderRule.getMinWidthDp()).setMinHeightDp(splitPlaceholderRule.getMinHeightDp()).setMinSmallestWidthDp(splitPlaceholderRule.getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(splitPlaceholderRule.getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(splitPlaceholderRule.getMaxAspectRatioInLandscape()).setFinishPrimaryWithPlaceholder(splitPlaceholderRule.getFinishPrimaryWithPlaceholder()).setSticky(splitPlaceholderRule.getIsSticky()).setDefaultSplitAttributes(splitPlaceholderRule.getDefaultSplitAttributes());
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setMinWidthDp(int minWidthDp) {
            this.getHighResolutionOutputSizeshNQ4ISI = minWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setMinHeightDp(int minHeightDp) {
            this.getHighSpeedVideoFpsRangesFor = minHeightDp;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setMinSmallestWidthDp(int minSmallestWidthDp) {
            this.getInputFormats = minSmallestWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setMaxAspectRatioInPortrait(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getOutputFormats = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setMaxAspectRatioInLandscape(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getInputSizeshNQ4ISI = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setFinishPrimaryWithPlaceholder(androidx.window.embedding.SplitRule.FinishBehavior finishPrimaryWithPlaceholder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishPrimaryWithPlaceholder, "");
            this.getOutputMinFrameDuration = finishPrimaryWithPlaceholder;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setSticky(boolean isSticky) {
            this.getHighSpeedVideoSizesFor = isSticky;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setDefaultSplitAttributes(androidx.window.embedding.SplitAttributes defaultSplitAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSplitAttributes, "");
            this.getOutputSizes = defaultSplitAttributes;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule.Builder setTag(java.lang.String tag) {
            this.getHighSpeedVideoFpsRanges = tag;
            return this;
        }

        public final androidx.window.embedding.SplitPlaceholderRule build() {
            return new androidx.window.embedding.SplitPlaceholderRule(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getOutputSizes);
        }
    }

    public final androidx.window.embedding.SplitPlaceholderRule plus$window_release(androidx.window.embedding.ActivityFilter filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new androidx.window.embedding.SplitPlaceholderRule.Builder(kotlin.collections.CollectionsKt.toSet(linkedHashSet), this.placeholderIntent).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setSticky(this.isSticky).setFinishPrimaryWithPlaceholder(this.finishPrimaryWithPlaceholder).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitPlaceholderRule) || !super.equals(other)) {
            return false;
        }
        androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule = (androidx.window.embedding.SplitPlaceholderRule) other;
        return this.placeholderIntent.filterEquals(splitPlaceholderRule.placeholderIntent) && this.isSticky == splitPlaceholderRule.isSticky && kotlin.jvm.internal.Intrinsics.areEqual(this.finishPrimaryWithPlaceholder, splitPlaceholderRule.finishPrimaryWithPlaceholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.filters, splitPlaceholderRule.filters);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final int hashCode() {
        int hashCode = super.hashCode();
        int filterHashCode = this.placeholderIntent.filterHashCode();
        return (((((((hashCode * 31) + filterHashCode) * 31) + java.lang.Boolean.hashCode(this.isSticky)) * 31) + this.finishPrimaryWithPlaceholder.hashCode()) * 31) + this.filters.hashCode();
    }

    @Override // androidx.window.embedding.SplitRule
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitPlaceholderRule{tag=");
        sb.append(getTag());
        sb.append(", defaultSplitAttributes=");
        sb.append(getDefaultSplitAttributes());
        sb.append(", minWidthDp=");
        sb.append(getMinWidthDp());
        sb.append(", minHeightDp=");
        sb.append(getMinHeightDp());
        sb.append(", minSmallestWidthDp=");
        sb.append(getMinSmallestWidthDp());
        sb.append(", maxAspectRatioInPortrait=");
        sb.append(getMaxAspectRatioInPortrait());
        sb.append(", maxAspectRatioInLandscape=");
        sb.append(getMaxAspectRatioInLandscape());
        sb.append(", placeholderIntent=");
        sb.append(this.placeholderIntent);
        sb.append(", isSticky=");
        sb.append(this.isSticky);
        sb.append(", finishPrimaryWithPlaceholder=");
        sb.append(this.finishPrimaryWithPlaceholder);
        sb.append(", filters=");
        sb.append(this.filters);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
