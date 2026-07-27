package com.onesignal.core.internal.application;

import android.app.Activity;

/* loaded from: classes.dex */
public interface IActivityLifecycleHandler {
    void onActivityAvailable(Activity activity);

    void onActivityStopped(Activity activity);
}
