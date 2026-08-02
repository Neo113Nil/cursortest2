package com.paypal.oslo.feature.identity.stepup;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/StepupChallengeHandlerImpl;", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/FetchStepupChallengesUseCase;", "fetchStepupChallengesUseCase", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/FetchStepupChallengesUseCase;)V", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/stepup/StepupError;", "Lcom/paypal/oslo/core/identity/stepup/StepupSuccess;", "handleStepup", "(Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "p0", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/FetchStepupChallengesUseCase;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepupChallengeHandlerImpl implements com.paypal.oslo.core.identity.stepup.StepupChallengeHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl.Companion Companion = new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public StepupChallengeHandlerImpl(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase fetchStepupChallengesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchStepupChallengesUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = fetchStepupChallengesUseCase;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r4 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.core.identity.stepup.StepupChallengeHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handleStepup(com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> continuation) {
        com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$handleStepup$1 stepupChallengeHandlerImpl$handleStepup$1;
        int i;
        final java.lang.String m11594generateQDVFmTU;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult mapToChallengeResult;
        java.lang.Object highSpeedVideoSizes;
        final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;
        if (continuation instanceof com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$handleStepup$1) {
            stepupChallengeHandlerImpl$handleStepup$1 = (com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$handleStepup$1) continuation;
            if ((stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = stepupChallengeHandlerImpl$handleStepup$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    m11594generateQDVFmTU = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Handling transaction step-up challenge", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", m11594generateQDVFmTU)), null, 4, null);
                    mapToChallengeResult = com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper.INSTANCE.mapToChallengeResult(stepupChallengeInput);
                    stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                    stepupChallengeHandlerImpl$handleStepup$1.getHighResolutionOutputSizeshNQ4ISI = m11594generateQDVFmTU;
                    stepupChallengeHandlerImpl$handleStepup$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapToChallengeResult);
                    stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor = 1;
                    highSpeedVideoSizes = getHighSpeedVideoSizes(mapToChallengeResult, m11594generateQDVFmTU, stepupChallengeHandlerImpl$handleStepup$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult) stepupChallengeHandlerImpl$handleStepup$1.Camera2StreamConfigurationMap;
                    m11594generateQDVFmTU = (java.lang.String) stepupChallengeHandlerImpl$handleStepup$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput2 = (com.paypal.oslo.core.identity.stepup.StepupChallengeInput) stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mapToChallengeResult = challengeResult2;
                    stepupChallengeInput = stepupChallengeInput2;
                    highSpeedVideoSizes = obj;
                }
                challengeResult = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult) highSpeedVideoSizes;
                if (challengeResult != null) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.identity.stepup.StepupError.StepupFailed("Failed to load verification methods"));
                }
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(m11594generateQDVFmTU, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl.m15357$r8$lambda$GVJPS1f_dH4GNSCJELNFoukWzU(m11594generateQDVFmTU, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepupChallengeInput);
                stepupChallengeHandlerImpl$handleStepup$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11594generateQDVFmTU);
                stepupChallengeHandlerImpl$handleStepup$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapToChallengeResult);
                stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(challengeResult);
                stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object highSpeedVideoSizes2 = getHighSpeedVideoSizes(m11594generateQDVFmTU, stepupChallengeHandlerImpl$handleStepup$1);
                return highSpeedVideoSizes2 == coroutine_suspended ? coroutine_suspended : highSpeedVideoSizes2;
            }
        }
        stepupChallengeHandlerImpl$handleStepup$1 = new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$handleStepup$1(this, continuation);
        java.lang.Object obj2 = stepupChallengeHandlerImpl$handleStepup$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepupChallengeHandlerImpl$handleStepup$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        challengeResult = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult) highSpeedVideoSizes;
        if (challengeResult != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult> continuation) {
        com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1 stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1;
        int i;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult2;
        java.lang.String str2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1) {
            stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1 = (com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1) continuation;
            if ((stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!challengeResult.getAvailableChallenges().isEmpty() || challengeResult.getTransactionChallengeContext() == null) {
                        return challengeResult;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Prefetching challenges before navigation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", str)), null, 4, null);
                    com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase fetchStepupChallengesUseCase = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.TransactionChallengeContext transactionChallengeContext = challengeResult.getTransactionChallengeContext();
                    stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoSizes = challengeResult;
                    stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = fetchStepupChallengesUseCase.invoke(transactionChallengeContext, stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    challengeResult2 = challengeResult;
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult3 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult) stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    challengeResult2 = challengeResult3;
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Successfully prefetched challenges", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", str2), kotlin.TuplesKt.to("challengeCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
                    return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult.copy$default(challengeResult2, list, null, null, null, 14, null);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to prefetch challenges", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", str2), kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError) ((arrow.core.Either.Left) either).getValue()).getClass()).getSimpleName())), null, 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1 = new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1(this, continuation);
        java.lang.Object obj2 = stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Navigated to StepupDestination, waiting for user completion", null, null, 6, null);
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$awaitStepupResult$2(str, CompletableDeferred$default, this, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/StepupChallengeHandlerImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$GV-JPS1f_dH4GNSCJELNFoukWzU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15357$r8$lambda$GVJPS1f_dH4GNSCJELNFoukWzU(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: access$logResult-hN0UB1M, reason: not valid java name */
    public static final /* synthetic */ void m15359access$logResulthN0UB1M(com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl stepupChallengeHandlerImpl, arrow.core.Either either, java.lang.String str) {
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", str), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.identity.stepup.StepupSuccess) ((arrow.core.Either.Right) either).getValue()).getClass()).getSimpleName())), null, 4, null);
        } else {
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up failed/canceled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", str), kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.identity.stepup.StepupError) ((arrow.core.Either.Left) either).getValue()).getClass()).getSimpleName())), null, 4, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
