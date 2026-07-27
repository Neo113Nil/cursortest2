package u;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1461b {
    public static boolean a(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    public static boolean b(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
