package com.paypal.oslo.core.webview.ui.state;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewStateMapper;", "", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;", "callbackManager", "<init>", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;)V", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "content", "", "onStateChanged", "(Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewStateMapper {
    public static final java.lang.String HTML_CONTENT_URL = "secure-webview:html-content";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    public SecureWebViewStateMapper(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallbackManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = secureWebViewCallbackManager;
    }

    public final void onStateChanged(final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState newState, com.paypal.oslo.core.webview.ui.config.SecureWebViewContent content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        if (this.Camera2StreamConfigurationMap == newState) {
            return;
        }
        if (newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed) {
            this.getHighResolutionOutputSizeshNQ4ISI.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper.$r8$lambda$WM8giy7KyLlHLKEQ5kwQnUOKGTs(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                }
            });
        } else if (newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl) {
            this.getHighResolutionOutputSizeshNQ4ISI.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper.$r8$lambda$qIAEzKlHOe67aq5T2TD9X94ba9k(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                }
            });
        } else {
            boolean z = newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success;
            final java.lang.String str = HTML_CONTENT_URL;
            if (z) {
                com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent = ((com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success) newState).getLoadableContent();
                if (loadableContent instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) {
                    str = ((com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) loadableContent).getUrl();
                } else if (!(loadableContent instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Html)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper.$r8$lambda$MeWE0L4gt1gobrvtAe8UcXXxgYM(str, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
            } else if (newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed) {
                this.getHighResolutionOutputSizeshNQ4ISI.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper.m11706$r8$lambda$RT66WQAkPAJ_CA9nnimn6DGykI(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
            } else if (newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Loading) {
                if (content instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) {
                    str = ((com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) content).getUrl();
                } else if (!(content instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.state.SecureWebViewStateMapper.$r8$lambda$W419LJWrlNToJyXU3LAwQeMbcW4(str, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
            } else if (!(newState instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        this.Camera2StreamConfigurationMap = newState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MeWE0L4gt1gobrvtAe8UcXXxgYM(java.lang.String str, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadingFinished(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RT66WQAkPAJ_CA9nnimn6DGy-kI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11706$r8$lambda$RT66WQAkPAJ_CA9nnimn6DGykI(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState secureWebViewUIState, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadFailed(((com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed) secureWebViewUIState).getError());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W419LJWrlNToJyXU3LAwQeMbcW4(java.lang.String str, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadingStarted(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WM8giy7KyLlHLKEQ5kwQnUOKGTs(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState secureWebViewUIState, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed authFailed = (com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed) secureWebViewUIState;
        secureWebViewCallback.onLoadFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed(authFailed.getUrl(), authFailed.getError()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qIAEzKlHOe67aq5T2TD9X94ba9k(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState secureWebViewUIState, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl unauthorizedUrl = (com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl) secureWebViewUIState;
        secureWebViewCallback.onLoadFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl(unauthorizedUrl.getUrl(), unauthorizedUrl.getError()));
        return kotlin.Unit.INSTANCE;
    }
}
