package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/viewmodel/FundingOptionsComponentViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiEffect;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentSideEffectsMiddleware;", "sideEffectsMiddleware", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "fundingOptionsCache", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentReducer;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentSideEffectsMiddleware;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentConfig;", "config", "", "setFundingOptionsConfig", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentConfig;)V", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "debitCardFundingOptions", "selectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "getSelectableSecondaryFundingOption", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentConfig;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "resolvedId", "", "wasExplicitlySelected", "syncResolvedFundingSource", "(Ljava/lang/String;Z)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentSideEffectsMiddleware;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsComponentViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public FundingOptionsComponentViewModel(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentReducer fundingOptionsComponentReducer, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware fundingOptionsComponentSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache) {
        super(fundingOptionsComponentReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsComponentReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsComponentSideEffectsMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        this.Camera2StreamConfigurationMap = fundingOptionsComponentSideEffectsMiddleware;
        this.getHighSpeedVideoFpsRangesFor = debitCardFundingOptionsCache;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState initialState() {
        return com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "FundingOptionsComponentViewModel.store";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(this.Camera2StreamConfigurationMap);
    }

    public final void setFundingOptionsConfig(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if (getUiState().getValue() instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Initial) {
            if (config.getVariant() == com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant.PRIMARY_FUNDING_OPTION_BALANCE) {
                processEvent(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData.INSTANCE);
            } else {
                processEvent(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData(config.getProductName(), config.getCardId(), config.getApiEntryPoint()));
            }
        }
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getSelectableSecondaryFundingOption(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentConfig config, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions, java.lang.String selectedFundingSourceId) {
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptions, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingOptions = debitCardFundingOptions.getAvailableFundingOptions();
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> fundingSources = availableFundingOptions != null ? availableFundingOptions.getFundingSources() : null;
        if (config.getDisplayMode() != com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode.USER_PREFERRED_FUNDING_SOURCE) {
            if (fundingSources != null) {
                java.util.Iterator<T> it = fundingSources.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj).getId(), selectedFundingSourceId)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj;
                if (debitCardFundingSource2 != null) {
                    return debitCardFundingSource2;
                }
            }
            if (fundingSources != null) {
                return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingSources);
            }
            return null;
        }
        if (selectedFundingSourceId != null) {
            if (fundingSources != null) {
                java.util.Iterator<T> it2 = fundingSources.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj2).getId(), selectedFundingSourceId)) {
                        break;
                    }
                }
                debitCardFundingSource = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj2;
            } else {
                debitCardFundingSource = null;
            }
            if (debitCardFundingSource != null) {
                return debitCardFundingSource;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference userPreference = debitCardFundingOptions.getUserPreference();
        if (userPreference != null) {
            return userPreference.getFundingSource();
        }
        return null;
    }

    public final void syncResolvedFundingSource(java.lang.String resolvedId, boolean wasExplicitlySelected) {
        this.getHighSpeedVideoFpsRangesFor.putSelectedFundingSourceId(resolvedId);
        if (wasExplicitlySelected || resolvedId == null) {
            return;
        }
        processEvent(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged(resolvedId));
    }
}
