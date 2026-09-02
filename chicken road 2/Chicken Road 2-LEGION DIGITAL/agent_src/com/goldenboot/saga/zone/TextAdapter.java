package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TextAdapter extends LayoutUploader {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator {
        public static boolean evictLayout(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler {
        public static boolean evictLayout(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface FeedbackFlow {
        void injectMetric(int i);
    }

    public static void applyTask(Activity activity) {
        activity.finishAffinity();
    }

    public static void attachConfig(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void connectJob(Activity activity) {
        activity.recreate();
    }

    public static void connectPatch(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void drawField(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static boolean notifyMessage(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? BounceHandler.evictLayout(activity, str) : i == 31 ? ActivityMutator.evictLayout(activity, str) : activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void peekRevision(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof FeedbackFlow) {
            ((FeedbackFlow) activity).injectMetric(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static void popBlueprint(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void reduceScope(Activity activity, KeyboardAction keyboardAction) {
        activity.setExitSharedElementCallback(null);
    }

    public static void resetDelta(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void serializeOffset(Activity activity, KeyboardAction keyboardAction) {
        activity.setEnterSharedElementCallback(null);
    }
}
