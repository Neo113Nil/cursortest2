package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PointerNotifier implements InputFacilitator {
    public final boolean evictLayout;
    public final IconExporter growPayload;

    public PointerNotifier(boolean z, IconExporter iconExporter) {
        this.evictLayout = z;
        this.growPayload = iconExporter;
    }

    @Override // com.goldenboot.saga.zone.InputFacilitator
    public WorkerBootstrapper evictLayout(long j, long j2) {
        return (WorkerBootstrapper) this.growPayload.invoke(ScaleSaver.growPayload(j), ScaleSaver.growPayload(j2));
    }

    @Override // com.goldenboot.saga.zone.InputFacilitator
    public boolean growPayload() {
        return this.evictLayout;
    }
}
