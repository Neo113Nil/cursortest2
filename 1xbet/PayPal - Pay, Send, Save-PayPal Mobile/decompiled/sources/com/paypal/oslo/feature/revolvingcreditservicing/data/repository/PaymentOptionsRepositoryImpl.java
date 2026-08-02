package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentOptionsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentOptionsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;", "fetchPaymentOptions", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentOptionsRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PaymentOptionsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPaymentOptions(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1 paymentOptionsRepositoryImpl$fetchPaymentOptions$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1) {
            paymentOptionsRepositoryImpl$fetchPaymentOptions$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1) continuation;
            if ((paymentOptionsRepositoryImpl$fetchPaymentOptions$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                paymentOptionsRepositoryImpl$fetchPaymentOptions$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1 paymentOptionsRepositoryImpl$fetchPaymentOptions$12 = paymentOptionsRepositoryImpl$fetchPaymentOptions$1;
                java.lang.Object obj = paymentOptionsRepositoryImpl$fetchPaymentOptions$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentOptionsRepositoryImpl$fetchPaymentOptions$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery getRevolvingCreditPaymentOptionsOverviewQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(paymentOptionsRequest.getCreditProductIdentifier()));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl.$r8$lambda$m1CvCkNA5wHw6uNCRgDg3DkSfEQ((com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl.$r8$lambda$xYrrtTwJWu0fmKToqvnVARZRtrw((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl.m18037$r8$lambda$aBMGVJaKnc5OXTmTAqhl2edQlQ(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    paymentOptionsRepositoryImpl$fetchPaymentOptions$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptionsRequest);
                    paymentOptionsRepositoryImpl$fetchPaymentOptions$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getRevolvingCreditPaymentOptionsOverviewQuery);
                    paymentOptionsRepositoryImpl$fetchPaymentOptions$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchData$default(this, this.getHighSpeedVideoFpsRanges, getRevolvingCreditPaymentOptionsOverviewQuery, function1, function12, null, function13, paymentOptionsRepositoryImpl$fetchPaymentOptions$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) ((arrow.core.Ior.Right) ior).getValue();
                    if (paymentOptions != null) {
                        return new arrow.core.Ior.Right(paymentOptions);
                    }
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Server returned empty result", null, null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) both.getRightValue();
                return paymentOptions2 != null ? new arrow.core.Ior.Right(paymentOptions2) : new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) leftValue);
            }
        }
        paymentOptionsRepositoryImpl$fetchPaymentOptions$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1 paymentOptionsRepositoryImpl$fetchPaymentOptions$122 = paymentOptionsRepositoryImpl$fetchPaymentOptions$1;
        java.lang.Object obj2 = paymentOptionsRepositoryImpl$fetchPaymentOptions$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentOptionsRepositoryImpl$fetchPaymentOptions$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* renamed from: $r8$lambda$aBMGVJaKnc5OXT-mTAqhl2edQlQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18037$r8$lambda$aBMGVJaKnc5OXTmTAqhl2edQlQ(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(paymentOptionsRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.core.network.graphql.error.CallError $r8$lambda$m1CvCkNA5wHw6uNCRgDg3DkSfEQ(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return callError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions $r8$lambda$xYrrtTwJWu0fmKToqvnVARZRtrw(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PaymentOptionsMapperKt.toDomain(data);
    }
}
