package com.mastercard.openbanking.connect;

/* loaded from: classes9.dex */
public class CustomTabsActivityManager extends android.app.Activity {
    static final java.lang.String KEY_BROWSER_INTENT = "browserIntent";
    private static android.app.Activity connectActivity;
    private boolean mOpened = false;

    public static android.content.Intent createStartIntent(android.content.Context context, android.content.Intent intent, android.app.Activity activity) {
        android.content.Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.putExtra(KEY_BROWSER_INTENT, intent);
        connectActivity = activity;
        return createBaseIntent;
    }

    public static android.content.Intent createDismissIntent(android.content.Context context) {
        android.content.Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.addFlags(67108864);
        return createBaseIntent;
    }

    private static android.content.Intent createBaseIntent(android.content.Context context) {
        return new android.content.Intent(context, (java.lang.Class<?>) com.mastercard.openbanking.connect.CustomTabsActivityManager.class);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra(KEY_BROWSER_INTENT)) {
            android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra(KEY_BROWSER_INTENT);
            intent.addFlags(67108864);
            startActivity(intent);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.mOpened) {
            this.mOpened = true;
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        android.app.Activity activity = connectActivity;
        if (activity != null) {
            ((com.mastercard.openbanking.connect.Connect) activity).postWindowClosedMessage();
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
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
    public void onStart() {
        super.onStart();
    }
}
