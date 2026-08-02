package com.paypal.oslo.feature.cardconnect.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\":\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0000j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateCardConnectSessionInput;", "Lcom/paypal/oslo/feature/cardconnect/shared/data/repository/Mapper;", "cardConnectSessionRequestMapper", "Lkotlin/jvm/functions/Function1;", "getCardConnectSessionRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/cardconnect/graphql/CardConnectCreateSessionMutation$Data;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionResponse;", "cardConnectSessionResponseMapper", "getCardConnectSessionResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectSessionMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest, com.paypal.oslo.api.graphql.schema.type.CreateCardConnectSessionInput> cardConnectSessionRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt.$r8$lambda$rrzGa8aFT93Yf5khSqJMaJYHqIc((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Data, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse> cardConnectSessionResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt.$r8$lambda$UWIVClAFM3_0RjzzrOpoJboNsF0((com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest, com.paypal.oslo.api.graphql.schema.type.CreateCardConnectSessionInput> getCardConnectSessionRequestMapper() {
        return cardConnectSessionRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Data, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse> getCardConnectSessionResponseMapper() {
        return cardConnectSessionResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse $r8$lambda$UWIVClAFM3_0RjzzrOpoJboNsF0(com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Data data) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.CreateCardConnectSession createCardConnectSession = data.getCreateCardConnectSession();
        if (createCardConnectSession == null) {
            return null;
        }
        java.lang.String obj2 = createCardConnectSession.getSessionId().toString();
        java.lang.String valueOf = java.lang.String.valueOf(createCardConnectSession.getClientId());
        java.util.List<com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Merchant> merchants = createCardConnectSession.getMerchants();
        if (merchants == null) {
            merchants = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Merchant> list = merchants;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation.Merchant merchant : list) {
            java.lang.String externalCode = merchant.getExternalCode();
            java.lang.String obj3 = merchant.getId().toString();
            java.lang.String name2 = merchant.getName();
            int stackRank = merchant.getStackRank();
            boolean connected = merchant.getConnected();
            java.lang.Object connectedTime = merchant.getConnectedTime();
            arrayList.add(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant(externalCode, obj3, name2, stackRank, java.lang.Boolean.valueOf(connected), (connectedTime == null || (obj = connectedTime.toString()) == null) ? null : kotlin.text.StringsKt.toLongOrNull(obj)));
        }
        return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse(obj2, valueOf, arrayList);
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateCardConnectSessionInput $r8$lambda$rrzGa8aFT93Yf5khSqJMaJYHqIc(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSessionRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateCardConnectSessionInput(com.paypal.oslo.feature.cardconnect.shared.data.mapper.MapperUtilKt.toSchemaType(cardConnectSessionRequest.getCardProduct()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardConnectSessionRequest.getInstrumentId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardConnectSessionRequest.getMerchantId()));
    }
}
