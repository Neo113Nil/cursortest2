package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f6101a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f6102b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f6103c;

    /* renamed from: d, reason: collision with root package name */
    public F0 f6104d;

    public Id(Gf gf) {
        this.f6101a = gf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f6102b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f6103c = new G0();
    }
}
