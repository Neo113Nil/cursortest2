package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageNavigation;", "navigation", "", "updateFrame", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageNavigation;)V", "Lkotlinx/coroutines/Job;", "startAnimation", "()Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "currentPageId", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentPageId", "()Lkotlinx/coroutines/flow/StateFlow;", "", "animationProgress", "getAnimationProgress", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeViewModel extends androidx.view.ViewModel {
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> animationProgress;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> currentPageId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public WelcomeViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.currentPageId = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Float.valueOf(0.0f));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow2;
        this.animationProgress = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getCurrentPageId() {
        return this.currentPageId;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getAnimationProgress() {
        return this.animationProgress;
    }

    public static /* synthetic */ void updateFrame$default(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            welcomePageNavigation = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.AUTO_NAV;
        }
        welcomeViewModel.updateFrame(welcomePageNavigation);
    }

    public final void updateFrame(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation navigation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigation, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1(this, navigation, null), 3, null);
    }

    public final kotlinx.coroutines.Job startAnimation() {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1(this, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ void access$navigateToNextPage(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, int i) {
        welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.next(i));
        welcomeViewModel.getHighSpeedVideoFpsRanges.setValue(java.lang.Float.valueOf(welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI.getValue().getRange().getFirst() / com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.getTOTAL_FRAME()));
    }

    public static final /* synthetic */ void access$navigateToPreviousPage(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, int i) {
        float floatValue = welcomeViewModel.getHighSpeedVideoFpsRanges.getValue().floatValue();
        welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.previous(i));
        welcomeViewModel.getHighSpeedVideoFpsRanges.setValue(java.lang.Float.valueOf(welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI.getValue().getRange().getFirst() / com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.getTOTAL_FRAME()));
        if (floatValue >= 1.0f) {
            welcomeViewModel.startAnimation();
        }
    }
}
