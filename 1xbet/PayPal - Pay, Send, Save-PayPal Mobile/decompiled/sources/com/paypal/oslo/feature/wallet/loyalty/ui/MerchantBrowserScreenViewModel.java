package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/MerchantBrowserScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;", "merchant", "", "navigateToScanner$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "recommendedMerchants", "Lkotlinx/coroutines/flow/StateFlow;", "getRecommendedMerchants", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "allMerchants", "getAllMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MerchantBrowserScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> allMerchants;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> recommendedMerchants;

    @javax.inject.Inject
    public MerchantBrowserScreenViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant[]{new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Domino's", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_1), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("The Home Depot", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_2), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Ikea", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_3), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("New Balance", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_7), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Panda Express", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_5), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Publix", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_4)}));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.recommendedMerchants = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Abercrombie & Finch", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_8), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Academy.com", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_9), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Albertsons", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_10), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Athleta", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_11), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Banana Republic", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_12), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Bath & Body Bath & Body Works", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_13), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Buffalo Wild Wings", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_14), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Chicho's", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_15), new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Chipotle", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_6));
        for (int i = 0; i < 25; i++) {
            mutableListOf.add(new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Temp ".concat(java.lang.String.valueOf(i)), com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_1));
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(mutableListOf);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow2;
        this.allMerchants = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> getRecommendedMerchants() {
        return this.recommendedMerchants;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.wallet.loyalty.ui.Merchant>> getAllMerchants() {
        return this.allMerchants;
    }

    public final void navigateToScanner$wallet_prodRelease(final com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.loyalty.ui.MerchantBrowserScreenViewModel.m21379$r8$lambda$SQLwcNx7MwQcfKrwHN8J5NE3Ko(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$SQLw-cNx7MwQcfKrwHN8J5NE3Ko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21379$r8$lambda$SQLwcNx7MwQcfKrwHN8J5NE3Ko(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination(merchant.getName(), merchant.getLogo()));
        return kotlin.Unit.INSTANCE;
    }
}
