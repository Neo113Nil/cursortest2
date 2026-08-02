package com.paypal.oslo.feature.subscriptions.hub.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/data/repository/FundingInstrumentPair;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "p0", "p1", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class FundingInstrumentPair {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getHighSpeedVideoSizes;
    final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getHighResolutionOutputSizeshNQ4ISI;

    public FundingInstrumentPair(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2) {
        this.getHighResolutionOutputSizeshNQ4ISI = fundingInstrument;
        this.getHighSpeedVideoSizes = fundingInstrument2;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentPair(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(fundingInstrument);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(fundingInstrument2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (fundingInstrument2 != null ? fundingInstrument2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair fundingInstrumentPair = (com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, fundingInstrumentPair.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, fundingInstrumentPair.getHighSpeedVideoSizes);
    }
}
