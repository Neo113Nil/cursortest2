package com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/howto/ui/Step;", "", "Lcom/paypal/pds/core/Icon;", "p0", "", "p1", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/pds/core/Icon;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class Step {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.pds.core.Icon getHighSpeedVideoFpsRanges;

    public Step(com.paypal.pds.core.Icon icon, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = icon;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Step(getHighSpeedVideoFpsRanges=");
        sb.append(icon);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step step = (com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, step.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, step.getHighResolutionOutputSizeshNQ4ISI);
    }
}
