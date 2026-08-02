package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InboundConnectReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public InboundConnectReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "InboundConnectReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect>> reduce(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState state, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 2;
        com.paypal.oslo.core.mvi.UiEffect uiEffect = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        if (state instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading) {
            com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading loading = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Initialize) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, uiEffect, i, objArr7 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.NavigateBack.INSTANCE));
            }
            if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved) event).getConnectUrl(), false), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing.INSTANCE, new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.OpenRedirectUrl(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed) event).getErrorRedirectUrl())));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
        }
        if (state instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) {
            com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading webViewLoading = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) state;
            if (!webViewLoading.isInitialized() && (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading.copy$default(webViewLoading, null, true, 1, null), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
            }
            if (webViewLoading.isInitialized()) {
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(webViewLoading, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.NavigateBack.INSTANCE));
                }
                if ((event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted) || (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished)) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(webViewLoading, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing.INSTANCE, new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.OpenRedirectUrl(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted) event).getRedirectUrl())));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(webViewLoading, event));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(webViewLoading, event));
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing) state, event));
    }
}
