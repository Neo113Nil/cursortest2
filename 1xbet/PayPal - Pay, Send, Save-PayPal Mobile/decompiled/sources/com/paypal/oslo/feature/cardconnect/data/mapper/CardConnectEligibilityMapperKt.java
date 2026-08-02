package com.paypal.oslo.feature.cardconnect.data.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0004j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "toCardConnectError", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;", "Lcom/paypal/oslo/feature/cardconnect/shared/data/repository/Mapper;", "cardConnectEligibilityRequestMapper", "Lkotlin/jvm/functions/Function1;", "getCardConnectEligibilityRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Merchant;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectMerchant;", "cardConnectMerchantMapper", "getCardConnectMerchantMapper", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "cardConnectEligibilityResponseMapper", "getCardConnectEligibilityResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectEligibilityMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput> cardConnectEligibilityRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.$r8$lambda$l9rgR4SZjeSWN_sm9jwenv_ysOs((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant, com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> cardConnectMerchantMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.m13379$r8$lambda$RvKaec22zAObghLwgwdLVXxKdI((com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse> cardConnectEligibilityResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.m13378$r8$lambda$4R5KCyGq5PGYv8F4Te9YNTkRhw((com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data) obj);
        }
    };

    public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError toCardConnectError(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet) {
            return com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoInternet.INSTANCE;
        }
        if (error instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError) {
            com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError) error;
            int statusCode = httpError.getStatusCode();
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError(java.lang.Integer.valueOf(statusCode), httpError.getCorrelationId());
        }
        if (error instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError) {
            return com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.UnknownNetworkError.INSTANCE;
        }
        if (error instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError) {
            com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError genericGraphQLError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError) error;
            com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions extensions = genericGraphQLError.getErrorDetail().getExtensions();
            if (kotlin.jvm.internal.Intrinsics.areEqual(extensions.getName(), "UNPROCESSABLE_ENTITY")) {
                java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> details = extensions.getDetails();
                if (!(details instanceof java.util.Collection) || !details.isEmpty()) {
                    java.util.Iterator<T> it = details.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail) it.next()).getIssue(), com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED)) {
                            return com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied.INSTANCE;
                        }
                    }
                }
            }
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError(genericGraphQLError.getErrorDetail().getMessage());
        }
        if (error instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError) {
            return com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoDataFound.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput> getCardConnectEligibilityRequestMapper() {
        return cardConnectEligibilityRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant, com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> getCardConnectMerchantMapper() {
        return cardConnectMerchantMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse> getCardConnectEligibilityResponseMapper() {
        return cardConnectEligibilityResponseMapper;
    }

    /* renamed from: $r8$lambda$4R5-KCyGq5PGYv8F4Te9YNTkRhw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse m13378$r8$lambda$4R5KCyGq5PGYv8F4Te9YNTkRhw(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility = data.getCardConnectEligibility();
        if (cardConnectEligibility == null || !cardConnectEligibility.isEligible()) {
            return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible(cardConnectEligibility != null ? cardConnectEligibility.getReasonCode() : null);
        }
        java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> merchants = cardConnectEligibility.getMerchants();
        if (merchants == null) {
            merchants = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> list = merchants;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cardConnectMerchantMapper.invoke((com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant) it.next()));
        }
        return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible(arrayList);
    }

    /* renamed from: $r8$lambda$R-vKaec22zAObghLwgwdLVXxKdI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant m13379$r8$lambda$RvKaec22zAObghLwgwdLVXxKdI(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant merchant) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        java.lang.String externalCode = merchant.getExternalCode();
        java.lang.String obj2 = merchant.getId().toString();
        java.lang.String name2 = merchant.getName();
        int stackRank = merchant.getStackRank();
        boolean connected = merchant.getConnected();
        java.lang.Object connectedTime = merchant.getConnectedTime();
        return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant(externalCode, obj2, name2, stackRank, java.lang.Boolean.valueOf(connected), (connectedTime == null || (obj = connectedTime.toString()) == null) ? null : kotlin.text.StringsKt.toLongOrNull(obj));
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput $r8$lambda$l9rgR4SZjeSWN_sm9jwenv_ysOs(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEligibilityRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput(com.paypal.oslo.feature.cardconnect.shared.data.mapper.MapperUtilKt.toSchemaType(cardConnectEligibilityRequest.getCardProduct()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardConnectEligibilityRequest.getInstrumentId()));
    }
}
