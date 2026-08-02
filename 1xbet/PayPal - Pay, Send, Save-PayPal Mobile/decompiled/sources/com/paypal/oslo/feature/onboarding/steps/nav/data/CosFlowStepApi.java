package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepApi;", "", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepMapper;", "cosFlowStepMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepMapper;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowSteps;", "queryFlowStep-3FChOw0", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFlowStep", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosFlowStepApi {
    public static final int $stable = 8;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CosFlowStepApi(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper cosFlowStepMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cosFlowStepMapper, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoFpsRanges = cosFlowStepMapper;
    }

    /* renamed from: queryFlowStep-3FChOw0$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16510queryFlowStep3FChOw0$default(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi cosFlowStepApi, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            transition = null;
        }
        return cosFlowStepApi.m16511queryFlowStep3FChOw0(str, str2, transition, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: queryFlowStep-3FChOw0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m16511queryFlowStep3FChOw0(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError, com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps>> continuation) {
        com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1 cosFlowStepApi$queryFlowStep$1;
        int i;
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition2;
        java.lang.String str3;
        com.paypal.oslo.api.graphql.schema.type.OnboardingTransition onboardingTransition;
        java.util.ArrayList arrayList;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1) {
            cosFlowStepApi$queryFlowStep$1 = (com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1) continuation;
            if ((cosFlowStepApi$queryFlowStep$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                cosFlowStepApi$queryFlowStep$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1 cosFlowStepApi$queryFlowStep$12 = cosFlowStepApi$queryFlowStep$1;
                java.lang.Object obj = cosFlowStepApi$queryFlowStep$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cosFlowStepApi$queryFlowStep$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (str2 == null ? false : com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(str2, com.paypal.oslo.feature.onboarding.api.steps.domain.StepIdKt.getInitialStepId())) {
                        transition2 = transition;
                        str3 = null;
                    } else {
                        transition2 = transition;
                        str3 = str2;
                    }
                    com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition3 = transition2 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial ? null : transition2;
                    com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
                    com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3 != null ? str3 : null);
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    if ((transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial) || transition3 == null) {
                        onboardingTransition = null;
                    } else if (transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next) {
                        onboardingTransition = com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.NEXT;
                    } else if (transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip) {
                        onboardingTransition = com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.SKIP;
                    } else if (transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close) {
                        onboardingTransition = com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.CLOSE;
                    } else {
                        if (!(transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Fail)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        onboardingTransition = com.paypal.oslo.api.graphql.schema.type.OnboardingTransition.FAIL;
                    }
                    com.apollographql.apollo.api.Optional presentIfNotNull2 = companion.presentIfNotNull(onboardingTransition);
                    com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                    if (transition3 instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next) {
                        java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> inputs = ((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next) transition3).getInputs();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(inputs, 10));
                        for (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData : inputs) {
                            arrayList2.add(new com.paypal.oslo.api.graphql.schema.type.OnboardingFlowInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(flowData.getKey()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(flowData.getValue())));
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        arrayList = arrayList3.isEmpty() ? null : arrayList3;
                    } else {
                        arrayList = null;
                    }
                    com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery getOnboardingFlowStepsQuery = new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery(new com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput(presentIfNotNull, presentIfNotNull2, str, companion2.presentIfNotNull(arrayList)));
                    cosFlowStepApi$queryFlowStep$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cosFlowStepApi$queryFlowStep$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cosFlowStepApi$queryFlowStep$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transition);
                    cosFlowStepApi$queryFlowStep$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    cosFlowStepApi$queryFlowStep$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transition3);
                    cosFlowStepApi$queryFlowStep$12.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient2, getOnboardingFlowStepsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cosFlowStepApi$queryFlowStep$12, 2, (java.lang.Object) null);
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
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(this.getHighSpeedVideoFpsRanges.mapToStepError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    kotlin.Pair<java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>, java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey>> mapToSteps = this.getHighSpeedVideoFpsRanges.mapToSteps((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData());
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps(mapToSteps.component1(), mapToSteps.component2()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cosFlowStepApi$queryFlowStep$1 = new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1(this, continuation);
        com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1 cosFlowStepApi$queryFlowStep$122 = cosFlowStepApi$queryFlowStep$1;
        java.lang.Object obj2 = cosFlowStepApi$queryFlowStep$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cosFlowStepApi$queryFlowStep$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
