package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes.dex */
public final class NativeCrashServiceModuleDummy extends io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule {
    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void deleteCompletedCrashes() {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public java.util.List<io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash> getAllCrashes() {
        return i1.C0199r.f3325a;
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void init(android.content.Context context, io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig nativeCrashServiceConfig) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void markCrashCompleted(java.lang.String str) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void setDefaultCrashHandler(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler nativeCrashHandler) {
    }
}
