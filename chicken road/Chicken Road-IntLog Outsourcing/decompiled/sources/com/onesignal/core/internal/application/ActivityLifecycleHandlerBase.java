package com.onesignal.core.internal.application;

import android.app.Activity;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class ActivityLifecycleHandlerBase implements IActivityLifecycleHandler {
    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityAvailable(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
    }
}
