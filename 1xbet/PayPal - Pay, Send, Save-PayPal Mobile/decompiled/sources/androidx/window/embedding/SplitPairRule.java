package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001,B{\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "", "Landroidx/window/embedding/SplitPairFilter;", "filters", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "", "tag", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "finishPrimaryWithSecondary", "finishSecondaryWithPrimary", "", "clearTop", "", "minWidthDp", "minHeightDp", "minSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "maxAspectRatioInPortrait", "maxAspectRatioInLandscape", "<init>", "(Ljava/util/Set;Landroidx/window/embedding/SplitAttributes;Ljava/lang/String;Landroidx/window/embedding/SplitRule$FinishBehavior;Landroidx/window/embedding/SplitRule$FinishBehavior;ZIIILandroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/EmbeddingAspectRatio;)V", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "plus$window_release", "(Landroidx/window/embedding/SplitPairFilter;)Landroidx/window/embedding/SplitPairRule;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "getFinishPrimaryWithSecondary", "()Landroidx/window/embedding/SplitRule$FinishBehavior;", "getFinishSecondaryWithPrimary", "Z", "getClearTop", "()Z", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitPairRule extends androidx.window.embedding.SplitRule {
    private final boolean clearTop;
    private final java.util.Set<androidx.window.embedding.SplitPairFilter> filters;
    private final androidx.window.embedding.SplitRule.FinishBehavior finishPrimaryWithSecondary;
    private final androidx.window.embedding.SplitRule.FinishBehavior finishSecondaryWithPrimary;

    public final java.util.Set<androidx.window.embedding.SplitPairFilter> getFilters() {
        return this.filters;
    }

    public /* synthetic */ SplitPairRule(java.util.Set set, androidx.window.embedding.SplitAttributes splitAttributes, java.lang.String str, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior2, boolean z, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, splitAttributes, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? androidx.window.embedding.SplitRule.FinishBehavior.NEVER : finishBehavior, (i4 & 16) != 0 ? androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS : finishBehavior2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? 600 : i, (i4 & 128) != 0 ? 600 : i2, (i4 & 256) != 0 ? 600 : i3, (i4 & 512) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 1024) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2);
    }

    public final androidx.window.embedding.SplitRule.FinishBehavior getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final androidx.window.embedding.SplitRule.FinishBehavior getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(java.util.Set<androidx.window.embedding.SplitPairFilter> set, androidx.window.embedding.SplitAttributes splitAttributes, java.lang.String str, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior, androidx.window.embedding.SplitRule.FinishBehavior finishBehavior2, boolean z, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2) {
        super(str, i, i2, i3, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishBehavior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishBehavior2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio2, "");
        this.filters = set;
        this.finishPrimaryWithSecondary = finishBehavior;
        this.finishSecondaryWithPrimary = finishBehavior2;
        this.clearTop = z;
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u00104\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010:R\u0016\u00109\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010;R\u0016\u0010=\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010<"}, d2 = {"Landroidx/window/embedding/SplitPairRule$Builder;", "", "", "Landroidx/window/embedding/SplitPairFilter;", "filters", "<init>", "(Ljava/util/Set;)V", "Landroidx/window/embedding/SplitPairRule;", com.visa.cbp.DeviceInfo.valueOf, "(Landroidx/window/embedding/SplitPairRule;)V", "", "minWidthDp", "setMinWidthDp", "(I)Landroidx/window/embedding/SplitPairRule$Builder;", "minHeightDp", "setMinHeightDp", "minSmallestWidthDp", "setMinSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "aspectRatio", "setMaxAspectRatioInPortrait", "(Landroidx/window/embedding/EmbeddingAspectRatio;)Landroidx/window/embedding/SplitPairRule$Builder;", "setMaxAspectRatioInLandscape", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "finishPrimaryWithSecondary", "setFinishPrimaryWithSecondary", "(Landroidx/window/embedding/SplitRule$FinishBehavior;)Landroidx/window/embedding/SplitPairRule$Builder;", "finishSecondaryWithPrimary", "setFinishSecondaryWithPrimary", "", "clearTop", "setClearTop", "(Z)Landroidx/window/embedding/SplitPairRule$Builder;", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "setDefaultSplitAttributes", "(Landroidx/window/embedding/SplitAttributes;)Landroidx/window/embedding/SplitPairRule$Builder;", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/window/embedding/SplitPairRule$Builder;", "build", "()Landroidx/window/embedding/SplitPairRule;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "getOutputMinFrameDuration", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Landroidx/window/embedding/EmbeddingAspectRatio;", "getHighSpeedVideoSizesFor", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "Z", "Landroidx/window/embedding/SplitAttributes;", "getOutputStallDurationlomOqCM"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.window.embedding.SplitRule.FinishBehavior getOutputMinFrameDuration;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.window.embedding.SplitAttributes getOutputStallDurationlomOqCM;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.window.embedding.SplitRule.FinishBehavior getOutputFormats;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.Set<androidx.window.embedding.SplitPairFilter> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAspectRatio getInputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;
        private androidx.window.embedding.EmbeddingAspectRatio getInputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        public Builder(java.util.Set<androidx.window.embedding.SplitPairFilter> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.getHighSpeedVideoFpsRanges = set;
            this.getHighSpeedVideoFpsRangesFor = 600;
            this.getHighSpeedVideoSizes = 600;
            this.getHighResolutionOutputSizeshNQ4ISI = 600;
            this.getInputSizeshNQ4ISI = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.getInputFormats = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.getOutputFormats = androidx.window.embedding.SplitRule.FinishBehavior.NEVER;
            this.getOutputMinFrameDuration = androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS;
            this.getOutputStallDurationlomOqCM = new androidx.window.embedding.SplitAttributes.Builder().build();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.window.embedding.SplitPairRule splitPairRule) {
            this(splitPairRule.getFilters());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPairRule, "");
            setTag(splitPairRule.getTag()).setMinWidthDp(splitPairRule.getMinWidthDp()).setMinHeightDp(splitPairRule.getMinHeightDp()).setMinSmallestWidthDp(splitPairRule.getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(splitPairRule.getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(splitPairRule.getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setClearTop(splitPairRule.getClearTop()).setDefaultSplitAttributes(splitPairRule.getDefaultSplitAttributes());
        }

        public final androidx.window.embedding.SplitPairRule.Builder setMinWidthDp(int minWidthDp) {
            this.getHighSpeedVideoFpsRangesFor = minWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setMinHeightDp(int minHeightDp) {
            this.getHighSpeedVideoSizes = minHeightDp;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setMinSmallestWidthDp(int minSmallestWidthDp) {
            this.getHighResolutionOutputSizeshNQ4ISI = minSmallestWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setMaxAspectRatioInPortrait(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getInputSizeshNQ4ISI = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setMaxAspectRatioInLandscape(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getInputFormats = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setFinishPrimaryWithSecondary(androidx.window.embedding.SplitRule.FinishBehavior finishPrimaryWithSecondary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishPrimaryWithSecondary, "");
            this.getOutputFormats = finishPrimaryWithSecondary;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setFinishSecondaryWithPrimary(androidx.window.embedding.SplitRule.FinishBehavior finishSecondaryWithPrimary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishSecondaryWithPrimary, "");
            this.getOutputMinFrameDuration = finishSecondaryWithPrimary;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setClearTop(boolean clearTop) {
            this.getHighSpeedVideoSizesFor = clearTop;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setDefaultSplitAttributes(androidx.window.embedding.SplitAttributes defaultSplitAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSplitAttributes, "");
            this.getOutputStallDurationlomOqCM = defaultSplitAttributes;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule.Builder setTag(java.lang.String tag) {
            this.Camera2StreamConfigurationMap = tag;
            return this;
        }

        public final androidx.window.embedding.SplitPairRule build() {
            return new androidx.window.embedding.SplitPairRule(this.getHighSpeedVideoFpsRanges, this.getOutputStallDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getInputFormats);
        }
    }

    public final androidx.window.embedding.SplitPairRule plus$window_release(androidx.window.embedding.SplitPairFilter filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new androidx.window.embedding.SplitPairRule.Builder((java.util.Set<androidx.window.embedding.SplitPairFilter>) kotlin.collections.CollectionsKt.toSet(linkedHashSet)).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(this.finishPrimaryWithSecondary).setFinishSecondaryWithPrimary(this.finishSecondaryWithPrimary).setClearTop(this.clearTop).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitPairRule) || !super.equals(other)) {
            return false;
        }
        androidx.window.embedding.SplitPairRule splitPairRule = (androidx.window.embedding.SplitPairRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.filters, splitPairRule.filters) && kotlin.jvm.internal.Intrinsics.areEqual(this.finishPrimaryWithSecondary, splitPairRule.finishPrimaryWithSecondary) && kotlin.jvm.internal.Intrinsics.areEqual(this.finishSecondaryWithPrimary, splitPairRule.finishSecondaryWithPrimary) && this.clearTop == splitPairRule.clearTop;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.filters.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + this.finishPrimaryWithSecondary.hashCode()) * 31) + this.finishSecondaryWithPrimary.hashCode()) * 31) + java.lang.Boolean.hashCode(this.clearTop);
    }

    @Override // androidx.window.embedding.SplitRule
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitPairRule{tag=");
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
        sb.append(", clearTop=");
        sb.append(this.clearTop);
        sb.append(", finishPrimaryWithSecondary=");
        sb.append(this.finishPrimaryWithSecondary);
        sb.append(", finishSecondaryWithPrimary=");
        sb.append(this.finishSecondaryWithPrimary);
        sb.append(", filters=");
        sb.append(this.filters);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
