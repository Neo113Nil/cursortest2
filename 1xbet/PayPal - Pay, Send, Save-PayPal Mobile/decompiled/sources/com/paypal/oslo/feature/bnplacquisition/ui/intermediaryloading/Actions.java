package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/Actions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/Actions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "getHighSpeedVideoFpsRanges", "getScreenLock", "()Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "screenLock"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Actions {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getHighSpeedVideoFpsRanges;

    public Actions(com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        this.getHighSpeedVideoFpsRanges = nfcLockScreenConfig;
    }

    /* renamed from: getScreenLock, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Actions(getHighSpeedVideoFpsRanges=");
        sb.append(nfcLockScreenConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions) other).getHighSpeedVideoFpsRanges);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions copy(com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions(nfcLockScreenConfig);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions copy$default(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions actions, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nfcLockScreenConfig = actions.getHighSpeedVideoFpsRanges;
        }
        return actions.copy(nfcLockScreenConfig);
    }
}
