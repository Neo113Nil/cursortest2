package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0016\u0018\u0000 /2\u00020\u0001:\u0004/012BO\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010!R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "", "tag", "", "minWidthDp", "minHeightDp", "minSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "maxAspectRatioInPortrait", "maxAspectRatioInLandscape", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "<init>", "(Ljava/lang/String;IIILandroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/SplitAttributes;)V", "Landroid/content/Context;", "context", "Landroid/view/WindowMetrics;", "parentMetrics", "", "checkParentMetrics$window_release", "(Landroid/content/Context;Landroid/view/WindowMetrics;)Z", "", "density", "Landroid/graphics/Rect;", "bounds", "checkParentBounds$window_release", "(FLandroid/graphics/Rect;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMinWidthDp", "getMinHeightDp", "getMinSmallestWidthDp", "Landroidx/window/embedding/EmbeddingAspectRatio;", "getMaxAspectRatioInPortrait", "()Landroidx/window/embedding/EmbeddingAspectRatio;", "getMaxAspectRatioInLandscape", "Landroidx/window/embedding/SplitAttributes;", "getDefaultSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "Companion", "FinishBehavior", "Api30Impl", "Api34Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SplitRule extends androidx.window.embedding.EmbeddingRule {
    public static final int SPLIT_MIN_DIMENSION_ALWAYS_ALLOW = 0;
    public static final int SPLIT_MIN_DIMENSION_DP_DEFAULT = 600;
    private final androidx.window.embedding.SplitAttributes defaultSplitAttributes;
    private final androidx.window.embedding.EmbeddingAspectRatio maxAspectRatioInLandscape;
    private final androidx.window.embedding.EmbeddingAspectRatio maxAspectRatioInPortrait;
    private final int minHeightDp;
    private final int minSmallestWidthDp;
    private final int minWidthDp;
    public static final androidx.window.embedding.EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT = androidx.window.embedding.EmbeddingAspectRatio.INSTANCE.ratio(1.4f);
    public static final androidx.window.embedding.EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT = androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_ALLOW;

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinSmallestWidthDp() {
        return this.minSmallestWidthDp;
    }

    public final androidx.window.embedding.EmbeddingAspectRatio getMaxAspectRatioInPortrait() {
        return this.maxAspectRatioInPortrait;
    }

    public /* synthetic */ SplitRule(java.lang.String str, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, androidx.window.embedding.SplitAttributes splitAttributes, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 600 : i, (i4 & 4) != 0 ? 600 : i2, (i4 & 8) != 0 ? 600 : i3, (i4 & 16) != 0 ? SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 32) != 0 ? SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    public final androidx.window.embedding.EmbeddingAspectRatio getMaxAspectRatioInLandscape() {
        return this.maxAspectRatioInLandscape;
    }

    public final androidx.window.embedding.SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitRule(java.lang.String str, int i, int i2, int i3, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio, androidx.window.embedding.EmbeddingAspectRatio embeddingAspectRatio2, androidx.window.embedding.SplitAttributes splitAttributes) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAspectRatio2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        this.minWidthDp = i;
        this.minHeightDp = i2;
        this.minSmallestWidthDp = i3;
        this.maxAspectRatioInPortrait = embeddingAspectRatio;
        this.maxAspectRatioInLandscape = embeddingAspectRatio2;
        this.defaultSplitAttributes = splitAttributes;
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "minWidthDp must be non-negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i2, "minHeightDp must be non-negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i3, "minSmallestWidthDp must be non-negative");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b"}, d2 = {"Landroidx/window/embedding/SplitRule$FinishBehavior;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$window_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinishBehavior {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.embedding.SplitRule.FinishBehavior.Companion INSTANCE = new androidx.window.embedding.SplitRule.FinishBehavior.Companion(null);
        public static final androidx.window.embedding.SplitRule.FinishBehavior NEVER = new androidx.window.embedding.SplitRule.FinishBehavior("NEVER", 0);
        public static final androidx.window.embedding.SplitRule.FinishBehavior ALWAYS = new androidx.window.embedding.SplitRule.FinishBehavior("ALWAYS", 1);
        public static final androidx.window.embedding.SplitRule.FinishBehavior ADJACENT = new androidx.window.embedding.SplitRule.FinishBehavior("ADJACENT", 2);

        private FinishBehavior(java.lang.String str, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.value = i;
        }

        /* renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.value;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Landroidx/window/embedding/SplitRule$FinishBehavior$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/window/embedding/SplitRule$FinishBehavior;", "getFinishBehaviorFromValue$window_release", "(I)Landroidx/window/embedding/SplitRule$FinishBehavior;", "NEVER", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "ALWAYS", "ADJACENT"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.window.embedding.SplitRule.FinishBehavior getFinishBehaviorFromValue$window_release(int value) {
                if (value == androidx.window.embedding.SplitRule.FinishBehavior.NEVER.getValue()) {
                    return androidx.window.embedding.SplitRule.FinishBehavior.NEVER;
                }
                if (value == androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS.getValue()) {
                    return androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS;
                }
                if (value == androidx.window.embedding.SplitRule.FinishBehavior.ADJACENT.getValue()) {
                    return androidx.window.embedding.SplitRule.FinishBehavior.ADJACENT;
                }
                throw new java.lang.IllegalArgumentException("Unknown finish behavior:".concat(java.lang.String.valueOf(value)));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final boolean checkParentMetrics$window_release(android.content.Context context, android.view.WindowMetrics parentMetrics) {
        float density;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentMetrics, "");
        if (android.os.Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        android.graphics.Rect bounds = androidx.window.embedding.SplitRule.Api30Impl.INSTANCE.getBounds(parentMetrics);
        if (android.os.Build.VERSION.SDK_INT <= 33) {
            density = context.getResources().getDisplayMetrics().density;
        } else {
            density = androidx.window.embedding.SplitRule.Api34Impl.INSTANCE.getDensity(parentMetrics, context);
        }
        return checkParentBounds$window_release(density, bounds);
    }

    public final boolean checkParentBounds$window_release(float density, android.graphics.Rect bounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0) {
            int i = this.minWidthDp;
            int i2 = (int) ((i * density) + 0.5f);
            int i3 = this.minHeightDp;
            int i4 = (int) ((i3 * density) + 0.5f);
            int i5 = this.minSmallestWidthDp;
            int i6 = (int) ((i5 * density) + 0.5f);
            boolean z = i == 0 || width >= i2;
            boolean z2 = i3 == 0 || height >= i4;
            boolean z3 = i5 == 0 || java.lang.Math.min(width, height) >= i6;
            boolean z4 = height < width ? kotlin.jvm.internal.Intrinsics.areEqual(this.maxAspectRatioInLandscape, androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) width) * 1.0f) / ((float) height) <= this.maxAspectRatioInLandscape.getValue() : kotlin.jvm.internal.Intrinsics.areEqual(this.maxAspectRatioInPortrait, androidx.window.embedding.EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) height) * 1.0f) / ((float) width) <= this.maxAspectRatioInPortrait.getValue();
            if (z && z2 && z3 && z4) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "getBounds", "(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api30Impl {
        public static final androidx.window.embedding.SplitRule.Api30Impl INSTANCE = new androidx.window.embedding.SplitRule.Api30Impl();

        private Api30Impl() {
        }

        public final android.graphics.Rect getBounds(android.view.WindowMetrics windowMetrics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
            android.graphics.Rect bounds = windowMetrics.getBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
            return bounds;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/window/embedding/SplitRule$Api34Impl;", "", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/content/Context;", "context", "", "getDensity", "(Landroid/view/WindowMetrics;Landroid/content/Context;)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api34Impl {
        public static final androidx.window.embedding.SplitRule.Api34Impl INSTANCE = new androidx.window.embedding.SplitRule.Api34Impl();

        private Api34Impl() {
        }

        public final float getDensity(android.view.WindowMetrics windowMetrics, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            try {
                return windowMetrics.getDensity();
            } catch (java.lang.NoSuchMethodError unused) {
                return context.getResources().getDisplayMetrics().density;
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitRule) || !super.equals(other)) {
            return false;
        }
        androidx.window.embedding.SplitRule splitRule = (androidx.window.embedding.SplitRule) other;
        return this.minWidthDp == splitRule.minWidthDp && this.minHeightDp == splitRule.minHeightDp && this.minSmallestWidthDp == splitRule.minSmallestWidthDp && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAspectRatioInPortrait, splitRule.maxAspectRatioInPortrait) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAspectRatioInLandscape, splitRule.maxAspectRatioInLandscape) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultSplitAttributes, splitRule.defaultSplitAttributes);
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.minWidthDp;
        int i2 = this.minHeightDp;
        int i3 = this.minSmallestWidthDp;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + this.maxAspectRatioInPortrait.hashCode()) * 31) + this.maxAspectRatioInLandscape.hashCode()) * 31) + this.defaultSplitAttributes.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitRule{ tag=");
        sb.append(getTag());
        sb.append(", defaultSplitAttributes=");
        sb.append(this.defaultSplitAttributes);
        sb.append(", minWidthDp=");
        sb.append(this.minWidthDp);
        sb.append(", minHeightDp=");
        sb.append(this.minHeightDp);
        sb.append(", minSmallestWidthDp=");
        sb.append(this.minSmallestWidthDp);
        sb.append(", maxAspectRatioInPortrait=");
        sb.append(this.maxAspectRatioInPortrait);
        sb.append(", maxAspectRatioInLandscape=");
        sb.append(this.maxAspectRatioInLandscape);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
