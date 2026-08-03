package io.appmetrica.analytics.reporterextension.internal;

/* loaded from: classes.dex */
public final class ReporterExtensionClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7488a = "reporter_extension";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return this.f7488a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientActivator().activate(clientContext.getContext());
        }
    }
}
