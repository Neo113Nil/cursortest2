package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0019\u001a\u00020\b8\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/paypal/pds/components/PaymentCardPreviewParameter;", "", "Lcom/paypal/pds/components/PaymentCardMode;", "p0", "", "p1", "Lcom/paypal/pds/components/PaymentCardCornerRadius;", "p2", "", "p3", "<init>", "(Lcom/paypal/pds/components/PaymentCardMode;ZLcom/paypal/pds/components/PaymentCardCornerRadius;Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/components/PaymentCardMode;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/pds/components/PaymentCardCornerRadius;", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class PaymentCardPreviewParameter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.pds.components.PaymentCardMode getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.pds.components.PaymentCardCornerRadius getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final boolean Camera2StreamConfigurationMap;

    private PaymentCardPreviewParameter(com.paypal.pds.components.PaymentCardMode paymentCardMode, boolean z, com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentCardMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentCardCornerRadius, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentCardMode;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = paymentCardCornerRadius;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public /* synthetic */ PaymentCardPreviewParameter(com.paypal.pds.components.PaymentCardMode paymentCardMode, boolean z, com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentCardMode, (i & 2) != 0 ? false : z, (i & 4) != 0 ? com.paypal.pds.components.PaymentCardCornerRadius.Radius24 : paymentCardCornerRadius, (i & 8) != 0 ? "Payment Card" : str);
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.PaymentCardMode paymentCardMode = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = this.Camera2StreamConfigurationMap;
        com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentCardPreviewParameter(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(paymentCardMode);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(paymentCardCornerRadius);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.pds.components.PaymentCardPreviewParameter)) {
            return false;
        }
        com.paypal.pds.components.PaymentCardPreviewParameter paymentCardPreviewParameter = (com.paypal.pds.components.PaymentCardPreviewParameter) p0;
        return this.getHighResolutionOutputSizeshNQ4ISI == paymentCardPreviewParameter.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == paymentCardPreviewParameter.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == paymentCardPreviewParameter.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, paymentCardPreviewParameter.getHighSpeedVideoFpsRangesFor);
    }
}
