package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010&\u001a\u00020#8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/PushProvisioningSetupViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEffect;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;", "getWalletStatusUseCase", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;", "initiatePushProvisioningUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupReducer;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onActivityResult", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;ILandroid/content/Intent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisionSetupSideEffectsMiddleware;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningSetupViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public PushProvisioningSetupViewModel(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupReducer pushProvisioningSetupReducer, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase) {
        super(pushProvisioningSetupReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningSetupReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePushProvisioningUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getWalletStatusUseCase;
        this.Camera2StreamConfigurationMap = initiatePushProvisioningUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.$r8$lambda$LzxMyQ6K0Mi6cq0hnEAgJRfkTKE(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState initialState() {
        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitPushProvisionSetupViewModel.store";
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware $r8$lambda$LzxMyQ6K0Mi6cq0hnEAgJRfkTKE(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware(pushProvisioningSetupViewModel.getHighSpeedVideoFpsRangesFor, pushProvisioningSetupViewModel.Camera2StreamConfigurationMap, androidx.view.ViewModelKt.getViewModelScope(pushProvisioningSetupViewModel));
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware) this.getHighResolutionOutputSizeshNQ4ISI.getValue());
    }

    public final void onActivityResult(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, int resultCode, android.content.Intent data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisionSetupSideEffectsMiddleware) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).onActivityResult(starPayClient, resultCode, data, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel$onActivityResult$1(this));
    }
}
