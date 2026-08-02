package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementDownloadReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CustomStatementDownloadReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CustomStatementDownloadReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect>> reduce(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState state, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content content = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.RetryClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.CloseClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content.copy$default(content, null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading(((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted) event).getDownloadUrl()), 3, null), null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DismissError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadCompleted.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content.copy$default(content, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE, 3, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed) {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed downloadFailed = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content.copy$default(content, null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error(downloadFailed.getDownloadUrl(), downloadFailed.getErrorMessage()), 3, null), null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested openFileRequested = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested) event;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile(openFileRequested.getFileUri(), openFileRequested.getMimeType()));
    }
}
