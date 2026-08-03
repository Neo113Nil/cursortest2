package com.facebook.login;

/* compiled from: LoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0014J\b\u0010\u001d\u001a\u00020\rH\u0014J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010 \u001a\u00020!H\u0016J\"\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0014J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020$2\u0006\u0010*\u001a\u00020+H&J\u0018\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020$H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R,\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00066"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getLoginClient", "()Lcom/facebook/login/LoginClient;", "setLoginClient", "methodLoggingExtras", "", "", "getMethodLoggingExtras", "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "nameForLogging", "getNameForLogging", "()Ljava/lang/String;", "addLoggingExtra", "", com.ironsource.X3.i.W, "value", "", "cancel", "getClientState", "authId", "getRedirectUrl", "logWebLoginCompleted", "e2e", "needsInternetPermission", "", "onActivityResult", "requestCode", "", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "processCodeExchange", "Landroid/os/Bundle;", "request", "Lcom/facebook/login/LoginClient$Request;", "values", "putChallengeParam", "param", "Lorg/json/JSONObject;", "shouldKeepTrackOfMultipleIntents", "tryAuthorize", "writeToParcel", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LoginMethodHandler implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.LoginMethodHandler.Companion INSTANCE = new com.facebook.login.LoginMethodHandler.Companion(null);
    public static final java.lang.String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";
    public static final java.lang.String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";
    public static final java.lang.String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public com.facebook.login.LoginClient loginClient;
    private java.util.Map<java.lang.String, java.lang.String> methodLoggingExtras;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AccessToken createAccessTokenFromNativeLogin(android.os.Bundle bundle, com.facebook.AccessTokenSource accessTokenSource, java.lang.String str) {
        return INSTANCE.createAccessTokenFromNativeLogin(bundle, accessTokenSource, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AccessToken createAccessTokenFromWebBundle(java.util.Collection<java.lang.String> collection, android.os.Bundle bundle, com.facebook.AccessTokenSource accessTokenSource, java.lang.String str) throws com.facebook.FacebookException {
        return INSTANCE.createAccessTokenFromWebBundle(collection, bundle, accessTokenSource, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AuthenticationToken createAuthenticationTokenFromNativeLogin(android.os.Bundle bundle, java.lang.String str) throws com.facebook.FacebookException {
        return INSTANCE.createAuthenticationTokenFromNativeLogin(bundle, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AuthenticationToken createAuthenticationTokenFromWebBundle(android.os.Bundle bundle, java.lang.String str) throws com.facebook.FacebookException {
        return INSTANCE.createAuthenticationTokenFromWebBundle(bundle, str);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUserIDFromSignedRequest(java.lang.String str) throws com.facebook.FacebookException {
        return INSTANCE.getUserIDFromSignedRequest(str);
    }

    public void cancel() {
    }

    public abstract java.lang.String getNameForLogging();

    public boolean needsInternetPermission() {
        return false;
    }

    public boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        return false;
    }

    public void putChallengeParam(org.json.JSONObject param) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param, "param");
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return false;
    }

    public abstract int tryAuthorize(com.facebook.login.LoginClient.Request request);

    public final java.util.Map<java.lang.String, java.lang.String> getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    public final void setMethodLoggingExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this.methodLoggingExtras = map;
    }

    public final com.facebook.login.LoginClient getLoginClient() {
        com.facebook.login.LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    public final void setLoginClient(com.facebook.login.LoginClient loginClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    public LoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        setLoginClient(loginClient);
    }

    protected LoginMethodHandler(android.os.Parcel source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        java.util.Map<java.lang.String, java.lang.String> readStringMapFromParcel = com.facebook.internal.Utility.readStringMapFromParcel(source);
        this.methodLoggingExtras = readStringMapFromParcel == null ? null : kotlin.collections.MapsKt.toMutableMap(readStringMapFromParcel);
    }

    /* renamed from: getRedirectUrl */
    protected java.lang.String getValidRedirectURI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("fb");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        sb.append(com.facebook.FacebookSdk.getApplicationId());
        sb.append("://authorize/");
        return sb.toString();
    }

    protected java.lang.String getClientState(java.lang.String authId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.facebook.login.LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, authId);
            jSONObject.put(com.facebook.login.LoginLogger.EVENT_PARAM_METHOD, getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (org.json.JSONException e) {
            android.util.Log.w("LoginMethodHandler", kotlin.jvm.internal.Intrinsics.stringPlus("Error creating client state json: ", e.getMessage()));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    protected void addLoggingExtra(java.lang.String key, java.lang.Object value) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new java.util.HashMap();
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
        map.put(key, value == null ? null : value.toString());
    }

    protected void logWebLoginCompleted(java.lang.String e2e) {
        com.facebook.login.LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        java.lang.String applicationId = pendingRequest == null ? null : pendingRequest.getApplicationId();
        if (applicationId == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            applicationId = com.facebook.FacebookSdk.getApplicationId();
        }
        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(getLoginClient().getActivity(), applicationId);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_WEB_LOGIN_E2E, e2e);
        bundle.putLong(com.facebook.internal.AnalyticsEvents.PARAMETER_WEB_LOGIN_SWITCHBACK_TIME, java.lang.System.currentTimeMillis());
        bundle.putString("app_id", applicationId);
        internalAppEventsLogger.logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_WEB_LOGIN_COMPLETE, null, bundle);
    }

    protected android.os.Bundle processCodeExchange(com.facebook.login.LoginClient.Request request, android.os.Bundle values) throws com.facebook.FacebookException {
        com.facebook.GraphRequest createCodeExchangeRequest;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        java.lang.String string = values.getString("code");
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
            throw new com.facebook.FacebookException("No code param found from the request");
        }
        if (string == null) {
            createCodeExchangeRequest = null;
        } else {
            com.facebook.login.PKCEUtil pKCEUtil = com.facebook.login.PKCEUtil.INSTANCE;
            java.lang.String validRedirectURI = getValidRedirectURI();
            java.lang.String codeVerifier = request.getCodeVerifier();
            if (codeVerifier == null) {
                codeVerifier = "";
            }
            createCodeExchangeRequest = com.facebook.login.PKCEUtil.createCodeExchangeRequest(string, validRedirectURI, codeVerifier);
        }
        if (createCodeExchangeRequest == null) {
            throw new com.facebook.FacebookException("Failed to create code exchange request");
        }
        com.facebook.GraphResponse executeAndWait = createCodeExchangeRequest.executeAndWait();
        com.facebook.FacebookRequestError error = executeAndWait.getError();
        if (error != null) {
            throw new com.facebook.FacebookServiceException(error, error.getErrorMessage());
        }
        try {
            org.json.JSONObject graphObject = executeAndWait.getGraphObject();
            java.lang.String string2 = graphObject != null ? graphObject.getString("access_token") : null;
            if (graphObject != null) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.isNullOrEmpty(string2)) {
                    values.putString("access_token", string2);
                    if (graphObject.has("id_token")) {
                        values.putString("id_token", graphObject.getString("id_token"));
                    }
                    return values;
                }
            }
            throw new com.facebook.FacebookException("No access token found from result");
        } catch (org.json.JSONException e) {
            throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Fail to process code exchange response: ", e.getMessage()));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.writeStringMapToParcel(dest, this.methodLoggingExtras);
    }

    /* compiled from: LoginMethodHandler.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/login/LoginMethodHandler$Companion;", "", "()V", "NO_SIGNED_REQUEST_ERROR_MESSAGE", "", "NO_USER_ID_ERROR_MESSAGE", "USER_CANCELED_LOG_IN_ERROR_MESSAGE", "createAccessTokenFromNativeLogin", "Lcom/facebook/AccessToken;", "bundle", "Landroid/os/Bundle;", "source", "Lcom/facebook/AccessTokenSource;", "applicationId", "createAccessTokenFromWebBundle", "requestedPermissions", "", "createAuthenticationTokenFromNativeLogin", "Lcom/facebook/AuthenticationToken;", "expectedNonce", "createAuthenticationTokenFromWebBundle", "getUserIDFromSignedRequest", "signedRequest", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AuthenticationToken createAuthenticationTokenFromNativeLogin(android.os.Bundle bundle, java.lang.String expectedNonce) throws com.facebook.FacebookException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String string = bundle.getString(com.facebook.internal.NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (string == null || string.length() == 0 || expectedNonce == null || expectedNonce.length() == 0) {
                return null;
            }
            try {
                return new com.facebook.AuthenticationToken(string, expectedNonce);
            } catch (java.lang.Exception e) {
                throw new com.facebook.FacebookException(e.getMessage());
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessToken createAccessTokenFromNativeLogin(android.os.Bundle bundle, com.facebook.AccessTokenSource source, java.lang.String applicationId) {
            java.lang.String string;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.internal.NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new java.util.Date(0L));
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(com.facebook.internal.NativeProtocol.EXTRA_PERMISSIONS);
            java.lang.String string2 = bundle.getString(com.facebook.internal.NativeProtocol.EXTRA_ACCESS_TOKEN);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate2 = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.internal.NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new java.util.Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString(com.facebook.internal.NativeProtocol.EXTRA_USER_ID)) == null || string.length() == 0) {
                return null;
            }
            return new com.facebook.AccessToken(string2, applicationId, string, stringArrayList, null, null, source, bundleLongAsDate, new java.util.Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AuthenticationToken createAuthenticationTokenFromWebBundle(android.os.Bundle bundle, java.lang.String expectedNonce) throws com.facebook.FacebookException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || expectedNonce == null || expectedNonce.length() == 0) {
                return null;
            }
            try {
                return new com.facebook.AuthenticationToken(string, expectedNonce);
            } catch (java.lang.Exception e) {
                throw new com.facebook.FacebookException(e.getMessage(), e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.facebook.AccessToken createAccessTokenFromWebBundle(java.util.Collection<java.lang.String> requestedPermissions, android.os.Bundle bundle, com.facebook.AccessTokenSource source, java.lang.String applicationId) throws com.facebook.FacebookException {
            java.util.Collection<java.lang.String> collection;
            java.lang.String string;
            java.util.ArrayList arrayList;
            java.lang.String string2;
            java.util.ArrayList arrayList2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.EXPIRES_IN_KEY, new java.util.Date());
            java.lang.String string3 = bundle.getString("access_token");
            if (string3 == null) {
                return null;
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate2 = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME, new java.util.Date(0L));
            java.lang.String string4 = bundle.getString("granted_scopes");
            if (string4 != null) {
                java.lang.String str = string4;
                if (str.length() > 0) {
                    java.lang.Object[] array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                    if (array != null) {
                        java.lang.String[] strArr = (java.lang.String[]) array;
                        collection = kotlin.collections.CollectionsKt.arrayListOf(java.util.Arrays.copyOf(strArr, strArr.length));
                        string = bundle.getString("denied_scopes");
                        if (string != null) {
                            java.lang.String str2 = string;
                            if (str2.length() > 0) {
                                java.lang.Object[] array2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                                if (array2 != null) {
                                    java.lang.String[] strArr2 = (java.lang.String[]) array2;
                                    arrayList = kotlin.collections.CollectionsKt.arrayListOf(java.util.Arrays.copyOf(strArr2, strArr2.length));
                                    string2 = bundle.getString("expired_scopes");
                                    if (string2 != null) {
                                        java.lang.String str3 = string2;
                                        if (str3.length() > 0) {
                                            java.lang.Object[] array3 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                                            if (array3 != null) {
                                                java.lang.String[] strArr3 = (java.lang.String[]) array3;
                                                arrayList2 = kotlin.collections.CollectionsKt.arrayListOf(java.util.Arrays.copyOf(strArr3, strArr3.length));
                                                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                                                if (!com.facebook.internal.Utility.isNullOrEmpty(string3)) {
                                                    return null;
                                                }
                                                return new com.facebook.AccessToken(string3, applicationId, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection, arrayList, arrayList2, source, bundleLongAsDate, new java.util.Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
                                            }
                                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                    arrayList2 = null;
                                    com.facebook.internal.Utility utility32 = com.facebook.internal.Utility.INSTANCE;
                                    if (!com.facebook.internal.Utility.isNullOrEmpty(string3)) {
                                    }
                                } else {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        arrayList = null;
                        string2 = bundle.getString("expired_scopes");
                        if (string2 != null) {
                        }
                        arrayList2 = null;
                        com.facebook.internal.Utility utility322 = com.facebook.internal.Utility.INSTANCE;
                        if (!com.facebook.internal.Utility.isNullOrEmpty(string3)) {
                        }
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
            collection = requestedPermissions;
            string = bundle.getString("denied_scopes");
            if (string != null) {
            }
            arrayList = null;
            string2 = bundle.getString("expired_scopes");
            if (string2 != null) {
            }
            arrayList2 = null;
            com.facebook.internal.Utility utility3222 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(string3)) {
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getUserIDFromSignedRequest(java.lang.String signedRequest) throws com.facebook.FacebookException {
            java.lang.Object[] array;
            if (signedRequest == null || signedRequest.length() == 0) {
                throw new com.facebook.FacebookException(com.facebook.login.LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
            }
            try {
                array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) signedRequest, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            } catch (java.io.UnsupportedEncodingException | org.json.JSONException unused) {
            }
            if (array != null) {
                java.lang.String[] strArr = (java.lang.String[]) array;
                if (strArr.length == 2) {
                    byte[] data = android.util.Base64.decode(strArr[1], 0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
                    java.lang.String string = new org.json.JSONObject(new java.lang.String(data, kotlin.text.Charsets.UTF_8)).getString("user_id");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                    return string;
                }
                throw new com.facebook.FacebookException(com.facebook.login.LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
