package com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/sharedcard/SharedCardConsentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "sharedCardInfo", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "action", "onHeaderNavAction", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", "onSendText", "()V", "onAddDifferentCard", "onNotNow", "onTextSentAcknowledged", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/sharedcard/SharedCardConsentUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getHeader", "()Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SharedCardConsentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;

    public abstract com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header getHeader();

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> getUiState();

    public abstract void initialize(com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header);

    public abstract void onAddDifferentCard();

    public abstract void onNotNow();

    public abstract void onSendText();

    public abstract void onTextSentAcknowledged();

    public SharedCardConsentViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    public final void onHeaderNavAction(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        int i = com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel.$r8$lambda$lKjGSyJeAhi1LHtCdP54Qs9xmME((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (i == 2) {
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel.$r8$lambda$_jfskGuUdk07tFTxX9uTkzHKTWI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel.m21054$r8$lambda$DOMLicK4efrnGphUVvKZWihxqA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* renamed from: $r8$lambda$DOMLicK4efrnGphUVvK-ZWihxqA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21054$r8$lambda$DOMLicK4efrnGphUVvKZWihxqA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_jfskGuUdk07tFTxX9uTkzHKTWI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lKjGSyJeAhi1LHtCdP54Qs9xmME(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
