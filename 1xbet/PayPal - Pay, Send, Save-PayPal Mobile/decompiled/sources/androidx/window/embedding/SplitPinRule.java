package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001bBW\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a"}, d2 = {"Landroidx/window/embedding/SplitPinRule;", "Landroidx/window/embedding/SplitRule;", "", "tag", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "", "isSticky", "", "minWidthDp", "minHeightDp", "minSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "maxAspectRatioInPortrait", "maxAspectRatioInLandscape", "<init>", "(Ljava/lang/String;Landroidx/window/embedding/SplitAttributes;ZIIILandroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/EmbeddingAspectRatio;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "()Z", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitPinRule extends androidx.window.embedding.SplitRule {
    private final boolean isSticky;

    /* renamed from: isSticky, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    public /* synthetic */ SplitPinRule(java.lang.String str, androidx.window.embedding.SplitAttributes splitAttributes, boolean z, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, splitAttributes, z, (i4 & 8) != 0 ? 600 : i, (i4 & 16) != 0 ? 600 : i2, (i4 & 32) != 0 ? 600 : i3, (i4 & 64) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 128) != 0 ? androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPinRule(java.lang.String str, androidx.window.embedding.SplitAttributes splitAttributes, boolean z, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2) {
        super(str, i, i2, i3, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio2, "");
        this.isSticky = z;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010,R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010."}, d2 = {"Landroidx/window/embedding/SplitPinRule$Builder;", "", "<init>", "()V", "", "minWidthDp", "setMinWidthDp", "(I)Landroidx/window/embedding/SplitPinRule$Builder;", "minHeightDp", "setMinHeightDp", "minSmallestWidthDp", "setMinSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "aspectRatio", "setMaxAspectRatioInPortrait", "(Landroidx/window/embedding/EmbeddingAspectRatio;)Landroidx/window/embedding/SplitPinRule$Builder;", "setMaxAspectRatioInLandscape", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "setDefaultSplitAttributes", "(Landroidx/window/embedding/SplitAttributes;)Landroidx/window/embedding/SplitPinRule$Builder;", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/window/embedding/SplitPinRule$Builder;", "", "isSticky", "setSticky", "(Z)Landroidx/window/embedding/SplitPinRule$Builder;", "Landroidx/window/embedding/SplitPinRule;", "build", "()Landroidx/window/embedding/SplitPinRule;", "getOutputFormats", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/embedding/EmbeddingAspectRatio;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Landroidx/window/embedding/SplitAttributes;", "getHighSpeedVideoSizesFor", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap = 600;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor = 600;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI = 600;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAspectRatio getHighSpeedVideoSizes = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.window.embedding.EmbeddingAspectRatio getInputSizeshNQ4ISI = androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.window.embedding.SplitAttributes getHighSpeedVideoSizesFor = new androidx.window.embedding.SplitAttributes.Builder().build();

        public final androidx.window.embedding.SplitPinRule.Builder setMinWidthDp(int minWidthDp) {
            this.Camera2StreamConfigurationMap = minWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setMinHeightDp(int minHeightDp) {
            this.getHighSpeedVideoFpsRangesFor = minHeightDp;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setMinSmallestWidthDp(int minSmallestWidthDp) {
            this.getHighResolutionOutputSizeshNQ4ISI = minSmallestWidthDp;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setMaxAspectRatioInPortrait(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getHighSpeedVideoSizes = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setMaxAspectRatioInLandscape(androidx.window.embedding.EmbeddingAspectRatio aspectRatio) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aspectRatio, "");
            this.getInputSizeshNQ4ISI = aspectRatio;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setDefaultSplitAttributes(androidx.window.embedding.SplitAttributes defaultSplitAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSplitAttributes, "");
            this.getHighSpeedVideoSizesFor = defaultSplitAttributes;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setTag(java.lang.String tag) {
            this.getHighSpeedVideoFpsRanges = tag;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule.Builder setSticky(boolean isSticky) {
            this.getInputFormats = isSticky;
            return this;
        }

        public final androidx.window.embedding.SplitPinRule build() {
            return new androidx.window.embedding.SplitPinRule(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI);
        }
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.window.embedding.SplitPinRule) && super.equals(other) && this.isSticky == ((androidx.window.embedding.SplitPinRule) other).isSticky;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public final int hashCode() {
        return (super.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSticky);
    }

    @Override // androidx.window.embedding.SplitRule
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitPinRule{tag=");
        sb.append(getTag());
        sb.append(", defaultSplitAttributes=");
        sb.append(getDefaultSplitAttributes());
        sb.append(", isSticky=");
        sb.append(this.isSticky);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
