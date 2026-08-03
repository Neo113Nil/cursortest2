package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wc implements io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences f5198a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences f5199b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter f5200c;

    public Wc(io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences, io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences2, io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f5198a = modulePreferences;
        this.f5199b = modulePreferences2;
        this.f5200c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f5200c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences getLegacyModulePreferences() {
        return this.f5199b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences getModulePreferences() {
        return this.f5198a;
    }
}
