package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContentViewerReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ContentViewerReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState state, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect>> unexpectedEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Downloading)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Downloading downloading = (com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Downloading) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess) {
                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle(false), new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect.OpenDocument(((com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess) event).getUri()));
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadError) {
                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle(true), null, 2, null);
            } else {
                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(downloading, event);
            }
        } else {
            unexpectedEvent = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Downloading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle) state, event);
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), unexpectedEvent.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), unexpectedEvent.isLeft());
        return unexpectedEvent;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ContentViewerReducer";
    }
}
