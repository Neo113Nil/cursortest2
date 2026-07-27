package io.flutter.plugin.platform;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ ActivityManager.TaskDescription c(int i2, String str) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout f(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
