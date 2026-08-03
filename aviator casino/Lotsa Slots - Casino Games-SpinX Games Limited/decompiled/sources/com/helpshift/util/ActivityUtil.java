package com.helpshift.util;

/* loaded from: classes5.dex */
public class ActivityUtil {
    private ActivityUtil() {
    }

    public static void startLauncherActivityAndFinish(android.app.Activity activity) {
        com.helpshift.util.ApplicationUtil.startLauncherActivity(activity);
        activity.finish();
    }

    public static android.content.Intent createIntent(android.content.Context context, java.lang.Class<? extends android.app.Activity> cls) {
        return new android.content.Intent(context, cls);
    }
}
