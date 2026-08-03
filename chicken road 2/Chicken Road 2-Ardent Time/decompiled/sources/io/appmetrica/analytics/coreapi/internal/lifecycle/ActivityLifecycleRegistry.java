package io.appmetrica.analytics.coreapi.internal.lifecycle;

/* loaded from: classes.dex */
public interface ActivityLifecycleRegistry {
    void registerListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener activityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... activityEventArr);

    void unregisterListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener activityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... activityEventArr);
}
