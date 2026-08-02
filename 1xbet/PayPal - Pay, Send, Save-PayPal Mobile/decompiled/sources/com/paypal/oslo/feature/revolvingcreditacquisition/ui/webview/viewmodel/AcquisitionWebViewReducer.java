package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AcquisitionWebViewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AcquisitionWebViewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AcquisitionWebViewReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState state, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready ready = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnBackPress) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.MakePhoneCall(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnMakePhoneCall) event).getPhoneNumber()));
        }
        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingStarted) && !(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadingFinished) && !(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnLoadFailed) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCancelled.INSTANCE) && !(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadCompleted) && !(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadFailed) && !(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested)) {
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.PrintWebView(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnPrintRequested) event).getJobName()));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileChooserRequested) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.ShowFileUploadOptions.INSTANCE);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnFileSelectionCompleted.INSTANCE)) {
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent)) {
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError) {
                        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError onParserError = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnParserError) event;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, "Unable to parse JS data", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("json", onParserError.getAttemptedParseContent())), onParserError.getException(), 2, null);
                    } else {
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateBack) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.NavigatePageBack.INSTANCE);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnNavigateForward)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.NavigatePageForward.INSTANCE);
                    }
                } else {
                    com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready ready2 = ready;
                    int i = com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnWebViewEvent) event).getWebViewResult().getEvent().ordinal()];
                    if (i == 1 || i == 2) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.NavigateBack.INSTANCE);
                    }
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect.NavigateToAccountSummary.INSTANCE);
                }
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.DID_CANCEL_FLOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.DID_COMPLETE_FLOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.WebViewTerminationEvent.DID_PERFORM_DEEP_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
