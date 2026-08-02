package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\b\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentSummaryRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentSummaryRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentSummaryRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "fetchPaymentSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentSummaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/CancelRepaymentResponse;", "cancelScheduledPayment", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryError;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PaymentSummaryRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPaymentSummary(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest paymentSummaryRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1 paymentSummaryRepositoryImpl$fetchPaymentSummary$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1) {
            paymentSummaryRepositoryImpl$fetchPaymentSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1) continuation;
            if ((paymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                paymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1 paymentSummaryRepositoryImpl$fetchPaymentSummary$12 = paymentSummaryRepositoryImpl$fetchPaymentSummary$1;
                java.lang.Object obj = paymentSummaryRepositoryImpl$fetchPaymentSummary$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryRepositoryImpl$fetchPaymentSummary$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery getRevolvingCreditPaymentsSummaryOverviewQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(paymentSummaryRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(paymentSummaryRequest.getCreditAccountId()));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.m18039$r8$lambda$9o466Xb9Qi6XCvhkTHHMhQiJ_8(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.$r8$lambda$EB4CO72kEgsMWz7F1Y22lTq0T1w((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.$r8$lambda$AaEWdnFamqMKcnjTwSOXyoJYPCs(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    paymentSummaryRepositoryImpl$fetchPaymentSummary$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryRequest);
                    paymentSummaryRepositoryImpl$fetchPaymentSummary$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getRevolvingCreditPaymentsSummaryOverviewQuery);
                    paymentSummaryRepositoryImpl$fetchPaymentSummary$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchData$default(this, this.getHighSpeedVideoSizes, getRevolvingCreditPaymentsSummaryOverviewQuery, function1, function12, null, function13, paymentSummaryRepositoryImpl$fetchPaymentSummary$12, 8, null);
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
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) ((arrow.core.Ior.Right) ior).getValue();
                    return (paymentSummaryOverview == null || (rightIor = arrow.core.IorKt.rightIor(paymentSummaryOverview)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError.Default.INSTANCE) : rightIor;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError) leftValue);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentSummaryRepositoryImpl$fetchPaymentSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1 paymentSummaryRepositoryImpl$fetchPaymentSummary$122 = paymentSummaryRepositoryImpl$fetchPaymentSummary$1;
        java.lang.Object obj2 = paymentSummaryRepositoryImpl$fetchPaymentSummary$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryRepositoryImpl$fetchPaymentSummary$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelScheduledPayment(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1 paymentSummaryRepositoryImpl$cancelScheduledPayment$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1) {
            paymentSummaryRepositoryImpl$cancelScheduledPayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1) continuation;
            if ((paymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                paymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1 paymentSummaryRepositoryImpl$cancelScheduledPayment$12 = paymentSummaryRepositoryImpl$cancelScheduledPayment$1;
                java.lang.Object obj = paymentSummaryRepositoryImpl$cancelScheduledPayment$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryRepositoryImpl$cancelScheduledPayment$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation cancelRevolvingCreditPaymentMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation(new com.paypal.oslo.api.graphql.schema.type.CancelRevolvingCreditPaymentInput(cancelRepaymentRequest.getCreditAccountId(), cancelRepaymentRequest.getPaymentId(), com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(cancelRepaymentRequest.getCreditProductIdentifier())));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.m18042$r8$lambda$sgsOZjYB8N_ee7uQD76SwrFclg(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.m18041$r8$lambda$mFuAM6FdY6Bf8HnV8Vl2NKtZ3w((com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl.m18040$r8$lambda$fae2LSz5KvPVu0aeUZcHjyTSrI(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    paymentSummaryRepositoryImpl$cancelScheduledPayment$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    paymentSummaryRepositoryImpl$cancelScheduledPayment$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRevolvingCreditPaymentMutation);
                    paymentSummaryRepositoryImpl$cancelScheduledPayment$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighSpeedVideoSizes, cancelRevolvingCreditPaymentMutation, function1, function12, null, function13, paymentSummaryRepositoryImpl$cancelScheduledPayment$12, 8, null);
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
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse cancelRepaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse) ((arrow.core.Either.Right) either).getValue();
                    return cancelRepaymentResponse != null ? new arrow.core.Ior.Right(cancelRepaymentResponse) : new arrow.core.Ior.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError.Default.INSTANCE);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentSummaryRepositoryImpl$cancelScheduledPayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1 paymentSummaryRepositoryImpl$cancelScheduledPayment$122 = paymentSummaryRepositoryImpl$cancelScheduledPayment$1;
        java.lang.Object obj2 = paymentSummaryRepositoryImpl$cancelScheduledPayment$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryRepositoryImpl$cancelScheduledPayment$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError.Default.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$9o466Xb9Qi6XCv-hkTHHMhQiJ_8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError m18039$r8$lambda$9o466Xb9Qi6XCvhkTHHMhQiJ_8(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl paymentSummaryRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoFpsRangesFor(callError);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AaEWdnFamqMKcnjTwSOXyoJYPCs(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest paymentSummaryRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(paymentSummaryRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview $r8$lambda$EB4CO72kEgsMWz7F1Y22lTq0T1w(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentSummaryMapperKt.toDomain(data);
    }

    /* renamed from: $r8$lambda$fae2LSz5KvPVu0-aeUZcHjyTSrI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18040$r8$lambda$fae2LSz5KvPVu0aeUZcHjyTSrI(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(cancelRepaymentRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mFuAM6FdY6Bf8Hn-V8Vl2NKtZ3w, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse m18041$r8$lambda$mFuAM6FdY6Bf8HnV8Vl2NKtZ3w(com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.CancelPaymentResponseMapperKt.toDomain(data);
    }

    /* renamed from: $r8$lambda$sgsOZjYB8N_ee7uQD76S-wrFclg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError m18042$r8$lambda$sgsOZjYB8N_ee7uQD76SwrFclg(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl paymentSummaryRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoFpsRangesFor(callError);
    }
}
