package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"4\u0010\u000b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0000j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t`\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0000j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/TokenInstrumentsResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "tokenInstrumentsResponseMapper", "Lkotlin/jvm/functions/Function1;", "getTokenInstrumentsResponseMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Item;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenInstrumentsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse> tokenInstrumentsResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt.m14287$r8$lambda$W8uO3EOEeeh1LieOk988rsN9t8((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt.$r8$lambda$5kHM4bRJViPmkfYGwElK_6edZiI((com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.TokenInstrumentsMapperKt.m14288$r8$lambda$eZG_PgU6h74bzmlPIp0Z0fPw8((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse> getTokenInstrumentsResponseMapper() {
        return tokenInstrumentsResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken $r8$lambda$5kHM4bRJViPmkfYGwElK_6edZiI(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment) {
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment.DeviceInfo deviceInfo;
        java.lang.String str = null;
        java.lang.String externalReferenceId = debitInstrumentTokenFragment != null ? debitInstrumentTokenFragment.getExternalReferenceId() : null;
        if (debitInstrumentTokenFragment != null && (deviceInfo = debitInstrumentTokenFragment.getDeviceInfo()) != null) {
            str = deviceInfo.getDeviceName();
        }
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken(externalReferenceId, str);
    }

    /* renamed from: $r8$lambda$W8uO3EOEeeh1LieO-k988rsN9t8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse m14287$r8$lambda$W8uO3EOEeeh1LieOk988rsN9t8(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> items = data.getDebitInstruments().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRanges.invoke((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item) it.next()));
        }
        return new com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse(arrayList);
    }

    /* renamed from: $r8$lambda$eZG_PgU6-h74bzmlPIp-0Z0fPw8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument m14288$r8$lambda$eZG_PgU6h74bzmlPIp0Z0fPw8(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item item) {
        java.util.List emptyList;
        com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token token;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = item.getProductName();
        java.lang.String rawValue = productName != null ? productName.getRawValue() : null;
        java.lang.String str = rawValue == null ? "" : rawValue;
        java.lang.Object lastNChars = item.getLastNChars();
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        java.lang.String str2 = obj != null ? obj : "";
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState> debitInstrumentLifecycleStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentLifecycleStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status = item.getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState invoke = debitInstrumentLifecycleStatusMapper.invoke(status != null ? status.getLifecycleState() : null);
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions = item.getActions();
        if (actions != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = actions;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentsMapperKt.getDebitInstrumentOperationMapper().invoke((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) it.next()));
            }
            emptyList = arrayList;
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> tokens = item.getTokens();
        return new com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument(id, str, str2, invoke, null, null, emptyList, (tokens == null || (token = (com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) tokens)) == null || (debitInstrumentTokenFragment = token.getDebitInstrumentTokenFragment()) == null) ? null : Camera2StreamConfigurationMap.invoke(debitInstrumentTokenFragment));
    }
}
