package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidgetResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitCardWidgetResponseMapper", "Lkotlin/jvm/functions/Function1;", "getDebitCardWidgetResponseMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Item;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidget;", "debitCardWidgetMapper", "getDebitCardWidgetMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse> debitCardWidgetResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitCardWidgetMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitCardWidgetMapperKt.$r8$lambda$1gTo592P8CRXpcoMTnV_NgVZqZo((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item, com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget> debitCardWidgetMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitCardWidgetMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitCardWidgetMapperKt.m14278$r8$lambda$DhW7NSxjjO9CQlM36S0rOsc((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse> getDebitCardWidgetResponseMapper() {
        return debitCardWidgetResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item, com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget> getDebitCardWidgetMapper() {
        return debitCardWidgetMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse $r8$lambda$1gTo592P8CRXpcoMTnV_NgVZqZo(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> items = data.getDebitInstruments().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(debitCardWidgetMapper.invoke((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item) it.next()));
        }
        return new com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse(arrayList);
    }

    /* renamed from: $r8$lambda$DhW7N-Sxjj-O9CQ-lM-36S0rOsc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget m14278$r8$lambda$DhW7NSxjjO9CQlM36S0rOsc(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item item) {
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress;
        java.util.List<java.lang.String> displayAddress;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment2;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment.BillingAddress billingAddress2;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment.LargeImage largeImage;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment.Front front;
        java.lang.Object referenceUrl;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment;
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage;
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front2;
        java.lang.Object referenceUrl2;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment;
        java.lang.Object estimatedArrivalDate;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getDebitInstrumentCoreFragment().getId();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = item.getDebitInstrumentCoreFragment().getProductName();
        java.lang.String rawValue = productName != null ? productName.getRawValue() : null;
        java.lang.String str = rawValue == null ? "" : rawValue;
        java.lang.Object lastNChars = item.getDebitInstrumentCoreFragment().getLastNChars();
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        java.lang.String str2 = obj == null ? "" : obj;
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState> debitInstrumentDisplayStateMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentDisplayStateMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Status status = item.getDebitInstrumentCoreFragment().getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState invoke = debitInstrumentDisplayStateMapper.invoke((status == null || (debitInstrumentStatusFragment2 = status.getDebitInstrumentStatusFragment()) == null) ? null : debitInstrumentStatusFragment2.getDisplayState());
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState> debitInstrumentLifecycleStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentLifecycleStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Status status2 = item.getDebitInstrumentCoreFragment().getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState invoke2 = debitInstrumentLifecycleStatusMapper.invoke((status2 == null || (debitInstrumentStatusFragment = status2.getDebitInstrumentStatusFragment()) == null) ? null : debitInstrumentStatusFragment.getLifecycleState());
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Shipment shipment = item.getDebitInstrumentCoreFragment().getShipment();
        java.lang.String obj2 = (shipment == null || (debitInstrumentShipmentFragment = shipment.getDebitInstrumentShipmentFragment()) == null || (estimatedArrivalDate = debitInstrumentShipmentFragment.getEstimatedArrivalDate()) == null) ? null : estimatedArrivalDate.toString();
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product = item.getProduct();
        java.lang.String obj3 = (product == null || (smallImage = product.getSmallImage()) == null || (front2 = smallImage.getFront()) == null || (referenceUrl2 = front2.getReferenceUrl()) == null) ? null : referenceUrl2.toString();
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus> debitInstrumentPinStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Pin pin = item.getDebitInstrumentCoreFragment().getPin();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus invoke3 = debitInstrumentPinStatusMapper.invoke((pin == null || (debitInstrumentPinFragment = pin.getDebitInstrumentPinFragment()) == null) ? null : debitInstrumentPinFragment.getStatus());
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product2 = item.getProduct();
        java.lang.String obj4 = (product2 == null || (debitInstrumentProductCoreFragment = product2.getDebitInstrumentProductCoreFragment()) == null || (largeImage = debitInstrumentProductCoreFragment.getLargeImage()) == null || (front = largeImage.getFront()) == null || (referenceUrl = front.getReferenceUrl()) == null) ? null : referenceUrl.toString();
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder = item.getCardHolder();
        java.lang.String id2 = (cardHolder == null || (debitInstrumentCardHolderFragment2 = cardHolder.getDebitInstrumentCardHolderFragment()) == null || (billingAddress2 = debitInstrumentCardHolderFragment2.getBillingAddress()) == null) ? null : billingAddress2.getId();
        com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder2 = item.getCardHolder();
        return new com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget(id, str, str2, invoke, invoke2, obj2, obj3, invoke3, obj4, id2, (cardHolder2 == null || (debitInstrumentCardHolderFragment = cardHolder2.getDebitInstrumentCardHolderFragment()) == null || (billingAddress = debitInstrumentCardHolderFragment.getBillingAddress()) == null || (displayAddress = billingAddress.getDisplayAddress()) == null) ? null : kotlin.collections.CollectionsKt.joinToString$default(displayAddress, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null), item.getPrimary());
    }
}
