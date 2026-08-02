package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR,\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/HelpCenterSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/SearchArticlesUseCase;", "searchArticlesUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/SearchArticlesUseCase;)V", "", "query", "", "onSearchQueryChanged", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/SearchArticlesUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "searchQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/SearchArticleData;", "getHighResolutionOutputSizeshNQ4ISI", "searchResults", "getSearchResults", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpCenterSearchViewModel extends androidx.view.ViewModel {
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> searchResults;
    public static final int $stable = 8;

    @javax.inject.Inject
    public HelpCenterSearchViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase searchArticlesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchArticlesUseCase, "");
        this.Camera2StreamConfigurationMap = searchArticlesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.searchQuery = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(kotlin.collections.CollectionsKt.emptyList()));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow2;
        this.searchResults = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.debounce(MutableStateFlow, 500L), new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.AnonymousClass1(null)), androidx.view.ViewModelKt.getViewModelScope(this));
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return this.searchQuery;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> getSearchResults() {
        return this.searchResults;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "query", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$1", f = "HelpCenterSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.access$performSearch(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.this, str);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.AnonymousClass1) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.AnonymousClass1 anonymousClass1 = com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void onSearchQueryChanged(java.lang.String query) {
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        this.getHighSpeedVideoFpsRangesFor.setValue(query);
        java.lang.String obj = kotlin.text.StringsKt.trim(query).toString();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj.length() > 0) {
            success = com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE;
        } else {
            success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(kotlin.collections.CollectionsKt.emptyList());
        }
        mutableStateFlow.setValue(success);
    }

    public static final /* synthetic */ void access$performSearch(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel, java.lang.String str) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = helpCenterSearchViewModel.getHighSpeedVideoSizes;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        if (obj.length() != 0) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(helpCenterSearchViewModel), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$performSearch$1(helpCenterSearchViewModel, obj, null), 3, null);
            helpCenterSearchViewModel.getHighSpeedVideoSizes = launch$default;
        } else {
            helpCenterSearchViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(kotlin.collections.CollectionsKt.emptyList()));
        }
    }
}
