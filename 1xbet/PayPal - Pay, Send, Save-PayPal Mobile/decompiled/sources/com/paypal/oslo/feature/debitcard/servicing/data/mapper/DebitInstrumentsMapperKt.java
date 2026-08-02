package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\">\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u0003`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0000j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"6\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0000j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\">\u0010\u0013\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0000j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u0000j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"6\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0000j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "Lcom/paypal/oslo/feature/debitcard/graphql/type/DebitInstrumentsInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitInstrumentsRequestMapper", "Lkotlin/jvm/functions/Function1;", "getDebitInstrumentsRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "debitInstrumentsResponseMapper", "getDebitInstrumentsResponseMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Item;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrumentMapper", "getDebitInstrumentMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLimits;", "debitInstrumentsLimitMapper", "getDebitInstrumentsLimitMapper", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentExpirationDetails;", "debitInstrumentExpirationDetailsMapper", "getDebitInstrumentExpirationDetailsMapper", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", "debitInstrumentOperationMapper", "getDebitInstrumentOperationMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput> debitInstrumentsRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.$r8$lambda$GmiAX29Z4v6bX_p4IjHGYSJPpVs((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse> debitInstrumentsResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.m14282$r8$lambda$DL1ic7JLrbMdqo4kRVw9s3gs8E((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> debitInstrumentMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.m14281$r8$lambda$C22lfvTgPpmqnqsi8fx24ldgdM((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits> debitInstrumentsLimitMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.m14283$r8$lambda$J9SZJ0HoCuPdbvYcb9ICszwfTs((com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails> debitInstrumentExpirationDetailsMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.$r8$lambda$IlzywBLlgDLb_u65DfuckCeVMa0((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> debitInstrumentOperationMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.Camera2StreamConfigurationMap((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) obj);
            return Camera2StreamConfigurationMap;
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput> getDebitInstrumentsRequestMapper() {
        return debitInstrumentsRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse> getDebitInstrumentsResponseMapper() {
        return debitInstrumentsResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getDebitInstrumentMapper() {
        return debitInstrumentMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits> getDebitInstrumentsLimitMapper() {
        return debitInstrumentsLimitMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails> getDebitInstrumentExpirationDetailsMapper() {
        return debitInstrumentExpirationDetailsMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> getDebitInstrumentOperationMapper() {
        return debitInstrumentOperationMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentServicingAction, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String upperCase = debitInstrumentServicingAction.name().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.valueOf(upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.UNKNOWN;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = debitInstrumentOperation;
        }
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation) m23436constructorimpl;
    }

    /* renamed from: $r8$lambda$C22lfvTgPpmqnq-si8fx24ldgdM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument m14281$r8$lambda$C22lfvTgPpmqnqsi8fx24ldgdM(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item item) {
        java.util.List emptyList;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment = item.getDebitInstrumentCoreFragment();
        java.lang.String id = debitInstrumentCoreFragment.getId();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = debitInstrumentCoreFragment.getProductName();
        java.lang.String rawValue = productName != null ? productName.getRawValue() : null;
        java.lang.String str = rawValue == null ? "" : rawValue;
        java.lang.Object lastNChars = debitInstrumentCoreFragment.getLastNChars();
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        java.lang.String str2 = obj == null ? "" : obj;
        java.lang.Boolean virtualCard = item.getVirtualCard();
        boolean booleanValue = virtualCard != null ? virtualCard.booleanValue() : false;
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus> debitInstrumentPinStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Pin pin = debitInstrumentCoreFragment.getPin();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus invoke = debitInstrumentPinStatusMapper.invoke((pin == null || (debitInstrumentPinFragment2 = pin.getDebitInstrumentPinFragment()) == null) ? null : debitInstrumentPinFragment2.getStatus());
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin> debitInstrumentPinOriginMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinOriginMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Pin pin2 = debitInstrumentCoreFragment.getPin();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin invoke2 = debitInstrumentPinOriginMapper.invoke((pin2 == null || (debitInstrumentPinFragment = pin2.getDebitInstrumentPinFragment()) == null) ? null : debitInstrumentPinFragment.getOrigin());
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder> cardHolderMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getCardHolderMapper();
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder = item.getCardHolder();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder invoke3 = cardHolderMapper.invoke(cardHolder != null ? cardHolder.getDebitInstrumentCardHolderFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails> debitInstrumentShipmentDetailsMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentShipmentDetailsMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Shipment shipment = debitInstrumentCoreFragment.getShipment();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails invoke4 = debitInstrumentShipmentDetailsMapper.invoke(shipment != null ? shipment.getDebitInstrumentShipmentFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus> debitInstrumentStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Status status = debitInstrumentCoreFragment.getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus invoke5 = debitInstrumentStatusMapper.invoke(status != null ? status.getDebitInstrumentStatusFragment() : null);
        java.lang.Boolean primary = item.getPrimary();
        boolean booleanValue2 = primary != null ? primary.booleanValue() : false;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions = item.getActions();
        if (actions != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = actions;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(debitInstrumentOperationMapper.invoke((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) it.next()));
            }
            emptyList = arrayList;
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits> function1 = debitInstrumentsLimitMapper;
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits = item.getLimits();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits invoke6 = function1.invoke(limits != null ? limits.getDebitInstrumentLimitsFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails> debitInstrumentProductDetailsMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentProductDetailsMapper();
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product = item.getProduct();
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument(id, invoke5, str, booleanValue, booleanValue2, debitInstrumentExpirationDetailsMapper.invoke(item), str2, debitInstrumentProductDetailsMapper.invoke(product != null ? product.getDebitInstrumentProductFullFragment() : null), invoke4, invoke3, invoke, invoke2, emptyList, invoke6);
    }

    /* renamed from: $r8$lambda$DL1ic7-JLrbMdqo4kRVw9s3gs8E, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse m14282$r8$lambda$DL1ic7JLrbMdqo4kRVw9s3gs8E(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> items = data.getDebitInstruments().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(debitInstrumentMapper.invoke((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item) it.next()));
        }
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse(arrayList, com.paypal.oslo.feature.debitcard.servicing.data.mapper.BalancesMapperKt.getDebitInstrumentBalancesMapper().invoke(data.getBalances()));
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput $r8$lambda$GmiAX29Z4v6bX_p4IjHGYSJPpVs(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentsRequest, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String productName = debitInstrumentsRequest.getProductName();
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput(companion.present(kotlin.jvm.internal.Intrinsics.areEqual(productName, "CONSUMER_DEBIT_CARD") ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.valueOf("CONSUMER_DEBIT_CARD"), com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.valueOf("BUSINESS_DEBIT_CARD")}) : kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.valueOf(productName))), com.apollographql.apollo.api.Optional.INSTANCE.present(debitInstrumentsRequest.getCardId()));
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails $r8$lambda$IlzywBLlgDLb_u65DfuckCeVMa0(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.api.graphql.schema.type.Month expirationMonth = item.getExpirationMonth();
        java.lang.String obj = expirationMonth != null ? expirationMonth.toString() : null;
        java.lang.Object expirationYear = item.getExpirationYear();
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails(obj, expirationYear != null ? expirationYear.toString() : null, item.getExpired());
    }

    /* renamed from: $r8$lambda$J9SZJ0H-oCuPdbvYcb9ICszwfTs, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits m14283$r8$lambda$J9SZJ0HoCuPdbvYcb9ICszwfTs(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment) {
        if (debitInstrumentLimitsFragment == null) {
            return null;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.PosLimit posLimit = debitInstrumentLimitsFragment.getPosLimit();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount = posLimit != null ? new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount(posLimit.getCurrencyCode().toString(), posLimit.getValue(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.AtmLimit atmLimit = debitInstrumentLimitsFragment.getAtmLimit();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount2 = atmLimit != null ? new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount(atmLimit.getCurrencyCode().toString(), atmLimit.getValue(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment.OtcLimit otcLimit = debitInstrumentLimitsFragment.getOtcLimit();
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits(debitInstrumentMoneyAmount, debitInstrumentMoneyAmount2, otcLimit != null ? new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount(otcLimit.getCurrencyCode().toString(), otcLimit.getValue(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null);
    }
}
