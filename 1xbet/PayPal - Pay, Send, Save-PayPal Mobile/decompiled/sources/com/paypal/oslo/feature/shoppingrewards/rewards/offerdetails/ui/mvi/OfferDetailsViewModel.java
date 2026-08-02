package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010(8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010(8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase;", "getOfferDetailsUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase;", "activateOfferUseCase", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase;)V", "", "offerId", "touchpointId", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "", "onLoad", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "text", "tag", "onTermsClick", "(Ljava/lang/String;Ljava/lang/String;)V", "onActivateOffer", "()V", "onClose", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "onRetryClick", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;)V", "handleOnLoad$shopping_rewards_prodRelease", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "offerDetailsUiData", "handleOnActivateOffer$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "analyticsMiddlewareDelegate", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferDetailsViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public OfferDetailsViewModel(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase getOfferDetailsUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase activateOfferUseCase) {
        super("OfferDetailsViewModel", com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Initial.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsReducer.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOfferDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activateOfferUseCase, "");
        this.getHighSpeedVideoSizes = getOfferDetailsUseCase;
        this.getHighSpeedVideoFpsRanges = activateOfferUseCase;
    }

    public static /* synthetic */ void onLoad$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        offerDetailsViewModel.onLoad(str, str2, str3);
    }

    public final void onLoad(java.lang.String offerId, java.lang.String touchpointId, java.lang.String platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad(offerId, touchpointId, platform));
    }

    public final void onTermsClick(java.lang.String text, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick(text, tag));
    }

    public final void onActivateOffer() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer.INSTANCE);
    }

    public final void onClose() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose.INSTANCE);
    }

    public final void onRetryClick(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        if (flow instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate) {
            onActivateOffer();
        } else {
            if (!(flow instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            onLoad$default(this, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load) flow).getOfferId(), null, null, 6, null);
        }
    }

    public static /* synthetic */ void handleOnLoad$shopping_rewards_prodRelease$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        offerDetailsViewModel.handleOnLoad$shopping_rewards_prodRelease(str, str2, str3);
    }

    public final void handleOnLoad$shopping_rewards_prodRelease(java.lang.String offerId, java.lang.String touchpointId, java.lang.String platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnLoad$1(this, offerId, touchpointId, platform, null), 3, null);
    }

    public final void handleOnActivateOffer$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel$handleOnActivateOffer$1(this, offerDetailsUiData, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent> getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsAnalyticsMiddlewareDelegate();
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsSideEffectMiddlewareDelegate(this);
    }
}
