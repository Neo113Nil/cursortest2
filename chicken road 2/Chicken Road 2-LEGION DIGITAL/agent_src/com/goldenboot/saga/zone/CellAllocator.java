package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CellAllocator {
    public static final SelectionHub applyTask(TouchRecord touchRecord) {
        return new WorkerBlock(touchRecord);
    }

    public static final DpadBuilder clipOrigin(DragInspector dragInspector, IconExporter iconExporter, int i, NotificationFence notificationFence, int i2) {
        injectMetric(dragInspector, iconExporter, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    public static final void detachStream(final DragInspector[] dragInspectorArr, final IconExporter iconExporter, NotificationFence notificationFence, final int i) {
        NotificationFence connectPatch = notificationFence.connectPatch(415205898);
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(415205898, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        connectPatch.startResource(dragInspectorArr);
        iconExporter.invoke(connectPatch, Integer.valueOf((i >> 3) & 14));
        connectPatch.filterPayload();
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.SpanBinder
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder releaseHeader;
                    releaseHeader = CellAllocator.releaseHeader(dragInspectorArr, iconExporter, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return releaseHeader;
                }
            });
        }
    }

    public static final SelectionHub flushSample(BounceFacilitator bounceFacilitator, ElevationNode elevationNode) {
        return new FooterUseCase(bounceFacilitator, elevationNode);
    }

    public static final void injectMetric(final DragInspector dragInspector, final IconExporter iconExporter, NotificationFence notificationFence, final int i) {
        NotificationFence connectPatch = notificationFence.connectPatch(-149765515);
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-149765515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        connectPatch.connectJob(dragInspector);
        iconExporter.invoke(connectPatch, Integer.valueOf((i >> 3) & 14));
        connectPatch.attachCallback();
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.NotificationDispatcher
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder clipOrigin;
                    clipOrigin = CellAllocator.clipOrigin(DragInspector.this, iconExporter, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return clipOrigin;
                }
            });
        }
    }

    public static final SelectionHub popBlueprint(ElevationNode elevationNode) {
        return new DoubleTapChain(elevationNode);
    }

    public static final DpadBuilder releaseHeader(DragInspector[] dragInspectorArr, IconExporter iconExporter, int i, NotificationFence notificationFence, int i2) {
        detachStream(dragInspectorArr, iconExporter, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    public static /* synthetic */ SelectionHub updateTimer(BounceFacilitator bounceFacilitator, ElevationNode elevationNode, int i, Object obj) {
        if ((i & 1) != 0) {
            bounceFacilitator = BounceReader.attachConfig();
        }
        return flushSample(bounceFacilitator, elevationNode);
    }
}
