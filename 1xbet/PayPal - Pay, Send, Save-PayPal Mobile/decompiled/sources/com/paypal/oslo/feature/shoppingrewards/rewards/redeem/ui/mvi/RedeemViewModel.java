package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b#\u0010\u001bJ\r\u0010$\u001a\u00020\u0015¢\u0006\u0004\b$\u0010\u001dJ\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010\u001dJ\r\u0010&\u001a\u00020\u0015¢\u0006\u0004\b&\u0010\u001dJ\u0015\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0015¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020\u0015H\u0000¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u0015H\u0000¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0015H\u0000¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020\u0015H\u0000¢\u0006\u0004\b/\u0010\u001dR\u0014\u00102\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00104\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010=R\"\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010?8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010?8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bC\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase;", "getRedeemConversionRateUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetCharitiesUseCase;", "getCharitiesUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase;", "redeemPointsToBalanceUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToSavingsUseCase;", "redeemPointsToSavingsUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase;", "redeemPointsToDonationUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemUiDataMapper;", "redeemUiDataMapper", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetCharitiesUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToSavingsUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemUiDataMapper;)V", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;", "destination", "", "onLoad", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemFlowDestination;)V", "", "amount", "onAmountChange", "(Ljava/lang/String;)V", "onNext", "()V", "charityId", "onSelectCharity", "onConfirmDonation", "onRedeem", "url", "onTermsClick", "onShowTermsBottomSheet", "onRetry", "onDismiss", "", "enabled", "onShareInfoToggle", "(Z)V", "onActivityClick", "handleOnLoad$shopping_rewards_prodRelease", "handleOnSummaryReady$shopping_rewards_prodRelease", "handleOnLoadCharities$shopping_rewards_prodRelease", "handleOnRedeem$shopping_rewards_prodRelease", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetCharitiesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToSavingsUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemUiDataMapper;", "Ljava/lang/String;", "getInputFormats", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "analyticsMiddlewareDelegate", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper getInputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public RedeemViewModel(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase getRedeemConversionRateUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase getCharitiesUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase redeemPointsToBalanceUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase redeemPointsToSavingsUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase redeemPointsToDonationUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper redeemUiDataMapper) {
        super("RedeemViewModel", new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE), com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemReducer.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRedeemConversionRateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCharitiesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsToBalanceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsToSavingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsToDonationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemUiDataMapper, "");
        this.Camera2StreamConfigurationMap = getRedeemConversionRateUseCase;
        this.getHighSpeedVideoSizes = getCharitiesUseCase;
        this.getHighSpeedVideoFpsRangesFor = redeemPointsToBalanceUseCase;
        this.getHighSpeedVideoFpsRanges = redeemPointsToSavingsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = redeemPointsToDonationUseCase;
        this.getInputSizeshNQ4ISI = redeemUiDataMapper;
    }

    public final void onLoad(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad(destination.getRedeemType(), destination.getAvailablePoints()));
    }

    public final void onAmountChange(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange(amount));
    }

    public final void onNext() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext.INSTANCE);
    }

    public final void onSelectCharity(java.lang.String charityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityId, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity(charityId));
    }

    public final void onConfirmDonation() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation.INSTANCE);
    }

    public final void onRedeem() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem.INSTANCE);
    }

    public final void onTermsClick(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick(url));
    }

    public final void onShowTermsBottomSheet() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet.INSTANCE);
    }

    public final void onRetry() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry.INSTANCE);
    }

    public final void onDismiss() {
        this.getInputFormats = null;
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss.INSTANCE);
    }

    public final void onShareInfoToggle(boolean enabled) {
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle(enabled));
    }

    public final void onActivityClick() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnActivityClick.INSTANCE);
    }

    public final void handleOnLoad$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnLoad$1(this, null), 3, null);
    }

    public final void handleOnSummaryReady$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnSummaryReady$1(this, null), 3, null);
    }

    public final void handleOnLoadCharities$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnLoadCharities$1(this, null), 3, null);
    }

    public final void handleOnRedeem$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnRedeem$1(this, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent> getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemAnalyticsMiddlewareDelegate();
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemSideEffectMiddlewareDelegate(this);
    }

    public static final /* synthetic */ java.lang.Object access$executeRedemption(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming, int i, double d, kotlin.coroutines.Continuation continuation) {
        int i2 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.WhenMappings.$EnumSwitchMapping$0[redeeming.getRedeemType().ordinal()];
        if (i2 == 1) {
            java.lang.Object invoke2 = redeemViewModel.getHighSpeedVideoFpsRangesFor.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request(i, d), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response>>) continuation);
            return invoke2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke2 : (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) invoke2;
        }
        if (i2 == 2) {
            java.lang.Object invoke22 = redeemViewModel.getHighSpeedVideoFpsRanges.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase.Request(i, d), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase.Response>>) continuation);
            return invoke22 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke22 : (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) invoke22;
        }
        if (i2 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String str = redeemViewModel.getInputFormats;
        if (str == null) {
            str = java.util.UUID.randomUUID().toString();
            redeemViewModel.getInputFormats = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        java.lang.String str2 = str;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase redeemPointsToDonationUseCase = redeemViewModel.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String selectedCharityId = redeeming.getSelectedCharityId();
        java.lang.String str3 = selectedCharityId == null ? "" : selectedCharityId;
        java.lang.String selectedCharityName = redeeming.getSelectedCharityName();
        java.lang.Object invoke23 = redeemPointsToDonationUseCase.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request(i, d, str3, selectedCharityName == null ? "" : selectedCharityName, str2, redeeming.getShareInfoEnabled()), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response>>) continuation);
        return invoke23 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke23 : (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) invoke23;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
