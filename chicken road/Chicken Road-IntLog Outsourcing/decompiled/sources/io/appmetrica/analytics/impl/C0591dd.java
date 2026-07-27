package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591dd implements ModuleEventServiceHandlerContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f8039a;

    /* renamed from: b, reason: collision with root package name */
    public final ModulePreferences f8040b;

    /* renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f8041c;

    public C0591dd(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f8039a = modulePreferences;
        this.f8040b = modulePreferences2;
        this.f8041c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f8041c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f8040b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f8039a;
    }
}
