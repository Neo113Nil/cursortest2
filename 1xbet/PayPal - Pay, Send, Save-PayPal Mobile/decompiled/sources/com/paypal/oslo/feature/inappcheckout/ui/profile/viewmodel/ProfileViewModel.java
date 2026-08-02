package com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020(0*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/viewmodel/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/reducer/ProfileReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/LogoutUseCase;", "logoutUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "stringsProvider", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "handleInAppLinkUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/profile/reducer/ProfileReducer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/LogoutUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "", "initialize", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "event", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/reducer/ProfileReducer;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/LogoutUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State> state;

    @javax.inject.Inject
    public ProfileViewModel(com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer profileReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase logoutUseCase, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleInAppLinkUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = profileReducer;
        this.getHighSpeedVideoFpsRanges = logoutUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutStringsProvider;
        this.getHighSpeedVideoSizes = handleInAppLinkUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputFormats = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
        onEvent(new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize(buyerInfoEntity));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$initialize$1(this, null), 3, null);
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if ((event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) && this.Camera2StreamConfigurationMap.getValue() == null) {
            this.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State(((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) event).getBuyerInfoEntity(), false, 2, defaultConstructorMarker));
        } else {
            com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State value = this.Camera2StreamConfigurationMap.getValue();
            if (value != null) {
                this.Camera2StreamConfigurationMap.setValue(this.getHighSpeedVideoFpsRangesFor.reduce(value, event));
            }
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.LogoutUser) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$handleLogout$1(this, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPrivacy) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView(this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink.PRIVACY_STATEMENT)), null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPolicies) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView(this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink.PAYMENT_METHODS_POLICY)), null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToTerms) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView(this.getHighSpeedVideoSizes.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink.TERMS_AGREEMENTS)), null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.HandleBackPress) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateBack.INSTANCE, null), 3, null);
        }
    }
}
