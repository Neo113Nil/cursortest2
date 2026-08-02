package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002)*B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00142*\u0010\u001a\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00160\u0014H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00142\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u0014H\u0080@¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase;", "adjustDebitCardVisibilityUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase;", "resolveRedeemEligibilityUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository;", "rewardsSummaryRepository", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RedeemMethodsRepository;", "redeemMethodsRepository", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/PayPalDebitCardRepository;", "payPalDebitCardRepository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RedeemMethodsRepository;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/PayPalDebitCardRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;", "combined", "resolveRedeemEligibility$shopping_rewards_prodRelease", "(Larrow/core/Ior;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rewardsSummary", "adjustDebitCardVisibility$shopping_rewards_prodRelease", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/AdjustDebitCardVisibilityUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/ResolveRedeemEligibilityUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RedeemMethodsRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/PayPalDebitCardRepository;", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetRewardsSummaryUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetRewardsSummaryUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase adjustDebitCardVisibilityUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase resolveRedeemEligibilityUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository rewardsSummaryRepository, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository redeemMethodsRepository, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository payPalDebitCardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adjustDebitCardVisibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolveRedeemEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummaryRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemMethodsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDebitCardRepository, "");
        this.getHighSpeedVideoFpsRanges = adjustDebitCardVisibilityUseCase;
        this.Camera2StreamConfigurationMap = resolveRedeemEligibilityUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = rewardsSummaryRepository;
        this.getHighSpeedVideoFpsRangesFor = redeemMethodsRepository;
        this.getHighSpeedVideoSizes = payPalDebitCardRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resolveRedeemEligibility$shopping_rewards_prodRelease(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Pair<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData>>>> ior, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$resolveRedeemEligibility$1 getRewardsSummaryUseCase$resolveRedeemEligibility$1;
        int i;
        java.lang.Object leftValue;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult2;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response;
        java.lang.Object obj;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult3;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult4;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success2;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response2;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult5;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult6;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$resolveRedeemEligibility$1) {
            getRewardsSummaryUseCase$resolveRedeemEligibility$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$resolveRedeemEligibility$1) continuation;
            if ((getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes;
                if (i == 0) {
                    if (i == 1) {
                        int i2 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizes;
                        int i3 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response3 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputFormats;
                        success2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputSizeshNQ4ISI;
                        dataResult4 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        response2 = response3;
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response response4 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                        dataResult5 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(success2.getCorrelationId(), com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default(response2, null, null, response4 != null ? response4.getRedeemContent() : null, null, null, 27, null));
                        if (dataResult5 == null) {
                            dataResult3 = dataResult4;
                            dataResult5 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.empty(dataResult3.getCorrelationId());
                        }
                        return new arrow.core.Ior.Right(dataResult5);
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizes;
                    int i6 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i7 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRangesFor;
                    obj = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response5 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputFormats;
                    success = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputSizeshNQ4ISI;
                    dataResult2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    response = response5;
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response response6 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                    dataResult6 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(success.getCorrelationId(), com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default(response, null, null, response6 != null ? response6.getRedeemContent() : null, null, null, 27, null));
                    if (dataResult6 == null) {
                        leftValue = obj;
                        dataResult = dataResult2;
                        dataResult6 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.empty(dataResult.getCorrelationId());
                        obj = leftValue;
                    }
                    return new arrow.core.Ior.Both(obj, dataResult6);
                }
                kotlin.ResultKt.throwOnFailure(obj2);
                if (ior instanceof arrow.core.Ior.Left) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    dataResult3 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success3 = dataResult3 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success ? (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult3 : null;
                    if (success3 != null) {
                        kotlin.Pair pair = (kotlin.Pair) success3.getData();
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response7 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) pair.component1();
                        java.util.List list = (java.util.List) pair.component2();
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase resolveRedeemEligibilityUseCase = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request(response7.getRedeemMethodsEligibility(), list);
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputFormats = dataResult3;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputSizeshNQ4ISI = success3;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputFormats = response7;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRangesFor = 0;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizes = 0;
                        getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes = 1;
                        java.lang.Object invoke2 = resolveRedeemEligibilityUseCase.invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response>>) getRewardsSummaryUseCase$resolveRedeemEligibility$1);
                        if (invoke2 != coroutine_suspended) {
                            dataResult4 = dataResult3;
                            success2 = success3;
                            response2 = response7;
                            obj2 = invoke2;
                            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response response42 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                            dataResult5 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(success2.getCorrelationId(), com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default(response2, null, null, response42 != null ? response42.getRedeemContent() : null, null, null, 27, null));
                            if (dataResult5 == null) {
                            }
                            return new arrow.core.Ior.Right(dataResult5);
                        }
                    }
                    dataResult5 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.empty(dataResult3.getCorrelationId());
                    return new arrow.core.Ior.Right(dataResult5);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                leftValue = both.getLeftValue();
                dataResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue();
                com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success4 = dataResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success ? (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) dataResult : null;
                if (success4 != null) {
                    kotlin.Pair pair2 = (kotlin.Pair) success4.getData();
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response8 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) pair2.component1();
                    java.util.List list2 = (java.util.List) pair2.component2();
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase resolveRedeemEligibilityUseCase2 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request request2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Request(response8.getRedeemMethodsEligibility(), list2);
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputFormats = dataResult;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getInputSizeshNQ4ISI = success4;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputFormats = response8;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputMinFrameDuration = leftValue;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoFpsRangesFor = 0;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getHighSpeedVideoSizes = 0;
                    getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes = 2;
                    java.lang.Object invoke22 = resolveRedeemEligibilityUseCase2.invoke2(request2, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response>>) getRewardsSummaryUseCase$resolveRedeemEligibility$1);
                    if (invoke22 != coroutine_suspended) {
                        dataResult2 = dataResult;
                        success = success4;
                        response = response8;
                        obj2 = invoke22;
                        obj = leftValue;
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response response62 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                        dataResult6 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(success.getCorrelationId(), com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default(response, null, null, response62 != null ? response62.getRedeemContent() : null, null, null, 27, null));
                        if (dataResult6 == null) {
                        }
                        return new arrow.core.Ior.Both(obj, dataResult6);
                    }
                }
                dataResult6 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.empty(dataResult.getCorrelationId());
                obj = leftValue;
                return new arrow.core.Ior.Both(obj, dataResult6);
                return coroutine_suspended;
            }
        }
        getRewardsSummaryUseCase$resolveRedeemEligibility$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$resolveRedeemEligibility$1(this, continuation);
        java.lang.Object obj22 = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getRewardsSummaryUseCase$resolveRedeemEligibility$1.getOutputSizes;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adjustDebitCardVisibility$shopping_rewards_prodRelease(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>> ior, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$adjustDebitCardVisibility$1 getRewardsSummaryUseCase$adjustDebitCardVisibility$1;
        int i;
        java.lang.Object leftValue;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success2;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success3;
        java.lang.Object obj;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success4;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success5;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult dataResult2;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success6;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success7;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent2;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$adjustDebitCardVisibility$1) {
            getRewardsSummaryUseCase$adjustDebitCardVisibility$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$adjustDebitCardVisibility$1) continuation;
            if ((getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj2 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM;
                if (i == 0) {
                    if (i == 1) {
                        int i2 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.Camera2StreamConfigurationMap;
                        int i3 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizes;
                        int i4 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRanges;
                        int i5 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighResolutionOutputSizeshNQ4ISI;
                        success6 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputSizeshNQ4ISI;
                        dataResult2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                        earnContent = response == null ? response.getEarnContent() : null;
                        if (earnContent != null || (success7 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success.copy$default(success6, null, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) success6.getData(), null, earnContent, null, null, null, 29, null), 1, null)) == null) {
                            success5 = success6;
                            success4 = dataResult2;
                            dataResult2 = success4;
                            success7 = success5;
                        }
                        success4 = success7 == null ? success7 : dataResult2;
                        return new arrow.core.Ior.Right(success4);
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.Camera2StreamConfigurationMap;
                    int i7 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizes;
                    int i8 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRanges;
                    int i9 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    obj = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizesFor;
                    success3 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputSizeshNQ4ISI;
                    dataResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response response2 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                    earnContent2 = response2 == null ? response2.getEarnContent() : null;
                    if (earnContent2 == null && (r2 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success.copy$default(success3, null, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response.copy$default((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) success3.getData(), null, earnContent2, null, null, null, 29, null), 1, null)) != null) {
                        leftValue = obj;
                        if (r2 != null) {
                        }
                        return new arrow.core.Ior.Both(leftValue, success);
                    }
                    leftValue = obj;
                    success2 = success3;
                    success = dataResult;
                    dataResult = success;
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success8 = success2;
                    success = success8 != null ? success8 : dataResult;
                    return new arrow.core.Ior.Both(leftValue, success);
                }
                kotlin.ResultKt.throwOnFailure(obj2);
                if (ior instanceof arrow.core.Ior.Left) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    success4 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) ior).getValue();
                    success5 = success4 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success ? (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) success4 : null;
                    if (success5 != null) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent3 = ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) success5.getData()).getEarnContent();
                        if (earnContent3 != null) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase adjustDebitCardVisibilityUseCase = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request request = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request(earnContent3);
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputFormats = success4;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputSizeshNQ4ISI = success5;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(earnContent3);
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRanges = 0;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizes = 0;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.Camera2StreamConfigurationMap = 0;
                            getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object invoke2 = adjustDebitCardVisibilityUseCase.invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response>>) getRewardsSummaryUseCase$adjustDebitCardVisibility$1);
                            if (invoke2 != coroutine_suspended) {
                                dataResult2 = success4;
                                obj2 = invoke2;
                                success6 = success5;
                                com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response response3 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                                if (response3 == null) {
                                }
                                if (earnContent != null) {
                                }
                                success5 = success6;
                                success4 = dataResult2;
                            }
                        }
                        dataResult2 = success4;
                        success7 = success5;
                        if (success7 == null) {
                        }
                    }
                    return new arrow.core.Ior.Right(success4);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                leftValue = both.getLeftValue();
                success = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue();
                success2 = success instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success ? (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) success : null;
                if (success2 != null) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent4 = ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) success2.getData()).getEarnContent();
                    if (earnContent4 != null) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase adjustDebitCardVisibilityUseCase2 = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request request2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Request(earnContent4);
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputFormats = success;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputSizeshNQ4ISI = success2;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(earnContent4);
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizesFor = leftValue;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoFpsRanges = 0;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getHighSpeedVideoSizes = 0;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.Camera2StreamConfigurationMap = 0;
                        getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM = 2;
                        java.lang.Object invoke22 = adjustDebitCardVisibilityUseCase2.invoke2(request2, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response>>) getRewardsSummaryUseCase$adjustDebitCardVisibility$1);
                        if (invoke22 != coroutine_suspended) {
                            dataResult = success;
                            success3 = success2;
                            obj2 = invoke22;
                            obj = leftValue;
                            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response response22 = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj2).getData();
                            if (response22 == null) {
                            }
                            if (earnContent2 == null) {
                            }
                            leftValue = obj;
                            success2 = success3;
                            success = dataResult;
                        }
                    }
                    dataResult = success;
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success82 = success2;
                    if (success82 != null) {
                    }
                }
                return new arrow.core.Ior.Both(leftValue, success);
                return coroutine_suspended;
            }
        }
        getRewardsSummaryUseCase$adjustDebitCardVisibility$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$adjustDebitCardVisibility$1(this, continuation);
        java.lang.Object obj22 = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getRewardsSummaryUseCase$adjustDebitCardVisibility$1.getOutputStallDurationlomOqCM;
        if (i == 0) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Request;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request();

        public final int hashCode() {
            return -1718650324;
        }

        private Request() {
        }

        public final java.lang.String toString() {
            return "Request";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JP\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;", "rewardsOverview", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "earnContent", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "redeemContent", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemEligibility;", "redeemMethodsEligibility", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/ActivityContent;", "activityContent", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/ActivityContent;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/ActivityContent;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/ActivityContent;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;", "getRewardsOverview", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent;", "getEarnContent", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent;", "getRedeemContent", "Ljava/util/List;", "getRedeemMethodsEligibility", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/ActivityContent;", "getActivityContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> redeemMethodsEligibility;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.rewardsOverview = rewardsOverview;
            this.earnContent = earnContent;
            this.redeemContent = redeemContent;
            this.redeemMethodsEligibility = list;
            this.activityContent = activityContent;
        }

        public /* synthetic */ Response(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, java.util.List list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : rewardsOverview, (i & 2) != 0 ? null : earnContent, (i & 4) != 0 ? null : redeemContent, list, (i & 16) != 0 ? null : activityContent);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview getRewardsOverview() {
            return this.rewardsOverview;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent getRedeemContent() {
            return this.redeemContent;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> getRedeemMethodsEligibility() {
            return this.redeemMethodsEligibility;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent getActivityContent() {
            return this.activityContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview = this.rewardsOverview;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = this.earnContent;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent = this.redeemContent;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> list = this.redeemMethodsEligibility;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent = this.activityContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(rewardsOverview=");
            sb.append(rewardsOverview);
            sb.append(", earnContent=");
            sb.append(earnContent);
            sb.append(", redeemContent=");
            sb.append(redeemContent);
            sb.append(", redeemMethodsEligibility=");
            sb.append(list);
            sb.append(", activityContent=");
            sb.append(activityContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview = this.rewardsOverview;
            int hashCode = rewardsOverview == null ? 0 : rewardsOverview.hashCode();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = this.earnContent;
            int hashCode2 = earnContent == null ? 0 : earnContent.hashCode();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent = this.redeemContent;
            int hashCode3 = redeemContent == null ? 0 : redeemContent.hashCode();
            int hashCode4 = this.redeemMethodsEligibility.hashCode();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent = this.activityContent;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (activityContent != null ? activityContent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsOverview, response.rewardsOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.earnContent, response.earnContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemContent, response.redeemContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemMethodsEligibility, response.redeemMethodsEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityContent, response.activityContent);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> redeemMethodsEligibility, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemMethodsEligibility, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response(rewardsOverview, earnContent, redeemContent, redeemMethodsEligibility, activityContent);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent getActivityContent() {
            return this.activityContent;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> component4() {
            return this.redeemMethodsEligibility;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent getRedeemContent() {
            return this.redeemContent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent getEarnContent() {
            return this.earnContent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview getRewardsOverview() {
            return this.rewardsOverview;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent, java.util.List list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.ActivityContent activityContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsOverview = response.rewardsOverview;
            }
            if ((i & 2) != 0) {
                earnContent = response.earnContent;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent2 = earnContent;
            if ((i & 4) != 0) {
                redeemContent = response.redeemContent;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent redeemContent2 = redeemContent;
            if ((i & 8) != 0) {
                list = response.redeemMethodsEligibility;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                activityContent = response.activityContent;
            }
            return response.copy(rewardsOverview, earnContent2, redeemContent2, list2, activityContent);
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest access$earnOffersRequest(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest(new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.ACTIVE_FPOS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.CATEGORY_OFFER_ELIGIBILITY, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.ELIGIBLE_FPOS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.SINGLE_CTA_OFFERS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
    }
}
