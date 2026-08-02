package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "", "selectAccessToken", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isInitialized", "shouldEmitWebViewInitializedEvent", "(Z)Z", "challengeUri", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "webViewDelegate", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "userAccessToken", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "buildWebViewConfigWithToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "state", "Lkotlin/Triple;", "determineStepupWebViewRoute", "(Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;)Lkotlin/Triple;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupWebViewContentHelperKt {
    public static final boolean shouldEmitWebViewInitializedEvent(boolean z) {
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object selectAccessToken(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentHelperKt$selectAccessToken$1 stepupWebViewContentHelperKt$selectAccessToken$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentHelperKt$selectAccessToken$1) {
            stepupWebViewContentHelperKt$selectAccessToken$1 = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentHelperKt$selectAccessToken$1) continuation;
            if ((stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = stepupWebViewContentHelperKt$selectAccessToken$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityTokenStorage);
                    stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRanges = 1;
                    obj = identityTokenStorage.getUserAccessToken(stepupWebViewContentHelperKt$selectAccessToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj;
                java.lang.String accessToken = userAccessTokenData == null ? userAccessTokenData.getAccessToken() : null;
                str = accessToken;
                if (str != null || str.length() == 0) {
                    return null;
                }
                return accessToken;
            }
        }
        stepupWebViewContentHelperKt$selectAccessToken$1 = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentHelperKt$selectAccessToken$1(continuation);
        java.lang.Object obj2 = stepupWebViewContentHelperKt$selectAccessToken$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepupWebViewContentHelperKt$selectAccessToken$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData2 = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj2;
        if (userAccessTokenData2 == null) {
        }
        str = accessToken;
        if (str != null) {
        }
        return null;
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration buildWebViewConfigWithToken(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, java.lang.String str3) {
        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createStepupWebViewConfiguration;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewClientDelegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
        createStepupWebViewConfiguration = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt.createStepupWebViewConfiguration(str, str2, secureWebViewClientDelegate, webViewChallenge, str3, (r16 & 32) != 0 ? null : null, (r16 & 64) != 0 ? null : null);
        return createStepupWebViewConfiguration;
    }

    public static final kotlin.Triple<java.lang.Boolean, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge, java.lang.Boolean> determineStepupWebViewRoute(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState stepupWebViewState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupWebViewState, "");
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(stepupWebViewState, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized.INSTANCE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!areEqual && !(stepupWebViewState instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial)) {
            if (stepupWebViewState instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading) {
                com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading) stepupWebViewState;
                return new kotlin.Triple<>(java.lang.Boolean.TRUE, loading.getChallenge(), java.lang.Boolean.valueOf(loading.isInitialized()));
            }
            if (stepupWebViewState instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success) {
                return new kotlin.Triple<>(java.lang.Boolean.TRUE, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success) stepupWebViewState).getChallenge(), java.lang.Boolean.TRUE);
            }
            if (stepupWebViewState instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure) {
                return new kotlin.Triple<>(java.lang.Boolean.TRUE, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure) stepupWebViewState).getChallenge(), java.lang.Boolean.TRUE);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new kotlin.Triple<>(bool, null, bool);
    }
}
