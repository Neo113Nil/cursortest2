package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferRequestMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/ExecutePaymentTransferMutation$OnPaymentRequest;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "currencyCountryMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;", "paymentRequestDisclosureMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/ExecutePaymentTransferMutation$OnPaymentRequest;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExecutePaymentTransferRequestMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentRequest, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ExecutePaymentTransferRequestMapper(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper paymentRequestDisclosureMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCountryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestDisclosureMapper, "");
        this.getHighSpeedVideoSizes = currencyCountryMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = paymentRequestDisclosureMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request map(com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentRequest input) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String obj = input.getAmount().getCurrencyCode().toString();
        java.lang.String obj2 = input.getRequestID().toString();
        java.lang.String obj3 = input.getCreateTime().toString();
        java.lang.String rawValue = input.getStatus().getRawValue();
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(input.getAmount().getValue(), obj, this.getHighSpeedVideoSizes.map(obj));
        java.util.List<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure1> disclosures = input.getDisclosures();
        if (disclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure1> list = disclosures;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighResolutionOutputSizeshNQ4ISI.map(((com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Disclosure1) it.next()).getPaymentRequestDisclosureFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.PaymentLink1 paymentLink = input.getPaymentLink();
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request(obj2, obj3, rawValue, amount, emptyList, paymentLink != null ? com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLink.getUrl(), paymentLink.getExpirationTime()) : null);
    }
}
