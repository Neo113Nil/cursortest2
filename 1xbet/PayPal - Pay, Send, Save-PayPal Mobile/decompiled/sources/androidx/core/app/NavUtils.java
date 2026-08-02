package androidx.core.app;

/* loaded from: classes3.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";

    @androidx.annotation.ReplaceWith(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @java.lang.Deprecated
    public static boolean shouldUpRecreateTask(android.app.Activity activity, android.content.Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void navigateUpFromSameTask(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = getParentActivityIntent(activity);
        if (parentActivityIntent == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
            sb.append(activity.getClass().getSimpleName());
            sb.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        navigateUpTo(activity, parentActivityIntent);
    }

    @androidx.annotation.ReplaceWith(expression = "sourceActivity.navigateUpTo(upIntent)")
    @java.lang.Deprecated
    public static void navigateUpTo(android.app.Activity activity, android.content.Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static android.content.Intent getParentActivityIntent(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        java.lang.String parentActivityName = getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(activity, parentActivityName);
        try {
            if (getParentActivityName(activity, componentName) == null) {
                return android.content.Intent.makeMainActivity(componentName);
            }
            return new android.content.Intent().setComponent(componentName);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context context, java.lang.Class<?> cls) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String parentActivityName = getParentActivityName(context, new android.content.ComponentName(context, cls));
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(context, parentActivityName);
        if (getParentActivityName(context, componentName) == null) {
            return android.content.Intent.makeMainActivity(componentName);
        }
        return new android.content.Intent().setComponent(componentName);
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String parentActivityName = getParentActivityName(context, componentName);
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), parentActivityName);
        if (getParentActivityName(context, componentName2) == null) {
            return android.content.Intent.makeMainActivity(componentName2);
        }
        return new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String getParentActivityName(android.app.Activity activity) {
        try {
            return getParentActivityName(activity, activity.getComponentName());
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static java.lang.String getParentActivityName(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString(PARENT_ACTIVITY)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString();
    }

    private NavUtils() {
    }
}
