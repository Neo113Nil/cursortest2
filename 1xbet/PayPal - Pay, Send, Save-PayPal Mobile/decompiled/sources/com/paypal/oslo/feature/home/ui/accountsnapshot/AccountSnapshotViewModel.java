package com.paypal.oslo.feature.home.ui.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001.B;\b\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0$8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020 0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "includedTypes", "Lcom/paypal/oslo/feature/home/domain/usecase/GetAccountSnapshotSectionUseCase;", "getAccountSnapshotSection", "Lcom/paypal/oslo/feature/home/domain/usecase/RetrySectionUseCase;", "retrySection", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "loadingSectionProvider", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotReducer;", "reducer", "<init>", "(Ljava/util/Set;Lcom/paypal/oslo/feature/home/domain/usecase/GetAccountSnapshotSectionUseCase;Lcom/paypal/oslo/feature/home/domain/usecase/RetrySectionUseCase;Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotReducer;)V", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;)V", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/home/domain/usecase/GetAccountSnapshotSectionUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/usecase/RetrySectionUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotReducer;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.home.api.AccountSnapshotType> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect> getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;", "", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "includedTypes", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel;", "create", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface Factory {
        com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel create(java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> includedTypes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public AccountSnapshotViewModel(@dagger.assisted.Assisted java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getAccountSnapshotSectionUseCase, com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase retrySectionUseCase, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer accountSnapshotReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSnapshotSectionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrySectionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSectionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotReducer, "");
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighResolutionOutputSizeshNQ4ISI = getAccountSnapshotSectionUseCase;
        this.Camera2StreamConfigurationMap = retrySectionUseCase;
        this.getHighSpeedVideoSizes = loadingSectionProvider;
        this.getHighSpeedVideoFpsRangesFor = accountSnapshotReducer;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AccountSnapshotViewModel.store", new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading((com.paypal.oslo.feature.home.domain.model.Section) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) loadingSectionProvider.createLoadingSections(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.ACCOUNT_SNAPSHOT_SECTION_ID, com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT))), accountSnapshotReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent>() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$loadContent$1(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.this, input.getEventDispatcher(), null), 3, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$retryLoad$1(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizesFor.onEvent(event);
    }

    public static final /* synthetic */ void access$dispatchSectionEvent(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel, com.paypal.oslo.feature.home.domain.model.Section section, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.home.domain.model.Section section2;
        if (kotlin.jvm.internal.Intrinsics.areEqual(section.getType(), "Error")) {
            function1.invoke(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed(section));
            return;
        }
        if (!(kotlin.collections.CollectionsKt.firstOrNull(section.getItems()) instanceof com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) || accountSnapshotViewModel.getHighSpeedVideoFpsRanges == null) {
            section2 = section;
        } else {
            java.util.List items = section.getItems();
            kotlin.jvm.internal.Intrinsics.checkNotNull(items, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : items) {
                if (accountSnapshotViewModel.getHighSpeedVideoFpsRanges.contains(((com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) obj).getType())) {
                    arrayList.add(obj);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(section, "");
            section2 = section.copy((r18 & 1) != 0 ? section.id : null, (r18 & 2) != 0 ? section.type : null, (r18 & 4) != 0 ? section.title : null, (r18 & 8) != 0 ? section.subtitle : null, (r18 & 16) != 0 ? section.items : arrayList, (r18 & 32) != 0 ? section.buttonText : null, (r18 & 64) != 0 ? section.ctaPrompt : null, (r18 & 128) != 0 ? section.instrumentation : null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(section2, "");
        }
        function1.invoke(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded(section2));
    }
}
