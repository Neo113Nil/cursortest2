package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModuleDummy;

/* loaded from: classes.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashServiceModule f7626a;

    /* renamed from: b, reason: collision with root package name */
    public final Pd f7627b;

    public Vd() {
        NativeCrashServiceModule nativeCrashServiceModule = (NativeCrashServiceModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashServiceModuleImpl", NativeCrashServiceModule.class);
        this.f7626a = nativeCrashServiceModule == null ? new NativeCrashServiceModuleDummy() : nativeCrashServiceModule;
        this.f7627b = new Pd(new Ud(this));
    }
}
