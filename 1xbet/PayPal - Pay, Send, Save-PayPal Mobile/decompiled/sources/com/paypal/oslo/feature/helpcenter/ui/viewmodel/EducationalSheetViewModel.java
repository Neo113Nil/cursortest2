package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/EducationalSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchEducationalSheetDataUseCase;", "fetchEducationalSheetDataUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchEducationalSheetDataUseCase;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EducationalSheetData;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "fetchEducationalContent", "()V", "trackAddTaxIdButtonClick", "trackMoreQuestionsLinkClick", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchEducationalSheetDataUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EducationalSheetViewModel extends androidx.view.ViewModel {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public EducationalSheetViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase fetchEducationalSheetDataUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchEducationalSheetDataUseCase, "");
        this.getHighSpeedVideoSizes = fetchEducationalSheetDataUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        fetchEducationalContent();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData>> getScreenState() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void fetchEducationalContent() {
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
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel$fetchEducationalContent$2(this, null), 3, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }

    public final void trackAddTaxIdButtonClick() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("education_sheet"), null, null, com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet.INSTANCE.getAddTaxIdButton(), 6, null), com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet.INSTANCE.getAddTaxIdClickedAction(), null, 4, null).track(com.paypal.oslo.feature.helpcenter.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackMoreQuestionsLinkClick() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("education_sheet"), null, null, com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet.INSTANCE.getMoreQuestionsLink(), 6, null), com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet.INSTANCE.getMoreQuestionsClickedAction(), null, 4, null).track(com.paypal.oslo.feature.helpcenter.AnalyticsTrackerKt.analyticsTracker);
    }
}
