package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class MessagingPushTrackerActivity extends android.app.Activity {
    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        android.content.Intent launchIntentForPackage;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "Intent is null. Ignoring to track or take action on push notification interaction.", new java.lang.Object[0]);
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(action)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "Intent action is null or empty. Ignoring to track or take action on push notification interaction.", new java.lang.Object[0]);
            finish();
            return;
        }
        action.hashCode();
        if (!action.equals("Notification Button Clicked")) {
            if (action.equals("Notification Opened")) {
                com.adobe.marketing.mobile.Messaging.handleNotificationResponse(intent, true, null);
            }
            finish();
        } else {
            com.adobe.marketing.mobile.Messaging.handleNotificationResponse(intent, true, intent.getStringExtra(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID));
            java.lang.String stringExtra = intent.getStringExtra("messageId");
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra)) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "Message ID is null or empty. Unable to dismiss the notification.", new java.lang.Object[0]);
            } else {
                ((android.app.NotificationManager) getApplicationContext().getSystemService("notification")).cancel(stringExtra.hashCode());
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("actionUri");
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra2)) {
            android.app.Activity currentActivity = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getCurrentActivity();
            if (currentActivity == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "There is no active activity. Starting the launcher Activity.", new java.lang.Object[0]);
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            } else {
                launchIntentForPackage = new android.content.Intent(currentActivity, currentActivity.getClass());
            }
            if (launchIntentForPackage == null) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "Unable to create an intent to open the application from the notification interaction.", new java.lang.Object[0]);
            } else {
                launchIntentForPackage.setFlags(603979776);
                startActivity(launchIntentForPackage);
            }
        } else {
            try {
                startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(stringExtra2)));
            } catch (android.content.ActivityNotFoundException unused) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushTrackerActivity", "Unable to open the URI from the notification interaction. URI: %s", stringExtra2);
            }
        }
        finish();
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
