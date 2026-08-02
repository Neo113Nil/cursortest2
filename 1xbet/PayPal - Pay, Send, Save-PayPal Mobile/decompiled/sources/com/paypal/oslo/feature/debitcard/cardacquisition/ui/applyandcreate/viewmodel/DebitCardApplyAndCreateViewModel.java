package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/viewmodel/DebitCardApplyAndCreateViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateSideEffectsMiddleware;", "sideEffectsMiddleware", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "fundingOptionsCache", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateReducer;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateSideEffectsMiddleware;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;)V", "", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "shouldIssuePhysical", "fundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "tokenProductName", "", "provisionCard", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateSideEffectsMiddleware;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public DebitCardApplyAndCreateViewModel(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateReducer debitCardApplyAndCreateReducer, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware debitCardApplyAndCreateSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache) {
        super(debitCardApplyAndCreateReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardApplyAndCreateReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardApplyAndCreateSideEffectsMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardApplyAndCreateSideEffectsMiddleware;
        this.getHighSpeedVideoFpsRanges = debitCardFundingOptionsCache;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardApplyAndCreateViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState initialState() {
        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static /* synthetic */ void provisionCard$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            debitCardTokenProductName = null;
        }
        debitCardApplyAndCreateViewModel.provisionCard(debitCardProductName, z, str, debitCardTokenProductName);
    }

    public final void provisionCard(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, boolean shouldIssuePhysical, java.lang.String fundingSourceId, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName tokenProductName) {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource selectedFundingSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        processEvent(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard(productName, shouldIssuePhysical, (fundingSourceId == null || (selectedFundingSource = this.getHighSpeedVideoFpsRanges.getSelectedFundingSource(fundingSourceId)) == null) ? null : new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference(selectedFundingSource, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.BALANCE), tokenProductName));
    }
}
