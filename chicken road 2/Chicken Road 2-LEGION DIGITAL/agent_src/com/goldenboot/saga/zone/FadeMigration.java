package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class FadeMigration {
    public static final ScopedFlag evictLayout(ProgressValve progressValve, LongPressGateway longPressGateway, int i, RailAssembler railAssembler, EmitterSpawner emitterSpawner, TouchRecord touchRecord, IconExporter iconExporter) {
        ModuleOrganizer moduleOrganizer = new ModuleOrganizer(ListenerCustodian.drawField(progressValve, longPressGateway), TapUtil.growPayload(i, railAssembler, null, 4, null));
        if (touchRecord != null) {
            moduleOrganizer.attachConfig(touchRecord);
        }
        moduleOrganizer.trimState(emitterSpawner, moduleOrganizer, iconExporter);
        return moduleOrganizer;
    }

    public static /* synthetic */ ScopedFlag growPayload(ProgressValve progressValve, LongPressGateway longPressGateway, int i, RailAssembler railAssembler, EmitterSpawner emitterSpawner, TouchRecord touchRecord, IconExporter iconExporter, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            longPressGateway = BackgroundIndex.reduceScope;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            railAssembler = RailAssembler.reduceScope;
        }
        if ((i2 & 8) != 0) {
            emitterSpawner = EmitterSpawner.reduceScope;
        }
        if ((i2 & 16) != 0) {
            touchRecord = null;
        }
        TouchRecord touchRecord2 = touchRecord;
        return evictLayout(progressValve, longPressGateway, i, railAssembler, emitterSpawner, touchRecord2, iconExporter);
    }
}
