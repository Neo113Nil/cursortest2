package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PartnerLinkingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PartnerLinkingReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PartnerLinkingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect>> reduce(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState state, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = state instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial;
        if (!z || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner)) {
            boolean z2 = state instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth;
            if (!z2 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner)) {
                if (z && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed)) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed) event;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error(validationFailed.getError().toString()), new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError(validationFailed.getError().toString())));
                }
                if (z2 && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed)) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed validationFailed2 = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed) event;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error(validationFailed2.getError().toString()), new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError(validationFailed2.getError().toString())));
                }
                if (z2 && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete)) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete oAuthInitializationComplete = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete) event;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady(oAuthInitializationComplete.getConnectUrl(), oAuthInitializationComplete.getReturnUrl()), null));
                }
                if (z2 && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed)) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed oAuthInitializationFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed) event;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error(oAuthInitializationFailed.getError().toString()), new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError(oAuthInitializationFailed.getError().toString())));
                }
                boolean z3 = state instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error;
                if (!z3 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.DismissError)) {
                    if (!z3 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed)) {
                        if (!z3 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed)) {
                            if (!z3 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete)) {
                                boolean z4 = state instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady;
                                if (!z4 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.DismissError)) {
                                    if (!z4 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted)) {
                                        if (!z4 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished)) {
                                            if (!z4 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted)) {
                                                if (!z4 || !(event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded)) {
                                                    if (z4 && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed)) {
                                                        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed webViewRedirectFailed = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed) event;
                                                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error(webViewRedirectFailed.getError().toString()), new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError(webViewRedirectFailed.getError().toString())));
                                                    }
                                                    if (z4 && (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewBackClicked)) {
                                                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial.INSTANCE, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.UserCancelledLinking.INSTANCE));
                                                    }
                                                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(state, event));
                                                }
                                                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete(((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded) event).getUrl())));
                                            }
                                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                                        }
                                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                                    }
                                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                                }
                                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial.INSTANCE, null));
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial.INSTANCE, null));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, null));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth.INSTANCE, null));
    }
}
