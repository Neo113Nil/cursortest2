package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\":\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardShipmentResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitInstrumentShipmentResponseMapper", "Lkotlin/jvm/functions/Function1;", "getDebitInstrumentShipmentResponseMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentShipmentMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse> debitInstrumentShipmentResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentShipmentMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentShipmentMapperKt.$r8$lambda$Ald_1X5xShF0M4uZIgQExW9brrM((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse> getDebitInstrumentShipmentResponseMapper() {
        return debitInstrumentShipmentResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse $r8$lambda$Ald_1X5xShF0M4uZIgQExW9brrM(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data data) {
        java.util.List emptyList;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> availableActions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getDebitInstruments().getItems());
        java.util.ArrayList arrayList = null;
        if (item == null) {
            return null;
        }
        java.lang.String id = item.getId();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = item.getProductName();
        java.lang.String rawValue = productName != null ? productName.getRawValue() : null;
        java.lang.String str = rawValue == null ? "" : rawValue;
        java.lang.Object lastNChars = item.getLastNChars();
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        java.lang.String str2 = obj == null ? "" : obj;
        java.lang.Boolean virtualCard = item.getVirtualCard();
        boolean booleanValue = virtualCard != null ? virtualCard.booleanValue() : false;
        java.lang.Boolean primary = item.getPrimary();
        boolean booleanValue2 = primary != null ? primary.booleanValue() : false;
        java.lang.Object primaryCurrencyCode = item.getPrimaryCurrencyCode();
        java.lang.String obj2 = primaryCurrencyCode != null ? primaryCurrencyCode.toString() : null;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus> debitInstrumentStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status = item.getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus invoke = debitInstrumentStatusMapper.invoke(status != null ? status.getDebitInstrumentStatusFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails> debitInstrumentShipmentDetailsMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentShipmentDetailsMapper();
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment = item.getShipment();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails invoke2 = debitInstrumentShipmentDetailsMapper.invoke(shipment != null ? shipment.getDebitInstrumentShipmentFragment() : null);
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product = item.getProduct();
        if (product != null && (availableActions = product.getAvailableActions()) != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = availableActions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) it.next()).name());
            }
            arrayList = arrayList2;
        }
        java.util.List emptyList2 = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions = item.getActions();
        if (actions != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list2 = actions;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.getDebitInstrumentOperationMapper().invoke((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) it2.next()));
            }
            emptyList = arrayList3;
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse(new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment(id, str, str2, booleanValue, booleanValue2, obj2, invoke, invoke2, emptyList2, emptyList));
    }
}
