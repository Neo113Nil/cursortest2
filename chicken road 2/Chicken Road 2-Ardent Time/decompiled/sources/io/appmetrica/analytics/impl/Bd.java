package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f4115a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule f4116b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I0 f4117c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.H0 f4118d;

    public Bd(io.appmetrica.analytics.impl.Bf bf) {
        this.f4115a = bf;
        io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule nativeCrashClientModule = (io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule) io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule.class);
        this.f4116b = nativeCrashClientModule == null ? new io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f4117c = new io.appmetrica.analytics.impl.I0();
    }
}
