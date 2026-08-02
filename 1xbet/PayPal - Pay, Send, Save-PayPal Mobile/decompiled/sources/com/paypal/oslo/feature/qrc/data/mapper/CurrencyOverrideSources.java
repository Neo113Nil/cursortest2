package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/mapper/CurrencyOverrideSources;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "p0", "p1", "p2", "p3", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class CurrencyOverrideSources {
    final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getHighSpeedVideoFpsRangesFor;
    final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getHighSpeedVideoSizes;

    public CurrencyOverrideSources(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4) {
        this.getHighSpeedVideoFpsRanges = fundingSource;
        this.getHighSpeedVideoFpsRangesFor = fundingSource2;
        this.getHighSpeedVideoSizes = fundingSource3;
        this.Camera2StreamConfigurationMap = fundingSource4;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyOverrideSources(getHighSpeedVideoFpsRanges=");
        sb.append(fundingSource);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(fundingSource2);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(fundingSource3);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(fundingSource4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource = this.getHighSpeedVideoFpsRanges;
        int hashCode = fundingSource == null ? 0 : fundingSource.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2 = this.getHighSpeedVideoFpsRangesFor;
        int hashCode2 = fundingSource2 == null ? 0 : fundingSource2.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3 = this.getHighSpeedVideoSizes;
        int hashCode3 = fundingSource3 == null ? 0 : fundingSource3.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4 = this.Camera2StreamConfigurationMap;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (fundingSource4 != null ? fundingSource4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources = (com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, currencyOverrideSources.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, currencyOverrideSources.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, currencyOverrideSources.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, currencyOverrideSources.Camera2StreamConfigurationMap);
    }
}
