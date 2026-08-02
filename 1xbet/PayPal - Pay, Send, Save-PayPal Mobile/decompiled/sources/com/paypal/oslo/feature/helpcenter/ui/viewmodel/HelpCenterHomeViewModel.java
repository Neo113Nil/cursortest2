package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/HelpCenterHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;", "fetchRecommendedArticlesUseCase", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/GetUserFirstNameUseCase;", "getUserFirstNameUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;Lcom/paypal/oslo/feature/helpcenter/domain/usecase/GetUserFirstNameUseCase;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "fetchHomeData", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "", "userFirstName", "Lkotlinx/coroutines/flow/StateFlow;", "getUserFirstName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpCenterHomeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> userFirstName;

    @javax.inject.Inject
    public HelpCenterHomeViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase getUserFirstNameUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchRecommendedArticlesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserFirstNameUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = fetchRecommendedArticlesUseCase;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.userFirstName = kotlinx.coroutines.flow.FlowKt.stateIn(getUserFirstNameUseCase.invoke(), androidx.view.ViewModelKt.getViewModelScope(this), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
        fetchHomeData();
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getUserFirstName() {
        return this.userFirstName;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> getScreenState() {
        return this.getHighSpeedVideoSizes;
    }

    public final void fetchHomeData() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel$fetchHomeData$2(this, null), 3, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }
}
