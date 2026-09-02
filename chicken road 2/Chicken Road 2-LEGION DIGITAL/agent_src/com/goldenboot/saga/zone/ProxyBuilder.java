package com.goldenboot.saga.zone;

import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ProxyBuilder {
    public static final TriggerModerator detachStream(TriggerModerator triggerModerator, LongPressGateway longPressGateway) {
        return !(triggerModerator instanceof AnimAction) ? triggerModerator instanceof StackMap ? triggerModerator : new CellInvoker(triggerModerator, longPressGateway) : triggerModerator;
    }

    public static final Object growPayload(LongPressGateway longPressGateway, Object obj, Object obj2, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        Object applyTask = ContainerImpl.applyTask(longPressGateway, obj2);
        try {
            TransitionConstructor transitionConstructor = new TransitionConstructor(serviceRegulator, longPressGateway);
            Object detachStream = !(iconExporter instanceof ConfigValidator) ? ChipExporter.detachStream(iconExporter, obj, transitionConstructor) : ((IconExporter) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iconExporter, 2)).invoke(obj, transitionConstructor);
            ContainerImpl.clipOrigin(longPressGateway, applyTask);
            if (detachStream == RotateReceiver.releaseHeader()) {
                FeatureMeter.injectMetric(serviceRegulator);
            }
            return detachStream;
        } catch (Throwable th) {
            ContainerImpl.clipOrigin(longPressGateway, applyTask);
            throw th;
        }
    }

    public static /* synthetic */ Object injectMetric(LongPressGateway longPressGateway, Object obj, Object obj2, IconExporter iconExporter, ServiceRegulator serviceRegulator, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ContainerImpl.flushSample(longPressGateway);
        }
        return growPayload(longPressGateway, obj, obj2, iconExporter, serviceRegulator);
    }
}
