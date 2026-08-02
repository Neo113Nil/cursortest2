package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiState;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;", "Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidUiState;Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetPaidReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetPaidReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "GetPaidReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState state, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect>> output;
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect>> output2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content content = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) state;
            if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded) event).getUiModel()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel.copy$default(content.getUiModel(), null, null, ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated) event).getBitmap(), null, 11, null)), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DoneClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.DownloadClicked) {
                android.graphics.Bitmap qrCodeBitmap = content.getUiModel().getQrCodeBitmap();
                return (qrCodeBitmap == null || (output2 = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.DownloadQrCode(qrCodeBitmap))) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null) : output2;
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.InfoClicked) {
                android.graphics.Bitmap qrCodeBitmap2 = content.getUiModel().getQrCodeBitmap();
                return (qrCodeBitmap2 == null || (output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiEffect.InfoQrCode(qrCodeBitmap2))) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null) : output;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
        }
        com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial initial = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.LoadScreen) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content(new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel(null, null, null, null, 15, null)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
