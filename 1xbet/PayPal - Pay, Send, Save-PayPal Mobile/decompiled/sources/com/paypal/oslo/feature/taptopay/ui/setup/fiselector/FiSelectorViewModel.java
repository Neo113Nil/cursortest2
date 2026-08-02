package com.paypal.oslo.feature.taptopay.ui.setup.fiselector;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00102"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/FiSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getAllCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "getCardEligibilityUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;", "generateRiskDataUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/StepUpUriChallengeUseCase;", "stepUpUriChallengeUseCase", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorMapper;", "mapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/StepUpUriChallengeUseCase;Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "cachedDigitizedCards", "", "loadCardEligibility", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorUiState;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/StepUpUriChallengeUseCase;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "Ljava/util/List;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiSelectorViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> getInputFormats;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineDispatcher getOutputFormats;
    private kotlinx.coroutines.Job getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState> uiState;

    @javax.inject.Inject
    public FiSelectorViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase stepUpUriChallengeUseCase, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper fiSelectorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateRiskDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpUriChallengeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiSelectorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = payPalGetAllCardsUseCase;
        this.Camera2StreamConfigurationMap = payPalGetCardEligibilityUseCase;
        this.getHighSpeedVideoFpsRanges = generateRiskDataUseCase;
        this.getHighSpeedVideoFpsRangesFor = stepUpUriChallengeUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = fiSelectorMapper;
        this.getOutputFormats = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Loading.INSTANCE);
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        loadCardEligibility$default(this, null, 1, null);
        kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> entries = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entries) {
            if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType[]{com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown}).contains((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType) obj)) {
                arrayList.add(obj);
            }
        }
        this.getInputFormats = arrayList;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadCardEligibility$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        fiSelectorViewModel.loadCardEligibility(list);
    }

    public final void loadCardEligibility(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> cachedDigitizedCards) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null && job.isActive()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Skipping duplicate loadCardEligibility while request is already in flight", null, null, 6, null);
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Loading card eligibility for FI selector", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cachedDigitizedCardsCount", java.lang.Integer.valueOf(cachedDigitizedCards != null ? cachedDigitizedCards.size() : 0))), null, 4, null);
        this.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), this.getOutputFormats, null, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1("Load card eligibility", this, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR, null, cachedDigitizedCards, this), 2, null);
        this.getOutputMinFrameDuration = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState p0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Updating UI state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName())), null, 4, null);
        this.getInputSizeshNQ4ISI.setValue(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    public static final /* synthetic */ java.lang.Object access$handleEligibilitySuccess(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult cardEligibilityResult, java.util.List list, kotlin.coroutines.Continuation continuation) {
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision2;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility = cardEligibilityResult.getCardEligibility();
        if ((cardEligibility instanceof java.util.Collection) && cardEligibility.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator it = cardEligibility.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility) it.next()).isEligible() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        pairArr[0] = kotlin.TuplesKt.to("eligibleCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        pairArr[1] = kotlin.TuplesKt.to("promoCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(cardEligibilityResult.getPromoEligibility().size()));
        pairArr[2] = kotlin.TuplesKt.to("riskDecisions", kotlin.coroutines.jvm.internal.Boxing.boxInt(cardEligibilityResult.getRiskDecision().size()));
        com.paypal.android.logger.Logger.d$default(logger, "Card eligibility success", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> riskDecision3 = cardEligibilityResult.getRiskDecision();
        if (riskDecision3.isEmpty()) {
            riskDecision = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision(null, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.APPROVED, null, null);
        } else {
            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> list2 = riskDecision3;
            java.util.Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision) obj).getDecisionCode() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.DECLINED) {
                    break;
                }
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision) obj;
            if (riskDecision4 == null) {
                java.util.Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        riskDecision2 = 0;
                        break;
                    }
                    riskDecision2 = it3.next();
                    if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision) riskDecision2).getDecisionCode() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.STEPUP) {
                        break;
                    }
                }
                riskDecision = riskDecision2;
                if (riskDecision == null) {
                    riskDecision = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision(null, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.APPROVED, null, null);
                }
            } else {
                riskDecision = riskDecision4;
            }
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode = riskDecision.getDecisionCode();
        int i2 = decisionCode == null ? -1 : com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel.WhenMappings.$EnumSwitchMapping$0[decisionCode.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Risk decision DECLINED", null, null, 6, null);
                java.lang.String decisionMessage = riskDecision.getDecisionMessage();
                if (decisionMessage == null || (stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(decisionMessage)) == null) {
                    stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_error_access_declined, new java.lang.Object[0]);
                }
                fiSelectorViewModel.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(stringResourceRef, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR));
            } else if (i2 == 2) {
                java.lang.String contextId = riskDecision.getContextId();
                if (contextId != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(fiSelectorViewModel), fiSelectorViewModel.getOutputFormats, null, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$handleStepUpChallenge$$inlined$launchSafe$1("handleStepUpChallenge", fiSelectorViewModel, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR, null, fiSelectorViewModel, contextId, list), 2, null);
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "STEPUP decision missing contextId", null, null, 6, null);
                    java.lang.String decisionMessage2 = riskDecision.getDecisionMessage();
                    if (decisionMessage2 == null || (stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(decisionMessage2)) == null) {
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_error_auth_unavailable, new java.lang.Object[0]);
                    }
                    fiSelectorViewModel.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(stringResourceRef2, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR));
                }
            } else if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Risk decision APPROVED or no risk check", null, null, 6, null);
        java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> mapToSections = fiSelectorViewModel.getHighResolutionOutputSizeshNQ4ISI.mapToSections(cardEligibilityResult, list);
        if (mapToSections.isEmpty()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No eligible cards or promotions found", null, null, 6, null);
            fiSelectorViewModel.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.NO_ELIGIBLE_CARDS));
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Showing eligible cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sectionCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(mapToSections.size()))), null, 4, null);
            fiSelectorViewModel.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Success(mapToSections));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.DECLINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.STEPUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.APPROVED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
