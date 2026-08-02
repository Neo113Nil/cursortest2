package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeCancelReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ChangeCancelReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ChangeCancelReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState state, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect>> output$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed.INSTANCE)) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(true, false), com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.ExecutePrimaryAction.INSTANCE);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.SecondaryButtonPressed.INSTANCE)) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success.copy$default(success, false, false, 1, null), com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.ExecuteSecondaryAction.INSTANCE);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ClosePressed.INSTANCE)) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(false, false), com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.DismissModal.INSTANCE);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiSuccess.INSTANCE)) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(false, false), com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.DismissModalApiSuccess.INSTANCE);
        } else {
            if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(false, true), null, 2, null);
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output$default.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output$default.isLeft());
        return output$default;
    }
}
