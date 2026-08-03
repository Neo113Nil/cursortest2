package com.facebook.internal;

/* compiled from: WebDialog.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\f\b\u0016\u0018\u0000 N2\u00020\u0001:\u0006MNOPQRB\u0017\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB=\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0016J(\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0002J\b\u00106\u001a\u00020-H\u0016J\u0012\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u00010\fH\u0014J\b\u00109\u001a\u00020-H\u0016J\u0018\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020-H\u0014J\b\u0010?\u001a\u00020-H\u0014J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020+H\u0016J\u0012\u0010B\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0005H\u0017J\u0006\u0010D\u001a\u00020-J\u0012\u0010E\u001a\u00020-2\b\u0010F\u001a\u0004\u0018\u00010GH\u0004J\u0012\u0010H\u001a\u00020-2\b\u0010I\u001a\u0004\u0018\u00010\fH\u0004J\u0010\u0010J\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0005H\u0004J\u0010\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020\bH\u0003R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0018\u00010%R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0019\u001a\u0004\u0018\u00010&@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/facebook/internal/WebDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "url", "", "(Landroid/content/Context;Ljava/lang/String;)V", "theme", "", "(Landroid/content/Context;Ljava/lang/String;I)V", "action", "parameters", "Landroid/os/Bundle;", "targetApp", "Lcom/facebook/login/LoginTargetApp;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "contentFrameLayout", "Landroid/widget/FrameLayout;", "crossImageView", "Landroid/widget/ImageView;", "expectedRedirectUrl", "isDetached", "", "<set-?>", "isListenerCalled", "()Z", "isPageFinished", "onCompleteListener", "getOnCompleteListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "setOnCompleteListener", "(Lcom/facebook/internal/WebDialog$OnCompleteListener;)V", "spinner", "Landroid/app/ProgressDialog;", "uploadTask", "Lcom/facebook/internal/WebDialog$UploadStagingResourcesTask;", "Landroid/webkit/WebView;", "webView", "getWebView", "()Landroid/webkit/WebView;", "windowParams", "Landroid/view/WindowManager$LayoutParams;", "cancel", "", "createCrossImage", "dismiss", "getScaledSize", "screenSize", "density", "", "noPaddingSize", "maxPaddingSize", "onAttachedToWindow", "onCreate", "savedInstanceState", "onDetachedFromWindow", "onKeyDown", "keyCode", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onStart", "onStop", "onWindowAttributesChanged", "params", "parseResponseUri", "urlString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "sendErrorToListener", "error", "", "sendSuccessToListener", "values", "setExpectedRedirectUrl", "setUpWebView", com.helpshift.proactive.InAppViewConstants.MARGIN, "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "DialogWebViewClient", "InitCallback", "OnCompleteListener", "UploadStagingResourcesTask", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class WebDialog extends android.app.Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.WebDialog.Companion INSTANCE = new com.facebook.internal.WebDialog.Companion(null);
    private static final int DEFAULT_THEME = com.facebook.common.R.style.com_facebook_activity_theme;
    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final java.lang.String DISPLAY_TOUCH = "touch";
    private static final java.lang.String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    private static final java.lang.String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    private static com.facebook.internal.WebDialog.InitCallback initCallback;
    private static volatile int webDialogTheme;
    private android.widget.FrameLayout contentFrameLayout;
    private android.widget.ImageView crossImageView;
    private java.lang.String expectedRedirectUrl;
    private boolean isDetached;
    private boolean isListenerCalled;
    private boolean isPageFinished;
    private com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener;
    private android.app.ProgressDialog spinner;
    private com.facebook.internal.WebDialog.UploadStagingResourcesTask uploadTask;
    private java.lang.String url;
    private android.webkit.WebView webView;
    private android.view.WindowManager.LayoutParams windowParams;

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/WebDialog$InitCallback;", "", "onInit", "", "webView", "Landroid/webkit/WebView;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface InitCallback {
        void onInit(android.webkit.WebView webView);
    }

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/WebDialog$OnCompleteListener;", "", "onComplete", "", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnCompleteListener {
        void onComplete(android.os.Bundle values, com.facebook.FacebookException error);
    }

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.LoginTargetApp.valuesCustom().length];
            iArr[com.facebook.login.LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ WebDialog(android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, com.facebook.login.LoginTargetApp loginTargetApp, com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    private final int getScaledSize(int screenSize, float density, int noPaddingSize, int maxPaddingSize) {
        int i = (int) (screenSize / density);
        return (int) (screenSize * (i <= noPaddingSize ? 1.0d : i >= maxPaddingSize ? 0.5d : (((maxPaddingSize - i) / (maxPaddingSize - noPaddingSize)) * 0.5d) + 0.5d));
    }

    @kotlin.jvm.JvmStatic
    public static final int getWebDialogTheme() {
        return INSTANCE.getWebDialogTheme();
    }

    @kotlin.jvm.JvmStatic
    protected static final void initDefaultTheme(android.content.Context context) {
        INSTANCE.initDefaultTheme(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.WebDialog newInstance(android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener) {
        return INSTANCE.newInstance(context, str, bundle, i, onCompleteListener);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.WebDialog newInstance(android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, com.facebook.login.LoginTargetApp loginTargetApp, com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener) {
        return INSTANCE.newInstance(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    @kotlin.jvm.JvmStatic
    public static final void setInitCallback(com.facebook.internal.WebDialog.InitCallback initCallback2) {
        INSTANCE.setInitCallback(initCallback2);
    }

    @kotlin.jvm.JvmStatic
    public static final void setWebDialogTheme(int i) {
        INSTANCE.setWebDialogTheme(i);
    }

    public final com.facebook.internal.WebDialog.OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    public final void setOnCompleteListener(com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    protected final android.webkit.WebView getWebView() {
        return this.webView;
    }

    /* renamed from: isListenerCalled, reason: from getter */
    protected final boolean getIsListenerCalled() {
        return this.isListenerCalled;
    }

    /* renamed from: isPageFinished, reason: from getter */
    protected final boolean getIsPageFinished() {
        return this.isPageFinished;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected WebDialog(android.content.Context context, java.lang.String url) {
        this(context, url, INSTANCE.getWebDialogTheme());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
    }

    private WebDialog(android.content.Context context, java.lang.String str, int i) {
        super(context, i == 0 ? INSTANCE.getWebDialogTheme() : i);
        this.expectedRedirectUrl = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_URI;
        this.url = str;
    }

    private WebDialog(android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, com.facebook.login.LoginTargetApp loginTargetApp, com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener) {
        super(context, i == 0 ? INSTANCE.getWebDialogTheme() : i);
        android.net.Uri buildUri;
        java.lang.String str2 = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_URI;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        str2 = com.facebook.internal.Utility.isChromeOS(context) ? com.facebook.internal.ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("display", "touch");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        bundle.putString("client_id", com.facebook.FacebookSdk.getApplicationId());
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.util.Locale locale = java.util.Locale.ROOT;
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String format = java.lang.String.format(locale, "android-%s", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getSdkVersion()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.onCompleteListener = onCompleteListener;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.uploadTask = new com.facebook.internal.WebDialog.UploadStagingResourcesTask(this, str, bundle);
            return;
        }
        if (com.facebook.internal.WebDialog.WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            buildUri = com.facebook.internal.Utility.buildUri(com.facebook.internal.ServerProtocol.getInstagramDialogAuthority(), com.facebook.internal.ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
        } else {
            com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol2 = com.facebook.internal.ServerProtocol.INSTANCE;
            java.lang.String dialogAuthority = com.facebook.internal.ServerProtocol.getDialogAuthority();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
            sb.append(com.facebook.FacebookSdk.getGraphApiVersion());
            sb.append("/dialog/");
            sb.append((java.lang.Object) str);
            buildUri = com.facebook.internal.Utility.buildUri(dialogAuthority, sb.toString(), bundle);
        }
        this.url = buildUri.toString();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4) {
            android.webkit.WebView webView = this.webView;
            if (webView != null) {
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (webView == null ? null : java.lang.Boolean.valueOf(webView.canGoBack())), (java.lang.Object) true)) {
                    android.webkit.WebView webView2 = this.webView;
                    if (webView2 != null) {
                        webView2.goBack();
                    }
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        android.app.ProgressDialog progressDialog;
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        com.facebook.internal.WebDialog.UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            if ((uploadStagingResourcesTask == null ? null : uploadStagingResourcesTask.getStatus()) == android.os.AsyncTask.Status.PENDING) {
                com.facebook.internal.WebDialog.UploadStagingResourcesTask uploadStagingResourcesTask2 = this.uploadTask;
                if (uploadStagingResourcesTask2 != null) {
                    uploadStagingResourcesTask2.execute(new java.lang.Void[0]);
                }
                android.app.ProgressDialog progressDialog = this.spinner;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        resize();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        com.facebook.internal.WebDialog.UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            uploadStagingResourcesTask.cancel(true);
            android.app.ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        android.view.WindowManager.LayoutParams layoutParams;
        android.view.WindowManager.LayoutParams attributes;
        this.isDetached = false;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        if (com.facebook.internal.Utility.mustFixWindowParamsForAutofill(context) && (layoutParams = this.windowParams) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                android.view.WindowManager.LayoutParams layoutParams2 = this.windowParams;
                if (layoutParams2 != null) {
                    android.app.Activity ownerActivity = getOwnerActivity();
                    android.view.Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams2.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                android.view.WindowManager.LayoutParams layoutParams3 = this.windowParams;
                com.facebook.internal.Utility.logd(LOG_TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Set token on onAttachedToWindow(): ", layoutParams3 != null ? layoutParams3.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.windowParams = params;
        }
        super.onWindowAttributesChanged(params);
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        android.app.ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.R.string.com_facebook_loading));
        }
        android.app.ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        android.app.ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.facebook.internal.WebDialog$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(android.content.DialogInterface dialogInterface) {
                    com.facebook.internal.WebDialog.m5200onCreate$lambda4(com.facebook.internal.WebDialog.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new android.widget.FrameLayout(getContext());
        resize();
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        createCrossImage();
        if (this.url != null) {
            android.widget.ImageView imageView = this.crossImageView;
            if (imageView == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        android.widget.FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new android.view.ViewGroup.LayoutParams(-2, -2));
        }
        android.widget.FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-4, reason: not valid java name */
    public static final void m5200onCreate$lambda4(com.facebook.internal.WebDialog this$0, android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    protected final void setExpectedRedirectUrl(java.lang.String expectedRedirectUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.expectedRedirectUrl = expectedRedirectUrl;
    }

    public android.os.Bundle parseResponseUri(java.lang.String urlString) {
        android.net.Uri parse = android.net.Uri.parse(urlString);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        android.os.Bundle parseUrlQueryString = com.facebook.internal.Utility.parseUrlQueryString(parse.getQuery());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        parseUrlQueryString.putAll(com.facebook.internal.Utility.parseUrlQueryString(parse.getFragment()));
        return parseUrlQueryString;
    }

    public final void resize() {
        java.lang.Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
        int min = java.lang.Math.min(getScaledSize(i, displayMetrics.density, NO_PADDING_SCREEN_WIDTH, 800), displayMetrics.widthPixels);
        int min2 = java.lang.Math.min(getScaledSize(i2, displayMetrics.density, 800, MAX_PADDING_SCREEN_HEIGHT), displayMetrics.heightPixels);
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    protected final void sendSuccessToListener(android.os.Bundle values) {
        com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(values, null);
        }
        dismiss();
    }

    protected final void sendErrorToListener(java.lang.Throwable error) {
        com.facebook.FacebookException facebookException;
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        if (error instanceof com.facebook.FacebookException) {
            facebookException = (com.facebook.FacebookException) error;
        } else {
            facebookException = new com.facebook.FacebookException(error);
        }
        com.facebook.internal.WebDialog.OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(null, facebookException);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        sendErrorToListener(new com.facebook.FacebookOperationCanceledException());
    }

    private final void createCrossImage() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.internal.WebDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.internal.WebDialog.m5199createCrossImage$lambda5(com.facebook.internal.WebDialog.this, view);
            }
        });
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.R.drawable.com_facebook_close);
        android.widget.ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        android.widget.ImageView imageView3 = this.crossImageView;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCrossImage$lambda-5, reason: not valid java name */
    public static final void m5199createCrossImage$lambda5(com.facebook.internal.WebDialog this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpWebView(int margin) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        final android.content.Context context = getContext();
        this.webView = new android.webkit.WebView(context) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean hasWindowFocus) {
                try {
                    super.onWindowFocusChanged(hasWindowFocus);
                } catch (java.lang.NullPointerException unused) {
                }
            }
        };
        com.facebook.internal.WebDialog.InitCallback initCallback2 = initCallback;
        if (initCallback2 != null) {
            initCallback2.onInit(getWebView());
        }
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        android.webkit.WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        android.webkit.WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setWebViewClient(new com.facebook.internal.WebDialog.DialogWebViewClient(this));
        }
        android.webkit.WebView webView4 = this.webView;
        android.webkit.WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        android.webkit.WebView webView5 = this.webView;
        if (webView5 != null) {
            java.lang.String str = this.url;
            if (str == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        android.webkit.WebView webView6 = this.webView;
        if (webView6 != null) {
            webView6.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        android.webkit.WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        android.webkit.WebView webView8 = this.webView;
        android.webkit.WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        android.webkit.WebView webView9 = this.webView;
        android.webkit.WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        android.webkit.WebView webView10 = this.webView;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        android.webkit.WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        android.webkit.WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facebook.internal.WebDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    boolean m5201setUpWebView$lambda7;
                    m5201setUpWebView$lambda7 = com.facebook.internal.WebDialog.m5201setUpWebView$lambda7(view, motionEvent);
                    return m5201setUpWebView$lambda7;
                }
            });
        }
        linearLayout.setPadding(margin, margin, margin, margin);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        android.widget.FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpWebView$lambda-7, reason: not valid java name */
    public static final boolean m5201setUpWebView$lambda7(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/WebDialog$DialogWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/facebook/internal/WebDialog;)V", "onPageFinished", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "errorCode", "", "description", "failingUrl", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "shouldOverrideUrlLoading", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class DialogWebViewClient extends android.webkit.WebViewClient {
        final /* synthetic */ com.facebook.internal.WebDialog this$0;

        public DialogWebViewClient(com.facebook.internal.WebDialog this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.logd(com.facebook.internal.WebDialog.LOG_TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Redirect URL: ", url));
            android.net.Uri parse = android.net.Uri.parse(url);
            boolean z = parse.getPath() != null && java.util.regex.Pattern.matches(com.facebook.internal.WebDialog.PLATFORM_DIALOG_PATH_REGEX, parse.getPath());
            if (kotlin.text.StringsKt.startsWith$default(url, this.this$0.expectedRedirectUrl, false, 2, (java.lang.Object) null)) {
                android.os.Bundle parseResponseUri = this.this$0.parseResponseUri(url);
                java.lang.String string = parseResponseUri.getString("error");
                if (string == null) {
                    string = parseResponseUri.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_TYPE);
                }
                java.lang.String string2 = parseResponseUri.getString("error_msg");
                if (string2 == null) {
                    string2 = parseResponseUri.getString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
                }
                if (string2 == null) {
                    string2 = parseResponseUri.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
                }
                java.lang.String string3 = parseResponseUri.getString(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE);
                if (string3 != null) {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(string3)) {
                        try {
                            i = java.lang.Integer.parseInt(string3);
                        } catch (java.lang.NumberFormatException unused) {
                        }
                        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                        if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                            com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                            if (com.facebook.internal.Utility.isNullOrEmpty(string2) && i == -1) {
                                this.this$0.sendSuccessToListener(parseResponseUri);
                                return true;
                            }
                        }
                        if (string == null && (kotlin.jvm.internal.Intrinsics.areEqual(string, "access_denied") || kotlin.jvm.internal.Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                            this.this$0.cancel();
                        } else if (i != com.facebook.internal.WebDialog.API_EC_DIALOG_CANCEL) {
                            this.this$0.cancel();
                        } else {
                            this.this$0.sendErrorToListener(new com.facebook.FacebookServiceException(new com.facebook.FacebookRequestError(i, string, string2), string2));
                        }
                        return true;
                    }
                }
                i = -1;
                com.facebook.internal.Utility utility32 = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                }
                if (string == null) {
                }
                if (i != com.facebook.internal.WebDialog.API_EC_DIALOG_CANCEL) {
                }
                return true;
            }
            if (kotlin.text.StringsKt.startsWith$default(url, com.facebook.internal.ServerProtocol.DIALOG_CANCEL_URI, false, 2, (java.lang.Object) null)) {
                this.this$0.cancel();
                return true;
            }
            if (z || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) url, (java.lang.CharSequence) "touch", false, 2, (java.lang.Object) null)) {
                return false;
            }
            try {
                this.this$0.getContext().startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url)));
                return true;
            } catch (android.content.ActivityNotFoundException unused2) {
                return false;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, errorCode, description, failingUrl);
            this.this$0.sendErrorToListener(new com.facebook.FacebookDialogException(description, errorCode, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.this$0.sendErrorToListener(new com.facebook.FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
            android.app.ProgressDialog progressDialog;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.logd(com.facebook.internal.WebDialog.LOG_TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Webview loading URL: ", url));
            super.onPageStarted(view, url, favicon);
            if (this.this$0.isDetached || (progressDialog = this.this$0.spinner) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
            android.app.ProgressDialog progressDialog;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!this.this$0.isDetached && (progressDialog = this.this$0.spinner) != null) {
                progressDialog.dismiss();
            }
            android.widget.FrameLayout frameLayout = this.this$0.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            android.webkit.WebView webView = this.this$0.getWebView();
            if (webView != null) {
                webView.setVisibility(0);
            }
            android.widget.ImageView imageView = this.this$0.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.this$0.isPageFinished = true;
        }
    }

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/facebook/internal/WebDialog$Builder;", "", "context", "Landroid/content/Context;", "action", "", "parameters", "Landroid/os/Bundle;", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "applicationId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "accessToken", "Lcom/facebook/AccessToken;", "<set-?>", "getApplicationId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "Lcom/facebook/internal/WebDialog$OnCompleteListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener", "()Lcom/facebook/internal/WebDialog$OnCompleteListener;", "getParameters", "()Landroid/os/Bundle;", "", "theme", "getTheme", "()I", "build", "Lcom/facebook/internal/WebDialog;", "finishInit", "", "setOnCompleteListener", "setTheme", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class Builder {
        private com.facebook.AccessToken accessToken;
        private java.lang.String action;
        private java.lang.String applicationId;
        private android.content.Context context;
        private com.facebook.internal.WebDialog.OnCompleteListener listener;
        private android.os.Bundle parameters;
        private int theme;

        public final android.content.Context getContext() {
            return this.context;
        }

        public final java.lang.String getApplicationId() {
            return this.applicationId;
        }

        public final int getTheme() {
            return this.theme;
        }

        public final com.facebook.internal.WebDialog.OnCompleteListener getListener() {
            return this.listener;
        }

        public final android.os.Bundle getParameters() {
            return this.parameters;
        }

        public Builder(android.content.Context context, java.lang.String action, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            this.accessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
            if (!com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                java.lang.String metadataApplicationId = com.facebook.internal.Utility.getMetadataApplicationId(context);
                if (metadataApplicationId != null) {
                    this.applicationId = metadataApplicationId;
                } else {
                    throw new com.facebook.FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            finishInit(context, action, bundle);
        }

        public Builder(android.content.Context context, java.lang.String str, java.lang.String action, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            if (str == null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                str = com.facebook.internal.Utility.getMetadataApplicationId(context);
            }
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            this.applicationId = com.facebook.internal.Validate.notNullOrEmpty(str, "applicationId");
            finishInit(context, action, bundle);
        }

        public final com.facebook.internal.WebDialog.Builder setTheme(int theme) {
            this.theme = theme;
            return this;
        }

        public final com.facebook.internal.WebDialog.Builder setOnCompleteListener(com.facebook.internal.WebDialog.OnCompleteListener listener) {
            this.listener = listener;
            return this;
        }

        public com.facebook.internal.WebDialog build() {
            com.facebook.AccessToken accessToken = this.accessToken;
            if (accessToken != null) {
                android.os.Bundle bundle = this.parameters;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken == null ? null : accessToken.getApplicationId());
                }
                android.os.Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    com.facebook.AccessToken accessToken2 = this.accessToken;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else {
                android.os.Bundle bundle3 = this.parameters;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.applicationId);
                }
            }
            com.facebook.internal.WebDialog.Companion companion = com.facebook.internal.WebDialog.INSTANCE;
            android.content.Context context = this.context;
            if (context != null) {
                return companion.newInstance(context, this.action, this.parameters, this.theme, this.listener);
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        private final void finishInit(android.content.Context context, java.lang.String action, android.os.Bundle parameters) {
            this.context = context;
            this.action = action;
            if (parameters != null) {
                this.parameters = parameters;
            } else {
                this.parameters = new android.os.Bundle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/WebDialog$UploadStagingResourcesTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "action", "parameters", "Landroid/os/Bundle;", "(Lcom/facebook/internal/WebDialog;Ljava/lang/String;Landroid/os/Bundle;)V", "exceptions", "Ljava/lang/Exception;", "Lkotlin/Exception;", "[Ljava/lang/Exception;", "doInBackground", "p0", "([Ljava/lang/Void;)[Ljava/lang/String;", "onPostExecute", "", "results", "([Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    final class UploadStagingResourcesTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String[]> {
        private final java.lang.String action;
        private java.lang.Exception[] exceptions;
        private final android.os.Bundle parameters;
        final /* synthetic */ com.facebook.internal.WebDialog this$0;

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.String[] doInBackground(java.lang.Void[] voidArr) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    return doInBackground2(voidArr);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(java.lang.String[] strArr) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    onPostExecute2(strArr);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        public UploadStagingResourcesTask(com.facebook.internal.WebDialog this$0, java.lang.String action, android.os.Bundle parameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.this$0 = this$0;
            this.action = action;
            this.parameters = parameters;
            this.exceptions = new java.lang.Exception[0];
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected java.lang.String[] doInBackground2(java.lang.Void... p0) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                    java.lang.String[] stringArray = this.parameters.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final java.lang.String[] strArr = new java.lang.String[stringArray.length];
                    this.exceptions = new java.lang.Exception[stringArray.length];
                    final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(stringArray.length);
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                    com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            final int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (isCancelled()) {
                                    java.util.Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((com.facebook.GraphRequestAsyncTask) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                android.net.Uri uri = android.net.Uri.parse(stringArray[i]);
                                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                                if (com.facebook.internal.Utility.isWebUri(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    com.facebook.GraphRequest.Callback callback = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.WebDialog$UploadStagingResourcesTask$$ExternalSyntheticLambda0
                                        @Override // com.facebook.GraphRequest.Callback
                                        public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                                            com.facebook.internal.WebDialog.UploadStagingResourcesTask.m5203doInBackground$lambda0(strArr, i, this, countDownLatch, graphResponse);
                                        }
                                    };
                                    com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                    concurrentLinkedQueue.add(com.facebook.share.internal.ShareInternalUtility.newUploadStagingResourceWithImageRequest(currentAccessToken, uri, callback).executeAsync());
                                }
                                if (i2 > length) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (java.lang.Exception unused) {
                        java.util.Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((com.facebook.GraphRequestAsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: doInBackground$lambda-0, reason: not valid java name */
        public static final void m5203doInBackground$lambda0(java.lang.String[] results, int i, com.facebook.internal.WebDialog.UploadStagingResourcesTask this$0, java.util.concurrent.CountDownLatch latch, com.facebook.GraphResponse response) {
            com.facebook.FacebookRequestError error;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "$results");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latch, "$latch");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            try {
                error = response.getError();
                str = "Error staging photo.";
            } catch (java.lang.Exception e) {
                this$0.exceptions[i] = e;
            }
            if (error != null) {
                java.lang.String errorMessage = error.getErrorMessage();
                if (errorMessage != null) {
                    str = errorMessage;
                }
                throw new com.facebook.FacebookGraphResponseException(response, str);
            }
            org.json.JSONObject graphObject = response.getGraphObject();
            if (graphObject == null) {
                throw new com.facebook.FacebookException("Error staging photo.");
            }
            java.lang.String optString = graphObject.optString(com.facebook.share.internal.ShareConstants.MEDIA_URI);
            if (optString == null) {
                throw new com.facebook.FacebookException("Error staging photo.");
            }
            results[i] = optString;
            latch.countDown();
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(java.lang.String[] results) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    android.app.ProgressDialog progressDialog = this.this$0.spinner;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    java.lang.Exception[] excArr = this.exceptions;
                    int length = excArr.length;
                    int i = 0;
                    while (i < length) {
                        java.lang.Exception exc = excArr[i];
                        i++;
                        if (exc != null) {
                            this.this$0.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (results == null) {
                        this.this$0.sendErrorToListener(new com.facebook.FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    java.util.List asList = kotlin.collections.ArraysKt.asList(results);
                    if (asList.contains(null)) {
                        this.this$0.sendErrorToListener(new com.facebook.FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.putJSONValueInBundle(this.parameters, "media", new org.json.JSONArray((java.util.Collection) asList));
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
                    java.lang.String dialogAuthority = com.facebook.internal.ServerProtocol.getDialogAuthority();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    sb.append(com.facebook.FacebookSdk.getGraphApiVersion());
                    sb.append("/dialog/");
                    sb.append(this.action);
                    android.net.Uri buildUri = com.facebook.internal.Utility.buildUri(dialogAuthority, sb.toString(), this.parameters);
                    this.this$0.url = buildUri.toString();
                    android.widget.ImageView imageView = this.this$0.crossImageView;
                    if (imageView != null) {
                        this.this$0.setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* compiled from: WebDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0005J6\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J>\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/facebook/internal/WebDialog$Companion;", "", "()V", "API_EC_DIALOG_CANCEL", "", "BACKGROUND_GRAY", "DEFAULT_THEME", "DISABLE_SSL_CHECK_FOR_TESTING", "", "DISPLAY_TOUCH", "", "LOG_TAG", "MAX_PADDING_SCREEN_HEIGHT", "MAX_PADDING_SCREEN_WIDTH", "MIN_SCALE_FACTOR", "", "NO_PADDING_SCREEN_HEIGHT", "NO_PADDING_SCREEN_WIDTH", "PLATFORM_DIALOG_PATH_REGEX", "initCallback", "Lcom/facebook/internal/WebDialog$InitCallback;", "webDialogTheme", "getWebDialogTheme", "initDefaultTheme", "", "context", "Landroid/content/Context;", "newInstance", "Lcom/facebook/internal/WebDialog;", "action", "parameters", "Landroid/os/Bundle;", "theme", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/internal/WebDialog$OnCompleteListener;", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "setInitCallback", "callback", "setWebDialogTheme", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        protected final void initDefaultTheme(android.content.Context context) {
            if (context == null) {
                return;
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && com.facebook.internal.WebDialog.webDialogTheme == 0) {
                    setWebDialogTheme(applicationInfo.metaData.getInt(com.facebook.FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.WebDialog newInstance(android.content.Context context, java.lang.String action, android.os.Bundle parameters, int theme, com.facebook.internal.WebDialog.OnCompleteListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.internal.WebDialog.initDefaultTheme(context);
            return new com.facebook.internal.WebDialog(context, action, parameters, theme, com.facebook.login.LoginTargetApp.FACEBOOK, listener, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.WebDialog newInstance(android.content.Context context, java.lang.String action, android.os.Bundle parameters, int theme, com.facebook.login.LoginTargetApp targetApp, com.facebook.internal.WebDialog.OnCompleteListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            com.facebook.internal.WebDialog.initDefaultTheme(context);
            return new com.facebook.internal.WebDialog(context, action, parameters, theme, targetApp, listener, null);
        }

        @kotlin.jvm.JvmStatic
        public final int getWebDialogTheme() {
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.sdkInitialized();
            return com.facebook.internal.WebDialog.webDialogTheme;
        }

        @kotlin.jvm.JvmStatic
        public final void setWebDialogTheme(int theme) {
            if (theme == 0) {
                theme = com.facebook.internal.WebDialog.DEFAULT_THEME;
            }
            com.facebook.internal.WebDialog.webDialogTheme = theme;
        }

        @kotlin.jvm.JvmStatic
        public final void setInitCallback(com.facebook.internal.WebDialog.InitCallback callback) {
            com.facebook.internal.WebDialog.initCallback = callback;
        }
    }
}
