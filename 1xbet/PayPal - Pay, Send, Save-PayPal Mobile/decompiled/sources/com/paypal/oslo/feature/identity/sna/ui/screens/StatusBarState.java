package com.paypal.oslo.feature.identity.sna.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/screens/StatusBarState;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class StatusBarState {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;
    final boolean getHighSpeedVideoFpsRangesFor;

    public StatusBarState(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = str;
    }

    public final java.lang.String toString() {
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatusBarState(getHighSpeedVideoFpsRangesFor=");
        sb.append(z);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.identity.sna.ui.screens.StatusBarState)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sna.ui.screens.StatusBarState statusBarState = (com.paypal.oslo.feature.identity.sna.ui.screens.StatusBarState) p0;
        return this.getHighSpeedVideoFpsRangesFor == statusBarState.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, statusBarState.getHighSpeedVideoSizes);
    }
}
