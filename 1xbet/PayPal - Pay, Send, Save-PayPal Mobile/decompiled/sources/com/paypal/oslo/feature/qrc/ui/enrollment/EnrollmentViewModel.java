package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/domain/usecase/CheckQrcEligibilityUseCase;", "checkQrcEligibilityUseCase", "Lcom/paypal/oslo/feature/qrc/domain/usecase/EnrollConsumerQrcUseCase;", "enrollConsumerQrcUseCase", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentReducer;Lcom/paypal/oslo/feature/qrc/domain/usecase/CheckQrcEligibilityUseCase;Lcom/paypal/oslo/feature/qrc/domain/usecase/EnrollConsumerQrcUseCase;)V", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "event", "", "handleIntent", "(Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "startEnrollment", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentReducer;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/usecase/CheckQrcEligibilityUseCase;", "Lcom/paypal/oslo/feature/qrc/domain/usecase/EnrollConsumerQrcUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiEffect;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrollmentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState> uiState;

    @javax.inject.Inject
    public EnrollmentViewModel(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer enrollmentReducer, com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase checkQrcEligibilityUseCase, com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase enrollConsumerQrcUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkQrcEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollConsumerQrcUseCase, "");
        this.getHighSpeedVideoFpsRanges = enrollmentReducer;
        this.getHighSpeedVideoFpsRangesFor = checkQrcEligibilityUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = enrollConsumerQrcUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EnrollmentViewModel.store", com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility.INSTANCE, enrollmentReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }

    public final void startEnrollment(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$checkEligibility$1(navArgs, this, null), 3, null);
    }
}
