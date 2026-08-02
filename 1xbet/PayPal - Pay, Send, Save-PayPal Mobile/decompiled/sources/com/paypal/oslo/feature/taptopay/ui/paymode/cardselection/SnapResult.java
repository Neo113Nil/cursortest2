package com.paypal.oslo.feature.taptopay.ui.paymode.cardselection;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/cardselection/SnapResult;", "", "Landroidx/compose/ui/unit/Dp;", "targetScrollOffset", "", "nearestCardIndex", "<init>", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "component1", "component2", "()Ljava/lang/Integer;", "copy-_Y4kl1M", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/cardselection/SnapResult;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Dp;", "getTargetScrollOffset-lTKBWiU", "Ljava/lang/Integer;", "getNearestCardIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SnapResult {
    public static final int $stable = 0;
    private final java.lang.Integer nearestCardIndex;
    private final androidx.compose.ui.unit.Dp targetScrollOffset;

    private SnapResult(androidx.compose.ui.unit.Dp dp, java.lang.Integer num) {
        this.targetScrollOffset = dp;
        this.nearestCardIndex = num;
    }

    /* renamed from: getTargetScrollOffset-lTKBWiU, reason: not valid java name */
    public final androidx.compose.ui.unit.Dp m20118getTargetScrollOffsetlTKBWiU() {
        return this.targetScrollOffset;
    }

    public final java.lang.Integer getNearestCardIndex() {
        return this.nearestCardIndex;
    }

    public final java.lang.String toString() {
        androidx.compose.ui.unit.Dp dp = this.targetScrollOffset;
        java.lang.Integer num = this.nearestCardIndex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SnapResult(targetScrollOffset=");
        sb.append(dp);
        sb.append(", nearestCardIndex=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        androidx.compose.ui.unit.Dp dp = this.targetScrollOffset;
        int m8607hashCodeimpl = dp == null ? 0 : androidx.compose.ui.unit.Dp.m8607hashCodeimpl(dp.m8615unboximpl());
        java.lang.Integer num = this.nearestCardIndex;
        return (m8607hashCodeimpl * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult snapResult = (com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.targetScrollOffset, snapResult.targetScrollOffset) && kotlin.jvm.internal.Intrinsics.areEqual(this.nearestCardIndex, snapResult.nearestCardIndex);
    }

    /* renamed from: copy-_Y4kl1M, reason: not valid java name */
    public final com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult m20117copy_Y4kl1M(androidx.compose.ui.unit.Dp targetScrollOffset, java.lang.Integer nearestCardIndex) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult(targetScrollOffset, nearestCardIndex, null);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getNearestCardIndex() {
        return this.nearestCardIndex;
    }

    /* renamed from: component1-lTKBWiU, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Dp getTargetScrollOffset() {
        return this.targetScrollOffset;
    }

    /* renamed from: copy-_Y4kl1M$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult m20115copy_Y4kl1M$default(com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult snapResult, androidx.compose.ui.unit.Dp dp, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dp = snapResult.targetScrollOffset;
        }
        if ((i & 2) != 0) {
            num = snapResult.nearestCardIndex;
        }
        return snapResult.m20117copy_Y4kl1M(dp, num);
    }

    public /* synthetic */ SnapResult(androidx.compose.ui.unit.Dp dp, java.lang.Integer num, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dp, num);
    }
}
