package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentOptionsPreviewData;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getOutputMinFrameDuration", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class PaymentOptionsPreviewData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    private PaymentOptionsPreviewData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.Camera2StreamConfigurationMap = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = str5;
        this.getInputFormats = str6;
    }

    public /* synthetic */ PaymentOptionsPreviewData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Payment amount" : str, (i & 2) != 0 ? "Autopay on" : str2, (i & 4) != 0 ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanTestTag.PAYMENT_AMOUNT : str3, (i & 8) != 0 ? "$220.61" : str4, (i & 16) != 0 ? "Other amount" : str5, (i & 32) != 0 ? "Enter amount" : str6);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str4 = this.Camera2StreamConfigurationMap;
        java.lang.String str5 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str6 = this.getInputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOptionsPreviewData(getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(str3);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(str4);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str5);
        sb.append(", getInputFormats=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getInputFormats.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsPreviewData)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsPreviewData paymentOptionsPreviewData = (com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsPreviewData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, paymentOptionsPreviewData.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, paymentOptionsPreviewData.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, paymentOptionsPreviewData.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, paymentOptionsPreviewData.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, paymentOptionsPreviewData.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, paymentOptionsPreviewData.getInputFormats);
    }

    public PaymentOptionsPreviewData() {
        this(null, null, null, null, null, null, 63, null);
    }
}
