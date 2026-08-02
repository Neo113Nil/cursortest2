package com.mastercard.openbanking.connect;

/* loaded from: classes9.dex */
public class Connect extends android.app.Activity implements com.mastercard.openbanking.connect.ConnectWebViewClientHandler {
    private static final java.lang.String ALREADY_RUNNING_ERROR_MSG = "There is already another Connect Activity running. Only 1 is allowed at a time. Please allow the current activity to finish before launching a new Connect activity or finish it via the Connect.finishCurrentActivity() method.";
    private static com.mastercard.openbanking.connect.Connect CONNECT_INSTANCE = null;
    private static final java.lang.String CONNECT_REDIRECT_LINK_URL_INTENT_KEY = "com.mastercard.openbanking.connect.CONNECT_REDIRECT_LINK_URL_INTENT_KEY";
    private static final java.lang.String CONNECT_URL_INTENT_KEY = "com.mastercard.openbanking.connect.CONNECT_URL_INTENT_KEY";
    private static com.mastercard.openbanking.connect.EventHandler EVENT_HANDLER = null;
    private static final java.lang.String SDK_VERSION = "3.0.6";
    protected static final int SELECT_FILE_RESULT_CODE = 100;
    private static com.mastercard.openbanking.connect.ConnectJsInterface jsInterface = null;
    public static boolean runningUnitTest = false;
    protected android.webkit.ValueCallback<android.net.Uri[]> mFilePathCallback;
    private android.webkit.WebView mMainWebView;
    private java.util.Timer pingTimer;
    private java.util.TimerTask pingTimerTask;
    private final java.lang.String REDIRECT_URL_REGEX = "[a-z]://";
    private final java.lang.String INVALID_CHARACTERS_REGEX = "[!@#$%^&*]";
    private final java.lang.String DEFAULT_REDIRECT_URL = "connect://maob/redirect";

    @Override // com.mastercard.openbanking.connect.ConnectWebViewClientHandler
    public void handleOnPageFinish() {
    }

    public static void start(android.content.Context context, java.lang.String str, com.mastercard.openbanking.connect.EventHandler eventHandler) {
        if (CONNECT_INSTANCE != null) {
            throw new java.lang.RuntimeException(ALREADY_RUNNING_ERROR_MSG);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.mastercard.openbanking.connect.Connect.class);
        if (runningUnitTest) {
            intent.setFlags(268435456);
        }
        intent.putExtra(CONNECT_URL_INTENT_KEY, str);
        EVENT_HANDLER = eventHandler;
        context.startActivity(intent);
    }

