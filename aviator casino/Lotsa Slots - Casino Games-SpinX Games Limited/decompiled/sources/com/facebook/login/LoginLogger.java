package com.facebook.login;

/* compiled from: LoginLogger.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J`\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J(\u0010\u0016\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J(\u0010\u0017\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J\\\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\"\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u001c\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J(\u0010'\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/facebook/login/LoginLogger;", "", "context", "Landroid/content/Context;", "applicationId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", com.facebook.login.LoginLogger.EVENT_EXTRAS_FACEBOOK_VERSION, "logger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "logAuthorizationMethodComplete", "", "authId", "method", "result", "errorMessage", "errorCode", "loggingExtras", "", com.ironsource.X3.i.j0, "logAuthorizationMethodNotTried", "logAuthorizationMethodStart", "logCompleteLogin", "loginRequestId", "Lcom/facebook/login/LoginClient$Result$Code;", "resultExtras", "exception", "Ljava/lang/Exception;", "logHeartbeatEvent", "logLoginStatusError", "loggerRef", "logLoginStatusFailure", "logLoginStatusStart", "logLoginStatusSuccess", "logStartLogin", "pendingLoginRequest", "Lcom/facebook/login/LoginClient$Request;", "logUnexpectedError", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginLogger {
    public static final java.lang.String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
    public static final java.lang.String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
    public static final java.lang.String EVENT_EXTRAS_FAILURE = "failure";
    public static final java.lang.String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";
    public static final java.lang.String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
    public static final java.lang.String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
    public static final java.lang.String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
    public static final java.lang.String EVENT_EXTRAS_NOT_TRIED = "not_tried";
    public static final java.lang.String EVENT_EXTRAS_PERMISSIONS = "permissions";
    public static final java.lang.String EVENT_EXTRAS_REQUEST_CODE = "request_code";
    public static final java.lang.String EVENT_EXTRAS_TARGET_APP = "target_app";
    public static final java.lang.String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
    public static final java.lang.String EVENT_NAME_FOA_LOGIN_COMPLETE = "foa_mobile_login_complete";
    public static final java.lang.String EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE = "foa_mobile_login_method_complete";
    public static final java.lang.String EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED = "foa_mobile_login_method_not_tried";
    public static final java.lang.String EVENT_NAME_FOA_LOGIN_METHOD_START = "foa_mobile_login_method_start";
    public static final java.lang.String EVENT_NAME_FOA_LOGIN_START = "foa_mobile_login_start";
    public static final java.lang.String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
    public static final java.lang.String EVENT_NAME_LOGIN_HEARTBEAT = "fb_mobile_login_heartbeat";
    public static final java.lang.String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
    public static final java.lang.String EVENT_NAME_LOGIN_METHOD_NOT_TRIED = "fb_mobile_login_method_not_tried";
    public static final java.lang.String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
    public static final java.lang.String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
    public static final java.lang.String EVENT_NAME_LOGIN_STATUS_COMPLETE = "fb_mobile_login_status_complete";
    public static final java.lang.String EVENT_NAME_LOGIN_STATUS_START = "fb_mobile_login_status_start";
    public static final java.lang.String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
    public static final java.lang.String EVENT_PARAM_CHALLENGE = "7_challenge";
    public static final java.lang.String EVENT_PARAM_ERROR_CODE = "4_error_code";
    public static final java.lang.String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
    public static final java.lang.String EVENT_PARAM_EXTRAS = "6_extras";
    public static final java.lang.String EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED = "foa_skipped";
    public static final java.lang.String EVENT_PARAM_LOGIN_RESULT = "2_result";
    public static final java.lang.String EVENT_PARAM_METHOD = "3_method";
    public static final java.lang.String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
    public static final java.lang.String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
    public static final java.lang.String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
    private final java.lang.String applicationId;
    private java.lang.String facebookVersion;
    private final com.facebook.appevents.InternalAppEventsLogger logger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.LoginLogger.Companion INSTANCE = new com.facebook.login.LoginLogger.Companion(null);
    private static final java.util.concurrent.ScheduledExecutorService worker = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();

    public final void logAuthorizationMethodComplete(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodComplete$default(this, str, str2, str3, str4, str5, map, null, 64, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodNotTried(java.lang.String str, java.lang.String str2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodNotTried$default(this, str, str2, null, 4, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodStart(java.lang.String str, java.lang.String str2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodStart$default(this, str, str2, null, 4, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logCompleteLogin(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> loggingExtras, com.facebook.login.LoginClient.Result.Code code, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Exception exc) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            logCompleteLogin$default(this, str, loggingExtras, code, map, exc, null, 32, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logStartLogin(com.facebook.login.LoginClient.Request pendingLoginRequest) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
            logStartLogin$default(this, pendingLoginRequest, null, 2, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logUnexpectedError(java.lang.String str, java.lang.String str2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logUnexpectedError$default(this, str, str2, null, 4, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public LoginLogger(android.content.Context context, java.lang.String applicationId) {
        android.content.pm.PackageInfo packageInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.logger = new com.facebook.appevents.InternalAppEventsLogger(context, applicationId);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.facebookVersion = packageInfo.versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public final java.lang.String getApplicationId() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.applicationId;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static /* synthetic */ void logStartLogin$default(com.facebook.login.LoginLogger loginLogger, com.facebook.login.LoginClient.Request request, java.lang.String str, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        if ((i & 2) != 0) {
            str = EVENT_NAME_LOGIN_START;
        }
        try {
            loginLogger.logStartLogin(request, str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logStartLogin(com.facebook.login.LoginClient.Request pendingLoginRequest, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(pendingLoginRequest.getAuthId());
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.getLoginBehavior().toString());
                jSONObject.put(EVENT_EXTRAS_REQUEST_CODE, com.facebook.login.LoginClient.INSTANCE.getLoginRequestCode());
                jSONObject.put("permissions", android.text.TextUtils.join(",", pendingLoginRequest.getPermissions()));
                jSONObject.put("default_audience", pendingLoginRequest.getDefaultAudience().toString());
                jSONObject.put(EVENT_EXTRAS_IS_REAUTHORIZE, pendingLoginRequest.getIsRerequest());
                java.lang.String str = this.facebookVersion;
                if (str != null) {
                    jSONObject.put(EVENT_EXTRAS_FACEBOOK_VERSION, str);
                }
                if (pendingLoginRequest.getLoginTargetApp() != null) {
                    jSONObject.put(EVENT_EXTRAS_TARGET_APP, pendingLoginRequest.getLoginTargetApp().getTargetApp());
                }
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logCompleteLogin$default(com.facebook.login.LoginLogger loginLogger, java.lang.String str, java.util.Map map, com.facebook.login.LoginClient.Result.Code code, java.util.Map map2, java.lang.Exception exc, java.lang.String str2, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        if ((i & 32) != 0) {
            str2 = EVENT_NAME_LOGIN_COMPLETE;
        }
        try {
            loginLogger.logCompleteLogin(str, map, code, map2, exc, str2);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logCompleteLogin(java.lang.String loginRequestId, java.util.Map<java.lang.String, java.lang.String> loggingExtras, com.facebook.login.LoginClient.Result.Code result, java.util.Map<java.lang.String, java.lang.String> resultExtras, java.lang.Exception exception, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(loginRequestId);
            if (result != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, result.getLoggingValue());
            }
            if ((exception == null ? null : exception.getMessage()) != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exception.getMessage());
            }
            org.json.JSONObject jSONObject = loggingExtras.isEmpty() ^ true ? new org.json.JSONObject(loggingExtras) : null;
            if (resultExtras != null) {
                if (jSONObject == null) {
                    jSONObject = new org.json.JSONObject();
                }
                try {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : resultExtras.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.lang.String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (org.json.JSONException unused) {
                }
            }
            if (jSONObject != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            }
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
            if (result == com.facebook.login.LoginClient.Result.Code.SUCCESS) {
                logHeartbeatEvent(loginRequestId);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void logHeartbeatEvent(java.lang.String loginRequestId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(loginRequestId);
            worker.schedule(new java.lang.Runnable() { // from class: com.facebook.login.LoginLogger$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.login.LoginLogger.m5238logHeartbeatEvent$lambda0(com.facebook.login.LoginLogger.this, newAuthorizationLoggingBundle);
                }
            }, 5L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logHeartbeatEvent$lambda-0, reason: not valid java name */
    public static final void m5238logHeartbeatEvent$lambda0(com.facebook.login.LoginLogger this$0, android.os.Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "$bundle");
            this$0.logger.logEventImplicitly(EVENT_NAME_LOGIN_HEARTBEAT, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodStart$default(com.facebook.login.LoginLogger loginLogger, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        if ((i & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_START;
        }
        try {
            loginLogger.logAuthorizationMethodStart(str, str2, str3);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logAuthorizationMethodStart(java.lang.String authId, java.lang.String method, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(authId);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, method);
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodComplete$default(com.facebook.login.LoginLogger loginLogger, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, java.lang.String str6, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        try {
            loginLogger.logAuthorizationMethodComplete(str, str2, str3, str4, str5, map, (i & 64) != 0 ? EVENT_NAME_LOGIN_METHOD_COMPLETE : str6);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logAuthorizationMethodComplete(java.lang.String authId, java.lang.String method, java.lang.String result, java.lang.String errorMessage, java.lang.String errorCode, java.util.Map<java.lang.String, java.lang.String> loggingExtras, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(authId);
            if (result != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, result);
            }
            if (errorMessage != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, errorMessage);
            }
            if (errorCode != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_CODE, errorCode);
            }
            if (loggingExtras != null && (!loggingExtras.isEmpty())) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : loggingExtras.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, new org.json.JSONObject(linkedHashMap).toString());
            }
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, method);
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodNotTried$default(com.facebook.login.LoginLogger loginLogger, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        if ((i & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_NOT_TRIED;
        }
        try {
            loginLogger.logAuthorizationMethodNotTried(str, str2, str3);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logAuthorizationMethodNotTried(java.lang.String authId, java.lang.String method, java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(authId);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, method);
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusStart(java.lang.String loggerRef) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_START, INSTANCE.newAuthorizationLoggingBundle(loggerRef));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusSuccess(java.lang.String loggerRef) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(loggerRef);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, com.facebook.login.LoginClient.Result.Code.SUCCESS.getLoggingValue());
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusFailure(java.lang.String loggerRef) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(loggerRef);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, EVENT_EXTRAS_FAILURE);
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusError(java.lang.String loggerRef, java.lang.Exception exception) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle(loggerRef);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, com.facebook.login.LoginClient.Result.Code.ERROR.getLoggingValue());
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exception.toString());
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logUnexpectedError$default(com.facebook.login.LoginLogger loginLogger, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.LoginLogger.class)) {
            return;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        try {
            loginLogger.logUnexpectedError(str, str2, str3);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.LoginLogger.class);
        }
    }

    public final void logUnexpectedError(java.lang.String eventName, java.lang.String errorMessage, java.lang.String method) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle newAuthorizationLoggingBundle = INSTANCE.newAuthorizationLoggingBundle("");
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, com.facebook.login.LoginClient.Result.Code.ERROR.getLoggingValue());
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, errorMessage);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, method);
            this.logger.logEventImplicitly(eventName, newAuthorizationLoggingBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: LoginLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n **\u0004\u0018\u00010)0)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/facebook/login/LoginLogger$Companion;", "", "()V", "EVENT_EXTRAS_DEFAULT_AUDIENCE", "", "EVENT_EXTRAS_FACEBOOK_VERSION", "EVENT_EXTRAS_FAILURE", "EVENT_EXTRAS_IS_REAUTHORIZE", "EVENT_EXTRAS_LOGIN_BEHAVIOR", "EVENT_EXTRAS_MISSING_INTERNET_PERMISSION", "EVENT_EXTRAS_NEW_PERMISSIONS", "EVENT_EXTRAS_NOT_TRIED", "EVENT_EXTRAS_PERMISSIONS", "EVENT_EXTRAS_REQUEST_CODE", "EVENT_EXTRAS_TARGET_APP", "EVENT_EXTRAS_TRY_LOGIN_ACTIVITY", "EVENT_NAME_FOA_LOGIN_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_FOA_LOGIN_METHOD_START", "EVENT_NAME_FOA_LOGIN_START", "EVENT_NAME_LOGIN_COMPLETE", "EVENT_NAME_LOGIN_HEARTBEAT", "EVENT_NAME_LOGIN_METHOD_COMPLETE", "EVENT_NAME_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_LOGIN_METHOD_START", "EVENT_NAME_LOGIN_START", "EVENT_NAME_LOGIN_STATUS_COMPLETE", "EVENT_NAME_LOGIN_STATUS_START", "EVENT_PARAM_AUTH_LOGGER_ID", "EVENT_PARAM_CHALLENGE", "EVENT_PARAM_ERROR_CODE", "EVENT_PARAM_ERROR_MESSAGE", "EVENT_PARAM_EXTRAS", "EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED", "EVENT_PARAM_LOGIN_RESULT", "EVENT_PARAM_METHOD", "EVENT_PARAM_METHOD_RESULT_SKIPPED", "EVENT_PARAM_TIMESTAMP", "FACEBOOK_PACKAGE_NAME", "worker", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "newAuthorizationLoggingBundle", "Landroid/os/Bundle;", "authLoggerId", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Bundle newAuthorizationLoggingBundle(java.lang.String authLoggerId) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(com.facebook.login.LoginLogger.EVENT_PARAM_TIMESTAMP, java.lang.System.currentTimeMillis());
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, authLoggerId);
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_METHOD, "");
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_LOGIN_RESULT, "");
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_ERROR_MESSAGE, "");
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_ERROR_CODE, "");
            bundle.putString(com.facebook.login.LoginLogger.EVENT_PARAM_EXTRAS, "");
            return bundle;
        }
    }
}
