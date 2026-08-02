package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2", f = "GetRewardsSummaryUseCase.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {97, 98, 110, 116, 121}, m = "invokeSuspend", n = {"$this$coroutineScope", "deferredRewardsSummary", "deferredPayPalDebitCard", "deferredRedeemContent", "$this$coroutineScope", "deferredRewardsSummary", "deferredPayPalDebitCard", "deferredRedeemContent", "$this$coroutineScope", "deferredRewardsSummary", "deferredPayPalDebitCard", "deferredRedeemContent", "rewardsSummaryWithPayPalDebitCard", "$i$a$-let-GetRewardsSummaryUseCase$invoke$2$2", "$this$coroutineScope", "deferredRewardsSummary", "deferredPayPalDebitCard", "deferredRedeemContent", "adjusted", "$i$a$-let-GetRewardsSummaryUseCase$invoke$2$3", "$this$coroutineScope", "deferredRewardsSummary", "deferredPayPalDebitCard", "deferredRedeemContent", "combined", "$i$a$-let-GetRewardsSummaryUseCase$invoke$2$4"}, nl = {98, 96, 112, 114, 120}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetRewardsSummaryUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response) {
        return response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01d5, code lost:
    
        if (r1 == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x019b, code lost:
    
        if (r7 != r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016a, code lost:
    
        if (r2 == r8) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred async$default3;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils useCaseUtils;
        java.lang.Object await;
        kotlinx.coroutines.Deferred deferred;
        kotlinx.coroutines.Deferred deferred2;
        java.lang.Object await2;
        kotlinx.coroutines.Deferred deferred3;
        arrow.core.Ior ior;
        java.lang.Object adjustDebitCardVisibility$shopping_rewards_prodRelease;
        arrow.core.Ior ior2;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils useCaseUtils2;
        java.lang.Object await3;
        java.lang.Object resolveRedeemEligibility$shopping_rewards_prodRelease;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1(this.getInputFormats, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredPayPalDebitCard$1(this.getInputFormats, null), 3, null);
            async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRedeemContent$1(this.getInputFormats, null), 3, null);
            useCaseUtils = com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils.INSTANCE;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getHighSpeedVideoSizes = async$default2;
            this.getHighSpeedVideoFpsRanges = async$default3;
            this.getHighSpeedVideoFpsRangesFor = useCaseUtils;
            this.getOutputFormats = 1;
            await = async$default.await(this);
            if (await != coroutine_suspended) {
                deferred = async$default;
                deferred2 = async$default2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils useCaseUtils3 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils) this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.Deferred deferred4 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.Deferred deferred5 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlinx.coroutines.Deferred deferred6 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            deferred = deferred6;
            deferred2 = deferred5;
            await = obj;
            useCaseUtils = useCaseUtils3;
            async$default3 = deferred4;
        } else if (i == 2) {
            ior = (arrow.core.Ior) this.getInputSizeshNQ4ISI;
            useCaseUtils = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils) this.getHighSpeedVideoFpsRangesFor;
            deferred3 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            deferred2 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            deferred = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            await2 = obj;
            arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> combineResults$shopping_rewards_prodRelease = useCaseUtils.combineResults$shopping_rewards_prodRelease(ior, (arrow.core.Ior) await2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) obj2, (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.PpdcCard) obj3);
                }
            });
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase = this.getInputFormats;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getHighSpeedVideoFpsRanges = deferred3;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(combineResults$shopping_rewards_prodRelease);
            this.getInputSizeshNQ4ISI = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputFormats = 3;
            adjustDebitCardVisibility$shopping_rewards_prodRelease = getRewardsSummaryUseCase.adjustDebitCardVisibility$shopping_rewards_prodRelease(combineResults$shopping_rewards_prodRelease, this);
        } else if (i == 3) {
            kotlinx.coroutines.Deferred deferred7 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.Deferred deferred8 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlinx.coroutines.Deferred deferred9 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            deferred2 = deferred8;
            deferred = deferred9;
            deferred3 = deferred7;
            adjustDebitCardVisibility$shopping_rewards_prodRelease = obj;
            ior2 = (arrow.core.Ior) adjustDebitCardVisibility$shopping_rewards_prodRelease;
            useCaseUtils2 = com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils.INSTANCE;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior2);
            this.getInputSizeshNQ4ISI = ior2;
            this.getHighSpeedVideoSizesFor = useCaseUtils2;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputFormats = 4;
            await3 = deferred3.await(this);
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                resolveRedeemEligibility$shopping_rewards_prodRelease = obj;
                return this.getInputFormats.toUseCaseResult((arrow.core.Ior) resolveRedeemEligibility$shopping_rewards_prodRelease, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2.Camera2StreamConfigurationMap((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) obj2);
                    }
                });
            }
            useCaseUtils2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseUtils) this.getHighSpeedVideoSizesFor;
            ior2 = (arrow.core.Ior) this.getInputSizeshNQ4ISI;
            deferred3 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            deferred2 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            deferred = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            await3 = obj;
            arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Pair<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData>>>> combineResults$shopping_rewards_prodRelease2 = useCaseUtils2.combineResults$shopping_rewards_prodRelease(ior2, (arrow.core.Ior) await3, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Pair pair;
                    pair = kotlin.TuplesKt.to((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) obj2, (java.util.List) obj3);
                    return pair;
                }
            });
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase2 = this.getInputFormats;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(combineResults$shopping_rewards_prodRelease2);
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputFormats = 5;
            resolveRedeemEligibility$shopping_rewards_prodRelease = getRewardsSummaryUseCase2.resolveRedeemEligibility$shopping_rewards_prodRelease(combineResults$shopping_rewards_prodRelease2, this);
        }
        arrow.core.Ior ior3 = (arrow.core.Ior) await;
        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
        this.getHighSpeedVideoFpsRanges = async$default3;
        this.getHighSpeedVideoFpsRangesFor = useCaseUtils;
        this.getInputSizeshNQ4ISI = ior3;
        this.getOutputFormats = 2;
        await2 = deferred2.await(this);
        if (await2 != coroutine_suspended) {
            deferred3 = async$default3;
            ior = ior3;
            arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> combineResults$shopping_rewards_prodRelease3 = useCaseUtils.combineResults$shopping_rewards_prodRelease(ior, (arrow.core.Ior) await2, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) obj2, (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.PpdcCard) obj3);
                }
            });
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase3 = this.getInputFormats;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getHighSpeedVideoFpsRanges = deferred3;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(combineResults$shopping_rewards_prodRelease3);
            this.getInputSizeshNQ4ISI = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputFormats = 3;
            adjustDebitCardVisibility$shopping_rewards_prodRelease = getRewardsSummaryUseCase3.adjustDebitCardVisibility$shopping_rewards_prodRelease(combineResults$shopping_rewards_prodRelease3, this);
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.PpdcCard ppdcCard) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = response.getEarnContent();
        if (earnContent != null) {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response copy$default = (earnContent.getPpdcCard() == null ? earnContent : null) != null ? com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default(response, null, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.copy$default(earnContent, null, null, null, false, ppdcCard, 15, null), null, null, null, 29, null) : null;
            if (copy$default != null) {
                return copy$default;
            }
        }
        return response;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2 getRewardsSummaryUseCase$invoke$2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2(this.getInputFormats, continuation);
        getRewardsSummaryUseCase$invoke$2.getOutputMinFrameDuration = obj;
        return getRewardsSummaryUseCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRewardsSummaryUseCase$invoke$2(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getInputFormats = getRewardsSummaryUseCase;
    }
}
