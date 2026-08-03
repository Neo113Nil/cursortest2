package com.facebook;

/* compiled from: CustomTabMainActivity.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "()V", "redirectReceiver", "Landroid/content/BroadcastReceiver;", "shouldCloseCustomTab", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", com.ironsource.X3.i.u0, "sendResult", com.ironsource.X3.f.f, "", "resultIntent", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabMainActivity extends android.app.Activity {
    private android.content.BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.CustomTabMainActivity.Companion INSTANCE = new com.facebook.CustomTabMainActivity.Companion(null);
    public static final java.lang.String EXTRA_ACTION = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".extra_action");
    public static final java.lang.String EXTRA_PARAMS = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".extra_params");
    public static final java.lang.String EXTRA_CHROME_PACKAGE = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".extra_chromePackage");
    public static final java.lang.String EXTRA_URL = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".extra_url");
    public static final java.lang.String EXTRA_TARGET_APP = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".extra_targetApp");
    public static final java.lang.String REFRESH_ACTION = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".action_refresh");
    public static final java.lang.String NO_ACTIVITY_EXCEPTION = kotlin.jvm.internal.Intrinsics.stringPlus("CustomTabMainActivity", ".no_activity_exception");

    /* compiled from: CustomTabMainActivity.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.LoginTargetApp.valuesCustom().length];
            iArr[com.facebook.login.LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String stringExtra;
        com.facebook.internal.InstagramCustomTab customTab;
        super.onCreate(savedInstanceState);
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(EXTRA_ACTION)) == null) {
            return;
        }
        android.os.Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_PARAMS);
        java.lang.String stringExtra2 = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
        if (com.facebook.CustomTabMainActivity.WhenMappings.$EnumSwitchMapping$0[com.facebook.login.LoginTargetApp.INSTANCE.fromString(getIntent().getStringExtra(EXTRA_TARGET_APP)).ordinal()] == 1) {
            customTab = new com.facebook.internal.InstagramCustomTab(stringExtra, bundleExtra);
        } else {
            customTab = new com.facebook.internal.CustomTab(stringExtra, bundleExtra);
        }
        boolean openCustomTab = customTab.openCustomTab(this, stringExtra2);
        this.shouldCloseCustomTab = false;
        if (!openCustomTab) {
            setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
            finish();
        } else {
            android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                    android.content.Intent intent2 = new android.content.Intent(com.facebook.CustomTabMainActivity.this, (java.lang.Class<?>) com.facebook.CustomTabMainActivity.class);
                    intent2.setAction(com.facebook.CustomTabMainActivity.REFRESH_ACTION);
                    intent2.putExtra(com.facebook.CustomTabMainActivity.EXTRA_URL, intent.getStringExtra(com.facebook.CustomTabMainActivity.EXTRA_URL));
                    intent2.addFlags(603979776);
                    com.facebook.CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            this.redirectReceiver = broadcastReceiver;
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.facebook.CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (kotlin.jvm.internal.Intrinsics.areEqual(REFRESH_ACTION, intent.getAction())) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).sendBroadcast(new android.content.Intent(com.facebook.CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, null);
        }
        this.shouldCloseCustomTab = true;
    }

    private final void sendResult(int resultCode, android.content.Intent resultIntent) {
        android.content.BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        if (resultIntent != null) {
            java.lang.String stringExtra = resultIntent.getStringExtra(EXTRA_URL);
            android.os.Bundle parseResponseUri = stringExtra != null ? INSTANCE.parseResponseUri(stringExtra) : new android.os.Bundle();
            com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "intent");
            android.content.Intent createProtocolResultIntent = com.facebook.internal.NativeProtocol.createProtocolResultIntent(intent, parseResponseUri, null);
            if (createProtocolResultIntent != null) {
                resultIntent = createProtocolResultIntent;
            }
            setResult(resultCode, resultIntent);
        } else {
            com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
            android.content.Intent intent2 = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            setResult(resultCode, com.facebook.internal.NativeProtocol.createProtocolResultIntent(intent2, null, null));
        }
        finish();
    }

    /* compiled from: CustomTabMainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/CustomTabMainActivity$Companion;", "", "()V", "EXTRA_ACTION", "", "EXTRA_CHROME_PACKAGE", "EXTRA_PARAMS", "EXTRA_TARGET_APP", "EXTRA_URL", "NO_ACTIVITY_EXCEPTION", "REFRESH_ACTION", "parseResponseUri", "Landroid/os/Bundle;", "urlString", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Bundle parseResponseUri(java.lang.String urlString) {
            android.net.Uri parse = android.net.Uri.parse(urlString);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            android.os.Bundle parseUrlQueryString = com.facebook.internal.Utility.parseUrlQueryString(parse.getQuery());
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            parseUrlQueryString.putAll(com.facebook.internal.Utility.parseUrlQueryString(parse.getFragment()));
            return parseUrlQueryString;
        }
    }
}
