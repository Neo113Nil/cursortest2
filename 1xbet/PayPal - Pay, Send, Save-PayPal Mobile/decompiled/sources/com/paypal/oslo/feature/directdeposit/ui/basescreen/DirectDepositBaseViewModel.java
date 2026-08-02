package com.paypal.oslo.feature.directdeposit.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseIntent;", "Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseUiState;", "", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetBankingBundleEligibilityUseCase;", "getEligibilityUseCase", "Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetBankingBundleEligibilityUseCase;Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;)V", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseIntent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetBankingBundleEligibilityUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositBaseViewModel extends com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public DirectDepositBaseViewModel(com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase, com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager) {
        super(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Loading.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankingBundleEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFeatureManager, "");
        this.getHighSpeedVideoFpsRangesFor = getBankingBundleEligibilityUseCase;
        this.Camera2StreamConfigurationMap = directDepositFeatureManager;
        if (directDepositFeatureManager.isEarlyAccessEnrolled()) {
            processIntent((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent) com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.ShowSummary.INSTANCE);
        } else {
            processIntent((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent) com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.LoadEligibility.INSTANCE);
        }
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel
    public final void processIntent(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.LoadEligibility.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1(this, null), 3, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.ShowSummary.INSTANCE)) {
            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.$r8$lambda$mv6g218rmiVr_UzGw3daxMZkPwI((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState) obj);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.ShowIntro.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.$r8$lambda$98BvLNIovVsDhqlChKhP8zPNr9Y((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState) obj);
                }
            });
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState $r8$lambda$98BvLNIovVsDhqlChKhP8zPNr9Y(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositBaseUiState, "");
        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.BundleProvisioned.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState $r8$lambda$mv6g218rmiVr_UzGw3daxMZkPwI(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositBaseUiState, "");
        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Eligible.INSTANCE;
    }
}
