package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class ActivityLifeManager implements android.app.Application.ActivityLifecycleCallbacks {
    android.app.Activity app;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String localClassName = activity.getLocalClassName();
        android.util.Log.d("flashfix", "onActivityCreated: " + localClassName);
        if (localClassName.contains("NotificationOpened")) {
            org.cocos2dx.lib.Cocos2dxActivity.openWay = 3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.adjust.sdk.Adjust.onResume();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.adjust.sdk.Adjust.onPause();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.util.Log.d("flashfix", "onActivityDestroyed: " + activity.getLocalClassName());
        if (activity.getLocalClassName().equals("com.google.android.gms.games.internal.v2.resolution.GamesResolutionActivity")) {
            java.lang.String packageName = activity.getPackageName();
            android.util.Log.d("flashfix", "restart: " + packageName);
            android.content.Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(packageName);
            launchIntentForPackage.addFlags(androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            activity.startActivity(launchIntentForPackage);
        }
    }
}
