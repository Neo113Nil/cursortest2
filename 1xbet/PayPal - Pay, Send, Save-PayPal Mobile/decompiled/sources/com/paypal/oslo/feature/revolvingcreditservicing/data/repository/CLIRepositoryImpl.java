package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageData;", "fetchCreditLineIncreaseOffer", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CLIRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchCreditLineIncreaseOffer(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1;
        int i;
        com.apollographql.apollo.api.Optional optional;
        arrow.core.Either either;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1) {
            cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1) continuation;
            if ((cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12 = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1;
                java.lang.Object obj = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier graphql = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(creditProductIdentifier);
                    if (str == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(str)) == null) {
                        optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery getPPCUKCreditLineIncreaseOfferQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery(graphql, optional);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl.m18034$r8$lambda$bhlPWSOfz5fhOVt5G3_4hEuZKw(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl.m18033$r8$lambda$6SwdzJqkcYaJEU1g0WDvIpBs5E(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.Data) obj2);
                        }
                    };
                    cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPPCUKCreditLineIncreaseOfferQuery);
                    cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchData$default(this, this.getHighSpeedVideoFpsRangesFor, getPPCUKCreditLineIncreaseOfferQuery, function1, function12, null, null, cLIRepositoryImpl$fetchCreditLineIncreaseOffer$12, 24, null);
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
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData cLIManageData = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData) ((arrow.core.Either.Right) either).getValue();
                    return (cLIManageData == null || (rightIor = arrow.core.IorKt.rightIor(cLIManageData)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError.Default.INSTANCE) : rightIor;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 cLIRepositoryImpl$fetchCreditLineIncreaseOffer$122 = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$1;
        java.lang.Object obj2 = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIRepositoryImpl$fetchCreditLineIncreaseOffer$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* renamed from: $r8$lambda$6SwdzJqkcY-aJEU1g0WDvIpBs5E, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData m18033$r8$lambda$6SwdzJqkcYaJEU1g0WDvIpBs5E(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl cLIRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.CurrentCreditLimit currentCreditLimit;
        java.lang.Object creditAccountId;
        java.lang.String obj;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.Legal legal;
        java.lang.Object privacyStatementUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.RevolvingCreditLineIncreaseOffer revolvingCreditLineIncreaseOffer = data.getRevolvingCreditLineIncreaseOffer();
        java.lang.String str = null;
        if (revolvingCreditLineIncreaseOffer != null && (currentCreditLimit = revolvingCreditLineIncreaseOffer.getCurrentCreditLimit()) != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currentCreditLimit.getCurrencyCode().toString(), currentCreditLimit.getValue());
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(revolvingCreditLineIncreaseOffer.getNewCreditLimit().getCurrencyCode().toString(), revolvingCreditLineIncreaseOffer.getNewCreditLimit().getValue());
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(revolvingCreditLineIncreaseOffer.getMaximumProjectedMinimumPaymentDue().getCurrencyCode().toString(), revolvingCreditLineIncreaseOffer.getMaximumProjectedMinimumPaymentDue().getValue());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
            if (revolvingCreditAccount != null && (creditAccountId = revolvingCreditAccount.getCreditAccountId()) != null && (obj = creditAccountId.toString()) != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus fromString = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.INSTANCE.fromString(revolvingCreditLineIncreaseOffer.getStatus().toString());
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason from = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.INSTANCE.from(revolvingCreditLineIncreaseOffer.getStatusReason());
                java.lang.String obj2 = revolvingCreditLineIncreaseOffer.getId().toString();
                java.lang.String obj3 = revolvingCreditLineIncreaseOffer.getExpirationTime().toString();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKCreditLineIncreaseOfferQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
                if (revolvingCreditServicingContent != null && (legal = revolvingCreditServicingContent.getLegal()) != null && (privacyStatementUrl = legal.getPrivacyStatementUrl()) != null) {
                    str = privacyStatementUrl.toString();
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData(obj, currencyAmount, currencyAmount2, fromString, from, false, obj2, currencyAmount3, obj3, str);
            }
        }
        return null;
    }

    /* renamed from: $r8$lambda$bhlPWSOfz5fhOVt5G3_4hEu-ZKw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError m18034$r8$lambda$bhlPWSOfz5fhOVt5G3_4hEuZKw(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl cLIRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError.GraphQL.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
