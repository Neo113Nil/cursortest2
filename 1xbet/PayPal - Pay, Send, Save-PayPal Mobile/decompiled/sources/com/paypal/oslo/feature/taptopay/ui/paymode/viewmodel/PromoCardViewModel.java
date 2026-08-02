package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/viewmodel/PromoCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;", "bnplAcquisitionConfigManager", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;", "generateRiskDataUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "getCardEligibilityUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPromoDataProvider;", "payLaterPromoDataProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPromoDataProvider;)V", "", "hidePromoCard$taptopay_prodRelease", "()V", "loadPromoData", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPromoDataProvider;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModePromoData;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "promoData", "Lkotlinx/coroutines/flow/StateFlow;", "getPromoData", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getHighSpeedVideoSizesFor", "isPromoCardVisible"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PromoCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPromoCardVisible;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData> promoData;

    @javax.inject.Inject
    public PromoCardViewModel(com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager bnplAcquisitionConfigManager, com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase, com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider payLaterPromoDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateRiskDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterPromoDataProvider, "");
        this.Camera2StreamConfigurationMap = bnplAcquisitionConfigManager;
        this.getHighResolutionOutputSizeshNQ4ISI = generateRiskDataUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalGetCardEligibilityUseCase;
        this.getHighSpeedVideoFpsRanges = payLaterPromoDataProvider;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.promoData = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
        this.getHighSpeedVideoSizesFor = MutableStateFlow2;
        this.isPromoCardVisible = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData> getPromoData() {
        return this.promoData;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPromoCardVisible() {
        return this.isPromoCardVisible;
    }

    public final void hidePromoCard$taptopay_prodRelease() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: hiding promo card for the rest of the session", null, null, 6, null);
        this.getHighSpeedVideoSizesFor.setValue(java.lang.Boolean.FALSE);
    }

    public final void loadPromoData() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: loadPromoData initiated", null, null, 6, null);
        if (this.Camera2StreamConfigurationMap.isInstoreProductEnabled()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel$loadPromoData$1(this, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: Instore product not enabled, skipping promo data load", null, null, 6, null);
            this.getHighSpeedVideoSizes.setValue(null);
        }
    }

    public static final /* synthetic */ void access$getPayLaterPromoData(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel promoCardViewModel, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult cardEligibilityResult) {
        com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType payLaterPayModePromoType;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: getPayLaterPromoData initiated", null, null, 6, null);
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility = cardEligibilityResult.getCardEligibility();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : cardEligibility) {
            if (obj instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility payLaterCardEligibility = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        if (payLaterCardEligibility != null) {
            payLaterPayModePromoType = com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.ACTIVATE;
        } else {
            payLaterPayModePromoType = com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.APPLY;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: getPayLaterPromoData type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", payLaterPayModePromoType.name())), null, 4, null);
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContentKt.toPromoCardContent(promoCardViewModel.getHighSpeedVideoFpsRanges.getPromoData(payLaterPayModePromoType));
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = null;
        if (payLaterCardEligibility != null) {
            java.lang.String id = payLaterCardEligibility.getId().getId();
            com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType apiCardType = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardType(payLaterCardEligibility.getType());
            java.lang.String last4 = payLaterCardEligibility.getLast4();
            if (last4 == null) {
                last4 = "";
            }
            java.lang.String str = last4;
            java.lang.String brand = payLaterCardEligibility.getBrand();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData = payLaterCardEligibility.getPayLaterData();
            com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData apiPayLaterData = payLaterData != null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiPayLaterData(payLaterData) : null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = payLaterCardEligibility.getCardArtCollection();
            setupCardInfo = new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(id, apiCardType, str, brand, apiPayLaterData, cardArtCollection != null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardArtCollection(cardArtCollection) : null);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromoCardViewModel: getPayLaterPromoData result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", payLaterPayModePromoType.name())), null, 4, null);
        promoCardViewModel.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData(promoCardContent, setupCardInfo));
    }

    public static final /* synthetic */ boolean access$hasDeclineOrStepUpDecision(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel promoCardViewModel, java.util.List list) {
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision : list2) {
            if (riskDecision.getDecisionCode() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.DECLINED || riskDecision.getDecisionCode() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.STEPUP) {
                return true;
            }
        }
        return false;
    }
}
