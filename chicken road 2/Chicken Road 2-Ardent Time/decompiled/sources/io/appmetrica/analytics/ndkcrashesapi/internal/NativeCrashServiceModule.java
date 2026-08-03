package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes.dex */
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    public abstract java.util.List<io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash> getAllCrashes();

    public abstract void init(android.content.Context context, io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig nativeCrashServiceConfig);

    public abstract void markCrashCompleted(java.lang.String str);

    public abstract void setDefaultCrashHandler(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler nativeCrashHandler);
}
