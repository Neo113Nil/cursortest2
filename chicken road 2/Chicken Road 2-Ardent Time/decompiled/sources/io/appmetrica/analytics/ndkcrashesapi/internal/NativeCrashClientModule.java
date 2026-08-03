package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(android.content.Context context, io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(java.lang.String str);
}
