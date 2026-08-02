package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/CreditCardFormUiState;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class CreditCardFormUiState {
    final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    public CreditCardFormUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = z2;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        boolean z = this.Camera2StreamConfigurationMap;
        boolean z2 = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditCardFormUiState(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str2);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        return (((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.CreditCardFormUiState)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.CreditCardFormUiState creditCardFormUiState = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.CreditCardFormUiState) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, creditCardFormUiState.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, creditCardFormUiState.getHighSpeedVideoFpsRanges) && this.Camera2StreamConfigurationMap == creditCardFormUiState.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == creditCardFormUiState.getHighSpeedVideoSizes;
    }
}
