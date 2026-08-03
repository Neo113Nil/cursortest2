package com.facebook.login;

/* compiled from: WebViewLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u001dH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "e2e", "", "getE2e", "()Ljava/lang/String;", "setE2e", "(Ljava/lang/String;)V", "loginDialog", "Lcom/facebook/internal/WebDialog;", "getLoginDialog", "()Lcom/facebook/internal/WebDialog;", "setLoginDialog", "(Lcom/facebook/internal/WebDialog;)V", "nameForLogging", "getNameForLogging", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "cancel", "", "describeContents", "", "needsInternetPermission", "", "onWebDialogComplete", "request", "Lcom/facebook/login/LoginClient$Request;", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "tryAuthorize", "writeToParcel", "dest", "flags", "AuthDialogBuilder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends com.facebook.login.WebLoginMethodHandler {
    private static final java.lang.String OAUTH_DIALOG = "oauth";
    private java.lang.String e2e;
    private com.facebook.internal.WebDialog loginDialog;
    private final java.lang.String nameForLogging;
    private final com.facebook.AccessTokenSource tokenSource;
    public static final android.os.Parcelable.Creator<com.facebook.login.WebViewLoginMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.WebViewLoginMethodHandler>() { // from class: com.facebook.login.WebViewLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.WebViewLoginMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.WebViewLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.WebViewLoginMethodHandler[] newArray(int size) {
            return new com.facebook.login.WebViewLoginMethodHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean needsInternetPermission() {
        return true;
    }

    public final com.facebook.internal.WebDialog getLoginDialog() {
        return this.loginDialog;
    }

    public final void setLoginDialog(com.facebook.internal.WebDialog webDialog) {
        this.loginDialog = webDialog;
    }

    public final java.lang.String getE2e() {
        return this.e2e;
    }

    public final void setE2e(java.lang.String str) {
        this.e2e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = com.facebook.AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public com.facebook.AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        com.facebook.internal.WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(final com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.os.Bundle parameters = getParameters(request);
        com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener = new com.facebook.internal.WebDialog.OnCompleteListener() { // from class: com.facebook.login.WebViewLoginMethodHandler$tryAuthorize$listener$1
            @Override // com.facebook.internal.WebDialog.OnCompleteListener
            public void onComplete(android.os.Bundle values, com.facebook.FacebookException error) {
                com.facebook.login.WebViewLoginMethodHandler.this.onWebDialogComplete(request, values, error);
            }
        };
        java.lang.String e2e = com.facebook.login.LoginClient.INSTANCE.getE2E();
        this.e2e = e2e;
        addLoggingExtra("e2e", e2e);
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            return 0;
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        androidx.fragment.app.FragmentActivity fragmentActivity = activity;
        boolean isChromeOS = com.facebook.internal.Utility.isChromeOS(fragmentActivity);
        com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder authDialogBuilder = new com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder(this, fragmentActivity, request.getApplicationId(), parameters);
        java.lang.String str = this.e2e;
        if (str == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.loginDialog = authDialogBuilder.setE2E(str).setIsChromeOS(isChromeOS).setAuthType(request.getAuthType()).setLoginBehavior(request.getLoginBehavior()).setLoginTargetApp(request.getLoginTargetApp()).setFamilyLogin(request.getIsFamilyLogin()).setShouldSkipDedupe(request.getShouldSkipAccountDeduplication()).setOnCompleteListener(onCompleteListener).build();
        com.facebook.internal.FacebookDialogFragment facebookDialogFragment = new com.facebook.internal.FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), com.facebook.internal.FacebookDialogFragment.TAG);
        return 1;
    }

    public final void onWebDialogComplete(com.facebook.login.LoginClient.Request request, android.os.Bundle values, com.facebook.FacebookException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        super.onComplete(request, values, error);
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\f\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0005J\u0012\u0010\u001c\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0012\u0010\u001d\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u001e\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0012J\u0012\u0010 \u001a\u00060\u0000R\u00020\u001b2\u0006\u0010!\u001a\u00020\u0012J\u0012\u0010\"\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010#\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010$\u001a\u00060\u0000R\u00020\u001b2\u0006\u0010%\u001a\u00020\u0012R\u001a\u0010\t\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;", "Lcom/facebook/internal/WebDialog$Builder;", "context", "Landroid/content/Context;", "applicationId", "", "parameters", "Landroid/os/Bundle;", "(Lcom/facebook/login/WebViewLoginMethodHandler;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "authType", "getAuthType", "()Ljava/lang/String;", "setAuthType", "(Ljava/lang/String;)V", "e2e", "getE2e", "setE2e", "isFamilyLogin", "", "loginBehavior", "Lcom/facebook/login/LoginBehavior;", com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, "shouldSkipDedupe", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "build", "Lcom/facebook/internal/WebDialog;", "Lcom/facebook/login/WebViewLoginMethodHandler;", "setE2E", "setFamilyLogin", "setIsChromeOS", "isChromeOS", "setIsRerequest", "isRerequest", "setLoginBehavior", "setLoginTargetApp", "setShouldSkipDedupe", "shouldSkip", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class AuthDialogBuilder extends com.facebook.internal.WebDialog.Builder {
        public java.lang.String authType;
        public java.lang.String e2e;
        private boolean isFamilyLogin;
        private com.facebook.login.LoginBehavior loginBehavior;
        private java.lang.String redirect_uri;
        private boolean shouldSkipDedupe;
        private com.facebook.login.LoginTargetApp targetApp;
        final /* synthetic */ com.facebook.login.WebViewLoginMethodHandler this$0;

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setIsRerequest(boolean isRerequest) {
            return this;
        }

        public final java.lang.String getE2e() {
            java.lang.String str = this.e2e;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("e2e");
            throw null;
        }

        public final void setE2e(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.e2e = str;
        }

        public final java.lang.String getAuthType() {
            java.lang.String str = this.authType;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("authType");
            throw null;
        }

        /* renamed from: setAuthType, reason: collision with other method in class */
        public final void m5247setAuthType(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authType = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthDialogBuilder(com.facebook.login.WebViewLoginMethodHandler this$0, android.content.Context context, java.lang.String applicationId, android.os.Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.this$0 = this$0;
            this.redirect_uri = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_URI;
            this.loginBehavior = com.facebook.login.LoginBehavior.NATIVE_WITH_FALLBACK;
            this.targetApp = com.facebook.login.LoginTargetApp.FACEBOOK;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setE2E(java.lang.String e2e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2e, "e2e");
            setE2e(e2e);
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setIsChromeOS(boolean isChromeOS) {
            java.lang.String str;
            if (isChromeOS) {
                str = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI;
            } else {
                str = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_URI;
            }
            this.redirect_uri = str;
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setAuthType(java.lang.String authType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            m5247setAuthType(authType);
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setLoginBehavior(com.facebook.login.LoginBehavior loginBehavior) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            this.loginBehavior = loginBehavior;
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setLoginTargetApp(com.facebook.login.LoginTargetApp targetApp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            this.targetApp = targetApp;
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setFamilyLogin(boolean isFamilyLogin) {
            this.isFamilyLogin = isFamilyLogin;
            return this;
        }

        public final com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder setShouldSkipDedupe(boolean shouldSkip) {
            this.shouldSkipDedupe = shouldSkip;
            return this;
        }

        @Override // com.facebook.internal.WebDialog.Builder
        public com.facebook.internal.WebDialog build() {
            java.lang.String str;
            android.os.Bundle parameters = getParameters();
            if (parameters == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, this.redirect_uri);
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", getE2e());
            if (this.targetApp == com.facebook.login.LoginTargetApp.INSTAGRAM) {
                str = com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES;
            } else {
                str = com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST;
            }
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, str);
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_AUTH_TYPE, getAuthType());
            parameters.putString("login_behavior", this.loginBehavior.name());
            if (this.isFamilyLogin) {
                parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_FX_APP, this.targetApp.getTargetApp());
            }
            if (this.shouldSkipDedupe) {
                parameters.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, "true");
            }
            com.facebook.internal.WebDialog.Companion companion = com.facebook.internal.WebDialog.INSTANCE;
            android.content.Context context = getContext();
            if (context != null) {
                return companion.newInstance(context, "oauth", parameters, getTheme(), this.targetApp, getListener());
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.content.Context");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = com.facebook.AccessTokenSource.WEB_VIEW;
        this.e2e = source.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.e2e);
    }
}
