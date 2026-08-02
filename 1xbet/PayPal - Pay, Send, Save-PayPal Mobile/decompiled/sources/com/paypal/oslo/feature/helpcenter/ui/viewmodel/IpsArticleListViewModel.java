package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R)\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/IpsArticleListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;", "fetchIpsArticlesUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;)V", "", "productReferenceId", "pageReferenceId", "fieldReferenceId", "", "fetchIpsArticles", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/IpsArticleData;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Lkotlinx/coroutines/flow/StateFlow;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlin/Triple;", "Lkotlin/Triple;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IpsArticleListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> screenState;

    @javax.inject.Inject
    public IpsArticleListViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchIpsArticlesUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fetchIpsArticlesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.screenState = MutableStateFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> getScreenState() {
        return this.screenState;
    }

    public final void fetchIpsArticles(java.lang.String productReferenceId, java.lang.String pageReferenceId, java.lang.String fieldReferenceId) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldReferenceId, "");
        kotlin.Triple triple = new kotlin.Triple(productReferenceId, pageReferenceId, fieldReferenceId);
        if (kotlin.jvm.internal.Intrinsics.areEqual(triple, this.getHighSpeedVideoSizes)) {
            return;
        }
        kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel$fetchIpsArticles$2(this, productReferenceId, pageReferenceId, fieldReferenceId, triple, null), 3, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }
}
