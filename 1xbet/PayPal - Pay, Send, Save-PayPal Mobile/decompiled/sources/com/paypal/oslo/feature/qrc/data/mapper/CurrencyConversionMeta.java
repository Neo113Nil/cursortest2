package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/mapper/CurrencyConversionMeta;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "p0", "", "p1", "p2", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Ljava/util/List;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class CurrencyConversionMeta {
    final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> getHighSpeedVideoFpsRanges;
    final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyConversionMeta(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2) {
        this.getHighResolutionOutputSizeshNQ4ISI = currencyConverter;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = currencyConverter2;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyConversionMeta(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(currencyConverter);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(list);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(currencyConverter2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode = currencyConverter == null ? 0 : currencyConverter.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2 = this.getHighSpeedVideoFpsRangesFor;
        return (((hashCode * 31) + hashCode2) * 31) + (currencyConverter2 != null ? currencyConverter2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta = (com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta) p0;
        return this.getHighResolutionOutputSizeshNQ4ISI == currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, currencyConversionMeta.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoFpsRangesFor == currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
    }
}
