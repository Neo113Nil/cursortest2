package com.facebook.login;

/* compiled from: WebLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\n\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "e2e", "", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "addExtraParameters", "Landroid/os/Bundle;", "parameters", "request", "Lcom/facebook/login/LoginClient$Request;", "getParameters", "getSSODevice", "loadCookieToken", "onComplete", "", "values", "error", "Lcom/facebook/FacebookException;", "saveCookieToken", "token", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends com.facebook.login.LoginMethodHandler {
    private static final java.lang.String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final java.lang.String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private java.lang.String e2e;

    protected java.lang.String getSSODevice() {
        return null;
    }

    public abstract com.facebook.AccessTokenSource getTokenSource();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
    }

    protected android.os.Bundle getParameters(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(request.getPermissions())) {
            java.lang.String join = android.text.TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", join);
            addLoggingExtra("scope", join);
        }
        com.facebook.login.DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = com.facebook.login.DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", getClientState(request.getAuthId()));
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
        java.lang.String token = currentAccessToken == null ? null : currentAccessToken.getToken();
        if (token != null && kotlin.jvm.internal.Intrinsics.areEqual(token, loadCookieToken())) {
            bundle.putString("access_token", token);
            addLoggingExtra("access_token", "1");
        } else {
            androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
            if (activity != null) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.clearFacebookCookies(activity);
            }
            addLoggingExtra("access_token", "0");
        }
        bundle.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_CBT, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        bundle.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_IES, com.facebook.FacebookSdk.getAutoLogAppEventsEnabled() ? "1" : "0");
        return bundle;
    }

    protected android.os.Bundle addExtraParameters(android.os.Bundle parameters, com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, getValidRedirectURI());
        if (request.isInstagramLogin()) {
            parameters.putString("app_id", request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", com.facebook.login.LoginClient.INSTANCE.getE2E());
        if (request.isInstagramLogin()) {
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES);
        } else {
            if (request.getPermissions().contains("openid")) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST);
        }
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE, request.getCodeChallenge());
        com.facebook.login.CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE_METHOD, codeChallengeMethod == null ? null : codeChallengeMethod.name());
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_AUTH_TYPE, request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        parameters.putString("sdk", kotlin.jvm.internal.Intrinsics.stringPlus("android-", com.facebook.FacebookSdk.getSdkVersion()));
        if (getSSODevice() != null) {
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_SSO_DEVICE, getSSODevice());
        }
        parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_CUSTOM_TABS_PREFETCHING, com.facebook.FacebookSdk.hasCustomTabsPrefetching ? "1" : "0");
        if (request.getIsFamilyLogin()) {
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_FX_APP, request.getLoginTargetApp().getTargetApp());
        }
        if (request.getShouldSkipAccountDeduplication()) {
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, "true");
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, request.getMessengerPageId());
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, request.getResetMessengerState() ? "1" : "0");
        }
        return parameters;
    }

    public void onComplete(com.facebook.login.LoginClient.Request request, android.os.Bundle values, com.facebook.FacebookException error) {
        java.lang.String str;
        com.facebook.login.LoginClient.Result createErrorResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.login.LoginClient loginClient = getLoginClient();
        this.e2e = null;
        if (values != null) {
            if (values.containsKey("e2e")) {
                this.e2e = values.getString("e2e");
            }
            try {
                com.facebook.AccessToken createAccessTokenFromWebBundle = com.facebook.login.LoginMethodHandler.INSTANCE.createAccessTokenFromWebBundle(request.getPermissions(), values, getTokenSource(), request.getApplicationId());
                createErrorResult = com.facebook.login.LoginClient.Result.INSTANCE.createCompositeTokenResult(loginClient.getPendingRequest(), createAccessTokenFromWebBundle, com.facebook.login.LoginMethodHandler.INSTANCE.createAuthenticationTokenFromWebBundle(values, request.getNonce()));
                if (loginClient.getActivity() != null) {
                    try {
                        android.webkit.CookieSyncManager.createInstance(loginClient.getActivity()).sync();
                    } catch (java.lang.Exception unused) {
                    }
                    if (createAccessTokenFromWebBundle != null) {
                        saveCookieToken(createAccessTokenFromWebBundle.getToken());
                    }
                }
            } catch (com.facebook.FacebookException e) {
                createErrorResult = com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, loginClient.getPendingRequest(), null, e.getMessage(), null, 8, null);
            }
        } else if (error instanceof com.facebook.FacebookOperationCanceledException) {
            createErrorResult = com.facebook.login.LoginClient.Result.INSTANCE.createCancelResult(loginClient.getPendingRequest(), com.facebook.login.LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
        } else {
            this.e2e = null;
            java.lang.String message = error == null ? null : error.getMessage();
            if (error instanceof com.facebook.FacebookServiceException) {
                com.facebook.FacebookRequestError requestError = ((com.facebook.FacebookServiceException) error).getRequestError();
                str = java.lang.String.valueOf(requestError.getErrorCode());
                message = requestError.toString();
            } else {
                str = null;
            }
            createErrorResult = com.facebook.login.LoginClient.Result.INSTANCE.createErrorResult(loginClient.getPendingRequest(), null, message, str);
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        loginClient.completeAndValidate(createErrorResult);
    }

    private final java.lang.String loadCookieToken() {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            fragmentActivity = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        return fragmentActivity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    private final void saveCookieToken(java.lang.String token) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            fragmentActivity = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        fragmentActivity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, token).apply();
    }
}
