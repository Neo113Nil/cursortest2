package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "", "current", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "", "steps", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCurrent", "()F", "Lkotlin/ranges/ClosedFloatingPointRange;", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", com.visa.cbp.getEncExpo.warmup, "getSteps", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.semantics.ProgressBarRangeInfo.Companion INSTANCE = new androidx.compose.ui.semantics.ProgressBarRangeInfo.Companion(null);
    private static final androidx.compose.ui.semantics.ProgressBarRangeInfo Indeterminate = new androidx.compose.ui.semantics.ProgressBarRangeInfo(0.0f, kotlin.ranges.RangesKt.rangeTo(0.0f, 0.0f), 0, 4, null);
    private final float current;
    private final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> range;
    private final int steps;

    public ProgressBarRangeInfo(float f, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i) {
        this.current = f;
        this.range = closedFloatingPointRange;
        this.steps = i;
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ ProgressBarRangeInfo(float f, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, closedFloatingPointRange, (i2 & 4) != 0 ? 0 : i);
    }

    public final float getCurrent() {
        return this.current;
    }

    public final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.semantics.ProgressBarRangeInfo getIndeterminate() {
            return androidx.compose.ui.semantics.ProgressBarRangeInfo.Indeterminate;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.ProgressBarRangeInfo)) {
            return false;
        }
        androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) other;
        return this.current == progressBarRangeInfo.current && kotlin.jvm.internal.Intrinsics.areEqual(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.current);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(')');
        return sb.toString();
    }
}
