package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/SpecialFinancingRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "getSpecialFinancingPage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SpecialFinancingRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSpecialFinancingPage(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1 specialFinancingRepositoryImpl$getSpecialFinancingPage$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage$default;
        arrow.core.Ior rightIor;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1) {
            specialFinancingRepositoryImpl$getSpecialFinancingPage$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1) continuation;
            if ((specialFinancingRepositoryImpl$getSpecialFinancingPage$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                specialFinancingRepositoryImpl$getSpecialFinancingPage$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1 specialFinancingRepositoryImpl$getSpecialFinancingPage$12 = specialFinancingRepositoryImpl$getSpecialFinancingPage$1;
                java.lang.Object obj = specialFinancingRepositoryImpl$getSpecialFinancingPage$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingRepositoryImpl$getSpecialFinancingPage$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery getRevolvingCreditPromotionalActivitiesQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(specialFinancingRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(specialFinancingRequest.getCreditAccountId()), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(specialFinancingRequest.getOffset())));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl.m18044$r8$lambda$ZaA_MaPsZ7oXUSoJ1toQE_sWd4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl.$r8$lambda$x0V0ek8_jwOVsHIovLcKr3knQSk((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl.m18045$r8$lambda$txqHkGrsgKv0sJCGIXDFNK6I(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    specialFinancingRepositoryImpl$getSpecialFinancingPage$12.getHighSpeedVideoFpsRanges = specialFinancingRequest;
                    specialFinancingRepositoryImpl$getSpecialFinancingPage$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getRevolvingCreditPromotionalActivitiesQuery);
                    specialFinancingRepositoryImpl$getSpecialFinancingPage$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchData$default(this, this.getHighResolutionOutputSizeshNQ4ISI, getRevolvingCreditPromotionalActivitiesQuery, function1, function12, null, function13, specialFinancingRepositoryImpl$getSpecialFinancingPage$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    specialFinancingRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest) specialFinancingRepositoryImpl$getSpecialFinancingPage$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data data = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data) ((arrow.core.Ior.Right) ior).getValue();
                    return (data == null || (specialFinancingPage$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.specialfinancing.SpecialFinancingPageMapperKt.toSpecialFinancingPage$default(data, specialFinancingRequest.getOffset(), false, 2, (java.lang.Object) null)) == null || (rightIor = arrow.core.IorKt.rightIor(specialFinancingPage$default)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError.Default.INSTANCE) : rightIor;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError) leftValue);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        specialFinancingRepositoryImpl$getSpecialFinancingPage$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1 specialFinancingRepositoryImpl$getSpecialFinancingPage$122 = specialFinancingRepositoryImpl$getSpecialFinancingPage$1;
        java.lang.Object obj2 = specialFinancingRepositoryImpl$getSpecialFinancingPage$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingRepositoryImpl$getSpecialFinancingPage$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* renamed from: $r8$lambda$ZaA_MaPsZ-7oXUSoJ1toQE_sWd4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError m18044$r8$lambda$ZaA_MaPsZ7oXUSoJ1toQE_sWd4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl specialFinancingRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError.Default.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$txqHkGrsgKv0s-JCGIX-D-FNK6I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18045$r8$lambda$txqHkGrsgKv0sJCGIXDFNK6I(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(specialFinancingRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data $r8$lambda$x0V0ek8_jwOVsHIovLcKr3knQSk(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data;
    }
}
