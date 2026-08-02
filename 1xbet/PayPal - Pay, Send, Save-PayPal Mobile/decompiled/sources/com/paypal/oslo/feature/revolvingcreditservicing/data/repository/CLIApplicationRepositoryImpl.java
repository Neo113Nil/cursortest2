package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIApplicationRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "requestCreditLineIncrease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApplicationRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CLIApplicationRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestCreditLineIncrease(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1 cLIApplicationRepositoryImpl$requestCreditLineIncrease$1;
        int i;
        arrow.core.Either either;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1) {
            cLIApplicationRepositoryImpl$requestCreditLineIncrease$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1) continuation;
            if ((cLIApplicationRepositoryImpl$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cLIApplicationRepositoryImpl$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1 cLIApplicationRepositoryImpl$requestCreditLineIncrease$12 = cLIApplicationRepositoryImpl$requestCreditLineIncrease$1;
                java.lang.Object obj = cLIApplicationRepositoryImpl$requestCreditLineIncrease$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApplicationRepositoryImpl$requestCreditLineIncrease$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String currencyCode = requestCreditLineIncreaseRequest.getCurrencyCode();
                    java.lang.String revisedAmount = requestCreditLineIncreaseRequest.getRevisedAmount();
                    com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = revisedAmount != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode, revisedAmount) : null;
                    java.lang.String requestedLimit = requestCreditLineIncreaseRequest.getRequestedLimit();
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation requestRevolvingCreditLineIncreaseMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation(new com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput(requestCreditLineIncreaseRequest.getCreditAccountId(), new com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseIncomeInput(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode, requestCreditLineIncreaseRequest.getIncomeAmount()), com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.cli.CLIApplicationMapperKt.toRevolvingCreditIncomePeriod(requestCreditLineIncreaseRequest.getPeriod()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(moneyInput)), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(requestedLimit != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode, requestedLimit) : null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(requestCreditLineIncreaseRequest.getOfferId())));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl.m18031$r8$lambda$7O5L2rVc6VLDtXz3YQ8tEfXPE4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl.m18032$r8$lambda$zfNHlHCM5LZB8QhS9tW23jvVo((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data) obj2);
                        }
                    };
                    cLIApplicationRepositoryImpl$requestCreditLineIncrease$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestCreditLineIncreaseRequest);
                    cLIApplicationRepositoryImpl$requestCreditLineIncrease$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestRevolvingCreditLineIncreaseMutation);
                    cLIApplicationRepositoryImpl$requestCreditLineIncrease$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighSpeedVideoFpsRangesFor, requestRevolvingCreditLineIncreaseMutation, function1, function12, null, null, cLIApplicationRepositoryImpl$requestCreditLineIncrease$12, 24, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult cLIIncreaseResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult) ((arrow.core.Either.Right) either).getValue();
                    return (cLIIncreaseResult == null || (rightIor = arrow.core.IorKt.rightIor(cLIIncreaseResult)) == null) ? new arrow.core.Ior.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError.Default.INSTANCE) : rightIor;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cLIApplicationRepositoryImpl$requestCreditLineIncrease$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1 cLIApplicationRepositoryImpl$requestCreditLineIncrease$122 = cLIApplicationRepositoryImpl$requestCreditLineIncrease$1;
        java.lang.Object obj2 = cLIApplicationRepositoryImpl$requestCreditLineIncrease$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApplicationRepositoryImpl$requestCreditLineIncrease$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* renamed from: $r8$lambda$7O5L2rVc6VLDtX-z3YQ8tEfXPE4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError m18031$r8$lambda$7O5L2rVc6VLDtXz3YQ8tEfXPE4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl cLIApplicationRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError.Default.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$zfNHlHCM5LZB8QhS9tW--23jvVo, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult m18032$r8$lambda$zfNHlHCM5LZB8QhS9tW23jvVo(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.cli.CLIApplicationMapperKt.toResult(data);
    }
}
