package com.facebook.login;

/* compiled from: LoginManager.kt */
@kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 y2\u00020\u0001:\u0006wxyz{|B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u001e\u001a\u00060\u001fR\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020$H\u0014JH\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u00010$2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\r2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020$H\u0014JL\u0010>\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020B2\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010D2\b\u00105\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010$H\u0002J\u0016\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010+\u001a\u00020,J\u001e\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J \u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J$\u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J.\u0010G\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0016\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010+\u001a\u00020,J\u001e\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010G\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0016\u0010P\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010+\u001a\u00020,J\u001e\u0010Q\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J\u001c\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010Q\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J\u001e\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0007J\u001e\u0010Q\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002J\u001e\u0010R\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J\u001c\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010R\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J$\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&J\u001e\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0007J\u001e\u0010R\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002J\b\u0010S\u001a\u00020/H\u0016J\u001c\u0010T\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010U\u001a\u0004\u0018\u00010$H\u0002J\u0016\u0010V\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010+\u001a\u00020,J\u0018\u0010V\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010+\u001a\u00020,H\u0002J,\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010<2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0017J\u000e\u0010[\u001a\u00020/2\u0006\u0010H\u001a\u00020IJ\u000e\u0010[\u001a\u00020/2\u0006\u0010J\u001a\u00020NJ\u0010\u0010[\u001a\u00020/2\u0006\u0010J\u001a\u00020OH\u0002J \u0010\\\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010!2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109J\u0016\u0010]\u001a\u00020/2\u0006\u0010H\u001a\u00020I2\u0006\u0010(\u001a\u00020)J\u0016\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u0006\u0010(\u001a\u00020)J\u001e\u0010]\u001a\u00020/2\u0006\u0010L\u001a\u00020M2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)J\u001e\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)J\u0018\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020N2\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u0010]\u001a\u00020/2\u0006\u0010J\u001a\u00020O2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020<H\u0002J\u0016\u0010`\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010a\u001a\u00020bJ\u001e\u0010`\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010c\u001a\u00020d2\u0006\u0010a\u001a\u00020bJ \u0010e\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0002J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010g\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010h\u001a\u00020/2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010i\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010j\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0014J\u0010\u0010m\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u000e\u0010n\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010o\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\rJ\u0018\u0010p\u001a\u00020/2\u0006\u0010q\u001a\u00020r2\u0006\u0010=\u001a\u00020$H\u0002J\u0018\u0010s\u001a\u00020\r2\u0006\u0010q\u001a\u00020r2\u0006\u0010=\u001a\u00020$H\u0002J\u0010\u0010t\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010u\u001a\u00020/2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0002J\u0018\u0010v\u001a\u00020/2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000e¨\u0006}"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "()V", "<set-?>", "", "authType", "getAuthType", "()Ljava/lang/String;", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "isExpressLoginAllowed", "", "()Z", "isFamilyLogin", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "messengerPageId", "resetMessengerState", "sharedPreferences", "Landroid/content/SharedPreferences;", "shouldSkipAccountDeduplication", "getShouldSkipAccountDeduplication", "createLogInActivityResultContract", "Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "callbackManager", "Lcom/facebook/CallbackManager;", "loggerID", "createLoginRequest", "Lcom/facebook/login/LoginClient$Request;", "permissions", "", "createLoginRequestFromResponse", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "createLoginRequestWithConfig", "loginConfig", "Lcom/facebook/login/LoginConfiguration;", "createReauthorizeRequest", "finishLogin", "", "newToken", "Lcom/facebook/AccessToken;", "newIdToken", "Lcom/facebook/AuthenticationToken;", "origRequest", "exception", "Lcom/facebook/FacebookException;", "isCanceled", "callback", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "getFacebookActivityIntent", "Landroid/content/Intent;", "request", "logCompleteLogin", "context", "Landroid/content/Context;", "result", "Lcom/facebook/login/LoginClient$Result$Code;", "resultExtras", "", "Ljava/lang/Exception;", "wasLoginActivityTried", "logIn", "activity", "Landroid/app/Activity;", "fragment", "Landroid/app/Fragment;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/internal/FragmentWrapper;", "logInWithConfiguration", "logInWithPublishPermissions", "logInWithReadPermissions", "logOut", "logStartLogin", "loginRequest", "loginWithConfiguration", "onActivityResult", com.ironsource.X3.f.f, "", "data", "reauthorizeDataAccess", "registerCallback", "resolveError", "resolveIntent", "intent", "retrieveLoginStatus", "responseCallback", "Lcom/facebook/LoginStatusCallback;", "toastDurationMs", "", "retrieveLoginStatusImpl", "setAuthType", "setDefaultAudience", "setExpressLoginStatus", "setFamilyLogin", "setLoginBehavior", "setLoginTargetApp", "targetApp", "setMessengerPageId", "setResetMessengerState", "setShouldSkipAccountDeduplication", "startLogin", "startActivityDelegate", "Lcom/facebook/login/StartActivityDelegate;", "tryFacebookActivity", "unregisterCallback", "validatePublishPermissions", "validateReadPermissions", "ActivityStartActivityDelegate", "AndroidxActivityResultRegistryOwnerStartActivityDelegate", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "FacebookLoginActivityResultContract", "FragmentStartActivityDelegate", "LoginLoggerHolder", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.LoginManager.Companion INSTANCE;
    private static final java.lang.String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
    private static final java.lang.String MANAGE_PERMISSION_PREFIX = "manage";
    private static final java.util.Set<java.lang.String> OTHER_PUBLISH_PERMISSIONS;
    private static final java.lang.String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
    private static final java.lang.String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final java.lang.String TAG;
    private static volatile com.facebook.login.LoginManager instance;
    private boolean isFamilyLogin;
    private java.lang.String messengerPageId;
    private boolean resetMessengerState;
    private final android.content.SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;
    private com.facebook.login.LoginBehavior loginBehavior = com.facebook.login.LoginBehavior.NATIVE_WITH_FALLBACK;
    private com.facebook.login.DefaultAudience defaultAudience = com.facebook.login.DefaultAudience.FRIENDS;
    private java.lang.String authType = com.facebook.internal.ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private com.facebook.login.LoginTargetApp loginTargetApp = com.facebook.login.LoginTargetApp.FACEBOOK;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.login.LoginResult computeLoginResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken) {
        return INSTANCE.computeLoginResult(request, accessToken, authenticationToken);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> getExtraDataFromIntent(android.content.Intent intent) {
        return INSTANCE.getExtraDataFromIntent(intent);
    }

    @kotlin.jvm.JvmStatic
    public static com.facebook.login.LoginManager getInstance() {
        return INSTANCE.getInstance();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isPublishPermission(java.lang.String str) {
        return INSTANCE.isPublishPermission(str);
    }

    public final com.facebook.login.LoginManager.FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    public final com.facebook.login.LoginManager.FacebookLoginActivityResultContract createLogInActivityResultContract(com.facebook.CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    public final boolean onActivityResult(int i, android.content.Intent intent) {
        return onActivityResult$default(this, i, intent, null, 4, null);
    }

    public LoginManager() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (com.facebook.FacebookSdk.hasCustomTabsPrefetching) {
            com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
            if (com.facebook.internal.CustomTabUtils.getChromePackage() != null) {
                com.facebook.login.CustomTabPrefetchHelper customTabPrefetchHelper = new com.facebook.login.CustomTabPrefetchHelper();
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(com.facebook.FacebookSdk.getApplicationContext(), "com.android.chrome", customTabPrefetchHelper);
                com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
                android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
                com.facebook.FacebookSdk facebookSdk4 = com.facebook.FacebookSdk.INSTANCE;
                androidx.browser.customtabs.CustomTabsClient.connectAndInitialize(applicationContext, com.facebook.FacebookSdk.getApplicationContext().getPackageName());
            }
        }
    }

    public final com.facebook.login.LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    public final com.facebook.login.DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    public final java.lang.String getAuthType() {
        return this.authType;
    }

    public final com.facebook.login.LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    /* renamed from: isFamilyLogin, reason: from getter */
    public final boolean getIsFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final void resolveError(android.app.Activity activity, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new com.facebook.login.LoginManager.ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(response));
    }

    @kotlin.Deprecated(message = "")
    public final void resolveError(androidx.fragment.app.Fragment fragment, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new com.facebook.internal.FragmentWrapper(fragment), response);
    }

    public final void resolveError(androidx.fragment.app.Fragment fragment, com.facebook.CallbackManager callbackManager, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, response);
            return;
        }
        throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void resolveError(android.app.Fragment fragment, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new com.facebook.internal.FragmentWrapper(fragment), response);
    }

    private final void resolveError(com.facebook.internal.FragmentWrapper fragment, com.facebook.GraphResponse response) {
        startLogin(new com.facebook.login.LoginManager.FragmentStartActivityDelegate(fragment), createLoginRequestFromResponse(response));
    }

    public final void resolveError(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestFromResponse(response));
    }

    private final com.facebook.login.LoginClient.Request createLoginRequestFromResponse(com.facebook.GraphResponse response) {
        java.util.Set<java.lang.String> permissions;
        com.facebook.AccessToken accessToken = response.getRequest().getAccessToken();
        java.util.List list = null;
        if (accessToken != null && (permissions = accessToken.getPermissions()) != null) {
            list = kotlin.collections.CollectionsKt.filterNotNull(permissions);
        }
        return createLoginRequest(list);
    }

    public final void registerCallback(com.facebook.CallbackManager callbackManager, final com.facebook.FacebookCallback<com.facebook.login.LoginResult> callback) {
        if (!(callbackManager instanceof com.facebook.internal.CallbackManagerImpl)) {
            throw new com.facebook.FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.CallbackManagerImpl) callbackManager).registerCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, android.content.Intent intent) {
                boolean m5241registerCallback$lambda0;
                m5241registerCallback$lambda0 = com.facebook.login.LoginManager.m5241registerCallback$lambda0(com.facebook.login.LoginManager.this, callback, i, intent);
                return m5241registerCallback$lambda0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerCallback$lambda-0, reason: not valid java name */
    public static final boolean m5241registerCallback$lambda0(com.facebook.login.LoginManager this$0, com.facebook.FacebookCallback facebookCallback, int i, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.onActivityResult(i, intent, facebookCallback);
    }

    public final void unregisterCallback(com.facebook.CallbackManager callbackManager) {
        if (!(callbackManager instanceof com.facebook.internal.CallbackManagerImpl)) {
            throw new com.facebook.FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.CallbackManagerImpl) callbackManager).unregisterCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(com.facebook.login.LoginManager loginManager, int i, android.content.Intent intent, com.facebook.FacebookCallback facebookCallback, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i2 & 4) != 0) {
            facebookCallback = null;
        }
        return loginManager.onActivityResult(i, intent, facebookCallback);
    }

    public boolean onActivityResult(int resultCode, android.content.Intent data, com.facebook.FacebookCallback<com.facebook.login.LoginResult> callback) {
        com.facebook.login.LoginClient.Result.Code code;
        com.facebook.AccessToken accessToken;
        com.facebook.AuthenticationToken authenticationToken;
        com.facebook.login.LoginClient.Request request;
        java.util.Map<java.lang.String, java.lang.String> map;
        boolean z;
        com.facebook.AuthenticationToken authenticationToken2;
        com.facebook.login.LoginClient.Result.Code code2 = com.facebook.login.LoginClient.Result.Code.ERROR;
        com.facebook.FacebookException facebookException = null;
        boolean z2 = false;
        if (data != null) {
            data.setExtrasClassLoader(com.facebook.login.LoginClient.Result.class.getClassLoader());
            com.facebook.login.LoginClient.Result result = (com.facebook.login.LoginClient.Result) data.getParcelableExtra(com.facebook.login.LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                com.facebook.login.LoginClient.Result.Code code3 = result.code;
                if (resultCode != -1) {
                    if (resultCode != 0) {
                        accessToken = null;
                        authenticationToken2 = null;
                    } else {
                        accessToken = null;
                        authenticationToken2 = null;
                        z2 = true;
                    }
                } else if (result.code == com.facebook.login.LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new com.facebook.FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z = z2;
                authenticationToken = authenticationToken2;
                code = code3;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        } else {
            if (resultCode == 0) {
                code = com.facebook.login.LoginClient.Result.Code.CANCEL;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z = true;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new com.facebook.FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.FacebookException facebookException2 = facebookException;
        com.facebook.login.LoginClient.Request request2 = request;
        logCompleteLogin(null, code, map, facebookException2, true, request2);
        finishLogin(accessToken, authenticationToken, request2, facebookException2, z, callback);
        return true;
    }

    public final com.facebook.login.LoginManager setLoginBehavior(com.facebook.login.LoginBehavior loginBehavior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        this.loginBehavior = loginBehavior;
        return this;
    }

    public final com.facebook.login.LoginManager setLoginTargetApp(com.facebook.login.LoginTargetApp targetApp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        this.loginTargetApp = targetApp;
        return this;
    }

    public final com.facebook.login.LoginManager setDefaultAudience(com.facebook.login.DefaultAudience defaultAudience) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        this.defaultAudience = defaultAudience;
        return this;
    }

    public final com.facebook.login.LoginManager setAuthType(java.lang.String authType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
        this.authType = authType;
        return this;
    }

    public final com.facebook.login.LoginManager setMessengerPageId(java.lang.String messengerPageId) {
        this.messengerPageId = messengerPageId;
        return this;
    }

    public final com.facebook.login.LoginManager setResetMessengerState(boolean resetMessengerState) {
        this.resetMessengerState = resetMessengerState;
        return this;
    }

    public final com.facebook.login.LoginManager setFamilyLogin(boolean isFamilyLogin) {
        this.isFamilyLogin = isFamilyLogin;
        return this;
    }

    public final com.facebook.login.LoginManager setShouldSkipAccountDeduplication(boolean shouldSkipAccountDeduplication) {
        this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        return this;
    }

    public void logOut() {
        com.facebook.AccessToken.INSTANCE.setCurrentAccessToken(null);
        com.facebook.AuthenticationToken.INSTANCE.setCurrentAuthenticationToken(null);
        com.facebook.Profile.INSTANCE.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    public final void retrieveLoginStatus(android.content.Context context, com.facebook.LoginStatusCallback responseCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatus(context, 5000L, responseCallback);
    }

    public final void retrieveLoginStatus(android.content.Context context, long toastDurationMs, com.facebook.LoginStatusCallback responseCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatusImpl(context, responseCallback, toastDurationMs);
    }

    @kotlin.Deprecated(message = "")
    public final void logInWithReadPermissions(androidx.fragment.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithReadPermissions(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    public final void logInWithReadPermissions(androidx.fragment.app.Fragment fragment, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, permissions);
            return;
        }
        throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void logInWithReadPermissions(android.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithReadPermissions(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    private final void logInWithReadPermissions(com.facebook.internal.FragmentWrapper fragment, java.util.Collection<java.lang.String> permissions) {
        validateReadPermissions(permissions);
        logIn(fragment, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithReadPermissions(android.app.Activity activity, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        validateReadPermissions(permissions);
        logIn(activity, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithReadPermissions(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        validateReadPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithConfiguration(androidx.fragment.app.Fragment fragment, com.facebook.login.LoginConfiguration loginConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        loginWithConfiguration(new com.facebook.internal.FragmentWrapper(fragment), loginConfig);
    }

    private final void loginWithConfiguration(com.facebook.internal.FragmentWrapper fragment, com.facebook.login.LoginConfiguration loginConfig) {
        logIn(fragment, loginConfig);
    }

    public final void loginWithConfiguration(android.app.Activity activity, com.facebook.login.LoginConfiguration loginConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        logIn(activity, loginConfig);
    }

    public final void reauthorizeDataAccess(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        startLogin(new com.facebook.login.LoginManager.ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void reauthorizeDataAccess(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        reauthorizeDataAccess(new com.facebook.internal.FragmentWrapper(fragment));
    }

    private final void reauthorizeDataAccess(com.facebook.internal.FragmentWrapper fragment) {
        startLogin(new com.facebook.login.LoginManager.FragmentStartActivityDelegate(fragment), createReauthorizeRequest());
    }

    @kotlin.Deprecated(message = "")
    public final void logInWithPublishPermissions(androidx.fragment.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithPublishPermissions(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    public final void logInWithPublishPermissions(androidx.fragment.app.Fragment fragment, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, permissions);
            return;
        }
        throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void logInWithPublishPermissions(android.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithPublishPermissions(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    private final void logInWithPublishPermissions(com.facebook.internal.FragmentWrapper fragment, java.util.Collection<java.lang.String> permissions) {
        validatePublishPermissions(permissions);
        loginWithConfiguration(fragment, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithPublishPermissions(android.app.Activity activity, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        validatePublishPermissions(permissions);
        loginWithConfiguration(activity, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithPublishPermissions(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        validatePublishPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logIn(androidx.fragment.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    public final void logIn(androidx.fragment.app.Fragment fragment, java.util.Collection<java.lang.String> permissions, java.lang.String loggerID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new com.facebook.internal.FragmentWrapper(fragment), permissions, loggerID);
    }

    public final void logIn(android.app.Fragment fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new com.facebook.internal.FragmentWrapper(fragment), permissions);
    }

    public final void logIn(android.app.Fragment fragment, java.util.Collection<java.lang.String> permissions, java.lang.String loggerID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new com.facebook.internal.FragmentWrapper(fragment), permissions, loggerID);
    }

    public final void logIn(com.facebook.internal.FragmentWrapper fragment, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(fragment, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logIn(com.facebook.internal.FragmentWrapper fragment, java.util.Collection<java.lang.String> permissions, java.lang.String loggerID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        com.facebook.login.LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            createLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new com.facebook.login.LoginManager.FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig);
    }

    public final void logIn(android.app.Activity activity, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        logIn(activity, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    public final void logIn(com.facebook.internal.FragmentWrapper fragment, com.facebook.login.LoginConfiguration loginConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        startLogin(new com.facebook.login.LoginManager.FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(android.app.Activity activity, com.facebook.login.LoginConfiguration loginConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof androidx.activity.result.ActivityResultRegistryOwner) {
            android.util.Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new com.facebook.login.LoginManager.ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(android.app.Activity activity, java.util.Collection<java.lang.String> permissions, java.lang.String loggerID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.facebook.login.LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            createLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new com.facebook.login.LoginManager.ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    private final void logIn(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, com.facebook.login.LoginConfiguration loginConfig) {
        startLogin(new com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions, java.lang.String loggerID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        com.facebook.login.LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            createLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig);
    }

    public final void logIn(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager, java.util.Collection<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        logIn(activityResultRegistryOwner, callbackManager, new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
    }

    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "callbackManager", "Lcom/facebook/CallbackManager;", "loggerID", "(Lcom/facebook/login/LoginManager;Lcom/facebook/CallbackManager;Ljava/lang/String;)V", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "permissions", "parseResult", com.ironsource.X3.f.f, "", "intent", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class FacebookLoginActivityResultContract extends androidx.activity.result.contract.ActivityResultContract<java.util.Collection<? extends java.lang.String>, com.facebook.CallbackManager.ActivityResultParameters> {
        private com.facebook.CallbackManager callbackManager;
        private java.lang.String loggerID;

        public FacebookLoginActivityResultContract(com.facebook.login.LoginManager this$0, com.facebook.CallbackManager callbackManager, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            com.facebook.login.LoginManager.this = this$0;
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }

        public /* synthetic */ FacebookLoginActivityResultContract(com.facebook.CallbackManager callbackManager, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(com.facebook.login.LoginManager.this, (i & 1) != 0 ? null : callbackManager, (i & 2) != 0 ? null : str);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.util.Collection<? extends java.lang.String> collection) {
            return createIntent2(context, (java.util.Collection<java.lang.String>) collection);
        }

        public final com.facebook.CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        public final void setCallbackManager(com.facebook.CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final java.lang.String getLoggerID() {
            return this.loggerID;
        }

        public final void setLoggerID(java.lang.String str) {
            this.loggerID = str;
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context context, java.util.Collection<java.lang.String> permissions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.facebook.login.LoginClient.Request createLoginRequestWithConfig = com.facebook.login.LoginManager.this.createLoginRequestWithConfig(new com.facebook.login.LoginConfiguration(permissions, null, 2, null));
            java.lang.String str = this.loggerID;
            if (str != null) {
                createLoginRequestWithConfig.setAuthId(str);
            }
            com.facebook.login.LoginManager.this.logStartLogin(context, createLoginRequestWithConfig);
            android.content.Intent facebookActivityIntent = com.facebook.login.LoginManager.this.getFacebookActivityIntent(createLoginRequestWithConfig);
            if (com.facebook.login.LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            com.facebook.FacebookException facebookException = new com.facebook.FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            com.facebook.login.LoginManager.this.logCompleteLogin(context, com.facebook.login.LoginClient.Result.Code.ERROR, null, facebookException, false, createLoginRequestWithConfig);
            throw facebookException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public com.facebook.CallbackManager.ActivityResultParameters parseResult(int resultCode, android.content.Intent intent) {
            com.facebook.login.LoginManager.onActivityResult$default(com.facebook.login.LoginManager.this, resultCode, intent, null, 4, null);
            int requestCode = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            com.facebook.CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, resultCode, intent);
            }
            return new com.facebook.CallbackManager.ActivityResultParameters(requestCode, resultCode, intent);
        }
    }

    public static /* synthetic */ com.facebook.login.LoginManager.FacebookLoginActivityResultContract createLogInActivityResultContract$default(com.facebook.login.LoginManager loginManager, com.facebook.CallbackManager callbackManager, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
        }
        if ((i & 1) != 0) {
            callbackManager = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return loginManager.createLogInActivityResultContract(callbackManager, str);
    }

    public final com.facebook.login.LoginManager.FacebookLoginActivityResultContract createLogInActivityResultContract(com.facebook.CallbackManager callbackManager, java.lang.String loggerID) {
        return new com.facebook.login.LoginManager.FacebookLoginActivityResultContract(this, callbackManager, loggerID);
    }

    private final void validateReadPermissions(java.util.Collection<java.lang.String> permissions) {
        if (permissions == null) {
            return;
        }
        for (java.lang.String str : permissions) {
            if (INSTANCE.isPublishPermission(str)) {
                throw new com.facebook.FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    private final void validatePublishPermissions(java.util.Collection<java.lang.String> permissions) {
        if (permissions == null) {
            return;
        }
        for (java.lang.String str : permissions) {
            if (!INSTANCE.isPublishPermission(str)) {
                throw new com.facebook.FacebookException("Cannot pass a read permission (" + str + ") to a request for publish authorization");
            }
        }
    }

    protected com.facebook.login.LoginClient.Request createLoginRequestWithConfig(com.facebook.login.LoginConfiguration loginConfig) {
        java.lang.String codeVerifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        com.facebook.login.CodeChallengeMethod codeChallengeMethod = com.facebook.login.CodeChallengeMethod.S256;
        try {
            com.facebook.login.PKCEUtil pKCEUtil = com.facebook.login.PKCEUtil.INSTANCE;
            codeVerifier = com.facebook.login.PKCEUtil.generateCodeChallenge(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (com.facebook.FacebookException unused) {
            codeChallengeMethod = com.facebook.login.CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        java.lang.String str = codeVerifier;
        com.facebook.login.LoginBehavior loginBehavior = this.loginBehavior;
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(loginConfig.getPermissions());
        com.facebook.login.DefaultAudience defaultAudience = this.defaultAudience;
        java.lang.String str2 = this.authType;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        com.facebook.login.LoginClient.Request request = new com.facebook.login.LoginClient.Request(loginBehavior, set, defaultAudience, str2, applicationId, uuid, this.loginTargetApp, loginConfig.getNonce(), loginConfig.getCodeVerifier(), str, codeChallengeMethod);
        request.setRerequest(com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    protected com.facebook.login.LoginClient.Request createLoginRequest(java.util.Collection<java.lang.String> permissions) {
        com.facebook.login.LoginBehavior loginBehavior = this.loginBehavior;
        java.util.Set set = permissions == null ? null : kotlin.collections.CollectionsKt.toSet(permissions);
        com.facebook.login.DefaultAudience defaultAudience = this.defaultAudience;
        java.lang.String str = this.authType;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        com.facebook.login.LoginClient.Request request = new com.facebook.login.LoginClient.Request(loginBehavior, set, defaultAudience, str, applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setRerequest(com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    protected com.facebook.login.LoginClient.Request createReauthorizeRequest() {
        com.facebook.login.LoginBehavior loginBehavior = com.facebook.login.LoginBehavior.DIALOG_ONLY;
        java.util.HashSet hashSet = new java.util.HashSet();
        com.facebook.login.DefaultAudience defaultAudience = this.defaultAudience;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        com.facebook.login.LoginClient.Request request = new com.facebook.login.LoginClient.Request(loginBehavior, hashSet, defaultAudience, "reauthorize", applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    private final void startLogin(com.facebook.login.StartActivityDelegate startActivityDelegate, com.facebook.login.LoginClient.Request request) throws com.facebook.FacebookException {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        com.facebook.internal.CallbackManagerImpl.INSTANCE.registerStaticCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda2
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, android.content.Intent intent) {
                boolean m5243startLogin$lambda1;
                m5243startLogin$lambda1 = com.facebook.login.LoginManager.m5243startLogin$lambda1(com.facebook.login.LoginManager.this, i, intent);
                return m5243startLogin$lambda1;
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        com.facebook.FacebookException facebookException = new com.facebook.FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), com.facebook.login.LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1, reason: not valid java name */
    public static final boolean m5243startLogin$lambda1(com.facebook.login.LoginManager this$0, int i, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return onActivityResult$default(this$0, i, intent, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(android.content.Context context, com.facebook.login.LoginClient.Request loginRequest) {
        com.facebook.login.LoginLogger logger = com.facebook.login.LoginManager.LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || loginRequest == null) {
            return;
        }
        logger.logStartLogin(loginRequest, loginRequest.getIsFamilyLogin() ? com.facebook.login.LoginLogger.EVENT_NAME_FOA_LOGIN_START : com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(android.content.Context context, com.facebook.login.LoginClient.Result.Code result, java.util.Map<java.lang.String, java.lang.String> resultExtras, java.lang.Exception exception, boolean wasLoginActivityTried, com.facebook.login.LoginClient.Request request) {
        java.lang.String str;
        com.facebook.login.LoginLogger logger = com.facebook.login.LoginManager.LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            com.facebook.login.LoginLogger.logUnexpectedError$default(logger, com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (wasLoginActivityTried) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(com.facebook.login.LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, str);
        logger.logCompleteLogin(request.getAuthId(), hashMap, result, resultExtras, exception, request.getIsFamilyLogin() ? com.facebook.login.LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    private final boolean tryFacebookActivity(com.facebook.login.StartActivityDelegate startActivityDelegate, com.facebook.login.LoginClient.Request request) {
        android.content.Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(facebookActivityIntent, com.facebook.login.LoginClient.INSTANCE.getLoginRequestCode());
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(android.content.Intent intent) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        return com.facebook.FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    protected android.content.Intent getFacebookActivityIntent(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.content.Intent intent = new android.content.Intent();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        intent.setClass(com.facebook.FacebookSdk.getApplicationContext(), com.facebook.FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(com.facebook.login.LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    private final void finishLogin(com.facebook.AccessToken newToken, com.facebook.AuthenticationToken newIdToken, com.facebook.login.LoginClient.Request origRequest, com.facebook.FacebookException exception, boolean isCanceled, com.facebook.FacebookCallback<com.facebook.login.LoginResult> callback) {
        if (newToken != null) {
            com.facebook.AccessToken.INSTANCE.setCurrentAccessToken(newToken);
            com.facebook.Profile.INSTANCE.fetchProfileForCurrentAccessToken();
        }
        if (newIdToken != null) {
            com.facebook.AuthenticationToken.INSTANCE.setCurrentAuthenticationToken(newIdToken);
        }
        if (callback != null) {
            com.facebook.login.LoginResult computeLoginResult = (newToken == null || origRequest == null) ? null : INSTANCE.computeLoginResult(origRequest, newToken, newIdToken);
            if (isCanceled || (computeLoginResult != null && computeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                callback.onCancel();
                return;
            }
            if (exception != null) {
                callback.onError(exception);
            } else {
                if (newToken == null || computeLoginResult == null) {
                    return;
                }
                setExpressLoginStatus(true);
                callback.onSuccess(computeLoginResult);
            }
        }
    }

    private final void retrieveLoginStatusImpl(android.content.Context context, final com.facebook.LoginStatusCallback responseCallback, long toastDurationMs) {
        android.content.Context context2;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        final java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        final java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        if (context == null) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            context2 = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            context2 = context;
        }
        final com.facebook.login.LoginLogger loginLogger = new com.facebook.login.LoginLogger(context2, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(uuid);
            responseCallback.onFailure();
            return;
        }
        com.facebook.login.LoginStatusClient.Companion companion = com.facebook.login.LoginStatusClient.INSTANCE;
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.login.LoginStatusClient newInstance$facebook_common_release = companion.newInstance$facebook_common_release(context, applicationId, uuid, com.facebook.FacebookSdk.getGraphApiVersion(), toastDurationMs, null);
        newInstance$facebook_common_release.setCompletedListener(new com.facebook.internal.PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.LoginManager$$ExternalSyntheticLambda1
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(android.os.Bundle bundle) {
                com.facebook.login.LoginManager.m5242retrieveLoginStatusImpl$lambda2(uuid, loginLogger, responseCallback, applicationId, bundle);
            }
        });
        loginLogger.logLoginStatusStart(uuid);
        if (newInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(uuid);
        responseCallback.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveLoginStatusImpl$lambda-2, reason: not valid java name */
    public static final void m5242retrieveLoginStatusImpl$lambda2(java.lang.String loggerRef, com.facebook.login.LoginLogger logger, com.facebook.LoginStatusCallback responseCallback, java.lang.String applicationId, android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerRef, "$loggerRef");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "$logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "$responseCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        if (bundle != null) {
            java.lang.String string = bundle.getString(com.facebook.internal.NativeProtocol.STATUS_ERROR_TYPE);
            java.lang.String string2 = bundle.getString(com.facebook.internal.NativeProtocol.STATUS_ERROR_DESCRIPTION);
            if (string == null) {
                java.lang.String string3 = bundle.getString(com.facebook.internal.NativeProtocol.EXTRA_ACCESS_TOKEN);
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                java.util.Date bundleLongAsDate = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.internal.NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new java.util.Date(0L));
                java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(com.facebook.internal.NativeProtocol.EXTRA_PERMISSIONS);
                java.lang.String string4 = bundle.getString(com.facebook.internal.NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
                java.lang.String string5 = bundle.getString("graph_domain");
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                java.util.Date bundleLongAsDate2 = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.internal.NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new java.util.Date(0L));
                java.lang.String str2 = string4;
                java.lang.String userIDFromSignedRequest = (str2 == null || str2.length() == 0) ? null : com.facebook.login.LoginMethodHandler.INSTANCE.getUserIDFromSignedRequest(string4);
                java.lang.String str3 = string3;
                if (str3 != null && str3.length() != 0 && (arrayList = stringArrayList) != null && !arrayList.isEmpty() && (str = userIDFromSignedRequest) != null && str.length() != 0) {
                    com.facebook.AccessToken accessToken = new com.facebook.AccessToken(string3, applicationId, userIDFromSignedRequest, arrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
                    com.facebook.AccessToken.INSTANCE.setCurrentAccessToken(accessToken);
                    com.facebook.Profile.INSTANCE.fetchProfileForCurrentAccessToken();
                    logger.logLoginStatusSuccess(loggerRef);
                    responseCallback.onCompleted(accessToken);
                    return;
                }
                logger.logLoginStatusFailure(loggerRef);
                responseCallback.onFailure();
                return;
            }
            INSTANCE.handleLoginStatusError(string, string2, loggerRef, logger, responseCallback);
            return;
        }
        logger.logLoginStatusFailure(loggerRef);
        responseCallback.onFailure();
    }

    private final void setExpressLoginStatus(boolean isExpressLoginAllowed) {
        android.content.SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(EXPRESS_LOGIN_ALLOWED, isExpressLoginAllowed);
        edit.apply();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/login/LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "callbackManager", "Lcom/facebook/CallbackManager;", "(Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/facebook/CallbackManager;)V", "activityContext", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements com.facebook.login.StartActivityDelegate {
        private final androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner;
        private final com.facebook.CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner, com.facebook.CallbackManager callbackManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
            this.activityResultRegistryOwner = activityResultRegistryOwner;
            this.callbackManager = callbackManager;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            final com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().register("facebook-login", new androidx.activity.result.contract.ActivityResultContract<android.content.Intent, android.util.Pair<java.lang.Integer, android.content.Intent>>() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // androidx.activity.result.contract.ActivityResultContract
                public android.content.Intent createIntent(android.content.Context context, android.content.Intent input) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
                    return input;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // androidx.activity.result.contract.ActivityResultContract
                public android.util.Pair<java.lang.Integer, android.content.Intent> parseResult(int resultCode, android.content.Intent intent2) {
                    android.util.Pair<java.lang.Integer, android.content.Intent> create = android.util.Pair.create(java.lang.Integer.valueOf(resultCode), intent2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
                    return create;
                }
            }, new androidx.activity.result.ActivityResultCallback() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.m5244startActivityForResult$lambda0(com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.this, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, (android.util.Pair) obj);
                }
            }));
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher == null) {
                return;
            }
            launcher.launch(intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: startActivityForResult$lambda-0, reason: not valid java name */
        public static final void m5244startActivityForResult$lambda0(com.facebook.login.LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate this$0, com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder launcherHolder, android.util.Pair pair) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
            com.facebook.CallbackManager callbackManager = this$0.callbackManager;
            int requestCode = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            java.lang.Object obj = pair.first;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "result.first");
            callbackManager.onActivityResult(requestCode, ((java.lang.Number) obj).intValue(), (android.content.Intent) pair.second);
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher = launcherHolder.getLauncher();
            if (launcher != null) {
                launcher.unregister();
            }
            launcherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public android.app.Activity getActivityContext() {
            java.lang.Object obj = this.activityResultRegistryOwner;
            if (obj instanceof android.app.Activity) {
                return (android.app.Activity) obj;
            }
            return null;
        }
    }

    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/LoginManager$ActivityStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityContext", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class ActivityStartActivityDelegate implements com.facebook.login.StartActivityDelegate {
        private final android.app.Activity activityContext;

        public ActivityStartActivityDelegate(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityContext = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public android.app.Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            getActivityContext().startActivityForResult(intent, requestCode);
        }
    }

    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/LoginManager$FragmentStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "fragment", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;)V", "activityContext", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class FragmentStartActivityDelegate implements com.facebook.login.StartActivityDelegate {
        private final android.app.Activity activityContext;
        private final com.facebook.internal.FragmentWrapper fragment;

        public FragmentStartActivityDelegate(com.facebook.internal.FragmentWrapper fragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.activityContext = fragment.getActivity();
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(android.content.Intent intent, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            this.fragment.startActivityForResult(intent, requestCode);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public android.app.Activity getActivityContext() {
            return this.activityContext;
        }
    }

    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/login/LoginManager$LoginLoggerHolder;", "", "()V", "logger", "Lcom/facebook/login/LoginLogger;", "getLogger", "context", "Landroid/content/Context;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class LoginLoggerHolder {
        public static final com.facebook.login.LoginManager.LoginLoggerHolder INSTANCE = new com.facebook.login.LoginManager.LoginLoggerHolder();
        private static com.facebook.login.LoginLogger logger;

        private LoginLoggerHolder() {
        }

        public final synchronized com.facebook.login.LoginLogger getLogger(android.content.Context context) {
            if (context == null) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                context = com.facebook.FacebookSdk.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            if (logger == null) {
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                logger = new com.facebook.login.LoginLogger(context, com.facebook.FacebookSdk.getApplicationId());
            }
            return logger;
        }
    }

    /* compiled from: LoginManager.kt */
    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0017J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, d2 = {"Lcom/facebook/login/LoginManager$Companion;", "", "()V", "EXPRESS_LOGIN_ALLOWED", "", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", com.ironsource.C3232q2.p, "Lcom/facebook/login/LoginManager;", "otherPublishPermissions", "getOtherPublishPermissions", "()Ljava/util/Set;", "computeLoginResult", "Lcom/facebook/login/LoginResult;", "request", "Lcom/facebook/login/LoginClient$Request;", "newToken", "Lcom/facebook/AccessToken;", "newIdToken", "Lcom/facebook/AuthenticationToken;", "getExtraDataFromIntent", "", "intent", "Landroid/content/Intent;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "handleLoginStatusError", "", "errorType", "errorDescription", "loggerRef", "logger", "Lcom/facebook/login/LoginLogger;", "responseCallback", "Lcom/facebook/LoginStatusCallback;", "isPublishPermission", "", "permission", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public com.facebook.login.LoginManager getInstance() {
            if (com.facebook.login.LoginManager.instance == null) {
                synchronized (this) {
                    com.facebook.login.LoginManager.Companion companion = com.facebook.login.LoginManager.INSTANCE;
                    com.facebook.login.LoginManager.instance = new com.facebook.login.LoginManager();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            com.facebook.login.LoginManager loginManager = com.facebook.login.LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.ironsource.C3232q2.p);
            throw null;
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Map<java.lang.String, java.lang.String> getExtraDataFromIntent(android.content.Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(com.facebook.login.LoginClient.Result.class.getClassLoader());
            com.facebook.login.LoginClient.Result result = (com.facebook.login.LoginClient.Result) intent.getParcelableExtra(com.facebook.login.LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isPublishPermission(java.lang.String permission) {
            if (permission != null) {
                return kotlin.text.StringsKt.startsWith$default(permission, com.facebook.login.LoginManager.PUBLISH_PERMISSION_PREFIX, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(permission, com.facebook.login.LoginManager.MANAGE_PERMISSION_PREFIX, false, 2, (java.lang.Object) null) || com.facebook.login.LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(permission);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Set<java.lang.String> getOtherPublishPermissions() {
            return kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ads_management", "create_event", "rsvp_event"});
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.login.LoginResult computeLoginResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken newToken, com.facebook.AuthenticationToken newIdToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newToken, "newToken");
            java.util.Set<java.lang.String> permissions = request.getPermissions();
            java.util.Set mutableSet = kotlin.collections.CollectionsKt.toMutableSet(kotlin.collections.CollectionsKt.filterNotNull(newToken.getPermissions()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(permissions);
            }
            java.util.Set mutableSet2 = kotlin.collections.CollectionsKt.toMutableSet(kotlin.collections.CollectionsKt.filterNotNull(permissions));
            mutableSet2.removeAll(mutableSet);
            return new com.facebook.login.LoginResult(newToken, newIdToken, mutableSet, mutableSet2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(java.lang.String errorType, java.lang.String errorDescription, java.lang.String loggerRef, com.facebook.login.LoginLogger logger, com.facebook.LoginStatusCallback responseCallback) {
            com.facebook.FacebookException facebookException = new com.facebook.FacebookException(errorType + ": " + ((java.lang.Object) errorDescription));
            logger.logLoginStatusError(loggerRef, facebookException);
            responseCallback.onError(facebookException);
        }
    }

    static {
        com.facebook.login.LoginManager.Companion companion = new com.facebook.login.LoginManager.Companion(null);
        INSTANCE = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        java.lang.String cls = com.facebook.login.LoginManager.class.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        TAG = cls;
    }
}
