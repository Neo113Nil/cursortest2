package com.facebook.internal;

/* compiled from: ServerProtocol.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b:\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010;\u001a\u00020\u0004H\u0007J\b\u0010<\u001a\u00020\u0004H\u0007J\b\u0010=\u001a\u00020\u0004H\u0007J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0007J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0007J\b\u0010A\u001a\u00020\u0004H\u0007J\b\u0010B\u001a\u00020\u0004H\u0007J\b\u0010C\u001a\u00020\u0004H\u0007J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0004H\u0007J\b\u0010F\u001a\u00020\u0004H\u0007J\b\u0010G\u001a\u00020\u0004H\u0007J$\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010IH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\n :*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/facebook/internal/ServerProtocol;", "", "()V", "DIALOG_AUTHORITY_FORMAT", "", "DIALOG_CANCEL_URI", "DIALOG_PARAM_ACCESS_TOKEN", "DIALOG_PARAM_APP_ID", "DIALOG_PARAM_AUTHENTICATION_TOKEN", "DIALOG_PARAM_AUTH_TYPE", "DIALOG_PARAM_CBT", "DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH", "DIALOG_PARAM_CLIENT_ID", "DIALOG_PARAM_CODE_CHALLENGE", "DIALOG_PARAM_CODE_CHALLENGE_METHOD", "DIALOG_PARAM_CODE_REDIRECT_URI", "DIALOG_PARAM_CUSTOM_TABS_PREFETCHING", "DIALOG_PARAM_DEFAULT_AUDIENCE", "DIALOG_PARAM_DISPLAY", "DIALOG_PARAM_DISPLAY_TOUCH", "DIALOG_PARAM_E2E", "DIALOG_PARAM_FAIL_ON_LOGGED_OUT", "DIALOG_PARAM_FX_APP", "DIALOG_PARAM_IES", "DIALOG_PARAM_LEGACY_OVERRIDE", "DIALOG_PARAM_LOGIN_BEHAVIOR", "DIALOG_PARAM_MESSENGER_PAGE_ID", "DIALOG_PARAM_NONCE", "DIALOG_PARAM_REDIRECT_URI", "DIALOG_PARAM_RESET_MESSENGER_STATE", "DIALOG_PARAM_RESPONSE_TYPE", "DIALOG_PARAM_RETURN_SCOPES", "DIALOG_PARAM_SCOPE", "DIALOG_PARAM_SDK_VERSION", "DIALOG_PARAM_SKIP_DEDUPE", "DIALOG_PARAM_SSO_DEVICE", "DIALOG_PARAM_STATE", "DIALOG_PATH", "DIALOG_REDIRECT_CHROME_OS_URI", "DIALOG_REDIRECT_URI", "DIALOG_REREQUEST_AUTH_TYPE", "DIALOG_RESPONSE_TYPE_CODE", "DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST", "DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES", "DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST", "DIALOG_RETURN_SCOPES_TRUE", "FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH", "FALLBACK_DIALOG_PARAM_APP_ID", "FALLBACK_DIALOG_PARAM_BRIDGE_ARGS", "FALLBACK_DIALOG_PARAM_KEY_HASH", "FALLBACK_DIALOG_PARAM_METHOD_ARGS", "FALLBACK_DIALOG_PARAM_METHOD_RESULTS", "FALLBACK_DIALOG_PARAM_VERSION", "GAMING_DIALOG_AUTHORITY_FORMAT", "GRAPH_URL_FORMAT", "GRAPH_VIDEO_URL_FORMAT", "INSTAGRAM_OAUTH_PATH", "TAG", "kotlin.jvm.PlatformType", "getDefaultAPIVersion", "getDialogAuthority", "getErrorConnectionFailure", "getErrorsProxyAuthDisabled", "", "getErrorsUserCanceled", "getFacebookGraphUrlBase", "getGamingDialogAuthority", "getGraphUrlBase", "getGraphUrlBaseForSubdomain", "subdomain", "getGraphVideoUrlBase", "getInstagramDialogAuthority", "getQueryParamsForPlatformActivityIntentWebFallback", "Landroid/os/Bundle;", "callId", "version", "", "methodArgs", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ServerProtocol {
    private static final java.lang.String DIALOG_AUTHORITY_FORMAT = "m.%s";
    public static final java.lang.String DIALOG_CANCEL_URI = "fbconnect://cancel";
    public static final java.lang.String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
    public static final java.lang.String DIALOG_PARAM_APP_ID = "app_id";
    public static final java.lang.String DIALOG_PARAM_AUTHENTICATION_TOKEN = "id_token";
    public static final java.lang.String DIALOG_PARAM_AUTH_TYPE = "auth_type";
    public static final java.lang.String DIALOG_PARAM_CBT = "cbt";
    public static final java.lang.String DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH = "cct_over_app_switch";
    public static final java.lang.String DIALOG_PARAM_CLIENT_ID = "client_id";
    public static final java.lang.String DIALOG_PARAM_CODE_CHALLENGE = "code_challenge";
    public static final java.lang.String DIALOG_PARAM_CODE_CHALLENGE_METHOD = "code_challenge_method";
    public static final java.lang.String DIALOG_PARAM_CODE_REDIRECT_URI = "code_redirect_uri";
    public static final java.lang.String DIALOG_PARAM_CUSTOM_TABS_PREFETCHING = "cct_prefetching";
    public static final java.lang.String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";
    public static final java.lang.String DIALOG_PARAM_DISPLAY = "display";
    public static final java.lang.String DIALOG_PARAM_DISPLAY_TOUCH = "touch";
    public static final java.lang.String DIALOG_PARAM_E2E = "e2e";
    public static final java.lang.String DIALOG_PARAM_FAIL_ON_LOGGED_OUT = "fail_on_logged_out";
    public static final java.lang.String DIALOG_PARAM_FX_APP = "fx_app";
    public static final java.lang.String DIALOG_PARAM_IES = "ies";
    public static final java.lang.String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";
    public static final java.lang.String DIALOG_PARAM_LOGIN_BEHAVIOR = "login_behavior";
    public static final java.lang.String DIALOG_PARAM_MESSENGER_PAGE_ID = "messenger_page_id";
    public static final java.lang.String DIALOG_PARAM_NONCE = "nonce";
    public static final java.lang.String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
    public static final java.lang.String DIALOG_PARAM_RESET_MESSENGER_STATE = "reset_messenger_state";
    public static final java.lang.String DIALOG_PARAM_RESPONSE_TYPE = "response_type";
    public static final java.lang.String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";
    public static final java.lang.String DIALOG_PARAM_SCOPE = "scope";
    public static final java.lang.String DIALOG_PARAM_SDK_VERSION = "sdk";
    public static final java.lang.String DIALOG_PARAM_SKIP_DEDUPE = "skip_dedupe";
    public static final java.lang.String DIALOG_PARAM_SSO_DEVICE = "sso";
    public static final java.lang.String DIALOG_PARAM_STATE = "state";
    public static final java.lang.String DIALOG_PATH = "dialog/";
    public static final java.lang.String DIALOG_REDIRECT_CHROME_OS_URI = "fbconnect://chrome_os_success";
    public static final java.lang.String DIALOG_REDIRECT_URI = "fbconnect://success";
    public static final java.lang.String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";
    public static final java.lang.String DIALOG_RESPONSE_TYPE_CODE = "code,signed_request,graph_domain";
    public static final java.lang.String DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST = "id_token,token,signed_request,graph_domain";
    public static final java.lang.String DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES = "token,signed_request,graph_domain,granted_scopes";
    public static final java.lang.String DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST = "token,signed_request,graph_domain";
    public static final java.lang.String DIALOG_RETURN_SCOPES_TRUE = "true";
    public static final java.lang.String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";
    public static final java.lang.String FALLBACK_DIALOG_PARAM_VERSION = "version";
    private static final java.lang.String GAMING_DIALOG_AUTHORITY_FORMAT = "%s";
    private static final java.lang.String GRAPH_URL_FORMAT = "https://graph.%s";
    private static final java.lang.String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";
    public static final java.lang.String INSTAGRAM_OAUTH_PATH = "oauth/authorize";
    public static final com.facebook.internal.ServerProtocol INSTANCE = new com.facebook.internal.ServerProtocol();
    private static final java.lang.String TAG = com.facebook.internal.ServerProtocol.class.getName();

    private ServerProtocol() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDefaultAPIVersion() {
        return "v16.0";
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Collection<java.lang.String> getErrorsProxyAuthDisabled() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Collection<java.lang.String> getErrorsUserCanceled() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"access_denied", "OAuthAccessDeniedException"});
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getErrorConnectionFailure() {
        return "CONNECTION_FAILURE";
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDialogAuthority() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(DIALOG_AUTHORITY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getFacebookDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGamingDialogAuthority() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(GAMING_DIALOG_AUTHORITY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getFacebookGamingDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getInstagramDialogAuthority() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(DIALOG_AUTHORITY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getInstagramDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphUrlBase() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(GRAPH_URL_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getGraphDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphVideoUrlBase() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(GRAPH_VIDEO_URL_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getGraphDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFacebookGraphUrlBase() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(GRAPH_URL_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getFacebookDomain()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphUrlBaseForSubdomain(java.lang.String subdomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(GRAPH_URL_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{subdomain}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getQueryParamsForPlatformActivityIntentWebFallback(java.lang.String callId, int version, android.os.Bundle methodArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationSignature = com.facebook.FacebookSdk.getApplicationSignature(applicationContext);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(applicationSignature)) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(FALLBACK_DIALOG_PARAM_KEY_HASH, applicationSignature);
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        bundle.putString("app_id", com.facebook.FacebookSdk.getApplicationId());
        bundle.putInt("version", version);
        bundle.putString("display", "touch");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("action_id", callId);
        try {
            com.facebook.internal.BundleJSONConverter bundleJSONConverter = com.facebook.internal.BundleJSONConverter.INSTANCE;
            org.json.JSONObject convertToJSON = com.facebook.internal.BundleJSONConverter.convertToJSON(bundle2);
            com.facebook.internal.BundleJSONConverter bundleJSONConverter2 = com.facebook.internal.BundleJSONConverter.INSTANCE;
            if (methodArgs == null) {
                methodArgs = new android.os.Bundle();
            }
            org.json.JSONObject convertToJSON2 = com.facebook.internal.BundleJSONConverter.convertToJSON(methodArgs);
            if (convertToJSON != null && convertToJSON2 != null) {
                bundle.putString(FALLBACK_DIALOG_PARAM_BRIDGE_ARGS, convertToJSON.toString());
                bundle.putString(FALLBACK_DIALOG_PARAM_METHOD_ARGS, convertToJSON2.toString());
                return bundle;
            }
            return null;
        } catch (java.lang.IllegalArgumentException e) {
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.DEVELOPER_ERRORS;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.log(loggingBehavior, 6, TAG2, kotlin.jvm.internal.Intrinsics.stringPlus("Error creating Url -- ", e));
            return null;
        } catch (org.json.JSONException e2) {
            com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.log(loggingBehavior2, 6, TAG3, kotlin.jvm.internal.Intrinsics.stringPlus("Error creating Url -- ", e2));
            return null;
        }
    }
}
