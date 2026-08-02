package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrollmentReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public EnrollmentReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EnrollmentReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState state, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling)) {
                if (!(state instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success) && !(state instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling enrolling = (com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Success.INSTANCE, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect.EnrollmentCompleted.INSTANCE);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error.INSTANCE, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect.EnrollmentFailed.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(enrolling, event);
        }
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility checkingEligibility = (com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.CheckingEligibility) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Enrolling.INSTANCE, null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState.Error.INSTANCE, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiEffect.EnrollmentFailed.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(checkingEligibility, event);
    }
}
