package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class UserFacebook implements org.cocos2dx.plugin.InterfaceUser {
    private static final java.lang.String LOG_TAG = "UserFacebook";
    private static final java.util.List<java.lang.String> allPublishPermissions = java.util.Arrays.asList("publish_actions", "ads_management", "create_event", "rsvp_event", "manage_friendlists", "manage_notifications", "manage_pages");
    private static boolean bDebug = false;
    private static boolean isLoggedIn = false;
    private static org.cocos2dx.plugin.InterfaceUser mAdapter;
    private static android.app.Activity mContext;
    boolean isInit;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestCallback(int i, java.lang.String str, int i2);

    @Override // org.cocos2dx.plugin.InterfaceUser
    public java.lang.String getSessionID() {
        return null;
    }

    protected static void LogE(java.lang.String str, java.lang.Exception exc) {
        android.util.Log.e(LOG_TAG, str, exc);
        exc.printStackTrace();
    }

    protected static void LogD(java.lang.String str) {
        if (bDebug) {
            android.util.Log.d(LOG_TAG, str);
        }
    }

    public java.lang.String getUserID() {
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
        if (currentAccessToken != null && !currentAccessToken.isExpired()) {
            return currentAccessToken.getUserId();
        }
        return "";
    }

    public UserFacebook(android.content.Context context) {
        this.isInit = false;
        try {
            init(context);
            this.isInit = true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    void init(android.content.Context context) {
        mContext = (android.app.Activity) context;
        mAdapter = this;
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            android.util.Log.d("fixfb", "isLoggedIn false");
        } else {
            isLoggedIn = true;
            android.util.Log.d("fixfb", "isLoggedIn true");
        }
        com.facebook.login.LoginManager.getInstance().registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), new com.facebook.FacebookCallback<com.facebook.login.LoginResult>() { // from class: org.cocos2dx.plugin.UserFacebook.1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(com.facebook.login.LoginResult loginResult) {
                boolean unused = org.cocos2dx.plugin.UserFacebook.isLoggedIn = true;
                org.cocos2dx.plugin.UserWrapper.onActionResult(org.cocos2dx.plugin.UserFacebook.mAdapter, 0, loginResult.getAccessToken().toString());
                android.util.Log.d("fixfb", "onSuccess");
            }

            @Override // com.facebook.FacebookCallback
            public void onError(com.facebook.FacebookException facebookException) {
                org.cocos2dx.plugin.UserWrapper.onActionResult(org.cocos2dx.plugin.UserFacebook.mAdapter, 1, org.cocos2dx.plugin.UserFacebook.this.getErrorMessage(facebookException, "login failed"));
                android.util.Log.d("fixfb", "login failed");
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                org.cocos2dx.plugin.UserWrapper.onActionResult(org.cocos2dx.plugin.UserFacebook.mAdapter, 1, "Cancel");
                android.util.Log.d("fixfb", "Cancel");
            }
        });
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
        LogD("not supported in Facebook pluign");
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public void login() {
        if (this.isInit) {
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.UserFacebook.2
                @Override // java.lang.Runnable
                public void run() {
                    android.util.Log.d("fixfb", "logInWithPermissions 155");
                    com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(org.cocos2dx.plugin.UserFacebook.mContext, (java.util.Collection<java.lang.String>) null);
                }
            });
        }
    }

    public void login(final java.lang.String str) {
        if (this.isInit) {
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.UserFacebook.3
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String[] split = str.split(",");
                    com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
                    if (currentAccessToken == null || currentAccessToken.isExpired()) {
                        android.util.Log.d("fixfb", "logInWithPermissions2");
                        com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(org.cocos2dx.plugin.UserFacebook.mContext, java.util.Arrays.asList(split));
                    } else if (!currentAccessToken.getPermissions().containsAll(java.util.Arrays.asList(split))) {
                        android.util.Log.d("fixfb", "logInWithPermissions1");
                        com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(org.cocos2dx.plugin.UserFacebook.mContext, java.util.Arrays.asList(split));
                    } else {
                        org.cocos2dx.plugin.UserFacebook.LogD("login called when use is already connected");
                        android.util.Log.d("fixfb", "already connected");
                        org.cocos2dx.plugin.UserWrapper.onActionResult(org.cocos2dx.plugin.UserFacebook.mAdapter, 0, currentAccessToken.toString());
                    }
                }
            });
        }
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public void logout() {
        if (this.isInit) {
            com.facebook.login.LoginManager.getInstance().logOut();
            isLoggedIn = false;
        }
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public boolean isLogined() {
        return isLoggedIn;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public void setDebugMode(boolean z) {
        if (this.isInit) {
            LogD("set facebook debug mode: " + z);
            com.facebook.FacebookSdk.setIsDebugEnabled(z);
        }
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public java.lang.String getSDKVersion() {
        return "4.1.2";
    }

    @Override // org.cocos2dx.plugin.InterfaceUser
    public java.lang.String getPluginVersion() {
        return "0.2.0";
    }

    public java.lang.String getAccessToken() {
        return (this.isInit && com.facebook.AccessToken.getCurrentAccessToken() != null) ? com.facebook.AccessToken.getCurrentAccessToken().getToken() : "";
    }

    public java.lang.String getPermissionList() {
        if (!this.isInit) {
            return "";
        }
        return com.facebook.AccessToken.getCurrentAccessToken().getPermissions().toString();
    }

    public void request(org.json.JSONObject jSONObject) {
        if (this.isInit) {
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new org.cocos2dx.plugin.UserFacebook.AnonymousClass4(jSONObject));
        }
    }

    /* renamed from: org.cocos2dx.plugin.UserFacebook$4, reason: invalid class name */
    class AnonymousClass4 implements java.lang.Runnable {
        final /* synthetic */ org.json.JSONObject val$info;

        AnonymousClass4(org.json.JSONObject jSONObject) {
            this.val$info = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.String string = this.val$info.getString("Param1");
                com.facebook.HttpMethod httpMethod = com.facebook.HttpMethod.valuesCustom()[this.val$info.getInt("Param2")];
                org.json.JSONObject jSONObject = this.val$info.getJSONObject("Param3");
                android.os.Bundle bundle = new android.os.Bundle();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String obj = keys.next().toString();
                    try {
                        int i = jSONObject.getInt(obj);
                        java.lang.Integer.valueOf(i).getClass();
                        bundle.putInt(obj, i);
                    } catch (org.json.JSONException unused) {
                        bundle.putString(obj, jSONObject.getString(obj));
                    }
                }
                final int i2 = this.val$info.getInt("Param4");
                new com.facebook.GraphRequest(com.facebook.AccessToken.getCurrentAccessToken(), string, bundle, httpMethod, new com.facebook.GraphRequest.Callback() { // from class: org.cocos2dx.plugin.UserFacebook.4.1
                    @Override // com.facebook.GraphRequest.Callback
                    public void onCompleted(final com.facebook.GraphResponse graphResponse) {
                        final com.facebook.FacebookRequestError error = graphResponse.getError();
                        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.UserFacebook.4.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (error == null) {
                                    org.cocos2dx.plugin.UserFacebook.this.nativeRequestCallback(0, graphResponse.getGraphObject().toString(), i2);
                                    return;
                                }
                                org.cocos2dx.plugin.UserFacebook.this.nativeRequestCallback(error.getErrorCode(), "{\"error_message\":\"" + error.getErrorMessage() + "\"}", i2);
                            }
                        });
                    }
                }).executeAsync();
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void activateApp() {
        if (this.isInit) {
            com.facebook.appevents.AppEventsLogger.activateApp(mContext.getApplication());
            LogD("facebook activate app");
        }
    }

    public void logEvent(java.lang.String str) {
        if (this.isInit) {
            LogD("facebook logevent:" + str);
            org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger().logEvent(str);
        }
    }

    public void logEvent(org.json.JSONObject jSONObject) {
        if (this.isInit) {
            LogD("facebook logevent json:" + jSONObject);
            int length = jSONObject.length();
            if (3 == length) {
                try {
                    java.lang.String string = jSONObject.getString("Param1");
                    double d = jSONObject.getDouble("Param2");
                    java.lang.Double valueOf = java.lang.Double.valueOf(d);
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param3");
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    android.os.Bundle bundle = new android.os.Bundle();
                    while (keys.hasNext()) {
                        java.lang.String obj = keys.next().toString();
                        bundle.putString(obj, jSONObject2.getString(obj));
                    }
                    com.facebook.appevents.AppEventsLogger appEventsLogger = org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger();
                    valueOf.getClass();
                    appEventsLogger.logEvent(string, d, bundle);
                    return;
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (2 == length) {
                try {
                    try {
                        java.lang.String string2 = jSONObject.getString("Param1");
                        double d2 = jSONObject.getDouble("Param2");
                        java.lang.Double valueOf2 = java.lang.Double.valueOf(d2);
                        com.facebook.appevents.AppEventsLogger appEventsLogger2 = org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger();
                        valueOf2.getClass();
                        appEventsLogger2.logEvent(string2, d2);
                    } catch (org.json.JSONException e2) {
                        e2.printStackTrace();
                    }
                } catch (org.json.JSONException unused) {
                    java.lang.String string3 = jSONObject.getString("Param1");
                    org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("Param2");
                    java.util.Iterator<java.lang.String> keys2 = jSONObject3.keys();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    while (keys2.hasNext()) {
                        java.lang.String obj2 = keys2.next().toString();
                        bundle2.putString(obj2, jSONObject3.getString(obj2));
                    }
                    org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger().logEvent(string3, bundle2);
                }
            }
        }
    }

    public void logPurchase(org.json.JSONObject jSONObject) {
        java.util.Currency currency;
        if (this.isInit) {
            LogD("facebook logpurchase:" + jSONObject);
            int length = jSONObject.length();
            if (3 != length) {
                if (2 == length) {
                    try {
                        double d = jSONObject.getDouble("Param1");
                        java.lang.Double valueOf = java.lang.Double.valueOf(d);
                        java.lang.String string = jSONObject.getString("Param2");
                        com.facebook.appevents.AppEventsLogger appEventsLogger = org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger();
                        valueOf.getClass();
                        appEventsLogger.logPurchase(new java.math.BigDecimal(d), java.util.Currency.getInstance(string));
                        return;
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            try {
                double d2 = jSONObject.getDouble("Param1");
                java.lang.Double valueOf2 = java.lang.Double.valueOf(d2);
                java.lang.String string2 = jSONObject.getString("Param2");
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param3");
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                android.os.Bundle bundle = new android.os.Bundle();
                while (keys.hasNext()) {
                    java.lang.String obj = keys.next().toString();
                    bundle.putString(obj, jSONObject2.getString(obj));
                }
                try {
                    currency = java.util.Currency.getInstance(string2);
                } catch (java.lang.IllegalArgumentException e2) {
                    java.util.Currency currency2 = java.util.Currency.getInstance(java.util.Locale.getDefault());
                    e2.printStackTrace();
                    currency = currency2;
                }
                com.facebook.appevents.AppEventsLogger appEventsLogger2 = org.cocos2dx.plugin.FacebookWrapper.getAppEventsLogger();
                valueOf2.getClass();
                appEventsLogger2.logPurchase(new java.math.BigDecimal(d2), currency, bundle);
            } catch (org.json.JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void eventFlush() {
        if (this.isInit) {
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.UserFacebook.5
                @Override // java.lang.Runnable
                public void run() {
                    com.facebook.appevents.AppEventsLogger.onContextStop();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getErrorMessage(java.lang.Exception exc, java.lang.String str) {
        if (!this.isInit) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("{\"error_message\":\"");
        if (exc != null) {
            str = exc.getMessage();
        }
        stringBuffer.append(str).append("\"}");
        return stringBuffer.toString();
    }
}
