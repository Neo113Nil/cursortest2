package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/PayPalWorldConfig;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "p0", "p1", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "p2", "", "p3", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;Ljava/lang/Double;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "Ljava/lang/Double;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* data */ class PayPalWorldConfig {
    final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Double getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighSpeedVideoFpsRanges;

    public PayPalWorldConfig(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, java.lang.Double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcMoney, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcMoney2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionData, "");
        this.getHighSpeedVideoFpsRanges = qrcMoney;
        this.getHighSpeedVideoSizes = qrcMoney2;
        this.Camera2StreamConfigurationMap = heroCurrencySectionData;
        this.getHighSpeedVideoFpsRangesFor = d;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData = this.Camera2StreamConfigurationMap;
        java.lang.Double d = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalWorldConfig(getHighSpeedVideoFpsRanges=");
        sb.append(qrcMoney);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(qrcMoney2);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(heroCurrencySectionData);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        int hashCode3 = this.Camera2StreamConfigurationMap.hashCode();
        java.lang.Double d = this.getHighSpeedVideoFpsRangesFor;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (d == null ? 0 : d.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.qrc.ui.enteramount.PayPalWorldConfig)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.enteramount.PayPalWorldConfig payPalWorldConfig = (com.paypal.oslo.feature.qrc.ui.enteramount.PayPalWorldConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, payPalWorldConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, payPalWorldConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, payPalWorldConfig.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.getHighSpeedVideoFpsRangesFor, (java.lang.Object) payPalWorldConfig.getHighSpeedVideoFpsRangesFor);
    }
}
