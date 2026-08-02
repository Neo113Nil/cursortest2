package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001dB+\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "", "tag", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "", "alwaysExpand", "<init>", "(Ljava/lang/String;Ljava/util/Set;Z)V", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/ActivityRule;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "Z", "getAlwaysExpand", "()Z", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityRule extends androidx.window.embedding.EmbeddingRule {
    private final boolean alwaysExpand;
    private final java.util.Set<androidx.window.embedding.ActivityFilter> filters;

    public /* synthetic */ ActivityRule(java.lang.String str, java.util.Set set, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? false : z);
    }

    public final java.util.Set<androidx.window.embedding.ActivityFilter> getFilters() {
        return this.filters;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRule(java.lang.String str, java.util.Set<androidx.window.embedding.ActivityFilter> set, boolean z) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.filters = set;
        this.alwaysExpand = z;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/window/embedding/ActivityRule$Builder;", "", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "<init>", "(Ljava/util/Set;)V", "", "alwaysExpand", "setAlwaysExpand", "(Z)Landroidx/window/embedding/ActivityRule$Builder;", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/window/embedding/ActivityRule$Builder;", "Landroidx/window/embedding/ActivityRule;", "build", "()Landroidx/window/embedding/ActivityRule;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.Set<androidx.window.embedding.ActivityFilter> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        public Builder(java.util.Set<androidx.window.embedding.ActivityFilter> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.getHighSpeedVideoFpsRanges = set;
        }

        public final androidx.window.embedding.ActivityRule.Builder setAlwaysExpand(boolean alwaysExpand) {
            this.Camera2StreamConfigurationMap = alwaysExpand;
            return this;
        }

        public final androidx.window.embedding.ActivityRule.Builder setTag(java.lang.String tag) {
            this.getHighSpeedVideoFpsRangesFor = tag;
            return this;
        }

        public final androidx.window.embedding.ActivityRule build() {
            return new androidx.window.embedding.ActivityRule(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
    }

    public final androidx.window.embedding.ActivityRule plus$window_release(androidx.window.embedding.ActivityFilter filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "");
        return new androidx.window.embedding.ActivityRule(getTag(), kotlin.collections.SetsKt.plus(this.filters, filter), this.alwaysExpand);
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ActivityRule) || !super.equals(other)) {
            return false;
        }
        androidx.window.embedding.ActivityRule activityRule = (androidx.window.embedding.ActivityRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + java.lang.Boolean.hashCode(this.alwaysExpand);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityRule:{tag={");
        sb.append(getTag());
        sb.append("},filters={");
        sb.append(this.filters);
        sb.append("}, alwaysExpand={");
        sb.append(this.alwaysExpand);
        sb.append("}}");
        return sb.toString();
    }
}
