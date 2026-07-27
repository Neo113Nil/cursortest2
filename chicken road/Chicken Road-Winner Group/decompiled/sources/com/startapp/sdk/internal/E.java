package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class E {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i3, String str) {
        return new ActivityManager.TaskDescription(str, 0, i3);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout g(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
