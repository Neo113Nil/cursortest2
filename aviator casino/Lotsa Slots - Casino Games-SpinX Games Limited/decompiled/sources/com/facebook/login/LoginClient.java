package com.facebook.login;

/* compiled from: LoginClient.kt */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 q2\u00020\u0001:\u0005pqrstB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u0013J \u0010I\u001a\u00020F2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u0013H\u0002J\u0010\u0010J\u001a\u00020F2\b\u0010K\u001a\u0004\u0018\u00010@J\u0006\u0010L\u001a\u00020FJ\u0006\u0010M\u001a\u00020\u0013J\u000e\u0010N\u001a\u00020\u00192\u0006\u0010O\u001a\u00020\u001cJ\u000e\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020F2\u0006\u0010Q\u001a\u00020RJ\b\u0010T\u001a\u00020FH\u0002J\b\u0010U\u001a\u00020\u0019H\u0016J\b\u0010V\u001a\u0004\u0018\u00010'J\u001d\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010K\u001a\u00020@H\u0016¢\u0006\u0002\u0010WJ2\u0010X\u001a\u00020F2\u0006\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020R2\u0018\u00103\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010[H\u0002JF\u0010X\u001a\u00020F2\u0006\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c2\b\u0010\\\u001a\u0004\u0018\u00010\u001c2\b\u0010]\u001a\u0004\u0018\u00010\u001c2\u0018\u00103\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010[H\u0002J\u0006\u0010^\u001a\u00020FJ\u0006\u0010_\u001a\u00020FJ\u0010\u0010`\u001a\u00020F2\u0006\u0010Q\u001a\u00020RH\u0002J \u0010a\u001a\u00020\u00132\u0006\u0010b\u001a\u00020\u00192\u0006\u0010c\u001a\u00020\u00192\b\u0010d\u001a\u0004\u0018\u00010eJ\u0010\u0010f\u001a\u00020F2\u0006\u0010g\u001a\u00020\u0019H\u0004J\u0010\u0010h\u001a\u00020F2\b\u0010K\u001a\u0004\u0018\u00010@J\u0006\u0010i\u001a\u00020\u0013J\u0006\u0010j\u001a\u00020FJ\u000e\u0010k\u001a\u00020F2\u0006\u0010l\u001a\u00020RJ\u0018\u0010m\u001a\u00020F2\u0006\u0010n\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u0019H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0004R$\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R(\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u0010\u00106\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006u"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "backgroundProcessingListener", "Lcom/facebook/login/LoginClient$BackgroundProcessingListener;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$BackgroundProcessingListener;", "setBackgroundProcessingListener", "(Lcom/facebook/login/LoginClient$BackgroundProcessingListener;)V", "checkedInternetPermission", "", "getCheckedInternetPermission", "()Z", "setCheckedInternetPermission", "(Z)V", "currentHandler", "", "extraData", "", "", "getExtraData", "()Ljava/util/Map;", "setExtraData", "(Ljava/util/Map;)V", "value", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "handlersToTry", "", "Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "[Lcom/facebook/login/LoginMethodHandler;", "inProgress", "getInProgress", "logger", "Lcom/facebook/login/LoginLogger;", "getLogger", "()Lcom/facebook/login/LoginLogger;", "loggingExtras", "getLoggingExtras", "setLoggingExtras", "loginLogger", "numActivitiesReturned", "numTotalIntentsFired", "onCompletedListener", "Lcom/facebook/login/LoginClient$OnCompletedListener;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$OnCompletedListener;", "setOnCompletedListener", "(Lcom/facebook/login/LoginClient$OnCompletedListener;)V", "pendingRequest", "Lcom/facebook/login/LoginClient$Request;", "getPendingRequest", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "(Lcom/facebook/login/LoginClient$Request;)V", "addExtraData", "", com.ironsource.X3.i.W, "accumulate", "addLoggingExtra", "authorize", "request", "cancelCurrentHandler", "checkInternetPermission", "checkPermission", "permission", "complete", "outcome", "Lcom/facebook/login/LoginClient$Result;", "completeAndValidate", "completeWithFailure", "describeContents", "getCurrentHandler", "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", "logAuthorizationMethodComplete", "method", "result", "", "errorMessage", "errorCode", "notifyBackgroundProcessingStart", "notifyBackgroundProcessingStop", "notifyOnCompleteListener", "onActivityResult", "requestCode", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "setCurrentHandlerIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "startOrContinueAuth", "tryCurrentHandler", "tryNextHandler", "validateSameFbidAndFinish", "pendingResult", "writeToParcel", "dest", "flags", "BackgroundProcessingListener", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "OnCompletedListener", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginClient implements android.os.Parcelable {
    private com.facebook.login.LoginClient.BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    private java.util.Map<java.lang.String, java.lang.String> extraData;
    private androidx.fragment.app.Fragment fragment;
    private com.facebook.login.LoginMethodHandler[] handlersToTry;
    private java.util.Map<java.lang.String, java.lang.String> loggingExtras;
    private com.facebook.login.LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private com.facebook.login.LoginClient.OnCompletedListener onCompletedListener;
    private com.facebook.login.LoginClient.Request pendingRequest;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.LoginClient.Companion INSTANCE = new com.facebook.login.LoginClient.Companion(null);
    public static final android.os.Parcelable.Creator<com.facebook.login.LoginClient> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.LoginClient>() { // from class: com.facebook.login.LoginClient$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.LoginClient createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.LoginClient(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.LoginClient[] newArray(int size) {
            return new com.facebook.login.LoginClient[size];
        }
    };

    /* compiled from: LoginClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginClient$BackgroundProcessingListener;", "", "onBackgroundProcessingStarted", "", "onBackgroundProcessingStopped", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* compiled from: LoginClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/LoginClient$OnCompletedListener;", "", "onCompleted", "", "result", "Lcom/facebook/login/LoginClient$Result;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnCompletedListener {
        void onCompleted(com.facebook.login.LoginClient.Result result);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getE2E() {
        return INSTANCE.getE2E();
    }

    @kotlin.jvm.JvmStatic
    public static final int getLoginRequestCode() {
        return INSTANCE.getLoginRequestCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final com.facebook.login.LoginMethodHandler[] getHandlersToTry() {
        return this.handlersToTry;
    }

    public final void setHandlersToTry(com.facebook.login.LoginMethodHandler[] loginMethodHandlerArr) {
        this.handlersToTry = loginMethodHandlerArr;
    }

    public final androidx.fragment.app.Fragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(androidx.fragment.app.Fragment fragment) {
        if (this.fragment != null) {
            throw new com.facebook.FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final com.facebook.login.LoginClient.OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    public final void setOnCompletedListener(com.facebook.login.LoginClient.OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    public final com.facebook.login.LoginClient.BackgroundProcessingListener getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public final void setBackgroundProcessingListener(com.facebook.login.LoginClient.BackgroundProcessingListener backgroundProcessingListener) {
        this.backgroundProcessingListener = backgroundProcessingListener;
    }

    public final boolean getCheckedInternetPermission() {
        return this.checkedInternetPermission;
    }

    public final void setCheckedInternetPermission(boolean z) {
        this.checkedInternetPermission = z;
    }

    public final com.facebook.login.LoginClient.Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void setPendingRequest(com.facebook.login.LoginClient.Request request) {
        this.pendingRequest = request;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getLoggingExtras() {
        return this.loggingExtras;
    }

    public final void setLoggingExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this.loggingExtras = map;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtraData() {
        return this.extraData;
    }

    public final void setExtraData(java.util.Map<java.lang.String, java.lang.String> map) {
        this.extraData = map;
    }

    public LoginClient(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.currentHandler = -1;
        setFragment(fragment);
    }

    public final androidx.fragment.app.FragmentActivity getActivity() {
        androidx.fragment.app.Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final void startOrContinueAuth(com.facebook.login.LoginClient.Request request) {
        if (getInProgress()) {
            return;
        }
        authorize(request);
    }

    public final void authorize(com.facebook.login.LoginClient.Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new com.facebook.FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive() || checkInternetPermission()) {
            this.pendingRequest = request;
            this.handlersToTry = getHandlersToTry(request);
            tryNextHandler();
        }
    }

    public final boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final void cancelCurrentHandler() {
        com.facebook.login.LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return;
        }
        currentHandler.cancel();
    }

    public final com.facebook.login.LoginMethodHandler getCurrentHandler() {
        int i = this.currentHandler;
        if (i >= 0) {
            com.facebook.login.LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
            if (loginMethodHandlerArr == null) {
                return null;
            }
            return loginMethodHandlerArr[i];
        }
        return null;
    }

    protected final void setCurrentHandlerIndex(int index) {
        this.currentHandler = index;
    }

    public final boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(com.facebook.CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                tryNextHandler();
                return false;
            }
            com.facebook.login.LoginMethodHandler currentHandler = getCurrentHandler();
            if (currentHandler != null && (!currentHandler.shouldKeepTrackOfMultipleIntents() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return currentHandler.onActivityResult(requestCode, resultCode, data);
            }
        }
        return false;
    }

    public com.facebook.login.LoginMethodHandler[] getHandlersToTry(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.facebook.login.LoginBehavior loginBehavior = request.getLoginBehavior();
        if (request.isInstagramLogin()) {
            if (!com.facebook.FacebookSdk.bypassAppSwitch && loginBehavior.getAllowsInstagramAppAuth()) {
                arrayList.add(new com.facebook.login.InstagramAppLoginMethodHandler(this));
            }
        } else {
            if (loginBehavior.getAllowsGetTokenAuth()) {
                arrayList.add(new com.facebook.login.GetTokenLoginMethodHandler(this));
            }
            if (!com.facebook.FacebookSdk.bypassAppSwitch && loginBehavior.getAllowsKatanaAuth()) {
                arrayList.add(new com.facebook.login.KatanaProxyLoginMethodHandler(this));
            }
        }
        if (loginBehavior.getAllowsCustomTabAuth()) {
            arrayList.add(new com.facebook.login.CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsWebViewAuth()) {
            arrayList.add(new com.facebook.login.WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.getAllowsDeviceAuth()) {
            arrayList.add(new com.facebook.login.DeviceAuthMethodHandler(this));
        }
        java.lang.Object[] array = arrayList.toArray(new com.facebook.login.LoginMethodHandler[0]);
        if (array != null) {
            return (com.facebook.login.LoginMethodHandler[]) array;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            complete(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.pendingRequest, activity == null ? null : activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_title), activity != null ? activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_message) : null, null, 8, null));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    public final void tryNextHandler() {
        com.facebook.login.LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), com.facebook.login.LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, null, null, currentHandler.getMethodLoggingExtras());
        }
        com.facebook.login.LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i = this.currentHandler;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i + 1;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    private final void completeWithFailure() {
        complete(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    private final void addLoggingExtra(java.lang.String key, java.lang.String value, boolean accumulate) {
        java.util.HashMap hashMap = this.loggingExtras;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = hashMap;
        }
        if (hashMap.containsKey(key) && accumulate) {
            value = ((java.lang.Object) hashMap.get(key)) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + value;
        }
        hashMap.put(key, value);
    }

    public final void addExtraData(java.lang.String key, java.lang.String value, boolean accumulate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.HashMap hashMap = this.extraData;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        if (this.extraData == null) {
            this.extraData = hashMap;
        }
        if (hashMap.containsKey(key) && accumulate) {
            value = ((java.lang.Object) hashMap.get(key)) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + value;
        }
        hashMap.put(key, value);
    }

    public final boolean tryCurrentHandler() {
        com.facebook.login.LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.needsInternetPermission() && !checkInternetPermission()) {
            addLoggingExtra(com.facebook.login.LoginLogger.EVENT_EXTRAS_MISSING_INTERNET_PERMISSION, "1", false);
            return false;
        }
        com.facebook.login.LoginClient.Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int tryAuthorize = currentHandler.tryAuthorize(request);
        this.numActivitiesReturned = 0;
        if (tryAuthorize > 0) {
            getLogger().logAuthorizationMethodStart(request.getAuthId(), currentHandler.getNameForLogging(), request.getIsFamilyLogin() ? com.facebook.login.LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_START : com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_METHOD_START);
            this.numTotalIntentsFired = tryAuthorize;
        } else {
            getLogger().logAuthorizationMethodNotTried(request.getAuthId(), currentHandler.getNameForLogging(), request.getIsFamilyLogin() ? com.facebook.login.LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED : com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_METHOD_NOT_TRIED);
            addLoggingExtra(com.facebook.login.LoginLogger.EVENT_EXTRAS_NOT_TRIED, currentHandler.getNameForLogging(), true);
        }
        return tryAuthorize > 0;
    }

    public final void completeAndValidate(com.facebook.login.LoginClient.Result outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.token != null && com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
            validateSameFbidAndFinish(outcome);
        } else {
            complete(outcome);
        }
    }

    public final void complete(com.facebook.login.LoginClient.Result outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        com.facebook.login.LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), outcome, currentHandler.getMethodLoggingExtras());
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(outcome);
    }

    public final int checkPermission(java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "permission");
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            return -1;
        }
        return activity.checkCallingOrSelfPermission(permission);
    }

    public final void validateSameFbidAndFinish(com.facebook.login.LoginClient.Result pendingResult) {
        com.facebook.login.LoginClient.Result createCompositeTokenResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.token == null) {
            throw new com.facebook.FacebookException("Can't validate without a token");
        }
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
        com.facebook.AccessToken accessToken = pendingResult.token;
        if (currentAccessToken != null) {
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(currentAccessToken.getUserId(), accessToken.getUserId())) {
                    createCompositeTokenResult = com.facebook.login.LoginClient.Result.INSTANCE.createCompositeTokenResult(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                    complete(createCompositeTokenResult);
                }
            } catch (java.lang.Exception e) {
                complete(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.pendingRequest, "Caught exception", e.getMessage(), null, 8, null));
                return;
            }
        }
        createCompositeTokenResult = com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        complete(createCompositeTokenResult);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r2 == null ? null : r2.getApplicationId()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.facebook.login.LoginLogger getLogger() {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        java.lang.String applicationId;
        com.facebook.login.LoginLogger loginLogger = this.loginLogger;
        if (loginLogger != null) {
            java.lang.String applicationId2 = loginLogger.getApplicationId();
            com.facebook.login.LoginClient.Request request = this.pendingRequest;
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            fragmentActivity = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        com.facebook.login.LoginClient.Request request2 = this.pendingRequest;
        if (request2 == null) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            applicationId = com.facebook.FacebookSdk.getApplicationId();
        } else {
            applicationId = request2.getApplicationId();
        }
        loginLogger = new com.facebook.login.LoginLogger(fragmentActivity, applicationId);
        this.loginLogger = loginLogger;
        return loginLogger;
    }

    private final void notifyOnCompleteListener(com.facebook.login.LoginClient.Result outcome) {
        com.facebook.login.LoginClient.OnCompletedListener onCompletedListener = this.onCompletedListener;
        if (onCompletedListener == null) {
            return;
        }
        onCompletedListener.onCompleted(outcome);
    }

    public final void notifyBackgroundProcessingStart() {
        com.facebook.login.LoginClient.BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener == null) {
            return;
        }
        backgroundProcessingListener.onBackgroundProcessingStarted();
    }

    public final void notifyBackgroundProcessingStop() {
        com.facebook.login.LoginClient.BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener == null) {
            return;
        }
        backgroundProcessingListener.onBackgroundProcessingStopped();
    }

    private final void logAuthorizationMethodComplete(java.lang.String method, com.facebook.login.LoginClient.Result result, java.util.Map<java.lang.String, java.lang.String> loggingExtras) {
        logAuthorizationMethodComplete(method, result.code.getLoggingValue(), result.errorMessage, result.errorCode, loggingExtras);
    }

    private final void logAuthorizationMethodComplete(java.lang.String method, java.lang.String result, java.lang.String errorMessage, java.lang.String errorCode, java.util.Map<java.lang.String, java.lang.String> loggingExtras) {
        com.facebook.login.LoginClient.Request request = this.pendingRequest;
        java.lang.String str = com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE;
        if (request == null) {
            getLogger().logUnexpectedError(com.facebook.login.LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", method);
            return;
        }
        com.facebook.login.LoginLogger logger = getLogger();
        java.lang.String authId = request.getAuthId();
        if (request.getIsFamilyLogin()) {
            str = com.facebook.login.LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE;
        }
        logger.logAuthorizationMethodComplete(authId, method, result, errorMessage, errorCode, loggingExtras, str);
    }

    /* compiled from: LoginClient.kt */
    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u0001:\u0001KB{\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B\u000f\b\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010C\u001a\u00020DH\u0016J\u0006\u0010E\u001a\u00020+J\u000e\u0010F\u001a\u00020G2\u0006\u0010B\u001a\u00020+J\u0006\u0010B\u001a\u00020+J\u0018\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020DH\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001bR\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u001a\u00100\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R\u000e\u0010B\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "loginBehavior", "Lcom/facebook/login/LoginBehavior;", "permissions", "", "", "defaultAudience", "Lcom/facebook/login/DefaultAudience;", "authType", "applicationId", "authId", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "nonce", "codeVerifier", "codeChallenge", "codeChallengeMethod", "Lcom/facebook/login/CodeChallengeMethod;", "(Lcom/facebook/login/LoginBehavior;Ljava/util/Set;Lcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/LoginTargetApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/CodeChallengeMethod;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getAuthId", "setAuthId", "(Ljava/lang/String;)V", "getAuthType", "setAuthType", "getCodeChallenge", "getCodeChallengeMethod", "()Lcom/facebook/login/CodeChallengeMethod;", "getCodeVerifier", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "deviceAuthTargetUserId", "getDeviceAuthTargetUserId", "setDeviceAuthTargetUserId", "deviceRedirectUriString", "getDeviceRedirectUriString", "setDeviceRedirectUriString", "isFamilyLogin", "", "()Z", "setFamilyLogin", "(Z)V", "isInstagramLogin", "isRerequest", "setRerequest", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "loginTargetApp", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "messengerPageId", "getMessengerPageId", "setMessengerPageId", "getNonce", "getPermissions", "()Ljava/util/Set;", "setPermissions", "(Ljava/util/Set;)V", "resetMessengerState", "getResetMessengerState", "setResetMessengerState", "shouldSkipAccountDeduplication", "describeContents", "", "hasPublishPermission", "setShouldSkipAccountDeduplication", "", "writeToParcel", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Request implements android.os.Parcelable {
        private final java.lang.String applicationId;
        private java.lang.String authId;
        private java.lang.String authType;
        private final java.lang.String codeChallenge;
        private final com.facebook.login.CodeChallengeMethod codeChallengeMethod;
        private final java.lang.String codeVerifier;
        private final com.facebook.login.DefaultAudience defaultAudience;
        private java.lang.String deviceAuthTargetUserId;
        private java.lang.String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final com.facebook.login.LoginBehavior loginBehavior;
        private final com.facebook.login.LoginTargetApp loginTargetApp;
        private java.lang.String messengerPageId;
        private final java.lang.String nonce;
        private java.util.Set<java.lang.String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        public static final android.os.Parcelable.Creator<com.facebook.login.LoginClient.Request> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.LoginClient.Request>() { // from class: com.facebook.login.LoginClient$Request$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.LoginClient.Request createFromParcel(android.os.Parcel source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                return new com.facebook.login.LoginClient.Request(source, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.LoginClient.Request[] newArray(int size) {
                return new com.facebook.login.LoginClient.Request[size];
            }
        };

        public /* synthetic */ Request(android.os.Parcel parcel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set<java.lang.String> set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, null, null, null, null, null, 1984, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set<java.lang.String> set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId, com.facebook.login.LoginTargetApp loginTargetApp) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, null, null, null, null, 1920, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set<java.lang.String> set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId, com.facebook.login.LoginTargetApp loginTargetApp, java.lang.String str) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, null, null, null, 1792, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set<java.lang.String> set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId, com.facebook.login.LoginTargetApp loginTargetApp, java.lang.String str, java.lang.String str2) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, null, null, 1536, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set<java.lang.String> set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId, com.facebook.login.LoginTargetApp loginTargetApp, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, str3, null, 1024, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final com.facebook.login.LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final java.util.Set<java.lang.String> getPermissions() {
            return this.permissions;
        }

        public final void setPermissions(java.util.Set<java.lang.String> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.permissions = set;
        }

        public final com.facebook.login.DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final java.lang.String getApplicationId() {
            return this.applicationId;
        }

        public final java.lang.String getAuthId() {
            return this.authId;
        }

        public final void setAuthId(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authId = str;
        }

        /* renamed from: isRerequest, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        public final void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        public final java.lang.String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final void setDeviceRedirectUriString(java.lang.String str) {
            this.deviceRedirectUriString = str;
        }

        public final java.lang.String getAuthType() {
            return this.authType;
        }

        public final void setAuthType(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authType = str;
        }

        public final java.lang.String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final void setDeviceAuthTargetUserId(java.lang.String str) {
            this.deviceAuthTargetUserId = str;
        }

        public final java.lang.String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final void setMessengerPageId(java.lang.String str) {
            this.messengerPageId = str;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final com.facebook.login.LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        /* renamed from: isFamilyLogin, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final void setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final java.lang.String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final com.facebook.login.CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public /* synthetic */ Request(com.facebook.login.LoginBehavior loginBehavior, java.util.Set set, com.facebook.login.DefaultAudience defaultAudience, java.lang.String str, java.lang.String str2, java.lang.String str3, com.facebook.login.LoginTargetApp loginTargetApp, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.facebook.login.CodeChallengeMethod codeChallengeMethod, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, (i & 64) != 0 ? com.facebook.login.LoginTargetApp.FACEBOOK : loginTargetApp, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : codeChallengeMethod);
        }

        public Request(com.facebook.login.LoginBehavior loginBehavior, java.util.HashSet hashSet, com.facebook.login.DefaultAudience defaultAudience, java.lang.String authType, java.lang.String applicationId, java.lang.String authId, com.facebook.login.LoginTargetApp loginTargetApp, java.lang.String str, java.lang.String str2, java.lang.String str3, com.facebook.login.CodeChallengeMethod codeChallengeMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = hashSet == null ? new java.util.HashSet() : hashSet;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.authId = authId;
            this.loginTargetApp = loginTargetApp == null ? com.facebook.login.LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str == null || str.length() == 0) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                this.nonce = uuid;
            } else {
                this.nonce = str;
            }
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        /* renamed from: shouldSkipAccountDeduplication, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public final void setShouldSkipAccountDeduplication(boolean shouldSkipAccountDeduplication) {
            this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        }

        public final boolean hasPublishPermission() {
            java.util.Iterator<java.lang.String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (com.facebook.login.LoginManager.Companion.isPublishPermission(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isInstagramLogin() {
            return this.loginTargetApp == com.facebook.login.LoginTargetApp.INSTAGRAM;
        }

        private Request(android.os.Parcel parcel) {
            com.facebook.login.DefaultAudience defaultAudience;
            com.facebook.login.LoginTargetApp loginTargetApp;
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            this.loginBehavior = com.facebook.login.LoginBehavior.valueOf(com.facebook.internal.Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new java.util.HashSet(arrayList);
            java.lang.String readString = parcel.readString();
            if (readString != null) {
                defaultAudience = com.facebook.login.DefaultAudience.valueOf(readString);
            } else {
                defaultAudience = com.facebook.login.DefaultAudience.NONE;
            }
            this.defaultAudience = defaultAudience;
            com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
            this.applicationId = com.facebook.internal.Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
            this.authId = com.facebook.internal.Validate.notNullOrEmpty(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            com.facebook.internal.Validate validate4 = com.facebook.internal.Validate.INSTANCE;
            this.authType = com.facebook.internal.Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            java.lang.String readString2 = parcel.readString();
            if (readString2 != null) {
                loginTargetApp = com.facebook.login.LoginTargetApp.valueOf(readString2);
            } else {
                loginTargetApp = com.facebook.login.LoginTargetApp.FACEBOOK;
            }
            this.loginTargetApp = loginTargetApp;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            com.facebook.internal.Validate validate5 = com.facebook.internal.Validate.INSTANCE;
            this.nonce = com.facebook.internal.Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            java.lang.String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 == null ? null : com.facebook.login.CodeChallengeMethod.valueOf(readString3);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new java.util.ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            com.facebook.login.CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            dest.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }
    }

    /* compiled from: LoginClient.kt */
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB7\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bBA\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fB\u000f\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "request", "Lcom/facebook/login/LoginClient$Request;", "code", "Lcom/facebook/login/LoginClient$Result$Code;", "token", "Lcom/facebook/AccessToken;", "errorMessage", "", "errorCode", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "authenticationToken", "Lcom/facebook/AuthenticationToken;", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "extraData", "", "loggingExtras", "describeContents", "", "writeToParcel", "", "dest", "flags", "Code", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Result implements android.os.Parcelable {
        public final com.facebook.AuthenticationToken authenticationToken;
        public final com.facebook.login.LoginClient.Result.Code code;
        public final java.lang.String errorCode;
        public final java.lang.String errorMessage;
        public java.util.Map<java.lang.String, java.lang.String> extraData;
        public java.util.Map<java.lang.String, java.lang.String> loggingExtras;
        public final com.facebook.login.LoginClient.Request request;
        public final com.facebook.AccessToken token;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.login.LoginClient.Result.Companion INSTANCE = new com.facebook.login.LoginClient.Result.Companion(null);
        public static final android.os.Parcelable.Creator<com.facebook.login.LoginClient.Result> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.LoginClient.Result>() { // from class: com.facebook.login.LoginClient$Result$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.LoginClient.Result createFromParcel(android.os.Parcel source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                return new com.facebook.login.LoginClient.Result(source, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.LoginClient.Result[] newArray(int size) {
                return new com.facebook.login.LoginClient.Result[size];
            }
        };

        public /* synthetic */ Result(android.os.Parcel parcel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.login.LoginClient.Result createCancelResult(com.facebook.login.LoginClient.Request request, java.lang.String str) {
            return INSTANCE.createCancelResult(request, str);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.login.LoginClient.Result createCompositeTokenResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken) {
            return INSTANCE.createCompositeTokenResult(request, accessToken, authenticationToken);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.login.LoginClient.Result createErrorResult(com.facebook.login.LoginClient.Request request, java.lang.String str, java.lang.String str2) {
            return INSTANCE.createErrorResult(request, str, str2);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.login.LoginClient.Result createErrorResult(com.facebook.login.LoginClient.Request request, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return INSTANCE.createErrorResult(request, str, str2, str3);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.login.LoginClient.Result createTokenResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken accessToken) {
            return INSTANCE.createTokenResult(request, accessToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: LoginClient.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final java.lang.String loggingValue;

            Code(java.lang.String str) {
                this.loggingValue = str;
            }

            public final java.lang.String getLoggingValue() {
                return this.loggingValue;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static com.facebook.login.LoginClient.Result.Code[] valuesCustom() {
                com.facebook.login.LoginClient.Result.Code[] valuesCustom = values();
                return (com.facebook.login.LoginClient.Result.Code[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(com.facebook.login.LoginClient.Request request, com.facebook.login.LoginClient.Result.Code code, com.facebook.AccessToken accessToken, java.lang.String str, java.lang.String str2) {
            this(request, code, accessToken, null, str, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        }

        public Result(com.facebook.login.LoginClient.Request request, com.facebook.login.LoginClient.Result.Code code, com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        private Result(android.os.Parcel parcel) {
            java.lang.String readString = parcel.readString();
            this.code = com.facebook.login.LoginClient.Result.Code.valueOf(readString == null ? "error" : readString);
            this.token = (com.facebook.AccessToken) parcel.readParcelable(com.facebook.AccessToken.class.getClassLoader());
            this.authenticationToken = (com.facebook.AuthenticationToken) parcel.readParcelable(com.facebook.AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (com.facebook.login.LoginClient.Request) parcel.readParcelable(com.facebook.login.LoginClient.Request.class.getClassLoader());
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            this.loggingExtras = com.facebook.internal.Utility.readNonnullStringMapFromParcel(parcel);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            this.extraData = com.facebook.internal.Utility.readNonnullStringMapFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, flags);
            dest.writeParcelable(this.authenticationToken, flags);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, flags);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.writeNonnullStringMapToParcel(dest, this.extraData);
        }

        /* compiled from: LoginClient.kt */
        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J&\u0010\u000b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J2\u0010\u0010\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\rH\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/login/LoginClient$Result$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Result;", "createCancelResult", "request", "Lcom/facebook/login/LoginClient$Request;", "message", "", "createCompositeTokenResult", "accessToken", "Lcom/facebook/AccessToken;", "authenticationToken", "Lcom/facebook/AuthenticationToken;", "createErrorResult", "errorType", "errorDescription", "errorCode", "createTokenResult", "token", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.login.LoginClient.Result createErrorResult(com.facebook.login.LoginClient.Request request, java.lang.String str, java.lang.String str2) {
                return createErrorResult$default(this, request, str, str2, null, 8, null);
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.login.LoginClient.Result createTokenResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken token) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
                return new com.facebook.login.LoginClient.Result(request, com.facebook.login.LoginClient.Result.Code.SUCCESS, token, null, null);
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.login.LoginClient.Result createCompositeTokenResult(com.facebook.login.LoginClient.Request request, com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken) {
                return new com.facebook.login.LoginClient.Result(request, com.facebook.login.LoginClient.Result.Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.login.LoginClient.Result createCancelResult(com.facebook.login.LoginClient.Request request, java.lang.String message) {
                return new com.facebook.login.LoginClient.Result(request, com.facebook.login.LoginClient.Result.Code.CANCEL, null, message, null);
            }

            public static /* synthetic */ com.facebook.login.LoginClient.Result createErrorResult$default(com.facebook.login.LoginClient.Result.Companion companion, com.facebook.login.LoginClient.Request request, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.login.LoginClient.Result createErrorResult(com.facebook.login.LoginClient.Request request, java.lang.String errorType, java.lang.String errorDescription, java.lang.String errorCode) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (errorType != null) {
                    arrayList.add(errorType);
                }
                if (errorDescription != null) {
                    arrayList.add(errorDescription);
                }
                return new com.facebook.login.LoginClient.Result(request, com.facebook.login.LoginClient.Result.Code.ERROR, null, android.text.TextUtils.join(": ", arrayList), errorCode);
            }
        }
    }

    public LoginClient(android.os.Parcel source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.currentHandler = -1;
        android.os.Parcelable[] readParcelableArray = source.readParcelableArray(com.facebook.login.LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new android.os.Parcelable[0] : readParcelableArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            android.os.Parcelable parcelable = readParcelableArray[i];
            com.facebook.login.LoginMethodHandler loginMethodHandler = parcelable instanceof com.facebook.login.LoginMethodHandler ? (com.facebook.login.LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.setLoginClient(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        java.lang.Object[] array = arrayList.toArray(new com.facebook.login.LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (com.facebook.login.LoginMethodHandler[]) array;
            this.currentHandler = source.readInt();
            this.pendingRequest = (com.facebook.login.LoginClient.Request) source.readParcelable(com.facebook.login.LoginClient.Request.class.getClassLoader());
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Map<java.lang.String, java.lang.String> readNonnullStringMapFromParcel = com.facebook.internal.Utility.readNonnullStringMapFromParcel(source);
            this.loggingExtras = readNonnullStringMapFromParcel == null ? null : kotlin.collections.MapsKt.toMutableMap(readNonnullStringMapFromParcel);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            java.util.Map<java.lang.String, java.lang.String> readNonnullStringMapFromParcel2 = com.facebook.internal.Utility.readNonnullStringMapFromParcel(source);
            this.extraData = readNonnullStringMapFromParcel2 != null ? kotlin.collections.MapsKt.toMutableMap(readNonnullStringMapFromParcel2) : null;
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, flags);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, flags);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.writeNonnullStringMapToParcel(dest, this.extraData);
    }

    /* compiled from: LoginClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/login/LoginClient$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "getE2E", "", "getLoginRequestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final int getLoginRequestCode() {
            return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getE2E() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.ironsource.X3.a.f, java.lang.System.currentTimeMillis());
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }
    }
}
