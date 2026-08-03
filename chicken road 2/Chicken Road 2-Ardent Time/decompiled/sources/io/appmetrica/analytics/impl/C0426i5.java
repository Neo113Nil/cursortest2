package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426i5 implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f6074a = new java.util.ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final java.lang.String getDescription() {
        return i1.AbstractC0190i.Q(this.f6074a, null, "Composite processor with " + this.f6074a.size() + " children: [", "]", io.appmetrica.analytics.impl.C0400h5.f6027a, 25);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        java.lang.Object obj;
        boolean process;
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + java.util.Arrays.toString(objArr), new java.lang.Object[0]);
        java.util.Iterator it = this.f6074a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor moduleAdRevenueProcessor = (io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor) obj;
            try {
                process = moduleAdRevenueProcessor.process(java.util.Arrays.copyOf(objArr, objArr.length));
                if (!process) {
                    io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th) {
                io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new java.lang.Object[0]);
            }
            if (process) {
                break;
            }
        }
        boolean z2 = ((io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor) obj) != null;
        if (!z2) {
            io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + java.util.Arrays.toString(objArr) + " was not found", new java.lang.Object[0]);
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f6074a.add(moduleAdRevenueProcessor);
    }
}
