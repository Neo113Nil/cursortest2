package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class FacebookWrapper {
    private static com.facebook.AccessTokenTracker accessTokenTracker;
    private static com.facebook.CallbackManager callbackManager;
    private static com.facebook.appevents.AppEventsLogger eventLogger;

    public static void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public static void onCreate(android.app.Activity activity) {
        callbackManager = com.facebook.CallbackManager.Factory.create();
        accessTokenTracker = new com.facebook.AccessTokenTracker() { // from class: org.cocos2dx.plugin.FacebookWrapper.1
            @Override // com.facebook.AccessTokenTracker
            protected void onCurrentAccessTokenChanged(com.facebook.AccessToken accessToken, com.facebook.AccessToken accessToken2) {
            }
        };
        eventLogger = com.facebook.appevents.AppEventsLogger.newLogger(activity);
        com.facebook.appevents.AppEventsLogger.activateApp(activity.getApplication());
    }

    public static void onAcitivityResult(int i, int i2, android.content.Intent intent) {
        callbackManager.onActivityResult(i, i2, intent);
    }

    public static com.facebook.CallbackManager getCallbackManager() {
        return callbackManager;
    }

    public static com.facebook.appevents.AppEventsLogger getAppEventsLogger() {
        return eventLogger;
    }
}
