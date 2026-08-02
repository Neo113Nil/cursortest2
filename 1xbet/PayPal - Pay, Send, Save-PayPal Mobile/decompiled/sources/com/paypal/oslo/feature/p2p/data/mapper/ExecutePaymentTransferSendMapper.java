package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferSendMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/ExecutePaymentTransferMutation$OnPaymentTransfer;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "currencyCountryMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;", "postTransferDisclosureMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/ExecutePaymentTransferMutation$OnPaymentTransfer;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExecutePaymentTransferSendMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentTransfer, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ExecutePaymentTransferSendMapper(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper postTransferDisclosureMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCountryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postTransferDisclosureMapper, "");
        this.getHighSpeedVideoSizes = currencyCountryMapper;
        this.Camera2StreamConfigurationMap = postTransferDisclosureMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send map(com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentTransfer input) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String obj = input.getTransferAmount().getCurrencyCode().toString();
        java.lang.String obj2 = input.getTransactionID().toString();
        java.lang.String obj3 = input.getCreateTime().toString();
        java.lang.String rawValue = input.getPaymentStatus().getRawValue();
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(input.getTransferAmount().getValue(), obj, this.getHighSpeedVideoSizes.map(obj));
        java.util.List<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure> disclosures = input.getDisclosures();
        if (disclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure> list = disclosures;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.Camera2StreamConfigurationMap.map(((com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure) it.next()).getPostTransferDisclosureFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.PaymentLink paymentLink = input.getPaymentLink();
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send(obj2, obj3, rawValue, amount, emptyList, paymentLink != null ? com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLink.getUrl(), paymentLink.getExpirationTime()) : null);
    }
}
