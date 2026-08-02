package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0012J(\u0010'\u001a\u00020\u00102\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0010¢\u0006\u0004\b)\u0010\u0012R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u00104\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002090<8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010C"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ConnectedAppsAndSitesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/feature/consumerprivacy/ui/mapper/ConnectedAppsMapper;", "connectedAppsMapper", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/GetConnectedAppsUseCase;", "getConnectedAppsUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeleteAuthConsentUseCase;", "deleteAuthConsentUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeactivateAuthConsentUseCase;", "deactivateAuthConsentUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/RemoveProviderConsentUseCase;", "removeProviderConsentUseCase", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/feature/consumerprivacy/ui/mapper/ConnectedAppsMapper;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/GetConnectedAppsUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeleteAuthConsentUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeactivateAuthConsentUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/RemoveProviderConsentUseCase;)V", "", "loadConnectedApps", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "removeApp", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;)V", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "removeConnection", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;)V", "", "deleteData", "unlinkEmail", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;Z)V", "", "consentId", "getConsentAgreementUrl", "(Ljava/lang/String;)Ljava/lang/String;", "dismissBanner", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "Lkotlin/ExtensionFunctionType;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)V", "retry", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/ui/mapper/ConnectedAppsMapper;", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/GetConnectedAppsUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeleteAuthConsentUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeactivateAuthConsentUseCase;", "getHighSpeedVideoSizes", "getOutputFormats", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/RemoveProviderConsentUseCase;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectedAppsAndSitesViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ConnectedAppsAndSitesViewModel(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase getConnectedAppsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase deleteAuthConsentUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase deactivateAuthConsentUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase removeProviderConsentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getConnectedAppsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteAuthConsentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateAuthConsentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeProviderConsentUseCase, "");
        this.getHighSpeedVideoFpsRanges = webEnvironmentProvider;
        this.getHighSpeedVideoFpsRangesFor = connectedAppsMapper;
        this.Camera2StreamConfigurationMap = getConnectedAppsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = deleteAuthConsentUseCase;
        this.getHighSpeedVideoSizes = deactivateAuthConsentUseCase;
        this.getInputSizeshNQ4ISI = removeProviderConsentUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading.INSTANCE);
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getInputFormats = kotlin.collections.CollectionsKt.emptyList();
        loadConnectedApps();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState> getUiState() {
        return this.uiState;
    }

    public final void loadConnectedApps() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$loadConnectedApps$1(this, null), 3, null);
    }

    public final void removeApp(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem app2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1(this, app2, null), 3, null);
    }

    public final void removeConnection(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1(this, app2, null), 3, null);
    }

    public final void unlinkEmail(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app2, boolean deleteData) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
        java.lang.String provider = app2.getProvider();
        java.lang.String consentId = app2.getConsentId();
        java.lang.String str2 = provider;
        if (str2 != null && str2.length() != 0 && (str = consentId) != null && str.length() != 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2(this, provider, consentId, deleteData, app2, null), 3, null);
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.consumerprivacy.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        if (provider == null) {
            provider = "";
        }
        pairArr[0] = kotlin.TuplesKt.to("provider", provider);
        pairArr[1] = kotlin.TuplesKt.to("consentId", consentId != null ? consentId : "");
        com.paypal.android.logger.Logger.e$default(logger, "Cannot unlink email: missing required fields", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.$r8$lambda$1jtCY9zdo8tNQvNRTdx_K1oPkwQ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj);
            }
        });
    }

    public final java.lang.String getConsentAgreementUrl(java.lang.String consentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentId, "");
        java.lang.String webBaseUrl = this.getHighSpeedVideoFpsRanges.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/myaccount/autopay/connect/consent-agreement/");
        sb.append(consentId);
        return sb.toString();
    }

    public final void dismissBanner() {
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.$r8$lambda$ZUbq_1dBgOBCiqtT5aAEpNvNJZY((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content> p0) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState value = this.getOutputMinFrameDuration.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) {
            this.getOutputMinFrameDuration.setValue(p0.invoke(value));
        }
    }

    public final void retry() {
        loadConnectedApps();
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content $r8$lambda$1jtCY9zdo8tNQvNRTdx_K1oPkwQ(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default(content, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError.INSTANCE, 7, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content $r8$lambda$ZUbq_1dBgOBCiqtT5aAEpNvNJZY(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default(content, null, null, false, null, 7, null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult access$mapUnlinkResult(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, boolean z, boolean z2, boolean z3) {
        if (!z) {
            return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed.INSTANCE;
        }
        if (z3 && z2) {
            return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess.INSTANCE;
        }
        if (z3 && !z2) {
            return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed.INSTANCE;
        }
        return com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess.INSTANCE;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, kotlin.jvm.functions.Function1 function1) {
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list = connectedAppsAndSitesViewModel.getInputFormats;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((java.lang.Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        connectedAppsAndSitesViewModel.getInputFormats = arrayList2;
        connectedAppsAndSitesViewModel.getOutputMinFrameDuration.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default(connectedAppsAndSitesViewModel.getHighSpeedVideoFpsRangesFor.mapToUiState(arrayList2), null, null, false, null, 7, null));
    }
}
