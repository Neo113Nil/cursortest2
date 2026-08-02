package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitInstrumentForRequestPhysicalCardResponseMapper", "Lkotlin/jvm/functions/Function1;", "getDebitInstrumentForRequestPhysicalCardResponseMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentForRequestPhysicalCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse> debitInstrumentForRequestPhysicalCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentForRequestPhysicalCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentForRequestPhysicalCardMapperKt.$r8$lambda$ygVyOB2TWroNq1bfOCDS3gHKUrE((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse> getDebitInstrumentForRequestPhysicalCardResponseMapper() {
        return debitInstrumentForRequestPhysicalCardResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse $r8$lambda$ygVyOB2TWroNq1bfOCDS3gHKUrE(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data data) {
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource;
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> pricing;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin origin;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus status;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getDebitInstruments().getItems());
        java.util.ArrayList arrayList = null;
        java.lang.String id = item != null ? item.getId() : null;
        java.lang.String str = id == null ? "" : id;
        java.lang.String rawValue = (item == null || (pin2 = item.getPin()) == null || (status = pin2.getStatus()) == null) ? null : status.getRawValue();
        java.lang.String str2 = rawValue == null ? "" : rawValue;
        java.lang.String rawValue2 = (item == null || (pin = item.getPin()) == null || (origin = pin.getOrigin()) == null) ? null : origin.getRawValue();
        java.lang.String str3 = rawValue2 == null ? "" : rawValue2;
        if (item != null && (pricing = item.getPricing()) != null) {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> list = pricing;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing pricing2 : list) {
                com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType type = pricing2.getDebitInstrumentPricingFragment().getType();
                java.lang.String valueOf = java.lang.String.valueOf(type != null ? type.name() : null);
                java.lang.String formattedFee = pricing2.getDebitInstrumentPricingFragment().getFormattedFee();
                if (formattedFee == null) {
                    formattedFee = "";
                }
                com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee = pricing2.getDebitInstrumentPricingFragment().getFee();
                java.lang.String obj = (fee == null || (currencyCode = fee.getCurrencyCode()) == null) ? null : currencyCode.toString();
                if (obj == null) {
                    obj = "";
                }
                com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee2 = pricing2.getDebitInstrumentPricingFragment().getFee();
                java.lang.String value = fee2 != null ? fee2.getValue() : null;
                if (value == null) {
                    value = "";
                }
                arrayList2.add(new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails(valueOf, formattedFee, obj, value));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse(str, str2, str3, arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList, item == null || (funding = item.getFunding()) == null || (configuration = funding.getConfiguration()) == null || (userPreferences = configuration.getUserPreferences()) == null || (fundingSource = userPreferences.getFundingSource()) == null || fundingSource.getStatus() == com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.CONTINGENCY);
    }
}
