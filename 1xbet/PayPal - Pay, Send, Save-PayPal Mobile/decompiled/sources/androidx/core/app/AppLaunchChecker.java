package androidx.core.app;

/* loaded from: classes7.dex */
public class AppLaunchChecker {
    public static boolean hasStartedFromLauncher(android.content.Context context) {
        return context.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
    }

    public static void onActivityCreate(android.app.Activity activity) {
        android.content.Intent intent;
        android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences("android.support.AppLaunchChecker", 0);
        if (sharedPreferences.getBoolean("startedFromLauncher", false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(androidx.core.content.IntentCompat.CATEGORY_LEANBACK_LAUNCHER)) {
            sharedPreferences.edit().putBoolean("startedFromLauncher", true).apply();
        }
    }

    @java.lang.Deprecated
    public AppLaunchChecker() {
    }
}
