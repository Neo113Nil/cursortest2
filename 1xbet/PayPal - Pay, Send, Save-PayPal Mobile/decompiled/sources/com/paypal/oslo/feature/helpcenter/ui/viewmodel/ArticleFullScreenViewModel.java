package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR)\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ArticleFullScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;", "fetchArticleUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "articleId", "", "loadArticle", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/RecommendedArticleUiData;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "recommendedArticlesState", "Lkotlinx/coroutines/flow/StateFlow;", "getRecommendedArticlesState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticleFullScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.Article>> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>>> recommendedArticlesState;

    @javax.inject.Inject
    public ArticleFullScreenViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchArticleUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = fetchArticleUseCase;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.recommendedArticlesState = MutableStateFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.Article>> getScreenState() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>>> getRecommendedArticlesState() {
        return this.recommendedArticlesState;
    }

    public final void loadArticle(java.lang.String articleId) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(articleId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(articleId, this.getHighSpeedVideoSizes)) {
            return;
        }
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRanges;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
        this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel$loadArticle$2(this, articleId, null), 3, null);
        this.getHighSpeedVideoFpsRanges = launch$default;
    }
}
