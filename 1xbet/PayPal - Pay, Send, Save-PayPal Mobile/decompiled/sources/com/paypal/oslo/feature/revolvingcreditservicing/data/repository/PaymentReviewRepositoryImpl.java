package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentReviewRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/payments/MakePaymentResponseMapper;", "responseMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/payments/MakePaymentResponseMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "makePayment", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/payments/MakePaymentResponseMapper;", "getHighSpeedVideoFpsRangesFor", "Companion_"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository {

    @java.lang.Deprecated
    public static final java.lang.String ISSUE_MAX_PAYMENTS_THRESHOLD_REACHED = "MAX_PAYMENTS_THRESHOLD_REACHED_ON_SAME_DAY";
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.Companion_ Companion_ = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.Companion_(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PaymentReviewRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper makePaymentResponseMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePaymentResponseMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = makePaymentResponseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object makePayment(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1 paymentReviewRepositoryImpl$makePayment$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1) {
            paymentReviewRepositoryImpl$makePayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1) continuation;
            if ((paymentReviewRepositoryImpl$makePayment$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                paymentReviewRepositoryImpl$makePayment$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1 paymentReviewRepositoryImpl$makePayment$12 = paymentReviewRepositoryImpl$makePayment$1;
                java.lang.Object obj = paymentReviewRepositoryImpl$makePayment$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentReviewRepositoryImpl$makePayment$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier graphql = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(makePaymentRequest.getCreditProductIdentifier());
                    java.lang.String creditAccountId = makePaymentRequest.getCreditAccountId();
                    int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[makePaymentRequest.getPaymentType().ordinal()];
                    if (i2 == 1) {
                        revolvingCreditPaymentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.REAL_TIME;
                    } else if (i2 == 2) {
                        revolvingCreditPaymentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.SCHEDULED;
                    } else if (i2 == 3) {
                        revolvingCreditPaymentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.AUTOPAY;
                    } else {
                        if (i2 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        revolvingCreditPaymentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.UNKNOWN__;
                    }
                    com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType2 = revolvingCreditPaymentType;
                    com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(makePaymentRequest.getAmount().getCurrencyCode(), makePaymentRequest.getAmount().getValue());
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.time.LocalDate date = makePaymentRequest.getDate();
                    com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(date != null ? date.toString() : null);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments = makePaymentRequest.getFundingInstruments();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments, 10));
                    java.util.Iterator<T> it = fundingInstruments.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment.FundingInstrumentDataMapperKt.toGraphQl((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) it.next()));
                    }
                    com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput makeRevolvingCreditPaymentInput = new com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput(graphql, creditAccountId, revolvingCreditPaymentType2, null, presentIfNotNull, moneyInput, arrayList, 8, null);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation makeRevolvingCreditPaymentMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation(makeRevolvingCreditPaymentInput);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.$r8$lambda$Nkt18czXs_DpZHyuIa8DUvXi2aM(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.m18038$r8$lambda$STPQ1TKOc9W2o3SvRJwokLJcjs(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl.$r8$lambda$lNHG8Wjnts5J_vpa7EhSsvlrRSE(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    paymentReviewRepositoryImpl$makePayment$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePaymentRequest);
                    paymentReviewRepositoryImpl$makePayment$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeRevolvingCreditPaymentInput);
                    paymentReviewRepositoryImpl$makePayment$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeRevolvingCreditPaymentMutation);
                    paymentReviewRepositoryImpl$makePayment$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighResolutionOutputSizeshNQ4ISI, makeRevolvingCreditPaymentMutation, function1, function12, null, function13, paymentReviewRepositoryImpl$makePayment$12, 8, null);
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
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse) ((arrow.core.Ior.Right) ior).getValue();
                    return (makePaymentResponse == null || (rightIor = arrow.core.IorKt.rightIor(makePaymentResponse)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.InvalidResponse.INSTANCE) : rightIor;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse) both.getRightValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError paymentError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError) leftValue;
                    if (paymentError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing) {
                        return arrow.core.IorKt.leftIor(paymentError);
                    }
                    if (makePaymentResponse2 != null) {
                        return new arrow.core.Ior.Both(paymentError, makePaymentResponse2);
                    }
                    return arrow.core.IorKt.leftIor(paymentError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentReviewRepositoryImpl$makePayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl$makePayment$1 paymentReviewRepositoryImpl$makePayment$122 = paymentReviewRepositoryImpl$makePayment$1;
        java.lang.Object obj2 = paymentReviewRepositoryImpl$makePayment$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentReviewRepositoryImpl$makePayment$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentReviewRepositoryImpl$Companion_;", "", "<init>", "()V", "", "ISSUE_MAX_PAYMENTS_THRESHOLD_REACHED", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$-STPQ1TKOc9W2o3SvRJwokLJcjs, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse m18038$r8$lambda$STPQ1TKOc9W2o3SvRJwokLJcjs(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl paymentReviewRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return paymentReviewRepositoryImpl.getHighSpeedVideoFpsRangesFor.toDomain(data);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError $r8$lambda$Nkt18czXs_DpZHyuIa8DUvXi2aM(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl paymentReviewRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        if (graphQL.isCritical()) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.CriticalFieldsMissing(graphQL.getAffectedCriticalPaths());
        }
        if (!graphQL.getAffectedCriticalPaths().isEmpty()) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.PartialDataAvailable(graphQL.getAffectedCriticalPaths());
        }
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        if (!(m9567boximpl instanceof java.util.Collection) || !m9567boximpl.isEmpty()) {
            java.util.Iterator<E> it = m9567boximpl.iterator();
            while (it.hasNext()) {
                java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getExtensions();
                java.lang.Object obj = extensions != null ? extensions.get("details") : null;
                java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
                if (list != null) {
                    java.util.List list2 = list;
                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        for (java.lang.Object obj2 : list2) {
                            java.util.Map map = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(map != null ? map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE) : null, ISSUE_MAX_PAYMENTS_THRESHOLD_REACHED)) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.MaxPaymentsThresholdReached.INSTANCE;
                            }
                        }
                    }
                }
            }
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.Default.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lNHG8Wjnts5J_vpa7EhSsvlrRSE(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(makePaymentRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.AUTOPAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
