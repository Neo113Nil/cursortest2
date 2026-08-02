package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsMviViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetStatementAvailabilityUseCase;", "getStatementAvailabilityUseCase", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "downloadOrchestrator", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetStatementAvailabilityUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsEvent;", "event", "", "process", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsEvent;)V", "retryDownload", "()V", "dismissDownloadError", "resetDownloadOrchestrator", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetStatementAvailabilityUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "downloadState", "getDownloadState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/OpenDownloadedFile;", "openFileEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "getOpenFileEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsMviViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> downloadState;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> openFileEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState> uiState;

    @javax.inject.Inject
    public AllTransactionsMviViewModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase getStatementAvailabilityUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStatementAvailabilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadOrchestrator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getStatementAvailabilityUseCase;
        this.Camera2StreamConfigurationMap = downloadOrchestrator;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AllTransactionsStore", com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsReducer.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(allTransactionsMviViewModel));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.downloadState = downloadOrchestrator.getState();
        this.openFileEffect = downloadOrchestrator.getEffect();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(allTransactionsMviViewModel), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> getDownloadState() {
        return this.downloadState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> getOpenFileEffect() {
        return this.openFileEffect;
    }

    public final void process(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent event) {
        java.lang.Object obj;
        java.lang.String url;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> months;
        java.lang.String downloadAllUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem monthItem = null;
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = null;
        monthItem = null;
        if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.RetryClicked) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1(this, null), 3, null);
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadYearClicked)) {
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadMonthClicked) {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadMonthClicked downloadMonthClicked = (com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadMonthClicked) event;
                int year = downloadMonthClicked.getYear();
                java.lang.String month = downloadMonthClicked.getMonth();
                com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState value = this.uiState.getValue();
                if (value instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) {
                    java.util.Iterator<T> it = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) value).getYears().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj).getYear() == year) {
                                break;
                            }
                        }
                    }
                    com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj;
                    if (yearAccordionItem != null && (months = yearAccordionItem.getMonths()) != null) {
                        java.util.Iterator<T> it2 = months.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it2.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem) next).getTitle(), month)) {
                                obj3 = next;
                                break;
                            }
                        }
                        monthItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem) obj3;
                    }
                    if (monthItem == null || (url = monthItem.getUrl()) == null) {
                        return;
                    }
                    this.Camera2StreamConfigurationMap.startDownload(url);
                    return;
                }
                return;
            }
            return;
        }
        int year2 = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.DownloadYearClicked) event).getYear();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState value2 = this.uiState.getValue();
        if (value2 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) {
            java.util.Iterator<T> it3 = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) value2).getYears().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it3.next();
                if (((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) next2).getYear() == year2) {
                    obj2 = next2;
                    break;
                }
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj2;
            if (yearAccordionItem2 == null || (downloadAllUrl = yearAccordionItem2.getDownloadAllUrl()) == null) {
                return;
            }
            this.Camera2StreamConfigurationMap.startDownload(downloadAllUrl);
        }
    }

    public final void retryDownload() {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState value = this.Camera2StreamConfigurationMap.getState().getValue();
        if (value instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) {
            this.Camera2StreamConfigurationMap.retryDownload(((com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) value).getDownloadUrl());
        }
    }

    public final void dismissDownloadError() {
        this.Camera2StreamConfigurationMap.dismissError();
    }

    public final void resetDownloadOrchestrator() {
        this.Camera2StreamConfigurationMap.cancelAndReset();
    }
}
