package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Od {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule f4769a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Id f4770b;

    public Od() {
        io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule nativeCrashServiceModule = (io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule) io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashServiceModuleImpl", io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule.class);
        this.f4769a = nativeCrashServiceModule == null ? new io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModuleDummy() : nativeCrashServiceModule;
        this.f4770b = new io.appmetrica.analytics.impl.Id(new io.appmetrica.analytics.impl.Nd(this));
    }
}
