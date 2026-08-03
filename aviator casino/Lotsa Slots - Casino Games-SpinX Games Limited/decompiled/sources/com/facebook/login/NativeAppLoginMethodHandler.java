package com.facebook.login;

/* compiled from: NativeAppLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J0\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0002J\"\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010(\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020$H\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "completeLogin", "", "outcome", "Lcom/facebook/login/LoginClient$Result;", "getError", "", "extras", "Landroid/os/Bundle;", "getErrorMessage", "handleResultCancel", "request", "Lcom/facebook/login/LoginClient$Request;", "data", "Landroid/content/Intent;", "handleResultError", "error", "errorMessage", "errorCode", "handleResultOk", "isCallable", "", "intent", "onActivityResult", "requestCode", "", com.ironsource.X3.f.f, "processSuccessResponse", "tryAuthorize", "tryIntent", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends com.facebook.login.LoginMethodHandler {
    private final com.facebook.AccessTokenSource tokenSource;

    @Override // com.facebook.login.LoginMethodHandler
    public abstract int tryAuthorize(com.facebook.login.LoginClient.Request request);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.tokenSource = com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.tokenSource = com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    private final void processSuccessResponse(final com.facebook.login.LoginClient.Request request, final android.os.Bundle extras) {
        if (extras.containsKey("code")) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(extras.getString("code"))) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.login.NativeAppLoginMethodHandler$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.login.NativeAppLoginMethodHandler.m5246processSuccessResponse$lambda0(com.facebook.login.NativeAppLoginMethodHandler.this, request, extras);
                    }
                });
                return;
            }
        }
        handleResultOk(request, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processSuccessResponse$lambda-0, reason: not valid java name */
    public static final void m5246processSuccessResponse$lambda0(com.facebook.login.NativeAppLoginMethodHandler this$0, com.facebook.login.LoginClient.Request request, android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.handleResultOk(request, this$0.processCodeExchange(request, extras));
        } catch (com.facebook.FacebookServiceException e) {
            com.facebook.FacebookRequestError requestError = e.getRequestError();
            this$0.handleResultError(request, requestError.getErrorType(), requestError.getErrorMessage(), java.lang.String.valueOf(requestError.getErrorCode()));
        } catch (com.facebook.FacebookException e2) {
            this$0.handleResultError(request, null, e2.getMessage(), null);
        }
    }

    public com.facebook.AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        com.facebook.login.LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (data == null) {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            handleResultCancel(pendingRequest, data);
        } else if (resultCode != -1) {
            completeLogin(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            android.os.Bundle extras = data.getExtras();
            if (extras == null) {
                completeLogin(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            java.lang.String error = getError(extras);
            java.lang.Object obj = extras.get(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE);
            java.lang.String obj2 = obj == null ? null : obj.toString();
            java.lang.String errorMessage = getErrorMessage(extras);
            java.lang.String string = extras.getString("e2e");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(string)) {
                logWebLoginCompleted(string);
            }
            if (error == null && obj2 == null && errorMessage == null && pendingRequest != null) {
                processSuccessResponse(pendingRequest, extras);
            } else {
                handleResultError(pendingRequest, error, errorMessage, obj2);
            }
        }
        return true;
    }

    private final void completeLogin(com.facebook.login.LoginClient.Result outcome) {
        if (outcome != null) {
            getLoginClient().completeAndValidate(outcome);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    protected void handleResultError(com.facebook.login.LoginClient.Request request, java.lang.String error, java.lang.String errorMessage, java.lang.String errorCode) {
        if (error != null && kotlin.jvm.internal.Intrinsics.areEqual(error, "logged_out")) {
            com.facebook.login.CustomTabLoginMethodHandler.Companion companion = com.facebook.login.CustomTabLoginMethodHandler.INSTANCE;
            com.facebook.login.CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin(null);
            return;
        }
        com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
        if (kotlin.collections.CollectionsKt.contains(com.facebook.internal.ServerProtocol.getErrorsProxyAuthDisabled(), error)) {
            completeLogin(null);
            return;
        }
        com.facebook.internal.ServerProtocol serverProtocol2 = com.facebook.internal.ServerProtocol.INSTANCE;
        if (kotlin.collections.CollectionsKt.contains(com.facebook.internal.ServerProtocol.getErrorsUserCanceled(), error)) {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createCancelResult(request, null));
        } else {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createErrorResult(request, error, errorMessage, errorCode));
        }
    }

    protected void handleResultOk(com.facebook.login.LoginClient.Request request, android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createCompositeTokenResult(request, com.facebook.login.LoginMethodHandler.INSTANCE.createAccessTokenFromWebBundle(request.getPermissions(), extras, getTokenSource(), request.getApplicationId()), com.facebook.login.LoginMethodHandler.INSTANCE.createAuthenticationTokenFromWebBundle(extras, request.getNonce())));
        } catch (com.facebook.FacebookException e) {
            completeLogin(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, request, null, e.getMessage(), null, 8, null));
        }
    }

    protected void handleResultCancel(com.facebook.login.LoginClient.Request request, android.content.Intent data) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        android.os.Bundle extras = data.getExtras();
        java.lang.String error = getError(extras);
        java.lang.String str = null;
        if (extras != null && (obj = extras.get(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE)) != null) {
            str = obj.toString();
        }
        com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.internal.ServerProtocol.getErrorConnectionFailure(), str)) {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createErrorResult(request, error, getErrorMessage(extras), str));
        } else {
            completeLogin(com.facebook.login.LoginClient.Result.INSTANCE.createCancelResult(request, error));
        }
    }

    protected java.lang.String getError(android.os.Bundle extras) {
        java.lang.String string = extras == null ? null : extras.getString("error");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_TYPE);
    }

    protected java.lang.String getErrorMessage(android.os.Bundle extras) {
        java.lang.String string = extras == null ? null : extras.getString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
    }

    protected boolean tryIntent(android.content.Intent intent, int requestCode) {
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher;
        if (intent == null || !isCallable(intent)) {
            return false;
        }
        androidx.fragment.app.Fragment fragment = getLoginClient().getFragment();
        kotlin.Unit unit = null;
        com.facebook.login.LoginFragment loginFragment = fragment instanceof com.facebook.login.LoginFragment ? (com.facebook.login.LoginFragment) fragment : null;
        if (loginFragment != null && (launcher = loginFragment.getLauncher()) != null) {
            launcher.launch(intent);
            unit = kotlin.Unit.INSTANCE;
        }
        return unit != null;
    }

    private final boolean isCallable(android.content.Intent intent) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.facebook.FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }
}
