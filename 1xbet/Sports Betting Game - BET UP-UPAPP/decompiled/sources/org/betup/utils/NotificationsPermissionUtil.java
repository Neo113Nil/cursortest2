package org.betup.utils;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import org.betup.ui.dialogs.PushNotificationPermissionEducationDialogFragment;

/* loaded from: classes4.dex */
public class NotificationsPermissionUtil {
    private static ActivityResultLauncher<String> permissionListener;

    static /* synthetic */ void lambda$registerPermissionListener$0(Boolean bool) {
    }

    public static void registerPermissionListener(AppCompatActivity activity) {
        permissionListener = activity.registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: org.betup.utils.NotificationsPermissionUtil$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                NotificationsPermissionUtil.lambda$registerPermissionListener$0((Boolean) obj);
            }
        });
    }

    public static void showEducationDialogIfNeeded(AppCompatActivity activity) {
        if (activity == null || activity.isFinishing() || Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        DialogManager dialogManager = DialogManager.INSTANCE;
        DialogManager.showDialogSafely(new PushNotificationPermissionEducationDialogFragment(), activity, PushNotificationPermissionEducationDialogFragment.TAG);
    }

    public static boolean askPermissions(AppCompatActivity activity) {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        ActivityResultLauncher<String> activityResultLauncher = permissionListener;
        if (activityResultLauncher == null) {
            return false;
        }
        activityResultLauncher.launch("android.permission.POST_NOTIFICATIONS");
        return false;
    }
}
