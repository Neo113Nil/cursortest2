package A;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i2, String str) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout k(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
