package io.appmetrica.analytics.modulesapi.internal.service.event;

/* loaded from: classes.dex */
public interface ModuleEventServiceHandlerReporter {
    boolean isMain();

    void report(io.appmetrica.analytics.coreapi.internal.event.CounterReportApi counterReportApi);
}
