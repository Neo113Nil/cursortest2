package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewInvoiceReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ViewInvoiceReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ViewInvoiceReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect>> reduce(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState state, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready ready = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) state;
        if (!(event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink)) {
            if (!(event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri)) {
                if (event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready.copy$default(ready, null, true, 0, 5, null), new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenPdfViewer(((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer) event).getUrl()));
                }
                if (event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnRefreshRequested) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready.copy$default(ready, null, false, ready.getRefreshKey() == 0 ? 1 : 0, 1, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnBackPressed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.NavigateBack.INSTANCE);
                }
                if (!(event instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnScreenLoaded)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready.copy$default(ready, null, true, 0, 5, null), new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenExternalUri(((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri) event).getUrl()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready.copy$default(ready, null, true, 0, 5, null), new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenExternalUri(((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink) event).getUrl()));
    }
}
