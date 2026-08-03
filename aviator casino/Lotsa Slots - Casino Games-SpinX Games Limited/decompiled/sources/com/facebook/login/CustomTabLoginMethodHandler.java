package com.facebook.login;

/* compiled from: CustomTabLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0014J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "chromePackage", "", "getChromePackage", "()Ljava/lang/String;", "currentPackage", "developerDefinedRedirectURI", "getDeveloperDefinedRedirectURI", "expectedChallenge", "nameForLogging", "getNameForLogging", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "validRedirectURI", "describeContents", "", "getRedirectUrl", "getSSODevice", "onActivityResult", "", "requestCode", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "onCustomTabComplete", "", "url", "request", "Lcom/facebook/login/LoginClient$Request;", "putChallengeParam", "param", "Lorg/json/JSONObject;", "tryAuthorize", "validateChallengeParam", "values", "Landroid/os/Bundle;", "writeToParcel", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends com.facebook.login.WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    public static final java.lang.String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch;
    private java.lang.String currentPackage;
    private java.lang.String expectedChallenge;
    private final java.lang.String nameForLogging;
    private final com.facebook.AccessTokenSource tokenSource;
    private java.lang.String validRedirectURI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.CustomTabLoginMethodHandler.Companion INSTANCE = new com.facebook.login.CustomTabLoginMethodHandler.Companion(null);
    public static final android.os.Parcelable.Creator<com.facebook.login.CustomTabLoginMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.CustomTabLoginMethodHandler>() { // from class: com.facebook.login.CustomTabLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.CustomTabLoginMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.CustomTabLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.CustomTabLoginMethodHandler[] newArray(int size) {
            return new com.facebook.login.CustomTabLoginMethodHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = com.facebook.AccessTokenSource.CHROME_CUSTOM_TAB;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        this.expectedChallenge = com.facebook.internal.Utility.generateRandomString(20);
        calledThroughLoggedOutAppSwitch = false;
        com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
        this.validRedirectURI = com.facebook.internal.CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public com.facebook.AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    private final java.lang.String getDeveloperDefinedRedirectURI() {
        return super.getValidRedirectURI();
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: getRedirectUrl, reason: from getter */
    protected java.lang.String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected java.lang.String getSSODevice() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.login.LoginClient loginClient = getLoginClient();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        android.os.Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            addExtraParameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH, "1");
        }
        if (com.facebook.FacebookSdk.hasCustomTabsPrefetching) {
            if (request.isInstagramLogin()) {
                com.facebook.login.CustomTabPrefetchHelper.INSTANCE.mayLaunchUrl(com.facebook.internal.InstagramCustomTab.INSTANCE.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            } else {
                com.facebook.login.CustomTabPrefetchHelper.INSTANCE.mayLaunchUrl(com.facebook.internal.CustomTab.INSTANCE.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            }
        }
        androidx.fragment.app.FragmentActivity activity = loginClient.getActivity();
        if (activity == null) {
            return 0;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.facebook.CustomTabMainActivity.class);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_ACTION, OAUTH_DIALOG);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_PARAMS, addExtraParameters);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().getTargetApp());
        androidx.fragment.app.Fragment fragment = loginClient.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    private final java.lang.String getChromePackage() {
        java.lang.String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
        java.lang.String chromePackage = com.facebook.internal.CustomTabUtils.getChromePackage();
        this.currentPackage = chromePackage;
        return chromePackage;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        if (data != null && data.getBooleanExtra(com.facebook.CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.onActivityResult(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.onActivityResult(requestCode, resultCode, data);
        }
        com.facebook.login.LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (pendingRequest == null) {
            return false;
        }
        if (resultCode == -1) {
            onCustomTabComplete(data != null ? data.getStringExtra(com.facebook.CustomTabMainActivity.EXTRA_URL) : null, pendingRequest);
            return true;
        }
        super.onComplete(pendingRequest, null, new com.facebook.FacebookOperationCanceledException());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onCustomTabComplete(java.lang.String url, final com.facebook.login.LoginClient.Request request) {
        int parseInt;
        if (url == null) {
            return;
        }
        if (!kotlin.text.StringsKt.startsWith$default(url, com.facebook.internal.Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(url, super.getValidRedirectURI(), false, 2, (java.lang.Object) null)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        final android.os.Bundle parseUrlQueryString = com.facebook.internal.Utility.parseUrlQueryString(parse.getQuery());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        parseUrlQueryString.putAll(com.facebook.internal.Utility.parseUrlQueryString(parse.getFragment()));
        if (!validateChallengeParam(parseUrlQueryString)) {
            super.onComplete(request, null, new com.facebook.FacebookException("Invalid state parameter"));
            return;
        }
        java.lang.String string = parseUrlQueryString.getString("error");
        if (string == null) {
            string = parseUrlQueryString.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_TYPE);
        }
        java.lang.String string2 = parseUrlQueryString.getString("error_msg");
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
        }
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        java.lang.String string3 = parseUrlQueryString.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE);
        if (string3 != null) {
            try {
                parseInt = java.lang.Integer.parseInt(string3);
            } catch (java.lang.NumberFormatException unused) {
            }
            com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(string2) && parseInt == -1) {
                    if (parseUrlQueryString.containsKey("access_token")) {
                        super.onComplete(request, parseUrlQueryString, null);
                        return;
                    } else {
                        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                        com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.login.CustomTabLoginMethodHandler$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facebook.login.CustomTabLoginMethodHandler.m5225onCustomTabComplete$lambda0(com.facebook.login.CustomTabLoginMethodHandler.this, request, parseUrlQueryString);
                            }
                        });
                        return;
                    }
                }
            }
            if (string == null && (kotlin.jvm.internal.Intrinsics.areEqual(string, "access_denied") || kotlin.jvm.internal.Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                super.onComplete(request, null, new com.facebook.FacebookOperationCanceledException());
                return;
            } else if (parseInt != API_EC_DIALOG_CANCEL) {
                super.onComplete(request, null, new com.facebook.FacebookOperationCanceledException());
                return;
            } else {
                super.onComplete(request, null, new com.facebook.FacebookServiceException(new com.facebook.FacebookRequestError(parseInt, string, string2), string2));
                return;
            }
        }
        parseInt = -1;
        com.facebook.internal.Utility utility32 = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
        }
        if (string == null) {
        }
        if (parseInt != API_EC_DIALOG_CANCEL) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCustomTabComplete$lambda-0, reason: not valid java name */
    public static final void m5225onCustomTabComplete$lambda0(com.facebook.login.CustomTabLoginMethodHandler this$0, com.facebook.login.LoginClient.Request request, android.os.Bundle values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.onComplete(request, this$0.processCodeExchange(request, values), null);
        } catch (com.facebook.FacebookException e) {
            this$0.onComplete(request, null, e);
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void putChallengeParam(org.json.JSONObject param) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param, "param");
        param.put(com.facebook.login.LoginLogger.EVENT_PARAM_CHALLENGE, this.expectedChallenge);
    }

    private final boolean validateChallengeParam(android.os.Bundle values) {
        try {
            java.lang.String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(new org.json.JSONObject(string).getString(com.facebook.login.LoginLogger.EVENT_PARAM_CHALLENGE), this.expectedChallenge);
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = com.facebook.AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
        this.validRedirectURI = com.facebook.internal.CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.expectedChallenge);
    }

    /* compiled from: CustomTabLoginMethodHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler$Companion;", "", "()V", "API_EC_DIALOG_CANCEL", "", "CHALLENGE_LENGTH", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/CustomTabLoginMethodHandler;", "CUSTOM_TAB_REQUEST_CODE", "OAUTH_DIALOG", "", "calledThroughLoggedOutAppSwitch", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
