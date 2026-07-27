package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import e2.o;
import java.util.List;

/* loaded from: classes.dex */
public final class NativeCrashServiceModuleDummy extends NativeCrashServiceModule {
    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void deleteCompletedCrashes() {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public List<NativeCrash> getAllCrashes() {
        return o.f4877a;
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void init(Context context, NativeCrashServiceConfig nativeCrashServiceConfig) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void markCrashCompleted(String str) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void setDefaultCrashHandler(NativeCrashHandler nativeCrashHandler) {
    }
}
