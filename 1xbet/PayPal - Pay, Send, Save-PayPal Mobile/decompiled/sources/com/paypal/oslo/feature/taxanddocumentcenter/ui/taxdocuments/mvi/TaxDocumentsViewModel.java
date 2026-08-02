package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010&R&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020*0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010+R \u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020*018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/usecase/TaxDocumentsUseCaseProvider;", "useCases", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "downloadOrchestrator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/navigation/DeeplinkNavigationHandler;", "deeplinkNavigationHandler", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/usecase/TaxDocumentsUseCaseProvider;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/navigation/DeeplinkNavigationHandler;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsReducer;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;)V", "resetDownloadOrchestrator", "()V", "", "url", "", "shouldRefreshOnReturn", "navigateToDeeplink", "(Ljava/lang/String;Z)V", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/usecase/TaxDocumentsUseCaseProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/navigation/DeeplinkNavigationHandler;", "Camera2StreamConfigurationMap", "Z", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState> uiState;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public TaxDocumentsViewModel(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler deeplinkNavigationHandler, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsReducer taxDocumentsReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsUseCaseProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkNavigationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        this.getHighSpeedVideoSizes = taxDocumentsUseCaseProvider;
        this.getHighSpeedVideoFpsRangesFor = downloadOrchestrator;
        this.Camera2StreamConfigurationMap = deeplinkNavigationHandler;
        this.getHighSpeedVideoFpsRanges = true;
        java.lang.Object[] objArr = 0 == true ? 1 : 0;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent> input) {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator2;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize.INSTANCE)) {
                    z = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this.getOutputFormats;
                    if (!z) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, input.getEventDispatcher(), null), 3, null);
                        return;
                    } else {
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this.getOutputFormats = false;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Skipping initialization after FAQ deeplink", null, null, 6, null);
                        return;
                    }
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r10), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) event).getYear(), null), 3, null);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader.INSTANCE)) {
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked reportLinkClicked = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked) event;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta = reportLinkClicked.getCta();
                    if ((cta != null ? cta.getType() : null) == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL && cta.getLinkName() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.SELF_CORRECTION_1099K) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r10), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleSelfCorrectionRequest$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, reportLinkClicked.getReportId(), null), 3, null);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r10), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleReconciliationRequest$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$handleReportCardClick(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked) event, input.getEventDispatcher());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$handleFormDownload(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected) event).getDownloadUrl(), input.getEventDispatcher());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, event, null), 3, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError.INSTANCE)) {
                    downloadOrchestrator2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this.getHighSpeedVideoFpsRangesFor;
                    downloadOrchestrator2.dismissError();
                }
            }
        });
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("TaxDocumentsViewModel.store", new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading(null, objArr, 3, 0 == true ? 1 : 0), taxDocumentsReducer, listOf, androidx.view.ViewModelKt.getViewModelScope(taxDocumentsViewModel));
        this.getHighSpeedVideoSizesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(taxDocumentsViewModel), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(taxDocumentsViewModel), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r14 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ab, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r14 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadInitialPageData(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadInitialPageData$1 taxDocumentsViewModel$loadInitialPageData$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadInitialPageData$1) {
            taxDocumentsViewModel$loadInitialPageData$1 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadInitialPageData$1) continuation;
            if ((taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = taxDocumentsViewModel$loadInitialPageData$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo> invoke = taxDocumentsViewModel.getHighSpeedVideoSizes.getGetUserInfo().invoke();
                    taxDocumentsViewModel$loadInitialPageData$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoSizes = str2;
                    taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(invoke, taxDocumentsViewModel$loadInitialPageData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior = (arrow.core.Ior) obj;
                        if (!(ior instanceof arrow.core.Ior.Left)) {
                            if (!(ior instanceof arrow.core.Ior.Right)) {
                                if (!(ior instanceof arrow.core.Ior.Both)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                                java.lang.Object leftValue = both.getLeftValue();
                                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain taxDocumentsPageDataDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain) both.getRightValue();
                                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) leftValue;
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Initial page load completed with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", taxDocumentCenterError.getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterErrorKt.toErrorMessage(taxDocumentCenterError))), null, 4, null);
                                if (taxDocumentsPageDataDomain.getReportSections().isEmpty()) {
                                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed.INSTANCE);
                                } else {
                                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded(taxDocumentsPageDataDomain.getReportSections()));
                                }
                                if (taxDocumentsPageDataDomain.getFaqItems().isEmpty()) {
                                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed.INSTANCE);
                                } else {
                                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded(taxDocumentsPageDataDomain.getFaqItems()));
                                    taxDocumentsViewModel.getHighSpeedVideoFpsRanges = false;
                                }
                            } else {
                                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain taxDocumentsPageDataDomain2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain) ((arrow.core.Ior.Right) ior).getValue();
                                taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded(taxDocumentsPageDataDomain2.getReportSections()));
                                taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded(taxDocumentsPageDataDomain2.getFaqItems()));
                                taxDocumentsViewModel.getHighSpeedVideoFpsRanges = false;
                            }
                        } else {
                            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) ior).getValue();
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Initial page load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", taxDocumentCenterError2.getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterErrorKt.toErrorMessage(taxDocumentCenterError2))), null, 4, null);
                            taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed.INSTANCE);
                            taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed.INSTANCE);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    str2 = (java.lang.String) taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) taxDocumentsViewModel$loadInitialPageData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo userInfo = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo) obj;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.IpsArticleParams forTaxFaqs = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.IpsArticleParams.INSTANCE.forTaxFaqs(userInfo.getExperience());
                com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageData = taxDocumentsViewModel.getHighSpeedVideoSizes.getGetTaxDocumentsPageData();
                taxDocumentsViewModel$loadInitialPageData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInfo);
                taxDocumentsViewModel$loadInitialPageData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(forTaxFaqs);
                taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = getTaxDocumentsPageData.invoke(str, str2, forTaxFaqs, taxDocumentsViewModel$loadInitialPageData$1);
            }
        }
        taxDocumentsViewModel$loadInitialPageData$1 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadInitialPageData$1(taxDocumentsViewModel, continuation);
        java.lang.Object obj2 = taxDocumentsViewModel$loadInitialPageData$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo userInfo2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo) obj2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.IpsArticleParams forTaxFaqs2 = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.IpsArticleParams.INSTANCE.forTaxFaqs(userInfo2.getExperience());
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageData2 = taxDocumentsViewModel.getHighSpeedVideoSizes.getGetTaxDocumentsPageData();
        taxDocumentsViewModel$loadInitialPageData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInfo2);
        taxDocumentsViewModel$loadInitialPageData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(forTaxFaqs2);
        taxDocumentsViewModel$loadInitialPageData$1.getHighSpeedVideoFpsRangesFor = 2;
        obj2 = getTaxDocumentsPageData2.invoke(str, str2, forTaxFaqs2, taxDocumentsViewModel$loadInitialPageData$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadReportsOnly(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadReportsOnly$1 taxDocumentsViewModel$loadReportsOnly$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadReportsOnly$1) {
            taxDocumentsViewModel$loadReportsOnly$1 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadReportsOnly$1) continuation;
            if ((taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = taxDocumentsViewModel$loadReportsOnly$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReports = taxDocumentsViewModel.getHighSpeedVideoSizes.getGetTaxReports();
                    taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    taxDocumentsViewModel$loadReportsOnly$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getTaxReports.invoke(str, str2, taxDocumentsViewModel$loadReportsOnly$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded((java.util.List) ((arrow.core.Ior.Right) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    taxDocumentsViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded((java.util.List) both.getRightValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        taxDocumentsViewModel$loadReportsOnly$1 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadReportsOnly$1(taxDocumentsViewModel, continuation);
        java.lang.Object obj2 = taxDocumentsViewModel$loadReportsOnly$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxDocumentsViewModel$loadReportsOnly$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizesFor.onEvent(event);
    }

    public final void resetDownloadOrchestrator() {
        this.getHighSpeedVideoFpsRangesFor.cancelAndReset();
    }

    public final void navigateToDeeplink(java.lang.String url, boolean shouldRefreshOnReturn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (this.Camera2StreamConfigurationMap.navigate(url)) {
            this.getOutputFormats = !shouldRefreshOnReturn;
        }
    }

    public static final /* synthetic */ java.lang.String access$extractCountryCode(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.core.userstore.model.UserState userState) {
        if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
            return null;
        }
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState;
        java.lang.String country = profileLoaded.getUser().getCountry();
        return country == null ? profileLoaded.getUser().getAccountCountryCode() : country;
    }

    public static final /* synthetic */ java.lang.String access$getInitializationErrorMessage(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.core.userstore.model.UserState userState) {
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError ? "Failed to load user profile" : "Country code not available";
    }

    public static final /* synthetic */ void access$handleFormDownload(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        if (kotlin.text.StringsKt.isBlank(str)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Download URL is missing for selected form", null, null, 6, null);
            function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed("Download link not available"));
        } else {
            taxDocumentsViewModel.getHighSpeedVideoFpsRangesFor.startDownload(str);
        }
    }

    public static final /* synthetic */ void access$handleReportCardClick(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked reportCardClicked, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta = reportCardClicked.getCta();
        if (reportCardClicked.getReportStatus() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE) {
            if ((cta != null ? cta.getType() : null) == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.DOWNLOAD) {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription linkDescription = cta.getLinkDescription();
                java.lang.String href = linkDescription != null ? linkDescription.getHref() : null;
                java.lang.String str = href;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Download URL is missing for report ".concat(java.lang.String.valueOf(reportCardClicked.getReportId())), null, null, 6, null);
                    function1.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed("Download link not available"));
                } else {
                    taxDocumentsViewModel.getHighSpeedVideoFpsRangesFor.startDownload(href);
                }
            }
        }
    }
}
