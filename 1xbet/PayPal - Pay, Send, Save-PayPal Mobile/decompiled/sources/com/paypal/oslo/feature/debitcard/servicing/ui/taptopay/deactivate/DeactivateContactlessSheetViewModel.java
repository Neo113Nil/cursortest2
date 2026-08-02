package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessSheetViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetSideEffectsMiddleware;", "middleware", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetReducer;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetSideEffectsMiddleware;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetSideEffectsMiddleware;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public DeactivateContactlessSheetViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetReducer deactivateContactlessSheetReducer, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware deactivateContactlessSheetSideEffectsMiddleware) {
        super(deactivateContactlessSheetReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetSideEffectsMiddleware, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deactivateContactlessSheetSideEffectsMiddleware;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DeactivateContactlessSheetViewModel.store";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