    public static void start(android.content.Context context, java.lang.String str, java.lang.String str2, com.mastercard.openbanking.connect.EventHandler eventHandler) {
        if (CONNECT_INSTANCE != null) {
            throw new java.lang.RuntimeException(ALREADY_RUNNING_ERROR_MSG);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.mastercard.openbanking.connect.Connect.class);
        if (runningUnitTest) {
            intent.setFlags(268435456);
        }
        intent.putExtra(CONNECT_URL_INTENT_KEY, str);
        intent.putExtra(CONNECT_REDIRECT_LINK_URL_INTENT_KEY, str2);
        EVENT_HANDLER = eventHandler;
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (EVENT_HANDLER == null) {
            CONNECT_INSTANCE = null;
            finish();
            return;
        }
        if (runningUnitTest) {
            getWindow().addFlags(128);
        }
        if (CONNECT_INSTANCE != null) {
            throw new java.lang.RuntimeException(ALREADY_RUNNING_ERROR_MSG);
        }
        CONNECT_INSTANCE = this;
        requestWindowFeature(1);
        setContentView(com.mastercard.openbanking.connect.R.layout.activity_connect);
        android.webkit.WebView webView = (android.webkit.WebView) findViewById(com.mastercard.openbanking.connect.R.id.mainWebView);
        this.mMainWebView = webView;
        webView.getSettings().setSupportMultipleWindows(true);
        this.mMainWebView.getSettings().setJavaScriptEnabled(true);
        this.mMainWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.mMainWebView.getSettings().setAllowFileAccess(true);
        this.mMainWebView.setWebChromeClient(new com.mastercard.openbanking.connect.ConnectWebChromeClient(this, EVENT_HANDLER, this));
        com.mastercard.openbanking.connect.ConnectJsInterface connectJsInterface = new com.mastercard.openbanking.connect.ConnectJsInterface(this, EVENT_HANDLER);
        jsInterface = connectJsInterface;
        this.mMainWebView.addJavascriptInterface(connectJsInterface, "maOBAndroidConnect");
        this.mMainWebView.loadUrl(getIntent().getStringExtra(CONNECT_URL_INTENT_KEY));
        java.lang.String stringExtra = getIntent().getStringExtra(CONNECT_REDIRECT_LINK_URL_INTENT_KEY);
        if (stringExtra == null || stringExtra.isEmpty()) {
            return;
        }
        isValidUrl(stringExtra);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == 100) {
            if (i2 != 0) {
                android.webkit.ValueCallback<android.net.Uri[]> valueCallback = this.mFilePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(android.webkit.WebChromeClient.FileChooserParams.parseResult(i2, intent));
                    this.mFilePathCallback = null;
                    return;
                }
                return;
            }
            this.mFilePathCallback.onReceiveValue(null);
            this.mFilePathCallback = null;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        stopPingTimer();
        android.webkit.WebView webView = this.mMainWebView;
        if (webView != null) {
            webView.destroy();
            this.mMainWebView = null;
        }
        CONNECT_INSTANCE = null;
        EVENT_HANDLER = null;
        jsInterface = null;
    }

    public void postWindowClosedMessage() {
        android.webkit.WebView webView = this.mMainWebView;
        if (webView != null) {
            webView.evaluateJavascript("window.postMessage({ type: 'window', closed: true }, '*')", null);
        }
    }

    public static void finishCurrentActivity() {
        if (CONNECT_INSTANCE != null) {
            com.mastercard.openbanking.connect.ConnectJsInterface connectJsInterface = jsInterface;
            if (connectJsInterface != null) {
                connectJsInterface.closeCustomTab();
            }
            CONNECT_INSTANCE.finish();
            return;
        }
        throw new java.lang.RuntimeException("There is no Connect Activity currently running");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.mMainWebView.canGoBack()) {
            this.mMainWebView.goBack();
        } else {
            android.content.DialogInterface.OnClickListener dialogClickListener = getDialogClickListener();
            new android.app.AlertDialog.Builder(this).setTitle(getString(com.mastercard.openbanking.connect.R.string.exit_confirmation_title)).setMessage(getString(com.mastercard.openbanking.connect.R.string.exit_confirmation_msg)).setPositiveButton(getString(com.mastercard.openbanking.connect.R.string.exit_confirmation_yes), dialogClickListener).setNegativeButton(getString(com.mastercard.openbanking.connect.R.string.exit_confirmation_no), dialogClickListener).show();
        }
    }

    private android.content.DialogInterface.OnClickListener getDialogClickListener() {
        return new android.content.DialogInterface.OnClickListener() { // from class: com.mastercard.openbanking.connect.Connect$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.mastercard.openbanking.connect.Connect.this.m10867x82c15b64(dialogInterface, i);
            }
        };
    }

    /* renamed from: lambda$getDialogClickListener$0$com-mastercard-openbanking-connect-Connect, reason: not valid java name */
    /* synthetic */ void m10867x82c15b64(android.content.DialogInterface dialogInterface, int i) {
        if (i == -1) {
            try {
                EVENT_HANDLER.onCancel(new org.json.JSONObject("{ \"code\": \"100\", \"reason\": \"exit\" }"));
                finish();
            } catch (java.lang.Exception unused) {
                finish();
            }
        }
    }

    protected void startPingTimer() {
        stopPingTimer();
        this.pingTimer = new java.util.Timer();
        com.mastercard.openbanking.connect.Connect.AnonymousClass1 anonymousClass1 = new com.mastercard.openbanking.connect.Connect.AnonymousClass1();
        this.pingTimerTask = anonymousClass1;
        this.pingTimer.schedule(anonymousClass1, 1000L, 1000L);
    }

    /* renamed from: com.mastercard.openbanking.connect.Connect$1, reason: invalid class name */
    class AnonymousClass1 extends java.util.TimerTask {
        AnonymousClass1() {
        }

        /* renamed from: lambda$run$0$com-mastercard-openbanking-connect-Connect$1, reason: not valid java name */
        /* synthetic */ void m10868lambda$run$0$commastercardopenbankingconnectConnect$1() {
            com.mastercard.openbanking.connect.Connect.this.pingConnect();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.mastercard.openbanking.connect.Connect.CONNECT_INSTANCE.runOnUiThread(new java.lang.Runnable() { // from class: com.mastercard.openbanking.connect.Connect$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.mastercard.openbanking.connect.Connect.AnonymousClass1.this.m10868lambda$run$0$commastercardopenbankingconnectConnect$1();
                }
            });
        }
    }

    protected void stopPingTimer() {
        java.util.Timer timer = this.pingTimer;
        if (timer != null) {
            timer.cancel();
            this.pingTimer.purge();
        }
        java.util.TimerTask timerTask = this.pingTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.pingTimer = null;
        this.pingTimerTask = null;
    }

    protected void pingConnect() {
        java.lang.String str;
        java.lang.String stringExtra = getIntent().getStringExtra(CONNECT_REDIRECT_LINK_URL_INTENT_KEY);
        if (stringExtra != null && !stringExtra.isEmpty() && isValidUrl(stringExtra)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("window.postMessage({ type: 'ping', sdkVersion: '3.0.6', platform: 'Android', redirectUrl: '");
            sb.append(stringExtra);
            sb.append("' }, '*')");
            str = sb.toString();
        } else {
            str = "window.postMessage({ type: 'ping', sdkVersion: '3.0.6', platform: 'Android',redirectUrl: 'connect://maob/redirect' }, '*')";
        }
        android.webkit.WebView webView = this.mMainWebView;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    protected boolean isValidUrl(java.lang.String str) {
        if (str != null && !str.isEmpty() && !str.contains(" ")) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                if ((!str.startsWith("http") || (parse.getAuthority() != null && !parse.getAuthority().isEmpty())) && !containsInvalidCharacters(parse.getScheme()) && !containsInvalidCharacters(parse.getAuthority())) {
                    return java.util.regex.Pattern.compile("[a-z]://").matcher(str).find();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    private boolean containsInvalidCharacters(java.lang.String str) {
        return java.util.regex.Pattern.compile("[!@#$%^&*]").matcher(str).find();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
