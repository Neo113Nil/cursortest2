package F;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import i.AbstractActivityC1231i;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0213i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2442a = new Object();

    public static Intent a(AbstractActivityC1231i abstractActivityC1231i) {
        Intent parentActivityIntent = abstractActivityC1231i.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String c3 = c(abstractActivityC1231i, abstractActivityC1231i.getComponentName());
            if (c3 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1231i, c3);
            try {
                return c(abstractActivityC1231i, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c3 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static Intent b(AbstractActivityC1231i abstractActivityC1231i, ComponentName componentName) {
        String c3 = c(abstractActivityC1231i, componentName);
        if (c3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c3);
        return c(abstractActivityC1231i, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
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
        return activity.getPackageName() + string;
    }
}
