package com.paypal.oslo.feature.identity.merchantonboarding;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;", "codeToTokenExchange", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;", "updateTokenUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;)V", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "codeVerifier", "", "handleAuthSuccess", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "handleAuthFailure", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "navigationEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "NavigationEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantOnboardingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.identity.api.CodeToTokenExchange getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent> navigationEvent;

    @javax.inject.Inject
    public MerchantOnboardingViewModel(com.paypal.oslo.feature.identity.api.CodeToTokenExchange codeToTokenExchange, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeToTokenExchange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTokenUseCase, "");
        this.getHighSpeedVideoSizes = codeToTokenExchange;
        this.getHighSpeedVideoFpsRanges = updateTokenUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.navigationEvent = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent> getNavigationEvent() {
        return this.navigationEvent;
    }

    public final void handleAuthSuccess(java.lang.String authCode, java.lang.String codeVerifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1(authCode, codeVerifier, this, null), 3, null);
    }

    public final void handleAuthFailure(java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthFailure$1(errorCode, this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent;", "", "<init>", "()V", "GoBack", "NavigateToHome", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent$GoBack;", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent$NavigateToHome;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NavigationEvent {
        public static final int $stable = 0;

        private NavigationEvent() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent$GoBack;", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoBack extends com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack INSTANCE = new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack();

            public final int hashCode() {
                return -856844976;
            }

            private GoBack() {
                super(null);
            }

            public final java.lang.String toString() {
                return "GoBack";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent$NavigateToHome;", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent;", "", "isBusinessProfile", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel$NavigationEvent$NavigateToHome;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToHome extends com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent {
            public static final int $stable = 0;
            private final boolean isBusinessProfile;

            public NavigateToHome(boolean z) {
                super(null);
                this.isBusinessProfile = z;
            }

            public final boolean isBusinessProfile() {
                return this.isBusinessProfile;
            }

            public final java.lang.String toString() {
                boolean z = this.isBusinessProfile;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToHome(isBusinessProfile=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isBusinessProfile);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome) && this.isBusinessProfile == ((com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome) other).isBusinessProfile;
            }

            public final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome copy(boolean isBusinessProfile) {
                return new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome(isBusinessProfile);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsBusinessProfile() {
                return this.isBusinessProfile;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome copy$default(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome navigateToHome, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = navigateToHome.isBusinessProfile;
                }
                return navigateToHome.copy(z);
            }
        }

        public /* synthetic */ NavigationEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
