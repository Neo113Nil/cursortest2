package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001cBA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0017J\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0017J\r\u0010#\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001d¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0015¢\u0006\u0004\b&\u0010\u0017J\r\u0010'\u001a\u00020\u0015¢\u0006\u0004\b'\u0010\u0017J\r\u0010(\u001a\u00020\u0015¢\u0006\u0004\b(\u0010\u0017J\r\u0010)\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0017J\r\u0010+\u001a\u00020\u0015¢\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001a\u00020\u0015¢\u0006\u0004\b,\u0010\u0017J\r\u0010-\u001a\u00020\u0015¢\u0006\u0004\b-\u0010\u0017J\r\u0010.\u001a\u00020\u0015¢\u0006\u0004\b.\u0010\u0017J\r\u0010/\u001a\u00020\u0015¢\u0006\u0004\b/\u0010\u0017J\r\u00100\u001a\u00020\u0015¢\u0006\u0004\b0\u0010\u0017J\r\u00101\u001a\u00020\u0015¢\u0006\u0004\b1\u0010\u0017J\u0015\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0015¢\u0006\u0004\b6\u0010\u0017J\r\u00107\u001a\u00020\u0015¢\u0006\u0004\b7\u0010\u0017J\r\u00108\u001a\u00020\u0015¢\u0006\u0004\b8\u0010\u0017J\r\u00109\u001a\u00020\u0015¢\u0006\u0004\b9\u0010\u0017J\r\u0010:\u001a\u00020\u0015¢\u0006\u0004\b:\u0010\u0017J\r\u0010;\u001a\u00020\u0015¢\u0006\u0004\b;\u0010\u0017J\r\u0010<\u001a\u00020\u0015¢\u0006\u0004\b<\u0010\u0017J\u0015\u0010>\u001a\u00020\u00152\u0006\u0010=\u001a\u000202¢\u0006\u0004\b>\u00105J#\u0010C\u001a\u00020\u00152\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150A¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u00152\u0006\u0010@\u001a\u00020?2\u0006\u0010E\u001a\u000202¢\u0006\u0004\bF\u0010GJ%\u0010K\u001a\u00020\u00152\u0006\u0010H\u001a\u0002022\u0006\u0010I\u001a\u0002022\u0006\u0010J\u001a\u000202¢\u0006\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010M\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010W\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ZR\u0014\u0010\\\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010[R\u0014\u0010^\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010]R$\u0010`\u001a\u0002022\u0006\u0010_\u001a\u0002028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositSummaryViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/intent/SummaryIntent;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositUiState;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetVbaUseCase;", "getVbaUseCase", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/UpdateDirectDebitStatusUseCase;", "updateDirectDebitStatusUseCase", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/mapper/VbaToUiStateMapper;", "vbaItemToUiStateMapper", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetAtomicPublicTokenUseCase;", "getAtomicPublicTokenUseCase", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/LinkDirectDepositAccountUseCase;", "linkDirectDepositAccountUseCase", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetSmartRoutePreferencesUseCase;", "getSmartRoutePreferencesUseCase", "Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetVbaUseCase;Lcom/paypal/oslo/feature/directdeposit/domain/usecase/UpdateDirectDebitStatusUseCase;Lcom/paypal/oslo/feature/directdeposit/ui/summary/mapper/VbaToUiStateMapper;Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetAtomicPublicTokenUseCase;Lcom/paypal/oslo/feature/directdeposit/domain/usecase/LinkDirectDepositAccountUseCase;Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetSmartRoutePreferencesUseCase;Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;)V", "", "onScreenShown", "()V", "intent", "processIntent", "(Lcom/paypal/oslo/feature/directdeposit/ui/summary/intent/SummaryIntent;)V", "toggleAccountNumberVisibility", "toggleDirectDebitEnabled", "", "enabled", "onDirectDebitToggle", "(Z)V", "loadDirectDepositInfo", "retryLoading", "copyAccountNumber", "()Z", "copyRoutingNumber", "toggleDirectDepositInfoExpanded", "retryDirectDebitUpdate", "dismissDirectDebitErrorHalfSheet", "retryAtomicSetup", "dismissAtomicSetupErrorHalfSheet", "retryLinkAccount", "dismissLinkAccountErrorHalfSheet", "retrySmartRoutePreferences", "dismissSmartRoutePreferencesErrorHalfSheet", "toggleDirectDebitInfoExpanded", "clearToastMessage", "onEasySetupClick", "", "handoffId", "onAtomicSetupComplete", "(Ljava/lang/String;)V", "onSmartRouteSetupClick", "refreshSmartRoutePreferences", "onFillFormClick", "onFindEmployerScreenShown", "onEmployerSetupDonePressed", "dismissErrorScreen", "cleanGUID", "guid", "setAtomicTransactGUID", "Lorg/json/JSONObject;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function0;", com.sun.jna.Callback.METHOD_NAME, "shouldOpenSuccessHalfSheet", "(Lorg/json/JSONObject;Lkotlin/jvm/functions/Function0;)V", "entryPoint", "parseOnInteractionAtomicTransactJson", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "identifier", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "routingNumber", "updateDepositSwitchAccountDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetVbaUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/UpdateDirectDebitStatusUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/mapper/VbaToUiStateMapper;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetAtomicPublicTokenUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/LinkDirectDepositAccountUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/directdeposit/domain/usecase/GetSmartRoutePreferencesUseCase;", "Lcom/paypal/oslo/feature/directdeposit/manager/DirectDepositFeatureManager;", "getOutputFormats", "Ljava/lang/String;", "getInputSizeshNQ4ISI", "p0", "atomicTransactGUID", "getAtomicTransactGUID", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositSummaryViewModel extends com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel<com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState, com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect> {
    public static final int MAX_RETRY_ATTEMPTS = 3;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase getHighSpeedVideoSizesFor;
    private java.lang.String atomicTransactGUID;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public DirectDepositSummaryViewModel(com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase getVbaUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase updateDirectDebitStatusUseCase, com.paypal.oslo.feature.directdeposit.ui.summary.mapper.VbaToUiStateMapper vbaToUiStateMapper, com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase getAtomicPublicTokenUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase linkDirectDepositAccountUseCase, com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase getSmartRoutePreferencesUseCase, com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager) {
        super(new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState(false, null, null, false, null, null, 0 == true ? 1 : 0, false, false, false, null, null, false, false, null, null, 0, false, null, 0, false, 0, false, 0, false, 0, false, 134217727, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getVbaUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateDirectDebitStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vbaToUiStateMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAtomicPublicTokenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkDirectDepositAccountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSmartRoutePreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFeatureManager, "");
        this.Camera2StreamConfigurationMap = getVbaUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = updateDirectDebitStatusUseCase;
        this.getHighSpeedVideoFpsRangesFor = vbaToUiStateMapper;
        this.getHighSpeedVideoFpsRanges = getAtomicPublicTokenUseCase;
        this.getHighSpeedVideoSizes = linkDirectDepositAccountUseCase;
        this.getHighSpeedVideoSizesFor = getSmartRoutePreferencesUseCase;
        this.getOutputFormats = directDepositFeatureManager;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getInputSizeshNQ4ISI = obj;
        this.atomicTransactGUID = "";
        if (directDepositFeatureManager.isDirectDepositFeatureEnabled()) {
            loadDirectDepositInfo();
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Direct Deposit feature is disabled", null, null, 6, null);
            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$Jqy56wqlCVYM37VkKYPjfq1aD5Q((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
        }
    }

    public final java.lang.String getAtomicTransactGUID() {
        return this.atomicTransactGUID;
    }

    public final void onScreenShown() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createSummaryScreenShownEvent(this.getInputSizeshNQ4ISI).track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel
    public final void processIntent(com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent.LoadVba) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1(this, null), 3, null);
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent.LoadSmartRoutePreferences) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1(this, null), 3, null);
        } else {
            if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent.CopyAccountNumberClicked)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (getState().getValue().getAccountNumber().length() > 0) {
                emitEffect(new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast("Account number copied"));
            }
        }
    }

    public final void toggleAccountNumberVisibility() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createShowAllAccountNumberPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$MJlHX9YL4h1xSSoDBYTK5_vbxCU((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void toggleDirectDebitEnabled() {
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$mpbiLL8AmH4wXfr46sPi5snyiQ8((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void onDirectDebitToggle(boolean enabled) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onDirectDebitToggle$1(this, enabled, null), 3, null);
    }

    public final void retryLoading() {
        loadDirectDepositInfo();
    }

    public final boolean copyAccountNumber() {
        if (getState().getValue().getAccountNumber().length() <= 0) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createCopyAccountNumberPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14773$r8$lambda$_Wwi4VeHuHfxSuAUQbRFeRzW0Y((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createCopiedToClipboardToastShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        return true;
    }

    public final boolean copyRoutingNumber() {
        if (getState().getValue().getRoutingNumber().length() <= 0) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createCopyRoutingNumberPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14774$r8$lambda$c673eJaJ0zVDLoF11Ye55_Bdqw((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createCopiedToClipboardToastShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        return true;
    }

    public final void toggleDirectDepositInfoExpanded() {
        boolean isDirectDepositInfoExpanded = getState().getValue().isDirectDepositInfoExpanded();
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createHowDirectDepositWorksAccordionPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14770$r8$lambda$4BJlVeCyEmV5f_gtZ1dpEPrnE((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        if (isDirectDepositInfoExpanded) {
            return;
        }
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createHowDirectDepositWorksExpandedModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void retryDirectDebitUpdate() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Retrying direct debit update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(getState().getValue().getDirectDebitErrorRetryCount()))), null, 4, null);
        boolean isDirectDebitEnabled = getState().getValue().isDirectDebitEnabled();
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14777$r8$lambda$wiqcZF9sLmIqEHhC7YcYWUUxXA((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        onDirectDebitToggle(!isDirectDebitEnabled);
    }

    public final void dismissDirectDebitErrorHalfSheet() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Dismissing direct debit error half sheet", null, null, 6, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$bKdbBWUhndmz4S6zemJuM0Mxeao((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void retryAtomicSetup() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Retrying Atomic setup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(getState().getValue().getAtomicSetupErrorRetryCount()))), null, 4, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$nRJ1u2_16LRENs9hMo08GMZkwfg((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        onEasySetupClick();
    }

    public final void dismissAtomicSetupErrorHalfSheet() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Dismissing Atomic setup error half sheet", null, null, 6, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$M_wjGoI4_ZQeAhKc2yThcaefTkw((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void retryLinkAccount() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Retrying link account", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(getState().getValue().getLinkAccountErrorRetryCount()))), null, 4, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14769$r8$lambda$2VDQyehbnBxjUXcFPepqZUPGE((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        java.lang.String str = this.atomicTransactGUID;
        if (str.length() > 0) {
            onAtomicSetupComplete(str);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Cannot retry link account - no handoffId available", null, null, null, 14, null);
            dismissLinkAccountErrorHalfSheet();
        }
    }

    public final void dismissLinkAccountErrorHalfSheet() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Dismissing link account error half sheet", null, null, 6, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$xF2vpRSvuurpLeW1f8XC5y5GulE((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void retrySmartRoutePreferences() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Retrying SmartRoute preferences load", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(getState().getValue().getSmartRoutePreferencesErrorRetryCount()))), null, 4, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$IHofxgd4tY_OrMpJVUg4sV3BICQ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1(this, null), 3, null);
    }

    public final void dismissSmartRoutePreferencesErrorHalfSheet() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Dismissing SmartRoute preferences error half sheet", null, null, 6, null);
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14768$r8$lambda$CJUMd5CTZoln4TmF8XhCdRZwBQ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void toggleDirectDebitInfoExpanded() {
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$piu_eFoN26NuJ6wptnz56CwjfSw((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void clearToastMessage() {
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$MCLdYsVtJJDl2g26FvXsYRsIIvA((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void onEasySetupClick() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createFindYourEmployerPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onEasySetupClick$1(this, null), 3, null);
    }

    public final void onAtomicSetupComplete(java.lang.String handoffId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handoffId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onAtomicSetupComplete$1(handoffId, this, null), 3, null);
    }

    public final void onSmartRouteSetupClick() {
        com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution;
        java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> targets;
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createSmartRouteSetUpCtaPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = getState().getValue().getSmartRoutePreferences();
        if (smartRoutePreferences != null && (distribution = smartRoutePreferences.getDistribution()) != null && (targets = distribution.getTargets()) != null) {
            java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> list = targets;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (com.paypal.oslo.feature.directdeposit.domain.model.Target target : list) {
                    if (target.getAllocationPercentage() != null && target.getAllocationPercentage().doubleValue() > 0.0d) {
                        emitEffect(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteEdit.INSTANCE);
                        return;
                    }
                }
            }
        }
        emitEffect(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteSetup.INSTANCE);
    }

    public final void refreshSmartRoutePreferences() {
        if (this.getOutputFormats.isBalanceL2SmartRouteEnabled()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Refreshing SmartRoute preferences after navigation", null, null, 6, null);
            processIntent((com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent) com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent.LoadSmartRoutePreferences.INSTANCE);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "SmartRoute entry point disabled - skipping refresh", null, null, 6, null);
        }
    }

    public final void onFillFormClick() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createFillOutDdFormPressedEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        emitEffect(new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm(getState().getValue().getRoutingNumber(), getState().getValue().getAccountNumber(), getState().getValue().getBankName()));
    }

    public final void onFindEmployerScreenShown() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createFindEmployerScreenShownEvent(this.getInputSizeshNQ4ISI).track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createEmployerSearchLoadingModuleShownEvent(this.getInputSizeshNQ4ISI).track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void onEmployerSetupDonePressed() {
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositFindEmployerAnalytics.INSTANCE.createDoneCtaPressedEvent(this.getInputSizeshNQ4ISI).track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void dismissErrorScreen() {
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14775$r8$lambda$oMa_lvL6x9GKBTiXgqYqRTjRlU((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public final void cleanGUID() {
        this.atomicTransactGUID = "";
    }

    public final void setAtomicTransactGUID(java.lang.String guid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(guid, "");
        cleanGUID();
        this.atomicTransactGUID = guid;
    }

    public final void shouldOpenSuccessHalfSheet(org.json.JSONObject data, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.lang.String optString = data.optString("handoffId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
        if (optString.length() > 0) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Success half-sheet triggered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_handoff_id", java.lang.Boolean.TRUE)), null, 4, null);
            callback.invoke();
        }
    }

    public final void parseOnInteractionAtomicTransactJson(org.json.JSONObject data, java.lang.String entryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Atomic SDK interaction parsed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("name", data.optString("name", "")), kotlin.TuplesKt.to("action", data.optString("action", "")), kotlin.TuplesKt.to("entry_point", entryPoint), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, data.optJSONObject(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE))), null, 4, null);
    }

    public final void updateDepositSwitchAccountDetail(java.lang.String identifier, java.lang.String accountNumber, java.lang.String routingNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$updateDepositSwitchAccountDetail$1(accountNumber, routingNumber, this, identifier, null), 3, null);
    }

    /* renamed from: $r8$lambda$-CJUMd5CTZoln4TmF8XhCdRZwBQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14768$r8$lambda$CJUMd5CTZoln4TmF8XhCdRZwBQ(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$2VD-QyehbnBxj-UXcFPepqZUPGE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14769$r8$lambda$2VDQyehbnBxjUXcFPepqZUPGE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$41UyLkdscGlY0U1F5z_avMW6BI4(boolean z, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : !z, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : directDepositUiState.getDirectDebitErrorRetryCount() + 1, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : true, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$4BJlVe-CyEmV5f_gtZ1dpE-PrnE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14770$r8$lambda$4BJlVeCyEmV5f_gtZ1dpEPrnE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : !directDepositUiState.isDirectDepositInfoExpanded(), (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$GaLDZm0c3-b_Ctt0tqfv0-Go7a0, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14771$r8$lambda$GaLDZm0c3b_Ctt0tqfv0Go7a0(boolean z, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : z ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.ACTIVE : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.INACTIVE, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : z, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : java.lang.Integer.valueOf(z ? com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_directdebit_toast_activated : com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_directdebit_toast_deactivated), (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$IHofxgd4tY_OrMpJVUg4sV3BICQ(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$Jar-jSUtwvzi-FTdo3Osr5F1uWg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14772$r8$lambda$JarjSUtwvziFTdo3Osr5F1uWg(boolean z, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : !z, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : directDepositUiState.getDirectDebitErrorRetryCount() + 1, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : true, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$Jqy56wqlCVYM37VkKYPjfq1aD5Q(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.FEATURE_UNAVAILABLE, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : true, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$MCLdYsVtJJDl2g26FvXsYRsIIvA(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$MJlHX9YL4h1xSSoDBYTK5_vbxCU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : !directDepositUiState.isAccountNumberVisible(), (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$M_wjGoI4_ZQeAhKc2yThcaefTkw(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$_Wwi4VeHuHfxSuAUQbRFe-RzW0Y, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14773$r8$lambda$_Wwi4VeHuHfxSuAUQbRFeRzW0Y(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_accountcopied_toast), (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$bKdbBWUhndmz4S6zemJuM0Mxeao(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$c673eJaJ0z-VDLoF11Ye55_Bdqw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14774$r8$lambda$c673eJaJ0zVDLoF11Ye55_Bdqw(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_accountcopied_toast), (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$lyscAzetdeJiFa4jTnjaAYoWyMw(boolean z, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : true, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : z, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$mpbiLL8AmH4wXfr46sPi5snyiQ8(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : !directDepositUiState.isDirectDebitEnabled(), (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$nRJ1u2_16LRENs9hMo08GMZkwfg(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$oMa_lvL6x9GK-BTiXgqYqRTjRlU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14775$r8$lambda$oMa_lvL6x9GKBTiXgqYqRTjRlU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$piu_eFoN26NuJ6wptnz56CwjfSw(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : !directDepositUiState.isDirectDebitInfoExpanded(), (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$s2lIySsBL_aFDMq2IwNe_VcFzx8(boolean z, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : z ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.ACTIVE : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.INACTIVE, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : z, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : java.lang.Integer.valueOf(z ? com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_directdebit_toast_activated : com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_directdebit_toast_deactivated), (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$tRbQYgvAqlzWRksMeb4ugDJytIY(java.lang.String str, com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus, boolean z, boolean z2, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType = str != null ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.SERVER : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.NONE;
        java.lang.String bankAccountNumber = vbaSummaryItemState.getBankAccountNumber();
        java.lang.String bankAccountNumber2 = vbaSummaryItemState.getBankAccountNumber();
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : bankAccountNumber, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : bankAccountNumber2.length() >= 4 ? "••••".concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(bankAccountNumber2, 4))) : "••••0000", (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : vbaSummaryItemState.getRoutingNumber(), (r45 & 32) != 0 ? directDepositUiState.bankName : vbaSummaryItemState.getBankName(), (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : directDebitStatus, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : directDebitStatus == com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.ACTIVE, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : str, (r45 & 2048) != 0 ? directDepositUiState.errorType : errorType, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : z, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : z2, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$wA67z4m4K3AyE_6-ewC62jCJRek, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14776$r8$lambda$wA67z4m4K3AyE_6ewC62jCJRek(java.lang.Object obj, int i, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : obj.toString(), (r45 & 2048) != 0 ? directDepositUiState.errorType : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.SERVER, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : true, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : i, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    /* renamed from: $r8$lambda$wiqcZF9sLmIqEHhC7YcYWUU-xXA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState m14777$r8$lambda$wiqcZF9sLmIqEHhC7YcYWUUxXA(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState $r8$lambda$xF2vpRSvuurpLeW1f8XC5y5GulE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositUiState, "");
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static final /* synthetic */ void access$handleDirectDebitError(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, java.lang.Object obj, final boolean z) {
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to update direct debit status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", obj), kotlin.TuplesKt.to("requestedEnabled", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("currentRetryCount", java.lang.Integer.valueOf(directDepositSummaryViewModel.getState().getValue().getDirectDebitErrorRetryCount()))), null, null, 12, null);
        directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$41UyLkdscGlY0U1F5z_avMW6BI4(z, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
            }
        });
    }

    public static final /* synthetic */ void access$handleDirectDebitPartialSuccess(final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, java.lang.Object obj, boolean z, final boolean z2) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Updated direct debit status with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", obj), kotlin.TuplesKt.to("success", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(z2)), kotlin.TuplesKt.to("currentRetryCount", java.lang.Integer.valueOf(directDepositSummaryViewModel.getState().getValue().getDirectDebitErrorRetryCount()))), null, 4, null);
        if (!z) {
            directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14772$r8$lambda$JarjSUtwvziFTdo3Osr5F1uWg(z2, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
        } else {
            directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14771$r8$lambda$GaLDZm0c3b_Ctt0tqfv0Go7a0(z2, directDepositSummaryViewModel, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
        }
    }

    public static final /* synthetic */ void access$handleDirectDebitSuccess(final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, boolean z, final boolean z2) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Successfully updated direct debit status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(z2))), null, 4, null);
        directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$s2lIySsBL_aFDMq2IwNe_VcFzx8(z2, directDepositSummaryViewModel, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
    }

    public static final /* synthetic */ void access$handleVbaLoadError(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, final java.lang.Object obj) {
        final int retryCount = directDepositSummaryViewModel.getState().getValue().getRetryCount() + 1;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to load vba details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", obj.toString()), kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(retryCount)), kotlin.TuplesKt.to("maxRetries", 3), kotlin.TuplesKt.to("exceededRetries", java.lang.Boolean.valueOf(retryCount >= 3))), null, null, 12, null);
        directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.m14776$r8$lambda$wA67z4m4K3AyE_6ewC62jCJRek(obj, retryCount, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
            }
        });
    }

    public static final /* synthetic */ void access$handleVbaLoadSuccess(final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.domain.model.VbaItem vbaItem, final java.lang.String str) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus;
        final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState map = directDepositSummaryViewModel.getHighSpeedVideoFpsRangesFor.map(vbaItem);
        boolean z = map.getRoutingNumber().length() == 0 || map.getBankAccountNumber().length() == 0;
        if (z) {
            java.lang.String str2 = str != null ? "Partial VBA" : "VBA";
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.directdeposit.LoggerKt.log;
            java.lang.String concat = str2.concat(" data incomplete - showing intro screen");
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("hasRoutingNumber", java.lang.Boolean.valueOf(map.getRoutingNumber().length() > 0));
            pairArr[1] = kotlin.TuplesKt.to("hasAccountNumber", java.lang.Boolean.valueOf(map.getBankAccountNumber().length() > 0));
            com.paypal.android.logger.Logger.i$default(logger, concat, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        }
        java.lang.String directDebitStatus2 = map.getDirectDebitStatus();
        if (kotlin.jvm.internal.Intrinsics.areEqual(directDebitStatus2, com.payair.model.TokenStatusKt.TOKEN_ACTIVE)) {
            directDebitStatus = com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.ACTIVE;
        } else {
            directDebitStatus = kotlin.jvm.internal.Intrinsics.areEqual(directDebitStatus2, com.payair.model.TokenStatusKt.TOKEN_INACTIVE) ? com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.INACTIVE : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus.UNKNOWN;
        }
        final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDebitStatus directDebitStatus3 = directDebitStatus;
        final boolean isFillOutFormEnabled = directDepositSummaryViewModel.getOutputFormats.isFillOutFormEnabled();
        final boolean z2 = z;
        directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$tRbQYgvAqlzWRksMeb4ugDJytIY(str, map, directDepositSummaryViewModel, directDebitStatus3, z2, isFillOutFormEnabled, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj);
            }
        });
        if (z) {
            return;
        }
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createAccountRoutingDetailsModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createOtherSetupOptionsModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createDirectDebitModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createFaqModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void loadDirectDepositInfo() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1(this, null), 3, null);
    }
}
