package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ListFilter {
    public static boolean clipOrigin(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static String detachStream(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Intent evictLayout(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String injectMetric = injectMetric(activity);
        if (injectMetric == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, injectMetric);
        try {
            return detachStream(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Intent growPayload(Context context, ComponentName componentName) {
        String detachStream = detachStream(context, componentName);
        if (detachStream == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), detachStream);
        return detachStream(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String injectMetric(Activity activity) {
        try {
            return detachStream(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void releaseHeader(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }
}
