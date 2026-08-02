package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/ChartSplitResult;", "", "", "splitIndex", "Lkotlin/ranges/IntRange;", "beforeRange", "afterRange", "<init>", "(Ljava/lang/Integer;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lkotlin/ranges/IntRange;", "component3", "copy", "(Ljava/lang/Integer;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;)Lcom/paypal/oslo/core/commonui/components/chart/ChartSplitResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getSplitIndex", "Lkotlin/ranges/IntRange;", "getBeforeRange", "getAfterRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChartSplitResult {
    public static final int $stable = 8;
    private final kotlin.ranges.IntRange afterRange;
    private final kotlin.ranges.IntRange beforeRange;
    private final java.lang.Integer splitIndex;

    public ChartSplitResult(java.lang.Integer num, kotlin.ranges.IntRange intRange, kotlin.ranges.IntRange intRange2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        this.splitIndex = num;
        this.beforeRange = intRange;
        this.afterRange = intRange2;
    }

    public final java.lang.Integer getSplitIndex() {
        return this.splitIndex;
    }

    public final kotlin.ranges.IntRange getBeforeRange() {
        return this.beforeRange;
    }

    public final kotlin.ranges.IntRange getAfterRange() {
        return this.afterRange;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.splitIndex;
        kotlin.ranges.IntRange intRange = this.beforeRange;
        kotlin.ranges.IntRange intRange2 = this.afterRange;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChartSplitResult(splitIndex=");
        sb.append(num);
        sb.append(", beforeRange=");
        sb.append(intRange);
        sb.append(", afterRange=");
        sb.append(intRange2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.splitIndex;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.beforeRange.hashCode();
        kotlin.ranges.IntRange intRange = this.afterRange;
        return (((hashCode * 31) + hashCode2) * 31) + (intRange != null ? intRange.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.chart.ChartSplitResult)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.chart.ChartSplitResult chartSplitResult = (com.paypal.oslo.core.commonui.components.chart.ChartSplitResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.splitIndex, chartSplitResult.splitIndex) && kotlin.jvm.internal.Intrinsics.areEqual(this.beforeRange, chartSplitResult.beforeRange) && kotlin.jvm.internal.Intrinsics.areEqual(this.afterRange, chartSplitResult.afterRange);
    }

    public final com.paypal.oslo.core.commonui.components.chart.ChartSplitResult copy(java.lang.Integer splitIndex, kotlin.ranges.IntRange beforeRange, kotlin.ranges.IntRange afterRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beforeRange, "");
        return new com.paypal.oslo.core.commonui.components.chart.ChartSplitResult(splitIndex, beforeRange, afterRange);
    }

    /* renamed from: component3, reason: from getter */
    public final kotlin.ranges.IntRange getAfterRange() {
        return this.afterRange;
    }

    /* renamed from: component2, reason: from getter */
    public final kotlin.ranges.IntRange getBeforeRange() {
        return this.beforeRange;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getSplitIndex() {
        return this.splitIndex;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.components.chart.ChartSplitResult copy$default(com.paypal.oslo.core.commonui.components.chart.ChartSplitResult chartSplitResult, java.lang.Integer num, kotlin.ranges.IntRange intRange, kotlin.ranges.IntRange intRange2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = chartSplitResult.splitIndex;
        }
        if ((i & 2) != 0) {
            intRange = chartSplitResult.beforeRange;
        }
        if ((i & 4) != 0) {
            intRange2 = chartSplitResult.afterRange;
        }
        return chartSplitResult.copy(num, intRange, intRange2);
    }
}
