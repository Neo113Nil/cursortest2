package com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/PrepareDigitizationData;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/DigitizationData;", "issuerDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/DigitizationData;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/DigitizationData;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/DigitizationData;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/PrepareDigitizationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/DigitizationData;", "getIssuerDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PrepareDigitizationData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData issuerDigitizationData;

    public PrepareDigitizationData(com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData digitizationData) {
        this.issuerDigitizationData = digitizationData;
    }

    public /* synthetic */ PrepareDigitizationData(com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData digitizationData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : digitizationData);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData getIssuerDigitizationData() {
        return this.issuerDigitizationData;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData digitizationData = this.issuerDigitizationData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareDigitizationData(issuerDigitizationData=");
        sb.append(digitizationData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData digitizationData = this.issuerDigitizationData;
        if (digitizationData == null) {
            return 0;
        }
        return digitizationData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerDigitizationData, ((com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData) other).issuerDigitizationData);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData copy(com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData issuerDigitizationData) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData(issuerDigitizationData);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData getIssuerDigitizationData() {
        return this.issuerDigitizationData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData prepareDigitizationData, com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData digitizationData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            digitizationData = prepareDigitizationData.issuerDigitizationData;
        }
        return prepareDigitizationData.copy(digitizationData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrepareDigitizationData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
