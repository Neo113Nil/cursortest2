package io.appmetrica.analytics.modulesapi.internal.service.event;

/* loaded from: classes.dex */
public interface ModuleEventServiceHandlerContext {
    io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter getEventReporter();

    io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences getLegacyModulePreferences();

    io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences getModulePreferences();
}
