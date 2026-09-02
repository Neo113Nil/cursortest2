package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public class GlowExporter extends TransitionGovernor {
    public final IconExporter attachConfig;

    public /* synthetic */ GlowExporter(IconExporter iconExporter, LongPressGateway longPressGateway, int i, RailAssembler railAssembler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconExporter, (i2 & 2) != 0 ? BackgroundIndex.reduceScope : longPressGateway, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? RailAssembler.reduceScope : railAssembler);
    }

    public static /* synthetic */ Object serializeOffset(GlowExporter glowExporter, ProgressCache progressCache, ServiceRegulator serviceRegulator) {
        Object invoke = glowExporter.attachConfig.invoke(progressCache, serviceRegulator);
        return invoke == RotateReceiver.releaseHeader() ? invoke : DpadBuilder.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.TransitionGovernor
    public TransitionGovernor applyTask(LongPressGateway longPressGateway, int i, RailAssembler railAssembler) {
        return new GlowExporter(this.attachConfig, longPressGateway, i, railAssembler);
    }

    @Override // com.goldenboot.saga.zone.TransitionGovernor
    public String toString() {
        return "block[" + this.attachConfig + "] -> " + super.toString();
    }

    @Override // com.goldenboot.saga.zone.TransitionGovernor
    public Object updateTimer(ProgressCache progressCache, ServiceRegulator serviceRegulator) {
        return serializeOffset(this, progressCache, serviceRegulator);
    }

    public GlowExporter(IconExporter iconExporter, LongPressGateway longPressGateway, int i, RailAssembler railAssembler) {
        super(longPressGateway, i, railAssembler);
        this.attachConfig = iconExporter;
    }
}
